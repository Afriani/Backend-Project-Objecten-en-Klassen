package AppelTart;

import javax.swing.*;
import java.awt.*;

public class ApplePieRecipe {
    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient sugar = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanilla = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristal = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient crumbs = new Ingredient(15, "gram", "pannermeel");

    public void printIngredienten() {
        System.out.println("Ingrediënten:");

        //recipe.butter.printIngredient();
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());

        //recipe.sugar.printIngredient();
        System.out.println(sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());

        //recipe.flour.printIngredient();
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());

        //recipe.egg.printIngredient();
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());

        //recipe.vanilla.printIngredient();
        System.out.println(vanilla.getAmount() + " " + vanilla.getUnit() + " " + vanilla.getName());

        //recipe.salt.printIngredient();
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());

        //recipe.appels.printIngredient();
        System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());

        //recipe.kristal.printIngredient();
        System.out.println(kristal.getAmount() + " " + kristal.getUnit() + " " + kristal.getName());

        //recipe.cinnamon.printIngredient();
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());

        //recipe.crumbs.printIngredient();
        System.out.println(crumbs.getAmount() + " " + crumbs.getUnit() + " " + crumbs.getName());

    }

    public void step1() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }

    public void step2() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void step3() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void step4() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void step5() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void step6() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void step7() {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void step8() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void step9() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void step10() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    //new Methode voor printing the steps
    public void printSteps() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
        step7();
        step8();
        step9();
        step10();
    }

    // Methode om de apple taart foto te laten zien
    public void showImage() {
        JFrame frame = new JFrame("Appeltaart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Laad de afbeelding
        ImageIcon icon = new ImageIcon("src/appeltaart.jpg");

        // Schaal indien nodig
        Image image = icon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);

        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}
