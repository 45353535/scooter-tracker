package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.internal.j;
import com.iab.omid.library.vungle.processor.a;
import com.iab.omid.library.vungle.utils.f;
import com.iab.omid.library.vungle.utils.h;
import com.iab.omid.library.vungle.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0435a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f36434i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f36435j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f36436k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f36437l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f36438m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36440b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36446h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f36439a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36441c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.vungle.weakreference.a> f36442d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.a f36444f = new com.iab.omid.library.vungle.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.processor.b f36443e = new com.iab.omid.library.vungle.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.b f36445g = new com.iab.omid.library.vungle.walking.b(new com.iab.omid.library.vungle.walking.async.c());

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
            TreeWalker.this.f36445g.b();
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
            if (TreeWalker.f36436k != null) {
                TreeWalker.f36436k.post(TreeWalker.f36437l);
                TreeWalker.f36436k.postDelayed(TreeWalker.f36438m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f36446h);
    }

    private void e() {
        this.f36440b = 0;
        this.f36442d.clear();
        this.f36441c = false;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f36441c = true;
                break;
            }
        }
        this.f36446h = f.b();
    }

    public static TreeWalker getInstance() {
        return f36434i;
    }

    private void i() {
        if (f36436k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36436k = handler;
            handler.post(f36437l);
            f36436k.postDelayed(f36438m, 200L);
        }
    }

    private void k() {
        Handler handler = f36436k;
        if (handler != null) {
            handler.removeCallbacks(f36438m);
            f36436k = null;
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
        if (this.f36439a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f36439a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f36444f.e();
        long jB = f.b();
        com.iab.omid.library.vungle.processor.a aVarA = this.f36443e.a();
        if (this.f36444f.b().size() > 0) {
            for (String str : this.f36444f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f36444f.a(str), jSONObjectA);
                com.iab.omid.library.vungle.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f36445g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f36444f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.vungle.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA2);
            treeWalker.f36445g.b(jSONObjectA2, treeWalker.f36444f.c(), jB);
            if (treeWalker.f36441c) {
                Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f36442d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f36445g.b();
        }
        treeWalker.f36444f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f36439a.clear();
        f36435j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36439a.contains(treeWalkerTimeLogger)) {
            this.f36439a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f36439a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f36439a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f36440b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f36440b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f36444f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, strC);
        com.iab.omid.library.vungle.utils.c.a(jSONObject, Boolean.valueOf(this.f36444f.e(view)));
        com.iab.omid.library.vungle.utils.c.b(jSONObject, Boolean.valueOf(this.f36444f.c(strC)));
        this.f36444f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.vungle.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.vungle.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.vungle.processor.a.InterfaceC0435a
    public void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.vungle.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f36444f.d(view)) != com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f36441c && cVarD == com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f36442d.add(new com.iab.omid.library.vungle.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f36440b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.vungle.processor.a aVarB = this.f36443e.b();
        String strB = this.f36444f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0437a c0437aB = this.f36444f.b(view);
        if (c0437aB == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, c0437aB);
        return true;
    }
}
