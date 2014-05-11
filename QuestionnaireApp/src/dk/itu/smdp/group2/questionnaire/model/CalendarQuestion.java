package dk.itu.smdp.group2.questionnaire.model;

import java.util.Calendar;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * A Question that requires 'calendar' information as the answer, like
 * year, month, day, hour, minute or any combination hereof.
 * 
 * @author Emil
 *
 */
public class CalendarQuestion extends Question {
	
	private View root;
	
	private boolean year,month,day,hour,minute;
	
	// results
	private DatePicker date;
	private TimePicker time;

	/**
	 * Instantiates the CalendarQuestion with the given parameters for use in
	 * the Questionnaire.
	 * 
	 * @param question The question to answer.
	 * @param desc The more detailed description to the question if necessary.
	 * Null or empty string will be seen as no description.
	 * @param mandatory True if the Question should be marked as mandatory for the
	 * Questionnaire to be complete.
	 * @param year True if the user should select a Year.
	 * @param month True if the user should select a Month.
	 * @param day True if the user should select a Day.
	 * @param hour True if the user should select a Hour.
	 * @param minute True if the user should select a Minute.
	 */
	public CalendarQuestion(String question, String desc, boolean mandatory,
			boolean year, boolean month, boolean day, boolean hour, boolean minute) {
		super(question,desc,mandatory);
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}

	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_calendar, null);
		TextView title = (TextView) root.findViewById(R.id.tvCalendarTitle);
		TextView desc = (TextView) root.findViewById(R.id.tvCalendarDesc);
		date = (DatePicker) root.findViewById(R.id.dpCalendar);
		time = (TimePicker) root.findViewById(R.id.tpCalendar);
		
		// set values
		title.setText(this.getQuestionText());
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		time.setIs24HourView(true);
		time.setCurrentHour(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
		
		date.setVisibility((year || month || day) ? View.VISIBLE : View.GONE);
		time.setVisibility((hour || minute) ? View.VISIBLE : View.GONE);
		
		return root;
	}

	@Override
	public boolean isAnswered() {
		return true;
	}

	@Override
	public void setVisible(boolean visible) {
		root.setVisibility(visible ? View.VISIBLE : View.GONE);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		if(year) builder.append(date.getYear());
		if(year && (month || day)) builder.append("-");
		if(month) builder.append(date.getMonth());
		if((year || month) && day) builder.append("-");
		if(day) builder.append(date.getDayOfMonth());
		if((year || month || day) && (hour || minute)) builder.append(" ");
		if(hour) builder.append(time.getCurrentHour());
		if(hour && minute) builder.append(":");
		if(minute) builder.append(time.getCurrentMinute());
		
		return builder.toString();
	}

}
