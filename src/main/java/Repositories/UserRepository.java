package Repositories;

import GrupoFingeso.ProyectoFingeso.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long > {

    public User findUsuarioById(String id);
}
