package printfbudgetreport;

class PrintFbudgetReport {

    public static void main(String[] args) {
        final String HEADING_FMT_STR = "%-25s%13s%13s%15s\n";
        final String DATA_FMT_STR = "%-25s%,13.2f%,13.2f%(,15.2f\n";
        double actual1 = 1149.999;
        double budget1 = 1400;
        double actual2 = 2100.111;
        double budget2 = 2000;
        double remaining1, remaining2;

        System.out.printf(HEADING_FMT_STR, "Account", "Actual", "Budget", "Remaining");
        System.out.printf(HEADING_FMT_STR, "-------", "------", "------", "----------");

        remaining1 = budget1 - actual1;
        System.out.printf(DATA_FMT_STR, "Office Supplies", actual1, budget1, remaining1);
        remaining2 = budget2 - actual2;
        System.out.printf(DATA_FMT_STR, "Photocopying", actual2, budget2, remaining2);
        System.out.printf("\nTotal remaining: $%(,.2f\n", remaining1 + remaining2);
    }
}
