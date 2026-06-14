package com.vungle.ads.internal.model;

import com.mbridge.msdk.foundation.entity.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ug.z;
import vg.a;
import xg.d;
import yg.c1;
import yg.f;
import yg.i;
import yg.i1;
import yg.i2;
import yg.o0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/AdPayload;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/AdPayload;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/AdPayload;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdPayload$$serializer implements o0 {

    @NotNull
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 7);
        i2Var.n(b.JSON_KEY_ADS, true);
        i2Var.n("config", true);
        i2Var.n("expiryWindowStart", true);
        i2Var.n("mraidFiles", true);
        i2Var.n("incentivizedTextSettings", true);
        i2Var.n("assetsFullyDownloaded", true);
        i2Var.n("indexFilePath", true);
        descriptor = i2Var;
    }

    private AdPayload$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer kSerializerT = a.t(new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE));
        KSerializer kSerializerT2 = a.t(ConfigPayload$$serializer.INSTANCE);
        KSerializer kSerializerT3 = a.t(i1.f118988a);
        KClass kClassB = v0.b(ConcurrentHashMap.class);
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, new ug.b(kClassB, null, new KSerializer[]{y2Var, y2Var}), new c1(y2Var, y2Var), i.f118983a, a.t(y2Var)};
    }

    @Override // ug.c
    @NotNull
    public AdPayload deserialize(@NotNull Decoder decoder) {
        Object objP;
        Object objP2;
        boolean z10;
        Object objS;
        Object objS2;
        int i10;
        Object objP3;
        Object objP4;
        char c10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        int i11 = 6;
        int i12 = 5;
        if (dVarB.j()) {
            objP = dVarB.p(descriptor2, 0, new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            objP4 = dVarB.p(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            objP3 = dVarB.p(descriptor2, 2, i1.f118988a, null);
            KClass kClassB = v0.b(ConcurrentHashMap.class);
            y2 y2Var = y2.f119104a;
            objS = dVarB.s(descriptor2, 3, new ug.b(kClassB, null, new KSerializer[]{y2Var, y2Var}), null);
            objS2 = dVarB.s(descriptor2, 4, new c1(y2Var, y2Var), null);
            boolean zD = dVarB.D(descriptor2, 5);
            objP2 = dVarB.p(descriptor2, 6, y2Var, null);
            i10 = 127;
            z10 = zD;
        } else {
            boolean z11 = true;
            boolean zD2 = false;
            int i13 = 0;
            objP = null;
            Object objP5 = null;
            Object objP6 = null;
            Object objP7 = null;
            Object objS3 = null;
            Object objS4 = null;
            while (z11) {
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                        break;
                    case 0:
                        objP = dVarB.p(descriptor2, 0, new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), objP);
                        i13 |= 1;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 1:
                        objP6 = dVarB.p(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, objP6);
                        i13 |= 2;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 2:
                        c10 = 3;
                        objP5 = dVarB.p(descriptor2, 2, i1.f118988a, objP5);
                        i13 |= 4;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 3:
                        KClass kClassB2 = v0.b(ConcurrentHashMap.class);
                        y2 y2Var2 = y2.f119104a;
                        c10 = 3;
                        objS3 = dVarB.s(descriptor2, 3, new ug.b(kClassB2, null, new KSerializer[]{y2Var2, y2Var2}), objS3);
                        i13 |= 8;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 4:
                        y2 y2Var3 = y2.f119104a;
                        objS4 = dVarB.s(descriptor2, 4, new c1(y2Var3, y2Var3), objS4);
                        i13 |= 16;
                        i11 = 6;
                        break;
                    case 5:
                        zD2 = dVarB.D(descriptor2, i12);
                        i13 |= 32;
                        break;
                    case 6:
                        objP7 = dVarB.p(descriptor2, i11, y2.f119104a, objP7);
                        i13 |= 64;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            objP2 = objP7;
            z10 = zD2;
            objS = objS3;
            objS2 = objS4;
            i10 = i13;
            objP3 = objP5;
            objP4 = objP6;
        }
        dVarB.c(descriptor2);
        return new AdPayload(i10, (List) objP, (ConfigPayload) objP4, (Long) objP3, (ConcurrentHashMap) objS, (Map) objS2, z10, (String) objP2, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull AdPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        xg.f fVarB = encoder.b(descriptor2);
        AdPayload.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
