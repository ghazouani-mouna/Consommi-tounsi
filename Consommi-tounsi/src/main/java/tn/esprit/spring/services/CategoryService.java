package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Category;
import tn.esprit.spring.repository.CategoryRepository;
@Service
public class CategoryService implements ICategoryService {
@Autowired
CategoryRepository categoryRep;
	
	@Override
	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRep.save(category);
		return category.getId_category();
		
	}

	@Override
	public int updateCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRep.save(category);
		return category.getId_category();
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub	
		categoryRep.findById(id).orElse(null);
        categoryRep.deleteById(id);

	}
	
	

}
