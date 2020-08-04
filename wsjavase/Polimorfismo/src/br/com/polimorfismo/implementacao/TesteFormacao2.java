package br.com.polimorfismo.implementacao;

import javax.swing.JOptionPane;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.tela.Tela;

public class TesteFormacao2 {

	public static void main(String[] args) {
		
		Formacao formacao = null;
		char resp=0;
		
		do {
		
			resp = JOptionPane.showInputDialog("Digite: \n<B> Bacharelado\n<T> Tecnologo \n<M> Medio").toUpperCase().charAt(0);
			
			if (resp=='B') {
				formacao = new Bacharelado(
						Tela.t("Descricao"),
						Tela.i("Periodo"),
						0,
						0,
						Tela.t("Conclusao"),
						Tela.i("Carga horaria estagio")
				);
				
			} else if (resp=='T') {
				formacao = new Tecnologo(
						Tela.t("Descricao"),
						Tela.i("Periodo"),
						0,
						0,
						Tela.b2("� estendido?")
						);
			} else if (resp=='M') {
				formacao = new Medio(
						Tela.t("Descricao"),
						Tela.i("Periodo"),
						0,
						0,
						Tela.t("Tipo")
						);
			} else {
				JOptionPane.showMessageDialog(null, "Digite somente <B>, <T> ou <M>");
			}
		
		formacao.definirDuracao();
		formacao.calcularMensalidade(Tela.d("Digite o fator"));
		System.out.println(formacao.getAll());
		
		} while(JOptionPane.showConfirmDialog(null, "Continuar?" , "Aplicacao Polimorfismo" , JOptionPane.YES_NO_OPTION) == 0);
	}
}
