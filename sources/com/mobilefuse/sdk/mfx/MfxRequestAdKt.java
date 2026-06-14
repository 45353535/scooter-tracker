package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.SensorService;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.device.GetLastKnownLocationDataKt;
import com.mobilefuse.sdk.device.LocationData;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.identity.EidServiceKt;
import com.mobilefuse.sdk.identity.GetEidSourceKt;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.network.client.HttpParamsPostBody;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import com.mobilefuse.sdk.network.model.MfxBidRequest;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import com.mobilefuse.sdk.privacy.PrivacyPrefsDefaultsResolver;
import com.mobilefuse.sdk.rx.AdvertisingIdFlowKt;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.user.Gender;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011\u001a2\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00132\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u001b\u001a\u00020\u001c\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"defaultPrivacyPreferencesFactory", "Lkotlin/Function0;", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "createBidRequest", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "placementId", "", "bannerWidth", "", "bannerHeight", "privacyPreferencesFactory", "testMode", "", "bidFloor", "", "(Ljava/lang/String;IILkotlin/jvm/functions/Function0;ZLjava/lang/Float;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "createMfxBidRequest", "(Ljava/lang/String;IIZLjava/lang/Float;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "requestMfxAd", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "request", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/mfx/MfxPostRequest;", "httpClient", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxRequestAdKt {
    private static final Function0<MobileFusePrivacyPreferences> defaultPrivacyPreferencesFactory = new Function0<MobileFusePrivacyPreferences>() { // from class: com.mobilefuse.sdk.mfx.MfxRequestAdKt$defaultPrivacyPreferencesFactory$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MobileFusePrivacyPreferences invoke() {
            PrivacyPrefsDefaultsResolver.resolveDefaults();
            return MobileFuse.getPrivacyPreferences();
        }
    };

    /* JADX INFO: renamed from: com.mobilefuse.sdk.mfx.MfxRequestAdKt$requestMfxAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/mfx/MfxPostRequest;", "p1", "invoke"}, k = 3, mv = {1, 4, 3})
    static final /* synthetic */ class C46851 extends y implements Function1<Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>>, Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>>> {
        public static final C46851 INSTANCE = new C46851();

        C46851() {
            super(1, AdvertisingIdFlowKt.class, "waitForAdvertisingId", "waitForAdvertisingId(Lcom/mobilefuse/sdk/rx/Flow;)Lcom/mobilefuse/sdk/rx/Flow;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>> invoke(Flow<? extends HttpPostRequest<? extends HttpParamsPostBody>> flow) {
            return invoke2((Flow<HttpPostRequest<HttpParamsPostBody>>) flow);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Flow<HttpPostRequest<HttpParamsPostBody>> invoke2(@NotNull Flow<HttpPostRequest<HttpParamsPostBody>> p12) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            return AdvertisingIdFlowKt.waitForAdvertisingId(p12);
        }
    }

    @NotNull
    public static final MfxBidRequest createBidRequest(@NotNull String placementId, int i10, int i11, @NotNull Function0<MobileFusePrivacyPreferences> privacyPreferencesFactory, boolean z10, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(privacyPreferencesFactory, "privacyPreferencesFactory");
        int[] deviceScreenSize = Utils.getDeviceScreenSize();
        final MobileFusePrivacyPreferences mobileFusePrivacyPreferencesInvoke = privacyPreferencesFactory.invoke();
        final boolean zIsSdkLimitedToSendUserData = PrivacyCenter.isSdkLimitedToSendUserData(new Function0<Boolean>() { // from class: com.mobilefuse.sdk.mfx.MfxRequestAdKt$createBidRequest$limitedUserDataProcessing$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                return mobileFusePrivacyPreferencesInvoke.isDoNotTrack();
            }
        });
        LocationData lastKnownLocationData = !zIsSdkLimitedToSendUserData ? GetLastKnownLocationDataKt.getLastKnownLocationData() : null;
        String appVersionName = MobileFuseSettings.getAppVersionName();
        LocationData locationData = lastKnownLocationData;
        String advertisingId = MobileFuseSettings.getAdvertisingId();
        boolean zIsLimitTrackingEnabled = MobileFuseSettings.isLimitTrackingEnabled();
        boolean zIsDoNotTrack = mobileFusePrivacyPreferencesInvoke.isDoNotTrack();
        String userAgent = MobileFuseSettings.getUserAgent();
        String deviceLanguage = MobileFuseSettings.getDeviceLanguage();
        DeviceType deviceType = MobileFuseSettings.isTabletDevice() ? DeviceType.TABLET : DeviceType.PHONE;
        int i12 = deviceScreenSize[0];
        int i13 = deviceScreenSize[1];
        Double dValueOf = locationData != null ? Double.valueOf(locationData.getLatitude()) : null;
        Double dValueOf2 = locationData != null ? Double.valueOf(locationData.getLongitude()) : null;
        Double altitude = locationData != null ? locationData.getAltitude() : null;
        Integer accuracy = locationData != null ? locationData.getAccuracy() : null;
        Integer numValueOf = locationData != null ? Integer.valueOf(locationData.getLastFixSeconds()) : null;
        Double d10 = dValueOf2;
        Double d11 = altitude;
        Float lastPressure = SensorService.getLastPressure();
        boolean zIsSubjectToCoppa = mobileFusePrivacyPreferencesInvoke.isSubjectToCoppa();
        String gppConsentString = mobileFusePrivacyPreferencesInvoke.getGppConsentString();
        String usPrivacyConsentString = mobileFusePrivacyPreferencesInvoke.getUsPrivacyConsentString();
        Map<String, String> eidsAsHttpQueryParams = EidServiceKt.getEidService().getEidsAsHttpQueryParams();
        String eidSource$default = GetEidSourceKt.getEidSource$default(EidServiceKt.getEidService(), null, new Function0<Boolean>() { // from class: com.mobilefuse.sdk.mfx.MfxRequestAdKt.createBidRequest.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                return zIsSdkLimitedToSendUserData;
            }
        }, null, null, null, 29, null);
        MobileFuseTargetingData.Companion companion = MobileFuseTargetingData.INSTANCE;
        Integer numValueOf2 = Integer.valueOf(companion.getYearOfBirth());
        Gender gender = companion.getGender();
        int i14 = i10 == -1 ? 1 : i10;
        int i15 = i11 == -1 ? 1 : i11;
        String sdkVersion = MobileFuse.getSdkVersion();
        Intrinsics.checkNotNullExpressionValue(sdkVersion, "MobileFuse.getSdkVersion()");
        String sessionId = Telemetry.INSTANCE.getSessionId();
        MobileFuseSettings mobileFuseSettings = MobileFuseSettings.INSTANCE;
        return new MfxBidRequest(placementId, appVersionName, z10, advertisingId, zIsLimitTrackingEnabled, zIsDoNotTrack, userAgent, deviceLanguage, deviceType, i12, i13, dValueOf, d10, numValueOf, accuracy, d11, lastPressure, eidsAsHttpQueryParams, eidSource$default, numValueOf2, gender, zIsSubjectToCoppa, gppConsentString, usPrivacyConsentString, i14, i15, sdkVersion, sessionId, mobileFuseSettings.getAppSetId$mobilefuse_sdk_core_release(), f10, mobileFuseSettings.getDeviceIp$mobilefuse_sdk_core_release());
    }

    public static /* synthetic */ MfxBidRequest createBidRequest$default(String str, int i10, int i11, Function0 function0, boolean z10, Float f10, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            f10 = null;
        }
        return createBidRequest(str, i10, i11, function0, z10, f10);
    }

    @NotNull
    public static final MfxBidRequest createMfxBidRequest(@NotNull String placementId, int i10, int i11, boolean z10, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return createBidRequest(placementId, i10, i11, defaultPrivacyPreferencesFactory, z10, f10);
    }

    @NotNull
    public static final Flow<Either<BaseError, MfxBidResponse>> requestMfxAd(@NotNull HttpPostRequest<HttpParamsPostBody> request, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        return MfxService.INSTANCE.getHttpBidRequestFlow(request, httpClient, C46851.INSTANCE);
    }
}
