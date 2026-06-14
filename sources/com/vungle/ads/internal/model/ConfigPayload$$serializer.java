package com.vungle.ads.internal.model;

import com.ironsource.C4418ld;
import com.vungle.ads.internal.model.ConfigPayload;
import java.util.List;
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
import yg.f;
import yg.i;
import yg.i1;
import yg.i2;
import yg.o0;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/ConfigPayload;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/ConfigPayload;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConfigPayload$$serializer implements o0 {

    @NotNull
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 19);
        i2Var.n("reuse_assets", true);
        i2Var.n("config", true);
        i2Var.n("endpoints", true);
        i2Var.n("log_metrics", true);
        i2Var.n(C4418ld.f43559c, true);
        i2Var.n("user", true);
        i2Var.n(Cookie.CONFIG_EXTENSION, true);
        i2Var.n(Cookie.COPPA_DISABLE_AD_ID, true);
        i2Var.n("ri_enabled", true);
        i2Var.n("session_timeout", true);
        i2Var.n("wait_for_connectivity_for_tpat", true);
        i2Var.n("sdk_session_timeout", true);
        i2Var.n("signals_disabled", true);
        i2Var.n("fpd_enabled", true);
        i2Var.n("rta_debugging", true);
        i2Var.n("config_last_validated_ts", true);
        i2Var.n("auto_redirect", true);
        i2Var.n("retry_prioritized_tpat", true);
        i2Var.n("enable_ot", true);
        descriptor = i2Var;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer kSerializerT = a.t(ConfigPayload$CleverCache$$serializer.INSTANCE);
        KSerializer kSerializerT2 = a.t(ConfigPayload$ConfigSettings$$serializer.INSTANCE);
        KSerializer kSerializerT3 = a.t(ConfigPayload$Endpoints$$serializer.INSTANCE);
        KSerializer kSerializerT4 = a.t(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE);
        KSerializer kSerializerT5 = a.t(new f(Placement$$serializer.INSTANCE));
        KSerializer kSerializerT6 = a.t(ConfigPayload$UserPrivacy$$serializer.INSTANCE);
        KSerializer kSerializerT7 = a.t(y2.f119104a);
        i iVar = i.f118983a;
        KSerializer kSerializerT8 = a.t(iVar);
        KSerializer kSerializerT9 = a.t(iVar);
        x0 x0Var = x0.f119093a;
        return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, kSerializerT4, kSerializerT5, kSerializerT6, kSerializerT7, kSerializerT8, kSerializerT9, a.t(x0Var), a.t(iVar), a.t(x0Var), a.t(iVar), a.t(iVar), a.t(iVar), a.t(i1.f118988a), a.t(ConfigPayload$AutoRedirect$$serializer.INSTANCE), a.t(iVar), a.t(iVar)};
    }

    @Override // ug.c
    @NotNull
    public ConfigPayload deserialize(@NotNull Decoder decoder) {
        Object objP;
        Object objP2;
        Object obj;
        Object obj2;
        Object obj3;
        Object objP3;
        Object obj4;
        Object objP4;
        Object objP5;
        Object objP6;
        Object objP7;
        int i10;
        Object obj5;
        Object obj6;
        Object objP8;
        Object objP9;
        Object objP10;
        Object objP11;
        Object objP12;
        Object objP13;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        if (dVarB.j()) {
            Object objP14 = dVarB.p(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            objP7 = dVarB.p(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objP3 = dVarB.p(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            Object objP15 = dVarB.p(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            Object objP16 = dVarB.p(descriptor2, 4, new f(Placement$$serializer.INSTANCE), null);
            objP9 = dVarB.p(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            objP13 = dVarB.p(descriptor2, 6, y2.f119104a, null);
            i iVar = i.f118983a;
            objP12 = dVarB.p(descriptor2, 7, iVar, null);
            objP11 = dVarB.p(descriptor2, 8, iVar, null);
            x0 x0Var = x0.f119093a;
            objP10 = dVarB.p(descriptor2, 9, x0Var, null);
            objP8 = dVarB.p(descriptor2, 10, iVar, null);
            Object objP17 = dVarB.p(descriptor2, 11, x0Var, null);
            Object objP18 = dVarB.p(descriptor2, 12, iVar, null);
            obj6 = objP17;
            objP6 = dVarB.p(descriptor2, 13, iVar, null);
            objP5 = dVarB.p(descriptor2, 14, iVar, null);
            objP4 = dVarB.p(descriptor2, 15, i1.f118988a, null);
            Object objP19 = dVarB.p(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            Object objP20 = dVarB.p(descriptor2, 17, iVar, null);
            objP2 = dVarB.p(descriptor2, 18, iVar, null);
            obj3 = objP15;
            obj = objP20;
            obj4 = objP19;
            obj2 = objP14;
            i10 = 524287;
            obj5 = objP18;
            objP = objP16;
        } else {
            boolean z10 = true;
            Object objP21 = null;
            Object objP22 = null;
            Object objP23 = null;
            Object objP24 = null;
            Object objP25 = null;
            Object objP26 = null;
            Object objP27 = null;
            Object objP28 = null;
            Object objP29 = null;
            Object objP30 = null;
            objP = null;
            Object objP31 = null;
            Object objP32 = null;
            Object objP33 = null;
            Object objP34 = null;
            Object objP35 = null;
            Object objP36 = null;
            Object objP37 = null;
            int i11 = 0;
            Object objP38 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        obj7 = objP38;
                        obj8 = objP21;
                        obj9 = objP25;
                        z10 = false;
                        objP25 = obj9;
                        objP38 = obj7;
                        objP21 = obj8;
                        break;
                    case 0:
                        obj8 = objP21;
                        obj9 = objP25;
                        obj7 = objP38;
                        objP37 = dVarB.p(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objP37);
                        i11 |= 1;
                        objP25 = obj9;
                        objP38 = obj7;
                        objP21 = obj8;
                        break;
                    case 1:
                        obj8 = objP21;
                        i11 |= 2;
                        objP38 = dVarB.p(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objP38);
                        objP25 = objP25;
                        objP21 = obj8;
                        break;
                    case 2:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP24 = dVarB.p(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objP24);
                        i11 |= 4;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 3:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP23 = dVarB.p(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objP23);
                        i11 |= 8;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 4:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP = dVarB.p(descriptor2, 4, new f(Placement$$serializer.INSTANCE), objP);
                        i11 |= 16;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 5:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP21 = dVarB.p(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objP21);
                        i11 |= 32;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 6:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP30 = dVarB.p(descriptor2, 6, y2.f119104a, objP30);
                        i11 |= 64;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 7:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP29 = dVarB.p(descriptor2, 7, i.f118983a, objP29);
                        i11 |= 128;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 8:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP28 = dVarB.p(descriptor2, 8, i.f118983a, objP28);
                        i11 |= 256;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 9:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP22 = dVarB.p(descriptor2, 9, x0.f119093a, objP22);
                        i11 |= 512;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 10:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP27 = dVarB.p(descriptor2, 10, i.f118983a, objP27);
                        i11 |= 1024;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 11:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP26 = dVarB.p(descriptor2, 11, x0.f119093a, objP26);
                        i11 |= 2048;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 12:
                        obj10 = objP38;
                        objP31 = dVarB.p(descriptor2, 12, i.f118983a, objP31);
                        i11 |= 4096;
                        objP25 = objP25;
                        objP32 = objP32;
                        objP38 = obj10;
                        break;
                    case 13:
                        obj10 = objP38;
                        objP32 = dVarB.p(descriptor2, 13, i.f118983a, objP32);
                        i11 |= 8192;
                        objP25 = objP25;
                        objP33 = objP33;
                        objP38 = obj10;
                        break;
                    case 14:
                        obj10 = objP38;
                        objP33 = dVarB.p(descriptor2, 14, i.f118983a, objP33);
                        i11 |= 16384;
                        objP25 = objP25;
                        objP34 = objP34;
                        objP38 = obj10;
                        break;
                    case 15:
                        obj10 = objP38;
                        objP34 = dVarB.p(descriptor2, 15, i1.f118988a, objP34);
                        i11 |= 32768;
                        objP25 = objP25;
                        objP35 = objP35;
                        objP38 = obj10;
                        break;
                    case 16:
                        obj10 = objP38;
                        objP35 = dVarB.p(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objP35);
                        i11 |= 65536;
                        objP25 = objP25;
                        objP36 = objP36;
                        objP38 = obj10;
                        break;
                    case 17:
                        obj10 = objP38;
                        obj11 = objP25;
                        objP36 = dVarB.p(descriptor2, 17, i.f118983a, objP36);
                        i11 |= 131072;
                        objP25 = obj11;
                        objP38 = obj10;
                        break;
                    case 18:
                        objP25 = dVarB.p(descriptor2, 18, i.f118983a, objP25);
                        i11 |= 262144;
                        objP38 = objP38;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            Object obj12 = objP38;
            Object obj13 = objP21;
            objP2 = objP25;
            obj = objP36;
            obj2 = objP37;
            obj3 = objP23;
            objP3 = objP24;
            obj4 = objP35;
            objP4 = objP34;
            objP5 = objP33;
            objP6 = objP32;
            objP7 = obj12;
            i10 = i11;
            obj5 = objP31;
            obj6 = objP26;
            objP8 = objP27;
            objP9 = obj13;
            objP10 = objP22;
            objP11 = objP28;
            objP12 = objP29;
            objP13 = objP30;
        }
        dVarB.c(descriptor2);
        return new ConfigPayload(i10, (ConfigPayload.CleverCache) obj2, (ConfigPayload.ConfigSettings) objP7, (ConfigPayload.Endpoints) objP3, (ConfigPayload.LogMetricsSettings) obj3, (List) objP, (ConfigPayload.UserPrivacy) objP9, (String) objP13, (Boolean) objP12, (Boolean) objP11, (Integer) objP10, (Boolean) objP8, (Integer) obj6, (Boolean) obj5, (Boolean) objP6, (Boolean) objP5, (Long) objP4, (ConfigPayload.AutoRedirect) obj4, (Boolean) obj, (Boolean) objP2, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull ConfigPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        xg.f fVarB = encoder.b(descriptor2);
        ConfigPayload.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
