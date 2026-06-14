package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class ip1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ip1 f112075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f112076b;

    static {
        ip1 ip1Var = new ip1();
        f112075a = ip1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", ip1Var, 4);
        i2Var.n("name", false);
        i2Var.n("id", false);
        i2Var.n("version", false);
        i2Var.n("adapters", false);
        f112076b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = np1.f113993e;
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{y2Var, y2Var, vg.a.t(y2Var), kSerializerArr[3]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        List list;
        yg.i2 i2Var = f112076b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = np1.f113993e;
        String strI = null;
        if (dVarB.j()) {
            String strI2 = dVarB.i(i2Var, 0);
            String strI3 = dVarB.i(i2Var, 1);
            String str4 = (String) dVarB.p(i2Var, 2, yg.y2.f119104a, null);
            list = (List) dVarB.s(i2Var, 3, kSerializerArr[3], null);
            str = strI2;
            str3 = str4;
            i10 = 15;
            str2 = strI3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strI4 = null;
            String str5 = null;
            List list2 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI4 = dVarB.i(i2Var, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    str5 = (String) dVarB.p(i2Var, 2, yg.y2.f119104a, str5);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new ug.z(iX);
                    }
                    list2 = (List) dVarB.s(i2Var, 3, kSerializerArr[3], list2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strI;
            str2 = strI4;
            str3 = str5;
            list = list2;
        }
        dVarB.c(i2Var);
        return new np1(i10, str, str2, str3, list);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f112076b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        np1 np1Var = (np1) obj;
        yg.i2 i2Var = f112076b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = np1.f113993e;
        fVarB.q(i2Var, 0, np1Var.f113994a);
        fVarB.q(i2Var, 1, np1Var.f113995b);
        fVarB.h(i2Var, 2, yg.y2.f119104a, np1Var.f113996c);
        fVarB.F(i2Var, 3, kSerializerArr[3], np1Var.f113997d);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
