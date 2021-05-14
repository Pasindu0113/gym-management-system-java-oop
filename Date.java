package sample;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        setMonth(month);
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month <= 12 && month >= 1) {
            this.month = month;
        }
        else{
            System.out.println("Invalid month entered \n Maximum number can be 12 and the minimum is 1 ");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
