package com.company.test.test.test.ybl.generated;

import com.company.test.test.test.ybl.Ybl;
import com.company.test.test.test.ybl.YblManager;
import com.speedment.component.ProjectComponent;
import com.speedment.config.db.Table;
import com.speedment.enterprise.offheapreadonlycache.manager.HasSerializer;
import com.speedment.internal.core.manager.sql.SqlManager;
import com.speedment.util.tuple.Tuple1;
import javax.annotation.Generated;
import org.mapdb.Serializer;

/**
 * The generated base manager representing an entity (for example, a row) in
 * the Table test.test.test.ybl.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public interface GeneratedYblManager extends HasSerializer<Ybl>, SqlManager<Ybl> {
    
    @Override
    default Serializer<Ybl> newSerializer() {
        return new GeneratedYblSerializerImpl(this);
    }
    
    @Override
    default Integer primaryKeyFor(Ybl entity) {
        return entity.getId();
    }
    
    @Override
    default Table getTable() {
        return speedment().get(ProjectComponent.class).getProject().findTableByName("test.test.ybl");
    }
    
    @Override
    default Class<YblManager> getManagerClass() {
        return YblManager.class;
    }
    
    @Override
    default Class<Ybl> getEntityClass() {
        return Ybl.class;
    }
    
    @Override
    Tuple1<Class<Integer>> getPrimaryKeyClasses();
}