package GrupoFingeso.ProyectoFingeso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GrupoFingeso.ProyectoFingeso.models.Idea;

@Repository
public interface IdeaRepository extends MongoRepository<Idea, Long> {
	
    public Idea findIdeaById(int id);
}

