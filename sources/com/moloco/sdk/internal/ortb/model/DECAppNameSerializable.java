package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
import yg.y2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.n, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0011\u001fB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010\u001e\u001a\u0004\b\u001f\u0010!¨\u0006$"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/n;", "", "", "seen0", "", "text", "fontSize", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/n;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, InneractiveMediationDefs.GENDER_FEMALE, "()V", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class DECAppNameSerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer fontSize;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.n$a */
    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54592c;

        static {
            a aVar = new a();
            f54590a = aVar;
            f54592c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.DECAppNameSerializable", aVar, 2);
            i2Var.n("text", true);
            i2Var.n("font_size", true);
            f54591b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECAppNameSerializable deserialize(Decoder decoder) {
            String str;
            Integer num;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54591b;
            xg.d dVarB = decoder.b(serialDescriptor);
            t2 t2Var = null;
            if (dVarB.j()) {
                str = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, null);
                num = (Integer) dVarB.p(serialDescriptor, 1, x0.f119093a, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                Integer num2 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        str = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, str);
                        i11 |= 1;
                    } else {
                        if (iX != 1) {
                            throw new ug.z(iX);
                        }
                        num2 = (Integer) dVarB.p(serialDescriptor, 1, x0.f119093a, num2);
                        i11 |= 2;
                    }
                }
                num = num2;
                i10 = i11;
            }
            dVarB.c(serialDescriptor);
            return new DECAppNameSerializable(i10, str, num, t2Var);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, DECAppNameSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54591b;
            xg.f fVarB = encoder.b(serialDescriptor);
            DECAppNameSerializable.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{vg.a.t(y2.f119104a), vg.a.t(x0.f119093a)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54591b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54590a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DECAppNameSerializable(int i10, String str, Integer num, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i10 & 2) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
    }

    public static final /* synthetic */ void a(DECAppNameSerializable self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.text != null) {
            output.h(serialDesc, 0, y2.f119104a, self.text);
        }
        if (!output.r(serialDesc, 1) && self.fontSize == null) {
            return;
        }
        output.h(serialDesc, 1, x0.f119093a, self.fontSize);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECAppNameSerializable)) {
            return false;
        }
        DECAppNameSerializable dECAppNameSerializable = (DECAppNameSerializable) other;
        return Intrinsics.areEqual(this.text, dECAppNameSerializable.text) && Intrinsics.areEqual(this.fontSize, dECAppNameSerializable.fontSize);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.fontSize;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DECAppNameSerializable(text=" + this.text + ", fontSize=" + this.fontSize + ')';
    }
}
