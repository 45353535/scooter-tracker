package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class tf2 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf2 f116229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f116230b;

    static {
        tf2 tf2Var = new tf2();
        f116229a = tf2Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", tf2Var, 3);
        i2Var.n("status", false);
        i2Var.n("error_message", false);
        i2Var.n("status_code", false);
        f116230b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vf2.f117003d[0], vg.a.t(yg.y2.f119104a), vg.a.t(yg.x0.f119093a)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        yf2 yf2Var;
        String str;
        Integer num;
        yg.i2 i2Var = f116230b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = vf2.f117003d;
        yf2 yf2Var2 = null;
        if (dVarB.j()) {
            yf2Var = (yf2) dVarB.s(i2Var, 0, kSerializerArr[0], null);
            str = (String) dVarB.p(i2Var, 1, yg.y2.f119104a, null);
            num = (Integer) dVarB.p(i2Var, 2, yg.x0.f119093a, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str2 = null;
            Integer num2 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    yf2Var2 = (yf2) dVarB.s(i2Var, 0, kSerializerArr[0], yf2Var2);
                    i11 |= 1;
                } else if (iX == 1) {
                    str2 = (String) dVarB.p(i2Var, 1, yg.y2.f119104a, str2);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new ug.z(iX);
                    }
                    num2 = (Integer) dVarB.p(i2Var, 2, yg.x0.f119093a, num2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            yf2Var = yf2Var2;
            str = str2;
            num = num2;
        }
        dVarB.c(i2Var);
        return new vf2(i10, yf2Var, str, num);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f116230b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        vf2 vf2Var = (vf2) obj;
        yg.i2 i2Var = f116230b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.F(i2Var, 0, vf2.f117003d[0], vf2Var.f117004a);
        fVarB.h(i2Var, 1, yg.y2.f119104a, vf2Var.f117005b);
        fVarB.h(i2Var, 2, yg.x0.f119093a, vf2Var.f117006c);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
