package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.cardText;
import dmacc.beans.cardType;
import dmacc.controller.beanConfiguration;
import dmacc.repository.CardRepository;

@SpringBootApplication
public class CardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardApplication.class, args);
		
	}
	
	@Autowired
	CardRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(beanConfiguration.class);
		
		cardType c = appContext.getBean("card", cardType.class);
		c.setType("Sorcery");
		repo.save(c);

		cardType d = new cardType("Giant Growth", "Green", "Instant");
		cardText ct = new cardText(0, 0, "+3/+3 to Target Creature");
		d.setCardText(ct);
		repo.save(d);
		
		List<cardType> allMyCards = repo.findAll();
		for(cardType cards: allMyCards) {
			System.out.println(cards.toString());
		}

		((AbstractApplicationContext) appContext).close();
	
	}

}