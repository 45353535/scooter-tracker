package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class od0 implements ni1 {
    @Override // yads.ni1
    public final pi1 a(mi1 mi1Var) {
        int i10 = w83.f117341a;
        if (i10 < 23 || i10 < 31) {
            return new p23().a(mi1Var);
        }
        int iD = tr1.d(mi1Var.f113511c.f118398m);
        uf1.c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + w83.d(iD));
        return new hj(iD).a(mi1Var);
    }
}
