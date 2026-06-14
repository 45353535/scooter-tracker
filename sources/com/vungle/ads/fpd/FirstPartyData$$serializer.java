package com.vungle.ads.fpd;

import java.util.Map;
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
import yg.c1;
import yg.i2;
import yg.o0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/fpd/FirstPartyData.$serializer", "Lyg/o0;", "Lcom/vungle/ads/fpd/FirstPartyData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/fpd/FirstPartyData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/fpd/FirstPartyData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirstPartyData$$serializer implements o0 {

    @NotNull
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        i2 i2Var = new i2("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        i2Var.n("model_version", true);
        i2Var.n("session_context", true);
        i2Var.n("demographic", true);
        i2Var.n("location", true);
        i2Var.n("revenue", true);
        i2Var.n("custom_data", true);
        descriptor = i2Var;
    }

    private FirstPartyData$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{y2Var, a.t(SessionContext$$serializer.INSTANCE), a.t(Demographic$$serializer.INSTANCE), a.t(Location$$serializer.INSTANCE), a.t(Revenue$$serializer.INSTANCE), a.t(new c1(y2Var, y2Var))};
    }

    @Override // ug.c
    @NotNull
    public FirstPartyData deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        boolean z10 = true;
        String strI = null;
        if (dVarB.j()) {
            String strI2 = dVarB.i(descriptor2, 0);
            objP = dVarB.p(descriptor2, 1, SessionContext$$serializer.INSTANCE, null);
            objP2 = dVarB.p(descriptor2, 2, Demographic$$serializer.INSTANCE, null);
            objP3 = dVarB.p(descriptor2, 3, Location$$serializer.INSTANCE, null);
            objP4 = dVarB.p(descriptor2, 4, Revenue$$serializer.INSTANCE, null);
            y2 y2Var = y2.f119104a;
            objP5 = dVarB.p(descriptor2, 5, new c1(y2Var, y2Var), null);
            str = strI2;
            i10 = 63;
        } else {
            boolean z11 = true;
            int i11 = 0;
            Object objP6 = null;
            Object objP7 = null;
            Object objP8 = null;
            Object objP9 = null;
            Object objP10 = null;
            while (z11) {
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z11 = false;
                        z10 = z10;
                        break;
                    case 0:
                        strI = dVarB.i(descriptor2, 0);
                        i11 |= 1;
                        z10 = z10;
                        break;
                    case 1:
                        objP6 = dVarB.p(descriptor2, 1, SessionContext$$serializer.INSTANCE, objP6);
                        i11 |= 2;
                        z10 = true;
                        break;
                    case 2:
                        objP7 = dVarB.p(descriptor2, 2, Demographic$$serializer.INSTANCE, objP7);
                        i11 |= 4;
                        z10 = true;
                        break;
                    case 3:
                        objP8 = dVarB.p(descriptor2, 3, Location$$serializer.INSTANCE, objP8);
                        i11 |= 8;
                        z10 = true;
                        break;
                    case 4:
                        objP9 = dVarB.p(descriptor2, 4, Revenue$$serializer.INSTANCE, objP9);
                        i11 |= 16;
                        z10 = true;
                        break;
                    case 5:
                        y2 y2Var2 = y2.f119104a;
                        objP10 = dVarB.p(descriptor2, 5, new c1(y2Var2, y2Var2), objP10);
                        i11 |= 32;
                        z10 = true;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            i10 = i11;
            str = strI;
            objP = objP6;
            objP2 = objP7;
            objP3 = objP8;
            objP4 = objP9;
            objP5 = objP10;
        }
        dVarB.c(descriptor2);
        return new FirstPartyData(i10, str, (SessionContext) objP, (Demographic) objP2, (Location) objP3, (Revenue) objP4, (Map) objP5, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull FirstPartyData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        FirstPartyData.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
