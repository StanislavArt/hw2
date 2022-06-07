public class Main {
    public static void main(String[] args) {
        // задача 1
        byte box1 = 8;
        short box2 = 10_000;
        int box3 = -7;
        long box4 = 50L;

        float box5 = 3.14f;
        double box6 = 1.1718;

        char symbol = 'J';
        boolean flag = true;

        // задача 2
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float commonWeight = weight1 + weight2;
        float differenceWeight = weight2 - weight1;
        System.out.println("Общий вес двух бойцов равен " + commonWeight + " кг");
        System.out.println("Разница между весами бойцов равна " + differenceWeight + " кг");

        // задача 3
        int bananaWeight = 5 * 80;
        int milkWeight = 200 / 100 * 105;
        int plombirWeight = 2 * 100;
        int eggsWeight = 4 * 70;

        int weightGram = bananaWeight + milkWeight + plombirWeight + eggsWeight;
        float weightKilogram = weightGram / 1000.0f;
        System.out.println("Общий вес спорт-завтрака равен " + weightKilogram + " кг");

        // задача 4
        int daysSchema1 = 7000 / 250;
        int daysSchema2 = 7000 / 500;
        int daysAverage = (daysSchema1 + daysSchema2) / 2 + (daysSchema1 + daysSchema2) % 2; // возможный неполный день считаем за полный день

        System.out.println(daysSchema1 + " дней уйдет на похудание, если будет худеть на 250г в день");
        System.out.println(daysSchema2 + " дней уйдет на похудание, если будет худеть на 500г в день");
        System.out.println(daysAverage + " дней уйдет в среднем, чтобы добиться результатов похудения");

        // задача 5
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;

        double deltaMasha = (newSalaryMasha - salaryMasha) * 12;
        double deltaDenis = (newSalaryDenis - salaryDenis) * 12;
        double deltaKristina = (newSalaryKristina - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + deltaMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + deltaDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + deltaKristina + " рублей");

    }
}