package com.marcosjr.chat.servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.marcosjr.chat.servidor.thread.ThreadServidor;

//Servidor para o serviço de chat

public class Servidor {
	
	//Lista dos clientes conectados
	private List<ThreadServidor> clientes = new ArrayList<>();

	public static void main(String[] args) {
		Servidor servidor = new Servidor();
		servidor.aguardarConexoes();
	}
	
	public void aguardarConexoes() {
		try (ServerSocket server = new ServerSocket(3333)) {
			
			while (true) {
				System.out.println("Aguardando conexões...");
				Socket socket = server.accept();
				
				ThreadServidor threadServidor = new ThreadServidor(socket, this);
				new Thread(threadServidor).start();
				
				this.clientes.add(threadServidor);
				System.out.println("Novo cliente conectado.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enviarMensagensClientes(String mensagem) {
		for (ThreadServidor cliente : this.clientes) {
			cliente.enviarMensagem(mensagem);
		}
	}
	
}
