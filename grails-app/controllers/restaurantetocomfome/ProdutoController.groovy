package restaurantetocomfome

class ProdutoController {

    def lista = Produto.list()

    def index() {
        render(view: "/produto/index", model: [produtos: lista])
    }

    def adicionar (){
        Produto novoProduto = new Produto()
        novoProduto.preco = 0
        novoProduto.estoque = new Estoque()
        novoProduto.estoque.quantidade = 0
        novoProduto.estoque.quantidadeMinima = 0
        render(template: "/produto/form", model: [produto: novoProduto])
    }

    def alterar(){
        Produto produto = Produto.get(params.id)
        render(template:"/produto/form", model: [produto: produto])
    }

    def lista(){
        def lista = Produto.list()
        render(template: "/produto/lista", model: [produtos: lista])
    }

    def salvar (){
        Produto produto= new Produto()
        produto.nome = params.nome
        produto.preco = params.preco.toDouble()
        produto.estoque = new Estoque()
        produto.estoque.quantidade = params.quantidade.toInteger()
        produto.estoque.quantidadeMinima = params.quantidadeMinima.toInteger()

        produto.validate()
        if(!produto.hasErrors()){
            produto.save(flush: true)
            render("salvou com sucesso")
        }else {
            render("ops...deu pau!")
        }
    }
}
