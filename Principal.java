package bhaskara;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Contas conta = new Contas();
        Calculo calc = new Calculo();

        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite B:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite C:"));

        conta.setA(a);
        conta.setB(b);
        conta.setC(c);

        double[] res = calc.calcular(conta);

        if (res != null) {
            JOptionPane.showMessageDialog(null,
                "X1 = " + res[0] + "\nX2 = " + res[1]);
        } else {
            JOptionPane.showMessageDialog(null, "Delta negativo");
        }
    }
}