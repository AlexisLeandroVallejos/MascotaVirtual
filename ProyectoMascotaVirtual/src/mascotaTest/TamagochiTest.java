package mascotaTest;

import org.junit.Assert;
import org.junit.Test;

import mascota.*;

public class TamagochiTest {
	/*@Test
	public void comer_tamagochiSePoneContentoAlComer()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.Comer();
		Assert.assertEquals("Tamagochi no pudo comer", true, pet.isContento());
	}*/
	

	@Test
	public void comer_tamagochiPuedeComer()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.Comer();
	}

	@Test
	public void jugar_tamagochiPuedeJugar()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.Jugar();
	}
	

	@Test
	public void juega_TamagochiJuegayTieneNivelDeContentes2()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.Jugar();
		
		Assert.assertEquals("No aumento su nivel de felicidad", true, pet.getContento() == 2);
	}
	
	@Test
	public void puedeJugar_tamagochiPuedeJugar()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.setHambrienta(true);
		pet.Comer();
		
		Assert.assertEquals("No puede jugar", true, pet.puedeJugar());
	}
	
	@Test
	public void comer_tamagochiComeYSuFelicidadAumentaEnUno()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.setHambrienta(true);
		pet.Comer();
		
		Assert.assertEquals("No aumento la felicidad en 1", 1, pet.getContento());
	}

	@Test
	public void come_TamagochiEstaHambrientaYCome()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.setHambrienta(true);
		pet.Comer();
		Assert.assertEquals("No se puso contenta", false, pet.estaHambrienta());
	}
	

	@Test
	public void juega_TamagochiJuega5VecesYSePoneHambrienta()
	{
		
		Tamagochi pet = new Tamagochi();
		for(int i = 0; i < 5 ; i++)
		{
			pet.Jugar();	
		}
		Assert.assertEquals("No Esta Hambrienta", false, pet.estaHambrienta());
	}

	@Test
	public void juega_TamagochiJuegaYSubeSuContentes()
	{
		
		Tamagochi pet = new Tamagochi();
		pet.Jugar();
		Assert.assertEquals("No aumento su nivel de felicidad", true, pet.getContento() == 2);
	}
/*
	@Test
	public void pagar_PagaViajeDe90ConSaldo50()
	{
		Sube tarjeta = new Sube(new Persona());
		tarjeta.recargar(50);
		Servicio viaje = new Servicio();
		viaje.setCosto(90);
		tarjeta.pagar(viaje);
		Assert.assertEquals("No se pudo pagar 90 con la tarjeta con 50",-40.0, tarjeta.getSaldo(), 0);
	}
	


	@Test
	public void pagar_PagaViajeDe89p90CConSaldo50()
	{
		Sube tarjeta = new Sube(new Persona());
		tarjeta.recargar(50.60);
		Servicio viaje = new Servicio();
		viaje.setCosto(90.5);
		tarjeta.pagar(viaje);
		Assert.assertEquals("No se pudo pagar 90 con la tarjeta con 50",-39.90, tarjeta.getSaldo(), 0);

	}
	

	@Test(expected=ExceptionSaldoInsuficiente.class)
	public void pagar_PagaViajeDe90P20CConSaldo50P30C()
	{
		Sube tarjeta = new Sube(new Persona());
		tarjeta.recargar(50.30);
		Servicio viaje = new Servicio();
		viaje.setCosto(90.5);
		tarjeta.pagar(viaje);
		
	}
	
	@Test(expected=ExceptionSaldoInsuficiente.class)
	public void pagar_NoPuedoPagarViajeDe1000ConSaldo0()
	{
		
		Sube tarjeta = new Sube(new Persona());
		tarjeta.recargar(0);
		Lugar cosa = new Lugar();
		cosa.setCosto(1000);
		tarjeta.pagar(cosa);
	}*/
}
