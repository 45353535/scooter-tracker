package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderResult;
import com.pubmatic.sdk.common.base.POBCommunicator;
import com.pubmatic.sdk.common.base.POBRequestBuilding;
import com.pubmatic.sdk.common.base.POBResponseParsing;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.internal.POBBidsBuilder;
import com.pubmatic.sdk.openwrap.core.internal.POBResponseParser;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class POBManager extends POBBaseBidder<POBBid> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final POBCommunicator f62785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBBidderResult f62786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBBaseBidder.CountryFilterConfig f62787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBDeviceInfo f62788e;

    private class b implements POBCommunicator.POBCommunicatorListener {
        private b() {
        }

        @Override // com.pubmatic.sdk.common.base.POBCommunicator.POBCommunicatorListener
        public void onError(POBError pOBError) {
            POBManager.this.a(pOBError);
        }

        @Override // com.pubmatic.sdk.common.base.POBCommunicator.POBCommunicatorListener
        public void onSuccess(POBAdResponse pOBAdResponse) {
            POBLog.debug("POBManager", "Ready to share Wrapper bid", new Object[0]);
            if (POBManager.this.f62786c != null) {
                POBManager.this.f62786c.setAdResponse(pOBAdResponse);
            }
            if (((POBBaseBidder) POBManager.this).bidderListener != null) {
                ((POBBaseBidder) POBManager.this).bidderListener.onBidsFetched(POBManager.this, pOBAdResponse);
            }
        }
    }

    @Deprecated
    public POBManager(@NonNull POBCommunicator<POBBid> pOBCommunicator) {
        this.f62785b = pOBCommunicator;
        pOBCommunicator.setListener(new b());
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void destroy() {
        this.bidderListener = null;
        this.f62785b.cancel();
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public POBAdResponse<POBBid> getAdResponse() {
        POBBidderResult pOBBidderResult = this.f62786c;
        if (pOBBidderResult != null) {
            return pOBBidderResult.getAdResponse();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public Map<String, POBBidderResult<POBBid>> getBidderResults() {
        HashMap map = new HashMap();
        POBBidderResult pOBBidderResult = this.f62786c;
        if (pOBBidderResult != null) {
            pOBBidderResult.setNetworkResult(this.f62785b.getNetworkResult());
            map.put(getIdentifier(), this.f62786c);
        }
        return map;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void requestBid() {
        this.f62786c = new POBBidderResult();
        if (b()) {
            this.f62785b.requestAd();
        } else {
            a(new POBError(1012, "Ad request not allowed for device's current country"));
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder
    public void setCountryFilterConfig(@Nullable POBBaseBidder.CountryFilterConfig countryFilterConfig) {
        this.f62787d = countryFilterConfig;
    }

    private POBRequestBuilding b(Context context, POBRequest pOBRequest) {
        POBRequestBuilder pOBRequestBuilder = new POBRequestBuilder(pOBRequest, POBInstanceProvider.getSdkConfig().isRequestSecureCreative() ? "https://ow.pubmatic.com/openrtb/2.5" : "http://ow.pubmatic.com/openrtb/2.5", context);
        pOBRequestBuilder.setAppInfo(POBInstanceProvider.getAppInfo(context.getApplicationContext()));
        pOBRequestBuilder.setDeviceInfo(POBInstanceProvider.getDeviceInfo(context.getApplicationContext()));
        pOBRequestBuilder.setLocationDetector(POBInstanceProvider.getLocationDetector(context.getApplicationContext()));
        return pOBRequestBuilder;
    }

    private POBResponseParsing c() {
        return new POBResponseParser();
    }

    private POBCommunicator a(Context context, POBRequest pOBRequest) {
        return new POBCommunicator(b(context, pOBRequest), c(), a(), a(context));
    }

    public POBManager(@NonNull Context context, @NonNull POBCommunicator<POBBid> pOBCommunicator) {
        this.f62785b = pOBCommunicator;
        pOBCommunicator.setListener(new b());
        this.f62788e = POBInstanceProvider.getDeviceInfo(context);
    }

    private POBAdBuilding a() {
        return new POBBidsBuilder();
    }

    public POBManager(@NonNull POBRequest pOBRequest, @NonNull Context context) {
        POBCommunicator pOBCommunicatorA = a(context, pOBRequest);
        this.f62785b = pOBCommunicatorA;
        pOBCommunicatorA.setListener(new b());
        this.f62788e = POBInstanceProvider.getDeviceInfo(context);
    }

    private POBNetworkHandler a(Context context) {
        return POBInstanceProvider.getNetworkHandler(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type com.pubmatic.sdk.common.base.POBBidding to com.pubmatic.sdk.openwrap.core.POBManager for r1v1 'this'  com.pubmatic.sdk.common.base.POBBidding
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public void a(com.pubmatic.sdk.common.POBError r2) {
        /*
            r1 = this;
            com.pubmatic.sdk.common.base.POBBidderResult r0 = r1.f62786c
            if (r0 == 0) goto L7
            r0.setError(r2)
        L7:
            com.pubmatic.sdk.common.base.POBBidderListener<T extends com.pubmatic.sdk.common.base.POBAdDescriptor> r0 = r1.bidderListener
            if (r0 == 0) goto Le
            r0.onBidsFailed(r1, r2)
        Le:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.openwrap.core.POBManager.a(com.pubmatic.sdk.common.POBError):void");
    }

    private boolean b() {
        String iSOAlpha2CountryCode;
        if (this.f62787d != null) {
            POBDeviceInfo pOBDeviceInfo = this.f62788e;
            if (pOBDeviceInfo != null) {
                iSOAlpha2CountryCode = pOBDeviceInfo.getISOAlpha2CountryCode();
                POBLog.debug("POBManager", String.format(Locale.ENGLISH, "Device country code is %s", iSOAlpha2CountryCode), new Object[0]);
            } else {
                iSOAlpha2CountryCode = null;
            }
            if (!POBUtils.isNullOrEmpty(iSOAlpha2CountryCode)) {
                String countryFilteringMode = this.f62787d.getCountryFilteringMode();
                Set<String> filteringCountries = this.f62787d.getFilteringCountries();
                if (filteringCountries != null && filteringCountries.size() > 0) {
                    if (POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE.equals(countryFilteringMode)) {
                        return filteringCountries.contains(iSOAlpha2CountryCode);
                    }
                    if (POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE.equals(countryFilteringMode)) {
                        return !filteringCountries.contains(iSOAlpha2CountryCode);
                    }
                }
            }
        }
        return true;
    }
}
