package priv.glycerolveinz.gigcheck.service.basic;

public interface BasicService<Entity, ID> {
    Entity save(Entity entity);

    Entity findById(ID id);

    void deleteById(ID id);

    Iterable<Entity> findAll();
}
