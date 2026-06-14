package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class fv0 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fv0 f110934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f110935b;

    static {
        fv0 fv0Var = new fv0();
        f110934a = fv0Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.fonts.FontParameters", fv0Var, 1);
        i2Var.n("urls", false);
        f110935b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vg.a.t(nv0.f114054a)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        pv0 pv0Var;
        yg.i2 i2Var = f110935b;
        xg.d dVarB = decoder.b(i2Var);
        int i10 = 1;
        pv0 pv0Var2 = null;
        if (dVarB.j()) {
            pv0Var = (pv0) dVarB.p(i2Var, 0, nv0.f114054a, null);
        } else {
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
                    pv0Var2 = (pv0) dVarB.p(i2Var, 0, nv0.f114054a, pv0Var2);
                    i11 = 1;
                }
            }
            pv0Var = pv0Var2;
            i10 = i11;
        }
        dVarB.c(i2Var);
        return new hv0(i10, pv0Var);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f110935b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        yg.i2 i2Var = f110935b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.h(i2Var, 0, nv0.f114054a, ((hv0) obj).f111779a);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
