import java.util.Scanner;

public class calc2 {
    public static void main(String[] args) {
       Scanner dog = new Scanner (System.in);

       System.out.print("Digite um valor: ");
       int x = dog.nextInt();

       System.out.print("Digite outro valor: ");
       int y = dog.nextInt();

       float z = (float) Math.cbrt(x);
       float w = (float) Math.sqrt(x);
       float h = (float) Math.PI * x;
       float u = (float) Math.abs(x);
       System.out.printf("A raiz cúbica de %d é %.1f \n", x, z);
       System.out.printf("A raiz quadrada de %d é %.1f \n", x, w);
       System.out.printf("%d x pi vale: %.1f \n",x, h);

       float e = (float) Math.sqrt(y);
       float f = (float) Math.PI * y;
       float g = (float) Math.pow(y, x);
       float t = (float) Math.cbrt(y);

       System.out.printf("A raiz quadrada de %d é %.1f \n", y,e);
       System.out.printf("%d x pi vale: %.1f \n", y, f);
       System.out.printf("A potencia entre %d e %d vale %.1f \n", x,y,g);
       System.out.printf("A raiz cúbica de %d vale: %.1f \n", y,t);



    }
    
}
