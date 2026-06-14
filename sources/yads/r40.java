package yads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class r40 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r40 f115293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f115294b;

    static {
        r40 r40Var = new r40();
        f115293a = r40Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", r40Var, 3);
        i2Var.n("title", true);
        i2Var.n(PglCryptUtils.KEY_MESSAGE, true);
        i2Var.n("type", true);
        f115294b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        yg.i2 i2Var = f115294b;
        xg.d dVarB = decoder.b(i2Var);
        String str4 = null;
        if (dVarB.j()) {
            yg.y2 y2Var = yg.y2.f119104a;
            str = (String) dVarB.p(i2Var, 0, y2Var, null);
            str2 = (String) dVarB.p(i2Var, 1, y2Var, null);
            str3 = (String) dVarB.p(i2Var, 2, y2Var, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str5 = null;
            String str6 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    str4 = (String) dVarB.p(i2Var, 0, yg.y2.f119104a, str4);
                    i11 |= 1;
                } else if (iX == 1) {
                    str5 = (String) dVarB.p(i2Var, 1, yg.y2.f119104a, str5);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new ug.z(iX);
                    }
                    str6 = (String) dVarB.p(i2Var, 2, yg.y2.f119104a, str6);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        dVarB.c(i2Var);
        return new t40(i10, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f115294b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        t40 t40Var = (t40) obj;
        yg.i2 i2Var = f115294b;
        xg.f fVarB = encoder.b(i2Var);
        if (fVarB.r(i2Var, 0) || t40Var.f116045a != null) {
            fVarB.h(i2Var, 0, yg.y2.f119104a, t40Var.f116045a);
        }
        if (fVarB.r(i2Var, 1) || t40Var.f116046b != null) {
            fVarB.h(i2Var, 1, yg.y2.f119104a, t40Var.f116046b);
        }
        if (fVarB.r(i2Var, 2) || t40Var.f116047c != null) {
            fVarB.h(i2Var, 2, yg.y2.f119104a, t40Var.f116047c);
        }
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
