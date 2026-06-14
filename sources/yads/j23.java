package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j23 extends ha0 implements d23 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d23 f112227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f112228e;

    @Override // yads.d23
    public final long a(int i10) {
        d23 d23Var = this.f112227d;
        d23Var.getClass();
        return d23Var.a(i10) + this.f112228e;
    }

    @Override // yads.d23
    public final List b(long j10) {
        d23 d23Var = this.f112227d;
        d23Var.getClass();
        return d23Var.b(j10 - this.f112228e);
    }

    @Override // yads.d23
    public final int a() {
        d23 d23Var = this.f112227d;
        d23Var.getClass();
        return d23Var.a();
    }

    @Override // yads.d23
    public final int a(long j10) {
        d23 d23Var = this.f112227d;
        d23Var.getClass();
        return d23Var.a(j10 - this.f112228e);
    }
}
