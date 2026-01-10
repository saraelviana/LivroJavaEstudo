package HoraDeCodarJava;

public class funcao3Retorn {
    public static void main(String[] args) {
        // AQUI NESTE BLOCO VOCE CHAMA A FUNÇÃO
        saudar("João");

        
        
    }
    public static void saudar(String nome){
        System.out.println("Seja bem vindo " + nome);
    }

    // VOU DIZER QUE O NUMERO DOBRAVEL VAI SER UM INTEIRO - POR ISSO USO INT EM VEZ DE VOID

    public static int dobrar(int num){
        return num * 2;
    }

}
