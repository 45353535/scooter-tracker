package com.iab.omid.library.bigosg.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.c.a;
import com.iab.omid.library.bigosg.d.d;
import com.iab.omid.library.bigosg.d.f;
import com.iab.omid.library.bigosg.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0377a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeWalker f34571a = new TreeWalker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f34572b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f34573c = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Runnable f34574j = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public final void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Runnable f34575k = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public final void run() {
            if (TreeWalker.f34573c != null) {
                TreeWalker.f34573c.post(TreeWalker.f34574j);
                TreeWalker.f34573c.postDelayed(TreeWalker.f34575k, 200L);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34577e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f34581i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f34576d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f34579g = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bigosg.c.b f34578f = new com.iab.omid.library.bigosg.c.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f34580h = new b(new com.iab.omid.library.bigosg.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    TreeWalker() {
    }

    public static TreeWalker getInstance() {
        return f34571a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f34577e = 0;
        this.f34581i = d.a();
    }

    private void j() {
        a(d.a() - this.f34581i);
    }

    private void k() {
        if (f34573c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f34573c = handler;
            handler.post(f34574j);
            f34573c.postDelayed(f34575k, 200L);
        }
    }

    private void l() {
        Handler handler = f34573c;
        if (handler != null) {
            handler.removeCallbacks(f34575k);
            f34573c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34576d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f34576d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f34576d.clear();
        f34572b.post(new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f34580h.a();
            }
        });
    }

    public void c() {
        l();
    }

    @VisibleForTesting
    void d() {
        this.f34579g.c();
        long jA = d.a();
        com.iab.omid.library.bigosg.c.a aVarA = this.f34578f.a();
        if (this.f34579g.b().size() > 0) {
            for (String str : this.f34579g.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f34579g.b(str), jSONObjectA);
                com.iab.omid.library.bigosg.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f34580h.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.f34579g.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, c.PARENT_VIEW);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA2);
            this.f34580h.a(jSONObjectA2, this.f34579g.a(), jA);
        } else {
            this.f34580h.a();
        }
        this.f34579g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f34576d.contains(treeWalkerTimeLogger)) {
            this.f34576d.remove(treeWalkerTimeLogger);
        }
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0378a c0378aB = this.f34579g.b(view);
        if (c0378aB != null) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, c0378aB);
        }
    }

    public void a() {
        k();
    }

    private void a(long j10) {
        if (this.f34576d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f34576d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f34577e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f34577e, j10);
                }
            }
        }
    }

    @Override // com.iab.omid.library.bigosg.c.a.InterfaceC0377a
    public void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject) {
        c cVarC;
        if (f.d(view) && (cVarC = this.f34579g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
            if (!a(view, jSONObjectA)) {
                b(view, jSONObjectA);
                a(view, aVar, jSONObjectA, cVarC);
            }
            this.f34577e++;
        }
    }

    private void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bigosg.c.a aVarB = this.f34578f.b();
        String strA = this.f34579g.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA, str);
            com.iab.omid.library.bigosg.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String strA = this.f34579g.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.bigosg.d.b.a(jSONObject, strA);
        this.f34579g.e();
        return true;
    }
}
