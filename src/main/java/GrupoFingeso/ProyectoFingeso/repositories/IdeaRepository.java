package GrupoFingeso.ProyectoFingeso.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GrupoFingeso.ProyectoFingeso.models.Idea;

@Repository
public interface IdeaRepository extends MongoRepository<Idea, String> {
	
    public Idea findIdeaById(String id);
    //public List<Idea> findIdeasChallenge(String challenge);
}

