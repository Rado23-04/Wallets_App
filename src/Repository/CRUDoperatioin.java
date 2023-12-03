package Repository;

import java.util.List;

public interface CRUDoperatioin<A> {
    List<A> findAll();
    A save (A save);
    A delete (A delete);
}
