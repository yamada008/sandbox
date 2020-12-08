package jp.ac.o_hara.site.blog;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BlogTestListener implements ServletContextListener {
	BlogDAO dao = null;
	
    public BlogTestListener() {
        dao = BlogDAO.getInstance();
    }

    @Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    	dao = null;
    }
}
