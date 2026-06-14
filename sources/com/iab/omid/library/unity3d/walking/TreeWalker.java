package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.processor.a;
import com.iab.omid.library.unity3d.utils.f;
import com.iab.omid.library.unity3d.utils.h;
import com.iab.omid.library.unity3d.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0430a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f36294i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f36295j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f36296k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f36297l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f36298m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36300b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36306h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f36299a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36301c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.unity3d.weakreference.a> f36302d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.a f36304f = new com.iab.omid.library.unity3d.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.unity3d.processor.b f36303e = new com.iab.omid.library.unity3d.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.b f36305g = new com.iab.omid.library.unity3d.walking.b(new com.iab.omid.library.unity3d.walking.async.c());

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
            TreeWalker.this.f36305g.b();
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
            if (TreeWalker.f36296k != null) {
                TreeWalker.f36296k.post(TreeWalker.f36297l);
                TreeWalker.f36296k.postDelayed(TreeWalker.f36298m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f36306h);
    }

    private void e() {
        this.f36300b = 0;
        this.f36302d.clear();
        this.f36301c = false;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f36301c = true;
                break;
            }
        }
        this.f36306h = f.b();
    }

    public static TreeWalker getInstance() {
        return f36294i;
    }

    private void i() {
        if (f36296k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36296k = handler;
            handler.post(f36297l);
            f36296k.postDelayed(f36298m, 200L);
        }
    }

    private void k() {
        Handler handler = f36296k;
        if (handler != null) {
            handler.removeCallbacks(f36298m);
            f36296k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36299a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f36299a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f36304f.e();
        long jB = f.b();
        com.iab.omid.library.unity3d.processor.a aVarA = this.f36303e.a();
        if (this.f36304f.b().size() > 0) {
            for (String str : this.f36304f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f36304f.a(str), jSONObjectA);
                com.iab.omid.library.unity3d.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f36305g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f36304f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA2);
            treeWalker.f36305g.b(jSONObjectA2, treeWalker.f36304f.c(), jB);
            if (treeWalker.f36301c) {
                Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f36302d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f36305g.b();
        }
        treeWalker.f36304f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f36299a.clear();
        f36295j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f36299a.contains(treeWalkerTimeLogger)) {
            this.f36299a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f36299a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f36299a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f36300b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f36300b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f36304f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, strD);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, Boolean.valueOf(this.f36304f.f(view)));
        this.f36304f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.unity3d.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.unity3d.processor.a.InterfaceC0430a
    public void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.unity3d.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f36304f.e(view)) != com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f36301c && cVarE == com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f36302d.add(new com.iab.omid.library.unity3d.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f36300b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.unity3d.processor.a aVarB = this.f36303e.b();
        String strB = this.f36304f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0432a c0432aC = this.f36304f.c(view);
        if (c0432aC == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, c0432aC);
        return true;
    }
}
