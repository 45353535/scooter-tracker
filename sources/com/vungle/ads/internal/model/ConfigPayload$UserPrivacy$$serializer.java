package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.UserPrivacy.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConfigPayload$UserPrivacy$$serializer implements o0 {

    @NotNull
    public static final ConfigPayload$UserPrivacy$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$UserPrivacy$$serializer configPayload$UserPrivacy$$serializer = new ConfigPayload$UserPrivacy$$serializer();
        INSTANCE = configPayload$UserPrivacy$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.ConfigPayload.UserPrivacy", configPayload$UserPrivacy$$serializer, 2);
        i2Var.n("gdpr", true);
        i2Var.n("iab", true);
        descriptor = i2Var;
    }

    private ConfigPayload$UserPrivacy$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[]{a.t(ConfigPayload$GDPRSettings$$serializer.INSTANCE), a.t(ConfigPayload$IABSettings$$serializer.INSTANCE)};
    }

    @Override // ug.c
    @NotNull
    public ConfigPayload.UserPrivacy deserialize(@NotNull Decoder decoder) {
        Object objP;
        Object objP2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        if (dVarB.j()) {
            objP = dVarB.p(descriptor2, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, null);
            objP2 = dVarB.p(descriptor2, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            objP = null;
            Object objP3 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP = dVarB.p(descriptor2, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, objP);
                    i11 |= 1;
                } else {
                    if (iX != 1) {
                        throw new z(iX);
                    }
                    objP3 = dVarB.p(descriptor2, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, objP3);
                    i11 |= 2;
                }
            }
            objP2 = objP3;
            i10 = i11;
        }
        dVarB.c(descriptor2);
        return new ConfigPayload.UserPrivacy(i10, (ConfigPayload.GDPRSettings) objP, (ConfigPayload.IABSettings) objP2, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull ConfigPayload.UserPrivacy value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        ConfigPayload.UserPrivacy.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
