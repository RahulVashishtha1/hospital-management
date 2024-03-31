import java.util.*;
public class Patient
{
    private String PatientName;
    private int Contact_No;
    private String Address;
    private String BloodGroup;
    private String Gender;
    private int Age;    

    public static void main(String[] args) 
    {
        Patient P1 = new Patient();
        P1.getPatient();
        P1.displayPatient();   
    }

    public void getPatient()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("FULL NAME: ");
            PatientName = scan.nextLine();

        System.out.print("CONTACT NUMBER: ");
            Contact_No = scan.nextInt();

        System.out.print("BLOOD GROUP: ");
            BloodGroup = scan.nextLine();

        System.out.print("GENDER: ");
            Gender = scan.nextLine();

        System.out.print("ADDRESS: ");
            Address = scan.nextLine();

        System.out.print("AGE: ");
            Age = scan.nextInt();
    }

    public void displayPatient()
    {
        System.out.print("FULL NAME: " + PatientName);
        System.out.print("CONTACT NUMBER: " + Contact_No);
        System.out.print("BLOOD GROUP: " + BloodGroup);
        System.out.print("GENDER: "  + Gender);
        System.out.print("ADDRESS: " + Address);
        System.out.print("AGE: " + Age);
    }
}