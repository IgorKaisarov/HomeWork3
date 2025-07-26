//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        byte book = 1;
        System.out.println(" Значение переменной book с типом byte равно " + book);
        short notebook = 2;
        System.out.println(" Значение переменной notebook с типом short равно " + notebook);
        int pencil = 3;
        System.out.println(" Значение переменной pencil с типом int равно " + pencil);
        long pen = 4;
        System.out.println(" Значение переменной pen с типом long равно " + pen);
        float eraser = 5f;
        System.out.println(" Значение переменной eraser с типом float равно " + eraser);
        double ruler = 6;
        System.out.println(" Значение переменной ruler с типом double равно " + ruler);
        double apple = 27.12;
        System.out.println(apple);
        long grape = 987678965549L;
        System.out.println(grape);
        float cherry = 2.786f;
        System.out.println(cherry);
        short raspberry = 569;
        System.out.println(raspberry);
        short gooseberry = -159;
        System.out.println(gooseberry);
        short melon = 27897;
        System.out.println(melon);
        byte irga = 67;
        System.out.println(irga);
        byte teacherLP = 23;
        System.out.println(teacherLP);
        byte teacherAS = 27;
        System.out.println(teacherAS);
        byte teacherEA = 30;
        System.out.println(teacherEA);
        int all = teacherLP + teacherAS + teacherEA;
        System.out.println(all);
        short lists = 480;
        System.out.println(lists);
        int students = lists / all;
        System.out.println("На каждого ученика расчитано " + students + " листов бумаги");
        byte bottleTwoMinutes = 16;
        System.out.println(bottleTwoMinutes);
        byte bottleOneMinute = 16 / 2;
        System.out.println(bottleOneMinute);
        int twentyMinutes = 20 * bottleOneMinute;
        System.out.println(twentyMinutes);
        byte dayHours = 24;
        System.out.println(dayHours);
        byte minutesInHour = 60;
        System.out.println(minutesInHour);
        int oneDayBottles = (bottleOneMinute * minutesInHour) * dayHours;
        System.out.println(oneDayBottles);
        int threeDaysBottles = oneDayBottles * 3;
        System.out.println(threeDaysBottles);
        int monthjulyBottles = oneDayBottles * 31;
        System.out.println(monthjulyBottles);
        int totalBottles = twentyMinutes + oneDayBottles + threeDaysBottles + monthjulyBottles;
        System.out.println(totalBottles);
        byte totalPaint = 120;
        System.out.println(totalPaint);
        byte whiteInOneClass = 2;
        System.out.println(whiteInOneClass);
        byte brownInOneClass = 4;
        System.out.println(brownInOneClass);
        int oneClassPaint = whiteInOneClass + brownInOneClass;
        System.out.println(oneClassPaint);
        int howManyClasses = totalPaint / oneClassPaint;
        System.out.println(howManyClasses);
        int totalWhitePaint = howManyClasses * whiteInOneClass;
        System.out.println(totalWhitePaint);
        int totalBrownPaint = howManyClasses * brownInOneClass;
        System.out.println("В школе, где " + howManyClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
        byte bananas = 5;
        System.out.println(bananas);
        byte weightBanana = 80;
        System.out.println(weightBanana);
        int totalWeightBananas = bananas * weightBanana;
        System.out.println(totalWeightBananas);
        short gramsInOneKilo = 1000;
        System.out.println(gramsInOneKilo);
        short milkMl = 200;
        System.out.println(milkMl);
        byte gramsIn100MlMilk = 105;
        System.out.println(gramsIn100MlMilk);
        int totalWeightMilkKilo = gramsIn100MlMilk * 2;
        System.out.println(totalWeightMilkKilo);
        byte iceCream = 2;
        System.out.println(iceCream);
        byte weightIceCreamOneBriquetteGram = 100;
        System.out.println(weightIceCreamOneBriquetteGram);
        int totalWeightIceCream = weightIceCreamOneBriquetteGram * iceCream;
        System.out.println(totalWeightIceCream);
        byte eggs = 4;
        System.out.println(eggs);
        byte weightEggGrams = 70;
        System.out.println(weightEggGrams);
        int totalWeightEggs = eggs * weightEggGrams;
        System.out.println(totalWeightEggs);
        int totalWeightBreakfastGrams = totalWeightBananas + totalWeightMilkKilo + totalWeightIceCream + totalWeightEggs;
        System.out.println(totalWeightBreakfastGrams);
        float totalWeightproductsKilo =(float) totalWeightBreakfastGrams / gramsInOneKilo;
        System.out.println(totalWeightproductsKilo);
        short dietFirstGramsInDay = 250;
        System.out.println(dietFirstGramsInDay);
        short dietSecondGramsInDay = 500;
        System.out.println(dietSecondGramsInDay);
        byte totalWeightLossKilo = 7;
        System.out.println(totalWeightLossKilo);
        short oneKiloWeightGrams = 1000;
        System.out.println(oneKiloWeightGrams);
        int howManyDaysFirstDiet = (totalWeightLossKilo * oneKiloWeightGrams) / dietFirstGramsInDay;
        System.out.println(howManyDaysFirstDiet);
        int howManyDaysSecondDiet = (totalWeightLossKilo * oneKiloWeightGrams) / dietSecondGramsInDay;
        System.out.println(howManyDaysSecondDiet);

















        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}