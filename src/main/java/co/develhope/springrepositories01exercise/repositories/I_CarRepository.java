package co.develhope.springrepositories01exercise.repositories;

import co.develhope.springrepositories01exercise.entites.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface I_CarRepository extends JpaRepository<Car, Long> {
}
