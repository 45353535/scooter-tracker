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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0001\u0018\u0000 72\u00020\u0001:\u0002\u001b\"BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010!\u001a\u0004\b)\u0010*R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010!\u001a\u0004\b+\u0010.R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b\u001e\u0010!\u001a\u0004\b0\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u00103\u0012\u0004\b0\u0010!\u001a\u0004\b,\u00104R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00105\u0012\u0004\b'\u0010!\u001a\u0004\b'\u00106¨\u00068"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/w;", "", "", "mute", "Llf/t;", "padding", "Lcom/moloco/sdk/internal/ortb/model/t;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/D;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "controlSize", "backgroundColor", "<init>", "(ZILcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;JLlf/t;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(IZLlf/t;Lcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;Landroidx/compose/ui/graphics/Color;Llf/t;Landroidx/compose/ui/graphics/Color;Lyg/t2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/w;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "g", "()Z", CampaignEx.JSON_KEY_AD_K, "()V", "b", "I", "h", "()I", "m", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/internal/ortb/model/t;", InneractiveMediationDefs.GENDER_FEMALE, "()Lcom/moloco/sdk/internal/ortb/model/t;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "d", "Lcom/moloco/sdk/internal/ortb/model/D;", "()Lcom/moloco/sdk/internal/ortb/model/D;", "o", EidRequestBuilder.REQUEST_FIELD_EMAIL, "J", "()J", "Llf/t;", "()Llf/t;", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class w {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f54643h = {null, null, t.INSTANCE.serializer(), D.INSTANCE.serializer(), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean mute;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int padding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final t horizontalAlignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final D verticalAlignment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long foregroundColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final lf.t controlSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Color backgroundColor;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54653c;

        static {
            a aVar = new a();
            f54651a = aVar;
            f54653c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.Mute", aVar, 7);
            i2Var.n("mute", false);
            i2Var.n("padding", false);
            i2Var.n("horizontal_alignment", false);
            i2Var.n("vertical_alignment", false);
            i2Var.n("foreground_color", false);
            i2Var.n("control_size", true);
            i2Var.n("background_color", true);
            f54652b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w deserialize(Decoder decoder) {
            boolean zD;
            Color color;
            lf.t tVar;
            int i10;
            lf.t tVar2;
            t tVar3;
            D d10;
            Color color2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54652b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = w.f54643h;
            int i11 = 6;
            int i12 = 2;
            if (dVarB.j()) {
                zD = dVarB.D(serialDescriptor, 0);
                l3 l3Var = l3.f119026a;
                lf.t tVar4 = (lf.t) dVarB.s(serialDescriptor, 1, l3Var, null);
                t tVar5 = (t) dVarB.s(serialDescriptor, 2, kSerializerArr[2], null);
                D d11 = (D) dVarB.s(serialDescriptor, 3, kSerializerArr[3], null);
                a0 a0Var = a0.f54501a;
                Color color3 = (Color) dVarB.s(serialDescriptor, 4, a0Var, null);
                lf.t tVar6 = (lf.t) dVarB.p(serialDescriptor, 5, l3Var, null);
                d10 = d11;
                color = (Color) dVarB.p(serialDescriptor, 6, a0Var, null);
                tVar = tVar6;
                color2 = color3;
                i10 = 127;
                tVar3 = tVar5;
                tVar2 = tVar4;
            } else {
                boolean z10 = true;
                zD = false;
                Color color4 = null;
                lf.t tVar7 = null;
                t tVar8 = null;
                D d12 = null;
                Color color5 = null;
                int i13 = 0;
                lf.t tVar9 = null;
                while (z10) {
                    int i14 = i12;
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            i12 = 2;
                            break;
                        case 0:
                            zD = dVarB.D(serialDescriptor, 0);
                            i13 |= 1;
                            i11 = 6;
                            i12 = 2;
                            break;
                        case 1:
                            tVar7 = (lf.t) dVarB.s(serialDescriptor, 1, l3.f119026a, tVar7);
                            i13 |= 2;
                            i11 = 6;
                            i12 = 2;
                            break;
                        case 2:
                            tVar8 = (t) dVarB.s(serialDescriptor, i14, kSerializerArr[i14], tVar8);
                            i13 |= 4;
                            i12 = i14;
                            i11 = 6;
                            break;
                        case 3:
                            d12 = (D) dVarB.s(serialDescriptor, 3, kSerializerArr[3], d12);
                            i13 |= 8;
                            i12 = i14;
                            break;
                        case 4:
                            color5 = (Color) dVarB.s(serialDescriptor, 4, a0.f54501a, color5);
                            i13 |= 16;
                            i12 = i14;
                            break;
                        case 5:
                            tVar9 = (lf.t) dVarB.p(serialDescriptor, 5, l3.f119026a, tVar9);
                            i13 |= 32;
                            i12 = i14;
                            break;
                        case 6:
                            color4 = (Color) dVarB.p(serialDescriptor, i11, a0.f54501a, color4);
                            i13 |= 64;
                            i12 = i14;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                color = color4;
                tVar = tVar9;
                i10 = i13;
                tVar2 = tVar7;
                tVar3 = tVar8;
                d10 = d12;
                color2 = color5;
            }
            boolean z11 = zD;
            dVarB.c(serialDescriptor);
            return new w(i10, z11, tVar2, tVar3, d10, color2, tVar, color, null, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, w value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54652b;
            xg.f fVarB = encoder.b(serialDescriptor);
            w.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = w.f54643h;
            l3 l3Var = l3.f119026a;
            KSerializer kSerializer = kSerializerArr[2];
            KSerializer kSerializer2 = kSerializerArr[3];
            a0 a0Var = a0.f54501a;
            return new KSerializer[]{yg.i.f118983a, l3Var, kSerializer, kSerializer2, a0Var, vg.a.t(l3Var), vg.a.t(a0Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54652b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.w$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54651a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ w(int i10, boolean z10, lf.t tVar, t tVar2, D d10, Color color, lf.t tVar3, Color color2, t2 t2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, tVar, tVar2, d10, color, tVar3, color2, t2Var);
    }

    public static final /* synthetic */ void a(w self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f54643h;
        output.p(serialDesc, 0, self.mute);
        l3 l3Var = l3.f119026a;
        output.F(serialDesc, 1, l3Var, lf.t.a(self.padding));
        output.F(serialDesc, 2, kSerializerArr[2], self.horizontalAlignment);
        output.F(serialDesc, 3, kSerializerArr[3], self.verticalAlignment);
        a0 a0Var = a0.f54501a;
        output.F(serialDesc, 4, a0Var, Color.m1594boximpl(self.foregroundColor));
        if (output.r(serialDesc, 5) || self.controlSize != null) {
            output.h(serialDesc, 5, l3Var, self.controlSize);
        }
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
    public final lf.t getControlSize() {
        return this.controlSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getMute() {
        return this.mute;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final D getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ w(boolean z10, int i10, t tVar, D d10, long j10, lf.t tVar2, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, tVar, d10, j10, tVar2, color);
    }

    public /* synthetic */ w(int i10, boolean z10, lf.t tVar, t tVar2, D d10, Color color, lf.t tVar3, Color color2, t2 t2Var) {
        if (31 != (i10 & 31)) {
            e2.a(i10, 31, a.f54651a.getDescriptor());
        }
        this.mute = z10;
        this.padding = tVar.g();
        this.horizontalAlignment = tVar2;
        this.verticalAlignment = d10;
        this.foregroundColor = color.m1614unboximpl();
        if ((i10 & 32) == 0) {
            this.controlSize = null;
        } else {
            this.controlSize = tVar3;
        }
        if ((i10 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
    }

    public w(boolean z10, int i10, t horizontalAlignment, D verticalAlignment, long j10, lf.t tVar, Color color) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.mute = z10;
        this.padding = i10;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j10;
        this.controlSize = tVar;
        this.backgroundColor = color;
    }

    public /* synthetic */ w(boolean z10, int i10, t tVar, D d10, long j10, lf.t tVar2, Color color, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, tVar, d10, j10, (i11 & 32) != 0 ? null : tVar2, (i11 & 64) != 0 ? null : color, null);
    }
}
