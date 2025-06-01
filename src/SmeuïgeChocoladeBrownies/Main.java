package SmeuïgeChocoladeBrownies;

public class Main {
    public static void main(String[] args) {
        SmeuigeCholodaceBrownieRecipe recipe = new SmeuigeCholodaceBrownieRecipe(); // nieuwe data toevoegen

        System.out.println();
        System.out.println("Smeuïge chocolade brownies"); // text uitprint


        System.out.println();
        recipe.printIngredients(); //ingredienten uitprint

        System.out.println();
        System.out.println("Instructies"); // instructies uitprint
        recipe.printSteps();

        System.out.println();
        System.out.println("Tips"); // tips uitprint
        recipe.printTips();

        recipe.showImage(); // brownie foto uitprint
    }
}
