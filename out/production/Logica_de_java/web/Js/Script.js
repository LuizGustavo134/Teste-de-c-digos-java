function adicionarPedido() {
    // 1. Pega os valores dos campos
    var cliente   = document.getElementById('inp-cliente').value.trim();
    var produto   = document.getElementById('inp-produto').value.trim();
    var pagamento = document.getElementById('inp-pagamento').value;

    // 2. Valida se tudo foi preenchido
    if (!cliente || !produto || !pagamento) {
        alert('Preencha todos os campos!');
        return;
    }

    // 3. Cria o card do pedido na página
    var itens = document.getElementById('itens');

    var card = document.createElement('div');
    card.className = 'pedido-item';

    card.innerHTML =
        '<div class="pedido-row">' +
            '<span>Cliente</span>' +
            '<span>' + cliente + '</span>' +
        '</div>' +
        '<div class="pedido-row">' +
            '<span>Produto</span>' +
            '<span>' + produto + '</span>' +
        '</div>' +
        '<div class="pedido-row">' +
            '<span>Pagamento</span>' +
            '<span><span class="badge-pag badge-' + pagamento + '">' + pagamento + '</span></span>' +
        '</div>';

    itens.appendChild(card);

    // 4. Mostra a lista
    document.getElementById('lista').style.display = 'flex';

    // 5. Limpa os campos
    document.getElementById('inp-cliente').value   = '';
    document.getElementById('inp-produto').value   = '';
    document.getElementById('inp-pagamento').value = '';
}