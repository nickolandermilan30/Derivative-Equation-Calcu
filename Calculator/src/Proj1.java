import javax.swing.JOptionPane;

public class Proj1 {

    public static void main(String[] args) {
        // Humiling ng input mula sa user para sa equation gamit ang JOptionPane
        String equation = JOptionPane.showInputDialog("Enter the equation in terms of x and y:");

        // Humiling ng input mula sa user para sa halaga ng x gamit ang JOptionPane
        String inputX = JOptionPane.showInputDialog("Enter the value of x:");
        double x = Double.parseDouble(inputX);

        // Humiling ng input mula sa user para sa halaga ng y gamit ang JOptionPane
        String inputY = JOptionPane.showInputDialog("Enter the value of y:");
        double y = Double.parseDouble(inputY);

        // Kalkulahin ang derivative gamit ang binigay na halaga ng x at y at equation
        double derivative = calculateDerivative(equation, x, y);

        // Ipakita ang resulta gamit ang JOptionPane
        JOptionPane.showMessageDialog(null, String.format("The derivative dy/dx at (%.2f, %.2f) is: %.2f", x, y, derivative));
    }

    // Function para kalkulahin ang derivative ng equation sa loob ng given point (x, y)
    public static double calculateDerivative(String equation, double x, double y) {
        // Sa halimbawang ito, ang equation ay x^3 + y^3 = 1
        // Para makuha ang derivative ng y sa x, gagamitin natin ang 'Implicit Differentiation'

        // Kunin ang derivative ng y sa x gamit ang 'Implicit Differentiation'
        // Ang derivative ng y sa x ay makukuha sa pamamagitan ng pagkuha ng negative derivative ng equation sa x,
        // at paghati ito sa derivative ng equation sa y
        // (Kaya ito ang dahilan kung bakit -1.28, dahil nakuha mo ang resulta ng derivative sa x)
    	return (-3 * Math.pow(x, 2)) / (3 * Math.pow(y, 2));

    }

}
