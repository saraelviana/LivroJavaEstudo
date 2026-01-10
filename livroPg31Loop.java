package LivroJavaEstudo;

public class livroPg31Loop {
    public static void main(String[] args) {
        //double valorDoLivro = 59.90;
        double soma = 0;
        int contador = 0;
        while (contador < 35) {
            double valorDoLivro = 59.90;
            soma = soma + valorDoLivro;
            contador = contador + 1;
            
        }
        System.out.println("o total  em estoque e " + soma);
        if (soma < 150) {
            System.out.println("estoque baixo, comprar mais");
            
        }else if (soma >=200) {
            System.out.println("estoque alto, não comprar");
            
        }else{
            System.out.println("estoque ok");
        }
    }
}
