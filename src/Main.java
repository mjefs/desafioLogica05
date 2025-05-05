import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
           usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).*/

        Scanner sc = new Scanner(System.in);

        double salaryBase = 1293.20;
        double salary = sc.nextDouble();

        double qtdSalaryBase = Math.ceil((salary / salaryBase) * 10) / 10.0;

        System.out.println("A quantidade de salarios minimos : " + qtdSalaryBase );




        sc.close();
    }
}