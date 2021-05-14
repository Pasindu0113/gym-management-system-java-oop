package sample;


public class StudentMembers extends DefaultMembers {//this class is a sub class of the super class Defaultmembers

    public StudentMembers(String name, String membershipid, String membershipstartdate, String membercontactno, String schoolName) {
        super(name, membershipid, membershipstartdate, membercontactno);
        this.schoolName = schoolName;
    }

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
