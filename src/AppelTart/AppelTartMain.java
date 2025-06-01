package AppelTart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppelTartMain {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();

        System.out.println();
        recipe.printIngredienten(); // alle ingredienten uitprinten

        System.out.println("\nStappen:");
        recipe.printSteps(); //alle stappen uitprinten
//        recipe.step1();
//        recipe.step2();
//        recipe.step3();
//        recipe.step4();
//        recipe.step5();
//        recipe.step6();
//        recipe.step7();
//        recipe.step8();
//        recipe.step9();
//        recipe.step10();

        // Toon afbeelding
        recipe.showImage(); //extra: om de appel tart foot te laten zien
    }
}