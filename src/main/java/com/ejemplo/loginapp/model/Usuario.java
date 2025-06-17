package com.ejemplo.loginapp.model;

/* 
 Estás activando la magia del mapeo objeto-relacional (ORM) en Java. Es decir, le estás diciendo a tu aplicación que ciertas clases y atributos van a reflejarse directamente en una base de datos como tablas y columnas.
*/
import jakarta.persistence.*;

/*
@Entity
Le dice a Hibernate (o cualquier proveedor JPA):
      “Esta clase va a ser una tabla en la base de datos”.

@Id
Marca qué atributo será la clave primaria de esa tabla.

@GeneratedValue
Define cómo se genera automáticamente ese ID. Por ejemplo, IDENTITY hace que el valor se auto-incremente como en MySQL.

@Column
Te permite personalizar el nombre, tipo, longitud u otras propiedades de una columna. 
         Ejemplo:
         @Column(name = "correo", length = 100)

@Table
Puedes usarla si quieres asignar un nombre personalizado a la tabla. Por defecto, Spring le pone el nombre de la clase en minúsculas.
*/

@Entity
public class Usuario {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String email;
 private String password;

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }
}