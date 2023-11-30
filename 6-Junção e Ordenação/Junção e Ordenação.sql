SELECT NomeCliente, PedidoID , DataPedido from Clientes
JOIN Pedidos on ClienteID = PedidoID
ORDER BY DataPedido DESC