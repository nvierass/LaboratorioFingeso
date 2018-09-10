package GrupoFingeso.ProyectoFingeso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GrupoFingeso.ProyectoFingeso.models.Challenge;

@Repository
public interface ChallengeRepository  extends MongoRepository<Challenge, String>{

	public Challenge findChallengeById(String id);
    //public Challenge findChallengeByTopic(String topic);
}
