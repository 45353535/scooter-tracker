package com.moloco.sdk.internal.ortb.model;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.p, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@ug.l
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0002\u0017&Ba\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010!\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010!\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010/\u0012\u0004\b1\u0010%\u001a\u0004\b*\u00100R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010'\u0012\u0004\b3\u0010%\u001a\u0004\b2\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010'\u0012\u0004\b4\u0010%\u001a\u0004\b&\u0010\u001a¨\u00066"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/p;", "", "", "seen0", "verticalSpacing", "", "ctaText", "buttonWidth", "fontSize", "Lcom/moloco/sdk/internal/ortb/model/o;", OutlinedTextFieldKt.BorderId, "foregroundColor", "backgroundColor", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/o;Ljava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/p;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", ApsMetricsDataMap.APSMETRICS_FIELD_URL, "()V", "b", "Ljava/lang/String;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "o", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "m", InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q, "Lcom/moloco/sdk/internal/ortb/model/o;", "()Lcom/moloco/sdk/internal/ortb/model/o;", CampaignEx.JSON_KEY_AD_K, "g", "s", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class DECCtaSerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54600h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer verticalSpacing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String ctaText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer buttonWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer fontSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final DECBorderSerializable border;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String foregroundColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final String backgroundColor;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.p$a */
    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54610c;

        static {
            a aVar = new a();
            f54608a = aVar;
            f54610c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.DECCtaSerializable", aVar, 7);
            i2Var.n("vertical_spacing", true);
            i2Var.n("text", true);
            i2Var.n("button_width", true);
            i2Var.n("font_size", true);
            i2Var.n(OutlinedTextFieldKt.BorderId, true);
            i2Var.n("foreground_color", true);
            i2Var.n("background_color", true);
            f54609b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DECCtaSerializable deserialize(Decoder decoder) {
            int i10;
            String str;
            Integer num;
            String str2;
            Integer num2;
            Integer num3;
            DECBorderSerializable dECBorderSerializable;
            String str3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54609b;
            xg.d dVarB = decoder.b(serialDescriptor);
            int i11 = 6;
            Integer num4 = null;
            if (dVarB.j()) {
                x0 x0Var = x0.f119093a;
                Integer num5 = (Integer) dVarB.p(serialDescriptor, 0, x0Var, null);
                y2 y2Var = y2.f119104a;
                String str4 = (String) dVarB.p(serialDescriptor, 1, y2Var, null);
                Integer num6 = (Integer) dVarB.p(serialDescriptor, 2, x0Var, null);
                Integer num7 = (Integer) dVarB.p(serialDescriptor, 3, x0Var, null);
                DECBorderSerializable dECBorderSerializable2 = (DECBorderSerializable) dVarB.p(serialDescriptor, 4, DECBorderSerializable.a.f54597a, null);
                String str5 = (String) dVarB.p(serialDescriptor, 5, y2Var, null);
                num3 = num7;
                str = (String) dVarB.p(serialDescriptor, 6, y2Var, null);
                str3 = str5;
                dECBorderSerializable = dECBorderSerializable2;
                i10 = 127;
                num2 = num6;
                str2 = str4;
                num = num5;
            } else {
                boolean z10 = true;
                int i12 = 0;
                String str6 = null;
                String str7 = null;
                Integer num8 = null;
                Integer num9 = null;
                DECBorderSerializable dECBorderSerializable3 = null;
                String str8 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            i11 = 6;
                            break;
                        case 0:
                            num4 = (Integer) dVarB.p(serialDescriptor, 0, x0.f119093a, num4);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            str7 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str7);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            num8 = (Integer) dVarB.p(serialDescriptor, 2, x0.f119093a, num8);
                            i12 |= 4;
                            break;
                        case 3:
                            num9 = (Integer) dVarB.p(serialDescriptor, 3, x0.f119093a, num9);
                            i12 |= 8;
                            break;
                        case 4:
                            dECBorderSerializable3 = (DECBorderSerializable) dVarB.p(serialDescriptor, 4, DECBorderSerializable.a.f54597a, dECBorderSerializable3);
                            i12 |= 16;
                            break;
                        case 5:
                            str8 = (String) dVarB.p(serialDescriptor, 5, y2.f119104a, str8);
                            i12 |= 32;
                            break;
                        case 6:
                            str6 = (String) dVarB.p(serialDescriptor, i11, y2.f119104a, str6);
                            i12 |= 64;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                i10 = i12;
                str = str6;
                num = num4;
                str2 = str7;
                num2 = num8;
                num3 = num9;
                dECBorderSerializable = dECBorderSerializable3;
                str3 = str8;
            }
            dVarB.c(serialDescriptor);
            return new DECCtaSerializable(i10, num, str2, num2, num3, dECBorderSerializable, str3, str, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, DECCtaSerializable value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54609b;
            xg.f fVarB = encoder.b(serialDescriptor);
            DECCtaSerializable.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            x0 x0Var = x0.f119093a;
            KSerializer kSerializerT = vg.a.t(x0Var);
            y2 y2Var = y2.f119104a;
            return new KSerializer[]{kSerializerT, vg.a.t(y2Var), vg.a.t(x0Var), vg.a.t(x0Var), vg.a.t(DECBorderSerializable.a.f54597a), vg.a.t(y2Var), vg.a.t(y2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54609b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.p$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54608a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DECCtaSerializable(int i10, Integer num, String str, Integer num2, Integer num3, DECBorderSerializable dECBorderSerializable, String str2, String str3, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.verticalSpacing = null;
        } else {
            this.verticalSpacing = num;
        }
        if ((i10 & 2) == 0) {
            this.ctaText = null;
        } else {
            this.ctaText = str;
        }
        if ((i10 & 4) == 0) {
            this.buttonWidth = null;
        } else {
            this.buttonWidth = num2;
        }
        if ((i10 & 8) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num3;
        }
        if ((i10 & 16) == 0) {
            this.border = null;
        } else {
            this.border = dECBorderSerializable;
        }
        if ((i10 & 32) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = str2;
        }
        if ((i10 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str3;
        }
    }

    public static final /* synthetic */ void a(DECCtaSerializable self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.verticalSpacing != null) {
            output.h(serialDesc, 0, x0.f119093a, self.verticalSpacing);
        }
        if (output.r(serialDesc, 1) || self.ctaText != null) {
            output.h(serialDesc, 1, y2.f119104a, self.ctaText);
        }
        if (output.r(serialDesc, 2) || self.buttonWidth != null) {
            output.h(serialDesc, 2, x0.f119093a, self.buttonWidth);
        }
        if (output.r(serialDesc, 3) || self.fontSize != null) {
            output.h(serialDesc, 3, x0.f119093a, self.fontSize);
        }
        if (output.r(serialDesc, 4) || self.border != null) {
            output.h(serialDesc, 4, DECBorderSerializable.a.f54597a, self.border);
        }
        if (output.r(serialDesc, 5) || self.foregroundColor != null) {
            output.h(serialDesc, 5, y2.f119104a, self.foregroundColor);
        }
        if (!output.r(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.h(serialDesc, 6, y2.f119104a, self.backgroundColor);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DECBorderSerializable getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getButtonWidth() {
        return this.buttonWidth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DECCtaSerializable)) {
            return false;
        }
        DECCtaSerializable dECCtaSerializable = (DECCtaSerializable) other;
        return Intrinsics.areEqual(this.verticalSpacing, dECCtaSerializable.verticalSpacing) && Intrinsics.areEqual(this.ctaText, dECCtaSerializable.ctaText) && Intrinsics.areEqual(this.buttonWidth, dECCtaSerializable.buttonWidth) && Intrinsics.areEqual(this.fontSize, dECCtaSerializable.fontSize) && Intrinsics.areEqual(this.border, dECCtaSerializable.border) && Intrinsics.areEqual(this.foregroundColor, dECCtaSerializable.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, dECCtaSerializable.backgroundColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getVerticalSpacing() {
        return this.verticalSpacing;
    }

    public int hashCode() {
        Integer num = this.verticalSpacing;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ctaText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.buttonWidth;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fontSize;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DECBorderSerializable dECBorderSerializable = this.border;
        int iHashCode5 = (iHashCode4 + (dECBorderSerializable == null ? 0 : dECBorderSerializable.hashCode())) * 31;
        String str2 = this.foregroundColor;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DECCtaSerializable(verticalSpacing=" + this.verticalSpacing + ", ctaText=" + this.ctaText + ", buttonWidth=" + this.buttonWidth + ", fontSize=" + this.fontSize + ", border=" + this.border + ", foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ')';
    }
}
