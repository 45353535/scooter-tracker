package com.mobilefuse.sdk.internal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider;
import com.mobilefuse.sdk.mfx.MfxRequestAdKt;
import com.mobilefuse.sdk.network.model.MfxBidRequestToJsonObjectKt;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.privacy.PrivacyPrefsDefaultsResolver;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenProvider;", "", "()V", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MobileFuseBiddingTokenProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int adInstanceId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013H\u0007J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenProvider$Companion;", "", "()V", "adInstanceId", "", "buildJsonObjectWithRequest", "Lorg/json/JSONObject;", "request", "Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest;", "getTelemetryAdInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "getToken", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/internal/TokenGeneratorListener;", "getTokenData", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "Lcom/mobilefuse/sdk/internal/TokenDataListener;", "mergePrivacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "mediatorPrefs", "mergePrivacyPreferences$mobilefuse_sdk_core_release", "reportTelemetryTokenGenerated", "token", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject buildJsonObjectWithRequest(MobileFuseBiddingTokenRequest request) throws JSONException {
            final MobileFusePrivacyPreferences mobileFusePrivacyPreferencesMergePrivacyPreferences$mobilefuse_sdk_core_release = mergePrivacyPreferences$mobilefuse_sdk_core_release(request.getPrivacyPreferences());
            JSONObject jsonObject = MfxBidRequestToJsonObjectKt.toJsonObject(MfxRequestAdKt.createBidRequest("", 0, 0, new Function0<MobileFusePrivacyPreferences>() { // from class: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider$Companion$buildJsonObjectWithRequest$jsonObject$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MobileFusePrivacyPreferences invoke() {
                    return mobileFusePrivacyPreferencesMergePrivacyPreferences$mobilefuse_sdk_core_release;
                }
            }, request.getIsTestMode(), request.getBidFloor()));
            jsonObject.put("v", 2);
            jsonObject.remove("tagid");
            return jsonObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TelemetryAdInfo getTelemetryAdInfo() {
            return new TelemetryAdInfo(MobileFuseBiddingTokenProvider.adInstanceId, "", "", "", "", null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reportTelemetryTokenGenerated(String token) {
            Telemetry.INSTANCE.onAction(TelemetrySdkActionFactory.createBiddingTokenAction(token, TelemetryActionSdkEvents.BID_TOKEN_GENERATED, this));
        }

        public final void getToken(@NotNull final MobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull final TokenGeneratorListener listener) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            MobileFuseBiddingTokenProvider.adInstanceId = BiddingTokenIdGenerator.INSTANCE.getNextBidTokenId();
            Telemetry.INSTANCE.reportAdMetric(getTelemetryAdInfo(), MetricRecordName.BID_TOKEN_REQUESTED_WITH_JIT);
            SdkInitializer.ensureSdkSetup(false);
            MobileFuseServices.requireAllServices(new Function0<Unit>() { // from class: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider$Companion$getToken$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    try {
                        Telemetry.Companion companion = Telemetry.INSTANCE;
                        MobileFuseBiddingTokenProvider.Companion companion2 = MobileFuseBiddingTokenProvider.INSTANCE;
                        companion.reportAdMetric(companion2.getTelemetryAdInfo(), MetricRecordName.BID_TOKEN_REQUESTED);
                        String string = companion2.buildJsonObjectWithRequest(request).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
                        String token = Base64.encodeToString(Gzip.toGzipByteArray(string), 2);
                        companion.reportAdMetric(companion2.getTelemetryAdInfo(), MetricRecordName.BID_TOKEN_GENERATED);
                        Intrinsics.checkNotNullExpressionValue(token, "token");
                        companion2.reportTelemetryTokenGenerated(token);
                        listener.onTokenGenerated(token);
                    } catch (Throwable th2) {
                        listener.onTokenGenerationFailed("Failed to generate token with internal error: " + th2.getMessage());
                    }
                }
            });
        }

        public final void getTokenData(@NotNull IMobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull TokenDataListener listener) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            MobileFuseBiddingTokenProvider_getTokenDataKt.getBiddingTokenData(request, context, listener);
        }

        @NotNull
        public final MobileFusePrivacyPreferences mergePrivacyPreferences$mobilefuse_sdk_core_release(@NotNull MobileFusePrivacyPreferences mediatorPrefs) {
            Intrinsics.checkNotNullParameter(mediatorPrefs, "mediatorPrefs");
            PrivacyPrefsDefaultsResolver.resolveDefaults();
            MobileFusePrivacyPreferences privacyPreferences = MobileFuse.getPrivacyPreferences();
            Intrinsics.checkNotNullExpressionValue(privacyPreferences, "MobileFuse.getPrivacyPreferences()");
            MobileFusePrivacyPreferences.Builder builder = new MobileFusePrivacyPreferences.Builder();
            String usPrivacyConsentString = mediatorPrefs.getUsPrivacyConsentString();
            if (usPrivacyConsentString == null || StringsKt.y0(usPrivacyConsentString)) {
                String usPrivacyConsentString2 = privacyPreferences.getUsPrivacyConsentString();
                if (usPrivacyConsentString2 != null && !StringsKt.y0(usPrivacyConsentString2)) {
                    builder.setUsPrivacyConsentString(privacyPreferences.getUsPrivacyConsentString());
                }
            } else {
                builder.setUsPrivacyConsentString(mediatorPrefs.getUsPrivacyConsentString());
            }
            String gppConsentString = mediatorPrefs.getGppConsentString();
            if (gppConsentString == null || StringsKt.y0(gppConsentString)) {
                String gppConsentString2 = privacyPreferences.getGppConsentString();
                if (gppConsentString2 != null && !StringsKt.y0(gppConsentString2)) {
                    builder.setGppConsentString(privacyPreferences.getGppConsentString());
                }
            } else {
                builder.setGppConsentString(mediatorPrefs.getGppConsentString());
            }
            boolean z10 = true;
            builder.setSubjectToCoppa(mediatorPrefs.isSubjectToCoppa() || privacyPreferences.isSubjectToCoppa());
            if (!mediatorPrefs.isDoNotTrack() && !privacyPreferences.isDoNotTrack()) {
                z10 = false;
            }
            builder.setDoNotTrack(z10);
            return builder.build();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void getToken(@NotNull MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest, @NotNull Context context, @NotNull TokenGeneratorListener tokenGeneratorListener) {
        INSTANCE.getToken(mobileFuseBiddingTokenRequest, context, tokenGeneratorListener);
    }

    public static final void getTokenData(@NotNull IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest, @NotNull Context context, @NotNull TokenDataListener tokenDataListener) {
        INSTANCE.getTokenData(iMobileFuseBiddingTokenRequest, context, tokenDataListener);
    }
}
