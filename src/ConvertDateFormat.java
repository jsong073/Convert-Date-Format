import java.util.Scanner;

public class ConvertDateFormat {
    public static void main (String[] args) {
        int month = 0;
        int day = 0;
        int year = 0;
        String monthName = "";
        String fullDate = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a date (mm/dd/yyyy): ");
        fullDate = input.nextLine();

        String[] dateList = fullDate.split("/");  //How would I do this without arrays?
        month = Integer.parseInt(dateList[0]);
        day = Integer.parseInt(dateList[1]);
        year = Integer.parseInt(dateList[2]);

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "INVALID_MONTH";
                break;
        }

        day = Integer.parseInt(dateList[1]);
        year = Integer.parseInt(dateList[2]);
        fullDate = "" + monthName + " " + day + ", " + year;
        if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 0)) {
            System.out.println("Invalid date entered");
        } else if ((month == 4 ||
                    month == 6 ||
                    month == 9 ||
                    month == 11) && day > 30) {
            System.out.println("Invalid date entered");
        } else if (month == 2 && day > 28) {                //Do I have to account for leap years?
            System.out.println("Invalid date entered");
        } else {
            System.out.println("It is " + fullDate);
        }
    }
}
