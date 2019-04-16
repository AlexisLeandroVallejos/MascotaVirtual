package mascota;

public class Tamagochi {

	private int contento;
	
	private boolean hambriento;
	
	private int cantidadDeVecesQueJugo;
	
	private boolean aburrido;
	
	public Tamagochi()
	{
		setContento(0);
		cantidadDeVecesQueJugo = 0;
		hambriento = false;
	}
	
	public void Comer() 
	{
		if(hambriento)
		{
			setContento( getContento() + 1);
			hambriento = false;
		}
	}

	public void Jugar() throws RuntimeException
	{
		this.setContento(contento + 2);
		if(cantidadDeVecesQueJugo > 5)
		{
			this.hambriento = true;
		}
	}
	
	public boolean puedeJugar() {
		// TODO Auto-generated method stub 
		return ((this.aburrido || this.contento > 0) && !this.hambriento);
		//return false;
	}

	public int getContento() {
		return contento;
	}

	public void setContento(int contento) {
		this.contento = contento;
	}

	public boolean isAburrido() {
		return aburrido;
	}

	public void setAburrido(boolean aburrido) {
		this.aburrido = aburrido;
	}

	public int getCantidadDeVecesQueJugo() {
		return cantidadDeVecesQueJugo;
	}

	public void setCantidadDeVecesQueJugo(int cantidadDeVecesQueJugo) {
		this.cantidadDeVecesQueJugo = cantidadDeVecesQueJugo;
	}

	public boolean estaHambrienta() {
		// TODO Auto-generated method stub
		return this.hambriento;
	}

	public void setHambrienta(boolean valor) {
		// TODO Auto-generated method stub
		this.hambriento = valor;
	}	
}
