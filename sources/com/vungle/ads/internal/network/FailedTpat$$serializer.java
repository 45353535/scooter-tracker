package com.vungle.ads.internal.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ug.z;
import xg.d;
import xg.f;
import yg.c1;
import yg.i2;
import yg.o0;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/network/FailedTpat.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/network/FailedTpat;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/network/FailedTpat;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/network/FailedTpat;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FailedTpat$$serializer implements o0 {

    @NotNull
    public static final FailedTpat$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FailedTpat$$serializer failedTpat$$serializer = new FailedTpat$$serializer();
        INSTANCE = failedTpat$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.network.FailedTpat", failedTpat$$serializer, 6);
        i2Var.n("method", true);
        i2Var.n("headers", true);
        i2Var.n("body", true);
        i2Var.n("retryAttempt", true);
        i2Var.n("retryCount", false);
        i2Var.n("tpatKey", true);
        descriptor = i2Var;
    }

    private FailedTpat$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        KSerializer kSerializerT = vg.a.t(new c1(y2Var, y2Var));
        KSerializer kSerializerT2 = vg.a.t(y2Var);
        KSerializer kSerializerT3 = vg.a.t(y2Var);
        x0 x0Var = x0.f119093a;
        return new KSerializer[]{HttpMethod$$serializer.INSTANCE, kSerializerT, kSerializerT2, x0Var, x0Var, kSerializerT3};
    }

    @Override // ug.c
    @NotNull
    public FailedTpat deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objP;
        Object objP2;
        Object objP3;
        int i11;
        int i12;
        Object objS;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        int i13 = 5;
        if (dVarB.j()) {
            objS = dVarB.s(descriptor2, 0, HttpMethod$$serializer.INSTANCE, null);
            y2 y2Var = y2.f119104a;
            objP = dVarB.p(descriptor2, 1, new c1(y2Var, y2Var), null);
            objP2 = dVarB.p(descriptor2, 2, y2Var, null);
            int iF = dVarB.f(descriptor2, 3);
            int iF2 = dVarB.f(descriptor2, 4);
            objP3 = dVarB.p(descriptor2, 5, y2Var, null);
            i12 = iF;
            i11 = iF2;
            i10 = 63;
        } else {
            boolean z10 = true;
            int iF3 = 0;
            int i14 = 0;
            Object objS2 = null;
            Object objP4 = null;
            Object objP5 = null;
            Object objP6 = null;
            int iF4 = 0;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        objS2 = dVarB.s(descriptor2, 0, HttpMethod$$serializer.INSTANCE, objS2);
                        i14 |= 1;
                        i13 = 5;
                        continue;
                    case 1:
                        y2 y2Var2 = y2.f119104a;
                        objP4 = dVarB.p(descriptor2, 1, new c1(y2Var2, y2Var2), objP4);
                        i14 |= 2;
                        i13 = 5;
                        break;
                    case 2:
                        objP5 = dVarB.p(descriptor2, 2, y2.f119104a, objP5);
                        i14 |= 4;
                        break;
                    case 3:
                        iF3 = dVarB.f(descriptor2, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        iF4 = dVarB.f(descriptor2, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        objP6 = dVarB.p(descriptor2, i13, y2.f119104a, objP6);
                        i14 |= 32;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            i10 = i14;
            objP = objP4;
            objP2 = objP5;
            objP3 = objP6;
            i11 = iF4;
            i12 = iF3;
            objS = objS2;
        }
        dVarB.c(descriptor2);
        return new FailedTpat(i10, (HttpMethod) objS, (Map) objP, (String) objP2, i12, i11, (String) objP3, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull FailedTpat value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        FailedTpat.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
