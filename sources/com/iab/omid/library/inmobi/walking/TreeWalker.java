package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.inmobi.internal.j;
import com.iab.omid.library.inmobi.processor.a;
import com.iab.omid.library.inmobi.utils.f;
import com.iab.omid.library.inmobi.utils.h;
import com.iab.omid.library.inmobi.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0397a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f35227i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f35228j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f35229k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f35230l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f35231m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35233b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35239h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f35232a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35234c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.inmobi.weakreference.a> f35235d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.a f35237f = new com.iab.omid.library.inmobi.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.inmobi.processor.b f35236e = new com.iab.omid.library.inmobi.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.b f35238g = new com.iab.omid.library.inmobi.walking.b(new com.iab.omid.library.inmobi.walking.async.c());

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
            TreeWalker.this.f35238g.b();
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
            if (TreeWalker.f35229k != null) {
                TreeWalker.f35229k.post(TreeWalker.f35230l);
                TreeWalker.f35229k.postDelayed(TreeWalker.f35231m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f35239h);
    }

    private void e() {
        this.f35233b = 0;
        this.f35235d.clear();
        this.f35234c = false;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f35234c = true;
                break;
            }
        }
        this.f35239h = f.b();
    }

    public static TreeWalker getInstance() {
        return f35227i;
    }

    private void i() {
        if (f35229k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35229k = handler;
            handler.post(f35230l);
            f35229k.postDelayed(f35231m, 200L);
        }
    }

    private void k() {
        Handler handler = f35229k;
        if (handler != null) {
            handler.removeCallbacks(f35231m);
            f35229k = null;
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
        if (this.f35232a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f35232a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f35237f.e();
        long jB = f.b();
        com.iab.omid.library.inmobi.processor.a aVarA = this.f35236e.a();
        if (this.f35237f.b().size() > 0) {
            for (String str : this.f35237f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f35237f.a(str), jSONObjectA);
                com.iab.omid.library.inmobi.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f35238g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f35237f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA2);
            treeWalker.f35238g.b(jSONObjectA2, treeWalker.f35237f.c(), jB);
            if (treeWalker.f35234c) {
                Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f35235d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f35238g.b();
        }
        treeWalker.f35237f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f35232a.clear();
        f35228j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f35232a.contains(treeWalkerTimeLogger)) {
            this.f35232a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f35232a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f35232a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f35233b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f35233b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f35237f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, strC);
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, Boolean.valueOf(this.f35237f.e(view)));
        com.iab.omid.library.inmobi.utils.c.b(jSONObject, Boolean.valueOf(this.f35237f.c(strC)));
        this.f35237f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.inmobi.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.inmobi.processor.a.InterfaceC0397a
    public void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.inmobi.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f35237f.d(view)) != com.iab.omid.library.inmobi.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f35234c && cVarD == com.iab.omid.library.inmobi.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f35235d.add(new com.iab.omid.library.inmobi.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f35233b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.processor.a aVarB = this.f35236e.b();
        String strB = this.f35237f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0399a c0399aB = this.f35237f.b(view);
        if (c0399aB == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, c0399aB);
        return true;
    }
}
