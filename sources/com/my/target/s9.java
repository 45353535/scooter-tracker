package com.my.target;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class s9 implements k6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f60804e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9 f60800a = u9.a(15000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f60801b = new Runnable() { // from class: k5.i2
        @Override // java.lang.Runnable
        public final void run() {
            this.f86053b.b();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l6 f60802c = new l6();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1 f60803d = new s1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60805f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f60806g = new HashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f60807a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f60808b = new HashMap();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f60809a = new ArrayList();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f60810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f60813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f60814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f60815f;

        public c(long j10, int i10, int i11, int i12, String str, String str2) {
            this.f60810a = j10;
            this.f60811b = i10;
            this.f60812c = i11;
            this.f60813d = i12;
            this.f60814e = str;
            this.f60815f = str2;
        }
    }

    @Override // com.my.target.k6
    public void a(s1 s1Var, Context context) {
        this.f60803d = s1Var;
        this.f60804e = context;
        if ((!TextUtils.isEmpty(s1Var.f60782h) && s1Var.f60782h.startsWith("com.my.targetdemo5.")) || "ru.mail.mailapp".equals(s1Var.f60782h) || "com.vkontakte.android".equals(s1Var.f60782h)) {
            this.f60805f = true;
        }
        this.f60800a.a(this.f60801b);
    }

    public final void b() {
        f0.d(new Runnable() { // from class: k5.j2
            @Override // java.lang.Runnable
            public final void run() {
                this.f86060b.a();
            }
        });
    }

    @Override // com.my.target.k6
    public void a(o oVar, int i10, int i11, int i12, String str, String str2) {
        c cVar = new c(SystemClock.elapsedRealtime(), i10, i11, i12, str, str2);
        synchronized (this) {
            try {
                a aVar = (a) this.f60806g.get(oVar);
                if (aVar == null) {
                    aVar = new a();
                    this.f60806g.put(oVar, aVar);
                }
                aVar.f60807a.add(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.my.target.k6
    public void a(h0 h0Var, int i10, int i11, int i12, String str, String str2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (h0Var.b()) {
            c cVar = new c(jElapsedRealtime, i10, i11, i12, str, str2);
            synchronized (this) {
                try {
                    o oVarA = h0Var.a();
                    a aVar = (a) this.f60806g.get(oVarA);
                    if (aVar == null) {
                        aVar = new a();
                        this.f60806g.put(oVarA, aVar);
                    }
                    b bVar = (b) aVar.f60808b.get(h0Var);
                    if (bVar == null) {
                        bVar = new b();
                        aVar.f60808b.put(h0Var, bVar);
                    }
                    bVar.f60809a.add(cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final /* synthetic */ void a() {
        Map map;
        Context context;
        synchronized (this) {
            map = this.f60806g;
            this.f60806g = new HashMap();
        }
        if (!this.f60805f || (context = this.f60804e) == null) {
            return;
        }
        this.f60802c.a(this.f60803d, map, context);
    }
}
