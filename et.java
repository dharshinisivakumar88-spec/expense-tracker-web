public class Expense {
    private String date;
    private double amount;
    private String category;
    private String description;

    public Expense(String date, double amount, String category, String description) {
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    // Getters and Setters (omitted for brevity, but recommended)

    @Override
    public String toString() {
        return "Date: " + date + ", Amount: $" + amount + ", Category: " + category + ", Description: " + description;
    }
}
