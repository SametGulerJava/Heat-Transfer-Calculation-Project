import java.util.List;
import java.util.Scanner;

public interface GeneralEquations {


    default void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1- Choose if your wall has just one material \n2- Choose if your wall has multiple material");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                SingleIngredient single = new SingleIngredient();
                single.fourierEquation();
                break;
            case 2:
                MutlipleIngredient multi = new MutlipleIngredient();
                multi.fourierEquation();
                break;
        }

    }


    List<Double> temperatureDifference();

    List<Double> area();

    List<Double> coefficient();

    List<Double> wallThickness();

    void fourierEquation();


}
