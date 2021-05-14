package sample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGymManager implements GymManager{
    public ArrayList<DefaultMembers> membersList = new ArrayList<>();


    @Override
    public void addmember(DefaultMembers member) {//method to add a member to the system
        if (membersList.size() < 100){
            membersList.add(member);
        }else{
            System.out.println("No vacant slots available to add a new member");
        }

        System.out.println("Number of slots taken : "+membersList.size()); //printing the number of slots taken
        System.out.println("Number of vacant slots : "+(100 - membersList.size()));//printing the number of available slots
    }

    @Override
    public boolean deletemember(String membershipid) {//deleting a member from the system
        boolean bool = false;
        for (DefaultMembers member : membersList){//loop through the members list
            if(member.getMembershipid().equals(membershipid)){//check the relevant membership id to be deleted
                bool = true;
                membersList.remove(member);//removing the member from the membersList
                System.out.println("Member with the membership ID "+membershipid+ " was deleted from the system");//letting the user know that the member with the specific membership ID has  been deleted form the system
                if(member instanceof StudentMembers){ //checking the type of the member and printing the relevant message
                    System.out.println("A Student member has been deleted from the system");
                }
                else if (member instanceof Over60Members){
                    System.out.println("A Over 60 member has been deleted from the system");
                }
                else {
                    System.out.println("A default member has been deleted from the system");
                }
                System.out.println("Number of vacant slots : "+(100 - membersList.size()));//the number of vacant slots after deleting a member from the list
                break;
            }
        }
        if(!bool){
            System.out.println("The membership ID "+membershipid+" is not found in the list");//print this error message if the entered membership id is not found on the list
        }
        return bool;

    }

    @Override
    public void listofmembers() {//method to print the list of members at tht moment of the system
        for (DefaultMembers member : membersList){
            System.out.print("\nMembership ID : "+ member.getMembershipid()+"\n");
            System.out.print("Member Name : "+member.getName()+"\n");
            System.out.print("Member Contact Number : "+member.getMembercontactno()+"\n");
            System.out.print("Membership start date : "+member.getMembershipstartdate()+"\n");
            if(member instanceof StudentMembers){ //print the following only if the member is a student member
                System.out.print("Membership type : Student Member \n");
                System.out.println("School Name : "+((StudentMembers) member).getSchoolName()+"\n");//only the student members have a school
            }
            else if (member instanceof Over60Members){ //print the following only if the member is a over60 member
                System.out.print("Membership type : Over 60 Member \n");
                System.out.println("Member Age : "+((Over60Members) member).getMemberage()+"\n");//only the over 60 members will get an age printed
            }
            else {
                System.out.print("Membership type : Default Member \n");
            }
        }
        if (membersList.size() == 0){
            System.out.println("No members to Display the list is empty");//print this if the list is empty
        }
    }

    @Override
    public List<DefaultMembers> sortlist() {
        DefaultMembers[] memberlistarray =  membersList.toArray(new DefaultMembers[] {});
        Sorting.bubbleSort(memberlistarray);
        List <DefaultMembers> listsorted = Arrays.asList(memberlistarray);
        for (DefaultMembers default_member:listsorted) {
            System.out.println("\nMember Name : "+ default_member.getName()+"\n");
            System.out.print("Membership ID : "+ default_member.getMembershipid()+"\n");
            System.out.print("Member Contact Number : "+default_member.getMembercontactno()+"\n");
            System.out.print("Membership start date : "+default_member.getMembershipstartdate()+"\n");
            if(default_member instanceof StudentMembers){ //print the following only if the member is a student member
                System.out.print("Membership type : Student Member \n");
                System.out.println("School Name : "+((StudentMembers) default_member).getSchoolName()+"\n");//only the student members have a school
            }
            else if (default_member instanceof Over60Members){ //print the following only if the member is a over60 member
                System.out.print("Membership type : Over 60 Member \n");
                System.out.println("Member Age : "+((Over60Members) default_member).getMemberage()+"\n");//only the over 60 members will get an age printed
            }
            else {
                System.out.print("Membership type : Default Member \n");
            }
        }
        return listsorted;
    }

    @Override
    public ArrayList<DefaultMembers> getMemberList() {//method to write the arraylist (memberslist) to a file
        return membersList;
    }

    @Override
    public DefaultMembers getMemberbyMembershipid(String membershipid) {
        return null;
    }

    @Override
    public DefaultMembers[] getMemberbyname(String name) {
        return new DefaultMembers[0];
    }

}
