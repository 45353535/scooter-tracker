package com.my.target;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class u9 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u9 f60904d = new u9(1000);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Handler f60905e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f60907b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f60908c = new Runnable() { // from class: k5.m2
        @Override // java.lang.Runnable
        public final void run() {
            this.f86088b.b();
        }
    };

    public u9(int i10) {
        this.f60906a = i10;
    }

    public static u9 a(int i10) {
        return new u9(i10);
    }

    public void b(Runnable runnable) {
        synchronized (this) {
            try {
                this.f60907b.remove(runnable);
                if (this.f60907b.size() == 0) {
                    f60905e.removeCallbacks(this.f60908c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f60907b.clear();
        f60905e.removeCallbacks(this.f60908c);
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            try {
                int size = this.f60907b.size();
                if (this.f60907b.put(runnable, Boolean.TRUE) == null && size == 0) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList(this.f60907b.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj).run();
                }
                if (this.f60907b.keySet().size() > 0) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        f60905e.postDelayed(this.f60908c, this.f60906a);
    }
}
