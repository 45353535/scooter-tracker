package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class s4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f10400i = new Executor() { // from class: com.applovin.impl.de
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f10401j = new androidx.media3.exoplayer.hls.offline.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10403b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Object f10408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f10409h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10402a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f10404c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f10405d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f10406e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f10407f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public s4(String str) {
        this.f10403b = str;
    }

    public static s4 a(String str, Object obj) {
        return new s4(str).b(obj);
    }

    public String toString() {
        String str;
        if (!this.f10405d) {
            str = "Waiting";
        } else if (this.f10406e) {
            str = "Success -> " + this.f10408g;
        } else {
            str = "Failed -> " + this.f10409h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public s4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public s4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public s4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.f10405d;
    }

    public boolean e() {
        return this.f10405d && !this.f10406e;
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.ce
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                s4.a(runnable, z10, obj, obj2);
            }
        });
    }

    public Object b() {
        l1.a(e());
        return this.f10409h;
    }

    public String c() {
        String str = this.f10403b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.be
            @Override // java.lang.Runnable
            public final void run() {
                this.f8465b.b(executor, bVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.ae
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8377b.a(bVar);
                }
            });
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.zd
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                s4.a(aVar, z10, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z10, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f10402a) {
            try {
                if (!this.f10405d) {
                    this.f10404c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        return this.f10405d && this.f10407f;
    }

    private void a(boolean z10, Object obj, Object obj2, boolean z11) {
        synchronized (this.f10402a) {
            try {
                if (this.f10405d) {
                    return;
                }
                this.f10408g = obj;
                this.f10409h = obj2;
                this.f10406e = z10;
                this.f10407f = z11;
                this.f10405d = true;
                Iterator it = this.f10404c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f10404c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f10406e, this.f10408g, this.f10409h);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    private void a(Throwable th2) {
        l1.a(th2);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("Promise", "PromiseCallback: " + c(), th2);
        }
    }
}
