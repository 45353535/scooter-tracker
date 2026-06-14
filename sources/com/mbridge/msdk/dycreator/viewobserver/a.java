package com.mbridge.msdk.dycreator.viewobserver;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f48180a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f48181b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f48181b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f48181b.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public synchronized void a() {
        this.f48181b.clear();
    }
}
