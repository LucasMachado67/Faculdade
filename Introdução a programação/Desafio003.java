
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a carga máxima suportada pela mochila");
        int cargaMaxima = scan.nextInt();
        Object[][] mochila = new Object[5][2];
        boolean sair = false;
        int quantidadeMochila = 3;
        int pesoAtualMochila = 37;
        mochila[0][0] = 12; mochila[0][1] = "Livro";
        mochila[1][0] = 5;  mochila[1][1] = "Lancheira";
        mochila[2][0] = 20; mochila[2][1] = "Notebook";
        
        do{
            System.out.println("--------------Menu-------------");
            System.out.println("1 - inserir Item");
            System.out.println("2 - Listar itens na mochila");
            System.out.println("3 - Valor do item mais pesado");
            System.out.println("4 - Ordenar a mochila");
            System.out.println("5 - Excluir item da mochila");
            System.out.println("6 - Sair");
            
            int escolha = scan.nextInt();
            
            switch(escolha){
                case 1:
                    if(quantidadeMochila == mochila.length){
                        System.out.println("Mochila esta cheia");
                        break;
                    }else{
                        if(quantidadeMochila == mochila.length){
                            System.out.println("Limite de itens atingido");
                            break;
                        }
                        System.out.println("Digite o peso do item");
                        mochila[quantidadeMochila][0] = scan.nextInt();
                        if(pesoAtualMochila + (Integer) mochila[quantidadeMochila][0] > cargaMaxima){
                            System.out.println("Vai ultrapassar a carga maxima");
                            break;
                        }
                        System.out.println("Digite o nome do item");
                        mochila[quantidadeMochila][1] = scan.next();
                        System.out.println("Nome: " + mochila[quantidadeMochila][1]);
                        System.out.println("Peso: " + mochila[quantidadeMochila][0]);
                        pesoAtualMochila += (Integer) mochila[quantidadeMochila][0];
                        quantidadeMochila++;
                    }
                    break;
                case 2:
                    for (int i = quantidadeMochila - 1; i >= 0; i--) {
                        System.out.println("Nome: " + mochila[i][1]);
                        System.out.println("Peso: " + mochila[i][0]);
                    }
                    break;
                case 3:
                    int maiorPeso = 0;
                    String itemMaiorPeso = "";
                    for(int i = 0; i < quantidadeMochila; i++){
                        if((Integer) mochila[i][0] > maiorPeso){
                            maiorPeso =  (Integer)mochila[i][0];
                            itemMaiorPeso = mochila[i][1].toString();
                        }
                    }
                    
                    System.out.println("Nome do maior peso: " + itemMaiorPeso);
                    System.out.println("Maior peso: " + maiorPeso);
                    break; 
                case 4:
                    for (int i = 0; i < quantidadeMochila - 1; i++) {
                        for (int j = 0; j < quantidadeMochila - 1 - i; j++) {
                            int pesoAtual = (Integer) mochila[j][0];
                            int pesoProximo = (Integer) mochila[j + 1][0];

                            if (pesoAtual < pesoProximo) {
                                Object[] temp = mochila[j];
                                mochila[j] = mochila[j + 1];
                                mochila[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < quantidadeMochila; i++) {
                        System.out.println("Peso: " + mochila[i][0] + " - Item: " + mochila[i][1]);
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do item");
                    String nomeItem = scan.next();
                    boolean itemEncontrado = false;
                    
                    for (int i = 0; i < quantidadeMochila; i++) {
                        if (mochila[i][1] != null && nomeItem.equals(mochila[i][1])) {
                            int pesoRemovido = (Integer) mochila[i][0]; 
                            itemEncontrado = true;
                            for (int j = i; j < quantidadeMochila - 1; j++) {
                                mochila[j] = mochila[j + 1];
                            }
 
                            quantidadeMochila--;
                            pesoAtualMochila -= pesoRemovido; 
                            break; 
                        }
                    }

                    if (!itemEncontrado) {
                        System.out.println("Item não encontrado na mochila.");
                    } else {
                        System.out.println("Item removido com sucesso!");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    sair = true;
                    scan.close();
                    break;
                default:
                    System.out.println("Digito incorreto");
                    break;
            }
        }while(sair != true);
        
        
       
    }
}