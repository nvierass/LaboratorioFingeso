package Repositories;

import GrupoFingeso.ProyectoFingeso.Models.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends MongoRepository<Idea,Long> {
	
    public Idea findIdeaById(int id);
}

