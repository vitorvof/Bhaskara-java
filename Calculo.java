package bhaskara;

import javax.swing.JOptionPane;

public class Calculo {

    public double[] calcular(Contas conta) {

        double a = conta.getA();
        double b = conta.getB();
        double c = conta.getC();

        double delta = (b * b) - (4 * a * c);

        // 👇 mostra o delta SEMPRE
        JOptionPane.showMessageDialog(null, "Delta = " + delta);

        double[] resultado = new double[2];

        if (delta >= 0) {

            resultado[0] = (-b + Math.sqrt(delta)) / (2 * a);
            resultado[1] = (-b - Math.sqrt(delta)) / (2 * a);

        } else {

            JOptionPane.showMessageDialog(null, "Delta negativo - sem raízes reais");
            return null;
        }

        return resultado;
    }
}