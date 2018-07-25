public class LogicaVenda {

    private Custo ct;
    private Custo seguro;

    public Custo getSeguro() {
        return seguro;
    }
    
    public void setSeguro(Custo seguro) {
        this.seguro = seguro;
    }

    public double calcularTotal(Venda venda) {
        venda.setTotal(0.0);
        
        for (ItemVenda item: venda.getItens()) {
            if (item != null) {
                venda.setTotal(venda.getTotal() + item.getSubTotal());
            }
        }
        
        if ( this.ct != null) {
            venda.setTotal(venda.getTotal() + this.ct.calcularCustoTotal(venda));
        }
        
        if ( this.seguro != null) {
            venda.setTotal(venda.getTotal() + this.seguro.calcularCustoTotal(venda));
        }
        
        return venda.getTotal();
    }
}
