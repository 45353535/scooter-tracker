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

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0001\u0018\u0000 22\u00020\u0001:\u0002\u001a!BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001c\u0012\u0004\b\u001d\u0010 \u001a\u0004\b%\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010 \u001a\u0004\b\u001f\u0010'R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010)\u0012\u0004\b,\u0010 \u001a\u0004\b*\u0010+R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b*\u0010 \u001a\u0004\b-\u0010/R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00100\u0012\u0004\b$\u0010 \u001a\u0004\b$\u00101¨\u00063"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/B;", "", "Llf/t;", "delaySeconds", "padding", "controlSize", "Lcom/moloco/sdk/internal/ortb/model/t;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/D;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "backgroundColor", "<init>", "(IIILcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;JLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILlf/t;Llf/t;Llf/t;Lcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lyg/t2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/B;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()I", "g", "()V", "b", "h", "m", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "Lcom/moloco/sdk/internal/ortb/model/t;", "()Lcom/moloco/sdk/internal/ortb/model/t;", CampaignEx.JSON_KEY_AD_K, "Lcom/moloco/sdk/internal/ortb/model/D;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Lcom/moloco/sdk/internal/ortb/model/D;", "o", InneractiveMediationDefs.GENDER_FEMALE, "J", "()J", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class B {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f54472h = {null, null, null, t.INSTANCE.serializer(), D.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int delaySeconds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int padding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int controlSize;

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
        public static final a f54480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54482c;

        static {
            a aVar = new a();
            f54480a = aVar;
            f54482c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.SkipClose", aVar, 7);
            i2Var.n("delay_seconds", false);
            i2Var.n("padding", false);
            i2Var.n("control_size", false);
            i2Var.n("horizontal_alignment", false);
            i2Var.n("vertical_alignment", false);
            i2Var.n("foreground_color", false);
            i2Var.n("background_color", true);
            f54481b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B deserialize(Decoder decoder) {
            int i10;
            Color color;
            Color color2;
            lf.t tVar;
            lf.t tVar2;
            lf.t tVar3;
            t tVar4;
            D d10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54481b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = B.f54472h;
            int i11 = 6;
            lf.t tVar5 = null;
            if (dVarB.j()) {
                l3 l3Var = l3.f119026a;
                lf.t tVar6 = (lf.t) dVarB.s(serialDescriptor, 0, l3Var, null);
                lf.t tVar7 = (lf.t) dVarB.s(serialDescriptor, 1, l3Var, null);
                lf.t tVar8 = (lf.t) dVarB.s(serialDescriptor, 2, l3Var, null);
                t tVar9 = (t) dVarB.s(serialDescriptor, 3, kSerializerArr[3], null);
                D d11 = (D) dVarB.s(serialDescriptor, 4, kSerializerArr[4], null);
                a0 a0Var = a0.f54501a;
                Color color3 = (Color) dVarB.s(serialDescriptor, 5, a0Var, null);
                d10 = d11;
                tVar3 = tVar8;
                color = (Color) dVarB.p(serialDescriptor, 6, a0Var, null);
                color2 = color3;
                tVar4 = tVar9;
                i10 = 127;
                tVar2 = tVar7;
                tVar = tVar6;
            } else {
                boolean z10 = true;
                int i12 = 0;
                Color color4 = null;
                Color color5 = null;
                lf.t tVar10 = null;
                lf.t tVar11 = null;
                t tVar12 = null;
                D d12 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            i11 = 6;
                            break;
                        case 0:
                            tVar5 = (lf.t) dVarB.s(serialDescriptor, 0, l3.f119026a, tVar5);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            tVar10 = (lf.t) dVarB.s(serialDescriptor, 1, l3.f119026a, tVar10);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            tVar11 = (lf.t) dVarB.s(serialDescriptor, 2, l3.f119026a, tVar11);
                            i12 |= 4;
                            i11 = 6;
                            break;
                        case 3:
                            tVar12 = (t) dVarB.s(serialDescriptor, 3, kSerializerArr[3], tVar12);
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
                tVar = tVar5;
                tVar2 = tVar10;
                tVar3 = tVar11;
                tVar4 = tVar12;
                d10 = d12;
            }
            dVarB.c(serialDescriptor);
            return new B(i10, tVar, tVar2, tVar3, tVar4, d10, color2, color, null, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, B value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54481b;
            xg.f fVarB = encoder.b(serialDescriptor);
            B.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = B.f54472h;
            KSerializer kSerializer = kSerializerArr[3];
            KSerializer kSerializer2 = kSerializerArr[4];
            a0 a0Var = a0.f54501a;
            KSerializer kSerializerT = vg.a.t(a0Var);
            l3 l3Var = l3.f119026a;
            return new KSerializer[]{l3Var, l3Var, l3Var, kSerializer, kSerializer2, a0Var, kSerializerT};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54481b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.B$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54480a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ B(int i10, int i11, int i12, t tVar, D d10, long j10, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, tVar, d10, j10, color);
    }

    public static final /* synthetic */ void a(B self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f54472h;
        l3 l3Var = l3.f119026a;
        output.F(serialDesc, 0, l3Var, lf.t.a(self.delaySeconds));
        output.F(serialDesc, 1, l3Var, lf.t.a(self.padding));
        output.F(serialDesc, 2, l3Var, lf.t.a(self.controlSize));
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
    public final int getControlSize() {
        return this.controlSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDelaySeconds() {
        return this.delaySeconds;
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
    public final int getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final D getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ B(int i10, lf.t tVar, lf.t tVar2, lf.t tVar3, t tVar4, D d10, Color color, Color color2, t2 t2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, tVar, tVar2, tVar3, tVar4, d10, color, color2, t2Var);
    }

    public /* synthetic */ B(int i10, lf.t tVar, lf.t tVar2, lf.t tVar3, t tVar4, D d10, Color color, Color color2, t2 t2Var) {
        if (63 != (i10 & 63)) {
            e2.a(i10, 63, a.f54480a.getDescriptor());
        }
        this.delaySeconds = tVar.g();
        this.padding = tVar2.g();
        this.controlSize = tVar3.g();
        this.horizontalAlignment = tVar4;
        this.verticalAlignment = d10;
        this.foregroundColor = color.m1614unboximpl();
        if ((i10 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
    }

    public B(int i10, int i11, int i12, t horizontalAlignment, D verticalAlignment, long j10, Color color) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.delaySeconds = i10;
        this.padding = i11;
        this.controlSize = i12;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j10;
        this.backgroundColor = color;
    }

    public /* synthetic */ B(int i10, int i11, int i12, t tVar, D d10, long j10, Color color, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, tVar, d10, j10, (i13 & 64) != 0 ? null : color, null);
    }
}
