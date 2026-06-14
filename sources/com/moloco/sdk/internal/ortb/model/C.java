package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0002\u0014\u001bB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001f\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u0019\u0010 ¨\u0006#"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/C;", "", "", "seen0", "Llf/t;", "padding", "Lcom/moloco/sdk/internal/ortb/model/t;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/D;", "verticalAlignment", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILlf/t;Lcom/moloco/sdk/internal/ortb/model/t;Lcom/moloco/sdk/internal/ortb/model/D;Lyg/t2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/C;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", "d", "()I", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()V", "b", "Lcom/moloco/sdk/internal/ortb/model/t;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Lcom/moloco/sdk/internal/ortb/model/t;", "Lcom/moloco/sdk/internal/ortb/model/D;", "()Lcom/moloco/sdk/internal/ortb/model/D;", "g", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class C {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f54483d = {null, t.INSTANCE.serializer(), D.INSTANCE.serializer()};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int padding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final t horizontalAlignment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final D verticalAlignment;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54489c;

        static {
            a aVar = new a();
            f54487a = aVar;
            f54489c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.VastPrivacyIcon", aVar, 3);
            i2Var.n("padding", false);
            i2Var.n("horizontal_alignment", false);
            i2Var.n("vertical_alignment", false);
            f54488b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C deserialize(Decoder decoder) {
            int i10;
            lf.t tVar;
            t tVar2;
            D d10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54488b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = C.f54483d;
            lf.t tVar3 = null;
            if (dVarB.j()) {
                lf.t tVar4 = (lf.t) dVarB.s(serialDescriptor, 0, l3.f119026a, null);
                t tVar5 = (t) dVarB.s(serialDescriptor, 1, kSerializerArr[1], null);
                d10 = (D) dVarB.s(serialDescriptor, 2, kSerializerArr[2], null);
                tVar = tVar4;
                i10 = 7;
                tVar2 = tVar5;
            } else {
                boolean z10 = true;
                int i11 = 0;
                t tVar6 = null;
                D d11 = null;
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
                    } else {
                        if (iX != 2) {
                            throw new ug.z(iX);
                        }
                        d11 = (D) dVarB.s(serialDescriptor, 2, kSerializerArr[2], d11);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                tVar = tVar3;
                tVar2 = tVar6;
                d10 = d11;
            }
            dVarB.c(serialDescriptor);
            return new C(i10, tVar, tVar2, d10, null, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54488b;
            xg.f fVarB = encoder.b(serialDescriptor);
            C.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = C.f54483d;
            return new KSerializer[]{l3.f119026a, kSerializerArr[1], kSerializerArr[2]};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54488b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.C$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54487a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C(int i10, lf.t tVar, t tVar2, D d10, t2 t2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, tVar, tVar2, d10, t2Var);
    }

    public static final /* synthetic */ void a(C self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f54483d;
        output.F(serialDesc, 0, l3.f119026a, lf.t.a(self.padding));
        output.F(serialDesc, 1, kSerializerArr[1], self.horizontalAlignment);
        output.F(serialDesc, 2, kSerializerArr[2], self.verticalAlignment);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final D getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ C(int i10, lf.t tVar, t tVar2, D d10, t2 t2Var) {
        if (7 != (i10 & 7)) {
            e2.a(i10, 7, a.f54487a.getDescriptor());
        }
        this.padding = tVar.g();
        this.horizontalAlignment = tVar2;
        this.verticalAlignment = d10;
    }
}
