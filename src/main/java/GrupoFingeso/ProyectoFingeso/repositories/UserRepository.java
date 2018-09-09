package GrupoFingeso.ProyectoFingeso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GrupoFingeso.ProyectoFingeso.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long > {

    public User findUsuarioById(String id);
}
