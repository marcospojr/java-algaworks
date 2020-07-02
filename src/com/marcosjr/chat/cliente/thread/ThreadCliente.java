package com.marcosjr.chat.cliente.thread;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

import com.marcosjr.chat.cliente.gui.JanelaGui;

public class ThreadCliente implements Runnable {

	private Socket socket;
	private JanelaGui janela;

	public ThreadCliente(Socket socket, JanelaGui janela) {
		this.socket = socket;
		this.janela = janela;
	}

	@Override
	public void run() {
		while (true) {
			try {
				InputStream is = this.socket.getInputStream();
				DataInput dis = new DataInputStream(is);
				String msgRecebida = dis.readUTF();
				
				janela.adicionaMensagem(msgRecebida);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}