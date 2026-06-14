package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.AdPayload;
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
import yg.i2;
import yg.o0;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.CacheableReplacement.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdPayload$CacheableReplacement$$serializer implements o0 {

    @NotNull
    public static final AdPayload$CacheableReplacement$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$CacheableReplacement$$serializer adPayload$CacheableReplacement$$serializer = new AdPayload$CacheableReplacement$$serializer();
        INSTANCE = adPayload$CacheableReplacement$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", adPayload$CacheableReplacement$$serializer, 3);
        i2Var.n("url", true);
        i2Var.n("extension", true);
        i2Var.n("download_percent", true);
        descriptor = i2Var;
    }

    private AdPayload$CacheableReplacement$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{a.t(y2Var), a.t(y2Var), a.t(x0.f119093a)};
    }

    @Override // ug.c
    @NotNull
    public AdPayload.CacheableReplacement deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objP;
        Object objP2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        Object objP3 = null;
        if (dVarB.j()) {
            y2 y2Var = y2.f119104a;
            Object objP4 = dVarB.p(descriptor2, 0, y2Var, null);
            objP = dVarB.p(descriptor2, 1, y2Var, null);
            objP2 = dVarB.p(descriptor2, 2, x0.f119093a, null);
            objP3 = objP4;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objP5 = null;
            Object objP6 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP3 = dVarB.p(descriptor2, 0, y2.f119104a, objP3);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP5 = dVarB.p(descriptor2, 1, y2.f119104a, objP5);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new z(iX);
                    }
                    objP6 = dVarB.p(descriptor2, 2, x0.f119093a, objP6);
                    i11 |= 4;
                }
            }
            i10 = i11;
            objP = objP5;
            objP2 = objP6;
        }
        dVarB.c(descriptor2);
        return new AdPayload.CacheableReplacement(i10, (String) objP3, (String) objP, (Integer) objP2, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull AdPayload.CacheableReplacement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        AdPayload.CacheableReplacement.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
