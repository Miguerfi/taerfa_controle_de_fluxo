import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        for(int i = 1;i<=4;i++){
            System.out.println("Digite a nota "+i);
            int nota = s.nextInt();
            notas.add(nota);
        }
        Integer media = calcularMedia(notas);
        if(media >= 7) {
            System.out.println("Aprovado");
        }
        if(media >= 5 && media < 7) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }

    public static int calcularMedia(List<Integer> notas){
        int soma = 0;
        for (Integer nota : notas) {
            soma += nota;
        }
        return soma/notas.size();// aqui poderia ser feito dividindo exatamente por 4, mas deixar dessa maneira abre espaço para ter um calculo mais dinamico
    }
}