package br.com.monster.portal.modelDao;

import java.util.List;

import br.com.monster.portal.model.Mailing;

public interface MailingDao {
	
	List< Mailing> Read();
	List< Mailing> Read_History();
	List< Mailing> Select_Name_Id();
	 Mailing Find_One(Long id);
	
	void create( Mailing mailing);
	void update( Mailing mailing);
	void delete(Long id);
	void restore(Long id);
	
}