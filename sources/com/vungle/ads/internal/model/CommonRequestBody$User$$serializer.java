package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import com.vungle.ads.internal.model.CommonRequestBody;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.pubnative.lite.sdk.models.RemoteConfigFeature;
import org.jetbrains.annotations.NotNull;
import ug.z;
import vg.a;
import xg.d;
import xg.f;
import yg.i2;
import yg.o0;
import yg.t2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.User.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/CommonRequestBody$User;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CommonRequestBody$User$$serializer implements o0 {

    @NotNull
    public static final CommonRequestBody$User$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$User$$serializer commonRequestBody$User$$serializer = new CommonRequestBody$User$$serializer();
        INSTANCE = commonRequestBody$User$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.CommonRequestBody.User", commonRequestBody$User$$serializer, 5);
        i2Var.n("gdpr", true);
        i2Var.n(RemoteConfigFeature.UserConsent.CCPA, true);
        i2Var.n("coppa", true);
        i2Var.n("fpd", true);
        i2Var.n("iab", true);
        descriptor = i2Var;
    }

    private CommonRequestBody$User$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[]{a.t(CommonRequestBody$GDPR$$serializer.INSTANCE), a.t(CommonRequestBody$CCPA$$serializer.INSTANCE), a.t(CommonRequestBody$COPPA$$serializer.INSTANCE), a.t(FirstPartyData$$serializer.INSTANCE), a.t(CommonRequestBody$IAB$$serializer.INSTANCE)};
    }

    @Override // ug.c
    @NotNull
    public CommonRequestBody.User deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        Object objP6 = null;
        if (dVarB.j()) {
            objP = dVarB.p(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, null);
            objP2 = dVarB.p(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, null);
            objP3 = dVarB.p(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, null);
            objP4 = dVarB.p(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, null);
            objP5 = dVarB.p(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objP7 = null;
            Object objP8 = null;
            Object objP9 = null;
            Object objP10 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objP6 = dVarB.p(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, objP6);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP7 = dVarB.p(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, objP7);
                    i11 |= 2;
                } else if (iX == 2) {
                    objP8 = dVarB.p(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, objP8);
                    i11 |= 4;
                } else if (iX == 3) {
                    objP9 = dVarB.p(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, objP9);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new z(iX);
                    }
                    objP10 = dVarB.p(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, objP10);
                    i11 |= 16;
                }
            }
            Object obj = objP6;
            i10 = i11;
            objP = obj;
            objP2 = objP7;
            objP3 = objP8;
            objP4 = objP9;
            objP5 = objP10;
        }
        dVarB.c(descriptor2);
        return new CommonRequestBody.User(i10, (CommonRequestBody.GDPR) objP, (CommonRequestBody.CCPA) objP2, (CommonRequestBody.COPPA) objP3, (FirstPartyData) objP4, (CommonRequestBody.IAB) objP5, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull CommonRequestBody.User value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        CommonRequestBody.User.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
