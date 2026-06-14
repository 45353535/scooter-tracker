package com.vungle.ads.internal.model;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
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
import yg.i2;
import yg.o0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AppNode.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/AppNode;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/AppNode;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/AppNode;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AppNode$$serializer implements o0 {

    @NotNull
    public static final AppNode$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AppNode$$serializer appNode$$serializer = new AppNode$$serializer();
        INSTANCE = appNode$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.AppNode", appNode$$serializer, 3);
        i2Var.n("bundle", false);
        i2Var.n(POBCoreNativeConstants.NATIVE_VERSION, false);
        i2Var.n("id", false);
        descriptor = i2Var;
    }

    private AppNode$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{y2Var, y2Var, y2Var};
    }

    @Override // ug.c
    @NotNull
    public AppNode deserialize(@NotNull Decoder decoder) {
        String strI;
        String strI2;
        String str;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        if (dVarB.j()) {
            strI = dVarB.i(descriptor2, 0);
            String strI3 = dVarB.i(descriptor2, 1);
            strI2 = dVarB.i(descriptor2, 2);
            str = strI3;
            i10 = 7;
        } else {
            strI = null;
            String strI4 = null;
            String strI5 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(descriptor2, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI5 = dVarB.i(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new z(iX);
                    }
                    strI4 = dVarB.i(descriptor2, 2);
                    i11 |= 4;
                }
            }
            strI2 = strI4;
            str = strI5;
            i10 = i11;
        }
        String str2 = strI;
        dVarB.c(descriptor2);
        return new AppNode(i10, str2, str, strI2, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull AppNode value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        AppNode.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
