package c0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final List a(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.first(list)) : CollectionsKt.emptyList();
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.emptyMap();
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.first(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
