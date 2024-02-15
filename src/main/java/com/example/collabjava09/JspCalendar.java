package com.example.collabjava09;
import java.util.*;
/* Los JavaBean requieren:
   - Un constructor sin parámetros o argumentos;
   - Sus propiedades han de tener sus métodos get y set
 */

public class JspCalendar {
    Calendar  calendar = null;

    public JspCalendar() {
	calendar = Calendar.getInstance();
	Date trialTime = new Date();
	calendar.setTime(trialTime);
    }

	public int getYear() {
	return calendar.get(Calendar.YEAR);
    }
    
    public String getMonth() {
	int m = getMonthInt();
	String[] months = new String [] { "January", "February", "March",
					"April", "May", "June",
					"July", "August", "September",
					"October", "November", "December" };
	if (m > 12)
	    return "Unknown to Man";
	
	return months[m - 1];

    }

    public String getDay() {
	int x = getDayOfWeek();
	String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", 
				      "Thursday", "Friday", "Saturday"};

	if (x > 7)
	    return "Unknown to Man";

	return days[x - 1];

    }
    
    public int getMonthInt() {
	return 1 + calendar.get(Calendar.MONTH);
    }

    public String getDate() {
	return getMonthInt() + "/" + getDayOfMonth() + "/" +  getYear();

    }

    public String getTime() {
	return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public int getDayOfMonth() {
	return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getDayOfYear() {
	return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int getWeekOfYear() {
	return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getWeekOfMonth() {
	return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public int getDayOfWeek() {
	return calendar.get(Calendar.DAY_OF_WEEK);
    }
     
    public int getHour() {
	return calendar.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getMinute() {
	return calendar.get(Calendar.MINUTE);
    }


    public int getSecond() {
	return calendar.get(Calendar.SECOND);
    }

    public static void main(String args[]) {
	JspCalendar db = new JspCalendar();
	p("date: " + db.getDayOfMonth());
	p("year: " + db.getYear());
	p("month: " + db.getMonth());
	p("time: " + db.getTime());
	p("date: " + db.getDate());
	p("Day: " + db.getDay());
	p("DayOfYear: " + db.getDayOfYear());
	p("WeekOfYear: " + db.getWeekOfYear());
	p("era: " + db.getEra());
	p("ampm: " + db.getAMPM());
	p("DST: " + db.getDSTOffset());
	p("ZONE Offset: " + db.getZoneOffset());
	p("TIMEZONE: " + db.getUSTimeZone());
    }

    private static void p(String x) {
	System.out.println(x);
    }


    public int getEra() {
	return calendar.get(Calendar.ERA);
    }

    public String getUSTimeZone() {
	String[] zones = new String[] {"Hawaii", "Alaskan", "Pacific",
				       "Mountain", "Central", "Eastern"};
	
	return zones[10 + getZoneOffset()];
    }

    public int getZoneOffset() {
	return calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000);
    }


    public int getDSTOffset() {
	return calendar.get(Calendar.DST_OFFSET)/(60*60*1000);
    }

    
    public int getAMPM() {
	return calendar.get(Calendar.AM_PM);
    }

	public String getZodiaco() {
		int mes = getMonthInt();
		int dia = getDayOfMonth();

		String signo = null;

		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			signo = "Aries";
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			signo = "Tauro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			signo = "Gemini";
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			signo = "Cancer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			signo = "Leo";
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			signo = "Virgo";
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			signo = "Libra";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			signo = "Scorpio";
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			signo = "Sagitarius";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			signo = "Capricorn";
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			signo = "Aquarius";
		} else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
			signo = "Pisces";
		} else {
			signo = "Desconocido";
		}

		return signo;
	}

	public void updateTime(Date fecha) {
		calendar.setTime(fecha);
	}
}

