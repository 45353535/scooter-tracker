package com.iab.omid.library.corpmailru.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.c.a;
import com.iab.omid.library.corpmailru.d.d;
import com.iab.omid.library.corpmailru.d.f;
import com.iab.omid.library.corpmailru.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0389a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeWalker f34954a = new TreeWalker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f34955b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f34956c = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Runnable f34957j = new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Runnable f34958k = new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f34956c != null) {
                TreeWalker.f34956c.post(TreeWalker.f34957j);
                TreeWalker.f34956c.postDelayed(TreeWalker.f34958k, 200L);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34960e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f34964i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f34959d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f34962g = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.corpmailru.c.b f34961f = new com.iab.omid.library.corpmailru.c.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f34963h = new b(new com.iab.omid.library.corpmailru.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    TreeWalker() {
    }

    public static TreeWalker getInstance() {
        return f34954a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f34960e = 0;
        this.f34964i = d.a();
    }

    private void j() {
        a(d.a() - this.f34964i);
    }

    private void k() {
        if (f34956c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f34956c = handler;
            handler.post(f34957j);
            f34956c.postDelayed(f34958k, 200L);
        }
    }

    private void l() {
        Handler handler = f34956c;
        if (handler != null) {
            handler.removeCallbacks(f34958k);
            f34956c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34959d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f34959d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f34959d.clear();
        f34955b.post(new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f34963h.a();
            }
        });
    }

    public void c() {
        l();
    }

    @VisibleForTesting
    void d() {
        this.f34962g.c();
        long jA = d.a();
        com.iab.omid.library.corpmailru.c.a aVarA = this.f34961f.a();
        if (this.f34962g.b().size() > 0) {
            for (String str : this.f34962g.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f34962g.b(str), jSONObjectA);
                com.iab.omid.library.corpmailru.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f34963h.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.f34962g.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, c.PARENT_VIEW);
            com.iab.omid.library.corpmailru.d.b.a(jSONObjectA2);
            this.f34963h.a(jSONObjectA2, this.f34962g.a(), jA);
        } else {
            this.f34963h.a();
        }
        this.f34962g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34959d.contains(treeWalkerTimeLogger)) {
            this.f34959d.remove(treeWalkerTimeLogger);
        }
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0390a c0390aB = this.f34962g.b(view);
        if (c0390aB != null) {
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, c0390aB);
        }
    }

    public void a() {
        k();
    }

    private void a(long j10) {
        if (this.f34959d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f34959d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f34960e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f34960e, j10);
                }
            }
        }
    }

    @Override // com.iab.omid.library.corpmailru.c.a.InterfaceC0389a
    public void a(View view, com.iab.omid.library.corpmailru.c.a aVar, JSONObject jSONObject) {
        c cVarC;
        if (f.d(view) && (cVarC = this.f34962g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, jSONObjectA);
            if (!a(view, jSONObjectA)) {
                b(view, jSONObjectA);
                a(view, aVar, jSONObjectA, cVarC);
            }
            this.f34960e++;
        }
    }

    private void a(View view, com.iab.omid.library.corpmailru.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.corpmailru.c.a aVarB = this.f34961f.b();
        String strA = this.f34962g.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.corpmailru.d.b.a(jSONObjectA, str);
            com.iab.omid.library.corpmailru.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String strA = this.f34962g.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.corpmailru.d.b.a(jSONObject, strA);
        this.f34962g.e();
        return true;
    }
}
