public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = (int) service.calculate(20000);
        System.out.println(miles);
        int miles2 = (int) service.calculate(22000);
        System.out.println(miles2);
        int miles3 = (int) service.calculate(120000);
        System.out.println(miles3);
        int miles4 = (int) service.calculate(50000);
        System.out.println(miles4);
    }
}