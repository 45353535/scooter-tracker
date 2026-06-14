package yads;

import com.taurusx.tax.y.z.w.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class jt1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jt1 f112455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f112456b;

    static {
        jt1 jt1Var = new jt1();
        f112455a = jt1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", jt1Var, 4);
        i2Var.n("timestamp", false);
        i2Var.n("type", false);
        i2Var.n(s.z.f67720z, false);
        i2Var.n("text", false);
        f112456b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{yg.i1.f118988a, y2Var, y2Var, y2Var};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        String strI;
        String strI2;
        String str;
        int i10;
        long j10;
        yg.i2 i2Var = f112456b;
        xg.d dVarB = decoder.b(i2Var);
        if (dVarB.j()) {
            long jE = dVarB.e(i2Var, 0);
            strI = dVarB.i(i2Var, 1);
            String strI3 = dVarB.i(i2Var, 2);
            strI2 = dVarB.i(i2Var, 3);
            str = strI3;
            i10 = 15;
            j10 = jE;
        } else {
            strI = null;
            boolean z10 = true;
            int i11 = 0;
            long jE2 = 0;
            String strI4 = null;
            String strI5 = null;
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
                    strI5 = dVarB.i(i2Var, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new ug.z(iX);
                    }
                    strI4 = dVarB.i(i2Var, 3);
                    i11 |= 8;
                }
            }
            strI2 = strI4;
            str = strI5;
            i10 = i11;
            j10 = jE2;
        }
        String str2 = strI;
        dVarB.c(i2Var);
        return new lt1(i10, j10, str2, str, strI2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f112456b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        lt1 lt1Var = (lt1) obj;
        yg.i2 i2Var = f112456b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.v(i2Var, 0, lt1Var.f113219a);
        fVarB.q(i2Var, 1, lt1Var.f113220b);
        fVarB.q(i2Var, 2, lt1Var.f113221c);
        fVarB.q(i2Var, 3, lt1Var.f113222d);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
