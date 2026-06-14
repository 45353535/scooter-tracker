package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class kp1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kp1 f112800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f112801b;

    static {
        kp1 kp1Var = new kp1();
        f112800a = kp1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", kp1Var, 3);
        i2Var.n("format", false);
        i2Var.n("version", false);
        i2Var.n("isIntegrated", false);
        f112801b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{y2Var, vg.a.t(y2Var), yg.i.f118983a};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        boolean zD;
        int i10;
        String strI;
        String str;
        yg.i2 i2Var = f112801b;
        xg.d dVarB = decoder.b(i2Var);
        if (dVarB.j()) {
            strI = dVarB.i(i2Var, 0);
            str = (String) dVarB.p(i2Var, 1, yg.y2.f119104a, null);
            zD = dVarB.D(i2Var, 2);
            i10 = 7;
        } else {
            boolean z10 = true;
            boolean zD2 = false;
            String strI2 = null;
            String str2 = null;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI2 = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    str2 = (String) dVarB.p(i2Var, 1, yg.y2.f119104a, str2);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new ug.z(iX);
                    }
                    zD2 = dVarB.D(i2Var, 2);
                    i11 |= 4;
                }
            }
            zD = zD2;
            i10 = i11;
            strI = strI2;
            str = str2;
        }
        dVarB.c(i2Var);
        return new mp1(i10, strI, str, zD);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f112801b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        mp1 mp1Var = (mp1) obj;
        yg.i2 i2Var = f112801b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.q(i2Var, 0, mp1Var.f113579a);
        fVarB.h(i2Var, 1, yg.y2.f119104a, mp1Var.f113580b);
        fVarB.p(i2Var, 2, mp1Var.f113581c);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
