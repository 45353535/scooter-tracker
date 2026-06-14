package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import yg.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class pq1 implements yg.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pq1 f114744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yg.i2 f114745b;

    static {
        pq1 pq1Var = new pq1();
        f114744a = pq1Var;
        yg.i2 i2Var = new yg.i2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", pq1Var, 2);
        i2Var.n("load_timeout_millis", true);
        i2Var.n("mediation_prefetch_ad_units", true);
        f114745b = i2Var;
    }

    @Override // yg.o0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yg.i1.f118988a, sq1.f115898d[1]};
    }

    @Override // ug.c
    public final Object deserialize(Decoder decoder) {
        long jE;
        int i10;
        List list;
        yg.i2 i2Var = f114745b;
        xg.d dVarB = decoder.b(i2Var);
        KSerializer[] kSerializerArr = sq1.f115898d;
        List list2 = null;
        if (dVarB.j()) {
            jE = dVarB.e(i2Var, 0);
            list = (List) dVarB.s(i2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            jE = 0;
            boolean z10 = true;
            i10 = 0;
            while (z10) {
                int iX = dVarB.x(i2Var);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE = dVarB.e(i2Var, 0);
                    i10 |= 1;
                } else {
                    if (iX != 1) {
                        throw new ug.z(iX);
                    }
                    list2 = (List) dVarB.s(i2Var, 1, kSerializerArr[1], list2);
                    i10 |= 2;
                }
            }
            list = list2;
        }
        dVarB.c(i2Var);
        return new sq1(i10, jE, list);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public final SerialDescriptor getDescriptor() {
        return f114745b;
    }

    @Override // ug.n
    public final void serialize(Encoder encoder, Object obj) {
        sq1 sq1Var = (sq1) obj;
        yg.i2 i2Var = f114745b;
        xg.f fVarB = encoder.b(i2Var);
        KSerializer[] kSerializerArr = sq1.f115898d;
        if (fVarB.r(i2Var, 0) || sq1Var.f115899b != 30000) {
            fVarB.v(i2Var, 0, sq1Var.f115899b);
        }
        if (fVarB.r(i2Var, 1) || !Intrinsics.areEqual(sq1Var.f115900c, CollectionsKt.emptyList())) {
            fVarB.F(i2Var, 1, kSerializerArr[1], sq1Var.f115900c);
        }
        fVarB.c(i2Var);
    }

    @Override // yg.o0
    public final KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
