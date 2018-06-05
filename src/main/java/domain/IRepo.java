package domain;

import java.util.List;

public interface IRepo<T> {
	List<T> findAll();

	T findBy(int id);

	void save(T t);

	void update(T t);
}
