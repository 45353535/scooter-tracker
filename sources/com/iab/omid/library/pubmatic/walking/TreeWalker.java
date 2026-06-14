package com.iab.omid.library.pubmatic.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubmatic.internal.j;
import com.iab.omid.library.pubmatic.processor.a;
import com.iab.omid.library.pubmatic.utils.f;
import com.iab.omid.library.pubmatic.utils.h;
import com.iab.omid.library.pubmatic.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0414a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f35773i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f35774j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f35775k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f35776l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f35777m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35779b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35785h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f35778a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35780c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.pubmatic.weakreference.a> f35781d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.pubmatic.walking.a f35783f = new com.iab.omid.library.pubmatic.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.pubmatic.processor.b f35782e = new com.iab.omid.library.pubmatic.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.pubmatic.walking.b f35784g = new com.iab.omid.library.pubmatic.walking.b(new com.iab.omid.library.pubmatic.walking.async.c());

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
            TreeWalker.this.f35784g.b();
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
            if (TreeWalker.f35775k != null) {
                TreeWalker.f35775k.post(TreeWalker.f35776l);
                TreeWalker.f35775k.postDelayed(TreeWalker.f35777m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f35785h);
    }

    private void e() {
        this.f35779b = 0;
        this.f35781d.clear();
        this.f35780c = false;
        Iterator<com.iab.omid.library.pubmatic.adsession.a> it = com.iab.omid.library.pubmatic.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f35780c = true;
                break;
            }
        }
        this.f35785h = f.b();
    }

    public static TreeWalker getInstance() {
        return f35773i;
    }

    private void i() {
        if (f35775k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35775k = handler;
            handler.post(f35776l);
            f35775k.postDelayed(f35777m, 200L);
        }
    }

    private void k() {
        Handler handler = f35775k;
        if (handler != null) {
            handler.removeCallbacks(f35777m);
            f35775k = null;
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
        if (this.f35778a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f35778a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f35783f.e();
        long jB = f.b();
        com.iab.omid.library.pubmatic.processor.a aVarA = this.f35782e.a();
        if (this.f35783f.b().size() > 0) {
            for (String str : this.f35783f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f35783f.a(str), jSONObjectA);
                com.iab.omid.library.pubmatic.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f35784g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f35783f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.pubmatic.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.pubmatic.utils.c.b(jSONObjectA2);
            treeWalker.f35784g.b(jSONObjectA2, treeWalker.f35783f.c(), jB);
            if (treeWalker.f35780c) {
                Iterator<com.iab.omid.library.pubmatic.adsession.a> it = com.iab.omid.library.pubmatic.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f35781d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f35784g.b();
        }
        treeWalker.f35783f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f35778a.clear();
        f35774j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f35778a.contains(treeWalkerTimeLogger)) {
            this.f35778a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f35778a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f35778a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f35779b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f35779b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f35783f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.pubmatic.utils.c.a(jSONObject, strC);
        com.iab.omid.library.pubmatic.utils.c.a(jSONObject, Boolean.valueOf(this.f35783f.e(view)));
        com.iab.omid.library.pubmatic.utils.c.b(jSONObject, Boolean.valueOf(this.f35783f.c(strC)));
        this.f35783f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.pubmatic.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.pubmatic.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.pubmatic.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.pubmatic.processor.a.InterfaceC0414a
    public void a(View view, com.iab.omid.library.pubmatic.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.pubmatic.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f35783f.d(view)) != com.iab.omid.library.pubmatic.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.pubmatic.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f35780c && cVarD == com.iab.omid.library.pubmatic.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f35781d.add(new com.iab.omid.library.pubmatic.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f35779b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.pubmatic.processor.a aVarB = this.f35782e.b();
        String strB = this.f35783f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.pubmatic.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.pubmatic.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.pubmatic.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0416a c0416aB = this.f35783f.b(view);
        if (c0416aB == null) {
            return false;
        }
        com.iab.omid.library.pubmatic.utils.c.a(jSONObject, c0416aB);
        return true;
    }
}
