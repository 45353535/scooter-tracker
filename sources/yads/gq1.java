package yads;

import com.ironsource.N6;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class gq1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gq1 f111300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f111301b;

    static {
        gq1 gq1Var = new gq1();
        f111300a = gq1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", gq1Var, 2);
        i2Var.n("ad_unit_id", false);
        i2Var.n(N6.E1, false);
        f111301b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yg.y2.f119104a, jq1.f112432d[1]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String strI;
        List list;
        yg.i2 i2Var = f111301b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = jq1.f112432d;
        String strI2 = null;
        if (dVarB.j()) {
            strI = dVarB.i(i2Var, 0);
            list = (List) dVarB.s(i2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
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
                    list2 = (List) dVarB.s(i2Var, 1, kSerializerArr[1], list2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            strI = strI2;
            list = list2;
        }
        dVarB.c(i2Var);
        return new jq1(i10, strI, list);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f111301b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        jq1 jq1Var = (jq1) obj;
        yg.i2 i2Var = f111301b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = jq1.f112432d;
        fVarB.q(i2Var, 0, jq1Var.f112433b);
        fVarB.F(i2Var, 1, kSerializerArr[1], jq1Var.f112434c);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
