package com.mobilefuse.sdk.internal;

import android.content.Context;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.mfx.MfxRequestAdKt;
import com.mobilefuse.sdk.network.model.MfxBidRequestToMapKt;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0002\u001a\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0012"}, d2 = {"paramsToRemoveForNimbus", "", "", "getParamsToRemoveForNimbus", "()Ljava/util/Set;", "alterPartnerParams", "", "request", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "data", "", "buildTokenWithRequest", "", "getBiddingTokenData", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/internal/TokenDataListener;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MobileFuseBiddingTokenProvider_getTokenDataKt {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Partner.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Partner.NIMBUS.ordinal()] = 1;
        }
    }

    private static final void alterPartnerParams(IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest, Map<String, String> map) {
        if (iMobileFuseBiddingTokenRequest instanceof MobileFuseBiddingPartnerTokenRequest) {
            Iterator<T> it = (WhenMappings.$EnumSwitchMapping$0[((MobileFuseBiddingPartnerTokenRequest) iMobileFuseBiddingTokenRequest).getPartner().ordinal()] != 1 ? SetsKt.emptySet() : getParamsToRemoveForNimbus()).iterator();
            while (it.hasNext()) {
                map.remove((String) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> buildTokenWithRequest(IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest) {
        final MobileFusePrivacyPreferences mobileFusePrivacyPreferencesMergePrivacyPreferences$mobilefuse_sdk_core_release = MobileFuseBiddingTokenProvider.INSTANCE.mergePrivacyPreferences$mobilefuse_sdk_core_release(iMobileFuseBiddingTokenRequest.getPrivacyPreferences());
        Map<String, String> mutableMap = MapsKt.toMutableMap(MfxBidRequestToMapKt.toStringMap(MfxRequestAdKt.createBidRequest$default("", 0, 0, new Function0<MobileFusePrivacyPreferences>() { // from class: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider_getTokenDataKt$buildTokenWithRequest$data$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MobileFusePrivacyPreferences invoke() {
                return mobileFusePrivacyPreferencesMergePrivacyPreferences$mobilefuse_sdk_core_release;
            }
        }, iMobileFuseBiddingTokenRequest.getIsTestMode(), null, 32, null)));
        mutableMap.put("v", "2");
        mutableMap.remove("tagid");
        alterPartnerParams(iMobileFuseBiddingTokenRequest, mutableMap);
        return mutableMap;
    }

    public static final void getBiddingTokenData(@NotNull final IMobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull final TokenDataListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices(new Function0<Unit>() { // from class: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider_getTokenDataKt.getBiddingTokenData.1
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
                    listener.onDataGenerated(MobileFuseBiddingTokenProvider_getTokenDataKt.buildTokenWithRequest(request));
                } catch (Throwable th2) {
                    listener.onDataGenerationFailed("Failed to generate token with internal error: " + th2.getMessage());
                }
            }
        });
    }

    private static final Set<String> getParamsToRemoveForNimbus() {
        return SetsKt.setOf((Object[]) new String[]{"test", "app_version", EidRequestBuilder.REQUEST_FIELD_IFA, N6.f41375d0, N6.f41413q, CommonUrlParts.DEVICE_TYPE, "device_w", "device_h", EidRequestBuilder.REQUEST_FIELD_LMT, N6.f41419s, "lon", "altitude", "pressure", "coppa", EidRequestBuilder.REQUEST_FIELD_GPP, DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, "banner_width", "banner_height"});
    }
}
