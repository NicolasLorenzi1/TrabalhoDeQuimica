import java.util.HashMap;

import javax.swing.JOptionPane;

public class TrabalhoDeQuimica {

private static final HashMap<String, Double> metais = new HashMap<>();


public static double calcularVoltsBateria(double voltsMtealReduz, double voltsMetalOxida){
    double voltsBateria = voltsMtealReduz - voltsMetalOxida;
    return voltsBateria;
}

private static void preencherMetais(){
    metais.put("Na", -2.71);
    metais.put("Mg", -2.37);
    metais.put("Cu", 0.34);
    metais.put("Zn", -0.76);
}


public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Escolha um dos metais a seguir:\n" + "Na\nMg\nCu\nZn" , "Metais", JOptionPane.INFORMATION_MESSAGE);
    preencherMetais();

    String m1 = JOptionPane.showInputDialog(null, "Escolha um metal", "entrada", JOptionPane.INFORMATION_MESSAGE);
    String m2 = JOptionPane.showInputDialog(null, "Escolha um metal", "entrada", JOptionPane.INFORMATION_MESSAGE);

    if (!metais.containsKey(m1) || !metais.containsKey(m2)) {
        JOptionPane.showMessageDialog(null, "Metal invalido", "Erro", JOptionPane.ERROR_MESSAGE);

    } else {
        if (metais.get(m1) > metais.get(m2)) {
            double voltsBateria = calcularVoltsBateria(metais.get(m1), metais.get(m2));
            JOptionPane.showMessageDialog(null, "O metal que reduziu:" + m1 , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "O metal que oxidou:" + m2 , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Volts da Beteria:" + voltsBateria , "Mensagem", JOptionPane.INFORMATION_MESSAGE);

        } else {
            double voltsBateria = calcularVoltsBateria(metais.get(m2), metais.get(m1));
            JOptionPane.showMessageDialog(null, "O metal que reduziu:" + m2 , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "O metal que oxidou:" + m1 , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Volts da Beteria:" + voltsBateria , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
}