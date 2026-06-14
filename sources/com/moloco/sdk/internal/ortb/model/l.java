package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.DECAppIconSerializable;
import com.moloco.sdk.internal.ortb.model.DECAppNameSerializable;
import com.moloco.sdk.internal.ortb.model.DECCtaSerializable;
import com.moloco.sdk.internal.ortb.model.DECRatingSerializable;
import com.moloco.sdk.internal.ortb.model.r;
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

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@ug.l
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0001\u0018\u0000 92\u00020\u0001:\u0002\u001f\u001dBu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010 \u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010,\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010-R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010.\u0012\u0004\b1\u0010$\u001a\u0004\b/\u00100R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00102\u0012\u0004\b*\u0010$\u001a\u0004\b)\u00103R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u00104\u0012\u0004\b6\u0010$\u001a\u0004\b&\u00105R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u00107\u0012\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u00108¨\u0006:"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/l;", "", "", "seen0", "", "impressionTrackingUrl", "ctaUrl", "ctaTrackingUrl", "skipToDecTrackingUrl", "Lcom/moloco/sdk/internal/ortb/model/r;", "close", "Lcom/moloco/sdk/internal/ortb/model/p;", "decCta", "Lcom/moloco/sdk/internal/ortb/model/m;", "decAppIcon", "Lcom/moloco/sdk/internal/ortb/model/q;", "decRating", "Lcom/moloco/sdk/internal/ortb/model/n;", "appName", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/r;Lcom/moloco/sdk/internal/ortb/model/p;Lcom/moloco/sdk/internal/ortb/model/m;Lcom/moloco/sdk/internal/ortb/model/q;Lcom/moloco/sdk/internal/ortb/model/n;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/l;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Ljava/lang/String;", "p", "()V", EidRequestBuilder.REQUEST_FIELD_EMAIL, "h", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", InneractiveMediationDefs.GENDER_FEMALE, "j", "r", "Lcom/moloco/sdk/internal/ortb/model/r;", "()Lcom/moloco/sdk/internal/ortb/model/r;", "Lcom/moloco/sdk/internal/ortb/model/p;", "g", "()Lcom/moloco/sdk/internal/ortb/model/p;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/moloco/sdk/internal/ortb/model/m;", "()Lcom/moloco/sdk/internal/ortb/model/m;", "Lcom/moloco/sdk/internal/ortb/model/q;", "()Lcom/moloco/sdk/internal/ortb/model/q;", "n", "Lcom/moloco/sdk/internal/ortb/model/n;", "()Lcom/moloco/sdk/internal/ortb/model/n;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f54568j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String impressionTrackingUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String ctaUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String ctaTrackingUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String skipToDecTrackingUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final r close;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final DECCtaSerializable decCta;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final DECAppIconSerializable decAppIcon;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final DECRatingSerializable decRating;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final DECAppNameSerializable appName;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54580c;

        static {
            a aVar = new a();
            f54578a = aVar;
            f54580c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.DEC", aVar, 9);
            i2Var.n("imp_link", true);
            i2Var.n("click_through", true);
            i2Var.n("click_tracking", true);
            i2Var.n("skip_event", true);
            i2Var.n("close", true);
            i2Var.n("cta", true);
            i2Var.n("app_icon", true);
            i2Var.n("rating", true);
            i2Var.n("app_name", true);
            f54579b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l deserialize(Decoder decoder) {
            int i10;
            DECRatingSerializable dECRatingSerializable;
            DECAppNameSerializable dECAppNameSerializable;
            DECAppIconSerializable dECAppIconSerializable;
            DECCtaSerializable dECCtaSerializable;
            r rVar;
            String str;
            String str2;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54579b;
            xg.d dVarB = decoder.b(serialDescriptor);
            int i11 = 7;
            String str5 = null;
            if (dVarB.j()) {
                y2 y2Var = y2.f119104a;
                String str6 = (String) dVarB.p(serialDescriptor, 0, y2Var, null);
                String str7 = (String) dVarB.p(serialDescriptor, 1, y2Var, null);
                String str8 = (String) dVarB.p(serialDescriptor, 2, y2Var, null);
                String str9 = (String) dVarB.p(serialDescriptor, 3, y2Var, null);
                r rVar2 = (r) dVarB.p(serialDescriptor, 4, r.a.f54620a, null);
                DECCtaSerializable dECCtaSerializable2 = (DECCtaSerializable) dVarB.p(serialDescriptor, 5, DECCtaSerializable.a.f54608a, null);
                DECAppIconSerializable dECAppIconSerializable2 = (DECAppIconSerializable) dVarB.p(serialDescriptor, 6, DECAppIconSerializable.a.f54585a, null);
                str4 = str9;
                dECRatingSerializable = (DECRatingSerializable) dVarB.p(serialDescriptor, 7, DECRatingSerializable.a.f54616a, null);
                dECAppIconSerializable = dECAppIconSerializable2;
                dECCtaSerializable = dECCtaSerializable2;
                rVar = rVar2;
                dECAppNameSerializable = (DECAppNameSerializable) dVarB.p(serialDescriptor, 8, DECAppNameSerializable.a.f54590a, null);
                i10 = 511;
                str3 = str8;
                str2 = str7;
                str = str6;
            } else {
                boolean z10 = true;
                int i12 = 0;
                DECRatingSerializable dECRatingSerializable2 = null;
                DECAppNameSerializable dECAppNameSerializable2 = null;
                DECAppIconSerializable dECAppIconSerializable3 = null;
                DECCtaSerializable dECCtaSerializable3 = null;
                r rVar3 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            i11 = 7;
                            break;
                        case 0:
                            str5 = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, str5);
                            i12 |= 1;
                            i11 = 7;
                            break;
                        case 1:
                            str10 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str10);
                            i12 |= 2;
                            i11 = 7;
                            break;
                        case 2:
                            str11 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, str11);
                            i12 |= 4;
                            i11 = 7;
                            break;
                        case 3:
                            str12 = (String) dVarB.p(serialDescriptor, 3, y2.f119104a, str12);
                            i12 |= 8;
                            i11 = 7;
                            break;
                        case 4:
                            rVar3 = (r) dVarB.p(serialDescriptor, 4, r.a.f54620a, rVar3);
                            i12 |= 16;
                            i11 = 7;
                            break;
                        case 5:
                            dECCtaSerializable3 = (DECCtaSerializable) dVarB.p(serialDescriptor, 5, DECCtaSerializable.a.f54608a, dECCtaSerializable3);
                            i12 |= 32;
                            i11 = 7;
                            break;
                        case 6:
                            dECAppIconSerializable3 = (DECAppIconSerializable) dVarB.p(serialDescriptor, 6, DECAppIconSerializable.a.f54585a, dECAppIconSerializable3);
                            i12 |= 64;
                            break;
                        case 7:
                            dECRatingSerializable2 = (DECRatingSerializable) dVarB.p(serialDescriptor, i11, DECRatingSerializable.a.f54616a, dECRatingSerializable2);
                            i12 |= 128;
                            break;
                        case 8:
                            dECAppNameSerializable2 = (DECAppNameSerializable) dVarB.p(serialDescriptor, 8, DECAppNameSerializable.a.f54590a, dECAppNameSerializable2);
                            i12 |= 256;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                i10 = i12;
                dECRatingSerializable = dECRatingSerializable2;
                dECAppNameSerializable = dECAppNameSerializable2;
                dECAppIconSerializable = dECAppIconSerializable3;
                dECCtaSerializable = dECCtaSerializable3;
                rVar = rVar3;
                str = str5;
                str2 = str10;
                str3 = str11;
                str4 = str12;
            }
            dVarB.c(serialDescriptor);
            return new l(i10, str, str2, str3, str4, rVar, dECCtaSerializable, dECAppIconSerializable, dECRatingSerializable, dECAppNameSerializable, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, l value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54579b;
            xg.f fVarB = encoder.b(serialDescriptor);
            l.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            y2 y2Var = y2.f119104a;
            return new KSerializer[]{vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(r.a.f54620a), vg.a.t(DECCtaSerializable.a.f54608a), vg.a.t(DECAppIconSerializable.a.f54585a), vg.a.t(DECRatingSerializable.a.f54616a), vg.a.t(DECAppNameSerializable.a.f54590a)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54579b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54578a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ l(int i10, String str, String str2, String str3, String str4, r rVar, DECCtaSerializable dECCtaSerializable, DECAppIconSerializable dECAppIconSerializable, DECRatingSerializable dECRatingSerializable, DECAppNameSerializable dECAppNameSerializable, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.impressionTrackingUrl = null;
        } else {
            this.impressionTrackingUrl = str;
        }
        if ((i10 & 2) == 0) {
            this.ctaUrl = null;
        } else {
            this.ctaUrl = str2;
        }
        if ((i10 & 4) == 0) {
            this.ctaTrackingUrl = null;
        } else {
            this.ctaTrackingUrl = str3;
        }
        if ((i10 & 8) == 0) {
            this.skipToDecTrackingUrl = null;
        } else {
            this.skipToDecTrackingUrl = str4;
        }
        if ((i10 & 16) == 0) {
            this.close = null;
        } else {
            this.close = rVar;
        }
        if ((i10 & 32) == 0) {
            this.decCta = null;
        } else {
            this.decCta = dECCtaSerializable;
        }
        if ((i10 & 64) == 0) {
            this.decAppIcon = null;
        } else {
            this.decAppIcon = dECAppIconSerializable;
        }
        if ((i10 & 128) == 0) {
            this.decRating = null;
        } else {
            this.decRating = dECRatingSerializable;
        }
        if ((i10 & 256) == 0) {
            this.appName = null;
        } else {
            this.appName = dECAppNameSerializable;
        }
    }

    public static final /* synthetic */ void b(l self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.impressionTrackingUrl != null) {
            output.h(serialDesc, 0, y2.f119104a, self.impressionTrackingUrl);
        }
        if (output.r(serialDesc, 1) || self.ctaUrl != null) {
            output.h(serialDesc, 1, y2.f119104a, self.ctaUrl);
        }
        if (output.r(serialDesc, 2) || self.ctaTrackingUrl != null) {
            output.h(serialDesc, 2, y2.f119104a, self.ctaTrackingUrl);
        }
        if (output.r(serialDesc, 3) || self.skipToDecTrackingUrl != null) {
            output.h(serialDesc, 3, y2.f119104a, self.skipToDecTrackingUrl);
        }
        if (output.r(serialDesc, 4) || self.close != null) {
            output.h(serialDesc, 4, r.a.f54620a, self.close);
        }
        if (output.r(serialDesc, 5) || self.decCta != null) {
            output.h(serialDesc, 5, DECCtaSerializable.a.f54608a, self.decCta);
        }
        if (output.r(serialDesc, 6) || self.decAppIcon != null) {
            output.h(serialDesc, 6, DECAppIconSerializable.a.f54585a, self.decAppIcon);
        }
        if (output.r(serialDesc, 7) || self.decRating != null) {
            output.h(serialDesc, 7, DECRatingSerializable.a.f54616a, self.decRating);
        }
        if (!output.r(serialDesc, 8) && self.appName == null) {
            return;
        }
        output.h(serialDesc, 8, DECAppNameSerializable.a.f54590a, self.appName);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DECAppNameSerializable getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCtaTrackingUrl() {
        return this.ctaTrackingUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DECAppIconSerializable getDecAppIcon() {
        return this.decAppIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DECCtaSerializable getDecCta() {
        return this.decCta;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DECRatingSerializable getDecRating() {
        return this.decRating;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getImpressionTrackingUrl() {
        return this.impressionTrackingUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSkipToDecTrackingUrl() {
        return this.skipToDecTrackingUrl;
    }
}
