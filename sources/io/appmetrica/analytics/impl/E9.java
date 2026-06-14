package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes12.dex */
public final class E9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f75732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5089fa f75733b;

    public E9(Context context, String str) {
        this(new ReentrantLock(), new C5089fa(context, str));
    }

    public final void a() {
        this.f75732a.lock();
        this.f75733b.a();
    }

    public final void b() {
        this.f75733b.b();
        this.f75732a.unlock();
    }

    public final void c() {
        C5089fa c5089fa = this.f75733b;
        synchronized (c5089fa) {
            c5089fa.b();
            c5089fa.f77155a.delete();
        }
        this.f75732a.unlock();
    }

    public E9(ReentrantLock reentrantLock, C5089fa c5089fa) {
        this.f75732a = reentrantLock;
        this.f75733b = c5089fa;
    }
}
