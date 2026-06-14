package com.iab.omid.library.mobilefuse.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mobilefuse.internal.j;
import com.iab.omid.library.mobilefuse.processor.a;
import com.iab.omid.library.mobilefuse.utils.f;
import com.iab.omid.library.mobilefuse.utils.h;
import com.iab.omid.library.mobilefuse.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0409a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f35632i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f35633j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f35634k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f35635l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f35636m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35638b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35644h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f35637a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35639c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mobilefuse.weakreference.a> f35640d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mobilefuse.walking.a f35642f = new com.iab.omid.library.mobilefuse.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mobilefuse.processor.b f35641e = new com.iab.omid.library.mobilefuse.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mobilefuse.walking.b f35643g = new com.iab.omid.library.mobilefuse.walking.b(new com.iab.omid.library.mobilefuse.walking.async.c());

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
            TreeWalker.this.f35643g.b();
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
            if (TreeWalker.f35634k != null) {
                TreeWalker.f35634k.post(TreeWalker.f35635l);
                TreeWalker.f35634k.postDelayed(TreeWalker.f35636m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f35644h);
    }

    private void e() {
        this.f35638b = 0;
        this.f35640d.clear();
        this.f35639c = false;
        Iterator<com.iab.omid.library.mobilefuse.adsession.a> it = com.iab.omid.library.mobilefuse.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f35639c = true;
                break;
            }
        }
        this.f35644h = f.b();
    }

    public static TreeWalker getInstance() {
        return f35632i;
    }

    private void i() {
        if (f35634k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35634k = handler;
            handler.post(f35635l);
            f35634k.postDelayed(f35636m, 200L);
        }
    }

    private void k() {
        Handler handler = f35634k;
        if (handler != null) {
            handler.removeCallbacks(f35636m);
            f35634k = null;
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
        if (this.f35637a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f35637a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f35642f.e();
        long jB = f.b();
        com.iab.omid.library.mobilefuse.processor.a aVarA = this.f35641e.a();
        if (this.f35642f.b().size() > 0) {
            for (String str : this.f35642f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f35642f.a(str), jSONObjectA);
                com.iab.omid.library.mobilefuse.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f35643g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f35642f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.mobilefuse.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mobilefuse.utils.c.b(jSONObjectA2);
            treeWalker.f35643g.b(jSONObjectA2, treeWalker.f35642f.c(), jB);
            if (treeWalker.f35639c) {
                Iterator<com.iab.omid.library.mobilefuse.adsession.a> it = com.iab.omid.library.mobilefuse.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f35640d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f35643g.b();
        }
        treeWalker.f35642f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f35637a.clear();
        f35633j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f35637a.contains(treeWalkerTimeLogger)) {
            this.f35637a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f35637a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f35637a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f35638b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f35638b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f35642f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mobilefuse.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mobilefuse.utils.c.a(jSONObject, Boolean.valueOf(this.f35642f.e(view)));
        com.iab.omid.library.mobilefuse.utils.c.b(jSONObject, Boolean.valueOf(this.f35642f.c(strC)));
        this.f35642f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.mobilefuse.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mobilefuse.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mobilefuse.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.mobilefuse.processor.a.InterfaceC0409a
    public void a(View view, com.iab.omid.library.mobilefuse.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.mobilefuse.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f35642f.d(view)) != com.iab.omid.library.mobilefuse.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mobilefuse.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f35639c && cVarD == com.iab.omid.library.mobilefuse.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f35640d.add(new com.iab.omid.library.mobilefuse.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f35638b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.mobilefuse.processor.a aVarB = this.f35641e.b();
        String strB = this.f35642f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mobilefuse.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mobilefuse.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mobilefuse.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0411a c0411aB = this.f35642f.b(view);
        if (c0411aB == null) {
            return false;
        }
        com.iab.omid.library.mobilefuse.utils.c.a(jSONObject, c0411aB);
        return true;
    }
}
