# Taller Persistencia

## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back


### . Prueba de Integridad
Al intentar eliminar un DirectorEntity que tiene películas asociadas sin configurar cascada, la base de datos H2 muestra un error de violación de integridad referencial. Esto sucede porque todavía existen películas que tienen una referencia al director a través de una clave foránea (director_id), por lo que la base de datos no permite eliminarlo.

Esto es importante porque evita que queden películas apuntando a un director que ya no existe, lo que generaría inconsistencias en la base de datos. Si se permitiera eliminar el director usando cascada, se podrían borrar películas automáticamente sin intención, perdiendo información relevante del sistema.

Por esta razón, no se utiliza cascada en la relación entre DirectorEntity y MovieEntity, ya que así se garantiza que un director solo pueda eliminarse cuando no tenga películas asociadas, manteniendo la integridad referencial del modelo.
