package com.iab.omid.library.amazon.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.amazon.processor.a;
import com.iab.omid.library.amazon.utils.f;
import com.iab.omid.library.amazon.utils.h;
import com.iab.omid.library.amazon.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0365a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f34176i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f34177j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f34178k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f34179l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f34180m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34182b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34188h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f34181a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34183c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.amazon.weakreference.a> f34184d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.amazon.walking.a f34186f = new com.iab.omid.library.amazon.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.amazon.processor.b f34185e = new com.iab.omid.library.amazon.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.amazon.walking.b f34187g = new com.iab.omid.library.amazon.walking.b(new com.iab.omid.library.amazon.walking.async.c());

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
            TreeWalker.this.f34187g.b();
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
            if (TreeWalker.f34178k != null) {
                TreeWalker.f34178k.post(TreeWalker.f34179l);
                TreeWalker.f34178k.postDelayed(TreeWalker.f34180m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f34188h);
    }

    private void e() {
        this.f34182b = 0;
        this.f34184d.clear();
        this.f34183c = false;
        Iterator<com.iab.omid.library.amazon.adsession.a> it = com.iab.omid.library.amazon.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f34183c = true;
                break;
            }
        }
        this.f34188h = f.b();
    }

    public static TreeWalker getInstance() {
        return f34176i;
    }

    private void i() {
        if (f34178k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f34178k = handler;
            handler.post(f34179l);
            f34178k.postDelayed(f34180m, 200L);
        }
    }

    private void k() {
        Handler handler = f34178k;
        if (handler != null) {
            handler.removeCallbacks(f34180m);
            f34178k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34181a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f34181a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f34186f.e();
        long jB = f.b();
        com.iab.omid.library.amazon.processor.a aVarA = this.f34185e.a();
        if (this.f34186f.b().size() > 0) {
            for (String str : this.f34186f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f34186f.a(str), jSONObjectA);
                com.iab.omid.library.amazon.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f34187g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f34186f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.amazon.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.amazon.utils.c.b(jSONObjectA2);
            treeWalker.f34187g.b(jSONObjectA2, treeWalker.f34186f.c(), jB);
            if (treeWalker.f34183c) {
                Iterator<com.iab.omid.library.amazon.adsession.a> it = com.iab.omid.library.amazon.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f34184d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f34187g.b();
        }
        treeWalker.f34186f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f34181a.clear();
        f34177j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34181a.contains(treeWalkerTimeLogger)) {
            this.f34181a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f34181a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f34181a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f34182b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f34182b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f34186f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.amazon.utils.c.a(jSONObject, strD);
        com.iab.omid.library.amazon.utils.c.a(jSONObject, Boolean.valueOf(this.f34186f.f(view)));
        this.f34186f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.amazon.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.amazon.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.amazon.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.amazon.processor.a.InterfaceC0365a
    public void a(View view, com.iab.omid.library.amazon.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.amazon.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f34186f.e(view)) != com.iab.omid.library.amazon.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.amazon.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f34183c && cVarE == com.iab.omid.library.amazon.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f34184d.add(new com.iab.omid.library.amazon.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f34182b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.amazon.processor.a aVarB = this.f34185e.b();
        String strB = this.f34186f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.amazon.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.amazon.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.amazon.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0367a c0367aC = this.f34186f.c(view);
        if (c0367aC == null) {
            return false;
        }
        com.iab.omid.library.amazon.utils.c.a(jSONObject, c0367aC);
        return true;
    }
}
