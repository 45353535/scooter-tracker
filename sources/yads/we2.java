package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class we2 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we2 f117438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f117439b;

    static {
        we2 we2Var = new we2();
        f117438a = we2Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", we2Var, 1);
        i2Var.n("prefetched_mediation_data", false);
        f117439b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ye2.f118167b[0]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        List list;
        yg.i2 i2Var = f117439b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = ye2.f118167b;
        int i10 = 1;
        List list2 = null;
        if (dVarB.j()) {
            list = (List) dVarB.s(i2Var, 0, kSerializerArr[0], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new ug.z(iX);
                    }
                    list2 = (List) dVarB.s(i2Var, 0, kSerializerArr[0], list2);
                    i11 = 1;
                }
            }
            list = list2;
            i10 = i11;
        }
        dVarB.c(i2Var);
        return new ye2(i10, list);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f117439b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        yg.i2 i2Var = f117439b;
        xg.f fVarB = encoder.b(i2Var);
        fVarB.F(i2Var, 0, ye2.f118167b[0], ((ye2) obj).f118168a);
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
