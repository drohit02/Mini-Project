package Jpa.SpringJpaAssignment1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Jpa.SpringJpaAssignment1.entity.Runner;

@Repository
public interface RunnerRepository extends JpaRepository<Runner,Integer>{

	long countByCtCityId(int cityId);
	@Query(value= "SELECT runner_id,city_name,runner_name,city_id,distance FROM runner" ,nativeQuery = true)
	List<Runner> findAllRunner();
}