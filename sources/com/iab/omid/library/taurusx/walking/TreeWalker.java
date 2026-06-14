package com.iab.omid.library.taurusx.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.taurusx.processor.a;
import com.iab.omid.library.taurusx.utils.f;
import com.iab.omid.library.taurusx.utils.h;
import com.iab.omid.library.taurusx.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0426a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f36166i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f36167j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f36168k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f36169l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f36170m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36172b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36178h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f36171a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36173c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.taurusx.weakreference.a> f36174d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.taurusx.walking.a f36176f = new com.iab.omid.library.taurusx.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.taurusx.processor.b f36175e = new com.iab.omid.library.taurusx.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.taurusx.walking.b f36177g = new com.iab.omid.library.taurusx.walking.b(new com.iab.omid.library.taurusx.walking.async.c());

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
            TreeWalker.this.f36177g.b();
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
            if (TreeWalker.f36168k != null) {
                TreeWalker.f36168k.post(TreeWalker.f36169l);
                TreeWalker.f36168k.postDelayed(TreeWalker.f36170m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f36178h);
    }

    private void e() {
        this.f36172b = 0;
        this.f36174d.clear();
        this.f36173c = false;
        Iterator<com.iab.omid.library.taurusx.adsession.a> it = com.iab.omid.library.taurusx.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f36173c = true;
                break;
            }
        }
        this.f36178h = f.b();
    }

    public static TreeWalker getInstance() {
        return f36166i;
    }

    private void i() {
        if (f36168k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36168k = handler;
            handler.post(f36169l);
            f36168k.postDelayed(f36170m, 200L);
        }
    }

    private void k() {
        Handler handler = f36168k;
        if (handler != null) {
            handler.removeCallbacks(f36170m);
            f36168k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36171a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f36171a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f36176f.e();
        long jB = f.b();
        com.iab.omid.library.taurusx.processor.a aVarA = this.f36175e.a();
        if (this.f36176f.b().size() > 0) {
            for (String str : this.f36176f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f36176f.a(str), jSONObjectA);
                com.iab.omid.library.taurusx.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f36177g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f36176f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.taurusx.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.taurusx.utils.c.b(jSONObjectA2);
            treeWalker.f36177g.b(jSONObjectA2, treeWalker.f36176f.c(), jB);
            if (treeWalker.f36173c) {
                Iterator<com.iab.omid.library.taurusx.adsession.a> it = com.iab.omid.library.taurusx.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f36174d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f36177g.b();
        }
        treeWalker.f36176f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f36171a.clear();
        f36167j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36171a.contains(treeWalkerTimeLogger)) {
            this.f36171a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f36171a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f36171a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f36172b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f36172b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f36176f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.taurusx.utils.c.a(jSONObject, strD);
        com.iab.omid.library.taurusx.utils.c.a(jSONObject, Boolean.valueOf(this.f36176f.f(view)));
        this.f36176f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.taurusx.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.taurusx.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.taurusx.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.taurusx.processor.a.InterfaceC0426a
    public void a(View view, com.iab.omid.library.taurusx.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.taurusx.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f36176f.e(view)) != com.iab.omid.library.taurusx.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.taurusx.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f36173c && cVarE == com.iab.omid.library.taurusx.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f36174d.add(new com.iab.omid.library.taurusx.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f36172b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.taurusx.processor.a aVarB = this.f36175e.b();
        String strB = this.f36176f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.taurusx.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.taurusx.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.taurusx.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0428a c0428aC = this.f36176f.c(view);
        if (c0428aC == null) {
            return false;
        }
        com.iab.omid.library.taurusx.utils.c.a(jSONObject, c0428aC);
        return true;
    }
}
