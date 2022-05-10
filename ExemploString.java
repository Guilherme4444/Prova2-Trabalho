public class ExemploString {

    public static void main(String[] args) {
        
        String java = "java";
        for (int i=0; i<java.length(); i++){
            System.out.println(java.charAt(i));
        }

        
    }
}


// EXEMPLO 2

public class ExemploString2 {
    public static void main(String args[]){
        String nome = null;  
     
        if(nome != null)
          System.out.println(nome.length());    
        else
          System.out.println("Objeto é nulo.");      
     
        System.exit(0);
      }
    }

//Exemplo 3
