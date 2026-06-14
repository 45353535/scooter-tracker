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
import yg.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/RtbToken.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/RtbToken;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/RtbToken;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/RtbToken;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RtbToken$$serializer implements o0 {

    @NotNull
    public static final RtbToken$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        RtbToken$$serializer rtbToken$$serializer = new RtbToken$$serializer();
        INSTANCE = rtbToken$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.RtbToken", rtbToken$$serializer, 5);
        i2Var.n(C4240b4.i.G, false);
        i2Var.n("user", true);
        i2Var.n("ext", true);
        i2Var.n("request", true);
        i2Var.n("ordinal_view", false);
        descriptor = i2Var;
    }

    private RtbToken$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[]{DeviceNode$$serializer.INSTANCE, a.t(CommonRequestBody$User$$serializer.INSTANCE), a.t(CommonRequestBody$RequestExt$$serializer.INSTANCE), a.t(RtbRequest$$serializer.INSTANCE), x0.f119093a};
    }

    @Override // ug.c
    @NotNull
    public RtbToken deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objP;
        Object objP2;
        Object objP3;
        int iF;
        Object objS;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        if (dVarB.j()) {
            objS = dVarB.s(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objP = dVarB.p(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, null);
            objP2 = dVarB.p(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objP3 = dVarB.p(descriptor2, 3, RtbRequest$$serializer.INSTANCE, null);
            i10 = 31;
            iF = dVarB.f(descriptor2, 4);
        } else {
            boolean z10 = true;
            int iF2 = 0;
            Object objS2 = null;
            Object objP4 = null;
            Object objP5 = null;
            Object objP6 = null;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objS2 = dVarB.s(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objS2);
                    i11 |= 1;
                } else if (iX == 1) {
                    objP4 = dVarB.p(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, objP4);
                    i11 |= 2;
                } else if (iX == 2) {
                    objP5 = dVarB.p(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, objP5);
                    i11 |= 4;
                } else if (iX == 3) {
                    objP6 = dVarB.p(descriptor2, 3, RtbRequest$$serializer.INSTANCE, objP6);
                    i11 |= 8;
                } else {
                    if (iX != 4) {
                        throw new z(iX);
                    }
                    iF2 = dVarB.f(descriptor2, 4);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objP = objP4;
            objP2 = objP5;
            objP3 = objP6;
            iF = iF2;
            objS = objS2;
        }
        dVarB.c(descriptor2);
        return new RtbToken(i10, (DeviceNode) objS, (CommonRequestBody.User) objP, (CommonRequestBody.RequestExt) objP2, (RtbRequest) objP3, iF, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull RtbToken value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        RtbToken.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
