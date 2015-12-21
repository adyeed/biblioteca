package org.omicron.apps.orm;
// Generated 20/12/2015 11:39:27 PM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Prestamos.
 * @see org.omicron.apps.orm.Prestamos
 * @author Hibernate Tools
 */
public class PrestamosHome {

	private static final Log log = LogFactory.getLog(PrestamosHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Prestamos transientInstance) {
		log.debug("persisting Prestamos instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Prestamos instance) {
		log.debug("attaching dirty Prestamos instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Prestamos instance) {
		log.debug("attaching clean Prestamos instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Prestamos persistentInstance) {
		log.debug("deleting Prestamos instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Prestamos merge(Prestamos detachedInstance) {
		log.debug("merging Prestamos instance");
		try {
			Prestamos result = (Prestamos) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Prestamos findById(org.omicron.apps.orm.PrestamosId id) {
		log.debug("getting Prestamos instance with id: " + id);
		try {
			Prestamos instance =
				(Prestamos) sessionFactory.getCurrentSession().get("org.omicron.apps.orm.Prestamos", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Prestamos> findByExample(Prestamos instance) {
		log.debug("finding Prestamos instance by example");
		try {
			List<Prestamos> results = (List<Prestamos>) sessionFactory.getCurrentSession()
				.createCriteria("org.omicron.apps.orm.Prestamos").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
