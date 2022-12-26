import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleIngredient implements GeneralEquations {

    //ONE-DİMENSİONAL HEAT TRANSFER İN STEADY STATE

    private static final Scanner input = new Scanner(System.in);



    //Calculates area of wall
    @Override
    public List<Double> area() {
        System.out.println("Enter short edge of wall in meters.ss");
        double a = input.nextDouble();
        System.out.println("Enter long edge of wall in meters.");
        double b = input.nextDouble();
        double areaTotal = a * b;
        System.out.println(areaTotal);
        List<Double> area = new ArrayList<>();
        area.add(areaTotal);


        return area;
    }


    //Asks for coefficient of material
    @Override
    public List<Double> coefficient() {
        System.out.println("Enter Heat Transfer Coefficient(k) in W/m.K");
        double k = input.nextDouble();
        List<Double> coef = new ArrayList<>();
        coef.add(k);
        return coef;
    }

    //Calculates temperature difference outside and inside of wall
    @Override
    public List<Double> temperatureDifference() {
        System.out.println("Enter outside temperature in Kelvin");
        double temperatureOfOutside = input.nextDouble();
        System.out.println("Enter inside temperature in Kelvin");
        double temperatureOfİnside = input.nextDouble();
        double temp = temperatureOfOutside - temperatureOfİnside;
        List<Double> list = new ArrayList<>();
        list.add(temp);
        return list;
    }


    //Asks for wall thickness
    @Override
    public List<Double> wallThickness() {
        System.out.println("Enter Wall Thickness in meters.");
        double thickness = input.nextDouble();
        List<Double> thick = new ArrayList<>();
        thick.add(thickness);
        return thick;
    }


    //Calculates fouerier equaiton.
    @Override
    public void fourierEquation() {
        double area = area().get(0);
        double temperature = temperatureDifference().get(0);
        double thick = wallThickness().get(0);
        double coef = coefficient().get(0);

        double q = (-1 * coef * temperature * area) / thick;
        System.out.println("Heat Transfer is : " + q + " W");
    }
}
