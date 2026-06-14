package com.my.target;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f59609a = Executors.newFixedThreadPool(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f59610b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f59611c = Executors.newFixedThreadPool(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f59612d = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f59613e = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f59614f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f59615g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f59616h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f59617i = new AtomicBoolean();

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f0.f59615g.post(runnable);
        }
    }

    public static void a(Runnable runnable) {
        AtomicBoolean atomicBoolean = f59617i;
        if (!atomicBoolean.get()) {
            List list = f59614f;
            synchronized (list) {
                try {
                    if (!atomicBoolean.get()) {
                        list.add(runnable);
                        gb.b("AsyncCommand", "Can't use onAdLoadExecutor - sdk initialize not finished");
                        return;
                    }
                } finally {
                }
            }
        }
        f59611c.execute(runnable);
    }

    public static void b(Runnable runnable) {
        f59610b.execute(runnable);
    }

    public static void c(Runnable runnable) {
        f59609a.execute(runnable);
    }

    public static void d(Runnable runnable) {
        f59613e.execute(runnable);
    }

    public static void e(Runnable runnable) {
        f59612d.execute(runnable);
    }

    public static void f(Runnable runnable) {
        f59616h.execute(runnable);
    }

    public static void b() {
        List list = f59614f;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f59611c.execute((Runnable) it.next());
                }
                f59614f.clear();
                f59617i.set(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(Runnable runnable, int i10) {
        f59615g.postDelayed(runnable, i10);
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
