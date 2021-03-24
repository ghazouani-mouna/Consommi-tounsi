package tn.esprit.spring.services;

import tn.esprit.spring.entity.Category;

public interface ICategoryService {
	public int addCategory(Category category);  //by admin
	public int updateCategory(Category category);  //by admin
    public void deleteCategory( int id); //by admin


}
