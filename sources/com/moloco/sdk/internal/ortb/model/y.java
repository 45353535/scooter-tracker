package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 )2\u00020\u0001:\u0002\u0017\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\u001a\u0010\u001d\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u001d\u001a\u0004\b$\u0010%R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010'\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010(¨\u0006*"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/y;", "", "Llf/t;", "padding", "Lcom/moloco/sdk/internal/ortb/model/t;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/D;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "<init>", "(ILcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILlf/t;Lcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;Landroidx/compose/ui/graphics/Color;Lyg/t2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/y;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()I", "g", "()V", "b", "Lcom/moloco/sdk/internal/ortb/model/t;", "d", "()Lcom/moloco/sdk/internal/ortb/model/t;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/internal/ortb/model/D;", InneractiveMediationDefs.GENDER_FEMALE, "()Lcom/moloco/sdk/internal/ortb/model/D;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "J", "()J", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class y {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KSerializer[] f54670e = {null, t.INSTANCE.serializer(), D.INSTANCE.serializer(), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int padding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final t horizontalAlignment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final D verticalAlignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long foregroundColor;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54677c;

        static {
            a aVar = new a();
            f54675a = aVar;
            f54677c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.ProgressBar", aVar, 4);
            i2Var.n("padding", false);
            i2Var.n("horizontal_alignment", false);
            i2Var.n("vertical_alignment", false);
            i2Var.n("foreground_color", false);
            f54676b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y deserialize(Decoder decoder) {
            int i10;
            lf.t tVar;
            t tVar2;
            D d10;
            Color color;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54676b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = y.f54670e;
            lf.t tVar3 = null;
            if (dVarB.j()) {
                lf.t tVar4 = (lf.t) dVarB.s(serialDescriptor, 0, l3.f119026a, null);
                t tVar5 = (t) dVarB.s(serialDescriptor, 1, kSerializerArr[1], null);
                d10 = (D) dVarB.s(serialDescriptor, 2, kSerializerArr[2], null);
                tVar = tVar4;
                color = (Color) dVarB.s(serialDescriptor, 3, a0.f54501a, null);
                i10 = 15;
                tVar2 = tVar5;
            } else {
                boolean z10 = true;
                int i11 = 0;
                t tVar6 = null;
                D d11 = null;
                Color color2 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        tVar3 = (lf.t) dVarB.s(serialDescriptor, 0, l3.f119026a, tVar3);
                        i11 |= 1;
                    } else if (iX == 1) {
                        tVar6 = (t) dVarB.s(serialDescriptor, 1, kSerializerArr[1], tVar6);
                        i11 |= 2;
                    } else if (iX == 2) {
                        d11 = (D) dVarB.s(serialDescriptor, 2, kSerializerArr[2], d11);
                        i11 |= 4;
                    } else {
                        if (iX != 3) {
                            throw new ug.z(iX);
                        }
                        color2 = (Color) dVarB.s(serialDescriptor, 3, a0.f54501a, color2);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                tVar = tVar3;
                tVar2 = tVar6;
                d10 = d11;
                color = color2;
            }
            dVarB.c(serialDescriptor);
            return new y(i10, tVar, tVar2, d10, color, null, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, y value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54676b;
            xg.f fVarB = encoder.b(serialDescriptor);
            y.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = y.f54670e;
            return new KSerializer[]{l3.f119026a, kSerializerArr[1], kSerializerArr[2], a0.f54501a};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54676b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.y$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54675a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ y(int i10, t tVar, D d10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, tVar, d10, j10);
    }

    public static final /* synthetic */ void a(y self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f54670e;
        output.F(serialDesc, 0, l3.f119026a, lf.t.a(self.padding));
        output.F(serialDesc, 1, kSerializerArr[1], self.horizontalAlignment);
        output.F(serialDesc, 2, kSerializerArr[2], self.verticalAlignment);
        output.F(serialDesc, 3, a0.f54501a, Color.m1594boximpl(self.foregroundColor));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final D getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ y(int i10, lf.t tVar, t tVar2, D d10, Color color, t2 t2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, tVar, tVar2, d10, color, t2Var);
    }

    public /* synthetic */ y(int i10, lf.t tVar, t tVar2, D d10, Color color, t2 t2Var) {
        if (15 != (i10 & 15)) {
            e2.a(i10, 15, a.f54675a.getDescriptor());
        }
        this.padding = tVar.g();
        this.horizontalAlignment = tVar2;
        this.verticalAlignment = d10;
        this.foregroundColor = color.m1614unboximpl();
    }

    public y(int i10, t horizontalAlignment, D verticalAlignment, long j10) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.padding = i10;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j10;
    }
}
