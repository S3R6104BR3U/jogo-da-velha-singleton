

public class TabuleiroSingleton {

    private static TabuleiroSingleton instancia;

    private String campo1 = "[ ]";
    private String campo2 = "[ ]";
    private String campo3 = "[ ]";
    private String campo4 = "[ ]";
    private String campo5 = "[ ]";
    private String campo6 = "[ ]";
    private String campo7 = "[ ]";
    private String campo8 = "[ ]";
    private String campo9 = "[ ]";

    public String verificarVitoria(String jogador1, String jogador2) {
        // Jogos na horizontal
        if (campo1.equals("[X]") && campo2.equals("[X]") && campo3.equals("[X]")) {
            return jogador1;
        } else if (campo1.equals("[O]") && campo2.equals("[O]") && campo3.equals("[O]")){
            return jogador2;
        } else if (campo4.equals("[X]") && campo5.equals("[X]") && campo6.equals("[X]")) {
            return jogador1;
        } else if (campo4.equals("[O]") && campo5.equals("[O]") && campo6.equals("[O]")) {
            return jogador2;
        } else if (campo7.equals("[X]") && campo8.equals("[X]") && campo9.equals("[X]")) {
            return jogador1;
        } else if (campo7.equals("[O]") && campo8.equals("[O]") && campo9.equals("[O]")) {
            return jogador2;
        }
        // Jogos na vertical

        else if (campo1.equals("[X]") && campo4.equals("[X]") && campo7.equals("[X]")){
            return jogador1;
        } else if (campo1.equals("[O]") && campo4.equals("[O]") && campo7.equals("[O]")) {
            return jogador2;
        } else if (campo2.equals("[X]") && campo5.equals("[X]") && campo8.equals("[X]")) {
            return jogador1;
        } else if (campo2.equals("[O]") && campo5.equals("[O]") && campo8.equals("[O]")) {
            return jogador2;
        } else if (campo3.equals("[X]") && campo6.equals("[X]") && campo9.equals("[X]")) {
            return jogador1;
        } else if (campo3.equals("[O]") && campo6.equals("[O]") && campo9.equals("[O]")) {
            return jogador2;
        }
        // Jogos na diagonal

        else if (campo1.equals("[X]") && campo5.equals("[X]") && campo9.equals("[X]")) {
            return jogador1;
        } else if (campo1.equals("[O]") && campo5.equals("[O]") && campo9.equals("[O]")) {
            return jogador2;
        }  else if (campo3.equals("[X]") && campo5.equals("[X]") && campo7.equals("[X]")){
            return jogador1;
        } else if (campo3.equals("[O]") && campo5.equals("[O]") && campo7.equals("[O]")) {
            return jogador2;
        } else {
            return "O jogo continua!";
        }
    }

    //construtor
    private TabuleiroSingleton() {

    }

    public static TabuleiroSingleton getInstacia() {

        if (instancia == null) {
            instancia = new TabuleiroSingleton();
        }
        return instancia;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }
    
    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    } 
    
    public String getCampo4() {
        return campo4;
    }

    public void setCampo4(String campo4) {
        this.campo4 = campo4;
    }      

    public String getCampo5() {
        return campo5;
    }

    public void setCampo5(String campo5) {
        this.campo5 = campo5;
    }
    
    public String getCampo6() {
        return campo6;
    }

    public void setCampo6(String campo6) {
        this.campo6 = campo6;
    }

    public String getCampo7() {
        return campo7;
    }

    public void setCampo7(String campo7) {
        this.campo7 = campo7;
    }

    public String getCampo8() {
        return campo8;
    }

    public void setCampo8(String campo8) {
        this.campo8 = campo8;
    }
    
    public String getCampo9() {
        return campo9;
    }

    public void setCampo9(String campo9) {
        this.campo9 = campo9;
    }      
}
