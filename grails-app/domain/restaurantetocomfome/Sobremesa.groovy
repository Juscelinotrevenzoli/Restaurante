package restaurantetocomfome

class Sobremesa extends Produto{
    int calorias
    
    static constraints = {
        calorias min: 0
    }
    static mapping = {
        discriminator value: "SOBREMESA"
    }
}
