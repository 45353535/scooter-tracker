package com.mbridge.msdk.thrid.okhttp.internal;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f51200a;

    public b(String str, Object... objArr) {
        this.f51200a = c.a(str, objArr);
    }

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f51200a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
