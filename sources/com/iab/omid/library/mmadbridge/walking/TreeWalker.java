package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.processor.a;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import com.iab.omid.library.mmadbridge.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0405a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f35497i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f35498j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f35499k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f35500l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f35501m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35503b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35509h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f35502a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35504c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> f35505d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.a f35507f = new com.iab.omid.library.mmadbridge.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.processor.b f35506e = new com.iab.omid.library.mmadbridge.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.b f35508g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

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
            TreeWalker.this.f35508g.b();
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
            if (TreeWalker.f35499k != null) {
                TreeWalker.f35499k.post(TreeWalker.f35500l);
                TreeWalker.f35499k.postDelayed(TreeWalker.f35501m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f35509h);
    }

    private void e() {
        this.f35503b = 0;
        this.f35505d.clear();
        this.f35504c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f35504c = true;
                break;
            }
        }
        this.f35509h = f.b();
    }

    public static TreeWalker getInstance() {
        return f35497i;
    }

    private void i() {
        if (f35499k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f35499k = handler;
            handler.post(f35500l);
            f35499k.postDelayed(f35501m, 200L);
        }
    }

    private void k() {
        Handler handler = f35499k;
        if (handler != null) {
            handler.removeCallbacks(f35501m);
            f35499k = null;
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
        if (this.f35502a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f35502a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f35507f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.f35506e.a();
        if (this.f35507f.b().size() > 0) {
            for (String str : this.f35507f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f35507f.a(str), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f35508g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f35507f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            treeWalker.f35508g.b(jSONObjectA2, treeWalker.f35507f.c(), jB);
            if (treeWalker.f35504c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f35505d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f35508g.b();
        }
        treeWalker.f35507f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f35502a.clear();
        f35498j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f35502a.contains(treeWalkerTimeLogger)) {
            this.f35502a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f35502a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f35502a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f35503b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f35503b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f35507f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f35507f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f35507f.c(strC)));
        this.f35507f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0405a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f35507f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f35504c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f35505d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f35503b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.f35506e.b();
        String strB = this.f35507f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0407a c0407aB = this.f35507f.b(view);
        if (c0407aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0407aB);
        return true;
    }
}
