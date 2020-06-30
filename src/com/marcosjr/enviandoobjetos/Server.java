package com.marcosjr.enviandoobjetos;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
	//Maquina 1 (server)
	
	public static void main(String[] args) throws Exception {
		
		try (ServerSocket server = new ServerSocket(3333)){
			System.out.println("Aguardando conexão...");
			Socket socket = server.accept(); // O programa para aqui e aguarda conexões
			System.out.println("Conectado a: " + socket.getRemoteSocketAddress());
			
			
			InputStream entrada = socket.getInputStream();
			ObjectInputStream objectStream = new ObjectInputStream(entrada);
			
			Pedido pedido = (Pedido) objectStream.readObject();
			System.out.println("Codigo: " 		+ pedido.getCodigo());
			System.out.println("Nome: " 		+ pedido.getNome());
			System.out.println("Quantidade: " 	+ pedido.getQuantidade());

			OutputStream saida = socket.getOutputStream();
			DataOutput dataOutput = new DataOutputStream(saida);
			dataOutput.writeUTF("Recebido com sucesso!");
			
			server.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
