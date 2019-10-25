package com.example.foodorder; // <============= CHANGE ME

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class FakeDatabase {

    public static FoodMenu getArticleById(int articleID) {
        return articles.get(articleID);
    }

    public static ArrayList<FoodMenu> getAllArticles() {
        return new ArrayList<FoodMenu>((List) Arrays.asList(articles.values().toArray()));
    }

    private static final HashMap<Integer, FoodMenu> articles = new HashMap<>();

    static {
        articles.put(1, new FoodMenu(
                1,
                "Quarter Pounder",
                "$12.25",
                "It's mighty simple, but it works. Take a whole quarter pound* of 100% Aussie beef, then complete the tasty picture with cheese, onions, tangy mustard and pickles. Bet your mouth is watering right now.",
                R.drawable.quarter_pounder
        ));
        articles.put(2, new FoodMenu(
                2,
                "Double Cheeseburger",
                "$10.30",
                "The Double Cheeseburger features two 100% pure beef patties seasoned with just a pinch of salt and pepper.",
                R.drawable.double_cheeseburger
        ));

        articles.put(3, new FoodMenu(
                3,
                "Chicken McNuggets",
                "$13.15",
                "Our tender, juicy Chicken McNuggets are made with 100% white meat chicken and no artificial colors, flavors or preservatives.",
                R.drawable.chicken_mcnuggets
        ));

        articles.put(4, new FoodMenu(
                4,
                "Crispy BBQ Chicken",
                "$12.75",
                "The new BBQ Chicken burger made with 100% Aussie Chicken Breast, BBQ sauce, rasher bacon, crisp lettuce, creamy mayo all on a sesame seed bun. ",
                R.drawable.bbq_chicken
        ));

        articles.put(5, new FoodMenu(
                5,
                "McChicken",
                "$11.80",
                "It's the simple things that matter. Like our quality chicken breast, cooked in a seasoned tempura coating. Topped with fresh, Australian-grown lettuce and our exceptional McChicken sauce, between a sesame seed bun, it's hard to beat a classic.",
                R.drawable.mcchicken
        ));

        articles.put(6, new FoodMenu(
                6,
                "Hash Brown",
                "$2.50",
                "Get 'em hot. A crunchy, golden brown crust with steaming, fluffy potato inside.",
                R.drawable.hash_brown
        ));

        articles.put(7, new FoodMenu(
                7,
                "McFlurry with Cadbury",
                "$4.70",
                "Indulge in something sweet. As a snack, after dinner or even before. ",
                R.drawable.mcflurry_with_cadbury
        ));

        articles.put(8, new FoodMenu(
                8,
                "Fries",
                "$2.60",
                "Get them while they're hot. Our legendary, super-tasty French fries are the perfect side to any meal. ",
                R.drawable.fries
        ));

        articles.put(9, new FoodMenu(
                9,
                "McFeast",
                "$12.60",
                "The McFeast® burger is an Australian favourite. A juicy beef patty, cheese, tomato, lettuce, pickles, three sauces all on a classic sesame seed bun.",
                R.drawable.mcfeast
        ));

        articles.put(10, new FoodMenu(
                10,
                "Aussie Angus",
                "$13.85",
                "What's better than a classic Aussie burger filled with crispy bacon, homegrown wholeleaf lettuce, beetroot, 100% Aussie sourced eggs, our juicy 100% Angus beef and a delicious tomato onion relish?",
                R.drawable.aussie_angus
        ));

        articles.put(11, new FoodMenu(
                11,
                "BBQ Bacon Angus",
                "$14.30",
                "Our new gourmet BBQ sauce, crispy bacon, and a thicker, juicier, certified 100% Angus beef patty.",
                R.drawable.bbq_bacon_angus
        ));

        articles.put(12, new FoodMenu(
                12,
                "Classic Angus",
                "$13.75",
                "Hash Brown",
                R.drawable.classic_angus
        ));

        articles.put(13, new FoodMenu(
                13,
                "Angus Clubhousen",
                "$13.85",
                "100% Aussie Angus beef, classic cheese, tomato, onions and pickles with mustard and mayo",
                R.drawable.angus_clubhousen
        ));

        articles.put(14, new FoodMenu(
                14,
                "Big Mac",
                "$11.90",
                "It starts with two 100% Aussie beef patties. Then comes the delicious combination of crisp iceberg lettuce, melting signature cheese, onions and pickles, between a toasted sesame seed bun. And don't forget the McDonald's special sauce!",
                R.drawable.big_mac
        ));

        articles.put(15, new FoodMenu(
                15,
                "Double Big Mac",
                "$14.40",
                "Made with four 100% Canadian beef patties, special sauce, crisp lettuce, processed cheddar cheese, pickles and onions on a toasted sesame seed bun.",
                R.drawable.double_big_mac
        ));


    }
}
