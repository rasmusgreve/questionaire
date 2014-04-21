package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class CalendarQuestion extends Question {
	
	private View root;
	
	private boolean year,month,day,hour,minute;
	
	// results
	private DatePicker date;
	private TimePicker time;

	public CalendarQuestion(String question, String desc, boolean optional,
			boolean year, boolean month, boolean day, boolean hour, boolean minute) {
		super(question,desc,optional);
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
		title.setText(this.getQuestion() + (this.isOptional() ? "" : " *"));
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		time.setIs24HourView(true);
		
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
		// TODO Auto-generated method stub
		return null;
	}

}