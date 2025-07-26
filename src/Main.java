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








        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}