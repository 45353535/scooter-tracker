package com.moloco.sdk.internal.ortb.model;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.DECBorderSerializable;
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

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.m, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@ug.l
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u0013\"B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010!\u001a\u0004\b\"\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010!\u001a\u0004\b%\u0010'¨\u0006*"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/m;", "", "", "seen0", "size", "", "appIconUri", "Lcom/moloco/sdk/internal/ortb/model/o;", OutlinedTextFieldKt.BorderId, "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/o;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/m;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()V", "b", "Ljava/lang/String;", EidRequestBuilder.REQUEST_FIELD_EMAIL, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/internal/ortb/model/o;", "()Lcom/moloco/sdk/internal/ortb/model/o;", "g", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class DECAppIconSerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54581d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appIconUri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final DECBorderSerializable border;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.m$a */
    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54587c;

        static {
            a aVar = new a();
            f54585a = aVar;
            f54587c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.DECAppIconSerializable", aVar, 3);
            i2Var.n("size", true);
            i2Var.n("app_icon_url", true);
            i2Var.n(OutlinedTextFieldKt.BorderId, true);
            f54586b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECAppIconSerializable deserialize(Decoder decoder) {
            int i10;
            Integer num;
            String str;
            DECBorderSerializable dECBorderSerializable;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54586b;
            xg.d dVarB = decoder.b(serialDescriptor);
            Integer num2 = null;
            if (dVarB.j()) {
                Integer num3 = (Integer) dVarB.p(serialDescriptor, 0, x0.f119093a, null);
                String str2 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, null);
                num = num3;
                dECBorderSerializable = (DECBorderSerializable) dVarB.p(serialDescriptor, 2, DECBorderSerializable.a.f54597a, null);
                str = str2;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str3 = null;
                DECBorderSerializable dECBorderSerializable2 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        num2 = (Integer) dVarB.p(serialDescriptor, 0, x0.f119093a, num2);
                        i11 |= 1;
                    } else if (iX == 1) {
                        str3 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str3);
                        i11 |= 2;
                    } else {
                        if (iX != 2) {
                            throw new ug.z(iX);
                        }
                        dECBorderSerializable2 = (DECBorderSerializable) dVarB.p(serialDescriptor, 2, DECBorderSerializable.a.f54597a, dECBorderSerializable2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                num = num2;
                str = str3;
                dECBorderSerializable = dECBorderSerializable2;
            }
            dVarB.c(serialDescriptor);
            return new DECAppIconSerializable(i10, num, str, dECBorderSerializable, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, DECAppIconSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54586b;
            xg.f fVarB = encoder.b(serialDescriptor);
            DECAppIconSerializable.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{vg.a.t(x0.f119093a), vg.a.t(y2.f119104a), vg.a.t(DECBorderSerializable.a.f54597a)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54586b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.m$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54585a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DECAppIconSerializable(int i10, Integer num, String str, DECBorderSerializable dECBorderSerializable, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.size = null;
        } else {
            this.size = num;
        }
        if ((i10 & 2) == 0) {
            this.appIconUri = null;
        } else {
            this.appIconUri = str;
        }
        if ((i10 & 4) == 0) {
            this.border = null;
        } else {
            this.border = dECBorderSerializable;
        }
    }

    public static final /* synthetic */ void a(DECAppIconSerializable self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.size != null) {
            output.h(serialDesc, 0, x0.f119093a, self.size);
        }
        if (output.r(serialDesc, 1) || self.appIconUri != null) {
            output.h(serialDesc, 1, y2.f119104a, self.appIconUri);
        }
        if (!output.r(serialDesc, 2) && self.border == null) {
            return;
        }
        output.h(serialDesc, 2, DECBorderSerializable.a.f54597a, self.border);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppIconUri() {
        return this.appIconUri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DECBorderSerializable getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECAppIconSerializable)) {
            return false;
        }
        DECAppIconSerializable dECAppIconSerializable = (DECAppIconSerializable) other;
        return Intrinsics.areEqual(this.size, dECAppIconSerializable.size) && Intrinsics.areEqual(this.appIconUri, dECAppIconSerializable.appIconUri) && Intrinsics.areEqual(this.border, dECAppIconSerializable.border);
    }

    public int hashCode() {
        Integer num = this.size;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.appIconUri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DECBorderSerializable dECBorderSerializable = this.border;
        return iHashCode2 + (dECBorderSerializable != null ? dECBorderSerializable.hashCode() : 0);
    }

    public String toString() {
        return "DECAppIconSerializable(size=" + this.size + ", appIconUri=" + this.appIconUri + ", border=" + this.border + ')';
    }
}
