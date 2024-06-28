import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Member [] m = new Member[6];

        int id;

        m[0] = new Member(1234, "Namal", 1000);
        m[1] = new Member(5872, "Saman", 1500);
        m[2] = new Member(8432, "Kasun", 500);
        m[3] = new Member(5361, "Namal", 2000);
        m[4] = new Member(3243, "Senaka", 1300);
        m[5] = new Member(4419, "Kalpa", 4000);

        Member.calTotal(m);
        System.out.println("The total amount of each members: " +Member.getTotal() +"\n");

        System.out.println("Enter a ID: ");
        id = in.nextInt();
        display(m, id);
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
            System.out.println(id +" is not a member.");
        }
    }
}
