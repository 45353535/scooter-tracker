package yads;

import android.net.Uri;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class da2 implements me1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f109861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h30 f109862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d13 f109864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ca2 f109865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f109866f;

    public da2(c30 c30Var, Uri uri, int i10, ca2 ca2Var) {
        this(c30Var, new g30().a(uri).a(1).a(), i10, ca2Var);
    }

    @Override // yads.me1
    public final void a() {
        this.f109864d.f109697b = 0L;
        e30 e30Var = new e30(this.f109864d, this.f109862b);
        try {
            e30Var.f110164a.a(e30Var.f110165b);
            e30Var.f110167d = true;
            Uri uriE = this.f109864d.f109696a.e();
            uriE.getClass();
            this.f109866f = this.f109865e.a(uriE, e30Var);
        } finally {
            w83.a((Closeable) e30Var);
        }
    }

    @Override // yads.me1
    public final void b() {
    }

    public da2(c30 c30Var, h30 h30Var, int i10, ca2 ca2Var) {
        this.f109864d = new d13(c30Var);
        this.f109862b = h30Var;
        this.f109863c = i10;
        this.f109865e = ca2Var;
        this.f109861a = ge1.a();
    }
}
