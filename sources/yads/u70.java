package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class u70 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u70 f116556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f116557b;

    static {
        u70 u70Var = new u70();
        f116556a = u70Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", u70Var, 7);
        i2Var.n("page_id", true);
        i2Var.n("latest_sdk_version", true);
        i2Var.n("app_ads_txt_url", true);
        i2Var.n("app_status", true);
        i2Var.n("alerts", true);
        i2Var.n("ad_units", true);
        i2Var.n("mediation_networks", false);
        f116557b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = w70.f117328h;
        yg.y2 y2Var = yg.y2.f119104a;
        return new KSerializer[]{vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(kSerializerArr[4]), vg.a.t(kSerializerArr[5]), kSerializerArr[6]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        List list;
        List list2;
        String str;
        String str2;
        String str3;
        String str4;
        List list3;
        yg.i2 i2Var = f116557b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = w70.f117328h;
        int i11 = 3;
        String str5 = null;
        if (dVarB.j()) {
            yg.y2 y2Var = yg.y2.f119104a;
            String str6 = (String) dVarB.p(i2Var, 0, y2Var, null);
            String str7 = (String) dVarB.p(i2Var, 1, y2Var, null);
            String str8 = (String) dVarB.p(i2Var, 2, y2Var, null);
            String str9 = (String) dVarB.p(i2Var, 3, y2Var, null);
            List list4 = (List) dVarB.p(i2Var, 4, kSerializerArr[4], null);
            List list5 = (List) dVarB.p(i2Var, 5, kSerializerArr[5], null);
            list = (List) dVarB.s(i2Var, 6, kSerializerArr[6], null);
            str4 = str9;
            list3 = list4;
            str3 = str8;
            i10 = 127;
            list2 = list5;
            str2 = str7;
            str = str6;
        } else {
            boolean z10 = true;
            int i12 = 0;
            List list6 = null;
            List list7 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            List list8 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        str5 = (String) dVarB.p(i2Var, 0, yg.y2.f119104a, str5);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        str10 = (String) dVarB.p(i2Var, 1, yg.y2.f119104a, str10);
                        i12 |= 2;
                        i11 = 3;
                        break;
                    case 2:
                        str11 = (String) dVarB.p(i2Var, 2, yg.y2.f119104a, str11);
                        i12 |= 4;
                        i11 = 3;
                        break;
                    case 3:
                        str12 = (String) dVarB.p(i2Var, i11, yg.y2.f119104a, str12);
                        i12 |= 8;
                        break;
                    case 4:
                        list8 = (List) dVarB.p(i2Var, 4, kSerializerArr[4], list8);
                        i12 |= 16;
                        break;
                    case 5:
                        list7 = (List) dVarB.p(i2Var, 5, kSerializerArr[5], list7);
                        i12 |= 32;
                        break;
                    case 6:
                        list6 = (List) dVarB.s(i2Var, 6, kSerializerArr[6], list6);
                        i12 |= 64;
                        break;
                    default:
                        throw new ug.z(iX);
                }
            }
            i10 = i12;
            list = list6;
            list2 = list7;
            str = str5;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            list3 = list8;
        }
        dVarB.c(i2Var);
        return new w70(i10, str, str2, str3, str4, list3, list2, list);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f116557b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        w70 w70Var = (w70) obj;
        yg.i2 i2Var = f116557b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = w70.f117328h;
        if (fVarB.r(i2Var, 0) || w70Var.f117329a != null) {
            fVarB.h(i2Var, 0, yg.y2.f119104a, w70Var.f117329a);
        }
        if (fVarB.r(i2Var, 1) || w70Var.f117330b != null) {
            fVarB.h(i2Var, 1, yg.y2.f119104a, w70Var.f117330b);
        }
        if (fVarB.r(i2Var, 2) || w70Var.f117331c != null) {
            fVarB.h(i2Var, 2, yg.y2.f119104a, w70Var.f117331c);
        }
        if (fVarB.r(i2Var, 3) || w70Var.f117332d != null) {
            fVarB.h(i2Var, 3, yg.y2.f119104a, w70Var.f117332d);
        }
        if (fVarB.r(i2Var, 4) || w70Var.f117333e != null) {
            fVarB.h(i2Var, 4, kSerializerArr[4], w70Var.f117333e);
        }
        if (fVarB.r(i2Var, 5) || w70Var.f117334f != null) {
            fVarB.h(i2Var, 5, kSerializerArr[5], w70Var.f117334f);
        }
        fVarB.F(i2Var, 6, kSerializerArr[6], w70Var.f117335g);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
