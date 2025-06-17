package com.ejemplo.loginapp.repository;

import com.ejemplo.loginapp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 Optional<Usuario> findByEmail(String email);
}
/*
 * ¿Qué significa que sea un tipo interface
 * - Una clase que la implementa se compromete a definir esos métodos
 * 
 * - JpaRepository<Usuario, Long>: estás heredando una interfaz que ya viene con
 * métodos listos para usar como save(), findById(), deleteById(), findAll(),
 * etc.
 * 
 * - Usuario → es la entidad sobre la que opera el repositorio (está mapeada a
 * tu tabla en la base de datos).
 * 
 * - Long → es el tipo de dato del campo @Id (clave primaria) de Usuario.
 * Spring Boot detecta esta interfaz al arrancar y genera automáticamente la
 * lógica para acceder a tu base de datos.
 * 
 * 
 * --Optional-- en Java es un contenedor que puede tener un valor... o estar
 * vacío.
 * Sirve para evitar errores de null cuando accedes a algo que tal vez no
 * existe.
 * 
 * METODOS MAS COMUNES:
 * ---isPresent()=>Devuelve "true" si hay un valor
 * ---isEmpty()=>Devuelve "true" si esta vacio
 * ---get()=>Devuelve el valor si existe.Lanza una exception si esta vacio.
 * 
 * 
 * 
 * Con esto creamos un optional que garantiza que no es
 * nulo:Optional.of()
 * EJEM:Optional<String> nombre = Optional.of("Patrick");
 * 
 */