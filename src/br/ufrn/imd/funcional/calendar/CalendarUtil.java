package br.ufrn.imd.funcional.calendar;

public class CalendarUtil {

	/**
	 * 
	 * Returns a string representing the date of the day the input date.
	 *
	 * @param day
	 *            integer value within the range [1,12].
	 * @param month
	 *            integer value within the range [1,31].
	 * @param year
	 *            integer value within the range [1812, 2016]
	 * @return
	 */
	public String nextDay(int day, int month, int year) {
		// jan mar mai jul ago out dez
		// abr jun sep nov

		/*1*/ if (year < 1800) {
			/*2*/ throw new IllegalArgumentException();
			/*3*/ } else if ((day < 1) || (day > 31)) {
			/*4*/ throw new IllegalArgumentException();
			/*5*/ } else if ((month < 1) || (month > 12)) {
			/*6*/ throw new IllegalArgumentException();
			/*7*/ } else if (year < 0) {
			/*8*/ throw new IllegalArgumentException();
			/*9*/} else if (day > daysMonthHas(month, year)) {
			/*10*/throw new IllegalArgumentException();
			}

		/*11*/if (day < daysMonthHas(month, year)) {
			/*12*/return (++day) + "/" + month + "/" + year;
			/*13*/ } else if ((day == daysMonthHas(month, year)) && (month < 12)) {
			/*14*/ return "1/" + (++month) + "/" + year;
			/*15*/} else {
			/*16*/ return "1/1/" + (++year);
		}
	}

	public boolean isLeapYear(int year) {
		/*1*/if (year < 0) {
			/*2*/throw new IllegalArgumentException();
		}

		/*3*/return ((year % 400) == 0) || (((year % 100) != 0) && ((year % 4) == 0));
	}

	public int daysMonthHas(int month, int year) {
		/*1*/if ((month < 0) || (month > 12)) {
			/*2*/throw new IllegalArgumentException();
		}

		/*3*/switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			/*4*/ return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			/*5*/return 30;
		default:
			/*6*/return isLeapYear(year) ? 29 : 28;
		}
	}
}
