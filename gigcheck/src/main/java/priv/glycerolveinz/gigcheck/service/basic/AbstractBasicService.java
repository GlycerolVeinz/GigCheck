package priv.glycerolveinz.gigcheck.service.basic;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractBasicService<Entity, ID> implements BasicService<Entity , ID>{
    protected abstract JpaRepository<Entity, ID> getRepository();

    @Override
    public Entity save(Entity entity) {
        if (entity == null) {
            throw new RuntimeException("Tried to safe null entity");
        }
        return getRepository().save(entity);
    }

    @Override
    public Entity findById(ID id) {
        if (id == null) {
            throw new RuntimeException("Tried to find entity with null id");
        }

        return getRepository()
                .findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Entity with id: " + id + " not found"));
    }

    @Override
    public void deleteById(ID id) {
        if (id == null) {
            throw new RuntimeException("Tried to delete entity with null id");
        }

        getRepository().deleteById(id);
    }

    @Override
    public Iterable<Entity> findAll() {
        return getRepository().findAll();
    }
}
