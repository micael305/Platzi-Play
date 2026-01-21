package com.platzi.play;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

	@SpringBootApplication
	public class PlatziPlayApplication {

		public static void main(String[] args) {
			// CONFIGURAR LA HORA AQUÍ (Primera línea, antes de que arranque Spring)
			TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

			// Iniciar la aplicación
			SpringApplication.run(PlatziPlayApplication.class, args);
		}}
