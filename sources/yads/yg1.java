package yads;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yg1 {
    public static LinkedHashMap a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), new WeakReference(entry2.getValue()));
        }
        return linkedHashMap2;
    }
}
