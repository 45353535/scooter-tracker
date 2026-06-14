package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class q12 implements j43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f114849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r12 f114850b;

    public q12(r12 r12Var, long j10) {
        this.f114850b = r12Var;
        this.f114849a = j10;
    }

    @Override // yads.j43
    public final void a(long j10, long j11) {
        oh2 oh2Var = this.f114850b.f115274d;
        if (oh2Var != null) {
            long j12 = this.f114849a;
            oh2Var.a(j12, j12 - j10);
        }
    }
}
