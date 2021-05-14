package sample;

public class DefaultMembers implements Comparable<DefaultMembers> {
    private String name;
    private String membershipid;
    private String membershipstartdate;
    private String membercontactno;

    public DefaultMembers(String name, String membershipid, String membershipstartdate, String membercontactno) {
        this.name = name;
        this.membershipid = membershipid;
        this.membershipstartdate = membershipstartdate;
        this.membercontactno = membercontactno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipid() {
        return membershipid;
    }

    public void setMembershipid(String membershipid) {
        this.membershipid = membershipid;
    }

    public String getMembershipstartdate() {
        return membershipstartdate;
    }

    public void setMembershipstartdate(String membershipstartdate) {
        this.membershipstartdate = membershipstartdate;
    }

    public String getMembercontactno() {
        return membercontactno;
    }

    public void setMembercontactno(String membercontactno) {
        this.membercontactno = membercontactno;
    }

    @Override
    public int compareTo(DefaultMembers o) {
        return this.name.compareTo(o.getName());
    }
}



