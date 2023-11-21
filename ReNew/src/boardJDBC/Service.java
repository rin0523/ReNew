package boardJDBC;

import java.util.List;

public interface Service {

	int write(BoardVO b);

	List<BoardVO> list();

	BoardVO detail(int bno);

	int modify(BoardVO b);

	int delete(int bno);

}
