package boardJDBC;

import java.util.List;

public interface DAO {

	int write(BoardVO b);

	List<BoardVO> list();

	BoardVO selectOne(int bno);

	int modify(BoardVO b);

	int delete(int bno);

}
