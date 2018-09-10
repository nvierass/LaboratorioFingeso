package GrupoFingeso.ProyectoFingeso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GrupoFingeso.ProyectoFingeso.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    public User findUserById(String id);
    //public User findUserByUsername(String username);
} 