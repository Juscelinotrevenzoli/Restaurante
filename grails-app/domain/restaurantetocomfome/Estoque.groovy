package restaurantetocomfome

class Estoque {
    int quantidade
    int quantidadeMinima
    Produto produto

    static belongsTo = [Produto]

    static constraints = {
        quantidade min: 0
        quantidadeMinima min: 0
        produto nullable: false
    }
    static mapping = {
        produto column: "id_produto"
    }
}
