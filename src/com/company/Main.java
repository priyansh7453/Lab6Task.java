/*   Author: Priyansh Kushwaha
 *   Date: 28-10-2020
 *   Time: 19:05 PM
 *   File: Lab6Task.java
 */

import java.util.GregorianCalendar;
import java.util.Calendar;

class Main{
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int currentMonth = gregorianCalendar.get(Calendar.MONTH);
        int currentDate = gregorianCalendar.get(Calendar.DATE);
        Months[] months= Months.values();
        int leftDays = months[currentMonth].getNumberOfDays() - currentDate;
        System.out.println(months[currentMonth].getNumberOfDays() + " - " + currentDate + " = " + leftDays + " Days left in " + months[currentMonth] + "!");
    }
}