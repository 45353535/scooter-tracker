package io.bidmachine.ads.networks.my_target;

import ae.a;
import ae.d;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import od.e;
import zb.h;

/* JADX INFO: loaded from: classes12.dex */
class MyTargetAdapter extends HeaderBiddingAdapter {

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.my_target.MyTargetAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$utils$Gender;

        static {
            int[] iArr = new int[d.values().length];
            $SwitchMap$io$bidmachine$utils$Gender = iArr;
            try {
                iArr[d.Female.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$utils$Gender[d.Male.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    MyTargetAdapter() {
        super("", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    private void configure(boolean z10, @NonNull zb.d dVar) {
        MyTargetManager.setDebugMode(z10);
        if (dVar.isUserInGdprScope()) {
            MyTargetPrivacy.setUserConsent(dVar.isUserHasConsent());
        }
        if (dVar.isUserInCcpaScope()) {
            MyTargetPrivacy.setCcpaUserConsent(dVar.a());
        }
        MyTargetPrivacy.setUserAgeRestricted(dVar.isUserAgeRestricted());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[FALL_THROUGH] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static ae.a mapError(@androidx.annotation.Nullable com.my.target.common.models.IAdLoadingError r3) {
        /*
            if (r3 != 0) goto L5
            ae.a r3 = ae.a.f4248r
            return r3
        L5:
            int r0 = r3.getCode()
            java.lang.String r3 = r3.getMessage()
            r1 = 5000(0x1388, float:7.006E-42)
            if (r0 == r1) goto L2a
            r1 = 5001(0x1389, float:7.008E-42)
            if (r0 == r1) goto L27
            switch(r0) {
                case 1000: goto L2a;
                case 1001: goto L2a;
                case 1002: goto L24;
                case 1003: goto L21;
                default: goto L18;
            }
        L18:
            switch(r0) {
                case 2000: goto L2a;
                case 2001: goto L2a;
                case 2002: goto L2a;
                case 2003: goto L2a;
                case 2004: goto L2a;
                case 2005: goto L2a;
                default: goto L1b;
            }
        L1b:
            switch(r0) {
                case 3000: goto L2a;
                case 3001: goto L2a;
                case 3002: goto L2a;
                case 3003: goto L27;
                case 3004: goto L2a;
                default: goto L1e;
            }
        L1e:
            ae.a r1 = ae.a.f4248r
            goto L2e
        L21:
            ae.a r1 = ae.a.f4236f
            goto L2e
        L24:
            ae.a r1 = ae.a.f4235e
            goto L2e
        L27:
            ae.a r1 = ae.a.f4247q
            goto L2e
        L2a:
            ae.a r1 = ae.a.h(r3)
        L2e:
            ae.a r2 = new ae.a
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.my_target.MyTargetAdapter.mapError(com.my.target.common.models.IAdLoadingError):ae.a");
    }

    private static int transformGender(@NonNull d dVar) {
        int i10 = AnonymousClass1.$SwitchMap$io$bidmachine$utils$Gender[dVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? 0 : 1;
        }
        return 2;
    }

    static void updateTargeting(@NonNull od.d dVar, @Nullable CustomParams customParams) {
        if (customParams == null) {
            return;
        }
        h targetingInfo = dVar.getTargetingInfo();
        Integer numA = targetingInfo.a();
        if (numA != null) {
            customParams.setAge(numA.intValue());
        }
        d gender = targetingInfo.getGender();
        if (gender != null) {
            customParams.setGender(transformGender(gender));
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new MyTargetBanner();
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createInterstitial() {
        return new MyTargetInterstitial();
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createRewarded() {
        return new MyTargetRewarded();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return MyTargetManager.isSdkInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    @WorkerThread
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("slot_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(a.b("slot_id"));
            return;
        }
        configure(dVar.isTestMode(), dVar.getDataRestrictions());
        String bidderToken = MyTargetManager.getBidderToken(contextProvider.getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            headerBiddingCollectParamsCallback.onCollectFail(a.b("bidder_token"));
            return;
        }
        HashMap map = new HashMap();
        map.put("bidder_token", bidderToken);
        map.put("slot_id", mediationParameter);
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        configure(initializationParams.isTestMode(), initializationParams.getDataRestrictions());
        MyTargetManager.initSdk(contextProvider.getApplicationContext());
        networkInitializationCallback.onSuccess();
    }
}
