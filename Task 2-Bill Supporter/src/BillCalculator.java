public class BillCalculator
{
    static final double GST = 0.18;
    static final double SERVICE_CHARGE = 0.05;

    public static void main(String[] args)
    {
        String[] items = {"Burger", "Pizza", "Pasta"};
        int[] quantities = {2, 1, 3};
        int[] prices = {250, 120, 40};

        double grandTotal = 0;

        System.out.printf("%-10s %-5s %=7s %-9s %-9s %-9s %-9s%n", "Item", "Qty", "Price", "Subtotal", "GST", "Service", "Total");

        for (int i = 0; i < items.length; i++)
        {
            double subtotal = quantities[i] * prices[i];
            double gstAmount = subtotal * GST;
            double serviceChargeAmount = subtotal * SERVICE_CHARGE;
            double total = subtotal + gstAmount + serviceChargeAmount;

            grandTotal += total;

            System.out.printf("%-10s %-5d %-7d %-9.2f %-9.2f %-9.2f %-9.2f%n", items[i], quantities[i], prices[i], subtotal, gstAmount, serviceChargeAmount, total);
        }

        System.out.printf("%nGrand Total: %.2f%n", grandTotal);
    }
}
