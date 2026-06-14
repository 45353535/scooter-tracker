package yads;

import com.ironsource.N6;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class s30 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s30 f115677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f115678b;

    static {
        s30 s30Var = new s30();
        f115677a = s30Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", s30Var, 5);
        i2Var.n(N6.G1, true);
        i2Var.n("network_name", false);
        i2Var.n("bidding_parameters", false);
        i2Var.n("network_ad_unit_id", true);
        i2Var.n("network_ad_unit_id_name", true);
        f115678b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = u30.f116472f;
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{vg.a.t(y2Var), y2Var, kSerializerArr[2], vg.a.t(y2Var), vg.a.t(y2Var)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        yg.i2 i2Var = f115678b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = u30.f116472f;
        String str5 = null;
        if (dVarB.j()) {
            yg.y2 y2Var = yg.y2.f119104a;
            String str6 = (String) dVarB.p(i2Var, 0, y2Var, null);
            String strI = dVarB.i(i2Var, 1);
            List list2 = (List) dVarB.s(i2Var, 2, kSerializerArr[2], null);
            String str7 = (String) dVarB.p(i2Var, 3, y2Var, null);
            list = list2;
            str4 = (String) dVarB.p(i2Var, 4, y2Var, null);
            str3 = str7;
            i10 = 31;
            str2 = strI;
            str = str6;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strI2 = null;
            List list3 = null;
            String str8 = null;
            String str9 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    str5 = (String) dVarB.p(i2Var, 0, yg.y2.f119104a, str5);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI2 = dVarB.i(i2Var, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    list3 = (List) dVarB.s(i2Var, 2, kSerializerArr[2], list3);
                    i11 |= 4;
                } else if (iX == 3) {
                    str8 = (String) dVarB.p(i2Var, 3, yg.y2.f119104a, str8);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new ug.z(iX);
                    }
                    str9 = (String) dVarB.p(i2Var, 4, yg.y2.f119104a, str9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = str5;
            str2 = strI2;
            list = list3;
            str3 = str8;
            str4 = str9;
        }
        dVarB.c(i2Var);
        return new u30(i10, str, str2, list, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f115678b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        u30 u30Var = (u30) obj;
        yg.i2 i2Var = f115678b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = u30.f116472f;
        if (fVarB.r(i2Var, 0) || u30Var.f116473a != null) {
            fVarB.h(i2Var, 0, yg.y2.f119104a, u30Var.f116473a);
        }
        fVarB.q(i2Var, 1, u30Var.f116474b);
        fVarB.F(i2Var, 2, kSerializerArr[2], u30Var.f116475c);
        if (fVarB.r(i2Var, 3) || u30Var.f116476d != null) {
            fVarB.h(i2Var, 3, yg.y2.f119104a, u30Var.f116476d);
        }
        if (fVarB.r(i2Var, 4) || u30Var.f116477e != null) {
            fVarB.h(i2Var, 4, yg.y2.f119104a, u30Var.f116477e);
        }
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
