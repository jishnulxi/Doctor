package com.bytatech.ayoos.repository;

import com.bytatech.ayoos.domain.UserRating;
import com.bytatech.ayoos.service.dto.UserRatingDTO;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the UserRating entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UserRatingRepository extends JpaRepository<UserRating, Long> {

	/**
	 * @param doctorId
	 * @return 
	 */
	List<UserRating> findByDoctorId(Long doctorId);

}
