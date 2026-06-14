package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f41605a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f41606b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41607c;

    enum a {
        NOT_READY,
        READY
    }

    public Q3(String str) {
        this.f41607c = str;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f41605a != a.READY) {
            this.f41606b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f41605a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f41605a = a.READY;
    }

    public synchronized void a() {
        try {
            Object[] array = this.f41606b.toArray();
            for (int i10 = 0; i10 < array.length; i10++) {
                ((Runnable) array[i10]).run();
                array[i10] = null;
            }
            this.f41606b.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
