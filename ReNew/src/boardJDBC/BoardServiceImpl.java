package boardJDBC;

import java.util.List;

public class BoardServiceImpl implements Service {

	private DAO dao;

	public BoardServiceImpl() {
		dao = new BoardDAOImpl();
	}

	@Override
	public int write(BoardVO b) {
		// TODO Auto-generated method stub
		System.out.println("write_service successs!!");
		return dao.write(b);
	}

	@Override
	public List<BoardVO> list() {
		// TODO Auto-generated method stub
		System.out.println("list_service success!!");
		return dao.list();
	}

	@Override
	public BoardVO detail(int bno) {
		System.out.println("detail_service success!!");
		return dao.selectOne(bno);
	}

	@Override
	public int modify(BoardVO b) {
		System.out.println("modify_service success!! ");
		return dao.modify(b);
	}

	@Override
	public int delete(int bno) {
		System.out.println("delete_service success!! ");
		return dao.delete(bno);
	}
	
	
	
	

}
