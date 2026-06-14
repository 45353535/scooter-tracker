package com.vungle.ads.internal.model;

import com.ironsource.C4240b4;
import com.vungle.ads.internal.model.CommonRequestBody;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/CommonRequestBody;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/CommonRequestBody;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CommonRequestBody$$serializer implements o0 {

    @NotNull
    public static final CommonRequestBody$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$$serializer commonRequestBody$$serializer = new CommonRequestBody$$serializer();
        INSTANCE = commonRequestBody$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.CommonRequestBody", commonRequestBody$$serializer, 5);
        i2Var.n(C4240b4.i.G, false);
        i2Var.n("app", true);
        i2Var.n("user", true);
        i2Var.n("ext", true);
        i2Var.n("request", true);
        descriptor = i2Var;
    }

    private CommonRequestBody$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[]{DeviceNode$$serializer.INSTANCE, a.t(AppNode$$serializer.INSTANCE), a.t(CommonRequestBody$User$$serializer.INSTANCE), a.t(CommonRequestBody$RequestExt$$serializer.INSTANCE), a.t(CommonRequestBody$RequestParam$$serializer.INSTANCE)};
    }

    @Override // ug.c
    @NotNull
    public CommonRequestBody deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objS;
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        Object objS2 = null;
        if (dVarB.j()) {
            objS = dVarB.s(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objP = dVarB.p(descriptor2, 1, AppNode$$serializer.INSTANCE, null);
            objP2 = dVarB.p(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, null);
            objP3 = dVarB.p(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objP4 = dVarB.p(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objP5 = null;
            Object objP6 = null;
            Object objP7 = null;
            Object objP8 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objS2 = dVarB.s(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objS2);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP5 = dVarB.p(descriptor2, 1, AppNode$$serializer.INSTANCE, objP5);
                    i11 |= 2;
                } else if (iX == 2) {
                    objP6 = dVarB.p(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, objP6);
                    i11 |= 4;
                } else if (iX == 3) {
                    objP7 = dVarB.p(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, objP7);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new z(iX);
                    }
                    objP8 = dVarB.p(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, objP8);
                    i11 |= 16;
                }
            }
            Object obj = objS2;
            i10 = i11;
            objS = obj;
            objP = objP5;
            objP2 = objP6;
            objP3 = objP7;
            objP4 = objP8;
        }
        dVarB.c(descriptor2);
        return new CommonRequestBody(i10, (DeviceNode) objS, (AppNode) objP, (CommonRequestBody.User) objP2, (CommonRequestBody.RequestExt) objP3, (CommonRequestBody.RequestParam) objP4, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull CommonRequestBody value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        CommonRequestBody.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
