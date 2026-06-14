package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.CommonRequestBody;
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
import yg.i1;
import yg.i2;
import yg.o0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.GDPR.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CommonRequestBody$GDPR$$serializer implements o0 {

    @NotNull
    public static final CommonRequestBody$GDPR$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$GDPR$$serializer commonRequestBody$GDPR$$serializer = new CommonRequestBody$GDPR$$serializer();
        INSTANCE = commonRequestBody$GDPR$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.CommonRequestBody.GDPR", commonRequestBody$GDPR$$serializer, 4);
        i2Var.n("consent_status", false);
        i2Var.n("consent_source", false);
        i2Var.n("consent_timestamp", false);
        i2Var.n("consent_message_version", false);
        descriptor = i2Var;
    }

    private CommonRequestBody$GDPR$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{y2Var, y2Var, i1.f118988a, y2Var};
    }

    @Override // ug.c
    @NotNull
    public CommonRequestBody.GDPR deserialize(@NotNull Decoder decoder) {
        String strI;
        String strI2;
        int i10;
        String str;
        long j10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        if (dVarB.j()) {
            strI = dVarB.i(descriptor2, 0);
            String strI3 = dVarB.i(descriptor2, 1);
            long jE = dVarB.e(descriptor2, 2);
            strI2 = dVarB.i(descriptor2, 3);
            i10 = 15;
            str = strI3;
            j10 = jE;
        } else {
            strI = null;
            String strI4 = null;
            boolean z10 = true;
            long jE2 = 0;
            String strI5 = null;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(descriptor2, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI4 = dVarB.i(descriptor2, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    jE2 = dVarB.e(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new z(iX);
                    }
                    strI5 = dVarB.i(descriptor2, 3);
                    i11 |= 8;
                }
            }
            strI2 = strI5;
            i10 = i11;
            str = strI4;
            j10 = jE2;
        }
        String str2 = strI;
        dVarB.c(descriptor2);
        return new CommonRequestBody.GDPR(i10, str2, str, j10, strI2, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull CommonRequestBody.GDPR value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        CommonRequestBody.GDPR.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
