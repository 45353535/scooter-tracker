package com.vungle.ads.internal.model;

import com.ironsource.N6;
import com.vungle.ads.internal.model.DeviceNode;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
import yg.i1;
import yg.i2;
import yg.m0;
import yg.o0;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceNode$VungleExt$$serializer implements o0 {

    @NotNull
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 22);
        i2Var.n("is_google_play_services_available", true);
        i2Var.n(CommonUrlParts.APP_SET_ID, true);
        i2Var.n(CommonUrlParts.APP_SET_ID_SCOPE, true);
        i2Var.n("battery_level", true);
        i2Var.n("battery_state", true);
        i2Var.n("battery_saver_enabled", true);
        i2Var.n("connection_type", true);
        i2Var.n("connection_type_detail", true);
        i2Var.n(CommonUrlParts.LOCALE, true);
        i2Var.n("language", true);
        i2Var.n("time_zone", true);
        i2Var.n("volume_level", true);
        i2Var.n("sound_enabled", true);
        i2Var.n("is_tv", true);
        i2Var.n("sd_card_available", true);
        i2Var.n("is_sideload_enabled", true);
        i2Var.n(N6.V0, true);
        i2Var.n("amazon_advertising_id", true);
        i2Var.n("sit", true);
        i2Var.n("oit", true);
        i2Var.n("ort", true);
        i2Var.n("obt", true);
        descriptor = i2Var;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        KSerializer kSerializerT = a.t(y2Var);
        x0 x0Var = x0.f119093a;
        KSerializer kSerializerT2 = a.t(x0Var);
        KSerializer kSerializerT3 = a.t(y2Var);
        KSerializer kSerializerT4 = a.t(y2Var);
        KSerializer kSerializerT5 = a.t(y2Var);
        KSerializer kSerializerT6 = a.t(y2Var);
        KSerializer kSerializerT7 = a.t(y2Var);
        KSerializer kSerializerT8 = a.t(y2Var);
        KSerializer kSerializerT9 = a.t(y2Var);
        KSerializer kSerializerT10 = a.t(y2Var);
        i1 i1Var = i1.f118988a;
        KSerializer kSerializerT11 = a.t(i1Var);
        KSerializer kSerializerT12 = a.t(i1Var);
        KSerializer kSerializerT13 = a.t(i1Var);
        KSerializer kSerializerT14 = a.t(i1Var);
        i iVar = i.f118983a;
        m0 m0Var = m0.f119029a;
        return new KSerializer[]{iVar, kSerializerT, kSerializerT2, m0Var, kSerializerT3, x0Var, kSerializerT4, kSerializerT5, kSerializerT6, kSerializerT7, kSerializerT8, m0Var, x0Var, iVar, x0Var, iVar, kSerializerT9, kSerializerT10, kSerializerT11, kSerializerT12, kSerializerT13, kSerializerT14};
    }

    @Override // ug.c
    @NotNull
    public DeviceNode.VungleExt deserialize(@NotNull Decoder decoder) {
        Object objP;
        Object objP2;
        Object obj;
        Object obj2;
        int i10;
        Object objP3;
        Object obj3;
        Object objP4;
        Object objP5;
        Object objP6;
        boolean z10;
        float f10;
        Object objP7;
        Object objP8;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        float f11;
        Object objP9;
        Object objP10;
        Object objP11;
        Object obj4;
        int i14;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        int i15 = 0;
        if (dVarB.j()) {
            boolean zD = dVarB.D(descriptor2, 0);
            y2 y2Var = y2.f119104a;
            Object objP12 = dVarB.p(descriptor2, 1, y2Var, null);
            objP7 = dVarB.p(descriptor2, 2, x0.f119093a, null);
            float fA = dVarB.A(descriptor2, 3);
            objP11 = dVarB.p(descriptor2, 4, y2Var, null);
            int iF = dVarB.f(descriptor2, 5);
            objP8 = dVarB.p(descriptor2, 6, y2Var, null);
            objP9 = dVarB.p(descriptor2, 7, y2Var, null);
            objP6 = dVarB.p(descriptor2, 8, y2Var, null);
            objP5 = dVarB.p(descriptor2, 9, y2Var, null);
            objP4 = dVarB.p(descriptor2, 10, y2Var, null);
            float fA2 = dVarB.A(descriptor2, 11);
            int iF2 = dVarB.f(descriptor2, 12);
            boolean zD2 = dVarB.D(descriptor2, 13);
            int iF3 = dVarB.f(descriptor2, 14);
            boolean zD3 = dVarB.D(descriptor2, 15);
            obj2 = objP12;
            Object objP13 = dVarB.p(descriptor2, 16, y2Var, null);
            Object objP14 = dVarB.p(descriptor2, 17, y2Var, null);
            i1 i1Var = i1.f118988a;
            obj3 = objP14;
            objP3 = dVarB.p(descriptor2, 18, i1Var, null);
            Object objP15 = dVarB.p(descriptor2, 19, i1Var, null);
            objP10 = dVarB.p(descriptor2, 20, i1Var, null);
            f10 = fA;
            i10 = 4194303;
            i11 = iF2;
            i13 = iF;
            f11 = fA2;
            z10 = zD3;
            i12 = iF3;
            z12 = zD2;
            z11 = zD;
            objP = objP15;
            objP2 = dVarB.p(descriptor2, 21, i1Var, null);
            obj = objP13;
        } else {
            objP = null;
            boolean z13 = true;
            Object objP16 = null;
            Object objP17 = null;
            Object objP18 = null;
            Object objP19 = null;
            Object objP20 = null;
            objP2 = null;
            Object objP21 = null;
            Object objP22 = null;
            Object objP23 = null;
            Object objP24 = null;
            Object objP25 = null;
            Object objP26 = null;
            boolean zD4 = false;
            int iF4 = 0;
            boolean zD5 = false;
            boolean zD6 = false;
            int iF5 = 0;
            int iF6 = 0;
            float fA3 = 0.0f;
            float fA4 = 0.0f;
            Object objP27 = null;
            while (z13) {
                Object obj10 = objP16;
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        obj5 = objP20;
                        obj6 = objP26;
                        z13 = false;
                        objP16 = obj10;
                        objP26 = obj6;
                        objP20 = obj5;
                        break;
                    case 0:
                        obj5 = objP20;
                        obj6 = objP26;
                        zD5 = dVarB.D(descriptor2, 0);
                        i15 |= 1;
                        objP16 = obj10;
                        objP17 = objP17;
                        objP26 = obj6;
                        objP20 = obj5;
                        break;
                    case 1:
                        obj7 = objP17;
                        obj8 = objP20;
                        i15 |= 2;
                        objP26 = dVarB.p(descriptor2, 1, y2.f119104a, objP26);
                        objP16 = obj10;
                        objP20 = obj8;
                        objP17 = obj7;
                        break;
                    case 2:
                        obj7 = objP17;
                        obj8 = objP20;
                        objP16 = dVarB.p(descriptor2, 2, x0.f119093a, obj10);
                        i15 |= 4;
                        objP20 = obj8;
                        objP17 = obj7;
                        break;
                    case 3:
                        obj9 = objP17;
                        fA3 = dVarB.A(descriptor2, 3);
                        i15 |= 8;
                        objP20 = objP20;
                        objP17 = obj9;
                        objP16 = obj10;
                        break;
                    case 4:
                        obj9 = objP17;
                        i15 |= 16;
                        objP20 = dVarB.p(descriptor2, 4, y2.f119104a, objP20);
                        objP17 = obj9;
                        objP16 = obj10;
                        break;
                    case 5:
                        obj4 = objP20;
                        iF6 = dVarB.f(descriptor2, 5);
                        i15 |= 32;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 6:
                        obj4 = objP20;
                        objP17 = dVarB.p(descriptor2, 6, y2.f119104a, objP17);
                        i15 |= 64;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 7:
                        obj4 = objP20;
                        objP18 = dVarB.p(descriptor2, 7, y2.f119104a, objP18);
                        i15 |= 128;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 8:
                        obj4 = objP20;
                        objP25 = dVarB.p(descriptor2, 8, y2.f119104a, objP25);
                        i15 |= 256;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 9:
                        obj4 = objP20;
                        objP24 = dVarB.p(descriptor2, 9, y2.f119104a, objP24);
                        i15 |= 512;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 10:
                        obj4 = objP20;
                        objP23 = dVarB.p(descriptor2, 10, y2.f119104a, objP23);
                        i15 |= 1024;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 11:
                        obj4 = objP20;
                        fA4 = dVarB.A(descriptor2, 11);
                        i15 |= 2048;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 12:
                        obj4 = objP20;
                        iF4 = dVarB.f(descriptor2, 12);
                        i15 |= 4096;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 13:
                        obj4 = objP20;
                        zD6 = dVarB.D(descriptor2, 13);
                        i15 |= 8192;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 14:
                        obj4 = objP20;
                        iF5 = dVarB.f(descriptor2, 14);
                        i15 |= 16384;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 15:
                        obj4 = objP20;
                        zD4 = dVarB.D(descriptor2, 15);
                        i15 |= 32768;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 16:
                        obj4 = objP20;
                        objP19 = dVarB.p(descriptor2, 16, y2.f119104a, objP19);
                        i14 = 65536;
                        i15 |= i14;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 17:
                        obj4 = objP20;
                        objP22 = dVarB.p(descriptor2, 17, y2.f119104a, objP22);
                        i14 = 131072;
                        i15 |= i14;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 18:
                        obj4 = objP20;
                        objP21 = dVarB.p(descriptor2, 18, i1.f118988a, objP21);
                        i14 = 262144;
                        i15 |= i14;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 19:
                        obj4 = objP20;
                        objP = dVarB.p(descriptor2, 19, i1.f118988a, objP);
                        i14 = 524288;
                        i15 |= i14;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 20:
                        obj4 = objP20;
                        objP27 = dVarB.p(descriptor2, 20, i1.f118988a, objP27);
                        i14 = 1048576;
                        i15 |= i14;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    case 21:
                        obj4 = objP20;
                        objP2 = dVarB.p(descriptor2, 21, i1.f118988a, objP2);
                        i14 = 2097152;
                        i15 |= i14;
                        objP16 = obj10;
                        objP20 = obj4;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            Object obj11 = objP20;
            Object obj12 = objP26;
            Object obj13 = objP16;
            obj = objP19;
            obj2 = obj12;
            i10 = i15;
            objP3 = objP21;
            obj3 = objP22;
            objP4 = objP23;
            objP5 = objP24;
            objP6 = objP25;
            z10 = zD4;
            f10 = fA3;
            objP7 = obj13;
            objP8 = objP17;
            i11 = iF4;
            z11 = zD5;
            z12 = zD6;
            i12 = iF5;
            i13 = iF6;
            f11 = fA4;
            objP9 = objP18;
            objP10 = objP27;
            objP11 = obj11;
        }
        dVarB.c(descriptor2);
        return new DeviceNode.VungleExt(i10, z11, (String) obj2, (Integer) objP7, f10, (String) objP11, i13, (String) objP8, (String) objP9, (String) objP6, (String) objP5, (String) objP4, f11, i11, z12, i12, z10, (String) obj, (String) obj3, (Long) objP3, (Long) objP, (Long) objP10, (Long) objP2, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull DeviceNode.VungleExt value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        DeviceNode.VungleExt.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
