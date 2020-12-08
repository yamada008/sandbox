package jp.ac.o_hara.site.blog;

import jp.ac.o_hara.site.SimpleDAO;

public class BlogDAO extends SimpleDAO {
	private static BlogDAO dao = new BlogDAO();

	private BlogDAO() {
	} // privateにすることで、外部からアクセスできなくなる

	public static BlogDAO getInstance() { // staticメソッドでインスタンス（へのポインタ）を得る
		return dao;
	}
}
