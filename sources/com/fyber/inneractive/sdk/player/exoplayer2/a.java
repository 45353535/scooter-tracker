package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f21574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.v f21576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21578f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21579g;

    public a(int i10) {
        this.f21573a = i10;
    }

    public abstract void a(int i10, Object obj);

    public abstract void a(long j10, long j11);

    public abstract void a(boolean z10, long j10);

    public void a(o[] oVarArr) {
    }

    public final void c() {
        if (this.f21575c != 1) {
            throw new IllegalStateException();
        }
        this.f21575c = 0;
        this.f21576d = null;
        this.f21579g = false;
        g();
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return null;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public final int a(p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        int iA = this.f21576d.a(pVar, cVar, z10);
        if (iA == -4) {
            if (cVar.b(4)) {
                this.f21578f = true;
                return this.f21579g ? -4 : -3;
            }
            cVar.f21722d += this.f21577e;
            return iA;
        }
        if (iA == -5) {
            o oVar = pVar.f22814a;
            long j10 = oVar.f22810w;
            if (j10 != Long.MAX_VALUE) {
                pVar.f22814a = new o(oVar.f22788a, oVar.f22792e, oVar.f22793f, oVar.f22790c, oVar.f22789b, oVar.f22794g, oVar.f22797j, oVar.f22798k, oVar.f22799l, oVar.f22800m, oVar.f22801n, oVar.f22803p, oVar.f22802o, oVar.f22804q, oVar.f22805r, oVar.f22806s, oVar.f22807t, oVar.f22808u, oVar.f22809v, oVar.f22811x, oVar.f22812y, oVar.f22813z, j10 + this.f21577e, oVar.f22795h, oVar.f22796i, oVar.f22791d);
            }
        }
        return iA;
    }
}
