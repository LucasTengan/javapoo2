package aula08;
public class Aula08 {
    public static void main(String[] args) {
        Pessoa P[] = new Pessoa[2];
        Livro L[] = new Livro[3]; 
        
        P[0] = new Pessoa("Lucas", 18, "Masculino");
        P[1] = new Pessoa("Pedro", 22, "Masculino");
        
        L[0] = new Livro("Revolução dos Bichos", "George Orwell", 200, P[0]);
        L[1] = new Livro("1984", "George Orwell", 300, P[0]);
        L[2] = new Livro("Brás Cubas", "Machado de Assis", 280, P[1]);
        
        L[0].fechar();
        L[0].folhear(201);
        System.out.println(L[0].detalhes());
        
        L[1].abrir();
        System.out.println(L[2].detalhes());
    }
}
