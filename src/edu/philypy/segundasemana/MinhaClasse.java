package edu.philypy.segundasemana;
public class MinhaClasse {
    
    public static void main(String[] args) {
        String primeiroNome = "Philypy";
        String segundoNome = "Gomes";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
