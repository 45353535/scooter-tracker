package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class x30 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x30 f117692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f117693b;

    static {
        x30 x30Var = new x30();
        f117692a = x30Var;
        yg.i2 i2Var = new yg.i2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", x30Var, 2);
        i2Var.n(com.ironsource.mediationsdk.d.f43819h, false);
        i2Var.n("bidding", false);
        f117693b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = z30.f118530c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        List list;
        List list2;
        yg.i2 i2Var = f117693b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = z30.f118530c;
        List list3 = null;
        if (dVarB.j()) {
            list = (List) dVarB.s(i2Var, 0, kSerializerArr[0], null);
            list2 = (List) dVarB.s(i2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list4 = null;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    list3 = (List) dVarB.s(i2Var, 0, kSerializerArr[0], list3);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new ug.z(iX);
                    }
                    list4 = (List) dVarB.s(i2Var, 1, kSerializerArr[1], list4);
                    i11 |= 2;
                }
            }
            i10 = i11;
            list = list3;
            list2 = list4;
        }
        dVarB.c(i2Var);
        return new z30(i10, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f117693b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        z30 z30Var = (z30) obj;
        yg.i2 i2Var = f117693b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = z30.f118530c;
        fVarB.F(i2Var, 0, kSerializerArr[0], z30Var.f118531a);
        fVarB.F(i2Var, 1, kSerializerArr[1], z30Var.f118532b);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
