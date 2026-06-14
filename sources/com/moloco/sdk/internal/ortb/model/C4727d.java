package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
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
import yg.y2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u0015\u0011B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u0012\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/d;", "", "", "seen0", "", "clickTracking", "clickThrough", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/d;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Ljava/lang/String;", "d", "()V", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class C4727d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String clickTracking;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String clickThrough;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return c.f54517a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.d$c */
    public /* synthetic */ class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f54517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54519c;

        static {
            c cVar = new c();
            f54517a = cVar;
            f54519c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.BannerClickMetaData", cVar, 2);
            i2Var.n("click_tracking", true);
            i2Var.n("click_through", true);
            f54518b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4727d deserialize(Decoder decoder) {
            String str;
            int i10;
            String str2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54518b;
            xg.d dVarB = decoder.b(serialDescriptor);
            t2 t2Var = null;
            if (dVarB.j()) {
                y2 y2Var = y2.f119104a;
                str2 = (String) dVarB.p(serialDescriptor, 0, y2Var, null);
                str = (String) dVarB.p(serialDescriptor, 1, y2Var, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                String str3 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        str3 = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, str3);
                        i11 |= 1;
                    } else {
                        if (iX != 1) {
                            throw new ug.z(iX);
                        }
                        str = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str);
                        i11 |= 2;
                    }
                }
                i10 = i11;
                str2 = str3;
            }
            dVarB.c(serialDescriptor);
            return new C4727d(i10, str2, str, t2Var);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C4727d value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54518b;
            xg.f fVarB = encoder.b(serialDescriptor);
            C4727d.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            y2 y2Var = y2.f119104a;
            return new KSerializer[]{vg.a.t(y2Var), vg.a.t(y2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54518b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    public /* synthetic */ C4727d(int i10, String str, String str2, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.clickTracking = null;
        } else {
            this.clickTracking = str;
        }
        if ((i10 & 2) == 0) {
            this.clickThrough = null;
        } else {
            this.clickThrough = str2;
        }
    }

    public static final /* synthetic */ void b(C4727d self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.clickTracking != null) {
            output.h(serialDesc, 0, y2.f119104a, self.clickTracking);
        }
        if (!output.r(serialDesc, 1) && self.clickThrough == null) {
            return;
        }
        output.h(serialDesc, 1, y2.f119104a, self.clickThrough);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClickThrough() {
        return this.clickThrough;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getClickTracking() {
        return this.clickTracking;
    }
}
