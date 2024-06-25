import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class GerenciadorCSV {
    public void  escreverPessoa(String arquivoCSV, Pessoas pessoas){
        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoCSV, true))) {
            writer.println(pessoas.getNome()+ "," + pessoas.getIdade() + ","+ pessoas.getCodigo());
            System.out.println("Nova pessoa adicionada ao arquivo" + arquivoCSV);
        } catch(IOException e ) {
            System.err.println("Erro ao escrever no arquivo" +arquivoCSV+ ":"+e.getMessage());
        }
    }



public void escreverEndereco(String arquivoCSV, Enderecos enderecos) {
    try(PrintWriter writer = new PrintWriter(new FileWriter(arquivoCSV,true))){
        writer.println(enderecos.getRua()+ "," + enderecos.getCidade() + "," + enderecos.getCodigo());
        System.out.println("Novo endereço adicionado ao arquivo" +arquivoCSV);
    } catch (IOException e) {
        System.err.println("Erro ao escrever no arquivo" + arquivoCSV + ":" + e.getMessage());

       }
    }
}
