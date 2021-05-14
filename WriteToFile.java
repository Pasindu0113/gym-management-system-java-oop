package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile { //the class to write the list to a file (pp2cw2.txt)
    public boolean writeToFile(List<DefaultMembers> memberslist, String fileName) {
        if (memberslist.size() > 0){
            try {
                FileWriter myfilewriter = new FileWriter(fileName,true);//initialising the file writer
                for (DefaultMembers member : memberslist) {//loop through the memberslist
                    myfilewriter.write("Membership ID : " + member.getMembershipid() + "\n" + "Member Name : " + member.getName() + "\n" + "Member Contact Number : " + member.getMembercontactno() + "\n" + "Membership start date : " + member.getMembershipstartdate() + "\n");
                    if (member instanceof StudentMembers) {//write the following to the file if the member is a student member
                        myfilewriter.write("Membership type : Student Member \n" + "School Name : " + ((StudentMembers) member).getSchoolName() + "\n" + "\n");
                    } else if (member instanceof Over60Members) {//write the following to the fie if the ember is a over60 member
                        myfilewriter.write("Membership type : Over 60 Member \n" + "Member Age : " + ((Over60Members) member).getMemberage() + "\n" + "\n");
                    } else {
                        myfilewriter.write("Membership type : Default Member \n" + "\n");
                    }
                }
                myfilewriter.close();//closing the filewriter
                System.out.println("Successfully wrote to the file.\n");//prompt the user that the list is been wrote to the file successfully
                return true;
            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
            }

        }else {//if the list is empty and there's nothing to be written print this message
            System.out.println("The list is empty, nothing to be wrote to the file");
        }
        return false;
    }
}


