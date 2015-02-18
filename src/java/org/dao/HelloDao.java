package org.dao;

import java.util.List;
import org.entity.PrArticle;
import org.hibernate.Query;
import org.hibernate.Session;
import org.util.HibernateUtil;

public class HelloDao {
 
    public List<PrArticle> createTextList(){
        
        List<PrArticle> list = null;
        
        try {
            
            Session session = HibernateUtil.getSessionFactory().openSession();
                
            String hql = "from PrArticle";
            Query query = session.createQuery(hql);
            list = query.list();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }    
}

