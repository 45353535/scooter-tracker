package com.moloco.sdk.publisher.bidrequest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
import yg.m0;
import yg.n0;
import yg.o0;
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/moloco/sdk/publisher/bidrequest/Geo.$serializer", "Lyg/o0;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/moloco/sdk/publisher/bidrequest/Geo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/moloco/sdk/publisher/bidrequest/Geo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class Geo$$serializer implements o0 {
    public static final int $stable;

    @NotNull
    public static final Geo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Geo$$serializer geo$$serializer = new Geo$$serializer();
        INSTANCE = geo$$serializer;
        $stable = 8;
        i2 i2Var = new i2("com.moloco.sdk.publisher.bidrequest.Geo", geo$$serializer, 6);
        i2Var.n("city", false);
        i2Var.n("country", false);
        i2Var.n("region", false);
        i2Var.n(InneractiveMediationDefs.KEY_ZIPCODE, false);
        i2Var.n("latitude", false);
        i2Var.n("longitude", false);
        descriptor = i2Var;
    }

    private Geo$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public final KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        KSerializer kSerializerT = a.t(y2Var);
        KSerializer kSerializerT2 = a.t(y2Var);
        KSerializer kSerializerT3 = a.t(y2Var);
        KSerializer kSerializerT4 = a.t(y2Var);
        m0 m0Var = m0.f119029a;
        return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, kSerializerT4, a.t(m0Var), a.t(m0Var)};
    }

    @Override // ug.c
    @NotNull
    public final Geo deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        Float f10;
        Float f11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarB = decoder.b(serialDescriptor);
        int i11 = 5;
        String str5 = null;
        if (dVarB.j()) {
            y2 y2Var = y2.f119104a;
            String str6 = (String) dVarB.p(serialDescriptor, 0, y2Var, null);
            String str7 = (String) dVarB.p(serialDescriptor, 1, y2Var, null);
            String str8 = (String) dVarB.p(serialDescriptor, 2, y2Var, null);
            String str9 = (String) dVarB.p(serialDescriptor, 3, y2Var, null);
            m0 m0Var = m0.f119029a;
            Float f12 = (Float) dVarB.p(serialDescriptor, 4, m0Var, null);
            str4 = str9;
            f11 = (Float) dVarB.p(serialDescriptor, 5, m0Var, null);
            i10 = 63;
            f10 = f12;
            str3 = str8;
            str2 = str7;
            str = str6;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Float f13 = null;
            Float f14 = null;
            while (z10) {
                int iX = dVarB.x(serialDescriptor);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        str5 = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, str5);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        str10 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str10);
                        i12 |= 2;
                        break;
                    case 2:
                        str11 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, str11);
                        i12 |= 4;
                        break;
                    case 3:
                        str12 = (String) dVarB.p(serialDescriptor, 3, y2.f119104a, str12);
                        i12 |= 8;
                        break;
                    case 4:
                        f13 = (Float) dVarB.p(serialDescriptor, 4, m0.f119029a, f13);
                        i12 |= 16;
                        break;
                    case 5:
                        f14 = (Float) dVarB.p(serialDescriptor, i11, m0.f119029a, f14);
                        i12 |= 32;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            i10 = i12;
            str = str5;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            f10 = f13;
            f11 = f14;
        }
        dVarB.c(serialDescriptor);
        return new Geo(i10, str, str2, str3, str4, f10, f11, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public final void serialize(@NotNull Encoder encoder, @NotNull Geo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        f fVarB = encoder.b(serialDescriptor);
        Geo.write$Self$moloco_sdk_release(value, fVarB, serialDescriptor);
        fVarB.c(serialDescriptor);
    }

    @Override // yg.o0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return n0.a(this);
    }
}
