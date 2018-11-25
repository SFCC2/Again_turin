
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sulay2016
 */
public class as {
    public static void main(String[] args) {
       as admin= new as();
       admin.crear_cinta();
    }
    
    public void crear_cinta(){
         Random aleatorios = new Random();
        Arbol e =new Arbol();
         int Max=(30)+1;// cota sup mas 1
            int Min=10;
            //System.out.print("("+((int)(Math.random()*(Max-Min))+Min)+")");
        int []a={1,1,0,1,0,0,0,1,0,1,1,0,0,1};
        int []b={1,1,0,1,0,0,0,1,0,1,1,0,0,1,0,1,0,0,1,1,0,1,0,0,0,1,0,1,1,0};
       // int[] b={1,0,0,1,1,0,1,0,0,0,1,0,1,1};
       // int A=1+aleatorios.nextInt(25);
       //int A=(int) (Math.random()*30+10);
       int A=31;
        if (A>=31) {            
                    A=(A/A)*30;
            System.out.println(A);
            crear_cinta();
        }else{
        System.out.println(A);
        String c="";
       for (int i = 0; i < A; i++) {
           
            c=""+b[i];
            e.Add_Nodo(i, c);
        }e.Inorder(e.raiz);
        System.out.println("");}
    }
     public void modificar(Turin cabezal) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        as admin = new as();
        JOptionPane.showConfirmDialog(null, "Esta seguro cambiar el contenido de la cinta?", "Atencion", dialogButton);
        if (dialogButton == JOptionPane.YES_OPTION) {
            //  int p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero para cambiar"));
            int p = admin.guardar();
            p = cabezal.info;
            if (dialogButton == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }
    }

    public int guardar() {
        int num = -1;
        int numt = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero para crear automata"));
        num = numt;
        switch (numt) {
            case 0:
                num = numt;
                System.out.println(num);
                break;
            case 1:
                System.out.println(num);
                num = numt;
                break;
            default:
                JOptionPane.showMessageDialog(null, " numero No Permitido");
                num = guardar();
                break;
        }
        return num;
    }

}
