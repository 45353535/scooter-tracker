package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class p30 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p30 f114542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f114543b;

    static {
        p30 p30Var = new p30();
        f114542a = p30Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", p30Var, 4);
        i2Var.n("name", false);
        i2Var.n("ad_type", false);
        i2Var.n("ad_unit_id", false);
        i2Var.n("mediation", true);
        f114543b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerT = vg.a.t(x30.f117692a);
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{y2Var, y2Var, y2Var, kSerializerT};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        z30 z30Var;
        yg.i2 i2Var = f114543b;
        xg.d dVarB = decoder.b(i2Var);
        String strI = null;
        if (dVarB.j()) {
            String strI2 = dVarB.i(i2Var, 0);
            String strI3 = dVarB.i(i2Var, 1);
            String strI4 = dVarB.i(i2Var, 2);
            str = strI2;
            z30Var = (z30) dVarB.p(i2Var, 3, x30.f117692a, null);
            str3 = strI4;
            str2 = strI3;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strI5 = null;
            String strI6 = null;
            z30 z30Var2 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI5 = dVarB.i(i2Var, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI6 = dVarB.i(i2Var, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new ug.z(iX);
                    }
                    z30Var2 = (z30) dVarB.p(i2Var, 3, x30.f117692a, z30Var2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strI;
            str2 = strI5;
            str3 = strI6;
            z30Var = z30Var2;
        }
        dVarB.c(i2Var);
        return new r30(i10, str, str2, str3, z30Var);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f114543b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        r30 r30Var = (r30) obj;
        yg.i2 i2Var = f114543b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.q(i2Var, 0, r30Var.f115289a);
        fVarB.q(i2Var, 1, r30Var.f115290b);
        fVarB.q(i2Var, 2, r30Var.f115291c);
        if (fVarB.r(i2Var, 3) || r30Var.f115292d != null) {
            fVarB.h(i2Var, 3, x30.f117692a, r30Var.f115292d);
        }
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
