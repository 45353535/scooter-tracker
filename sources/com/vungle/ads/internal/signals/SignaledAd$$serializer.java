package com.vungle.ads.internal.signals;

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
import yg.i1;
import yg.i2;
import yg.o0;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/signals/SignaledAd.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/signals/SignaledAd;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/signals/SignaledAd;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/signals/SignaledAd;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SignaledAd$$serializer implements o0 {

    @NotNull
    public static final SignaledAd$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SignaledAd$$serializer signaledAd$$serializer = new SignaledAd$$serializer();
        INSTANCE = signaledAd$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.signals.SignaledAd", signaledAd$$serializer, 5);
        i2Var.n("500", true);
        i2Var.n("109", false);
        i2Var.n("107", true);
        i2Var.n("110", true);
        i2Var.n("108", true);
        descriptor = i2Var;
    }

    private SignaledAd$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        KSerializer kSerializerT = a.t(y2Var);
        KSerializer kSerializerT2 = a.t(y2Var);
        i1 i1Var = i1.f118988a;
        return new KSerializer[]{kSerializerT, i1Var, kSerializerT2, i1Var, x0.f119093a};
    }

    @Override // ug.c
    @NotNull
    public SignaledAd deserialize(@NotNull Decoder decoder) {
        long jE;
        long jE2;
        int i10;
        Object objP;
        int iF;
        Object objP2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        int i11 = 3;
        if (dVarB.j()) {
            y2 y2Var = y2.f119104a;
            objP = dVarB.p(descriptor2, 0, y2Var, null);
            long jE3 = dVarB.e(descriptor2, 1);
            objP2 = dVarB.p(descriptor2, 2, y2Var, null);
            long jE4 = dVarB.e(descriptor2, 3);
            i10 = 31;
            iF = dVarB.f(descriptor2, 4);
            jE2 = jE3;
            jE = jE4;
        } else {
            jE = 0;
            boolean z10 = true;
            int iF2 = 0;
            Object objP3 = null;
            Object objP4 = null;
            jE2 = 0;
            int i12 = 0;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP3 = dVarB.p(descriptor2, 0, y2.f119104a, objP3);
                    i12 |= 1;
                } else if (iX == 1) {
                    jE2 = dVarB.e(descriptor2, 1);
                    i12 |= 2;
                } else if (iX == 2) {
                    objP4 = dVarB.p(descriptor2, 2, y2.f119104a, objP4);
                    i12 |= 4;
                } else if (iX == i11) {
                    jE = dVarB.e(descriptor2, i11);
                    i12 |= 8;
                } else {
                    if (iX != 4) {
                        throw new z(iX);
                    }
                    iF2 = dVarB.f(descriptor2, 4);
                    i12 |= 16;
                }
                i11 = 3;
            }
            i10 = i12;
            objP = objP3;
            iF = iF2;
            objP2 = objP4;
        }
        dVarB.c(descriptor2);
        return new SignaledAd(i10, (String) objP, jE2, (String) objP2, jE, iF, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull SignaledAd value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        SignaledAd.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
