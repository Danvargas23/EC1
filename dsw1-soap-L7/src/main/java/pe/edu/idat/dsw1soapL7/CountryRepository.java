package pe.edu.idat.dsw1soapL7;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import io.spring.guides.gs_producing_web_service.Country;
import jakarta.annotation.PostConstruct; 

@Component
public class CountryRepository {
         
    private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {

		Country Lunes = new Country();
		Lunes.setName("Monday");
		
		countries.put(Lunes.getName(), Lunes);

		Country Martes = new Country();
		Martes.setName("Tuesday");
		
		countries.put(Martes.getName(), Martes);

		Country Miercoles = new Country();
		Miercoles.setName("Wendsday");
		
		countries.put(Miercoles.getName(), Miercoles);

		Country Jueves = new Country();
		Jueves.setName("Thursday");
		
		countries.put(Jueves.getName(), Jueves);

		Country Viernes = new Country();
		Viernes.setName("Friday");
		
		countries.put(Viernes.getName(), Viernes);

		Country Sabado= new Country();
		Sabado.setName("Saturday");
		
		countries.put(Sabado.getName(), Sabado);

		Country Domingo= new Country();
		Domingo.setName("sunday");
		
		countries.put(Domingo.getName(), Domingo);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
