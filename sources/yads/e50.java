package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class e50 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e50 f110206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f110207b;

    static {
        e50 e50Var = new e50();
        f110206a = e50Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", e50Var, 4);
        i2Var.n("has_location_consent", false);
        i2Var.n("age_restricted_user", false);
        i2Var.n("has_user_consent", false);
        i2Var.n("has_cmp_value", false);
        f110207b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        yg.i iVar = yg.i.f118983a;
        return new KSerializer[]{iVar, vg.a.t(iVar), vg.a.t(iVar), iVar};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        boolean zD;
        boolean zD2;
        int i10;
        Boolean bool;
        Boolean bool2;
        yg.i2 i2Var = f110207b;
        xg.d dVarB = decoder.b(i2Var);
        if (dVarB.j()) {
            zD = dVarB.D(i2Var, 0);
            yg.i iVar = yg.i.f118983a;
            Boolean bool3 = (Boolean) dVarB.p(i2Var, 1, iVar, null);
            Boolean bool4 = (Boolean) dVarB.p(i2Var, 2, iVar, null);
            zD2 = dVarB.D(i2Var, 3);
            bool2 = bool4;
            bool = bool3;
            i10 = 15;
        } else {
            boolean z10 = true;
            zD = false;
            int i11 = 0;
            Boolean bool5 = null;
            Boolean bool6 = null;
            boolean zD3 = false;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    zD = dVarB.D(i2Var, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    bool5 = (Boolean) dVarB.p(i2Var, 1, yg.i.f118983a, bool5);
                    i11 |= 2;
                } else if (iX == 2) {
                    bool6 = (Boolean) dVarB.p(i2Var, 2, yg.i.f118983a, bool6);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new ug.z(iX);
                    }
                    zD3 = dVarB.D(i2Var, 3);
                    i11 |= 8;
                }
            }
            zD2 = zD3;
            i10 = i11;
            bool = bool5;
            bool2 = bool6;
        }
        boolean z11 = zD;
        dVarB.c(i2Var);
        return new g50(i10, z11, bool, bool2, zD2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f110207b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        g50 g50Var = (g50) obj;
        yg.i2 i2Var = f110207b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.p(i2Var, 0, g50Var.f111062a);
        yg.i iVar = yg.i.f118983a;
        fVarB.h(i2Var, 1, iVar, g50Var.f111063b);
        fVarB.h(i2Var, 2, iVar, g50Var.f111064c);
        fVarB.p(i2Var, 3, g50Var.f111065d);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
