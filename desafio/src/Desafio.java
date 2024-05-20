import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = input.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        } catch (ParametrosInvalidosIguaisException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException, ParametrosInvalidosIguaisException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        if (parametroUm == parametroDois){
            throw new ParametrosInvalidosIguaisException();
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}