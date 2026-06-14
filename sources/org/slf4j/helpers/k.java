package org.slf4j.helpers;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class k implements yh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile boolean f97924a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f97925b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final LinkedBlockingQueue f97926c = new LinkedBlockingQueue();

    @Override // yh.a
    public synchronized yh.d a(String str) {
        j jVar;
        jVar = (j) this.f97925b.get(str);
        if (jVar == null) {
            jVar = new j(str, this.f97926c, this.f97924a);
            this.f97925b.put(str, jVar);
        }
        return jVar;
    }

    public void b() {
        this.f97925b.clear();
        this.f97926c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f97926c;
    }

    public List d() {
        return new ArrayList(this.f97925b.values());
    }

    public void e() {
        this.f97924a = true;
    }
}
