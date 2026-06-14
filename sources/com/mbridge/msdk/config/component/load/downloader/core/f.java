package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, d<T>> f46992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d<T>>> f46993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f46994c;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f46995a = new f();
    }

    public static f a() {
        return b.f46995a;
    }

    private int b() {
        return this.f46994c.incrementAndGet();
    }

    public void c() {
    }

    private f() {
        this.f46992a = new ConcurrentHashMap<>();
        this.f46994c = new AtomicInteger();
        this.f46993b = new ConcurrentHashMap<>();
    }

    public synchronized void a(d<T> dVar) {
        try {
            String strF = dVar.f();
            dVar.a(b());
            if (this.f46992a.containsKey(strF)) {
                com.mbridge.msdk.config.component.load.downloader.e eVarJ = dVar.j();
                com.mbridge.msdk.config.component.load.downloader.e eVar = com.mbridge.msdk.config.component.load.downloader.e.RETRY;
                if (eVarJ != eVar) {
                    eVar = com.mbridge.msdk.config.component.load.downloader.e.DELAY;
                }
                dVar.a(eVar);
                if (this.f46993b.containsKey(strF)) {
                    CopyOnWriteArrayList<d<T>> copyOnWriteArrayList = this.f46993b.get(strF);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(dVar);
                        this.f46993b.remove(strF);
                        this.f46993b.put(strF, copyOnWriteArrayList);
                    }
                } else {
                    CopyOnWriteArrayList<d<T>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(dVar);
                    this.f46993b.put(strF, copyOnWriteArrayList2);
                }
            } else {
                com.mbridge.msdk.config.component.load.downloader.e eVarJ2 = dVar.j();
                com.mbridge.msdk.config.component.load.downloader.e eVar2 = com.mbridge.msdk.config.component.load.downloader.e.RETRY;
                if (eVarJ2 != eVar2) {
                    eVar2 = com.mbridge.msdk.config.component.load.downloader.e.QUEUED;
                }
                dVar.a(eVar2);
                this.f46992a.put(strF, dVar);
                dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d<T>> copyOnWriteArrayListRemove;
        String strF = dVar.f();
        this.f46992a.remove(strF);
        if (this.f46993b.containsKey(strF) && (copyOnWriteArrayListRemove = this.f46993b.remove(strF)) != null && copyOnWriteArrayListRemove.size() > 0) {
            d<T> dVarRemove = copyOnWriteArrayListRemove.remove(0);
            dVarRemove.a(com.mbridge.msdk.config.component.load.downloader.e.QUEUED);
            this.f46992a.put(strF, dVarRemove);
            dVarRemove.a(i.b().a().getDownloadTasks().submit(new h(dVarRemove)));
            if (copyOnWriteArrayListRemove.size() > 0) {
                this.f46993b.put(strF, copyOnWriteArrayListRemove);
            }
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d<T>> copyOnWriteArrayList;
        try {
            if (!TextUtils.isEmpty(str) && this.f46993b.containsKey(str) && (copyOnWriteArrayList = this.f46993b.get(str)) != null && copyOnWriteArrayList.size() > 0) {
                for (d<T> dVar : copyOnWriteArrayList) {
                    copyOnWriteArrayList.remove(dVar);
                    dVar.b(dVar.d());
                }
                if (copyOnWriteArrayList.size() > 0) {
                    this.f46993b.remove(str);
                    this.f46993b.put(str, copyOnWriteArrayList);
                } else {
                    this.f46993b.remove(str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                a(this.f46992a.get(str), str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.d());
            this.f46992a.remove(str);
        }
    }
}
