public class Enderecos {
   private String rua;
   private String cidade;
   private String codigo;

   public Enderecos(String rua, String cidade, String codigo) {
      this.rua = rua;
      this.cidade = cidade;
      this.codigo = codigo;
   }


   public String getRua() {
      return rua;
   }
   
   public String getCidade() {
      return cidade;
   }

   public String getCodigo(){
      return codigo;

      
   }

}