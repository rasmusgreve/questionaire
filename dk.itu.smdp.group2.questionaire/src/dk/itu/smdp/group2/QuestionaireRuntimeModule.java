package dk.itu.smdp.group2;

import org.eclipse.xtext.conversion.IValueConverterService;

import dk.itu.smdp.group2.converter.TextQuestionLengthConverter;

/**
 * Registration of the Value converter responsible for translating the keywords 
 * 'long' and 'short' to integers.
 */
public class QuestionaireRuntimeModule extends dk.itu.smdp.group2.AbstractQuestionaireRuntimeModule {

	@Override
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return TextQuestionLengthConverter.class;
    }
}
