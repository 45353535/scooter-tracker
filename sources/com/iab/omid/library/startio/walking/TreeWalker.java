package com.iab.omid.library.startio.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.startio.processor.a;
import com.iab.omid.library.startio.utils.f;
import com.iab.omid.library.startio.utils.h;
import com.iab.omid.library.startio.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0422a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f36038i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f36039j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f36040k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f36041l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f36042m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36044b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36050h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f36043a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36045c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.startio.weakreference.a> f36046d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.startio.walking.a f36048f = new com.iab.omid.library.startio.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.startio.processor.b f36047e = new com.iab.omid.library.startio.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.startio.walking.b f36049g = new com.iab.omid.library.startio.walking.b(new com.iab.omid.library.startio.walking.async.c());

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
            TreeWalker.this.f36049g.b();
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
            if (TreeWalker.f36040k != null) {
                TreeWalker.f36040k.post(TreeWalker.f36041l);
                TreeWalker.f36040k.postDelayed(TreeWalker.f36042m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f36050h);
    }

    private void e() {
        this.f36044b = 0;
        this.f36046d.clear();
        this.f36045c = false;
        Iterator<com.iab.omid.library.startio.adsession.a> it = com.iab.omid.library.startio.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f36045c = true;
                break;
            }
        }
        this.f36050h = f.b();
    }

    public static TreeWalker getInstance() {
        return f36038i;
    }

    private void i() {
        if (f36040k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36040k = handler;
            handler.post(f36041l);
            f36040k.postDelayed(f36042m, 200L);
        }
    }

    private void k() {
        Handler handler = f36040k;
        if (handler != null) {
            handler.removeCallbacks(f36042m);
            f36040k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36043a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f36043a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f36048f.e();
        long jB = f.b();
        com.iab.omid.library.startio.processor.a aVarA = this.f36047e.a();
        if (this.f36048f.b().size() > 0) {
            for (String str : this.f36048f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f36048f.a(str), jSONObjectA);
                com.iab.omid.library.startio.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f36049g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f36048f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.startio.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.startio.utils.c.b(jSONObjectA2);
            treeWalker.f36049g.b(jSONObjectA2, treeWalker.f36048f.c(), jB);
            if (treeWalker.f36045c) {
                Iterator<com.iab.omid.library.startio.adsession.a> it = com.iab.omid.library.startio.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f36046d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f36049g.b();
        }
        treeWalker.f36048f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f36043a.clear();
        f36039j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36043a.contains(treeWalkerTimeLogger)) {
            this.f36043a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f36043a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f36043a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f36044b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f36044b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f36048f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.startio.utils.c.a(jSONObject, strD);
        com.iab.omid.library.startio.utils.c.a(jSONObject, Boolean.valueOf(this.f36048f.f(view)));
        this.f36048f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.startio.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.startio.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.startio.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.startio.processor.a.InterfaceC0422a
    public void a(View view, com.iab.omid.library.startio.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.startio.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f36048f.e(view)) != com.iab.omid.library.startio.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.startio.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f36045c && cVarE == com.iab.omid.library.startio.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f36046d.add(new com.iab.omid.library.startio.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f36044b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.startio.processor.a aVarB = this.f36047e.b();
        String strB = this.f36048f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.startio.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.startio.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.startio.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0424a c0424aC = this.f36048f.c(view);
        if (c0424aC == null) {
            return false;
        }
        com.iab.omid.library.startio.utils.c.a(jSONObject, c0424aC);
        return true;
    }
}
