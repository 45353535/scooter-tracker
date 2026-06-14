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
import yg.i;
import yg.i2;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.GDPRSettings.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConfigPayload$GDPRSettings$$serializer implements o0 {

    @NotNull
    public static final ConfigPayload$GDPRSettings$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$GDPRSettings$$serializer configPayload$GDPRSettings$$serializer = new ConfigPayload$GDPRSettings$$serializer();
        INSTANCE = configPayload$GDPRSettings$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", configPayload$GDPRSettings$$serializer, 6);
        i2Var.n("is_country_data_protected", true);
        i2Var.n("consent_title", true);
        i2Var.n("consent_message", true);
        i2Var.n("consent_message_version", true);
        i2Var.n("button_accept", true);
        i2Var.n("button_deny", true);
        descriptor = i2Var;
    }

    private ConfigPayload$GDPRSettings$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer kSerializerT = a.t(i.f118983a);
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{kSerializerT, a.t(y2Var), a.t(y2Var), a.t(y2Var), a.t(y2Var), a.t(y2Var)};
    }

    @Override // ug.c
    @NotNull
    public ConfigPayload.GDPRSettings deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        Object objP6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        int i11 = 5;
        Object objP7 = null;
        if (dVarB.j()) {
            objP = dVarB.p(descriptor2, 0, i.f118983a, null);
            y2 y2Var = y2.f119104a;
            objP2 = dVarB.p(descriptor2, 1, y2Var, null);
            objP3 = dVarB.p(descriptor2, 2, y2Var, null);
            objP4 = dVarB.p(descriptor2, 3, y2Var, null);
            objP5 = dVarB.p(descriptor2, 4, y2Var, null);
            objP6 = dVarB.p(descriptor2, 5, y2Var, null);
            i10 = 63;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object objP8 = null;
            Object objP9 = null;
            Object objP10 = null;
            Object objP11 = null;
            Object objP12 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        objP7 = dVarB.p(descriptor2, 0, i.f118983a, objP7);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        objP8 = dVarB.p(descriptor2, 1, y2.f119104a, objP8);
                        i12 |= 2;
                        break;
                    case 2:
                        objP9 = dVarB.p(descriptor2, 2, y2.f119104a, objP9);
                        i12 |= 4;
                        break;
                    case 3:
                        objP10 = dVarB.p(descriptor2, 3, y2.f119104a, objP10);
                        i12 |= 8;
                        break;
                    case 4:
                        objP11 = dVarB.p(descriptor2, 4, y2.f119104a, objP11);
                        i12 |= 16;
                        break;
                    case 5:
                        objP12 = dVarB.p(descriptor2, i11, y2.f119104a, objP12);
                        i12 |= 32;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            Object obj = objP7;
            i10 = i12;
            objP = obj;
            objP2 = objP8;
            objP3 = objP9;
            objP4 = objP10;
            objP5 = objP11;
            objP6 = objP12;
        }
        dVarB.c(descriptor2);
        return new ConfigPayload.GDPRSettings(i10, (Boolean) objP, (String) objP2, (String) objP3, (String) objP4, (String) objP5, (String) objP6, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull ConfigPayload.GDPRSettings value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        ConfigPayload.GDPRSettings.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
