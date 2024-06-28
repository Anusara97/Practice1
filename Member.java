public class Member{
    private int id;
    private String name;
    private double amount;
    private static double total;

    public Member (int id, String name, double amount) {
        setId(id);
        setName(name);
        setAmount(amount);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void setTotal(double total) {
        Member.total = total;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public static double getTotal() {
        return total;
    }

    public void addAmount(int amount) {
        this.amount +=amount;
    }

    public static void calTotal (Member [] m) {
        total = 0;
        for (int i=0; i<m.length; i++) {
            total += m[i].amount;
        }
    }
}