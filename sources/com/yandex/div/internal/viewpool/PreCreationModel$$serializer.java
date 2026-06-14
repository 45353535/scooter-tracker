package com.yandex.div.internal.viewpool;

import kotlin.Metadata;
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
import yg.t2;
import yg.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/yandex/div/internal/viewpool/PreCreationModel.$serializer", "Lyg/o0;", "Lcom/yandex/div/internal/viewpool/PreCreationModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/div/internal/viewpool/PreCreationModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/div/internal/viewpool/PreCreationModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreCreationModel$$serializer implements o0 {

    @NotNull
    public static final PreCreationModel$$serializer INSTANCE;
    private static final /* synthetic */ i2 descriptor;

    static {
        PreCreationModel$$serializer preCreationModel$$serializer = new PreCreationModel$$serializer();
        INSTANCE = preCreationModel$$serializer;
        i2 i2Var = new i2("com.yandex.div.internal.viewpool.PreCreationModel", preCreationModel$$serializer, 3);
        i2Var.n("capacity", false);
        i2Var.n("min", true);
        i2Var.n("max", true);
        descriptor = i2Var;
    }

    private PreCreationModel$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] childSerializers() {
        x0 x0Var = x0.f119093a;
        return new KSerializer[]{x0Var, x0Var, x0Var};
    }

    @Override // ug.c
    @NotNull
    public PreCreationModel deserialize(@NotNull Decoder decoder) {
        int iF;
        int iF2;
        int i10;
        int i11;
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = decoder.b(descriptor2);
        if (dVarB.j()) {
            iF = dVarB.f(descriptor2, 0);
            int iF3 = dVarB.f(descriptor2, 1);
            iF2 = dVarB.f(descriptor2, 2);
            i10 = iF3;
            i11 = 7;
        } else {
            boolean z10 = true;
            iF = 0;
            int iF4 = 0;
            int iF5 = 0;
            int i12 = 0;
            while (z10) {
                int iX = dVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    iF = dVarB.f(descriptor2, 0);
                    i12 |= 1;
                } else if (iX == 1) {
                    iF5 = dVarB.f(descriptor2, 1);
                    i12 |= 2;
                } else {
                    if (iX != 2) {
                        throw new z(iX);
                    }
                    iF4 = dVarB.f(descriptor2, 2);
                    i12 |= 4;
                }
            }
            iF2 = iF4;
            i10 = iF5;
            i11 = i12;
        }
        int i13 = iF;
        dVarB.c(descriptor2);
        return new PreCreationModel(i11, i13, i10, iF2, (t2) null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public void serialize(@NotNull Encoder encoder, @NotNull PreCreationModel value) {
        SerialDescriptor descriptor2 = getDescriptor();
        f fVarB = encoder.b(descriptor2);
        PreCreationModel.write$Self(value, fVarB, descriptor2);
        fVarB.c(descriptor2);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
