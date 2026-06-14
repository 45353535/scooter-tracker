package yads;

import com.ironsource.N6;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class f40 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f40 f110596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f110597b;

    static {
        f40 f40Var = new f40();
        f110596a = f40Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", f40Var, 6);
        i2Var.n(N6.G1, true);
        i2Var.n("network_name", false);
        i2Var.n("waterfall_parameters", false);
        i2Var.n("network_ad_unit_id_name", true);
        i2Var.n("currency", false);
        i2Var.n("cpm_floors", false);
        f110597b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = h40.f111470g;
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{vg.a.t(y2Var), y2Var, kSerializerArr[2], vg.a.t(y2Var), vg.a.t(v90.f116904a), kSerializerArr[5]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        List list;
        String str3;
        x90 x90Var;
        List list2;
        yg.i2 i2Var = f110597b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = h40.f111470g;
        int i11 = 3;
        String str4 = null;
        if (dVarB.j()) {
            yg.y2 y2Var = yg.y2.f119104a;
            String str5 = (String) dVarB.p(i2Var, 0, y2Var, null);
            String strI = dVarB.i(i2Var, 1);
            List list3 = (List) dVarB.s(i2Var, 2, kSerializerArr[2], null);
            String str6 = (String) dVarB.p(i2Var, 3, y2Var, null);
            x90 x90Var2 = (x90) dVarB.p(i2Var, 4, v90.f116904a, null);
            list2 = (List) dVarB.s(i2Var, 5, kSerializerArr[5], null);
            str3 = str6;
            x90Var = x90Var2;
            i10 = 63;
            list = list3;
            str2 = strI;
            str = str5;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String strI2 = null;
            List list4 = null;
            String str7 = null;
            x90 x90Var3 = null;
            List list5 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        str4 = (String) dVarB.p(i2Var, 0, yg.y2.f119104a, str4);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        strI2 = dVarB.i(i2Var, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        list4 = (List) dVarB.s(i2Var, 2, kSerializerArr[2], list4);
                        i12 |= 4;
                        break;
                    case 3:
                        str7 = (String) dVarB.p(i2Var, i11, yg.y2.f119104a, str7);
                        i12 |= 8;
                        break;
                    case 4:
                        x90Var3 = (x90) dVarB.p(i2Var, 4, v90.f116904a, x90Var3);
                        i12 |= 16;
                        break;
                    case 5:
                        list5 = (List) dVarB.s(i2Var, 5, kSerializerArr[5], list5);
                        i12 |= 32;
                        break;
                    default:
                        throw new ug.z(iX);
                }
            }
            i10 = i12;
            str = str4;
            str2 = strI2;
            list = list4;
            str3 = str7;
            x90Var = x90Var3;
            list2 = list5;
        }
        dVarB.c(i2Var);
        return new h40(i10, str, str2, list, str3, x90Var, list2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f110597b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        h40 h40Var = (h40) obj;
        yg.i2 i2Var = f110597b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = h40.f111470g;
        if (fVarB.r(i2Var, 0) || h40Var.f111471a != null) {
            fVarB.h(i2Var, 0, yg.y2.f119104a, h40Var.f111471a);
        }
        fVarB.q(i2Var, 1, h40Var.f111472b);
        fVarB.F(i2Var, 2, kSerializerArr[2], h40Var.f111473c);
        if (fVarB.r(i2Var, 3) || h40Var.f111474d != null) {
            fVarB.h(i2Var, 3, yg.y2.f119104a, h40Var.f111474d);
        }
        fVarB.h(i2Var, 4, v90.f116904a, h40Var.f111475e);
        fVarB.F(i2Var, 5, kSerializerArr[5], h40Var.f111476f);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
