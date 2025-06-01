package SmeuïgeChocoladeBrownies;

import javax.swing.*;
import java.awt.*;

public class SmeuigeCholodaceBrownieRecipe {

    // de introduction properties
    public void introductie() {
        System.out.println("Een makkelijk recept om zelf smeuïge chocolade brownies te maken. Brownies met een intense chocolade smaak en die heerlijk klef zijn.");
        System.out.println("Porties: 16 personen");
        System.out.println("voor een vierkante bakvorm 20 x 20 cm");
    }

    // de introducties uitprint
    public void introducties() {
        introductie();
    }

    // alle parameters van ingredient
    Ingredient butter = new Ingredient(60, "gram", "ongezouten roomboter");
    Ingredient kristal = new Ingredient(150, "gram", "fijne kristalsuiker");
    Ingredient basterd = new Ingredient(75, "gram", "basterdsuiker");
    Ingredient chocolate = new Ingredient(125, "gram", "pure chocolade");
    Ingredient syrup = new Ingredient(1, "el", "stroop (pannenkoekenstroop");
    Ingredient egg = new Ingredient(2, "stuks", "eiren");
    Ingredient vanille = new Ingredient(1, "tl", "vanille extract");
    Ingredient flour = new Ingredient(100, "gram", "bloem");
    Ingredient cacaopowder = new Ingredient(20, "gram", "cacaopoeder");
    Ingredient  bakingpowder= new Ingredient(1, "tl", "bakpoeder");

    // alle ingredient uit te printen
    public void printIngredients() {
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(kristal.getAmount() + " " + kristal.getUnit() + " " + kristal.getName());
        System.out.println(basterd.getAmount() + " " + basterd.getUnit() + " " + basterd.getName());
        System.out.println(chocolate.getAmount() + " " + chocolate.getUnit() + " " + chocolate.getName());
        System.out.println(syrup.getAmount() + " " + syrup.getUnit() +  " " + syrup.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanille.getAmount() + " " + vanille.getUnit() + " " + vanille.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(cacaopowder.getAmount() + " " + cacaopowder.getUnit() + " " + cacaopowder.getName());
        System.out.println(bakingpowder.getAmount() + " " + bakingpowder.getUnit() + " " + bakingpowder.getName());
        }

        // alle parameters van instructies om een brownie te maken
    public void step1() {
        System.out.println("Doe de boter, beide soorten suiker, chocola en stroop in een pannetje. Zet het op een laag vuur en roer door tot de boter en chocolade zijn gesmolten. De suikerkorrels hoeven niet te smelten. Laat het mengsel nu afkoelen. Kamertemperatuur is goed, maar lauwwarm mag ook.");
    }

    public void step2() {
        System.out.println("Klop ondertussen de eieren en het vanille-extract luchtig. Voeg het chocolademengsel toe en mix op een lage snelheid tot een egaal mengsel.");
    }

    public void step3() {
        System.out.println("Voeg de bloem, het cacaopoeder en het bakpoeder toe. Mix wederom op een lage stand tot de ingrediënten zijn opgenomen. Lang mixen of op hoge snelheid is niet nodig, anders worden je brownies niet zo smeuïg als je wilt.");
    }

    public void step4() {
        System.out.println("Giet het beslag in een met bakpapier beklede vorm van 20×20 cm en spreid gelijkmatig uit.");
    }

    public void step5() {
        System.out.println("Bak de brownie in 25 minuten op 190 °C (boven- en onderwarmte).");
    }

    public void step6() {
        System.out.println("De bovenkant ziet er droog uit na het bakken, maar van binnen is hij nog lekker zacht en smeuïg.");
    }

    public void step7() {
        System.out.println("Laat de brownie volledig in de vorm afkoelen voordat je hem eruit haalt en in stukken snijdt.");
    }

    // de instructies uit te printen
    public void printSteps() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
        step7();
    }

    // parameter van de tips
    public void tip() {
        System.out.println("Om het mengsel in de pan sneller af te laten koelen, kun je de pan in een bak met koud water zetten. De pan koelt meteen af, waardoor het mengsel ook sneller zal afkoelen.");
    }

    // de tips uit te printen
    public void printTips() {
        tip();
    }

    // Methode om de brownies foto te laten zien
    public void showImage() {
        JFrame frame = new JFrame("Brownies");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Laad de afbeelding
        ImageIcon icon = new ImageIcon("src/SmeuïgeChocoladeBrownies/Smeuige-chocolade-brownies-4.jpg");

        // Schaal indien nodig
        Image image = icon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);

        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}
