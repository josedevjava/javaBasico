import javax.swing.*;
import javax.swing.UIManager;

public class AdivinaUnNumer {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName()
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "A ocurrido un problema" + e.getMessage());
        }

        int numeroSecreto = 40;
        int intento = 0;

        while (intento != numeroSecreto) {

            String texto = JOptionPane.showInputDialog(null,
                    "Ingrese un numero del 1 al 100.");

            if (texto == null) { // Para que no me de error al cerrar el programa

                JOptionPane.showMessageDialog(null, "Canselaste el programa");
                return;
            }

            intento = Integer.parseInt(texto);

            if (intento > numeroSecreto){

                JOptionPane.showMessageDialog(null,
                        "El numero secreto es menor que el ingresado");

            } else if (intento < numeroSecreto){

                JOptionPane.showMessageDialog(null,
                        "El numero secreto es mayor que el ingresado");

            }

        }

        JOptionPane.showMessageDialog(null,
                "Felicidades adivinaste el numero!");

    }
}

