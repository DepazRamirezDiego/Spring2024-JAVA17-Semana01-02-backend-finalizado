package com.empresa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "deporte")
@Getter
@Setter
public class Deporte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDeporte;
	//Anotación: Si es que el atributo es diferente al de la tabla - Ejemplo
	//private String nom_bre
	//Debes de agregar esto: @column (name = "nombre") para hacer referencia al nombre de la columna de la base de datos 
	private String nombre;
	
	
}
