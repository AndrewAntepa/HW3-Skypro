public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int a = 134134;
        byte b = 13;
        short c = 1242;
        long d = 1353466146;
        float e = 12.3f;
        double f = 42.12;
        System.out.println("Значение типа int равно " + a);
        System.out.println("Значение типа byte равно " + b);
        System.out.println("Значение типа short равно " + c);
        System.out.println("Значение типа long равно " + d);
        System.out.println("Значение типа float равно " + e);
        System.out.println("Значение типа double равно " + f);

        System.out.println("\nЗадание 2:");
        double doub = 27.12;
        System.out.println(doub);
        long lon = 987678965549L;
        System.out.println(lon);
        float doeb2 = 2.786f;
        System.out.println(doeb2);
        short n = 569;
        System.out.println(n);
        short n2 = -159;
        System.out.println(n2);
        short n3 = 27897;
        System.out.println(n3);
        byte bb = 67;
        System.out.println(bb);

        System.out.println("\nЗадание 3:");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short paper = 480;
        int paperPerStudent = paper / (ludmila + anna + ekaterina);
        System.out.println("На каждого ученика расчитано " + paperPerStudent + " листов бумаги");

        System.out.println("\nЗадание 4:");
        byte v = 16;
        short twentyMin = (short) (v * 10);
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
        short oneDay = (short) (v * 30 * 24);
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        int treeDays = oneDay * 3;
        System.out.println("За 3 дня машина произвела " + treeDays + " штук бутылок");
        int month = treeDays * 10;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        System.out.println("\nЗадание 5:");
        byte gar = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        byte classes = (byte) (gar / (whitePerClass + brownPerClass));
        byte white = (byte) (whitePerClass * classes);
        byte brown = (byte) (brownPerClass * classes);
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        System.out.println("\nЗадание 6:");
        short bananas = 80 * 5;
        short milk = 105 * 2;
        short iceCream = 100 * 2;
        short agg = 70 * 4;
        short gram = (short) (bananas + milk + iceCream + agg);
        float kilogram = (float) (bananas + milk + iceCream + agg) / 1000;
        System.out.println("В граммах: " + gram + " грамм\nВ килограммах: " + kilogram + " кг");

        System.out.println("\nЗадание 7:");
        short kg = 7;
        short minGram = 250;
        short maxGram = 500;
        short maxDays = (short) (kg * 1000 / minGram);
        short minDays = (short) (kg * 1000 / maxGram);
        float midl = (float) (maxDays + minDays) / 2;
        System.out.println(maxDays + "дней по " + minGram + " грамм в день");
        System.out.println(minDays + "дней по " + maxGram + " грамм в день");
        System.out.println(midl + " в среднем");

        System.out.println("\nЗадание 8:");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaIncreased = increaseSalary(masha);
        int kristinaIncreased = increaseSalary(kristina);
        int denisIncreased = increaseSalary(denis);
        int mashaChangedYear = (mashaIncreased - masha) * 12;
        int kristinaChangedYear = (kristinaIncreased - kristina) * 12;
        int denisChangedYear = (denisIncreased - denis) * 12;
        System.out.println("Маша теперь получает " + mashaIncreased + " рублей. Годовой доход вырос на " + mashaChangedYear + " рублей");
        System.out.println("Маша теперь получает " + denisIncreased + " рублей. Годовой доход вырос на " + denisChangedYear + " рублей");
        System.out.println("Маша теперь получает " + kristinaIncreased + " рублей. Годовой доход вырос на " + kristinaChangedYear + " рублей");
    }
    public static int increaseSalary(int n){
        double newSalary = n * 1.1;
        return (int) newSalary;
    }
}