package a3;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f3774a = new ConcurrentHashMap();

    public final List a(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3774a.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((a) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public final void b(String appId, List gateKeeperList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = gateKeeperList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            concurrentHashMap.put(aVar.a(), aVar);
        }
        this.f3774a.put(appId, concurrentHashMap);
    }
}
