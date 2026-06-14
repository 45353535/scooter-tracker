package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class e80 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e80 f110246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f110247b;

    static {
        e80 e80Var = new e80();
        f110246a = e80Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", e80Var, 3);
        i2Var.n("version", false);
        i2Var.n("is_integrated", false);
        i2Var.n("integration_messages", false);
        f110247b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yg.y2.f119104a, yg.i.f118983a, g80.f111103d[2]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        boolean zD;
        String strI;
        List list;
        yg.i2 i2Var = f110247b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = g80.f111103d;
        if (dVarB.j()) {
            strI = dVarB.i(i2Var, 0);
            zD = dVarB.D(i2Var, 1);
            list = (List) dVarB.s(i2Var, 2, kSerializerArr[2], null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strI2 = null;
            List list2 = null;
            boolean zD2 = false;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI2 = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    zD2 = dVarB.D(i2Var, 1);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new ug.z(iX);
                    }
                    list2 = (List) dVarB.s(i2Var, 2, kSerializerArr[2], list2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            zD = zD2;
            strI = strI2;
            list = list2;
        }
        dVarB.c(i2Var);
        return new g80(i10, strI, zD, list);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f110247b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        g80 g80Var = (g80) obj;
        yg.i2 i2Var = f110247b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = g80.f111103d;
        fVarB.q(i2Var, 0, g80Var.f111104a);
        fVarB.p(i2Var, 1, g80Var.f111105b);
        fVarB.F(i2Var, 2, kSerializerArr[2], g80Var.f111106c);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
