package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class zf2 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zf2 f118654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f118655b;

    static {
        zf2 zf2Var = new zf2();
        f118654a = zf2Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", zf2Var, 1);
        i2Var.n("value", false);
        f118655b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yg.c0.f118941a};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        double dG;
        yg.i2 i2Var = f118655b;
        xg.d dVarB = decoder.b(i2Var);
        int i10 = 1;
        if (dVarB.j()) {
            dG = dVarB.G(i2Var, 0);
        } else {
            double dG2 = 0.0d;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new ug.z(iX);
                    }
                    dG2 = dVarB.G(i2Var, 0);
                    i11 = 1;
                }
            }
            dG = dG2;
            i10 = i11;
        }
        dVarB.c(i2Var);
        return new bg2(i10, dG);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f118655b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        yg.i2 i2Var = f118655b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.G(i2Var, 0, ((bg2) obj).f108998a);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
