package sample;

import java.util.List;

public interface GymManager {  //the abstract methods used in other classes
    public void addmember(DefaultMembers member);
    public boolean deletemember(String membershipid);
    public void listofmembers();
    public List<DefaultMembers> sortlist();
    public List<DefaultMembers> getMemberList();
    public DefaultMembers getMemberbyMembershipid (String membershipid);
    public DefaultMembers[] getMemberbyname (String name);

}
