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
import yg.e2;
import yg.i2;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0019\u0015B-\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u0012\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/a;", "", "", "seen0", "", "enabled", "", "url", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(IZLjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/a;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "b", "()Z", "()V", "Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Ljava/lang/String;", "d", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class C4724a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return c.f54498a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.a$c */
    public /* synthetic */ class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f54498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54500c;

        static {
            c cVar = new c();
            f54498a = cVar;
            f54500c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.AndroidInline", cVar, 2);
            i2Var.n("enabled", false);
            i2Var.n("url", false);
            f54499b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4724a deserialize(Decoder decoder) {
            boolean zD;
            String strI;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54499b;
            xg.d dVarB = decoder.b(serialDescriptor);
            t2 t2Var = null;
            if (dVarB.j()) {
                zD = dVarB.D(serialDescriptor, 0);
                strI = dVarB.i(serialDescriptor, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                zD = false;
                int i11 = 0;
                String strI2 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        zD = dVarB.D(serialDescriptor, 0);
                        i11 |= 1;
                    } else {
                        if (iX != 1) {
                            throw new ug.z(iX);
                        }
                        strI2 = dVarB.i(serialDescriptor, 1);
                        i11 |= 2;
                    }
                }
                strI = strI2;
                i10 = i11;
            }
            dVarB.c(serialDescriptor);
            return new C4724a(i10, zD, strI, t2Var);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C4724a value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54499b;
            xg.f fVarB = encoder.b(serialDescriptor);
            C4724a.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{yg.i.f118983a, y2.f119104a};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54499b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    public /* synthetic */ C4724a(int i10, boolean z10, String str, t2 t2Var) {
        if (3 != (i10 & 3)) {
            e2.a(i10, 3, c.f54498a.getDescriptor());
        }
        this.enabled = z10;
        this.url = str;
    }

    public static final /* synthetic */ void a(C4724a self, xg.f output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.enabled);
        output.q(serialDesc, 1, self.url);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
