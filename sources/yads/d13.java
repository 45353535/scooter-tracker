package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d13 implements c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c30 f109696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f109697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f109698c = Uri.EMPTY;

    public d13(c30 c30Var) {
        this.f109696a = (c30) fi.a(c30Var);
    }

    @Override // yads.c30
    public final void a(e63 e63Var) {
        e63Var.getClass();
        this.f109696a.a(e63Var);
    }

    @Override // yads.c30
    public final Map c() {
        return this.f109696a.c();
    }

    @Override // yads.c30
    public final void close() {
        this.f109696a.close();
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f109696a.e();
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) {
        int iC = this.f109696a.c(bArr, i10, i11);
        if (iC != -1) {
            this.f109697b += (long) iC;
        }
        return iC;
    }

    @Override // yads.c30
    public final long a(h30 h30Var) {
        this.f109698c = h30Var.f111452a;
        long jA = this.f109696a.a(h30Var);
        Uri uriE = this.f109696a.e();
        uriE.getClass();
        this.f109698c = uriE;
        this.f109696a.c();
        return jA;
    }
}
