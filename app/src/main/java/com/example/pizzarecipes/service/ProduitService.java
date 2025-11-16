package com.example.pizzarecipes.service;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed(); // préremplissage
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    private void seed() {
        create(new Produit("BARBECUED CHICKEN PIZZA", 3, R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n-2 cups shredded Gouda cheese\n-1 small red onion, halved and thinly sliced\n-1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor.",
                "STEP 1:\n\nSprinkle chicken with pepper..."));

        create(new Produit("BRUSCHETTA PIZZA", 5, R.mipmap.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes...",
                "You might need a knife and fork for this hearty pizza!",
                "STEP 1:\n\nIn a small skillet, cook sausage..."));

        create(new Produit("SPINACH PIZZA", 2, R.mipmap.pizza3, "25 min",
                "- 1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes...",
                "This tasty pizza is so easy to prepare.",
                "STEP 1:\n\nPrepare pizza dough..."));

        create(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.mipmap.pizza4, "45 min",
                "- 1 package active dry yeast\n- 2/3 cup warm water...",
                "My Grandma made the tastiest snacks for us...",
                "STEP 1:\n\nIn a mixing bowl, dissolve yeast..."));

        create(new Produit("HOMEMADE PIZZA", 4, R.mipmap.pizza5, "50 min",
                "- 1 package active dry yeast\n- 1 teaspoon sugar...",
                "This recipe is hearty and zesty...",
                "STEP 1:\n\nIn large bowl, dissolve yeast..."));

        create(new Produit("PESTO CHICKEN PIZZA", 3, R.mipmap.pizza6, "50 min",
                "- 2 teaspoons active dry yeast\n- 1 cup warm water...",
                "This is the only pizza I make now...",
                "STEP 1:\n\nIn a large bowl, dissolve yeast..."));

        create(new Produit("LOADED MEXICAN PIZZA", 3, R.mipmap.pizza7, "30 min",
                "- 1 can black beans\n- 1 medium red onion...",
                "This healthy pizza has lots of flavor.",
                "STEP 1:\n\nIn a small bowl, mash black beans..."));

        create(new Produit("BACON CHEESEBURGER PIZZA", 2, R.mipmap.pizza8, "20 min",
                "- 1/2 pound ground beef\n- 1 small onion...",
                "Kids love this pizza and cheeseburger mix.",
                "STEP 1:\n\nIn a skillet, cook beef..."));

        create(new Produit("PIZZA MARGHERITA", 1, R.mipmap.pizza9, "30 min",
                "- 3 teaspoons active dry yeast\n- 1 cup warm water...",
                "A classic Pizza Margherita.",
                "STEP 1:\n\nIn a large mixing bowl, dissolve yeast..."));

        create(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.mipmap.pizza10, "45 min",
                "- 1 package active dry yeast\n- 1-1/4 cups warm water...",
                "For 30 years, friends told me to open a pizzeria.",
                "STEP 1:\n\nIn a small bowl, dissolve yeast..."));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}