package produto;

import javax.swing.JOptionPane;

public class Main {
        public static void main(String[] args) throws Exception {
                Produto objsoma; // declaração do objeto
                objsoma = new Produto(); // iniciação do objeto

                int c = 0;
                int n1, n2;

                do {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero: ",
                                        "Repetição em Java", 3));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero: ",
                                        "Repetição em Java", 3));

                        objsoma.setN1(n1);
                        objsoma.setN2(n2);
                        JOptionPane.showMessageDialog(null,
                                        objsoma.getN1() + " * " + objsoma.getN2() + " = " + objsoma.produtoW(),
                                        "Repetição em Java", 1);
                        c = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova operação?",
                                        "Repetição em Java", JOptionPane.YES_NO_OPTION, 3);

                } while (c == 0);
                System.exit(0);
        }
}
