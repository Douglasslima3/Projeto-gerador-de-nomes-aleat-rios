import java.util.Random;



public class Main {

    public static void main(String[] args) {

    char[] vogais = {'a', 'e', 'i', 'o', 'u'};

    char[] consoantes =  {'b','c','d', 'f', 'g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};


    Random random = new Random(); // Criei o objeto que irá sortear meus números

    char[] nome = new char[5];

    for(int i = 0; i < nome.length; i++){ // Aqui ficará a instrução para preencher uma posição
        if (i % 2 == 0) { //aqui ficará uma consoante aleatória
            nome[i] = consoantes[random.nextInt(consoantes.length)];
        } else{
            nome[i] = vogais[random.nextInt(vogais.length)];

        }
    }
    System.out.println(nome);

    }


}