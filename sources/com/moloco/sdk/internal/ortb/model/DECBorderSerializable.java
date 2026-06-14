package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.GradientColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import yg.i2;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.x0;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.o, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@ug.l
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u0012\"B5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/o;", "", "", "seen0", "borderWidth", "", "Lcom/moloco/sdk/internal/ortb/model/s;", "gradient", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/util/List;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/o;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Ljava/lang/Integer;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()V", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "g", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class DECBorderSerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54593c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f54594d = {null, new yg.f(GradientColor.a.f54624a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer borderWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final List gradient;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.o$a */
    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54599c;

        static {
            a aVar = new a();
            f54597a = aVar;
            f54599c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.DECBorderSerializable", aVar, 2);
            i2Var.n("border_width", true);
            i2Var.n("gradient", true);
            f54598b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECBorderSerializable deserialize(Decoder decoder) {
            List list;
            Integer num;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54598b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = DECBorderSerializable.f54594d;
            t2 t2Var = null;
            if (dVarB.j()) {
                num = (Integer) dVarB.p(serialDescriptor, 0, x0.f119093a, null);
                list = (List) dVarB.p(serialDescriptor, 1, kSerializerArr[1], null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                Integer num2 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        num2 = (Integer) dVarB.p(serialDescriptor, 0, x0.f119093a, num2);
                        i11 |= 1;
                    } else {
                        if (iX != 1) {
                            throw new ug.z(iX);
                        }
                        list2 = (List) dVarB.p(serialDescriptor, 1, kSerializerArr[1], list2);
                        i11 |= 2;
                    }
                }
                list = list2;
                num = num2;
                i10 = i11;
            }
            dVarB.c(serialDescriptor);
            return new DECBorderSerializable(i10, num, list, t2Var);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, DECBorderSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54598b;
            xg.f fVarB = encoder.b(serialDescriptor);
            DECBorderSerializable.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{vg.a.t(x0.f119093a), vg.a.t(DECBorderSerializable.f54594d[1])};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54598b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54597a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DECBorderSerializable(int i10, Integer num, List list, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.borderWidth = null;
        } else {
            this.borderWidth = num;
        }
        if ((i10 & 2) == 0) {
            this.gradient = null;
        } else {
            this.gradient = list;
        }
    }

    public static final /* synthetic */ void a(DECBorderSerializable self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f54594d;
        if (output.r(serialDesc, 0) || self.borderWidth != null) {
            output.h(serialDesc, 0, x0.f119093a, self.borderWidth);
        }
        if (!output.r(serialDesc, 1) && self.gradient == null) {
            return;
        }
        output.h(serialDesc, 1, kSerializerArr[1], self.gradient);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getGradient() {
        return this.gradient;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECBorderSerializable)) {
            return false;
        }
        DECBorderSerializable dECBorderSerializable = (DECBorderSerializable) other;
        return Intrinsics.areEqual(this.borderWidth, dECBorderSerializable.borderWidth) && Intrinsics.areEqual(this.gradient, dECBorderSerializable.gradient);
    }

    public int hashCode() {
        Integer num = this.borderWidth;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.gradient;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DECBorderSerializable(borderWidth=" + this.borderWidth + ", gradient=" + this.gradient + ')';
    }
}
