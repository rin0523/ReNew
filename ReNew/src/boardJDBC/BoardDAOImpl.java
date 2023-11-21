package boardJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements DAO {

	// DB 연결
	private Connection conn;
	private PreparedStatement pst; // 쿼리구문 가져와서 실행시키는 기능
	private String query;
	private ResultSet rs;

	public BoardDAOImpl() {
		// 데이터베이스 정보 객체 생성
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public int write(BoardVO b) {
		// db와 직접 연결
		System.out.println("write DAO success!!");
		query = "insert into board(title,writer,content) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getWriter());
			pst.setString(3, b.getContent());
			return pst.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<BoardVO> list() {

		System.out.println("list DAO success!!");
		query = "select*from Board order by bno desc";
		List<BoardVO> list = new ArrayList<BoardVO>();

		/* bno,title,writer,moddate */

		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int bno = rs.getInt("bno");
				list.add(new BoardVO(bno, rs.getString("title"), rs.getString("writer"), rs.getString("moddate")));
			}
			return list;

		} catch (SQLException e) {
			System.out.println("list error");
			e.printStackTrace();
		}

		return null;
	}
	
	

	@Override
	public BoardVO selectOne(int bno) {
		System.out.println("detail DAO success!!");
		query = "select*from board where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return new BoardVO(rs.getInt("bno"), rs.getString("title"), rs.getString("writer"),
						rs.getString("content"), rs.getString("regdate"), rs.getString("moddate"));
			}

		} catch (SQLException e) {
			System.out.println("detail error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int modify(BoardVO b) {
		System.out.println("modify DAO success !! ");
		query = "update board set title=?, content=? where bno=? ";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getContent());
			pst.setInt(3, b.getBno());
			return pst.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int bno) {
		System.out.println("delete dao success!!");
		query = "delete from board where bno=? ";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			return pst.executeUpdate();

		} catch (SQLException e) {
			System.out.println("delete error");
			e.printStackTrace();
		}
		return 0;
	}

}
