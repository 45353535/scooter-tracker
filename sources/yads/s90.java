package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class s90 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s90 f115721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f115722b;

    static {
        s90 s90Var = new s90();
        f115721a = s90Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", s90Var, 2);
        i2Var.n("network_ad_unit_id", false);
        i2Var.n("min_cpm", false);
        f115722b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yg.y2.f119104a, yg.c0.f118941a};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        String strI;
        double dG;
        int i10;
        yg.i2 i2Var = f115722b;
        xg.d dVarB = decoder.b(i2Var);
        if (dVarB.j()) {
            strI = dVarB.i(i2Var, 0);
            dG = dVarB.G(i2Var, 1);
            i10 = 3;
        } else {
            strI = null;
            double dG2 = 0.0d;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(i2Var, 0);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new ug.z(iX);
                    }
                    dG2 = dVarB.G(i2Var, 1);
                    i11 |= 2;
                }
            }
            dG = dG2;
            i10 = i11;
        }
        dVarB.c(i2Var);
        return new u90(i10, strI, dG);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f115722b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        u90 u90Var = (u90) obj;
        yg.i2 i2Var = f115722b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.q(i2Var, 0, u90Var.f116570a);
        fVarB.G(i2Var, 1, u90Var.f116571b);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
