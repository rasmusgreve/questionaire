package dk.itu.smdp.group2.converter;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;


public class TextQuestionLengthConverter extends org.eclipse.xtext.common.services.DefaultTerminalConverters{

	@ValueConverter(rule = "SHORT_LONG")
    public IValueConverter<Integer> SHORT_LONG() {
        return new IValueConverter<Integer>() {
            public Integer toValue(String string, INode node) {
                if (Strings.isEmpty(string))
                    throw new ValueConverterException("Couldn't convert empty string to int", node, null);
                else if ("short".equals(string.trim()))
                    return 1;
                else if ("long".equals(string.trim()))
                    return 5;
                try {
                    return Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new ValueConverterException("Couldn't convert '"+string+"' to int", node, e);
                }
            }

            public String toString(Integer value) {
                return Integer.toString(value);
            }
        };
	}
	
}
