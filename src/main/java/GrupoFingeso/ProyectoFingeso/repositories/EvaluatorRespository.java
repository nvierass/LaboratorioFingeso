package GrupoFingeso.ProyectoFingeso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GrupoFingeso.ProyectoFingeso.models.Evaluator;

@Repository
public interface EvaluatorRespository extends MongoRepository<Evaluator, String>{
	
	public Evaluator findEvaluatorById(String id);
    //public Evaluator findEvaluatorByUsername(String username);
}
