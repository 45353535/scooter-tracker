package com.iab.omid.library.chartboost.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.chartboost.internal.j;
import com.iab.omid.library.chartboost.processor.a;
import com.iab.omid.library.chartboost.utils.f;
import com.iab.omid.library.chartboost.utils.h;
import com.iab.omid.library.chartboost.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0385a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f34837i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f34838j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f34839k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f34840l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f34841m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34843b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34849h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f34842a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34844c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.chartboost.weakreference.a> f34845d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.chartboost.walking.a f34847f = new com.iab.omid.library.chartboost.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.chartboost.processor.b f34846e = new com.iab.omid.library.chartboost.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.chartboost.walking.b f34848g = new com.iab.omid.library.chartboost.walking.b(new com.iab.omid.library.chartboost.walking.async.c());

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
            TreeWalker.this.f34848g.b();
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
            if (TreeWalker.f34839k != null) {
                TreeWalker.f34839k.post(TreeWalker.f34840l);
                TreeWalker.f34839k.postDelayed(TreeWalker.f34841m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f34849h);
    }

    private void e() {
        this.f34843b = 0;
        this.f34845d.clear();
        this.f34844c = false;
        Iterator<com.iab.omid.library.chartboost.adsession.a> it = com.iab.omid.library.chartboost.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f34844c = true;
                break;
            }
        }
        this.f34849h = f.b();
    }

    public static TreeWalker getInstance() {
        return f34837i;
    }

    private void i() {
        if (f34839k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f34839k = handler;
            handler.post(f34840l);
            f34839k.postDelayed(f34841m, 200L);
        }
    }

    private void k() {
        Handler handler = f34839k;
        if (handler != null) {
            handler.removeCallbacks(f34841m);
            f34839k = null;
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
        if (this.f34842a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f34842a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f34847f.e();
        long jB = f.b();
        com.iab.omid.library.chartboost.processor.a aVarA = this.f34846e.a();
        if (this.f34847f.b().size() > 0) {
            for (String str : this.f34847f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f34847f.a(str), jSONObjectA);
                com.iab.omid.library.chartboost.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f34848g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f34847f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.chartboost.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.chartboost.utils.c.b(jSONObjectA2);
            treeWalker.f34848g.b(jSONObjectA2, treeWalker.f34847f.c(), jB);
            if (treeWalker.f34844c) {
                Iterator<com.iab.omid.library.chartboost.adsession.a> it = com.iab.omid.library.chartboost.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f34845d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f34848g.b();
        }
        treeWalker.f34847f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f34842a.clear();
        f34838j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34842a.contains(treeWalkerTimeLogger)) {
            this.f34842a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f34842a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f34842a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f34843b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f34843b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f34847f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.chartboost.utils.c.a(jSONObject, strC);
        com.iab.omid.library.chartboost.utils.c.a(jSONObject, Boolean.valueOf(this.f34847f.e(view)));
        com.iab.omid.library.chartboost.utils.c.b(jSONObject, Boolean.valueOf(this.f34847f.c(strC)));
        this.f34847f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.chartboost.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.chartboost.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.chartboost.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.chartboost.processor.a.InterfaceC0385a
    public void a(View view, com.iab.omid.library.chartboost.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.chartboost.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f34847f.d(view)) != com.iab.omid.library.chartboost.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.chartboost.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f34844c && cVarD == com.iab.omid.library.chartboost.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f34845d.add(new com.iab.omid.library.chartboost.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f34843b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.chartboost.processor.a aVarB = this.f34846e.b();
        String strB = this.f34847f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.chartboost.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.chartboost.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.chartboost.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0387a c0387aB = this.f34847f.b(view);
        if (c0387aB == null) {
            return false;
        }
        com.iab.omid.library.chartboost.utils.c.a(jSONObject, c0387aB);
        return true;
    }
}
