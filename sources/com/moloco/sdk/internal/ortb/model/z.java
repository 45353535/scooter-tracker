package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Df;
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
import yg.i2;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 -2\u00020\u0001:\u0002\u001b\u0019B\u007f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001c\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b'\u0010 \u001a\u0004\b\u001f\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u0012\u0004\b\u0019\u0010 \u001a\u0004\b\u001b\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001c\u0012\u0004\b!\u0010 \u001a\u0004\b#\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b)\u0010 \u001a\u0004\b(\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001c\u0012\u0004\b+\u0010 \u001a\u0004\b$\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001c\u0012\u0004\b,\u0010 \u001a\u0004\b*\u0010\u001e¨\u0006."}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/z;", "", "", "seen0", "", "onAdLoadStart", Df.f40641b, "onAdLoadSuccess", Df.f40644e, "onAdShowSuccess", Df.f40645f, "onAdHidden", "onUserRewarded", "onRewardedVideoStarted", "onRewardedVideoCompleted", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/z;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/String;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Ljava/lang/String;", "h", "()V", "d", InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "j", "g", CmcdData.Factory.STREAM_TYPE_LIVE, "n", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "r", "p", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String onAdLoadStart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String onAdLoadFailed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String onAdLoadSuccess;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String onAdShowFailed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String onAdShowSuccess;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String onAdClicked;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String onAdHidden;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String onUserRewarded;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String onRewardedVideoStarted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String onRewardedVideoCompleted;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54690c;

        static {
            a aVar = new a();
            f54688a = aVar;
            f54690c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.SdkEvents", aVar, 10);
            i2Var.n("on_ad_load_start", true);
            i2Var.n("on_ad_load_failed", true);
            i2Var.n("on_ad_load_success", true);
            i2Var.n("on_ad_show_failed", true);
            i2Var.n("on_ad_show_success", true);
            i2Var.n("on_ad_clicked", true);
            i2Var.n("on_ad_hidden", true);
            i2Var.n("on_user_rewarded", true);
            i2Var.n("on_rewarded_video_started", true);
            i2Var.n("on_rewarded_video_completed", true);
            f54689b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z deserialize(Decoder decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54689b;
            xg.d dVarB = decoder.b(serialDescriptor);
            int i11 = 9;
            String str11 = null;
            if (dVarB.j()) {
                y2 y2Var = y2.f119104a;
                String str12 = (String) dVarB.p(serialDescriptor, 0, y2Var, null);
                String str13 = (String) dVarB.p(serialDescriptor, 1, y2Var, null);
                String str14 = (String) dVarB.p(serialDescriptor, 2, y2Var, null);
                String str15 = (String) dVarB.p(serialDescriptor, 3, y2Var, null);
                String str16 = (String) dVarB.p(serialDescriptor, 4, y2Var, null);
                String str17 = (String) dVarB.p(serialDescriptor, 5, y2Var, null);
                String str18 = (String) dVarB.p(serialDescriptor, 6, y2Var, null);
                String str19 = (String) dVarB.p(serialDescriptor, 7, y2Var, null);
                String str20 = (String) dVarB.p(serialDescriptor, 8, y2Var, null);
                str = (String) dVarB.p(serialDescriptor, 9, y2Var, null);
                i10 = 1023;
                str4 = str19;
                str3 = str18;
                str5 = str17;
                str7 = str15;
                str2 = str20;
                str6 = str16;
                str10 = str14;
                str9 = str13;
                str8 = str12;
            } else {
                boolean z10 = true;
                int i12 = 0;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            i11 = 9;
                            break;
                        case 0:
                            str11 = (String) dVarB.p(serialDescriptor, 0, y2.f119104a, str11);
                            i12 |= 1;
                            i11 = 9;
                            break;
                        case 1:
                            str28 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str28);
                            i12 |= 2;
                            i11 = 9;
                            break;
                        case 2:
                            str29 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, str29);
                            i12 |= 4;
                            i11 = 9;
                            break;
                        case 3:
                            str27 = (String) dVarB.p(serialDescriptor, 3, y2.f119104a, str27);
                            i12 |= 8;
                            i11 = 9;
                            break;
                        case 4:
                            str26 = (String) dVarB.p(serialDescriptor, 4, y2.f119104a, str26);
                            i12 |= 16;
                            i11 = 9;
                            break;
                        case 5:
                            str25 = (String) dVarB.p(serialDescriptor, 5, y2.f119104a, str25);
                            i12 |= 32;
                            i11 = 9;
                            break;
                        case 6:
                            str23 = (String) dVarB.p(serialDescriptor, 6, y2.f119104a, str23);
                            i12 |= 64;
                            i11 = 9;
                            break;
                        case 7:
                            str24 = (String) dVarB.p(serialDescriptor, 7, y2.f119104a, str24);
                            i12 |= 128;
                            i11 = 9;
                            break;
                        case 8:
                            str22 = (String) dVarB.p(serialDescriptor, 8, y2.f119104a, str22);
                            i12 |= 256;
                            break;
                        case 9:
                            str21 = (String) dVarB.p(serialDescriptor, i11, y2.f119104a, str21);
                            i12 |= 512;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                i10 = i12;
                str = str21;
                str2 = str22;
                str3 = str23;
                str4 = str24;
                str5 = str25;
                str6 = str26;
                str7 = str27;
                str8 = str11;
                str9 = str28;
                str10 = str29;
            }
            dVarB.c(serialDescriptor);
            return new z(i10, str8, str9, str10, str7, str6, str5, str3, str4, str2, str, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, z value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54689b;
            xg.f fVarB = encoder.b(serialDescriptor);
            z.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            y2 y2Var = y2.f119104a;
            return new KSerializer[]{vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var), vg.a.t(y2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54689b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.z$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54688a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ z(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.onAdLoadStart = null;
        } else {
            this.onAdLoadStart = str;
        }
        if ((i10 & 2) == 0) {
            this.onAdLoadFailed = null;
        } else {
            this.onAdLoadFailed = str2;
        }
        if ((i10 & 4) == 0) {
            this.onAdLoadSuccess = null;
        } else {
            this.onAdLoadSuccess = str3;
        }
        if ((i10 & 8) == 0) {
            this.onAdShowFailed = null;
        } else {
            this.onAdShowFailed = str4;
        }
        if ((i10 & 16) == 0) {
            this.onAdShowSuccess = null;
        } else {
            this.onAdShowSuccess = str5;
        }
        if ((i10 & 32) == 0) {
            this.onAdClicked = null;
        } else {
            this.onAdClicked = str6;
        }
        if ((i10 & 64) == 0) {
            this.onAdHidden = null;
        } else {
            this.onAdHidden = str7;
        }
        if ((i10 & 128) == 0) {
            this.onUserRewarded = null;
        } else {
            this.onUserRewarded = str8;
        }
        if ((i10 & 256) == 0) {
            this.onRewardedVideoStarted = null;
        } else {
            this.onRewardedVideoStarted = str9;
        }
        if ((i10 & 512) == 0) {
            this.onRewardedVideoCompleted = null;
        } else {
            this.onRewardedVideoCompleted = str10;
        }
    }

    public static final /* synthetic */ void b(z self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.onAdLoadStart != null) {
            output.h(serialDesc, 0, y2.f119104a, self.onAdLoadStart);
        }
        if (output.r(serialDesc, 1) || self.onAdLoadFailed != null) {
            output.h(serialDesc, 1, y2.f119104a, self.onAdLoadFailed);
        }
        if (output.r(serialDesc, 2) || self.onAdLoadSuccess != null) {
            output.h(serialDesc, 2, y2.f119104a, self.onAdLoadSuccess);
        }
        if (output.r(serialDesc, 3) || self.onAdShowFailed != null) {
            output.h(serialDesc, 3, y2.f119104a, self.onAdShowFailed);
        }
        if (output.r(serialDesc, 4) || self.onAdShowSuccess != null) {
            output.h(serialDesc, 4, y2.f119104a, self.onAdShowSuccess);
        }
        if (output.r(serialDesc, 5) || self.onAdClicked != null) {
            output.h(serialDesc, 5, y2.f119104a, self.onAdClicked);
        }
        if (output.r(serialDesc, 6) || self.onAdHidden != null) {
            output.h(serialDesc, 6, y2.f119104a, self.onAdHidden);
        }
        if (output.r(serialDesc, 7) || self.onUserRewarded != null) {
            output.h(serialDesc, 7, y2.f119104a, self.onUserRewarded);
        }
        if (output.r(serialDesc, 8) || self.onRewardedVideoStarted != null) {
            output.h(serialDesc, 8, y2.f119104a, self.onRewardedVideoStarted);
        }
        if (!output.r(serialDesc, 9) && self.onRewardedVideoCompleted == null) {
            return;
        }
        output.h(serialDesc, 9, y2.f119104a, self.onRewardedVideoCompleted);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOnAdClicked() {
        return this.onAdClicked;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOnAdHidden() {
        return this.onAdHidden;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOnAdLoadFailed() {
        return this.onAdLoadFailed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOnAdLoadStart() {
        return this.onAdLoadStart;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOnAdLoadSuccess() {
        return this.onAdLoadSuccess;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOnAdShowFailed() {
        return this.onAdShowFailed;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getOnAdShowSuccess() {
        return this.onAdShowSuccess;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOnRewardedVideoCompleted() {
        return this.onRewardedVideoCompleted;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getOnRewardedVideoStarted() {
        return this.onRewardedVideoStarted;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getOnUserRewarded() {
        return this.onUserRewarded;
    }
}
