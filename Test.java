import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Member [] m = new Member[6];

        int id;
        String name;

        m[0] = new Member(1234, "Namal", 1000);
        m[1] = new Member(5872, "Saman", 1500);
        m[2] = new Member(8432, "Kasun", 500);
        m[3] = new Member(5361, "Namal", 2000);
        m[4] = new Member(3243, "Senaka", 1300);
        m[5] = new Member(4419, "Kalpa", 4000);

        Member.calTotal(m);
        System.out.println("The total amount of each members: " +Member.getTotal() +"\n");

        System.out.print("Enter a ID: ");
        id = in.nextInt();
        display(m, id);
        in.nextLine();

        System.out.print("Enter a name: ");
        name = in.nextLine();
        display(m, name);

        //change the id of 1st member
        m[0].setId(6585);

        //change the name of the last member
        m[5].setName("Nuwan");

        //add another 3000 amount to the 3rd member
        m[2].addAmount(3000);

        Member.calTotal(m);
        System.out.println("The total amount of each members: " +Member.getTotal() +"\n");

        System.out.print("Enter a ID to find the Member object: ");
        id = in.nextInt();
        Member member = Member.getObject(m, id);
        if (member != null) {
            System.out.println("Found member with ID " + id + ":");
            System.out.println("ID: " + member.getId() + "\nName: " + member.getName() + "\nAmount: " + member.getAmount() + "\n");
        } else {
            System.out.println("Member with ID " + id + " not found.");
        }

        Member p = m[4];
        System.out.println(p.getId() +"\n"+ p.getName() +"\n"+ p.getAmount());

        p.setName("Pasan");
        display(m, 3243);
        
        p = null;
        display(m, 3243);
    }

    public static void display(Member [] m, int id) {
        boolean status = false;
        for (int i=0; i<m.length; i++) {
            if (id == m[i].getId()) {
                System.out.println("ID: " +m[i].getId() +"\nName: " +m[i].getName() + "\nAmount: " + m[i].getAmount() +"\n");
                status = true;
                break;
            }
        }
        if (status == false) {
            System.out.println(id +" is not a member.\n");
        }
    }

    public static void display(Member [] m, String name) {
        boolean status = false;
        int count = 0;
        for (int i=0; i<m.length; i++) {
            if (name.equals(m[i].getName()) ) {
                System.out.println("ID: " +m[i].getId() +"\nName: " +m[i].getName() + "\nAmount: " + m[i].getAmount() +"\n");
                status = true;
                count++;
            }
        }
        if (status == false) {
            System.out.println(name +" is not a member.");
        }
        if (count > 1) {
            System.out.println("No. of members with the name " +name + " is :" +count);
        }
    }
}
