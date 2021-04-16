package restaurantetocomfome

class Bebidas extends Produto {
    Double liquido
    String unidade
    static constraints = {
        liquido min: new Double(0)
        unidade nullable: false, blank: false, inList: ["L","ml"]
    }

    static mapping = {
        discriminator value: "BEBIDA"
    }
}
