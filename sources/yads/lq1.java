package yads;

import com.ironsource.N6;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class lq1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lq1 f113188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f113189b;

    static {
        lq1 lq1Var = new lq1();
        f113188a = lq1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", lq1Var, 2);
        i2Var.n(N6.G1, false);
        i2Var.n("network_data", false);
        f113189b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yg.y2.f119104a, oq1.f114389d[1]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String strI;
        Map map;
        yg.i2 i2Var = f113189b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = oq1.f114389d;
        String strI2 = null;
        if (dVarB.j()) {
            strI = dVarB.i(i2Var, 0);
            map = (Map) dVarB.s(i2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Map map2 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI2 = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new ug.z(iX);
                    }
                    map2 = (Map) dVarB.s(i2Var, 1, kSerializerArr[1], map2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            strI = strI2;
            map = map2;
        }
        dVarB.c(i2Var);
        return new oq1(i10, strI, map);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f113189b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        oq1 oq1Var = (oq1) obj;
        yg.i2 i2Var = f113189b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = oq1.f114389d;
        fVarB.q(i2Var, 0, oq1Var.f114390b);
        fVarB.F(i2Var, 1, kSerializerArr[1], oq1Var.f114391c);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
