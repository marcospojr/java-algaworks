package com.marcosjr.enviandoobjetos;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente {
	//Maquina 2 (cliente)
	
	public static void main(String[] args) throws Exception{
		
		try (Socket socket = new Socket("192.168.1.2",3333)) {
			
			OutputStream saida = socket.getOutputStream();
			ObjectOutput objectOutput = new ObjectOutputStream(saida);
			
			Pedido pedido = new Pedido();
			pedido.setCodigo(00001L);
			pedido.setNome("Caixa de sabonetes");
			pedido.setQuantidade(5);
			
			objectOutput.writeObject(pedido);

			InputStream entrada = socket.getInputStream();
			DataInputStream dataInput = new DataInputStream(entrada);
			System.out.println("Recebeu do servidor: " + dataInput.readUTF());
			
			socket.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
