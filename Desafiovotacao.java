package br.com.simoes.desafiovotacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafiovotacao {

    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        double brancos;
        double nulos;
        double eleitor;
        double percentual;
        double validos;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Informe quantos votos teve o candidato a : ");
        a = tec.nextDouble();
        
        System.out.print("Informe quantos votos teve o candidato b : ");
        b = tec.nextDouble();
        
        System.out.print("Informe quantos votos teve o candidato c : ");
        c = tec.nextDouble();
        
        System.out.print("Informe quantos votos brancos : ");
        brancos = tec.nextDouble();
        
        System.out.print("Informe quantos votos nulos : ");
        nulos = tec.nextDouble();
        
        
        
        eleitor = a + b + c + brancos + nulos;
        
        System.out.println("total de eleitores na secao!! " + eleitor );
        
        validos = a + b + c;
        
        System.out.println(" Votos validos da secao!!" + validos);
        
        
        
        percentual = a/eleitor *100;
        
        System.out.printf(" percentual de votos do candidato a! %.2f\n" , percentual);
        
        percentual = b/eleitor *100;
        
        System.out.printf(" percentual de votos do candidato b!! %.2f\n" , percentual);
        
        percentual = c/eleitor *100;
        
        System.out.printf(" percentual de votos do canditado c!! %.2f\n" , percentual);
        
        percentual = nulos/eleitor *100;
        
        System.out.printf(" percentual dos votos nulos %.2f\n" , percentual);
        
        percentual = brancos/eleitor *100;
        
        System.out.printf(" percentual dos votos brancos %.2f\n" , percentual);
        
        
        
        
        
        
     
    }
}
