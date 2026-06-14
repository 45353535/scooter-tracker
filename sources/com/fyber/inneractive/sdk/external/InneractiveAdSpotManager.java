package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.h0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class InneractiveAdSpotManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f20581a = new ConcurrentHashMap();

    public static void destroy() {
        ConcurrentHashMap concurrentHashMap = get().f20581a;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) concurrentHashMap.get((String) it.next());
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        concurrentHashMap.clear();
    }

    public static InneractiveAdSpotManager get() {
        return e.f20607a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f20581a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        h0 h0Var = new h0();
        this.f20581a.put(h0Var.f20737a, h0Var);
        return h0Var;
    }

    public InneractiveAdSpot getSpot(String str) {
        return (InneractiveAdSpot) this.f20581a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        ConcurrentHashMap concurrentHashMap = this.f20581a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
