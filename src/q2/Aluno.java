package q2;

public class Aluno implements Comparable<Aluno>{
	private Long matricula;
	private String nome;
	private Double p1;
	private Double p2;
	private Double t1;
	private Double t2;
	
	public Aluno(Long matricula, String nome, Double p1, Double p2, Double t1, Double t2) {
		this.matricula = matricula;
		this.nome = nome;
		this.p1 = p1;
		this.p2 = p2;
		this.t1 = t1;
		this.t2 = t2;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public Double getT1() {
		return t1;
	}

	public void setT1(Double t1) {
		this.t1 = t1;
	}

	public Double getT2() {
		return t2;
	}

	public void setT2(Double t2) {
		this.t2 = t2;
	}

	public double media() {
		double parcela1 = 0.6 * ((p1+p2)/2);
		double parcela2 = 0.4 * ((t1+t2)/2);
		return parcela1 + parcela2;
	}
	
	public char conceito() {
		if(media() < 5.0)
			return 'I';
		if(media() >= 5.0 && media() < 7.0)
			return 'R';
		if(media() >= 7.0 && media() < 9.0)
			return 'B';
		return 'E';
		
	}
	
	@Override
	public int compareTo(Aluno o) {
		// TODO Auto-generated method stub
		return this.matricula.compareTo(o.getMatricula());
	}
	
	@Override
	public String toString() {
		return matricula + " " + nome + " " + 
	           String.format("%.1f", media()) + " " + 
			   conceito();
	}
	
	
	
	
	
	
	
	
}
