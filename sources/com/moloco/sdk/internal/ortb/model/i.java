package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
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
import yg.e2;
import yg.i2;
import yg.l3;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0001\u0018\u0000 42\u00020\u0001:\u0002\u001a!Ba\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001eR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010 \u001a\u0004\b&\u0010'R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b&\u0010 \u001a\u0004\b+\u0010,R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010-\u0012\u0004\b/\u0010 \u001a\u0004\b#\u0010.R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u00100\u0012\u0004\b+\u0010 \u001a\u0004\b)\u00101R\"\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u00102\u0012\u0004\b$\u0010 \u001a\u0004\b$\u00103¨\u00065"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/i;", "", "", "seen0", "", "text", "imageUrl", "Llf/t;", "padding", "Lcom/moloco/sdk/internal/ortb/model/t;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/D;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "backgroundColor", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Llf/t;Lcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lyg/t2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/i;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "m", "()V", "b", InneractiveMediationDefs.GENDER_FEMALE, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "I", "g", "()I", CampaignEx.JSON_KEY_AD_K, "d", "Lcom/moloco/sdk/internal/ortb/model/t;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Lcom/moloco/sdk/internal/ortb/model/t;", "Lcom/moloco/sdk/internal/ortb/model/D;", "()Lcom/moloco/sdk/internal/ortb/model/D;", "o", "J", "()J", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f54545h = {null, null, null, t.INSTANCE.serializer(), D.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int padding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final t horizontalAlignment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final D verticalAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long foregroundColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Color backgroundColor;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54555c;

        static {
            a aVar = new a();
            f54553a = aVar;
            f54555c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.CTA", aVar, 7);
            i2Var.n("text", false);
            i2Var.n(CampaignEx.JSON_KEY_IMAGE_URL, true);
            i2Var.n("padding", false);
            i2Var.n("horizontal_alignment", false);
            i2Var.n("vertical_alignment", false);
            i2Var.n("foreground_color", false);
            i2Var.n("background_color", true);
            f54554b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i deserialize(Decoder decoder) {
            int i10;
            Color color;
            Color color2;
            String str;
            String str2;
            lf.t tVar;
            t tVar2;
            D d10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54554b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = i.f54545h;
            int i11 = 6;
            String strI = null;
            if (dVarB.j()) {
                String strI2 = dVarB.i(serialDescriptor, 0);
                String str3 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, null);
                lf.t tVar3 = (lf.t) dVarB.s(serialDescriptor, 2, l3.f119026a, null);
                t tVar4 = (t) dVarB.s(serialDescriptor, 3, kSerializerArr[3], null);
                D d11 = (D) dVarB.s(serialDescriptor, 4, kSerializerArr[4], null);
                a0 a0Var = a0.f54501a;
                Color color3 = (Color) dVarB.s(serialDescriptor, 5, a0Var, null);
                d10 = d11;
                str = strI2;
                color = (Color) dVarB.p(serialDescriptor, 6, a0Var, null);
                color2 = color3;
                tVar = tVar3;
                tVar2 = tVar4;
                i10 = 127;
                str2 = str3;
            } else {
                boolean z10 = true;
                int i12 = 0;
                Color color4 = null;
                Color color5 = null;
                String str4 = null;
                lf.t tVar5 = null;
                t tVar6 = null;
                D d12 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            strI = dVarB.i(serialDescriptor, 0);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            str4 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str4);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            tVar5 = (lf.t) dVarB.s(serialDescriptor, 2, l3.f119026a, tVar5);
                            i12 |= 4;
                            i11 = 6;
                            break;
                        case 3:
                            tVar6 = (t) dVarB.s(serialDescriptor, 3, kSerializerArr[3], tVar6);
                            i12 |= 8;
                            break;
                        case 4:
                            d12 = (D) dVarB.s(serialDescriptor, 4, kSerializerArr[4], d12);
                            i12 |= 16;
                            break;
                        case 5:
                            color5 = (Color) dVarB.s(serialDescriptor, 5, a0.f54501a, color5);
                            i12 |= 32;
                            break;
                        case 6:
                            color4 = (Color) dVarB.p(serialDescriptor, i11, a0.f54501a, color4);
                            i12 |= 64;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                i10 = i12;
                color = color4;
                color2 = color5;
                str = strI;
                str2 = str4;
                tVar = tVar5;
                tVar2 = tVar6;
                d10 = d12;
            }
            dVarB.c(serialDescriptor);
            return new i(i10, str, str2, tVar, tVar2, d10, color2, color, null, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, i value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54554b;
            xg.f fVarB = encoder.b(serialDescriptor);
            i.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = i.f54545h;
            y2 y2Var = y2.f119104a;
            KSerializer kSerializerT = vg.a.t(y2Var);
            KSerializer kSerializer = kSerializerArr[3];
            KSerializer kSerializer2 = kSerializerArr[4];
            a0 a0Var = a0.f54501a;
            return new KSerializer[]{y2Var, kSerializerT, l3.f119026a, kSerializer, kSerializer2, a0Var, vg.a.t(a0Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54554b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.i$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54553a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ i(int i10, String str, String str2, lf.t tVar, t tVar2, D d10, Color color, Color color2, t2 t2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, tVar, tVar2, d10, color, color2, t2Var);
    }

    public static final /* synthetic */ void a(i self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f54545h;
        output.q(serialDesc, 0, self.text);
        if (output.r(serialDesc, 1) || self.imageUrl != null) {
            output.h(serialDesc, 1, y2.f119104a, self.imageUrl);
        }
        output.F(serialDesc, 2, l3.f119026a, lf.t.a(self.padding));
        output.F(serialDesc, 3, kSerializerArr[3], self.horizontalAlignment);
        output.F(serialDesc, 4, kSerializerArr[4], self.verticalAlignment);
        a0 a0Var = a0.f54501a;
        output.F(serialDesc, 5, a0Var, Color.m1594boximpl(self.foregroundColor));
        if (!output.r(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.h(serialDesc, 6, a0Var, self.backgroundColor);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final D getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ i(int i10, String str, String str2, lf.t tVar, t tVar2, D d10, Color color, Color color2, t2 t2Var) {
        if (61 != (i10 & 61)) {
            e2.a(i10, 61, a.f54553a.getDescriptor());
        }
        this.text = str;
        if ((i10 & 2) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str2;
        }
        this.padding = tVar.g();
        this.horizontalAlignment = tVar2;
        this.verticalAlignment = d10;
        this.foregroundColor = color.m1614unboximpl();
        if ((i10 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
    }
}
