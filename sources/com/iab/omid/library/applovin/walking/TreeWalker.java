package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0369a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f34310i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f34311j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f34312k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f34313l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f34314m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34316b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34322h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f34315a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34317c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f34318d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f34320f = new com.iab.omid.library.applovin.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f34319e = new com.iab.omid.library.applovin.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f34321g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f34321g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f34312k != null) {
                TreeWalker.f34312k.post(TreeWalker.f34313l);
                TreeWalker.f34312k.postDelayed(TreeWalker.f34314m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f34322h);
    }

    private void e() {
        this.f34316b = 0;
        this.f34318d.clear();
        this.f34317c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f34317c = true;
                break;
            }
        }
        this.f34322h = f.b();
    }

    public static TreeWalker getInstance() {
        return f34310i;
    }

    private void i() {
        if (f34312k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f34312k = handler;
            handler.post(f34313l);
            f34312k.postDelayed(f34314m, 200L);
        }
    }

    private void k() {
        Handler handler = f34312k;
        if (handler != null) {
            handler.removeCallbacks(f34314m);
            f34312k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34315a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f34315a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f34320f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f34319e.a();
        if (this.f34320f.b().size() > 0) {
            for (String str : this.f34320f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f34320f.a(str), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f34321g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f34320f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.f34321g.b(jSONObjectA2, treeWalker.f34320f.c(), jB);
            if (treeWalker.f34317c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f34318d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f34321g.b();
        }
        treeWalker.f34320f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f34315a.clear();
        f34311j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34315a.contains(treeWalkerTimeLogger)) {
            this.f34315a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f34315a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f34315a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f34316b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f34316b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f34320f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f34320f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f34320f.c(strC)));
        this.f34320f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0369a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f34320f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f34317c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f34318d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f34316b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a aVarB = this.f34319e.b();
        String strB = this.f34320f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0371a c0371aB = this.f34320f.b(view);
        if (c0371aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0371aB);
        return true;
    }
}
