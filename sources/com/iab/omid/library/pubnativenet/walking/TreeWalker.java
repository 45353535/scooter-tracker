package com.iab.omid.library.pubnativenet.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubnativenet.internal.j;
import com.iab.omid.library.pubnativenet.processor.a;
import com.iab.omid.library.pubnativenet.utils.f;
import com.iab.omid.library.pubnativenet.utils.h;
import com.iab.omid.library.pubnativenet.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0418a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f35908i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f35909j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f35910k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f35911l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f35912m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35914b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35920h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f35913a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35915c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.pubnativenet.weakreference.a> f35916d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.pubnativenet.walking.a f35918f = new com.iab.omid.library.pubnativenet.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.pubnativenet.processor.b f35917e = new com.iab.omid.library.pubnativenet.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.pubnativenet.walking.b f35919g = new com.iab.omid.library.pubnativenet.walking.b(new com.iab.omid.library.pubnativenet.walking.async.c());

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
            TreeWalker.this.f35919g.b();
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
            if (TreeWalker.f35910k != null) {
                TreeWalker.f35910k.post(TreeWalker.f35911l);
                TreeWalker.f35910k.postDelayed(TreeWalker.f35912m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f35920h);
    }

    private void e() {
        this.f35914b = 0;
        this.f35916d.clear();
        this.f35915c = false;
        Iterator<com.iab.omid.library.pubnativenet.adsession.a> it = com.iab.omid.library.pubnativenet.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f35915c = true;
                break;
            }
        }
        this.f35920h = f.b();
    }

    public static TreeWalker getInstance() {
        return f35908i;
    }

    private void i() {
        if (f35910k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35910k = handler;
            handler.post(f35911l);
            f35910k.postDelayed(f35912m, 200L);
        }
    }

    private void k() {
        Handler handler = f35910k;
        if (handler != null) {
            handler.removeCallbacks(f35912m);
            f35910k = null;
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
        if (this.f35913a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f35913a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f35918f.e();
        long jB = f.b();
        com.iab.omid.library.pubnativenet.processor.a aVarA = this.f35917e.a();
        if (this.f35918f.b().size() > 0) {
            for (String str : this.f35918f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f35918f.a(str), jSONObjectA);
                com.iab.omid.library.pubnativenet.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f35919g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f35918f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.pubnativenet.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.pubnativenet.utils.c.b(jSONObjectA2);
            treeWalker.f35919g.b(jSONObjectA2, treeWalker.f35918f.c(), jB);
            if (treeWalker.f35915c) {
                Iterator<com.iab.omid.library.pubnativenet.adsession.a> it = com.iab.omid.library.pubnativenet.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f35916d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f35919g.b();
        }
        treeWalker.f35918f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f35913a.clear();
        f35909j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f35913a.contains(treeWalkerTimeLogger)) {
            this.f35913a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f35913a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f35913a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f35914b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f35914b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f35918f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.pubnativenet.utils.c.a(jSONObject, strC);
        com.iab.omid.library.pubnativenet.utils.c.a(jSONObject, Boolean.valueOf(this.f35918f.e(view)));
        com.iab.omid.library.pubnativenet.utils.c.b(jSONObject, Boolean.valueOf(this.f35918f.c(strC)));
        this.f35918f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.pubnativenet.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.pubnativenet.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.pubnativenet.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.pubnativenet.processor.a.InterfaceC0418a
    public void a(View view, com.iab.omid.library.pubnativenet.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.pubnativenet.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f35918f.d(view)) != com.iab.omid.library.pubnativenet.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.pubnativenet.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f35915c && cVarD == com.iab.omid.library.pubnativenet.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f35916d.add(new com.iab.omid.library.pubnativenet.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f35914b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.pubnativenet.processor.a aVarB = this.f35917e.b();
        String strB = this.f35918f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.pubnativenet.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.pubnativenet.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.pubnativenet.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0420a c0420aB = this.f35918f.b(view);
        if (c0420aB == null) {
            return false;
        }
        com.iab.omid.library.pubnativenet.utils.c.a(jSONObject, c0420aB);
        return true;
    }
}
