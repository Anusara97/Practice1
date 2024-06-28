public class Test {
    public static void main(String[] args) {
        Member [] m = new Member[6];
        m[0] = new Member(1234, "Namal", 1000);
        m[1] = new Member(5872, "Saman", 1500);
        m[2] = new Member(8432, "Kasun", 500);
        m[3] = new Member(5361, "Namal", 2000);
        m[4] = new Member(3243, "Senaka", 1300);
        m[5] = new Member(4419, "Kalpa", 4000);

        Member.calTotal(m);
        System.out.println("The total of amount in each member: " +Member.getTotal());
    }
}
