package com.vungle.ads.internal.model;

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
import yg.i;
import yg.i2;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/Placement.$serializer", "Lyg/o0;", "Lcom/vungle/ads/internal/model/Placement;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/internal/model/Placement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/internal/model/Placement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Placement$$serializer implements o0 {

    @NotNull
    public static final Placement$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Placement$$serializer placement$$serializer = new Placement$$serializer();
        INSTANCE = placement$$serializer;
        i2 i2Var = new i2("com.vungle.ads.internal.model.Placement", placement$$serializer, 3);
        i2Var.n("placement_ref_id", false);
        i2Var.n("is_hb", true);
        i2Var.n("type", true);
        descriptor = i2Var;
    }

    private Placement$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{y2Var, i.f118983a, a.t(y2Var)};
    }

    @Override // ug.c
    @NotNull
    public Placement deserialize(@NotNull Decoder decoder) {
        boolean z10;
        int i10;
        String str;
        Object objP;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        if (dVarB.j()) {
            String strI = dVarB.i(descriptor2, 0);
            boolean zD = dVarB.D(descriptor2, 1);
            objP = dVarB.p(descriptor2, 2, y2.f119104a, null);
            str = strI;
            z10 = zD;
            i10 = 7;
        } else {
            boolean z11 = true;
            boolean zD2 = false;
            String strI2 = null;
            Object objP2 = null;
            int i11 = 0;
            while (z11) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z11 = false;
                } else if (iX == 0) {
                    strI2 = dVarB.i(descriptor2, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    zD2 = dVarB.D(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new z(iX);
                    }
                    objP2 = dVarB.p(descriptor2, 2, y2.f119104a, objP2);
                    i11 |= 4;
                }
            }
            z10 = zD2;
            i10 = i11;
            str = strI2;
            objP = objP2;
        }
        dVarB.c(descriptor2);
        return new Placement(i10, str, z10, (String) objP, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull Placement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        Placement.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
