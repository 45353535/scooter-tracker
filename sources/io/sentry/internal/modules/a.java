package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f83633e;

    public a(List list, ILogger iLogger) {
        super(iLogger);
        this.f83633e = list;
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        Iterator it = this.f83633e.iterator();
        while (it.hasNext()) {
            Map mapA = ((b) it.next()).a();
            if (mapA != null) {
                treeMap.putAll(mapA);
            }
        }
        return treeMap;
    }
}
