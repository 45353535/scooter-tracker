package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class r70 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r70 f115355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f115356b;

    static {
        r70 r70Var = new r70();
        f115355a = r70Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", r70Var, 6);
        i2Var.n("id", true);
        i2Var.n("name", false);
        i2Var.n("logo_url", true);
        i2Var.n("adapter_status", true);
        i2Var.n("adapters", false);
        i2Var.n("latest_adapter_version", true);
        f115356b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = t70.f116094g;
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{vg.a.t(y2Var), y2Var, vg.a.t(y2Var), vg.a.t(y2Var), kSerializerArr[4], vg.a.t(y2Var)};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        String str5;
        yg.i2 i2Var = f115356b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = t70.f116094g;
        int i11 = 5;
        String str6 = null;
        if (dVarB.j()) {
            yg.y2 y2Var = yg.y2.f119104a;
            String str7 = (String) dVarB.p(i2Var, 0, y2Var, null);
            String strI = dVarB.i(i2Var, 1);
            String str8 = (String) dVarB.p(i2Var, 2, y2Var, null);
            String str9 = (String) dVarB.p(i2Var, 3, y2Var, null);
            list = (List) dVarB.s(i2Var, 4, kSerializerArr[4], null);
            str5 = (String) dVarB.p(i2Var, 5, y2Var, null);
            i10 = 63;
            str4 = str9;
            str3 = str8;
            str2 = strI;
            str = str7;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String strI2 = null;
            String str10 = null;
            String str11 = null;
            List list2 = null;
            String str12 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        str6 = (String) dVarB.p(i2Var, 0, yg.y2.f119104a, str6);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        strI2 = dVarB.i(i2Var, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        str10 = (String) dVarB.p(i2Var, 2, yg.y2.f119104a, str10);
                        i12 |= 4;
                        break;
                    case 3:
                        str11 = (String) dVarB.p(i2Var, 3, yg.y2.f119104a, str11);
                        i12 |= 8;
                        break;
                    case 4:
                        list2 = (List) dVarB.s(i2Var, 4, kSerializerArr[4], list2);
                        i12 |= 16;
                        break;
                    case 5:
                        str12 = (String) dVarB.p(i2Var, i11, yg.y2.f119104a, str12);
                        i12 |= 32;
                        break;
                    default:
                        throw new ug.z(iX);
                }
            }
            i10 = i12;
            str = str6;
            str2 = strI2;
            str3 = str10;
            str4 = str11;
            list = list2;
            str5 = str12;
        }
        dVarB.c(i2Var);
        return new t70(i10, str, str2, str3, str4, list, str5);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f115356b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        t70 t70Var = (t70) obj;
        yg.i2 i2Var = f115356b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = t70.f116094g;
        if (fVarB.r(i2Var, 0) || t70Var.f116095a != null) {
            fVarB.h(i2Var, 0, yg.y2.f119104a, t70Var.f116095a);
        }
        fVarB.q(i2Var, 1, t70Var.f116096b);
        if (fVarB.r(i2Var, 2) || t70Var.f116097c != null) {
            fVarB.h(i2Var, 2, yg.y2.f119104a, t70Var.f116097c);
        }
        if (fVarB.r(i2Var, 3) || t70Var.f116098d != null) {
            fVarB.h(i2Var, 3, yg.y2.f119104a, t70Var.f116098d);
        }
        fVarB.F(i2Var, 4, kSerializerArr[4], t70Var.f116099e);
        if (fVarB.r(i2Var, 5) || t70Var.f116100f != null) {
            fVarB.h(i2Var, 5, yg.y2.f119104a, t70Var.f116100f);
        }
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
