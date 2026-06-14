package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
import yg.n0;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001c\u0013B7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u0012\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u0012\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/b;", "", "", "seen0", "", "onSkip", "", "eventLink", "clickthroughUrl", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/b;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Z", "d", "()Z", InneractiveMediationDefs.GENDER_FEMALE, "()V", "Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Ljava/lang/String;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class C4725b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean onSkip;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String eventLink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String clickthroughUrl;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return c.f54506a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.b$c */
    public /* synthetic */ class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f54506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54508c;

        static {
            c cVar = new c();
            f54506a = cVar;
            f54508c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.AutoInline", cVar, 3);
            i2Var.n("on_skip", false);
            i2Var.n("event_link", false);
            i2Var.n("click_through", true);
            f54507b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4725b deserialize(Decoder decoder) {
            boolean zD;
            int i10;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54507b;
            xg.d dVarB = decoder.b(serialDescriptor);
            if (dVarB.j()) {
                zD = dVarB.D(serialDescriptor, 0);
                String strI = dVarB.i(serialDescriptor, 1);
                str2 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, null);
                str = strI;
                i10 = 7;
            } else {
                boolean z10 = true;
                zD = false;
                String strI2 = null;
                String str3 = null;
                int i11 = 0;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        zD = dVarB.D(serialDescriptor, 0);
                        i11 |= 1;
                    } else if (iX == 1) {
                        strI2 = dVarB.i(serialDescriptor, 1);
                        i11 |= 2;
                    } else {
                        if (iX != 2) {
                            throw new ug.z(iX);
                        }
                        str3 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, str3);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                str = strI2;
                str2 = str3;
            }
            boolean z11 = zD;
            dVarB.c(serialDescriptor);
            return new C4725b(i10, z11, str, str2, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C4725b value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54507b;
            xg.f fVarB = encoder.b(serialDescriptor);
            C4725b.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            y2 y2Var = y2.f119104a;
            return new KSerializer[]{yg.i.f118983a, y2Var, vg.a.t(y2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54507b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    public /* synthetic */ C4725b(int i10, boolean z10, String str, String str2, t2 t2Var) {
        if (3 != (i10 & 3)) {
            e2.a(i10, 3, c.f54506a.getDescriptor());
        }
        this.onSkip = z10;
        this.eventLink = str;
        if ((i10 & 4) == 0) {
            this.clickthroughUrl = null;
        } else {
            this.clickthroughUrl = str2;
        }
    }

    public static final /* synthetic */ void b(C4725b self, xg.f output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.onSkip);
        output.q(serialDesc, 1, self.eventLink);
        if (!output.r(serialDesc, 2) && self.clickthroughUrl == null) {
            return;
        }
        output.h(serialDesc, 2, y2.f119104a, self.clickthroughUrl);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClickthroughUrl() {
        return this.clickthroughUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventLink() {
        return this.eventLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getOnSkip() {
        return this.onSkip;
    }
}
