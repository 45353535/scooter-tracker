package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFf1wSDK extends AFe1eSDK<DdlResponse> {
    private int AFInAppEventParameterName;
    private int AFInAppEventType;

    @NotNull
    private final CountDownLatch AFKeystoreWrapper;
    private int AFLogger;

    @NotNull
    private final AFa1pSDK areAllFieldsValid;

    @NotNull
    private final AFj1rSDK copy;

    @NotNull
    private final AFa1rSDK copydefault;

    @NotNull
    private final AFh1tSDK equals;

    @NotNull
    private final AFc1eSDK hashCode;

    @NotNull
    private final List<AFj1qSDK> registerClient;

    @NotNull
    private final AFc1pSDK toString;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFe1uSDK.values().length];
            try {
                iArr[AFe1uSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1uSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
            int[] iArr2 = new int[AFj1qSDK.AFa1vSDK.values().length];
            try {
                iArr2[AFj1qSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1qSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMonetizationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1wSDK(@NotNull AFa1pSDK aFa1pSDK, @NotNull AFc1bSDK aFc1bSDK) {
        super(AFe1mSDK.DLSDK, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.areAllFieldsValid = aFa1pSDK;
        this.AFKeystoreWrapper = new CountDownLatch(1);
        this.registerClient = new ArrayList();
        AFc1pSDK currencyIso4217Code = aFc1bSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.toString = currencyIso4217Code;
        AFc1eSDK aFc1eSDKAfInfoLog = aFc1bSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKAfInfoLog, "");
        this.hashCode = aFc1eSDKAfInfoLog;
        AFa1rSDK aFa1rSDKI = aFc1bSDK.i();
        Intrinsics.checkNotNullExpressionValue(aFa1rSDKI, "");
        this.copydefault = aFa1rSDKI;
        AFh1tSDK aFh1tSDKComponent3 = aFc1bSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFh1tSDKComponent3, "");
        this.equals = aFh1tSDKComponent3;
        AFj1rSDK aFj1rSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFj1rSDKAFLogger, "");
        this.copy = aFj1rSDKAFLogger;
        AFj1qSDK[] aFj1qSDKArr = (AFj1qSDK[]) aFj1rSDKAFLogger.getCurrencyIso4217Code.toArray(new AFj1qSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1qSDKArr, "");
        ArrayList<AFj1qSDK> arrayList = new ArrayList();
        for (AFj1qSDK aFj1qSDK : aFj1qSDKArr) {
            if (aFj1qSDK != null && aFj1qSDK.areAllFieldsValid != AFj1qSDK.AFa1vSDK.NOT_STARTED) {
                arrayList.add(aFj1qSDK);
            }
        }
        this.AFLogger = arrayList.size();
        for (final AFj1qSDK aFj1qSDK2 : arrayList) {
            AFj1qSDK.AFa1vSDK aFa1vSDK = aFj1qSDK2.areAllFieldsValid;
            int i10 = aFa1vSDK == null ? -1 : AFa1ySDK.getMonetizationNetwork[aFa1vSDK.ordinal()];
            if (i10 == 1) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1qSDK2.AFAdRevenueData.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1qSDK2, "");
                getMonetizationNetwork(aFj1qSDK2);
            } else if (i10 == 2) {
                aFj1qSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.u
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1wSDK.getRevenue(aFj1qSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean copy() {
        Object obj = this.areAllFieldsValid.getCurrencyIso4217Code.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFLogger && !this.areAllFieldsValid.getCurrencyIso4217Code.containsKey("referrers");
    }

    private final void getMonetizationNetwork(AFj1qSDK aFj1qSDK) {
        if (!AFAdRevenueData(aFj1qSDK)) {
            int i10 = this.AFInAppEventParameterName + 1;
            this.AFInAppEventParameterName = i10;
            if (i10 == this.AFLogger) {
                this.AFKeystoreWrapper.countDown();
                return;
            }
            return;
        }
        this.registerClient.add(aFj1qSDK);
        this.AFKeystoreWrapper.countDown();
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic " + aFj1qSDK.getClass().getSimpleName(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1qSDK aFj1qSDK, AFf1wSDK aFf1wSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1wSDK, "");
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1qSDK.AFAdRevenueData.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1wSDK.getMonetizationNetwork((AFj1qSDK) observable);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return this.copydefault.component2;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    @NotNull
    public final AFe1uSDK getMediationNetwork() {
        AFe1uSDK mediationNetwork;
        AFe1uSDK aFe1uSDK = AFe1uSDK.FAILURE;
        try {
            mediationNetwork = super.getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        } catch (Exception e10) {
            e = e10;
        }
        try {
            AFh1tSDK aFh1tSDK = this.equals;
            int i10 = this.AFInAppEventType;
            if (i10 <= 0 || i10 > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
            } else {
                int i11 = i10 - 1;
                aFh1tSDK.component1[i11] = System.currentTimeMillis();
                long j10 = aFh1tSDK.component4[i11];
                if (j10 != 0) {
                    long[] jArr = aFh1tSDK.areAllFieldsValid;
                    jArr[i11] = aFh1tSDK.component1[i11] - j10;
                    aFh1tSDK.getRevenue.put("net", jArr);
                } else {
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i11);
                    sb2.append("] ts is missing");
                    AFLogger.afInfoLog(sb2.toString());
                }
            }
            int i12 = AFa1ySDK.AFAdRevenueData[mediationNetwork.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    return mediationNetwork;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
                AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.equals.getMonetizationNetwork(deepLinkResult, this.copydefault.component2);
                this.copydefault.getMonetizationNetwork(deepLinkResult);
                return mediationNetwork;
            }
            ResponseNetwork responseNetwork2 = ((AFe1eSDK) this).component3;
            Intrinsics.checkNotNull(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            DdlResponse ddlResponse = (DdlResponse) body;
            DeepLink deepLink = ddlResponse.deepLink;
            if (deepLink != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                this.equals.getMonetizationNetwork(deepLinkResult2, this.copydefault.component2);
                this.copydefault.getMonetizationNetwork(deepLinkResult2);
                return mediationNetwork;
            }
            if (this.AFInAppEventType > 1 || !ddlResponse.getSecondPing() || !copy()) {
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                this.equals.getMonetizationNetwork(deepLinkResult3, this.copydefault.component2);
                this.copydefault.getMonetizationNetwork(deepLinkResult3);
                return mediationNetwork;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
            this.AFKeystoreWrapper.await();
            AFh1tSDK aFh1tSDK2 = this.equals;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = aFh1tSDK2.component1[0];
            if (j11 != 0) {
                aFh1tSDK2.getRevenue.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j11));
            } else {
                AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
            }
            if (this.AFInAppEventParameterName != this.AFLogger) {
                return getMediationNetwork();
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
            this.equals.getMonetizationNetwork(deepLinkResult4, this.copydefault.component2);
            this.copydefault.getMonetizationNetwork(deepLinkResult4);
            return AFe1uSDK.SUCCESS;
        } catch (Exception e11) {
            e = e11;
            aFe1uSDK = mediationNetwork;
            Throwable cause = e.getCause();
            if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFInAppEventType + " attempt(s) within " + this.copydefault.component2 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.equals.getMonetizationNetwork(deepLinkResult5, this.copydefault.component2);
                this.copydefault.getMonetizationNetwork(deepLinkResult5);
                return AFe1uSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.equals.getMonetizationNetwork(deepLinkResult6, this.copydefault.component2);
                this.copydefault.getMonetizationNetwork(deepLinkResult6);
                return aFe1uSDK;
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            this.equals.getMonetizationNetwork(deepLinkResult7, this.copydefault.component2);
            this.copydefault.getMonetizationNetwork(deepLinkResult7);
            return aFe1uSDK;
        }
    }

    private static boolean AFAdRevenueData(AFj1qSDK aFj1qSDK) {
        Object obj = aFj1qSDK.AFAdRevenueData.get("click_ts");
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1mSDK aFb1mSDK) {
        String str;
        if (aFb1mSDK == null || (str = aFb1mSDK.getCurrencyIso4217Code) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1mSDK.getRevenue;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.to("type", "unhashed"), TuplesKt.to("value", str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
    @Override // com.appsflyer.internal.AFe1eSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.appsflyer.internal.AFd1jSDK<com.appsflyer.internal.DdlResponse> getRevenue(@org.jetbrains.annotations.NotNull java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1wSDK.getRevenue(java.lang.String):com.appsflyer.internal.AFd1jSDK");
    }
}
