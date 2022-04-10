package Vista;

import Modelo.Arreglo;
import javax.swing.JOptionPane;

public class Vista {

    public static void main(String[] args) {

        Arreglo ob1 = new Arreglo();
        Arreglo ob2 = new Arreglo(0);
        Arreglo ob3 = new Arreglo(0, 1);
        int opcion1 = 0, opcion2 = 0;
        do {
            opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la opcion según su preferencia: \n 1. Cargar \n 2.Imprimir"));
            switch (opcion1) {
                case 1: {
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la opcion según su preferencia: \n 1. Aleatorio \n 2.Teclado \n 3.Multiplicar \n 4.Volver \n 5.Salir"));
                    switch (opcion2) {
                        case 1:
                            ob1.cargar();
                            break;
                        case 2:
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    ob2.setM(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero")), i, j);
                                }
                            }
                            break;
                        case 3:
                            ob3.multiply(ob1.getMM(), ob2.getMM(), ob3.getMM());
                            break;

                    }
                }
                break;
                case 2: {
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Imprimir: \n 1. Ob1 \n 2.Ob2 \n 3.Ob3 \n 4.Volver \n 5.Salir"));
                    switch (opcion2) {
                        case 1:
                            ob1.impri();
                            break;
                        case 2:
                            ob2.impri();
                            break;
                        case 3:
                            ob3.impri();
                            break;

                    }
                }
                break;
            }
        } while (opcion2 != 5);
    }

}
