package restaurantetocomfome

class Prato extends Produto {
    int quantidadePessoas
    static constraints = {
        quantidadePessoas min: 1
    }
    static mapping = {
        discriminator value: "PRATO"
    }
}
