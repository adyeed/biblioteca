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
 * Home object for domain model class Libros.
 * @see org.omicron.apps.orm.Libros
 * @author Hibernate Tools
 */
public class LibrosHome {

	private static final Log log = LogFactory.getLog(LibrosHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Libros transientInstance) {
		log.debug("persisting Libros instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Libros instance) {
		log.debug("attaching dirty Libros instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Libros instance) {
		log.debug("attaching clean Libros instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Libros persistentInstance) {
		log.debug("deleting Libros instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Libros merge(Libros detachedInstance) {
		log.debug("merging Libros instance");
		try {
			Libros result = (Libros) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Libros findById(java.lang.Integer id) {
		log.debug("getting Libros instance with id: " + id);
		try {
			Libros instance = (Libros) sessionFactory.getCurrentSession().get("org.omicron.apps.orm.Libros", id);
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

	public List<Libros> findByExample(Libros instance) {
		log.debug("finding Libros instance by example");
		try {
			List<Libros> results = (List<Libros>) sessionFactory.getCurrentSession()
				.createCriteria("org.omicron.apps.orm.Libros").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
