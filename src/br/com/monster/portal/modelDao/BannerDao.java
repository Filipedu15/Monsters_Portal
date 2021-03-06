package br.com.monster.portal.modelDao;

import java.util.List;

import br.com.monster.portal.model.Banner;

public interface BannerDao {
	
	List<Banner> Read();
	List<Banner> Read_publico();
	List<Banner> Read_History();
	List<Banner> Select_Name_Id();
	Banner Find_One(Long id);
	
	void create(Banner banner);
	void update(Banner banner);
	void delete(Long id);
	void restore(Long id);

}