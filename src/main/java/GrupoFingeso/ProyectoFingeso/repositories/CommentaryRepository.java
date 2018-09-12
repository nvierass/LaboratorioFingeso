package GrupoFingeso.ProyectoFingeso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GrupoFingeso.ProyectoFingeso.models.Commentary;

@Repository
public interface CommentaryRepository extends MongoRepository<Commentary, String>{
	
	public Commentary findCommentaryById(String id);
	public Commentary findCommentaryByOwner(String owner);
}
