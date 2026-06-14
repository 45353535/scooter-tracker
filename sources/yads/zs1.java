package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class zs1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zs1 f118796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f118797b;

    static {
        zs1 zs1Var = new zs1();
        f118796a = zs1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", zs1Var, 4);
        i2Var.n("timestamp", false);
        i2Var.n("code", false);
        i2Var.n("headers", false);
        i2Var.n("body", false);
        f118797b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yg.i1.f118988a, vg.a.t(yg.x0.f119093a), vg.a.t(bt1.f109096e[2]), vg.a.t(yg.y2.f119104a)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        Integer num;
        Map map;
        String str;
        long j10;
        yg.i2 i2Var = f118797b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = bt1.f109096e;
        Integer num2 = null;
        if (dVarB.j()) {
            long jE = dVarB.e(i2Var, 0);
            Integer num3 = (Integer) dVarB.p(i2Var, 1, yg.x0.f119093a, null);
            map = (Map) dVarB.p(i2Var, 2, kSerializerArr[2], null);
            num = num3;
            str = (String) dVarB.p(i2Var, 3, yg.y2.f119104a, null);
            i10 = 15;
            j10 = jE;
        } else {
            boolean z10 = true;
            int i11 = 0;
            long jE2 = 0;
            Map map2 = null;
            String str2 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE2 = dVarB.e(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    num2 = (Integer) dVarB.p(i2Var, 1, yg.x0.f119093a, num2);
                    i11 |= 2;
                } else if (iX == 2) {
                    map2 = (Map) dVarB.p(i2Var, 2, kSerializerArr[2], map2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new ug.z(iX);
                    }
                    str2 = (String) dVarB.p(i2Var, 3, yg.y2.f119104a, str2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            num = num2;
            map = map2;
            str = str2;
            j10 = jE2;
        }
        dVarB.c(i2Var);
        return new bt1(i10, j10, num, map, str);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f118797b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        bt1 bt1Var = (bt1) obj;
        yg.i2 i2Var = f118797b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = bt1.f109096e;
        fVarB.v(i2Var, 0, bt1Var.f109097a);
        fVarB.h(i2Var, 1, yg.x0.f119093a, bt1Var.f109098b);
        fVarB.h(i2Var, 2, kSerializerArr[2], bt1Var.f109099c);
        fVarB.h(i2Var, 3, yg.y2.f119104a, bt1Var.f109100d);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
