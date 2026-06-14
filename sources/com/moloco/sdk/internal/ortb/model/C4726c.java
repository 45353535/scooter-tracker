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

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001c\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/c;", "", "", "enabled", "onSkip", "", "eventLink", "<init>", "(ZZLjava/lang/String;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(IZZLjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/c;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "b", "()Z", "()V", "d", InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/lang/String;", "()Ljava/lang/String;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class C4726c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean onSkip;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String eventLink;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0668c.f54512a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0668c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0668c f54512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54514c;

        static {
            C0668c c0668c = new C0668c();
            f54512a = c0668c;
            f54514c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.AutoStore", c0668c, 3);
            i2Var.n("enabled", false);
            i2Var.n("on_skip", true);
            i2Var.n("event_link", true);
            f54513b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4726c deserialize(Decoder decoder) {
            boolean zD;
            boolean z10;
            int i10;
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54513b;
            xg.d dVarB = decoder.b(serialDescriptor);
            if (dVarB.j()) {
                zD = dVarB.D(serialDescriptor, 0);
                boolean zD2 = dVarB.D(serialDescriptor, 1);
                str = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, null);
                z10 = zD2;
                i10 = 7;
            } else {
                boolean z11 = true;
                zD = false;
                int i11 = 0;
                String str2 = null;
                boolean zD3 = false;
                while (z11) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z11 = false;
                    } else if (iX == 0) {
                        zD = dVarB.D(serialDescriptor, 0);
                        i11 |= 1;
                    } else if (iX == 1) {
                        zD3 = dVarB.D(serialDescriptor, 1);
                        i11 |= 2;
                    } else {
                        if (iX != 2) {
                            throw new ug.z(iX);
                        }
                        str2 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, str2);
                        i11 |= 4;
                    }
                }
                z10 = zD3;
                i10 = i11;
                str = str2;
            }
            boolean z12 = zD;
            dVarB.c(serialDescriptor);
            return new C4726c(i10, z12, z10, str, (t2) null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C4726c value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54513b;
            xg.f fVarB = encoder.b(serialDescriptor);
            C4726c.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerT = vg.a.t(y2.f119104a);
            yg.i iVar = yg.i.f118983a;
            return new KSerializer[]{iVar, iVar, kSerializerT};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54513b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    public /* synthetic */ C4726c(int i10, boolean z10, boolean z11, String str, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, C0668c.f54512a.getDescriptor());
        }
        this.enabled = z10;
        if ((i10 & 2) == 0) {
            this.onSkip = true;
        } else {
            this.onSkip = z11;
        }
        if ((i10 & 4) == 0) {
            this.eventLink = null;
        } else {
            this.eventLink = str;
        }
    }

    public static final /* synthetic */ void a(C4726c self, xg.f output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.enabled);
        if (output.r(serialDesc, 1) || !self.onSkip) {
            output.p(serialDesc, 1, self.onSkip);
        }
        if (!output.r(serialDesc, 2) && self.eventLink == null) {
            return;
        }
        output.h(serialDesc, 2, y2.f119104a, self.eventLink);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventLink() {
        return this.eventLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getOnSkip() {
        return this.onSkip;
    }

    public C4726c(boolean z10, boolean z11, String str) {
        this.enabled = z10;
        this.onSkip = z11;
        this.eventLink = str;
    }

    public /* synthetic */ C4726c(boolean z10, boolean z11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? null : str);
    }
}
