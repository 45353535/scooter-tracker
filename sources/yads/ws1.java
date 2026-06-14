package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class ws1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ws1 f117552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f117553b;

    static {
        ws1 ws1Var = new ws1();
        f117552a = ws1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", ws1Var, 5);
        i2Var.n("timestamp", false);
        i2Var.n("method", false);
        i2Var.n("url", false);
        i2Var.n("headers", false);
        i2Var.n("body", false);
        f117553b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = ys1.f118366f;
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{yg.i1.f118988a, y2Var, y2Var, vg.a.t(kSerializerArr[3]), vg.a.t(y2Var)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        Map map;
        String str3;
        long j10;
        yg.i2 i2Var = f117553b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = ys1.f118366f;
        String strI = null;
        if (dVarB.j()) {
            long jE = dVarB.e(i2Var, 0);
            String strI2 = dVarB.i(i2Var, 1);
            String strI3 = dVarB.i(i2Var, 2);
            map = (Map) dVarB.p(i2Var, 3, kSerializerArr[3], null);
            str = strI2;
            str3 = (String) dVarB.p(i2Var, 4, yg.y2.f119104a, null);
            str2 = strI3;
            i10 = 31;
            j10 = jE;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            long jE2 = 0;
            String strI4 = null;
            Map map2 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE2 = dVarB.e(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI = dVarB.i(i2Var, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    strI4 = dVarB.i(i2Var, 2);
                    i11 |= 4;
                } else if (iX == 3) {
                    map2 = (Map) dVarB.p(i2Var, 3, kSerializerArr[3], map2);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new ug.z(iX);
                    }
                    str4 = (String) dVarB.p(i2Var, 4, yg.y2.f119104a, str4);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = strI;
            str2 = strI4;
            map = map2;
            str3 = str4;
            j10 = jE2;
        }
        dVarB.c(i2Var);
        return new ys1(i10, j10, str, str2, map, str3);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f117553b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        ys1 ys1Var = (ys1) obj;
        yg.i2 i2Var = f117553b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = ys1.f118366f;
        fVarB.v(i2Var, 0, ys1Var.f118367a);
        fVarB.q(i2Var, 1, ys1Var.f118368b);
        fVarB.q(i2Var, 2, ys1Var.f118369c);
        fVarB.h(i2Var, 3, kSerializerArr[3], ys1Var.f118370d);
        fVarB.h(i2Var, 4, yg.y2.f119104a, ys1Var.f118371e);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
