<g:if test="${produtos.size() > 0}">

    <table>
        <tr>
            <th>Nome</th>
            <th>Prço</th>
            <th>Qtde. Atual</th>
            <th>Qtde. Mínima</th>
            <th>Ações</th>
        </tr>
        <g:each var="produto" in="${produtos}">
            <tr>
                <td>${produto.nome}</td>
                <td>${produto.preco}</td>
                <td>${produto.estoque?.quantidade}</td>
                <td>${produto.estoque?.quantidadeMinima}</td>
                <td>
                    <g:remoteLink controller="produto" action="alterar" update="divForm" id="${produto.id}">Alterar</g:remoteLink>&nbsp;
                    %{--<a href="#" onclick="excluir('${produto.id}')">Excluir</a>&nbsp;--}%
                    <g:remoteLink controller="produto" action="excluir" update="divLista" id="${produto.id}">Excluir</g:remoteLink>
                </td>
            </tr>

        </g:each>

    </table>
</g:if>
<g:else>Não há produtos</g:else>