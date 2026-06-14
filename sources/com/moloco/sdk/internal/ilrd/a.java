package com.moloco.sdk.internal.ilrd;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.d;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import lf.m;
import org.jetbrains.annotations.NotNull;
import ug.l;
import ug.z;
import yg.e2;
import yg.i1;
import yg.i2;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0662a f54356g = new C0662a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54357h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f54358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionData f54359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f54360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f54362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54363f;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$a, reason: collision with other inner class name */
    public static final class C0662a {
        public /* synthetic */ C0662a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0662a() {
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$b, reason: from toString */
    @StabilityInferred(parameters = 1)
    @l
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002\u0018&B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b*\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b+\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b,\u0010\u001e¨\u0006."}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$b;", "", "", "lastEventReceivedTs", "", "banner", "mrec", "native", "interstitial", "rewarded", "<init>", "(JIIIII)V", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(IJIIIIILyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "(Lcom/moloco/sdk/internal/ilrd/a$b;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "(JIIIII)Lcom/moloco/sdk/internal/ilrd/a$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", InneractiveMediationDefs.GENDER_FEMALE, "()J", "b", "I", "d", "g", "h", EidRequestBuilder.REQUEST_FIELD_EMAIL, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class ImpressionCounts {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final long lastEventReceivedTs;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final int banner;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int mrec;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int native;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int interstitial;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int rewarded;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C0663a implements o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0663a f54370a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final SerialDescriptor f54371b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f54372c;

            static {
                C0663a c0663a = new C0663a();
                f54370a = c0663a;
                f54372c = 8;
                i2 i2Var = new i2("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", c0663a, 6);
                i2Var.n("lastEventReceivedTs", false);
                i2Var.n("banner", false);
                i2Var.n("mrec", false);
                i2Var.n("native", false);
                i2Var.n("interstitial", false);
                i2Var.n("rewarded", false);
                f54371b = i2Var;
            }

            @Override // ug.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImpressionCounts deserialize(Decoder decoder) {
                int iF;
                int iF2;
                int i10;
                int i11;
                int i12;
                int i13;
                long j10;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = f54371b;
                xg.d dVarB = decoder.b(serialDescriptor);
                if (dVarB.j()) {
                    long jE = dVarB.e(serialDescriptor, 0);
                    iF = dVarB.f(serialDescriptor, 1);
                    int iF3 = dVarB.f(serialDescriptor, 2);
                    int iF4 = dVarB.f(serialDescriptor, 3);
                    int iF5 = dVarB.f(serialDescriptor, 4);
                    iF2 = dVarB.f(serialDescriptor, 5);
                    i10 = iF4;
                    i11 = iF5;
                    i12 = iF3;
                    i13 = 63;
                    j10 = jE;
                } else {
                    boolean z10 = true;
                    iF = 0;
                    int iF6 = 0;
                    int iF7 = 0;
                    int i14 = 0;
                    long jE2 = 0;
                    int iF8 = 0;
                    int iF9 = 0;
                    while (z10) {
                        int iX = dVarB.x(serialDescriptor);
                        switch (iX) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                jE2 = dVarB.e(serialDescriptor, 0);
                                i14 |= 1;
                                continue;
                            case 1:
                                iF = dVarB.f(serialDescriptor, 1);
                                i14 |= 2;
                                break;
                            case 2:
                                iF7 = dVarB.f(serialDescriptor, 2);
                                i14 |= 4;
                                break;
                            case 3:
                                iF9 = dVarB.f(serialDescriptor, 3);
                                i14 |= 8;
                                break;
                            case 4:
                                iF6 = dVarB.f(serialDescriptor, 4);
                                i14 |= 16;
                                break;
                            case 5:
                                iF8 = dVarB.f(serialDescriptor, 5);
                                i14 |= 32;
                                break;
                            default:
                                throw new z(iX);
                        }
                    }
                    iF2 = iF8;
                    i10 = iF9;
                    i11 = iF6;
                    i12 = iF7;
                    i13 = i14;
                    j10 = jE2;
                }
                int i15 = iF;
                dVarB.c(serialDescriptor);
                return new ImpressionCounts(i13, j10, i15, i12, i10, i11, iF2, null);
            }

            @Override // ug.n
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, ImpressionCounts value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = f54371b;
                xg.f fVarB = encoder.b(serialDescriptor);
                ImpressionCounts.c(value, fVarB, serialDescriptor);
                fVarB.c(serialDescriptor);
            }

            @Override // yg.o0
            public final KSerializer[] childSerializers() {
                x0 x0Var = x0.f119093a;
                return new KSerializer[]{i1.f118988a, x0Var, x0Var, x0Var, x0Var, x0Var};
            }

            @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
            public final SerialDescriptor getDescriptor() {
                return f54371b;
            }

            @Override // yg.o0
            public /* synthetic */ KSerializer[] typeParametersSerializers() {
                return n0.a(this);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0663a.f54370a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ImpressionCounts(int i10, long j10, int i11, int i12, int i13, int i14, int i15, t2 t2Var) {
            if (63 != (i10 & 63)) {
                e2.a(i10, 63, C0663a.f54370a.getDescriptor());
            }
            this.lastEventReceivedTs = j10;
            this.banner = i11;
            this.mrec = i12;
            this.native = i13;
            this.interstitial = i14;
            this.rewarded = i15;
        }

        public static /* synthetic */ ImpressionCounts b(ImpressionCounts impressionCounts, long j10, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                j10 = impressionCounts.lastEventReceivedTs;
            }
            long j11 = j10;
            if ((i15 & 2) != 0) {
                i10 = impressionCounts.banner;
            }
            int i16 = i10;
            if ((i15 & 4) != 0) {
                i11 = impressionCounts.mrec;
            }
            int i17 = i11;
            if ((i15 & 8) != 0) {
                i12 = impressionCounts.native;
            }
            int i18 = i12;
            if ((i15 & 16) != 0) {
                i13 = impressionCounts.interstitial;
            }
            int i19 = i13;
            if ((i15 & 32) != 0) {
                i14 = impressionCounts.rewarded;
            }
            return impressionCounts.a(j11, i16, i17, i18, i19, i14);
        }

        public static final /* synthetic */ void c(ImpressionCounts self, xg.f output, SerialDescriptor serialDesc) {
            output.v(serialDesc, 0, self.lastEventReceivedTs);
            output.o(serialDesc, 1, self.banner);
            output.o(serialDesc, 2, self.mrec);
            output.o(serialDesc, 3, self.native);
            output.o(serialDesc, 4, self.interstitial);
            output.o(serialDesc, 5, self.rewarded);
        }

        public final ImpressionCounts a(long lastEventReceivedTs, int banner, int mrec, int i10, int interstitial, int rewarded) {
            return new ImpressionCounts(lastEventReceivedTs, banner, mrec, i10, interstitial, rewarded);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getBanner() {
            return this.banner;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getInterstitial() {
            return this.interstitial;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImpressionCounts)) {
                return false;
            }
            ImpressionCounts impressionCounts = (ImpressionCounts) other;
            return this.lastEventReceivedTs == impressionCounts.lastEventReceivedTs && this.banner == impressionCounts.banner && this.mrec == impressionCounts.mrec && this.native == impressionCounts.native && this.interstitial == impressionCounts.interstitial && this.rewarded == impressionCounts.rewarded;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getLastEventReceivedTs() {
            return this.lastEventReceivedTs;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getMrec() {
            return this.mrec;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getNative() {
            return this.native;
        }

        public int hashCode() {
            return (((((((((androidx.collection.b.a(this.lastEventReceivedTs) * 31) + this.banner) * 31) + this.mrec) * 31) + this.native) * 31) + this.interstitial) * 31) + this.rewarded;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getRewarded() {
            return this.rewarded;
        }

        public String toString() {
            return "ImpressionCounts(lastEventReceivedTs=" + this.lastEventReceivedTs + ", banner=" + this.banner + ", mrec=" + this.mrec + ", native=" + this.native + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ')';
        }

        public ImpressionCounts(long j10, int i10, int i11, int i12, int i13, int i14) {
            this.lastEventReceivedTs = j10;
            this.banner = i10;
            this.mrec = i11;
            this.native = i12;
            this.interstitial = i13;
            this.rewarded = i14;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$c, reason: from toString */
    @StabilityInferred(parameters = 1)
    @l
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002\u0017\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$c;", "", "", JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/moloco/sdk/internal/ilrd/a$b;", "impressionCounts", "", "isExpired", "", "sessionStartTs", "<init>", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJ)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJLyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ilrd/a$c;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "b", "Lcom/moloco/sdk/internal/ilrd/a$b;", "()Lcom/moloco/sdk/internal/ilrd/a$b;", "Z", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Z", "d", "J", "()J", y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    @VisibleForTesting
    public static final /* data */ class SessionData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String sessionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final ImpressionCounts impressionCounts;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isExpired;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long sessionStartTs;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C0665a implements o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0665a f54377a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final SerialDescriptor f54378b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f54379c;

            static {
                C0665a c0665a = new C0665a();
                f54377a = c0665a;
                f54379c = 8;
                i2 i2Var = new i2("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", c0665a, 4);
                i2Var.n(JsonStorageKeyNames.SESSION_ID_KEY, false);
                i2Var.n("impressionCounts", false);
                i2Var.n("isExpired", false);
                i2Var.n("sessionStartTs", false);
                f54378b = i2Var;
            }

            @Override // ug.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SessionData deserialize(Decoder decoder) {
                int i10;
                boolean zD;
                long jE;
                String str;
                ImpressionCounts impressionCounts;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = f54378b;
                xg.d dVarB = decoder.b(serialDescriptor);
                if (dVarB.j()) {
                    String strI = dVarB.i(serialDescriptor, 0);
                    ImpressionCounts impressionCounts2 = (ImpressionCounts) dVarB.s(serialDescriptor, 1, ImpressionCounts.C0663a.f54370a, null);
                    str = strI;
                    i10 = 15;
                    zD = dVarB.D(serialDescriptor, 2);
                    impressionCounts = impressionCounts2;
                    jE = dVarB.e(serialDescriptor, 3);
                } else {
                    long jE2 = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    String strI2 = null;
                    ImpressionCounts impressionCounts3 = null;
                    boolean zD2 = false;
                    while (z10) {
                        int iX = dVarB.x(serialDescriptor);
                        if (iX == -1) {
                            z10 = false;
                        } else if (iX == 0) {
                            strI2 = dVarB.i(serialDescriptor, 0);
                            i11 |= 1;
                        } else if (iX == 1) {
                            impressionCounts3 = (ImpressionCounts) dVarB.s(serialDescriptor, 1, ImpressionCounts.C0663a.f54370a, impressionCounts3);
                            i11 |= 2;
                        } else if (iX == 2) {
                            zD2 = dVarB.D(serialDescriptor, 2);
                            i11 |= 4;
                        } else {
                            if (iX != 3) {
                                throw new z(iX);
                            }
                            jE2 = dVarB.e(serialDescriptor, 3);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    zD = zD2;
                    jE = jE2;
                    str = strI2;
                    impressionCounts = impressionCounts3;
                }
                dVarB.c(serialDescriptor);
                return new SessionData(i10, str, impressionCounts, zD, jE, null);
            }

            @Override // ug.n
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, SessionData value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = f54378b;
                xg.f fVarB = encoder.b(serialDescriptor);
                SessionData.a(value, fVarB, serialDescriptor);
                fVarB.c(serialDescriptor);
            }

            @Override // yg.o0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{y2.f119104a, ImpressionCounts.C0663a.f54370a, yg.i.f118983a, i1.f118988a};
            }

            @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
            public final SerialDescriptor getDescriptor() {
                return f54378b;
            }

            @Override // yg.o0
            public /* synthetic */ KSerializer[] typeParametersSerializers() {
                return n0.a(this);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0665a.f54377a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SessionData(int i10, String str, ImpressionCounts impressionCounts, boolean z10, long j10, t2 t2Var) {
            if (15 != (i10 & 15)) {
                e2.a(i10, 15, C0665a.f54377a.getDescriptor());
            }
            this.sessionId = str;
            this.impressionCounts = impressionCounts;
            this.isExpired = z10;
            this.sessionStartTs = j10;
        }

        public static final /* synthetic */ void a(SessionData self, xg.f output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.sessionId);
            output.F(serialDesc, 1, ImpressionCounts.C0663a.f54370a, self.impressionCounts);
            output.p(serialDesc, 2, self.isExpired);
            output.v(serialDesc, 3, self.sessionStartTs);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImpressionCounts getImpressionCounts() {
            return this.impressionCounts;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getSessionStartTs() {
            return this.sessionStartTs;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsExpired() {
            return this.isExpired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionData)) {
                return false;
            }
            SessionData sessionData = (SessionData) other;
            return Intrinsics.areEqual(this.sessionId, sessionData.sessionId) && Intrinsics.areEqual(this.impressionCounts, sessionData.impressionCounts) && this.isExpired == sessionData.isExpired && this.sessionStartTs == sessionData.sessionStartTs;
        }

        public int hashCode() {
            return (((((this.sessionId.hashCode() * 31) + this.impressionCounts.hashCode()) * 31) + androidx.compose.foundation.c.a(this.isExpired)) * 31) + androidx.collection.b.a(this.sessionStartTs);
        }

        public String toString() {
            return "SessionData(sessionId=" + this.sessionId + ", impressionCounts=" + this.impressionCounts + ", isExpired=" + this.isExpired + ", sessionStartTs=" + this.sessionStartTs + ')';
        }

        public SessionData(String sessionId, ImpressionCounts impressionCounts, boolean z10, long j10) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(impressionCounts, "impressionCounts");
            this.sessionId = sessionId;
            this.impressionCounts = impressionCounts;
            this.isExpired = z10;
            this.sessionStartTs = j10;
        }
    }

    public a(com.moloco.sdk.internal.services.i timeProvider, String str) {
        ImpressionCounts impressionCounts;
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f54358a = timeProvider;
        SessionData sessionData = null;
        if (str != null) {
            try {
                b.a aVar = kotlinx.serialization.json.b.f93658d;
                aVar.a();
                sessionData = (SessionData) aVar.c(SessionData.INSTANCE.serializer(), str);
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Error deserializing session data", e10, false, 8, null);
            }
        }
        this.f54359b = sessionData;
        this.f54360c = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.ilrd.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a(this.f54380b);
            }
        });
        this.f54361d = sessionData != null ? sessionData.getSessionStartTs() : this.f54358a.a();
        this.f54362e = new AtomicReference((sessionData == null || (impressionCounts = sessionData.getImpressionCounts()) == null) ? new ImpressionCounts(-1L, 0, 0, 0, 0, 0) : impressionCounts);
        this.f54363f = sessionData != null ? sessionData.getIsExpired() : false;
    }

    public static final String a(a aVar) {
        String sessionId;
        SessionData sessionData = aVar.f54359b;
        if (sessionData != null && (sessionId = sessionData.getSessionId()) != null) {
            return sessionId;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void b() {
        this.f54363f = true;
    }

    public final void c(d.a ilrdData) {
        Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        if (!(ilrdData instanceof d.a.C0666a)) {
            throw new m();
        }
        String adFormat = ((d.a.C0666a) ilrdData).a().getAdFormat();
        Intrinsics.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
        String upperCase = adFormat.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        d(upperCase, "Applovin");
    }

    public final boolean d(String str, String str2) {
        ImpressionCounts impressionCountsB;
        long jA = this.f54358a.a();
        ImpressionCounts impressionCounts = (ImpressionCounts) this.f54362e.get();
        if (StringsKt.g0(str, "BANNER", false, 2, null)) {
            impressionCountsB = ImpressionCounts.b(impressionCounts, jA, impressionCounts.getBanner() + 1, 0, 0, 0, 0, 60, null);
        } else if (StringsKt.g0(str, "MREC", false, 2, null)) {
            impressionCountsB = ImpressionCounts.b(impressionCounts, jA, 0, impressionCounts.getMrec() + 1, 0, 0, 0, 58, null);
        } else if (StringsKt.g0(str, MobileFuseNativeAdKt.AD_TYPE, false, 2, null)) {
            impressionCountsB = ImpressionCounts.b(impressionCounts, jA, 0, 0, impressionCounts.getNative() + 1, 0, 0, 54, null);
        } else if (StringsKt.g0(str, "INTER", false, 2, null)) {
            impressionCountsB = ImpressionCounts.b(impressionCounts, jA, 0, 0, 0, impressionCounts.getInterstitial() + 1, 0, 46, null);
        } else {
            if (!StringsKt.g0(str, "REWARD", false, 2, null)) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Unknown ad format for " + str2 + ": " + str, null, false, 12, null);
                return false;
            }
            impressionCountsB = ImpressionCounts.b(impressionCounts, jA, 0, 0, 0, 0, impressionCounts.getRewarded() + 1, 30, null);
        }
        this.f54362e.set(impressionCountsB);
        return true;
    }

    public final ImpressionCounts e() {
        Object obj = this.f54362e.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (ImpressionCounts) obj;
    }

    public final String f() {
        return (String) this.f54360c.getValue();
    }

    public final long g() {
        return this.f54361d;
    }

    public final boolean h() {
        return this.f54363f;
    }

    public final String i() {
        return kotlinx.serialization.json.b.f93658d.b(SessionData.INSTANCE.serializer(), new SessionData(f(), e(), h(), this.f54361d));
    }

    public String toString() {
        ImpressionCounts impressionCountsE = e();
        return "IlrdActiveSession(id=" + f() + ", startTs=" + this.f54361d + ", expired=" + h() + ", impressions=" + (impressionCountsE.getBanner() + impressionCountsE.getMrec() + impressionCountsE.getNative() + impressionCountsE.getInterstitial() + impressionCountsE.getRewarded()) + " [banner=" + impressionCountsE.getBanner() + ", mrec=" + impressionCountsE.getMrec() + ", native=" + impressionCountsE.getNative() + ", interstitial=" + impressionCountsE.getInterstitial() + ", rewarded=" + impressionCountsE.getRewarded() + "])";
    }

    public /* synthetic */ a(com.moloco.sdk.internal.services.i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i10 & 2) != 0 ? null : str);
    }
}
