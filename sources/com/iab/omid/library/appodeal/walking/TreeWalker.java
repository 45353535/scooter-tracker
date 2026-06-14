package com.iab.omid.library.appodeal.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.internal.j;
import com.iab.omid.library.appodeal.processor.a;
import com.iab.omid.library.appodeal.utils.f;
import com.iab.omid.library.appodeal.utils.h;
import com.iab.omid.library.appodeal.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0373a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f34446i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f34447j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f34448k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f34449l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f34450m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34452b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34458h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f34451a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34453c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.appodeal.weakreference.a> f34454d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.a f34456f = new com.iab.omid.library.appodeal.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.appodeal.processor.b f34455e = new com.iab.omid.library.appodeal.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.b f34457g = new com.iab.omid.library.appodeal.walking.b(new com.iab.omid.library.appodeal.walking.async.c());

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
            TreeWalker.this.f34457g.b();
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
            if (TreeWalker.f34448k != null) {
                TreeWalker.f34448k.post(TreeWalker.f34449l);
                TreeWalker.f34448k.postDelayed(TreeWalker.f34450m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f34458h);
    }

    private void e() {
        this.f34452b = 0;
        this.f34454d.clear();
        this.f34453c = false;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f34453c = true;
                break;
            }
        }
        this.f34458h = f.b();
    }

    public static TreeWalker getInstance() {
        return f34446i;
    }

    private void i() {
        if (f34448k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f34448k = handler;
            handler.post(f34449l);
            f34448k.postDelayed(f34450m, 200L);
        }
    }

    private void k() {
        Handler handler = f34448k;
        if (handler != null) {
            handler.removeCallbacks(f34450m);
            f34448k = null;
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
        if (this.f34451a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f34451a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f34456f.e();
        long jB = f.b();
        com.iab.omid.library.appodeal.processor.a aVarA = this.f34455e.a();
        if (this.f34456f.b().size() > 0) {
            for (String str : this.f34456f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f34456f.a(str), jSONObjectA);
                com.iab.omid.library.appodeal.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f34457g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f34456f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA2);
            treeWalker.f34457g.b(jSONObjectA2, treeWalker.f34456f.c(), jB);
            if (treeWalker.f34453c) {
                Iterator<com.iab.omid.library.appodeal.adsession.a> it = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f34454d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f34457g.b();
        }
        treeWalker.f34456f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f34451a.clear();
        f34447j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34451a.contains(treeWalkerTimeLogger)) {
            this.f34451a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f34451a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f34451a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f34452b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f34452b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f34456f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, strC);
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, Boolean.valueOf(this.f34456f.e(view)));
        com.iab.omid.library.appodeal.utils.c.b(jSONObject, Boolean.valueOf(this.f34456f.c(strC)));
        this.f34456f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.appodeal.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.appodeal.processor.a.InterfaceC0373a
    public void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.appodeal.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f34456f.d(view)) != com.iab.omid.library.appodeal.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f34453c && cVarD == com.iab.omid.library.appodeal.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f34454d.add(new com.iab.omid.library.appodeal.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f34452b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.appodeal.processor.a aVarB = this.f34455e.b();
        String strB = this.f34456f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0375a c0375aB = this.f34456f.b(view);
        if (c0375aB == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, c0375aB);
        return true;
    }
}
