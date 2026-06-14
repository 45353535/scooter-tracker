package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import yg.i2;
import yg.m0;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.q, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0002\u0015$BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010%\u0012\u0004\b)\u0010#\u001a\u0004\b$\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b.\u0010#\u001a\u0004\b(\u0010,¨\u00060"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/q;", "", "", "seen0", "", "ratingValue", "", "foregroundColor", "backgroundColor", "size", "fontSize", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/q;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Ljava/lang/Float;", "m", "()V", "b", "Ljava/lang/String;", "d", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "g", "Ljava/lang/Integer;", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/lang/Integer;", "o", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class DECRatingSerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Float ratingValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String foregroundColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String backgroundColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer fontSize;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.q$a */
    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54618c;

        static {
            a aVar = new a();
            f54616a = aVar;
            f54618c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.DECRatingSerializable", aVar, 5);
            i2Var.n("rating_value", true);
            i2Var.n("foreground_color", true);
            i2Var.n("background_color", true);
            i2Var.n("rating_size", true);
            i2Var.n("font_size", true);
            f54617b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECRatingSerializable deserialize(Decoder decoder) {
            int i10;
            Float f10;
            String str;
            String str2;
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54617b;
            xg.d dVarB = decoder.b(serialDescriptor);
            Float f11 = null;
            if (dVarB.j()) {
                Float f12 = (Float) dVarB.p(serialDescriptor, 0, m0.f119029a, null);
                y2 y2Var = y2.f119104a;
                String str3 = (String) dVarB.p(serialDescriptor, 1, y2Var, null);
                String str4 = (String) dVarB.p(serialDescriptor, 2, y2Var, null);
                x0 x0Var = x0.f119093a;
                f10 = f12;
                num = (Integer) dVarB.p(serialDescriptor, 3, x0Var, null);
                num2 = (Integer) dVarB.p(serialDescriptor, 4, x0Var, null);
                str2 = str4;
                str = str3;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str5 = null;
                String str6 = null;
                Integer num3 = null;
                Integer num4 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        f11 = (Float) dVarB.p(serialDescriptor, 0, m0.f119029a, f11);
                        i11 |= 1;
                    } else if (iX == 1) {
                        str5 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str5);
                        i11 |= 2;
                    } else if (iX == 2) {
                        str6 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, str6);
                        i11 |= 4;
                    } else if (iX == 3) {
                        num3 = (Integer) dVarB.p(serialDescriptor, 3, x0.f119093a, num3);
                        i11 |= 8;
                    } else {
                        if (iX != 4) {
                            throw new ug.z(iX);
                        }
                        num4 = (Integer) dVarB.p(serialDescriptor, 4, x0.f119093a, num4);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                f10 = f11;
                str = str5;
                str2 = str6;
                num = num3;
                num2 = num4;
            }
            dVarB.c(serialDescriptor);
            return new DECRatingSerializable(i10, f10, str, str2, num, num2, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, DECRatingSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54617b;
            xg.f fVarB = encoder.b(serialDescriptor);
            DECRatingSerializable.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerT = vg.a.t(m0.f119029a);
            y2 y2Var = y2.f119104a;
            KSerializer kSerializerT2 = vg.a.t(y2Var);
            KSerializer kSerializerT3 = vg.a.t(y2Var);
            x0 x0Var = x0.f119093a;
            return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, vg.a.t(x0Var), vg.a.t(x0Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54617b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.q$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54616a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DECRatingSerializable(int i10, Float f10, String str, String str2, Integer num, Integer num2, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.ratingValue = null;
        } else {
            this.ratingValue = f10;
        }
        if ((i10 & 2) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = str;
        }
        if ((i10 & 4) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str2;
        }
        if ((i10 & 8) == 0) {
            this.size = null;
        } else {
            this.size = num;
        }
        if ((i10 & 16) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num2;
        }
    }

    public static final /* synthetic */ void a(DECRatingSerializable self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.ratingValue != null) {
            output.h(serialDesc, 0, m0.f119029a, self.ratingValue);
        }
        if (output.r(serialDesc, 1) || self.foregroundColor != null) {
            output.h(serialDesc, 1, y2.f119104a, self.foregroundColor);
        }
        if (output.r(serialDesc, 2) || self.backgroundColor != null) {
            output.h(serialDesc, 2, y2.f119104a, self.backgroundColor);
        }
        if (output.r(serialDesc, 3) || self.size != null) {
            output.h(serialDesc, 3, x0.f119093a, self.size);
        }
        if (!output.r(serialDesc, 4) && self.fontSize == null) {
            return;
        }
        output.h(serialDesc, 4, x0.f119093a, self.fontSize);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getRatingValue() {
        return this.ratingValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECRatingSerializable)) {
            return false;
        }
        DECRatingSerializable dECRatingSerializable = (DECRatingSerializable) other;
        return Intrinsics.areEqual((Object) this.ratingValue, (Object) dECRatingSerializable.ratingValue) && Intrinsics.areEqual(this.foregroundColor, dECRatingSerializable.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, dECRatingSerializable.backgroundColor) && Intrinsics.areEqual(this.size, dECRatingSerializable.size) && Intrinsics.areEqual(this.fontSize, dECRatingSerializable.fontSize);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    public int hashCode() {
        Float f10 = this.ratingValue;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        String str = this.foregroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.size;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fontSize;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "DECRatingSerializable(ratingValue=" + this.ratingValue + ", foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ", size=" + this.size + ", fontSize=" + this.fontSize + ')';
    }
}
