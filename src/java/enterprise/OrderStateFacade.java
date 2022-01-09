package enterprise;

import entity.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrderStateFacade extends AbstractFacade{

    @PersistenceContext(unitName = "BookStorePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	public	OrderStateFacade(){
		super(OrderState.class);
	}
}
