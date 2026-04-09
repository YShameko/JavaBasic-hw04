public class Main {
    public static void main(String[] args) {
        System.out.println(calcDailySales(1, "smartphone", 5, 12153.41f));
        System.out.println(calcDailySales(2, "laptop", 7, 10486.85f));
    }

    private static float calcDailySales(int productNo, String productName,
                                       int qtyDays, float salesAmount) {
        float result = salesAmount / qtyDays;

        return result;
    }
}
