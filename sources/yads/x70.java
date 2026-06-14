package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class x70 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x70 f117731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f117732b;

    static {
        x70 x70Var = new x70();
        f117731a = x70Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", x70Var, 6);
        i2Var.n("app_data", false);
        i2Var.n("sdk_data", false);
        i2Var.n("adapters_data", false);
        i2Var.n("consents_data", false);
        i2Var.n("sdk_logs", false);
        i2Var.n("network_logs", false);
        f117732b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = z70.f118583g;
        return new KSerializer[]{x40.f117698a, e80.f110246a, kSerializerArr[2], e50.f110206a, kSerializerArr[4], kSerializerArr[5]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        z40 z40Var;
        g80 g80Var;
        List list;
        g50 g50Var;
        List list2;
        List list3;
        yg.i2 i2Var = f117732b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = z70.f118583g;
        int i11 = 3;
        z40 z40Var2 = null;
        if (dVarB.j()) {
            z40 z40Var3 = (z40) dVarB.s(i2Var, 0, x40.f117698a, null);
            g80 g80Var2 = (g80) dVarB.s(i2Var, 1, e80.f110246a, null);
            List list4 = (List) dVarB.s(i2Var, 2, kSerializerArr[2], null);
            g50 g50Var2 = (g50) dVarB.s(i2Var, 3, e50.f110206a, null);
            List list5 = (List) dVarB.s(i2Var, 4, kSerializerArr[4], null);
            list3 = (List) dVarB.s(i2Var, 5, kSerializerArr[5], null);
            z40Var = z40Var3;
            g50Var = g50Var2;
            i10 = 63;
            list2 = list5;
            list = list4;
            g80Var = g80Var2;
        } else {
            boolean z10 = true;
            int i12 = 0;
            g80 g80Var3 = null;
            List list6 = null;
            g50 g50Var3 = null;
            List list7 = null;
            List list8 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        z40Var2 = (z40) dVarB.s(i2Var, 0, x40.f117698a, z40Var2);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        g80Var3 = (g80) dVarB.s(i2Var, 1, e80.f110246a, g80Var3);
                        i12 |= 2;
                        break;
                    case 2:
                        list6 = (List) dVarB.s(i2Var, 2, kSerializerArr[2], list6);
                        i12 |= 4;
                        break;
                    case 3:
                        g50Var3 = (g50) dVarB.s(i2Var, i11, e50.f110206a, g50Var3);
                        i12 |= 8;
                        break;
                    case 4:
                        list7 = (List) dVarB.s(i2Var, 4, kSerializerArr[4], list7);
                        i12 |= 16;
                        break;
                    case 5:
                        list8 = (List) dVarB.s(i2Var, 5, kSerializerArr[5], list8);
                        i12 |= 32;
                        break;
                    default:
                        throw new ug.z(iX);
                }
            }
            i10 = i12;
            z40Var = z40Var2;
            g80Var = g80Var3;
            list = list6;
            g50Var = g50Var3;
            list2 = list7;
            list3 = list8;
        }
        dVarB.c(i2Var);
        return new z70(i10, z40Var, g80Var, list, g50Var, list2, list3);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f117732b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        z70 z70Var = (z70) obj;
        yg.i2 i2Var = f117732b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = z70.f118583g;
        fVarB.F(i2Var, 0, x40.f117698a, z70Var.f118584a);
        fVarB.F(i2Var, 1, e80.f110246a, z70Var.f118585b);
        fVarB.F(i2Var, 2, kSerializerArr[2], z70Var.f118586c);
        fVarB.F(i2Var, 3, e50.f110206a, z70Var.f118587d);
        fVarB.F(i2Var, 4, kSerializerArr[4], z70Var.f118588e);
        fVarB.F(i2Var, 5, kSerializerArr[5], z70Var.f118589f);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
