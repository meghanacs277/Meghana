package jdbc;

public interface marketABDAO {
	boolean save(matketeEnDTO dto);
	void getAll();
    boolean updateByLocation(matketeEnDTO dto);
    boolean getByLocation(matketeEnDTO dto);
    boolean deleteById(matketeEnDTO dto);

}
