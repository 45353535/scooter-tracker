package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class x40 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x40 f117698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f117699b;

    static {
        x40 x40Var = new x40();
        f117698a = x40Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", x40Var, 4);
        i2Var.n("app_id", false);
        i2Var.n("app_version", false);
        i2Var.n("system", false);
        i2Var.n("api_level", false);
        f117699b = i2Var;
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
        yg.i2 i2Var = f117699b;
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
        return new z40(i10, str3, str2, str, strI2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f117699b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        z40 z40Var = (z40) obj;
        yg.i2 i2Var = f117699b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.q(i2Var, 0, z40Var.f118537a);
        fVarB.q(i2Var, 1, z40Var.f118538b);
        fVarB.q(i2Var, 2, z40Var.f118539c);
        fVarB.q(i2Var, 3, z40Var.f118540d);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
