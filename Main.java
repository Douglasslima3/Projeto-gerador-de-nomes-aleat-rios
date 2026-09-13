public class Main {

    public static void main (String[] args){
        Carro MeuCarro = new Carro();

    }
}


class Carro {
    String modelo;
    // acima em "classe" nós temos a deficinção própriamente de uma nova classe;
    // abaixo temos o atributo dessa class modelo que recebeu uma string para atribuimos o "nome do carro";
    public Carro() {
        System.out.println("Carro criado");

    }
}