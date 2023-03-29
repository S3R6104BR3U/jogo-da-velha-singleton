import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        Scanner scan = new Scanner(System.in);

        System.out.println("BEM VINDO AO JOGO DA VELHA");

        Jogador jogador1 = new Jogador();
        System.out.println("Digite um Nome para o Jogador 1");
        jogador1.nome = scan.next();
        
        Jogador jogador2 = new Jogador();
        System.out.println("Digite um Nome para o Jogador 2");
        jogador2.nome = scan.next();
        
        //TabuleiroSingleton tabuleiro = new TabuleiroSingleton();
        TabuleiroSingleton tabuleiro = TabuleiroSingleton.getInstacia();

        

        String marca = "[X]";
        
        System.out.println("Use o teclado numérico para preenchero o jogo cada digito siboliza um campo no tabuleiro");
        System.out.println("[7]|[8]|[9]");
        System.out.println("[4]|[5]|[6]");
        System.out.println("[1]|[2]|[3]");
        System.out.println("Exemplo: Se você apertar 1");
        System.out.println("O campo do lado Esquerdo Inferior será preenchido");
        System.out.println("[ ]|[ ]|[ ]");
        System.out.println("[ ]|[ ]|[ ]");
        System.out.println("[X]|[ ]|[ ]");
        
        System.out.println("Iniciar Jogo! " + jogador1.getNome() + " sua vez");
        System.out.println("Escolha um digito (1-9)");


        String vencedor;
        
        for (int count = 1; count <= 9; count ++) {
            String posicao = scan.next();
    
            if (posicao.equals("1")) {
                tabuleiro.setCampo1(marca);
                marca = mudarMarca(marca);
                
            } else if (posicao.equals("2")) {
                tabuleiro.setCampo2(marca);
                marca = mudarMarca(marca);

            } else if (posicao.equals("3")) {
                tabuleiro.setCampo3(marca);
                marca = mudarMarca(marca);
            } else if (posicao.equals("4")) {
                tabuleiro.setCampo4(marca);
                marca = mudarMarca(marca);
            } else if (posicao.equals("5")) {
                tabuleiro.setCampo5(marca);
                marca = mudarMarca(marca);
            } else if (posicao.equals("6")) {
                tabuleiro.setCampo6(marca);
                marca = mudarMarca(marca);
            } else if (posicao.equals("7")) {
                tabuleiro.setCampo7(marca);
                marca = mudarMarca(marca);
            } else if (posicao.equals("8")) {
                tabuleiro.setCampo8(marca);
                marca = mudarMarca(marca);
            } else if (posicao.equals("9")) {
                tabuleiro.setCampo9(marca);
                marca = mudarMarca(marca);
            } else {
                System.out.println("Entrada invalida");
                count--;
                System.out.println("Digite uma entrada valida!");
            }

         
        
            System.out.println(tabuleiro.getCampo7() + "|" + tabuleiro.getCampo8() + "|" + tabuleiro.getCampo9());
            System.out.println(tabuleiro.getCampo4() + "|" + tabuleiro.getCampo5() + "|" + tabuleiro.getCampo6());
            System.out.println(tabuleiro.getCampo1() + "|" + tabuleiro.getCampo2() + "|" + tabuleiro.getCampo3());
            
            if (count == 9) {
                System.out.println("NÃO HOUVE VENCEDOR");
                break; 
            }
        
            vencedor = tabuleiro.verificarVitoria(jogador1.getNome(), jogador2.getNome());
            System.out.println("O vencedor é: " + vencedor);
            
            if (vencedor != "O jogo continua!") {
                System.out.println("FIM DE JOGO");
                break;
            }

            System.out.println(chamarJogador(marca, jogador1.getNome(), jogador2.getNome()));
        }
            
        

        scan.close();
        
    }

    public static String mudarMarca(String marca) {
        if (marca.equals("[X]")) {
            marca = "[O]";
         } else {
            marca = "[X]";
         }
        return marca;

    }

    public static String chamarJogador(String marca, String jogador1, String jogador2) {
        if (marca == "[X]") {
            return "Sua vez " + jogador1 + "!";
        } else {
            return "Sua vez " + jogador2 + "!";
        }
    
    }

    
}
