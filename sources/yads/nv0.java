package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class nv0 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nv0 f114054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f114055b;

    static {
        nv0 nv0Var = new nv0();
        f114054a = nv0Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.fonts.FontUrls", nv0Var, 4);
        i2Var.n("regular", false);
        i2Var.n("bold", false);
        i2Var.n("light", false);
        i2Var.n("medium", false);
        f114055b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{y2Var, y2Var, y2Var, y2Var};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        String strI;
        String strI2;
        String str;
        String str2;
        int i10;
        yg.i2 i2Var = f114055b;
        xg.d dVarB = decoder.b(i2Var);
        if (dVarB.j()) {
            strI = dVarB.i(i2Var, 0);
            String strI3 = dVarB.i(i2Var, 1);
            String strI4 = dVarB.i(i2Var, 2);
            strI2 = dVarB.i(i2Var, 3);
            str = strI4;
            str2 = strI3;
            i10 = 15;
        } else {
            strI = null;
            String strI5 = null;
            String strI6 = null;
            String strI7 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI7 = dVarB.i(i2Var, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI6 = dVarB.i(i2Var, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new ug.z(iX);
                    }
                    strI5 = dVarB.i(i2Var, 3);
                    i11 |= 8;
                }
            }
            strI2 = strI5;
            str = strI6;
            str2 = strI7;
            i10 = i11;
        }
        String str3 = strI;
        dVarB.c(i2Var);
        return new pv0(i10, str3, str2, str, strI2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f114055b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        pv0 pv0Var = (pv0) obj;
        yg.i2 i2Var = f114055b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.q(i2Var, 0, pv0Var.f114795a);
        fVarB.q(i2Var, 1, pv0Var.f114796b);
        fVarB.q(i2Var, 2, pv0Var.f114797c);
        fVarB.q(i2Var, 3, pv0Var.f114798d);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
