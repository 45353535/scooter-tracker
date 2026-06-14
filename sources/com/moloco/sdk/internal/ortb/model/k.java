package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import yg.l3;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0001\u0018\u0000 :2\u00020\u0001:\u0002\u001c#Bi\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b\u001f\u0010\"\u001a\u0004\b*\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010,\u0012\u0004\b/\u0010\"\u001a\u0004\b-\u0010.R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00100\u0012\u0004\b2\u0010\"\u001a\u0004\b!\u00101R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010\"\u001a\u0004\b5\u00106R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u00108\u0012\u0004\b%\u0010\"\u001a\u0004\b3\u00109R \u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00108\u0012\u0004\b(\u0010\"\u001a\u0004\b(\u00109¨\u0006;"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/k;", "", "", "seen0", "", "customTimerDesc", "", "isDefaultTimer", "Llf/t;", "circleSize", "padding", "Lcom/moloco/sdk/internal/ortb/model/t;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/D;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "backgroundColor", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;ZLlf/t;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lyg/t2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/k;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Ljava/lang/String;", "g", "()V", "b", "Z", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Z", CampaignEx.JSON_KEY_AD_Q, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "I", "d", "()I", "Ljava/lang/Integer;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Ljava/lang/Integer;", "m", "Lcom/moloco/sdk/internal/ortb/model/t;", "()Lcom/moloco/sdk/internal/ortb/model/t;", CampaignEx.JSON_KEY_AD_K, InneractiveMediationDefs.GENDER_FEMALE, "Lcom/moloco/sdk/internal/ortb/model/D;", "h", "()Lcom/moloco/sdk/internal/ortb/model/D;", "o", "J", "()J", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final KSerializer[] f54556i = {null, null, null, null, t.INSTANCE.serializer(), D.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String customTimerDesc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isDefaultTimer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int circleSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Integer padding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final t horizontalAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final D verticalAlignment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long foregroundColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long backgroundColor;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54567c;

        static {
            a aVar = new a();
            f54565a = aVar;
            f54567c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.CountDownTimer", aVar, 8);
            i2Var.n("custom_timer_desc", true);
            i2Var.n("is_default_timer", true);
            i2Var.n("control_size", true);
            i2Var.n("padding", true);
            i2Var.n("horizontal_alignment", true);
            i2Var.n("vertical_alignment", true);
            i2Var.n("foreground_color", true);
            i2Var.n("background_color", true);
            f54566b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k deserialize(Decoder decoder) {
            int i10;
            Color color;
            Color color2;
            D d10;
            t tVar;
            boolean z10;
            String str;
            lf.t tVar2;
            Integer num;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54566b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = k.f54556i;
            int i11 = 7;
            int i12 = 6;
            int i13 = 4;
            if (dVarB.j()) {
                String str2 = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, null);
                boolean zD = dVarB.D(serialDescriptor, 1);
                lf.t tVar3 = (lf.t) dVarB.s(serialDescriptor, 2, l3.f119026a, null);
                Integer num2 = (Integer) dVarB.p(serialDescriptor, 3, x0.f119093a, null);
                t tVar4 = (t) dVarB.s(serialDescriptor, 4, kSerializerArr[4], null);
                D d11 = (D) dVarB.s(serialDescriptor, 5, kSerializerArr[5], null);
                a0 a0Var = a0.f54501a;
                Color color3 = (Color) dVarB.s(serialDescriptor, 6, a0Var, null);
                d10 = d11;
                str = str2;
                color = (Color) dVarB.s(serialDescriptor, 7, a0Var, null);
                color2 = color3;
                num = num2;
                tVar2 = tVar3;
                i10 = 255;
                tVar = tVar4;
                z10 = zD;
            } else {
                boolean z11 = true;
                int i14 = 0;
                Color color4 = null;
                Color color5 = null;
                D d12 = null;
                String str3 = null;
                lf.t tVar5 = null;
                Integer num3 = null;
                boolean zD2 = false;
                t tVar6 = null;
                while (z11) {
                    int i15 = i13;
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            i13 = 4;
                            break;
                        case 0:
                            str3 = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, str3);
                            i14 |= 1;
                            i11 = 7;
                            i12 = 6;
                            i13 = 4;
                            break;
                        case 1:
                            zD2 = dVarB.D(serialDescriptor, 1);
                            i14 |= 2;
                            i11 = 7;
                            i13 = 4;
                            break;
                        case 2:
                            tVar5 = (lf.t) dVarB.s(serialDescriptor, 2, l3.f119026a, tVar5);
                            i14 |= 4;
                            i11 = 7;
                            i13 = 4;
                            break;
                        case 3:
                            num3 = (Integer) dVarB.p(serialDescriptor, 3, x0.f119093a, num3);
                            i14 |= 8;
                            i11 = 7;
                            i13 = 4;
                            break;
                        case 4:
                            tVar6 = (t) dVarB.s(serialDescriptor, i15, kSerializerArr[i15], tVar6);
                            i14 |= 16;
                            i13 = i15;
                            i11 = 7;
                            break;
                        case 5:
                            d12 = (D) dVarB.s(serialDescriptor, 5, kSerializerArr[5], d12);
                            i14 |= 32;
                            i13 = i15;
                            break;
                        case 6:
                            color5 = (Color) dVarB.s(serialDescriptor, i12, a0.f54501a, color5);
                            i14 |= 64;
                            i13 = i15;
                            break;
                        case 7:
                            color4 = (Color) dVarB.s(serialDescriptor, i11, a0.f54501a, color4);
                            i14 |= 128;
                            i13 = i15;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                i10 = i14;
                color = color4;
                color2 = color5;
                d10 = d12;
                tVar = tVar6;
                z10 = zD2;
                str = str3;
                tVar2 = tVar5;
                num = num3;
            }
            dVarB.c(serialDescriptor);
            return new k(i10, str, z10, tVar2, num, tVar, d10, color2, color, null, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, k value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54566b;
            xg.f fVarB = encoder.b(serialDescriptor);
            k.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = k.f54556i;
            KSerializer kSerializerT = vg.a.t(y2.f119104a);
            KSerializer kSerializerT2 = vg.a.t(x0.f119093a);
            KSerializer kSerializer = kSerializerArr[4];
            KSerializer kSerializer2 = kSerializerArr[5];
            a0 a0Var = a0.f54501a;
            return new KSerializer[]{kSerializerT, yg.i.f118983a, l3.f119026a, kSerializerT2, kSerializer, kSerializer2, a0Var, a0Var};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54566b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54565a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ k(int i10, String str, boolean z10, lf.t tVar, Integer num, t tVar2, D d10, Color color, Color color2, t2 t2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, z10, tVar, num, tVar2, d10, color, color2, t2Var);
    }

    public static final /* synthetic */ void a(k self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f54556i;
        if (output.r(serialDesc, 0) || self.customTimerDesc != null) {
            output.h(serialDesc, 0, y2.f119104a, self.customTimerDesc);
        }
        if (output.r(serialDesc, 1) || !self.isDefaultTimer) {
            output.p(serialDesc, 1, self.isDefaultTimer);
        }
        if (output.r(serialDesc, 2) || self.circleSize != 30) {
            output.F(serialDesc, 2, l3.f119026a, lf.t.a(self.circleSize));
        }
        if (output.r(serialDesc, 3) || self.padding != null) {
            output.h(serialDesc, 3, x0.f119093a, self.padding);
        }
        if (output.r(serialDesc, 4) || self.horizontalAlignment != t.f54632g) {
            output.F(serialDesc, 4, kSerializerArr[4], self.horizontalAlignment);
        }
        if (output.r(serialDesc, 5) || self.verticalAlignment != D.f54491c) {
            output.F(serialDesc, 5, kSerializerArr[5], self.verticalAlignment);
        }
        if (output.r(serialDesc, 6) || !Color.m1605equalsimpl0(self.foregroundColor, ColorKt.Color(android.graphics.Color.parseColor("#FF4285f4")))) {
            output.F(serialDesc, 6, a0.f54501a, Color.m1594boximpl(self.foregroundColor));
        }
        if (!output.r(serialDesc, 7) && Color.m1605equalsimpl0(self.backgroundColor, ColorKt.Color(android.graphics.Color.parseColor("#FFFFFFFF")))) {
            return;
        }
        output.F(serialDesc, 7, a0.f54501a, Color.m1594boximpl(self.backgroundColor));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCircleSize() {
        return this.circleSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCustomTimerDesc() {
        return this.customTimerDesc;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final t getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final D getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDefaultTimer() {
        return this.isDefaultTimer;
    }

    public /* synthetic */ k(int i10, String str, boolean z10, lf.t tVar, Integer num, t tVar2, D d10, Color color, Color color2, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.customTimerDesc = null;
        } else {
            this.customTimerDesc = str;
        }
        if ((i10 & 2) == 0) {
            this.isDefaultTimer = true;
        } else {
            this.isDefaultTimer = z10;
        }
        this.circleSize = (i10 & 4) == 0 ? 30 : tVar.g();
        if ((i10 & 8) == 0) {
            this.padding = null;
        } else {
            this.padding = num;
        }
        if ((i10 & 16) == 0) {
            this.horizontalAlignment = t.f54632g;
        } else {
            this.horizontalAlignment = tVar2;
        }
        if ((i10 & 32) == 0) {
            this.verticalAlignment = D.f54491c;
        } else {
            this.verticalAlignment = d10;
        }
        this.foregroundColor = (i10 & 64) == 0 ? ColorKt.Color(android.graphics.Color.parseColor("#FF4285f4")) : color.m1614unboximpl();
        this.backgroundColor = (i10 & 128) == 0 ? ColorKt.Color(android.graphics.Color.parseColor("#FFFFFFFF")) : color2.m1614unboximpl();
    }
}
