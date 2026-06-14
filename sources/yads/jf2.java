package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class jf2 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jf2 f112332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f112333b;

    static {
        jf2 jf2Var = new jf2();
        f112332a = jf2Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationNetworkWinner", jf2Var, 2);
        i2Var.n("name", false);
        i2Var.n("network_ad_unit", false);
        f112333b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{y2Var, y2Var};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        String strI;
        String strI2;
        int i10;
        yg.i2 i2Var = f112333b;
        xg.d dVarB = decoder.b(i2Var);
        if (dVarB.j()) {
            strI = dVarB.i(i2Var, 0);
            strI2 = dVarB.i(i2Var, 1);
            i10 = 3;
        } else {
            strI = null;
            String strI3 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new ug.z(iX);
                    }
                    strI3 = dVarB.i(i2Var, 1);
                    i11 |= 2;
                }
            }
            strI2 = strI3;
            i10 = i11;
        }
        dVarB.c(i2Var);
        return new lf2(i10, strI, strI2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f112333b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        lf2 lf2Var = (lf2) obj;
        yg.i2 i2Var = f112333b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.q(i2Var, 0, lf2Var.f113084a);
        fVarB.q(i2Var, 1, lf2Var.f113085b);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
