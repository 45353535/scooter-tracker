package com.vungle.ads.internal.model;

import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.vungle.ads.internal.model.DeviceNode;
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
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/DeviceNode;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/DeviceNode;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/DeviceNode;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceNode$$serializer implements o0 {

    @NotNull
    public static final DeviceNode$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        DeviceNode$$serializer deviceNode$$serializer = new DeviceNode$$serializer();
        INSTANCE = deviceNode$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.DeviceNode", deviceNode$$serializer, 11);
        i2Var.n(N6.f41422t, false);
        i2Var.n("model", false);
        i2Var.n(N6.G, false);
        i2Var.n(N6.Q0, true);
        i2Var.n("os", false);
        i2Var.n(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, false);
        i2Var.n("h", false);
        i2Var.n(N6.f41375d0, true);
        i2Var.n(EidRequestBuilder.REQUEST_FIELD_IFA, true);
        i2Var.n(EidRequestBuilder.REQUEST_FIELD_LMT, true);
        i2Var.n("ext", true);
        descriptor = i2Var;
    }

    private DeviceNode$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        KSerializer kSerializerT = a.t(y2Var);
        x0 x0Var = x0.f119093a;
        return new KSerializer[]{y2Var, y2Var, y2Var, kSerializerT, y2Var, x0Var, x0Var, a.t(y2Var), a.t(y2Var), a.t(x0Var), a.t(DeviceNode$VungleExt$$serializer.INSTANCE)};
    }

    @Override // ug.c
    @NotNull
    public DeviceNode deserialize(@NotNull Decoder decoder) {
        int i10;
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        Object objP5;
        int i11;
        int i12;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        int i13 = 10;
        int i14 = 9;
        if (dVarB.j()) {
            String strI = dVarB.i(descriptor2, 0);
            String strI2 = dVarB.i(descriptor2, 1);
            String strI3 = dVarB.i(descriptor2, 2);
            y2 y2Var = y2.f119104a;
            objP5 = dVarB.p(descriptor2, 3, y2Var, null);
            String strI4 = dVarB.i(descriptor2, 4);
            int iF = dVarB.f(descriptor2, 5);
            int iF2 = dVarB.f(descriptor2, 6);
            objP4 = dVarB.p(descriptor2, 7, y2Var, null);
            objP3 = dVarB.p(descriptor2, 8, y2Var, null);
            objP = dVarB.p(descriptor2, 9, x0.f119093a, null);
            objP2 = dVarB.p(descriptor2, 10, DeviceNode$VungleExt$$serializer.INSTANCE, null);
            str = strI;
            i10 = iF2;
            i11 = iF;
            str4 = strI4;
            str3 = strI3;
            str2 = strI2;
            i12 = 2047;
        } else {
            boolean z10 = true;
            int iF3 = 0;
            int i15 = 0;
            Object objP6 = null;
            Object objP7 = null;
            Object objP8 = null;
            Object objP9 = null;
            String strI5 = null;
            String strI6 = null;
            String strI7 = null;
            String strI8 = null;
            int iF4 = 0;
            Object objP10 = null;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        i13 = 10;
                        break;
                    case 0:
                        strI5 = dVarB.i(descriptor2, 0);
                        i15 |= 1;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 1:
                        strI6 = dVarB.i(descriptor2, 1);
                        i15 |= 2;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 2:
                        strI7 = dVarB.i(descriptor2, 2);
                        i15 |= 4;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 3:
                        objP10 = dVarB.p(descriptor2, 3, y2.f119104a, objP10);
                        i15 |= 8;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 4:
                        strI8 = dVarB.i(descriptor2, 4);
                        i15 |= 16;
                        i13 = 10;
                        break;
                    case 5:
                        iF4 = dVarB.f(descriptor2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        iF3 = dVarB.f(descriptor2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        objP9 = dVarB.p(descriptor2, 7, y2.f119104a, objP9);
                        i15 |= 128;
                        break;
                    case 8:
                        objP8 = dVarB.p(descriptor2, 8, y2.f119104a, objP8);
                        i15 |= 256;
                        break;
                    case 9:
                        objP6 = dVarB.p(descriptor2, i14, x0.f119093a, objP6);
                        i15 |= 512;
                        break;
                    case 10:
                        objP7 = dVarB.p(descriptor2, i13, DeviceNode$VungleExt$$serializer.INSTANCE, objP7);
                        i15 |= 1024;
                        break;
                    default:
                        throw new z(iX);
                }
            }
            i10 = iF3;
            objP = objP6;
            objP2 = objP7;
            objP3 = objP8;
            objP4 = objP9;
            objP5 = objP10;
            i11 = iF4;
            i12 = i15;
            str = strI5;
            str2 = strI6;
            str3 = strI7;
            str4 = strI8;
        }
        dVarB.c(descriptor2);
        return new DeviceNode(i12, str, str2, str3, (String) objP5, str4, i11, i10, (String) objP4, (String) objP3, (Integer) objP, (DeviceNode.VungleExt) objP2, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull DeviceNode value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        DeviceNode.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
