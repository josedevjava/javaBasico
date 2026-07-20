import javax.swing.JOptionPane;


public class Metodos {

    public static void main(String[] args) {

        saludar();

            String t1 = JOptionPane.showInputDialog(null,
                    "Ingresa un numero");
            if (t1 == null) { // es para que al cerrar el programa sin ingresar datos no marque error.

                JOptionPane.showMessageDialog(null,
                        "Cancelo el programa");
                return;
            }

            String t2 = JOptionPane.showInputDialog(null,
                    "Ingresa un numero");
            if (t2 == null){ // es para que al cerrar el programa sin ingresar datos no marque error.

                JOptionPane.showMessageDialog(null,
                        "Cancelo el programa");
                return;
            }

        int primero = Integer.parseInt(t1);
        int segundo = Integer.parseInt(t2);

        int resultado = sumar(primero, segundo);

        JOptionPane.showMessageDialog(null,
                "El resultado es: " + resultado);
        }

    public static void saludar() {

        JOptionPane.showMessageDialog(null,
                "Holaa!");
    }

    public static int sumar(int a, int b) {

        return a + b;
    }

    }




