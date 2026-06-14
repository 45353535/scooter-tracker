package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Long, a> f15858a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> f15859b = new HashMap();

    a() {
    }

    static a a(long j10) {
        a aVar;
        Map<Long, a> map = f15858a;
        synchronized (map) {
            try {
                aVar = map.get(Long.valueOf(j10));
                if (aVar == null) {
                    aVar = new a();
                    map.put(Long.valueOf(j10), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.f15859b) {
            try {
                aVar = this.f15859b.get(str);
                if (aVar == null) {
                    aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                    this.f15859b.put(str, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.f15859b) {
            arrayList = new ArrayList(this.f15859b.values());
        }
        return arrayList;
    }
}
