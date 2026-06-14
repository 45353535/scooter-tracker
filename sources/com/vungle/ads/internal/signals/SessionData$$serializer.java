package com.vungle.ads.internal.signals;

import com.appodeal.ads.Appodeal;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ug.z;
import xg.d;
import yg.f;
import yg.i1;
import yg.i2;
import yg.o0;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/signals/SessionData.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/signals/SessionData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/signals/SessionData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/signals/SessionData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SessionData$$serializer implements o0 {

    @NotNull
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        i2Var.n("103", false);
        i2Var.n(StatisticData.ERROR_CODE_IO_ERROR, true);
        i2Var.n("100", true);
        i2Var.n("106", true);
        i2Var.n("102", true);
        i2Var.n("104", true);
        i2Var.n("105", true);
        i2Var.n("112", true);
        i2Var.n("113", true);
        i2Var.n("114", true);
        i2Var.n("115", true);
        i2Var.n("116", true);
        descriptor = i2Var;
    }

    private SessionData$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        f fVar = new f(SignaledAd$$serializer.INSTANCE);
        f fVar2 = new f(UnclosedAd$$serializer.INSTANCE);
        x0 x0Var = x0.f119093a;
        i1 i1Var = i1.f118988a;
        return new KSerializer[]{x0Var, y2.f119104a, i1Var, fVar, i1Var, x0Var, fVar2, x0Var, x0Var, x0Var, x0Var, x0Var};
    }

    @Override // ug.c
    @NotNull
    public SessionData deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objS;
        Object objS2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        String str;
        long j11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        int i17 = 0;
        if (dVarB.j()) {
            int iF = dVarB.f(descriptor2, 0);
            String strI = dVarB.i(descriptor2, 1);
            long jE = dVarB.e(descriptor2, 2);
            objS2 = dVarB.s(descriptor2, 3, new f(SignaledAd$$serializer.INSTANCE), null);
            long jE2 = dVarB.e(descriptor2, 4);
            int iF2 = dVarB.f(descriptor2, 5);
            objS = dVarB.s(descriptor2, 6, new f(UnclosedAd$$serializer.INSTANCE), null);
            int iF3 = dVarB.f(descriptor2, 7);
            int iF4 = dVarB.f(descriptor2, 8);
            int iF5 = dVarB.f(descriptor2, 9);
            int iF6 = dVarB.f(descriptor2, 10);
            int iF7 = dVarB.f(descriptor2, 11);
            i17 = Appodeal.ALL;
            i10 = iF;
            i11 = iF6;
            i12 = iF5;
            i13 = iF3;
            i14 = iF4;
            i15 = iF2;
            i16 = iF7;
            j10 = jE2;
            str = strI;
            j11 = jE;
        } else {
            int i18 = 11;
            boolean z10 = true;
            int iF8 = 0;
            int iF9 = 0;
            int iF10 = 0;
            int iF11 = 0;
            Object objS3 = null;
            Object objS4 = null;
            String strI2 = null;
            long jE3 = 0;
            long jE4 = 0;
            int iF12 = 0;
            int iF13 = 0;
            int iF14 = 0;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i18 = 11;
                        break;
                    case 0:
                        i17 |= 1;
                        iF8 = dVarB.f(descriptor2, 0);
                        i18 = 11;
                        break;
                    case 1:
                        strI2 = dVarB.i(descriptor2, 1);
                        i17 |= 2;
                        i18 = 11;
                        break;
                    case 2:
                        jE4 = dVarB.e(descriptor2, 2);
                        i17 |= 4;
                        i18 = 11;
                        break;
                    case 3:
                        objS4 = dVarB.s(descriptor2, 3, new f(SignaledAd$$serializer.INSTANCE), objS4);
                        i17 |= 8;
                        i18 = 11;
                        break;
                    case 4:
                        jE3 = dVarB.e(descriptor2, 4);
                        i17 |= 16;
                        i18 = 11;
                        break;
                    case 5:
                        iF10 = dVarB.f(descriptor2, 5);
                        i17 |= 32;
                        i18 = 11;
                        break;
                    case 6:
                        objS3 = dVarB.s(descriptor2, 6, new f(UnclosedAd$$serializer.INSTANCE), objS3);
                        i17 |= 64;
                        i18 = 11;
                        break;
                    case 7:
                        iF14 = dVarB.f(descriptor2, 7);
                        i17 |= 128;
                        break;
                    case 8:
                        iF9 = dVarB.f(descriptor2, 8);
                        i17 |= 256;
                        break;
                    case 9:
                        iF13 = dVarB.f(descriptor2, 9);
                        i17 |= 512;
                        break;
                    case 10:
                        iF12 = dVarB.f(descriptor2, 10);
                        i17 |= 1024;
                        break;
                    case 11:
                        iF11 = dVarB.f(descriptor2, i18);
                        i17 |= 2048;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            i10 = iF8;
            objS = objS3;
            objS2 = objS4;
            i11 = iF12;
            i12 = iF13;
            i13 = iF14;
            i14 = iF9;
            i15 = iF10;
            i16 = iF11;
            j10 = jE3;
            str = strI2;
            j11 = jE4;
        }
        int i19 = i17;
        dVarB.c(descriptor2);
        return new SessionData(i19, i10, str, j11, (List) objS2, j10, i15, (List) objS, i13, i14, i12, i11, i16, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull SessionData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        xg.f fVarB = encoder.b(descriptor2);
        SessionData.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
