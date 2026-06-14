package io.bidmachine.media3.exoplayer;

import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f80861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f80862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.h f80863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n9.e0 f80864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f80865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f80866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f80867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f80868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f80869i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f80870j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f80871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f80872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f80873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f80874n;

    public interface a {
        void b(g2 g2Var);
    }

    public interface b {
        void handleMessage(int i10, Object obj);
    }

    public g2(a aVar, b bVar, n9.e0 e0Var, int i10, q9.h hVar, Looper looper) {
        this.f80862b = aVar;
        this.f80861a = bVar;
        this.f80864d = e0Var;
        this.f80867g = looper;
        this.f80863c = hVar;
        this.f80868h = i10;
    }

    public boolean a() {
        return this.f80870j;
    }

    public Looper b() {
        return this.f80867g;
    }

    public int c() {
        return this.f80868h;
    }

    public Object d() {
        return this.f80866f;
    }

    public long e() {
        return this.f80869i;
    }

    public b f() {
        return this.f80861a;
    }

    public n9.e0 g() {
        return this.f80864d;
    }

    public int h() {
        return this.f80865e;
    }

    public synchronized boolean i() {
        return this.f80874n;
    }

    public synchronized void j(boolean z10) {
        this.f80872l = z10 | this.f80872l;
        this.f80873m = true;
        notifyAll();
    }

    public g2 k() {
        q9.a.g(!this.f80871k);
        if (this.f80869i == -9223372036854775807L) {
            q9.a.a(this.f80870j);
        }
        this.f80871k = true;
        this.f80862b.b(this);
        return this;
    }

    public g2 l(Object obj) {
        q9.a.g(!this.f80871k);
        this.f80866f = obj;
        return this;
    }

    public g2 m(int i10) {
        q9.a.g(!this.f80871k);
        this.f80865e = i10;
        return this;
    }
}
