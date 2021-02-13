package com.zdp.study.build.abstractfactory.factory;

import com.zdp.study.build.abstractfactory.factory.impl.ElfKingdomFactory;
import com.zdp.study.build.abstractfactory.factory.impl.OrcKingdomFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author zdp
 * @date 2021/2/14 00:03
 * @desc 王国工厂的创建类
 */
public class KingdomFactoryMarker {
    public static final String ORC_FACTORY = "orcFactory";
    public static final String ELF_FACTORY = "elfFactory";

    public static final Map<String, Supplier<KingdomFactory>> factorySupplierMap = new HashMap<String, Supplier<KingdomFactory>>(){
        {
            put(ELF_FACTORY,() -> new ElfKingdomFactory());
            put(ORC_FACTORY,() -> new OrcKingdomFactory());
        }
    };

    public static KingdomFactory makeFactory(String type){
        if (factorySupplierMap.containsKey(type)){
            return factorySupplierMap.get(type).get();
        }

        throw new IllegalArgumentException("not support type");
    }
}
