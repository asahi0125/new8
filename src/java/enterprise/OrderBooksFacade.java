package enterprise;

import entity.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrderBooksFacade extends AbstractFacade{

    @PersistenceContext(unitName = "BookStorePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
    public OrderBooksFacade(){
        super(OrderBooks.class);
    }
}
