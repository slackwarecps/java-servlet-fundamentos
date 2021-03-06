package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	
	//bloco estatico que roda por padrao...
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Google");
		
		lista.add(empresa);
		lista.add(empresa2);
		
	}
	

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		empresa.setId(chaveSequencial++);
		System.out.println("empresa adicionada no banco de dados fake...");
		
		System.out.println(lista);
		
	}
	
	public List<Empresa> getEmpresas(){
		
		
		return lista;
		
		
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while (it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId()==id) {
				it.remove();
				System.out.println("Empresa removida " + id);
			}
			
		}
		
		
		
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa:lista) {
			if(empresa.getId()==id) {
				return empresa;
			}
		}	
		return null;
	}

}
