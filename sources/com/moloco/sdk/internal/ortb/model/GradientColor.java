package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import yg.e2;
import yg.i2;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.s, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0010\u001bB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/s;", "", "", "seen0", "", "color", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/s;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()V", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class GradientColor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String color;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.s$a */
    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54626c;

        static {
            a aVar = new a();
            f54624a = aVar;
            f54626c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.GradientColor", aVar, 1);
            i2Var.n("color", false);
            f54625b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GradientColor deserialize(Decoder decoder) {
            String strI;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54625b;
            xg.d dVarB = decoder.b(serialDescriptor);
            int i10 = 1;
            t2 t2Var = null;
            if (dVarB.j()) {
                strI = dVarB.i(serialDescriptor, 0);
            } else {
                boolean z10 = true;
                int i11 = 0;
                strI = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new ug.z(iX);
                        }
                        strI = dVarB.i(serialDescriptor, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            dVarB.c(serialDescriptor);
            return new GradientColor(i10, strI, t2Var);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, GradientColor value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54625b;
            xg.f fVarB = encoder.b(serialDescriptor);
            GradientColor.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{y2.f119104a};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54625b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.s$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54624a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GradientColor(int i10, String str, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, a.f54624a.getDescriptor());
        }
        this.color = str;
    }

    public static final /* synthetic */ void a(GradientColor self, xg.f output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.color);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GradientColor) && Intrinsics.areEqual(this.color, ((GradientColor) other).color);
    }

    public int hashCode() {
        return this.color.hashCode();
    }

    public String toString() {
        return "GradientColor(color=" + this.color + ')';
    }
}
