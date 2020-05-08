package com.example.perhe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.perhe.domain.*;


@SpringBootApplication
public class PerheApplication {
	private static final Logger Log = LoggerFactory.getLogger(PerheApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PerheApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookstoreDemo(PerheRepository perherepository) {
		return (args) -> {
			
			Log.info("save events");
			
			perherepository.save(new Perhe("Kiia", "opiskelija", "dnd"));
			Log.info("gimme dem families");
			for (Perhe perhe : perherepository.findAll()) {
				Log.info(perhe.toString());
			}
		};
	}

}
