package enterprise;

import entity.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BookDataFacade extends AbstractFacade{
 	/**********************************************
	* エンティティマネージャーをインジェクト
	**********************************************/
    @PersistenceContext(unitName = "BookStorePU")
    private EntityManager em;

 	/**********************************************
	* 抽象クラスのgetEntityManager()をオーバーライド
	* @return  エンティティマネージャー
	**********************************************/
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

 	/**********************************************
	* コンストラクター
	* スーパークラスBookDataのコンストラクターを呼び出す
	**********************************************/
	public BookDataFacade() {
		super(BookData.class);
	}
}

