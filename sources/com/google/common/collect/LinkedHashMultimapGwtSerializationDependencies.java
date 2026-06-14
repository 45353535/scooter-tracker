package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
abstract class LinkedHashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    LinkedHashMultimapGwtSerializationDependencies(Map map) {
        super(map);
    }
}
