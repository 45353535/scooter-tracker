package com.vungle.ads.fpd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ug.z;
import vg.a;
import xg.d;
import xg.f;
import yg.i;
import yg.i2;
import yg.m0;
import yg.o0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/fpd/Revenue.$serializer", "Lyg/o0;", "Lcom/vungle/ads/fpd/Revenue;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/fpd/Revenue;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/fpd/Revenue;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Revenue$$serializer implements o0 {

    @NotNull
    public static final Revenue$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Revenue$$serializer revenue$$serializer = new Revenue$$serializer();
        INSTANCE = revenue$$serializer;
        i2 i2Var = new i2("com.vungle.ads.fpd.Revenue", revenue$$serializer, 4);
        i2Var.n("iaa_revenue_usd", true);
        i2Var.n("iap_revenue_usd", true);
        i2Var.n("total_revenue_usd", true);
        i2Var.n("is_user_a_purchaser", true);
        descriptor = i2Var;
    }

    private Revenue$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        m0 m0Var = m0.f119029a;
        return new KSerializer[]{a.t(m0Var), a.t(m0Var), a.t(m0Var), a.t(i.f118983a)};
    }

    @Override // ug.c
    @NotNull
    public Revenue deserialize(@NotNull Decoder decoder) {
        Object objP;
        int i10;
        Object objP2;
        Object objP3;
        Object objP4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        Object objP5 = null;
        if (dVarB.j()) {
            m0 m0Var = m0.f119029a;
            objP2 = dVarB.p(descriptor2, 0, m0Var, null);
            Object objP6 = dVarB.p(descriptor2, 1, m0Var, null);
            objP3 = dVarB.p(descriptor2, 2, m0Var, null);
            objP4 = dVarB.p(descriptor2, 3, i.f118983a, null);
            objP = objP6;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            objP = null;
            Object objP7 = null;
            Object objP8 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP5 = dVarB.p(descriptor2, 0, m0.f119029a, objP5);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP = dVarB.p(descriptor2, 1, m0.f119029a, objP);
                    i11 |= 2;
                } else if (iX == 2) {
                    objP7 = dVarB.p(descriptor2, 2, m0.f119029a, objP7);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new z(iX);
                    }
                    objP8 = dVarB.p(descriptor2, 3, i.f118983a, objP8);
                    i11 |= 8;
                }
            }
            i10 = i11;
            objP2 = objP5;
            objP3 = objP7;
            objP4 = objP8;
        }
        dVarB.c(descriptor2);
        return new Revenue(i10, (Float) objP2, (Float) objP, (Float) objP3, (Boolean) objP4, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull Revenue value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        Revenue.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
