package sample;

public class Over60Members extends DefaultMembers {//this class is a sub class of the super class Defaultmembers

    private int memberage;

    public Over60Members(String name, String membershipid, String membershipstartdate, String membercontactno, int memberage) {
        super(name, membershipid, membershipstartdate, membercontactno);
        setMemberage(memberage);
    }

    public int getMemberage() {
        return memberage;
    }

    public void setMemberage(int memberage) {
        if(memberage >= 60){
        this.memberage = memberage;
        }
        else{//if the user enters an age below 60 as an over 60 member this error should be shown
            System.out.println("Invalid age entered\nYour age is lower than 60");
        }
    }
}
