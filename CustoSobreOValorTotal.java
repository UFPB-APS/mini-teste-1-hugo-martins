
public class CustoSobreOValorTotal implements Custo {
    
    private  String nome;
    private  Double taxa;
    
    public CustoSobreOValorTotal(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }
    
    public double calcularCustoTotal(Venda venda) {
            
         Double custoTotal = venda.getTotal() * taxa;
         return custoTotal;
    }
    
}

