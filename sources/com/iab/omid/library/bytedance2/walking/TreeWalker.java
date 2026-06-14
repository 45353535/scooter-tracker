package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0380a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f34697i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f34698j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f34699k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f34700l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f34701m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34703b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34709h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f34702a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34704c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f34705d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f34707f = new com.iab.omid.library.bytedance2.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f34706e = new com.iab.omid.library.bytedance2.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f34708g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f34708g.b();
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
            if (TreeWalker.f34699k != null) {
                TreeWalker.f34699k.post(TreeWalker.f34700l);
                TreeWalker.f34699k.postDelayed(TreeWalker.f34701m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f34709h);
    }

    private void e() {
        this.f34703b = 0;
        this.f34705d.clear();
        this.f34704c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f34704c = true;
                break;
            }
        }
        this.f34709h = f.b();
    }

    public static TreeWalker getInstance() {
        return f34697i;
    }

    private void i() {
        if (f34699k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f34699k = handler;
            handler.post(f34700l);
            f34699k.postDelayed(f34701m, 200L);
        }
    }

    private void k() {
        Handler handler = f34699k;
        if (handler != null) {
            handler.removeCallbacks(f34701m);
            f34699k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34702a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f34702a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f34707f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f34706e.a();
        if (this.f34707f.b().size() > 0) {
            for (String str : this.f34707f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f34707f.a(str), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f34708g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f34707f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f34708g.b(jSONObjectA2, treeWalker.f34707f.c(), jB);
            if (treeWalker.f34704c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f34705d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f34708g.b();
        }
        treeWalker.f34707f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f34702a.clear();
        f34698j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34702a.contains(treeWalkerTimeLogger)) {
            this.f34702a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f34702a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f34702a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f34703b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f34703b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f34707f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f34707f.f(view)));
        this.f34707f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0380a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f34707f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f34704c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f34705d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f34703b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f34706e.b();
        String strB = this.f34707f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0382a c0382aC = this.f34707f.c(view);
        if (c0382aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0382aC);
        return true;
    }
}
