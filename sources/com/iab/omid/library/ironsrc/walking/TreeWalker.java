package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0401a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f35362i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f35363j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f35364k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f35365l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f35366m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35368b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35374h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f35367a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35369c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f35370d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.a f35372f = new com.iab.omid.library.ironsrc.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f35371e = new com.iab.omid.library.ironsrc.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f35373g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

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
            TreeWalker.this.f35373g.b();
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
            if (TreeWalker.f35364k != null) {
                TreeWalker.f35364k.post(TreeWalker.f35365l);
                TreeWalker.f35364k.postDelayed(TreeWalker.f35366m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f35374h);
    }

    private void e() {
        this.f35368b = 0;
        this.f35370d.clear();
        this.f35369c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f35369c = true;
                break;
            }
        }
        this.f35374h = f.b();
    }

    public static TreeWalker getInstance() {
        return f35362i;
    }

    private void i() {
        if (f35364k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35364k = handler;
            handler.post(f35365l);
            f35364k.postDelayed(f35366m, 200L);
        }
    }

    private void k() {
        Handler handler = f35364k;
        if (handler != null) {
            handler.removeCallbacks(f35366m);
            f35364k = null;
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
        if (this.f35367a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f35367a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f35372f.e();
        long jB = f.b();
        com.iab.omid.library.ironsrc.processor.a aVarA = this.f35371e.a();
        if (this.f35372f.b().size() > 0) {
            for (String str : this.f35372f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f35372f.a(str), jSONObjectA);
                com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f35373g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f35372f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA2);
            treeWalker.f35373g.b(jSONObjectA2, treeWalker.f35372f.c(), jB);
            if (treeWalker.f35369c) {
                Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f35370d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f35373g.b();
        }
        treeWalker.f35372f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f35367a.clear();
        f35363j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f35367a.contains(treeWalkerTimeLogger)) {
            this.f35367a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f35367a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f35367a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f35368b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f35368b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f35372f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, strC);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f35372f.e(view)));
        com.iab.omid.library.ironsrc.utils.c.b(jSONObject, Boolean.valueOf(this.f35372f.c(strC)));
        this.f35372f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0401a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.ironsrc.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f35372f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f35369c && cVarD == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f35370d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f35368b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a aVarB = this.f35371e.b();
        String strB = this.f35372f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0403a c0403aB = this.f35372f.b(view);
        if (c0403aB == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c0403aB);
        return true;
    }
}
