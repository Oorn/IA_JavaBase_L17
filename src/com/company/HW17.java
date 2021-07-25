
package com.company;



import javax.sound.midi.spi.SoundbankReader;
import java.io.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW17 {
    public static class ExceptionTaskNumber extends Exception {
        ExceptionTaskNumber() {
            super("Invalid task number");
        }
    }

    public static class ExceptionNegative extends Exception {
        ExceptionNegative() {
            super("value cannot be negative");
        }
    }

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);

        //Logger log = Logger.getLogger(HW11.class.getName());
        Logger log = Logger.getAnonymousLogger();
        log.setUseParentHandlers(false);
        log.setLevel(Level.FINER); //level at which throwing is logged
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        log.addHandler(handler);
        //SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            System.out.print("Enter task number, from 1 to 5: ");
            int taskNumber = in.nextInt();
            in.nextLine();

            switch (taskNumber) {
                case 1:
                    // 1
                    Calendar c1 = Calendar.getInstance();
                    c1.set(Calendar.DATE, c1.get(Calendar.DATE) + 1);
                    System.out.println(dateFormat.format(c1.getTime()));

                    c1 = Calendar.getInstance();
                    c1.set(Calendar.WEEK_OF_YEAR, c1.get(Calendar.WEEK_OF_YEAR) + 5);
                    System.out.println(dateFormat.format(c1.getTime()));

                    c1 = Calendar.getInstance();
                    c1.set(Calendar.MONTH, c1.get(Calendar.MONTH) - 2);
                    System.out.println(dateFormat.format(c1.getTime()));

                    c1 = Calendar.getInstance();
                    c1.set(Calendar.HOUR, c1.get(Calendar.HOUR) + 12);
                    System.out.println(timeFormat.format(c1.getTime()));

                    c1 = Calendar.getInstance();
                    c1.set(Calendar.DAY_OF_MONTH, c1.getActualMaximum(Calendar.DAY_OF_MONTH));
                    System.out.println(dateFormat.format(c1.getTime()));

                    c1 = Calendar.getInstance();
                    System.out.println("remaining days this year " + (c1.getActualMaximum(Calendar.DAY_OF_YEAR) - c1.get(Calendar.DAY_OF_YEAR)));

                    System.out.println(new SimpleDateFormat("MMMM d y").format(c1.getTime()));
                    System.out.println(new SimpleDateFormat("d MMM y").format(c1.getTime()));
                    System.out.println(new SimpleDateFormat("dd.MM.y").format(c1.getTime()));
                    System.out.println(new SimpleDateFormat("dd.MM.y HH:mm").format(c1.getTime()));
                    System.out.println(new SimpleDateFormat("M-d-y HH:mm:ss.SSS").format(c1.getTime()));
                    System.out.println(new SimpleDateFormat("dd.MM.y HH-mm-ss").format(c1.getTime()));

                    break;

                case 2:
                    //2
                    PrintTimeService.getInstance().printTime();

                    break;

                case 3:
                    //3
                    PersonBuilder pb3 = new PersonBuilder();
                    System.out.println("enter name, surname, date of birth: ");
                    pb3.setField(PersonBuilder.NAME, in.next());
                    pb3.setField(PersonBuilder.SURNAME, in.next());
                    pb3.setField(PersonBuilder.BIRTH_YEAR, in.next());
                    System.out.println("Person: " + pb3.getPerson());


                    break;

                case 4:
                    //4
                    int i4iterations = 50;
                    ComputerCreator[] cca4 = {new LaptopCreator(), new PCCreator(), new SmartphoneCreator()};
                    Shop s4 = new Shop();

                    for (int i = 0; i < i4iterations; i++)
                        System.out.println(s4.orderAndPurchaseGood(cca4[ran.nextInt(cca4.length)]).thisIs());

                    break;

                case 5:
                    //5
                    System.out.println("//todo");


                    break;



                default:
                    throw new ExceptionTaskNumber();
            }
        } catch (InputMismatchException | ExceptionTaskNumber ex) {
            System.out.println("Error - " + ex);
        } finally {
            in.close();
        }
    }


}