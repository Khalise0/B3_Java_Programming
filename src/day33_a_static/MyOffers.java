package day33_a_static;

import day32_custom_classes.Offer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Texas", "Google", 125_000, true, 15);
        System.out.println(first);

        ArrayList<Offer> offerList = new ArrayList<>();
        offerList.add(first);

        offerList.add(new Offer("New York", "Amazon", 130_000.00, true, 15));

        System.out.println("____________________________________");
        System.out.println(offerList);

        Offer[] moreOffers = {
                new Offer("New Hampshire", "Amazon", 130_000.00, false, 15),
                new Offer("Main", "Google", 133_000.00, false, 20),
                new Offer("Rode Iland", "Tesla", 140_000.00, true, 17),
        };

        System.out.println(Arrays.asList(moreOffers));

        System.out.println("++++++++++++++++++++++++++");
        offerList.addAll(Arrays.asList(moreOffers));
        System.out.println(offerList);

        System.out.println("|||||||||||||||||||||||||||||||||||||");
        ArrayList<Offer> salaryMoreList = new ArrayList<>(offerList);
        salaryMoreList.removeIf(each -> each.salary <130_000);
        System.out.println("List of Offers with more salaries");
        System.out.println();
        System.out.println(Arrays.asList(salaryMoreList));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ArrayList<Offer> fullTimeList = new ArrayList<>(offerList);
        fullTimeList.removeIf(each -> !each.isFullTime);
        System.out.println("List of full time offers");
        System.out.println();
        System.out.println(fullTimeList);
    }
}
