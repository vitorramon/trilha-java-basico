package edu.ramon.primeirasemana;
public class DeclaracaoDeMetodos {
    
    public static void main (String [] args){
        String primeiroNome = "Vitor";
        String segundoNome = "Ramon";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
