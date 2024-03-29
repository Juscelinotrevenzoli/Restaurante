package restaurantetocomfome

class Pedido {
    Date dataHora
    Double valorTotal
    Cliente cliente

    static hasMany = [itens:ItemPedido]

    static mapping = {
        cliente column: "id_cliente"
    }

    static constraints = {
       valorTotal min: new Double(0)
        cliente nullable: false
    }
}
