package ru.javavision.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.javavision.model.Engine;

/**
 * Author : Pavel Ravvich.
 * Created : 26/11/2017.
 */
public class EngineDAO implements DAO<Engine, String> {

    /**
     * Connection factory to database.
     */
    private final SessionFactory factory;

    public EngineDAO(final SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * Create new engine in engines table.
     *
     * @param engine for add.
     */
    @Override
    public void create(final Engine engine) {
        try (final Session session = factory.openSession()) {

            session.beginTransaction();

            session.save(engine);

            session.getTransaction().commit();
        }
    }

    /**
     * Get engine by model.
     *
     * @param model for select.
     * @return engine with param model.
     */
    @Override
    public Engine read(final String model) {
        try (final Session session = factory.openSession()) {

            final Engine result = session.get(Engine.class, model);

            return result != null ? result : new Engine();
        }
    }

    /**
     * Update engine state.
     *
     * @param engine new state.
     */
    @Override
    public void update(final Engine engine) {
        try (Session session = factory.openSession()) {

            session.beginTransaction();

            session.update(engine);

            session.getTransaction().commit();
        }
    }

    /**
     * Delete engine.
     *
     * @param engine for delete.
     */
    @Override
    public void delete(final Engine engine) {
        try (Session session = factory.openSession()) {

            session.beginTransaction();

            session.delete(engine);

            session.getTransaction().commit();
        }
    }
}
