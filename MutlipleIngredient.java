import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MutlipleIngredient implements GeneralEquations {
    private static final Scanner input = new Scanner(System.in);

    @Override
    public List<Double> temperatureDifference() {
        System.out.println("Enter outside and inside temperature.");
        double temperatureOfOutside = input.nextDouble();
        double temperatureOfİnside = input.nextDouble();
        double temp = temperatureOfOutside - temperatureOfİnside;
        List<Double> list = new ArrayList<>();
        list.add(temp);

        return list;
    }

    @Override
    public List<Double> area() {
        System.out.println("Enter short and long edge of wall.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double areaTotal = a * b;
        System.out.println(areaTotal);
        List<Double> area = new ArrayList<>();
        area.add(areaTotal);

        return area;
    }

    @Override
    public List<Double> coefficient() {
        System.out.println("How many materials does the wall contain?");
        int contain = input.nextInt();
     List<Double> coef = new LinkedList<>();
        for (int i = 1; i <= contain; i++) {
            System.out.println("Enter All Heat Transfer Coefficient(k) in W/m.K");
            double k = input.nextDouble();

            coef.add(k);
        }

        return coef;
    }

    @Override
    public List<Double> wallThickness() {
        System.out.println("Enter Wall Thickness in meters.");
        double thickness = input.nextDouble();
        List<Double> thick = new ArrayList<>();
        thick.add(thickness);
        return thick;
    }

    @Override
    public void fourierEquation() {
        double area = area().get(0);
        double temperature = temperatureDifference().get(0);


    }
}
