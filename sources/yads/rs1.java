package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class rs1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rs1 f115564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f115565b;

    static {
        rs1 rs1Var = new rs1();
        f115564a = rs1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", rs1Var, 2);
        i2Var.n("request", false);
        i2Var.n("response", false);
        f115565b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ws1.f117552a, vg.a.t(zs1.f118796a)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        ys1 ys1Var;
        bt1 bt1Var;
        yg.i2 i2Var = f115565b;
        xg.d dVarB = decoder.b(i2Var);
        ys1 ys1Var2 = null;
        if (dVarB.j()) {
            ys1Var = (ys1) dVarB.s(i2Var, 0, ws1.f117552a, null);
            bt1Var = (bt1) dVarB.p(i2Var, 1, zs1.f118796a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            bt1 bt1Var2 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    ys1Var2 = (ys1) dVarB.s(i2Var, 0, ws1.f117552a, ys1Var2);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new ug.z(iX);
                    }
                    bt1Var2 = (bt1) dVarB.p(i2Var, 1, zs1.f118796a, bt1Var2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            ys1Var = ys1Var2;
            bt1Var = bt1Var2;
        }
        dVarB.c(i2Var);
        return new ts1(i10, ys1Var, bt1Var);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f115565b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        ts1 ts1Var = (ts1) obj;
        yg.i2 i2Var = f115565b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.F(i2Var, 0, ws1.f117552a, ts1Var.f116354a);
        fVarB.h(i2Var, 1, zs1.f118796a, ts1Var.f116355b);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
