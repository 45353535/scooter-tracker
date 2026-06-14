package yads;

import com.ironsource.N6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class bf2 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bf2 f108991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f108992b;

    static {
        bf2 bf2Var = new bf2();
        f108991a = bf2Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", bf2Var, 5);
        i2Var.n(N6.G1, false);
        i2Var.n("network_winner", false);
        i2Var.n("revenue", false);
        i2Var.n("result", false);
        i2Var.n("network_ad_info", false);
        f108992b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{y2Var, vg.a.t(jf2.f112332a), vg.a.t(zf2.f118654a), tf2.f116229a, vg.a.t(y2Var)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        lf2 lf2Var;
        bg2 bg2Var;
        vf2 vf2Var;
        String str2;
        yg.i2 i2Var = f108992b;
        xg.d dVarB = decoder.b(i2Var);
        String strI = null;
        if (dVarB.j()) {
            String strI2 = dVarB.i(i2Var, 0);
            lf2 lf2Var2 = (lf2) dVarB.p(i2Var, 1, jf2.f112332a, null);
            bg2 bg2Var2 = (bg2) dVarB.p(i2Var, 2, zf2.f118654a, null);
            str = strI2;
            vf2Var = (vf2) dVarB.s(i2Var, 3, tf2.f116229a, null);
            str2 = (String) dVarB.p(i2Var, 4, yg.y2.f119104a, null);
            bg2Var = bg2Var2;
            lf2Var = lf2Var2;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            lf2 lf2Var3 = null;
            bg2 bg2Var3 = null;
            vf2 vf2Var2 = null;
            String str3 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    lf2Var3 = (lf2) dVarB.p(i2Var, 1, jf2.f112332a, lf2Var3);
                    i11 |= 2;
                } else if (iX == 2) {
                    bg2Var3 = (bg2) dVarB.p(i2Var, 2, zf2.f118654a, bg2Var3);
                    i11 |= 4;
                } else if (iX == 3) {
                    vf2Var2 = (vf2) dVarB.s(i2Var, 3, tf2.f116229a, vf2Var2);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new ug.z(iX);
                    }
                    str3 = (String) dVarB.p(i2Var, 4, yg.y2.f119104a, str3);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = strI;
            lf2Var = lf2Var3;
            bg2Var = bg2Var3;
            vf2Var = vf2Var2;
            str2 = str3;
        }
        dVarB.c(i2Var);
        return new df2(i10, str, lf2Var, bg2Var, vf2Var, str2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f108992b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        df2 df2Var = (df2) obj;
        yg.i2 i2Var = f108992b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.q(i2Var, 0, df2Var.f109906a);
        fVarB.h(i2Var, 1, jf2.f112332a, df2Var.f109907b);
        fVarB.h(i2Var, 2, zf2.f118654a, df2Var.f109908c);
        fVarB.F(i2Var, 3, tf2.f116229a, df2Var.f109909d);
        fVarB.h(i2Var, 4, yg.y2.f119104a, df2Var.f109910e);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
