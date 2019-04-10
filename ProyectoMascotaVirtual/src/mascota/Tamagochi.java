package mascota;

public class Tamagochi {

	private boolean contento;
	
	private boolean hambriento;
	
	private boolean aburrido;
	
	public Tamagochi()
	{
		setContento(false);
		hambriento = false;
	}
	
	public void Comer() 
	{
		if(hambriento)
		{
			setContento(true);
		}
	}

	public void Jugar() throws RuntimeException
	{
		if(puedeJugar())
		{
			
		}
	}
	
	public boolean puedeJugar() {
		// TODO Auto-generated method stub (aburrido || contento) && !hambriento)
		return false;
	}

	public boolean isContento() {
		return contento;
	}

	public void setContento(boolean contento) {
		this.contento = contento;
	}

	public boolean isAburrido() {
		return aburrido;
	}

	public void setAburrido(boolean aburrido) {
		this.aburrido = aburrido;
	}
	
}
