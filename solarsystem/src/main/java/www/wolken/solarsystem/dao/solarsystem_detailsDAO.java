package www.wolken.solarsystem.dao;

import www.wolken.solarsystem.entity.solarsystem_detailss;

public interface solarsystem_detailsDAO {
	boolean save(solarsystem_detailss entity);

	boolean getById(int id);

	boolean updateById(solarsystem_detailss entity);

	boolean deleteById(solarsystem_detailss entity);

}
