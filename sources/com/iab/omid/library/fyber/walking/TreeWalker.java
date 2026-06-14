package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.internal.j;
import com.iab.omid.library.fyber.processor.a;
import com.iab.omid.library.fyber.utils.f;
import com.iab.omid.library.fyber.utils.h;
import com.iab.omid.library.fyber.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0392a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f35086i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f35087j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f35088k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f35089l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f35090m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35092b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35098h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f35091a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35093c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.fyber.weakreference.a> f35094d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.a f35096f = new com.iab.omid.library.fyber.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.fyber.processor.b f35095e = new com.iab.omid.library.fyber.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.b f35097g = new com.iab.omid.library.fyber.walking.b(new com.iab.omid.library.fyber.walking.async.c());

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
            TreeWalker.this.f35097g.b();
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
            if (TreeWalker.f35088k != null) {
                TreeWalker.f35088k.post(TreeWalker.f35089l);
                TreeWalker.f35088k.postDelayed(TreeWalker.f35090m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f35098h);
    }

    private void e() {
        this.f35092b = 0;
        this.f35094d.clear();
        this.f35093c = false;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f35093c = true;
                break;
            }
        }
        this.f35098h = f.b();
    }

    public static TreeWalker getInstance() {
        return f35086i;
    }

    private void i() {
        if (f35088k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35088k = handler;
            handler.post(f35089l);
            f35088k.postDelayed(f35090m, 200L);
        }
    }

    private void k() {
        Handler handler = f35088k;
        if (handler != null) {
            handler.removeCallbacks(f35090m);
            f35088k = null;
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
        if (this.f35091a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f35091a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f35096f.e();
        long jB = f.b();
        com.iab.omid.library.fyber.processor.a aVarA = this.f35095e.a();
        if (this.f35096f.b().size() > 0) {
            for (String str : this.f35096f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f35096f.a(str), jSONObjectA);
                com.iab.omid.library.fyber.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f35097g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f35096f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.fyber.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA2);
            treeWalker.f35097g.b(jSONObjectA2, treeWalker.f35096f.c(), jB);
            if (treeWalker.f35093c) {
                Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f35094d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f35097g.b();
        }
        treeWalker.f35096f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f35091a.clear();
        f35087j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f35091a.contains(treeWalkerTimeLogger)) {
            this.f35091a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f35091a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f35091a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f35092b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f35092b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f35096f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, strC);
        com.iab.omid.library.fyber.utils.c.a(jSONObject, Boolean.valueOf(this.f35096f.e(view)));
        com.iab.omid.library.fyber.utils.c.b(jSONObject, Boolean.valueOf(this.f35096f.c(strC)));
        this.f35096f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.fyber.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.fyber.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.fyber.processor.a.InterfaceC0392a
    public void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.fyber.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f35096f.d(view)) != com.iab.omid.library.fyber.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f35093c && cVarD == com.iab.omid.library.fyber.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f35094d.add(new com.iab.omid.library.fyber.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f35092b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.fyber.processor.a aVarB = this.f35095e.b();
        String strB = this.f35096f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0394a c0394aB = this.f35096f.b(view);
        if (c0394aB == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, c0394aB);
        return true;
    }
}
