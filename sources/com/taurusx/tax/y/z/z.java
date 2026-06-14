package com.taurusx.tax.y.z;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicInteger f67726c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AtomicInteger f67729y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f67730z = "EventCache";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ExecutorService f67728w = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.taurusx.tax.y.z.w.c f67727o = new com.taurusx.tax.y.z.w.c();

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f67731c;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f67732w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f67733y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f67734z;
    }

    public static class o {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f67735w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f67736z;
    }

    public static class s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f67737c;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f67738w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f67739y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f67740z;
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67741w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67743z;

        public w(String str, String str2) {
            this.f67743z = str;
            this.f67741w = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                z.this.f67727o.z(this.f67743z, this.f67741w);
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class y implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67745w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f67746y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67747z;

        public y(String str, String str2, String str3) {
            this.f67747z = str;
            this.f67745w = str2;
            this.f67746y = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                z.this.f67727o.z(this.f67747z, this.f67745w, this.f67746y);
                z.this.w("Cache Log Count: " + z.this.f67726c.incrementAndGet());
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.y.z.z$z, reason: collision with other inner class name */
    public class RunnableC0836z implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Runnable f67748w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67750z;

        public RunnableC0836z(String str, Runnable runnable) {
            this.f67750z = str;
            this.f67748w = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                z.this.w("cacheEvent: " + this.f67750z);
                z.this.f67727o.y(this.f67750z);
                z.this.w("Cache Event Count: " + z.this.f67729y.incrementAndGet());
                Runnable runnable = this.f67748w;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public synchronized void c(String str) {
        this.f67727o.z(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str) {
        Log.d("EventCache", str);
    }

    private void y(String str) {
        Log.e("EventCache", str);
    }

    public int w() {
        return this.f67726c.get();
    }

    public void z(Context context) {
        this.f67727o.z(context);
        this.f67729y = new AtomicInteger(this.f67727o.z());
        this.f67726c = new AtomicInteger(this.f67727o.w());
    }

    public synchronized List<s> w(int i10) {
        return this.f67727o.w(i10);
    }

    public synchronized void w(List<s> list) {
        try {
            try {
                w("removeCacheLog, size: " + list.size());
                w("removeCacheLog success, size: " + this.f67727o.w(list));
                for (int i10 = 0; i10 < list.size(); i10++) {
                    this.f67726c.decrementAndGet();
                }
                w("Cache Log Count: " + this.f67726c.get());
            } catch (Error e10) {
                e = e10;
                e.printStackTrace();
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int z() {
        return this.f67729y.get();
    }

    public synchronized List<o> z(int i10) {
        return this.f67727o.z(i10);
    }

    public void z(String str, Runnable runnable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f67728w.execute(new RunnableC0836z(str, runnable));
    }

    public synchronized void z(List<o> list) {
        try {
            try {
                w("removeCache, size: " + list.size());
                w("removeCache success, size: " + this.f67727o.z(list));
                for (int i10 = 0; i10 < list.size(); i10++) {
                    this.f67729y.decrementAndGet();
                }
                w("Cache Event Count: " + this.f67729y.get());
            } catch (Error e10) {
                e = e10;
                e.printStackTrace();
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void z(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f67728w.execute(new w(str, str2));
    }

    public synchronized List<c> z(String str) {
        return this.f67727o.w(str);
    }

    public void z(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        this.f67728w.execute(new y(str, str2, str3));
    }
}
