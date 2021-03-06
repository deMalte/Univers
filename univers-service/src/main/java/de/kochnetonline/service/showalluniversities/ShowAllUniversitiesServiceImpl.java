package de.kochnetonline.service.showalluniversities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.kochnetonline.model.entity.University;
import de.kochnetonline.repository.univers.UniversityRepository;

@Service
public class ShowAllUniversitiesServiceImpl implements ShowAllUniversitiesService {

	@Autowired
	private UniversityRepository universityRepository;
	
	@Override
	public List<University> getAllUniversities() {
		return universityRepository.getAllUniversities();
	}
}
