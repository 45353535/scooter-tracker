package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.adjust.sdk.Constants;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.billingclient.api.BillingClient;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.taurusx.tax.y.z.w.s;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFa1uSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static char[] AFInAppEventParameterName = null;
    private static int AFInAppEventType = 0;
    private static int AFKeystoreWrapper = 0;
    private static boolean AFLogger = false;

    @VisibleForTesting
    private static AFa1uSDK areAllFieldsValid = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15590d = 1;
    static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code;
    public static final String getRevenue;
    private static boolean registerClient;
    Application component3;
    private volatile SharedPreferences copy;
    private Map<Long, String> copydefault;
    private AFf1nSDK equals;
    private boolean toString;
    public volatile AppsFlyerConversionListener getMediationNetwork = null;
    private long component4 = -1;
    long getMonetizationNetwork = -1;
    private long component2 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;

    @NonNull
    private final AFc1dSDK hashCode = new AFc1dSDK();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1uSDK$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1uSDK$AFa1uSDK, reason: collision with other inner class name */
    class C0196AFa1uSDK implements AFe1sSDK {
        C0196AFa1uSDK() {
        }

        @Override // com.appsflyer.internal.AFe1sSDK
        public final void getMediationNetwork(AFe1lSDK<?> aFe1lSDK) {
        }

        @Override // com.appsflyer.internal.AFe1sSDK
        public final void getMonetizationNetwork(AFe1lSDK<?> aFe1lSDK, AFe1uSDK aFe1uSDK) {
            JSONObject jSONObjectAFAdRevenueData;
            AFf1aSDK revenue;
            if (!(aFe1lSDK instanceof AFf1uSDK)) {
                if (!(aFe1lSDK instanceof AFg1iSDK) || aFe1uSDK == AFe1uSDK.SUCCESS) {
                    return;
                }
                AFg1nSDK aFg1nSDK = new AFg1nSDK(AFa1uSDK.this.getCurrencyIso4217Code());
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                AFe1nSDK aFe1nSDKCopydefault = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).copydefault();
                aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFg1nSDK));
                return;
            }
            AFf1uSDK aFf1uSDK = (AFf1uSDK) aFe1lSDK;
            boolean z10 = aFe1lSDK instanceof AFf1rSDK;
            if (z10 && getMediationNetwork()) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1lSDK;
                if (aFf1rSDK.AFAdRevenueData == AFe1uSDK.SUCCESS || aFf1rSDK.getMonetizationNetwork == 1) {
                    AFg1iSDK aFg1iSDK = new AFg1iSDK(aFf1rSDK, AFa1uSDK.this.getCurrencyIso4217Code().component2());
                    AFa1uSDK aFa1uSDK2 = AFa1uSDK.this;
                    AFe1nSDK aFe1nSDKCopydefault2 = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK2}, 389316487, -389316474, System.identityHashCode(aFa1uSDK2))).copydefault();
                    aFe1nSDKCopydefault2.AFAdRevenueData.execute(aFe1nSDKCopydefault2.new AnonymousClass3(aFg1iSDK));
                }
            }
            AFa1uSDK aFa1uSDK3 = AFa1uSDK.this;
            AFh1qSDK aFh1qSDKAfLogForce = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK3}, 389316487, -389316474, System.identityHashCode(aFa1uSDK3))).afLogForce();
            if (aFh1qSDKAfLogForce != null && z10) {
                aFh1qSDKAfLogForce.getMonetizationNetwork((AFf1rSDK) aFe1lSDK, new Function0() { // from class: com.appsflyer.internal.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f15641b.getMonetizationNetwork();
                    }
                });
            }
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFa1uSDK aFa1uSDK4 = AFa1uSDK.this;
                ((AFc1oSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK4, aFa1uSDK4.component3}, -1595266545, 1595266567, System.identityHashCode(aFa1uSDK4))).AFAdRevenueData("sentSuccessfully", "true");
                if (!(aFe1lSDK instanceof AFf1pSDK) && (revenue = new AFg1tSDK(AFa1uSDK.this.component3).getRevenue()) != null && revenue.getMediationNetwork) {
                    String str = revenue.getMonetizationNetwork;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFa1uSDK monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
                    AFc1bSDK aFc1bSDK = (AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{monetizationNetwork}, 389316487, -389316474, System.identityHashCode(monetizationNetwork));
                    AFf1pSDK aFf1pSDK = new AFf1pSDK(str, aFc1bSDK);
                    AFe1nSDK aFe1nSDKCopydefault3 = aFc1bSDK.copydefault();
                    aFe1nSDKCopydefault3.AFAdRevenueData.execute(aFe1nSDKCopydefault3.new AnonymousClass3(aFf1pSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1eSDK) aFf1uSDK).component3;
                if (responseNetwork != null && (jSONObjectAFAdRevenueData = AFa1oSDK.AFAdRevenueData((String) responseNetwork.getBody())) != null) {
                    AFa1uSDK.this.component1 = jSONObjectAFAdRevenueData.optBoolean("send_background", false);
                }
                if (z10) {
                    AFa1uSDK.this.getMonetizationNetwork = System.currentTimeMillis();
                }
            }
        }

        private boolean getMediationNetwork() {
            return AFa1uSDK.this.getMediationNetwork != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getMonetizationNetwork() throws UnsupportedEncodingException {
            AFa1uSDK.this.getCurrencyIso4217Code(new AFh1kSDK());
            return Unit.f93236a;
        }
    }

    static {
        component3();
        getRevenue = "356";
        AFAdRevenueData = "6.17";
        getCurrencyIso4217Code = null;
        areAllFieldsValid = new AFa1uSDK();
        int i10 = f15590d + 61;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 48 / 0;
        }
    }

    @VisibleForTesting
    public AFa1uSDK() {
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getMediationNetwork();
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getRevenue();
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).copydefault().getMonetizationNetwork.add(new C0196AFa1uSDK());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1oSDK aFf1oSDK) {
        int i10 = f15590d + 61;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AFf1oSDK aFf1oSDK2 = AFf1oSDK.SUCCESS;
            throw null;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        if (aFf1oSDK == AFf1oSDK.SUCCESS) {
            int i11 = AFKeystoreWrapper + 103;
            f15590d = i11 % 128;
            if (i11 % 2 == 0) {
                aFc1bSDK.afWarnLog().getRevenue();
                throw null;
            }
            aFc1bSDK.afWarnLog().getRevenue();
        }
        if (aFc1bSDK.equals().getCurrencyIso4217Code()) {
            aFc1bSDK.afErrorLog().getMediationNetwork();
        } else {
            f15590d = (AFKeystoreWrapper + 77) % 128;
            aFc1bSDK.afErrorLog().AFAdRevenueData();
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i10 = f15590d + 47;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).i().AFAdRevenueData.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).i().AFAdRevenueData;
        if (!list.contains(listAsList)) {
            list.add(listAsList);
            f15590d = (AFKeystoreWrapper + 71) % 128;
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    private static void c_(Context context, PackageInfo packageInfo) {
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i10 = AFKeystoreWrapper + 7;
                f15590d = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = applicationInfo.flags;
                    throw null;
                }
                if ((applicationInfo.flags & 32768) != 0) {
                    if (Build.VERSION.SDK_INT < 31) {
                        if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                            AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                            return;
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                            return;
                        }
                    }
                    if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    } else {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                        AFKeystoreWrapper = (f15590d + 109) % 128;
                    }
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th2);
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        final AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        String str = (String) objArr[1];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        Context context = (Context) objArr[3];
        int i10 = AFKeystoreWrapper + 65;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            boolean z10 = aFa1uSDK.toString;
            throw null;
        }
        if (aFa1uSDK.toString) {
            return aFa1uSDK;
        }
        aFa1uSDK.toString = true;
        ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFKeystoreWrapper().getMonetizationNetwork(str);
        if (context != null) {
            aFa1uSDK.getMediationNetwork(context);
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return aFa1uSDK;
            }
            aFa1uSDK.component3 = applicationO_;
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).getMediationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15627b.copy();
                }
            });
            AFe1nSDK aFe1nSDKCopydefault = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).copydefault();
            aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFe1fSDK(aFa1uSDK.getCurrencyIso4217Code())));
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).afWarnLog().getMediationNetwork(new AFd1xSDK.AFa1ySDK() { // from class: com.appsflyer.internal.f
                @Override // com.appsflyer.internal.AFd1xSDK.AFa1ySDK
                public final void onConfigurationChanged(boolean z11) {
                    this.f15632a.getMediationNetwork(z11);
                }
            });
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).component1().getRevenue(aFa1uSDK.AFAdRevenueData());
            AFj1rSDK aFj1rSDKAFLogger = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.g
                @Override // java.lang.Runnable
                public final void run() throws UnsupportedEncodingException {
                    this.f15635b.equals();
                }
            };
            AFi1bSDK monetizationNetwork = aFj1rSDKAFLogger.getMonetizationNetwork(runnable);
            Runnable revenue = aFj1rSDKAFLogger.getRevenue(monetizationNetwork, runnable);
            aFj1rSDKAFLogger.getCurrencyIso4217Code.add(monetizationNetwork);
            aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1mSDK(aFj1rSDKAFLogger.getMonetizationNetwork.getCurrencyIso4217Code(), revenue));
            aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1zSDK(revenue, aFj1rSDKAFLogger.getMonetizationNetwork, new AFj1vSDK()));
            aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1lSDK(revenue, aFj1rSDKAFLogger.getMonetizationNetwork));
            aFj1rSDKAFLogger.getCurrencyIso4217Code.add(new AFj1uSDK(aFj1rSDKAFLogger.getMonetizationNetwork.getMediationNetwork(), aFj1rSDKAFLogger.getMonetizationNetwork.getCurrencyIso4217Code(), revenue));
            aFj1rSDKAFLogger.getMediationNetwork(revenue);
            AFj1qSDK[] aFj1qSDKArr = (AFj1qSDK[]) aFj1rSDKAFLogger.getCurrencyIso4217Code.toArray(new AFj1qSDK[0]);
            int length = aFj1qSDKArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = AFKeystoreWrapper + 89;
                f15590d = i12 % 128;
                if (i12 % 2 == 0) {
                    aFj1qSDKArr[i11].getCurrencyIso4217Code(aFj1rSDKAFLogger.getMonetizationNetwork.registerClient().getRevenue);
                    i11 += 21;
                } else {
                    aFj1qSDKArr[i11].getCurrencyIso4217Code(aFj1rSDKAFLogger.getMonetizationNetwork.registerClient().getRevenue);
                    i11++;
                }
            }
            if (!aFj1rSDKAFLogger.getMediationNetwork()) {
                aFj1rSDKAFLogger.AFAdRevenueData(aFj1rSDKAFLogger.getMonetizationNetwork.registerClient().getRevenue, revenue, aFj1rSDKAFLogger.getMonetizationNetwork);
                f15590d = (AFKeystoreWrapper + 47) % 128;
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).equals().getCurrencyIso4217Code("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.3", getRevenue));
        aFa1uSDK.getMediationNetwork = appsFlyerConversionListener;
        return aFa1uSDK;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i10 = (f15590d + 45) % 128;
        AFKeystoreWrapper = i10;
        AFc1dSDK aFc1dSDK = aFa1uSDK.hashCode;
        int i11 = i10 + 73;
        f15590d = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 82 / 0;
        }
        return aFc1dSDK;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
        f15590d = (AFKeystoreWrapper + 59) % 128;
        aFa1uSDK.subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i10 = AFKeystoreWrapper + 11;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i10 = AFKeystoreWrapper + 21;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).equals().getCurrencyIso4217Code("unregisterConversionListener", new String[0]);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).equals().getCurrencyIso4217Code("unregisterConversionListener", new String[0]);
        }
        aFa1uSDK.getMediationNetwork = null;
        int i11 = f15590d + 57;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 95 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = AFKeystoreWrapper + 83;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, zBooleanValue);
            return null;
        }
        AppsFlyerProperties.getInstance().set(str, zBooleanValue);
        throw null;
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i10 = AFKeystoreWrapper + 51;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            aFa1uSDK.getMediationNetwork(context);
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).component2();
            throw null;
        }
        aFa1uSDK.getMediationNetwork(context);
        AFc1oSDK aFc1oSDKComponent2 = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).component2();
        int i11 = AFKeystoreWrapper + 47;
        f15590d = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 57 / 0;
        }
        return aFc1oSDKComponent2;
    }

    public static SharedPreferences d_(Context context) {
        int i10 = AFKeystoreWrapper + 43;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            SharedPreferences sharedPreferences = getMonetizationNetwork().copy;
            throw null;
        }
        if (getMonetizationNetwork().copy == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                getMonetizationNetwork().copy = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        SharedPreferences sharedPreferences2 = getMonetizationNetwork().copy;
        int i11 = AFKeystoreWrapper + 21;
        f15590d = i11 % 128;
        if (i11 % 2 != 0) {
            return sharedPreferences2;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e_(Context context, Intent intent) {
        getRevenue(new Object[]{this, context, intent}, 253751881, -253751860, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new AFh1kSDK());
        int i10 = AFKeystoreWrapper + 69;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 11 / 0;
        }
    }

    private static void getCurrencyIso4217Code(String str, String str2) {
        int i10 = AFKeystoreWrapper + 5;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            throw null;
        }
        AppsFlyerProperties.getInstance().set(str, str2);
        int i11 = AFKeystoreWrapper + 105;
        f15590d = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 84 / 0;
        }
    }

    public static AFa1uSDK getMonetizationNetwork() {
        int i10 = (f15590d + 87) % 128;
        AFKeystoreWrapper = i10;
        AFa1uSDK aFa1uSDK = areAllFieldsValid;
        f15590d = (i10 + 85) % 128;
        return aFa1uSDK;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i10 * (-1335)) + (i11 * (-667));
        int i14 = ~i11;
        int i15 = i10 | i12;
        switch (i13 + (((~i15) | i14) * (-668)) + ((i10 | (~(i12 | i14))) * 1336) + ((i15 | i14) * 668)) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
                String[] strArr = (String[]) objArr[1];
                f15590d = (AFKeystoreWrapper + 89) % 128;
                aFa1uSDK.setSharingFilterForPartners(strArr);
                f15590d = (AFKeystoreWrapper + 21) % 128;
                return null;
            case 3:
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                AFKeystoreWrapper = (f15590d + 109) % 128;
                getCurrencyIso4217Code(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(zBooleanValue));
                AFKeystoreWrapper = (f15590d + 105) % 128;
                return null;
            case 4:
                return getMonetizationNetwork(objArr);
            case 5:
                return getRevenue(objArr);
            case 6:
                AFa1uSDK aFa1uSDK2 = (AFa1uSDK) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                f15590d = (AFKeystoreWrapper + 61) % 128;
                aFa1uSDK2.component2 = TimeUnit.SECONDS.toMillis(iIntValue);
                AFKeystoreWrapper = (f15590d + 111) % 128;
                return null;
            case 7:
                return getMediationNetwork(objArr);
            case 8:
                return AFAdRevenueData(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                AFa1uSDK aFa1uSDK3 = (AFa1uSDK) objArr[0];
                Context context = (Context) objArr[1];
                String str = (String) objArr[2];
                Map<String, Object> map = (Map) objArr[3];
                f15590d = (AFKeystoreWrapper + 7) % 128;
                aFa1uSDK3.logEvent(context, str, map, null);
                f15590d = (AFKeystoreWrapper + 119) % 128;
                return null;
            case 11:
                return component4(objArr);
            case 12:
                Boolean bool = (Boolean) objArr[1];
                boolean zBooleanValue2 = bool.booleanValue();
                AFKeystoreWrapper = (f15590d + 111) % 128;
                AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(zBooleanValue2)));
                getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, bool}, -222394073, 222394090, (int) System.currentTimeMillis());
                f15590d = (AFKeystoreWrapper + 69) % 128;
                return null;
            case 13:
                return component2(objArr);
            case 14:
                return component3(objArr);
            case 15:
                return component1(objArr);
            case 16:
                AFa1uSDK aFa1uSDK4 = (AFa1uSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                URI uri = (URI) objArr[2];
                int i16 = (AFKeystoreWrapper + 37) % 128;
                f15590d = i16;
                if (uri != null) {
                    AFKeystoreWrapper = (i16 + 1) % 128;
                    if (!uri.toString().isEmpty()) {
                        if (context2 != null) {
                            aFa1uSDK4.getMediationNetwork(context2);
                            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i().g_(AFa1gSDK.getMonetizationNetwork(((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).afErrorLogForExcManagerOnly()), Uri.parse(uri.toString()));
                            return null;
                        }
                        AFa1rSDK aFa1rSDKI = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i();
                        StringBuilder sb2 = new StringBuilder("Context is \"");
                        sb2.append(context2);
                        sb2.append("\"");
                        aFa1rSDKI.getMediationNetwork(sb2.toString(), DeepLinkResult.Error.NETWORK);
                        return null;
                    }
                }
                AFa1rSDK aFa1rSDKI2 = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i();
                StringBuilder sb3 = new StringBuilder("Link is \"");
                sb3.append(uri);
                sb3.append("\"");
                aFa1rSDKI2.getMediationNetwork(sb3.toString(), DeepLinkResult.Error.NETWORK);
                return null;
            case 17:
                return copy(objArr);
            case 18:
                AFa1uSDK aFa1uSDK5 = (AFa1uSDK) objArr[0];
                int i17 = f15590d + 47;
                AFKeystoreWrapper = i17 % 128;
                return (AFj1qSDK[]) (i17 % 2 != 0 ? ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK5}, 389316487, -389316474, System.identityHashCode(aFa1uSDK5))).AFLogger().getCurrencyIso4217Code.toArray(new AFj1qSDK[1]) : ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK5}, 389316487, -389316474, System.identityHashCode(aFa1uSDK5))).AFLogger().getCurrencyIso4217Code.toArray(new AFj1qSDK[0]));
            case 19:
                return toString(objArr);
            case 20:
                AFa1uSDK aFa1uSDK6 = (AFa1uSDK) objArr[0];
                ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK6}, 389316487, -389316474, System.identityHashCode(aFa1uSDK6))).afInfoLog().getRevenue = new AFb1uSDK((String[]) objArr[1]);
                AFKeystoreWrapper = (f15590d + 31) % 128;
                return null;
            case 21:
                return hashCode(objArr);
            case 22:
                return copydefault(objArr);
            case 23:
                AFa1uSDK aFa1uSDK7 = (AFa1uSDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str2 = (String) objArr[2];
                aFa1uSDK7.getMediationNetwork(context3);
                AFg1tSDK aFg1tSDK = new AFg1tSDK(context3);
                if (str2 == null || str2.trim().isEmpty()) {
                    AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
                    return null;
                }
                AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str2));
                AFf1aSDK revenue = aFg1tSDK.getRevenue();
                if (revenue == null || !str2.equals(revenue.getMonetizationNetwork)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean z10 = revenue == null || jCurrentTimeMillis - revenue.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(2L);
                    AFf1aSDK aFf1aSDK = new AFf1aSDK(str2, jCurrentTimeMillis, !z10);
                    aFg1tSDK.getMonetizationNetwork.AFAdRevenueData("afUninstallToken", aFf1aSDK.getMonetizationNetwork);
                    aFg1tSDK.getMonetizationNetwork.getRevenue("afUninstallToken_received_time", aFf1aSDK.getCurrencyIso4217Code);
                    aFg1tSDK.getMonetizationNetwork.getCurrencyIso4217Code("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
                    if (z10) {
                        AFa1uSDK monetizationNetwork = getMonetizationNetwork();
                        AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{monetizationNetwork}, 389316487, -389316474, System.identityHashCode(monetizationNetwork));
                        AFf1pSDK aFf1pSDK = new AFf1pSDK(str2, aFc1bSDK);
                        AFe1nSDK aFe1nSDKCopydefault = aFc1bSDK.copydefault();
                        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFf1pSDK));
                    }
                }
                return null;
            case 24:
                AFa1uSDK aFa1uSDK8 = (AFa1uSDK) objArr[0];
                Context context4 = (Context) objArr[1];
                Map<String, Object> map2 = (Map) objArr[2];
                PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
                AFKeystoreWrapper = (f15590d + 5) % 128;
                aFa1uSDK8.getMediationNetwork(context4);
                PurchaseHandler purchaseHandlerAreAllFieldsValid = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK8}, 389316487, -389316474, System.identityHashCode(aFa1uSDK8))).areAllFieldsValid();
                if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map2, purchaseValidationCallback, PurchaseDatabaseHelper.TABLE_NAME)) {
                    AFe1bSDK aFe1bSDK = new AFe1bSDK(map2, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.AFAdRevenueData);
                    AFe1nSDK aFe1nSDK = purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code;
                    aFe1nSDK.AFAdRevenueData.execute(aFe1nSDK.new AnonymousClass3(aFe1bSDK));
                }
                AFKeystoreWrapper = (f15590d + 65) % 128;
                return null;
            default:
                AFa1uSDK aFa1uSDK9 = (AFa1uSDK) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int i18 = AFKeystoreWrapper + 57;
                f15590d = i18 % 128;
                if (i18 % 2 == 0) {
                    AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK9}, 389316487, -389316474, System.identityHashCode(aFa1uSDK9))).equals();
                    String[] strArr2 = new String[1];
                    strArr2[1] = String.valueOf(zBooleanValue3);
                    aFd1mSDKEquals.getCurrencyIso4217Code("setCollectAndroidID", strArr2);
                } else {
                    ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK9}, 389316487, -389316474, System.identityHashCode(aFa1uSDK9))).equals().getCurrencyIso4217Code("setCollectAndroidID", String.valueOf(zBooleanValue3));
                }
                getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(zBooleanValue3));
                getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(zBooleanValue3));
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object hashCode(java.lang.Object[] r10) {
        /*
            r0 = 0
            r1 = r10[r0]
            com.appsflyer.internal.AFa1uSDK r1 = (com.appsflyer.internal.AFa1uSDK) r1
            r2 = 1
            r3 = r10[r2]
            android.content.Context r3 = (android.content.Context) r3
            r4 = 2
            r10 = r10[r4]
            android.content.Intent r10 = (android.content.Intent) r10
            r1.getMediationNetwork(r3)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r0] = r1
            int r6 = java.lang.System.identityHashCode(r1)
            r7 = 389316487(0x17347f87, float:5.83221E-25)
            r8 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            java.lang.Object r5 = getRevenue(r5, r7, r8, r6)
            com.appsflyer.internal.AFc1bSDK r5 = (com.appsflyer.internal.AFc1bSDK) r5
            com.appsflyer.internal.AFa1rSDK r5 = r5.i()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r0] = r1
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.Object r1 = getRevenue(r6, r7, r8, r1)
            com.appsflyer.internal.AFc1bSDK r1 = (com.appsflyer.internal.AFc1bSDK) r1
            com.appsflyer.internal.AFc1oSDK r1 = r1.component2()
            r6 = 0
            if (r10 == 0) goto L63
            int r7 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r7 = r7 + 35
            int r8 = r7 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r8
            int r7 = r7 % r4
            java.lang.String r8 = "android.intent.action.VIEW"
            if (r7 == 0) goto L5b
            java.lang.String r7 = r10.getAction()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L63
            android.net.Uri r7 = r10.getData()
            goto L64
        L5b:
            java.lang.String r10 = r10.getAction()
            r8.equals(r10)
            throw r6
        L63:
            r7 = r6
        L64:
            if (r7 == 0) goto L8d
            int r8 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r8 = r8 + 7
            int r9 = r8 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r9
            int r8 = r8 % r4
            if (r8 == 0) goto L85
            java.lang.String r7 = r7.toString()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L8d
            int r7 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r7 = r7 + 93
            int r7 = r7 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r7
            r7 = r2
            goto L8e
        L85:
            java.lang.String r10 = r7.toString()
            r10.isEmpty()
            throw r6
        L8d:
            r7 = r0
        L8e:
            java.lang.String r8 = "ddl_sent"
            boolean r1 = r1.getMediationNetwork(r8, r0)
            if (r1 == 0) goto Lb3
            r1 = r7 ^ 1
            if (r1 == r2) goto L9b
            goto Lb3
        L9b:
            int r10 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r10 = r10 + 93
            int r1 = r10 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r1
            int r10 = r10 % r4
            java.lang.String r1 = "No direct deep link"
            if (r10 != 0) goto Laf
            r5.getMediationNetwork(r1, r6)
            r10 = 37
            int r10 = r10 / r0
            goto Lb2
        Laf:
            r5.getMediationNetwork(r1, r6)
        Lb2:
            return r6
        Lb3:
            com.appsflyer.internal.AFc1bSDK r0 = r5.component1
            com.appsflyer.internal.AFa1hSDK r0 = r0.afErrorLogForExcManagerOnly()
            com.appsflyer.internal.AFa1gSDK r0 = com.appsflyer.internal.AFa1gSDK.getMonetizationNetwork(r0)
            r5.f_(r0, r10, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.hashCode(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        boolean monetizationNetwork;
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i10 = AFKeystoreWrapper + 99;
        f15590d = i10 % 128;
        Object[] objArr2 = new Object[1];
        if (i10 % 2 == 0) {
            objArr2[0] = aFa1uSDK;
            monetizationNetwork = ((AFc1bSDK) getRevenue(objArr2, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFKeystoreWrapper().getMonetizationNetwork();
            int i11 = 64 / 0;
        } else {
            objArr2[0] = aFa1uSDK;
            monetizationNetwork = ((AFc1bSDK) getRevenue(objArr2, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFKeystoreWrapper().getMonetizationNetwork();
        }
        int i12 = AFKeystoreWrapper + 107;
        f15590d = i12 % 128;
        if (i12 % 2 != 0) {
            return Boolean.valueOf(monetizationNetwork);
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        getRevenue(new Object[]{this, strArr}, -503631880, 503631889, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        int i10 = f15590d + 67;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z10);
            aFd1mSDKEquals.getCurrencyIso4217Code("anonymizeUser", strArr);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("anonymizeUser", String.valueOf(z10));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
        int i11 = AFKeystoreWrapper + 87;
        f15590d = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 42 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i10 = f15590d + 45;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AFa1rSDK aFa1rSDKI = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i();
            aFa1rSDKI.getMonetizationNetwork = str;
            aFa1rSDKI.getMediationNetwork = map;
            throw null;
        }
        AFa1rSDK aFa1rSDKI2 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i();
        aFa1rSDKI2.getMonetizationNetwork = str;
        aFa1rSDKI2.getMediationNetwork = map;
        f15590d = (AFKeystoreWrapper + 99) % 128;
    }

    final void b_(Context context, Intent intent) {
        getRevenue(new Object[]{this, context, intent}, -1666869813, 1666869820, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        int i10 = AFKeystoreWrapper + 11;
        f15590d = i10 % 128;
        ((AFc1bSDK) (i10 % 2 == 0 ? getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this)) : getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this)))).afInfoLog().component1 = true;
        int i11 = AFKeystoreWrapper + 33;
        f15590d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        f15590d = (AFKeystoreWrapper + 47) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).unregisterClient().getMonetizationNetwork(z10);
        f15590d = (AFKeystoreWrapper + 73) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z10) {
        getRevenue(new Object[]{this, Boolean.valueOf(z10)}, 163982159, -163982156, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        getMediationNetwork(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        return com.appsflyer.internal.AFb1jSDK.getRevenue(((com.appsflyer.internal.AFc1bSDK) getRevenue(new java.lang.Object[]{r7}, 389316487, -389316474, java.lang.System.identityHashCode(r7))).getCurrencyIso4217Code().getMonetizationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1uSDK.f15590d + 115) % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getAppsFlyerUID(@androidx.annotation.NonNull android.content.Context r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            int r2 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r2 = r2 + 55
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r3
            int r2 = r2 % 2
            java.lang.String r3 = "getAppsFlyerUID"
            r4 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            r5 = 389316487(0x17347f87, float:5.83221E-25)
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r7
            int r6 = java.lang.System.identityHashCode(r7)
            java.lang.Object r2 = getRevenue(r2, r5, r4, r6)
            com.appsflyer.internal.AFc1bSDK r2 = (com.appsflyer.internal.AFc1bSDK) r2
            com.appsflyer.internal.AFd1mSDK r2 = r2.equals()
            java.lang.String[] r6 = new java.lang.String[r1]
            r2.getCurrencyIso4217Code(r3, r6)
            if (r8 != 0) goto L53
            goto L49
        L30:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r7
            int r6 = java.lang.System.identityHashCode(r7)
            java.lang.Object r2 = getRevenue(r2, r5, r4, r6)
            com.appsflyer.internal.AFc1bSDK r2 = (com.appsflyer.internal.AFc1bSDK) r2
            com.appsflyer.internal.AFd1mSDK r2 = r2.equals()
            java.lang.String[] r6 = new java.lang.String[r1]
            r2.getCurrencyIso4217Code(r3, r6)
            if (r8 != 0) goto L53
        L49:
            int r8 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r8 = r8 + 115
            int r8 = r8 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r8
            r8 = 0
            return r8
        L53:
            r7.getMediationNetwork(r8)
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r8[r1] = r7
            int r0 = java.lang.System.identityHashCode(r7)
            java.lang.Object r8 = getRevenue(r8, r5, r4, r0)
            com.appsflyer.internal.AFc1bSDK r8 = (com.appsflyer.internal.AFc1bSDK) r8
            com.appsflyer.internal.AFc1pSDK r8 = r8.getCurrencyIso4217Code()
            com.appsflyer.internal.AFc1oSDK r8 = r8.getMonetizationNetwork
            java.lang.String r8 = com.appsflyer.internal.AFb1jSDK.getRevenue(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i10 = f15590d + 21;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            getMediationNetwork(context);
            return ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getRevenue(context);
        }
        getMediationNetwork(context);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getRevenue(context);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i10 = f15590d + 59;
        AFKeystoreWrapper = i10 % 128;
        Object[] objArr = new Object[1];
        if (i10 % 2 == 0) {
            objArr[0] = this;
            return ((AFc1bSDK) getRevenue(objArr, 389316487, -389316474, System.identityHashCode(this))).AFInAppEventParameterName().getCurrencyIso4217Code();
        }
        objArr[0] = this;
        ((AFc1bSDK) getRevenue(objArr, 389316487, -389316474, System.identityHashCode(this))).AFInAppEventParameterName().getCurrencyIso4217Code();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return (String) getRevenue(new Object[]{this}, 103305784, -103305776, System.identityHashCode(this));
    }

    public final void getMediationNetwork(@NonNull Context context) {
        int i10 = (f15590d + 37) % 128;
        AFKeystoreWrapper = i10;
        AFc1dSDK aFc1dSDK = this.hashCode;
        if (context != null) {
            int i11 = i10 + 25;
            f15590d = i11 % 128;
            if (i11 % 2 == 0) {
                AFc1gSDK aFc1gSDK = aFc1dSDK.getMonetizationNetwork;
                throw null;
            }
            AFc1gSDK aFc1gSDK2 = aFc1dSDK.getMonetizationNetwork;
            int i12 = i10 + 3;
            f15590d = i12 % 128;
            if (i12 % 2 != 0) {
                aFc1gSDK2.getRevenue = context.getApplicationContext();
            } else {
                aFc1gSDK2.getRevenue = context.getApplicationContext();
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i10 = AFKeystoreWrapper + 107;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
        if (currencyIso4217Code == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i11 = AFKeystoreWrapper + 71;
        f15590d = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 72 / 0;
        }
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        f15590d = (AFKeystoreWrapper + 105) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("getSdkVersion", new String[0]);
        String strComponent2 = AFc1pSDK.component2();
        int i10 = AFKeystoreWrapper + 125;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            return strComponent2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        return (AppsFlyerLib) getRevenue(new Object[]{this, str, appsFlyerConversionListener, context}, 519263238, -519263223, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        f15590d = (AFKeystoreWrapper + 35) % 128;
        getMediationNetwork(context);
        boolean mediationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getMediationNetwork(context);
        f15590d = (AFKeystoreWrapper + 15) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return ((Boolean) getRevenue(new Object[]{this}, 224962975, -224962956, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) throws UnsupportedEncodingException {
        if (!this.toString) {
            getMediationNetwork("logAdRevenue");
            f15590d = (AFKeystoreWrapper + 119) % 128;
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i10 = AFKeystoreWrapper + 9;
            f15590d = i10 % 128;
            if (i10 % 2 != 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                return;
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                int i11 = 32 / 0;
                return;
            }
        }
        if (!((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
            if (AFk1xSDK.getRevenue(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork())) {
                copydefault();
                return;
            } else {
                getMonetizationNetwork(new AFh1nSDK(aFAdRevenueData, map));
                return;
            }
        }
        int i12 = AFKeystoreWrapper + 87;
        f15590d = i12 % 128;
        if (i12 % 2 != 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) throws UnsupportedEncodingException {
        HashMap map2 = map == null ? null : new HashMap(map);
        getMediationNetwork(context);
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.component4 = str;
        aFh1hSDK.getMonetizationNetwork = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1hSDK.getMonetizationNetwork(mapSingletonMap);
        }
        aFh1hSDK.AFAdRevenueData = map2;
        AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
        Map map5 = aFh1hSDK.AFAdRevenueData;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1mSDKEquals.getCurrencyIso4217Code("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            getMediationNetwork(context, AFh1xSDK.logEvent);
        }
        getMediationNetwork(aFh1hSDK, AFAdRevenueData(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) throws UnsupportedEncodingException {
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d11));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i10 = f15590d + 59;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 60 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) throws UnsupportedEncodingException {
        f15590d = (AFKeystoreWrapper + 25) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("logSession", new String[0]);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getMonetizationNetwork();
        getMediationNetwork(context, AFh1xSDK.logSession);
        AFAdRevenueData(context, (String) null, (Map<String, Object>) null);
        int i10 = AFKeystoreWrapper + 107;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 63 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i10 = f15590d + 57;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afDebugLog().getMonetizationNetwork();
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afDebugLog().getMonetizationNetwork();
            int i11 = 92 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        getRevenue(new Object[]{this, context, uri}, 1798513644, -1798513628, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context context) {
        int i10 = (AFKeystoreWrapper + 45) % 128;
        f15590d = i10;
        if (intent == null) {
            int i11 = i10 + 71;
            AFKeystoreWrapper = i11 % 128;
            if (i11 % 2 == 0) {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        if (context == null) {
            int i12 = i10 + 123;
            AFKeystoreWrapper = i12 % 128;
            if (i12 % 2 == 0) {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                int i13 = 4 / 0;
                return;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        getMediationNetwork(applicationContext);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getMediationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f15636b.e_(applicationContext, intent);
            }
        });
        int i14 = f15590d + 97;
        AFKeystoreWrapper = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i10 = f15590d + 111;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("registerConversionListener", new String[1]);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("registerConversionListener", new String[0]);
        }
        getRevenue(appsFlyerConversionListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        com.appsflyer.internal.AFa1uSDK.getCurrencyIso4217Code = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        com.appsflyer.internal.AFa1uSDK.f15590d = (com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper + 9) % 128;
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void registerValidatorListener(android.content.Context r7, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r8) {
        /*
            r6 = this;
            r7 = 1
            r0 = 0
            int r1 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r2
            int r1 = r1 % 2
            java.lang.String r2 = "registerValidatorListener called"
            java.lang.String r3 = "registerValidatorListener"
            r4 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            r5 = 389316487(0x17347f87, float:5.83221E-25)
            if (r1 != 0) goto L35
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.Object r7 = getRevenue(r7, r5, r4, r1)
            com.appsflyer.internal.AFc1bSDK r7 = (com.appsflyer.internal.AFc1bSDK) r7
            com.appsflyer.internal.AFd1mSDK r7 = r7.equals()
            java.lang.String[] r0 = new java.lang.String[r0]
            r7.getCurrencyIso4217Code(r3, r0)
            com.appsflyer.AFLogger.afDebugLog(r2)
            if (r8 != 0) goto L5f
            goto L51
        L35:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.Object r7 = getRevenue(r7, r5, r4, r1)
            com.appsflyer.internal.AFc1bSDK r7 = (com.appsflyer.internal.AFc1bSDK) r7
            com.appsflyer.internal.AFd1mSDK r7 = r7.equals()
            java.lang.String[] r0 = new java.lang.String[r0]
            r7.getCurrencyIso4217Code(r3, r0)
            com.appsflyer.AFLogger.afDebugLog(r2)
            if (r8 != 0) goto L5f
        L51:
            int r7 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r7 = r7 + 9
            int r7 = r7 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r7
            java.lang.String r7 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r7)
            return
        L5f:
            com.appsflyer.internal.AFa1uSDK.getCurrencyIso4217Code = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getRevenue(new Object[]{this, context, map, purchaseValidationCallback}, 788315212, -788315188, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFKeystoreWrapper = (f15590d + 65) % 128;
        getMediationNetwork(context);
        PurchaseHandler purchaseHandlerAreAllFieldsValid = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).areAllFieldsValid();
        if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map, purchaseValidationCallback, BillingClient.FeatureType.SUBSCRIPTIONS)) {
            AFe1jSDK aFe1jSDK = new AFe1jSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.AFAdRevenueData);
            AFe1nSDK aFe1nSDK = purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code;
            aFe1nSDK.AFAdRevenueData.execute(aFe1nSDK.new AnonymousClass3(aFe1jSDK));
            f15590d = (AFKeystoreWrapper + 91) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendPushNotificationData(@androidx.annotation.Nullable android.app.Activity r18) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        AFKeystoreWrapper = (f15590d + 23) % 128;
        if (map != null) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        f15590d = (AFKeystoreWrapper + 9) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        f15590d = (AFKeystoreWrapper + 25) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAndroidIdData", str);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().AFAdRevenueData = str;
        AFKeystoreWrapper = (f15590d + 53) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i10 = AFKeystoreWrapper + 111;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals();
            String[] strArr = new String[0];
            strArr[0] = str;
            aFd1mSDKEquals.getCurrencyIso4217Code("setAppId", strArr);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAppId", str);
        }
        getCurrencyIso4217Code("appid", str);
        AFKeystoreWrapper = (f15590d + 89) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        AFKeystoreWrapper = (f15590d + 89) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        getCurrencyIso4217Code(AppsFlyerProperties.ONELINK_ID, str);
        AFKeystoreWrapper = (f15590d + 91) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        getRevenue(new Object[]{this, Boolean.valueOf(z10)}, 454542992, -454542992, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        f15590d = (AFKeystoreWrapper + 111) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCollectIMEI", String.valueOf(z10));
        getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z10));
        getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z10));
        AFKeystoreWrapper = (f15590d + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z10) {
        AFKeystoreWrapper = (f15590d + 43) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCollectOaid", String.valueOf(z10));
        getCurrencyIso4217Code(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z10));
        f15590d = (AFKeystoreWrapper + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        f15590d = (AFKeystoreWrapper + 117) % 128;
        Objects.requireNonNull(appsFlyerConsent);
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().areAllFieldsValid = appsFlyerConsent;
        f15590d = (AFKeystoreWrapper + 63) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        f15590d = (AFKeystoreWrapper + 117) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        AFKeystoreWrapper = (f15590d + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) throws UnsupportedEncodingException {
        if (context != null) {
            int i10 = f15590d + 101;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 != 0) {
                getRevenue();
                throw null;
            }
            if (!getRevenue()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                f15590d = (AFKeystoreWrapper + 51) % 128;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
            sb2.append(str);
            sb2.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb2.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component2());
            getMediationNetwork(context, AFh1xSDK.setCustomerIdAndLogSession);
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork();
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                int i11 = f15590d + 113;
                AFKeystoreWrapper = i11 % 128;
                if (i11 % 2 != 0) {
                    ((Activity) context).getIntent();
                    int i12 = 4 / 0;
                } else {
                    ((Activity) context).getIntent();
                }
            }
            getRevenue(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        f15590d = (AFKeystoreWrapper + 25) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, -222394073, 222394090, (int) System.currentTimeMillis());
        f15590d = (AFKeystoreWrapper + 5) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        AFKeystoreWrapper = (f15590d + 65) % 128;
        setLogLevel(!z10 ? AFLogger.LogLevel.NONE : AFLogger.LogLevel.DEBUG);
        f15590d = (AFKeystoreWrapper + 3) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setDisableAdvertisingIdentifiers(boolean r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            int r2 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r2 = r2 + 39
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r3
            int r2 = r2 % 2
            java.lang.String r3 = "setDisableAdvertisingIdentifiers: "
            if (r2 != 0) goto L21
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r3.concat(r2)
            com.appsflyer.AFLogger.afDebugLog(r2)
            r2 = 82
            int r2 = r2 / r1
            if (r5 != 0) goto L30
            goto L2e
        L21:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r3.concat(r2)
            com.appsflyer.AFLogger.afDebugLog(r2)
            if (r5 != 0) goto L30
        L2e:
            r2 = r0
            goto L31
        L30:
            r2 = r1
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.appsflyer.internal.AFb1kSDK.getMediationNetwork = r2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            int r1 = java.lang.System.identityHashCode(r4)
            r2 = 389316487(0x17347f87, float:5.83221E-25)
            r3 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            java.lang.Object r0 = getRevenue(r0, r2, r3, r1)
            com.appsflyer.internal.AFc1bSDK r0 = (com.appsflyer.internal.AFc1bSDK) r0
            com.appsflyer.internal.AFc1eSDK r1 = r0.afInfoLog()
            r1.component3 = r5
            if (r5 == 0) goto L7b
            int r5 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r5 = r5 + 109
            int r1 = r5 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r1
            int r5 = r5 % 2
            r1 = 0
            if (r5 != 0) goto L74
            com.appsflyer.internal.AFc1eSDK r5 = r0.afInfoLog()
            r5.component2 = r1
            int r5 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r5 = r5 + 7
            int r0 = r5 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L73
            return
        L73:
            throw r1
        L74:
            com.appsflyer.internal.AFc1eSDK r5 = r0.afInfoLog()
            r5.component2 = r1
            throw r1
        L7b:
            com.appsflyer.internal.AFe1nSDK r5 = r0.copydefault()
            com.appsflyer.internal.AFe1fSDK r0 = new com.appsflyer.internal.AFe1fSDK
            com.appsflyer.internal.AFc1bSDK r1 = r4.getCurrencyIso4217Code()
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r5.AFAdRevenueData
            com.appsflyer.internal.AFe1nSDK$3 r2 = new com.appsflyer.internal.AFe1nSDK$3
            r2.<init>(r0)
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.setDisableAdvertisingIdentifiers(boolean):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z10) {
        getRevenue(new Object[]{this, Boolean.valueOf(z10)}, 775079759, -775079747, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        AFKeystoreWrapper = (f15590d + 9) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i10 = AFKeystoreWrapper + 23;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) {
        String strTrim;
        if (AFk1xSDK.getMonetizationNetwork(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i10 = f15590d;
        AFKeystoreWrapper = (i10 + 5) % 128;
        if (str != null) {
            AFKeystoreWrapper = (i10 + 67) % 128;
            strTrim = str.trim();
        } else {
            strTrim = "";
        }
        AFe1ySDK.getMediationNetwork(new AFe1wSDK(strTrim, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        Object revenue;
        int i10 = f15590d + 37;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setImeiData", str);
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setImeiData", str);
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        }
        ((AFc1bSDK) revenue).AFKeystoreWrapper().getCurrencyIso4217Code(str);
        int i11 = AFKeystoreWrapper + 61;
        f15590d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if ((r8 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r8 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (((com.appsflyer.internal.AFc1bSDK) getRevenue(new java.lang.Object[]{r7}, 389316487, -389316474, java.lang.System.identityHashCode(r7))).getCurrencyIso4217Code().getRevenue("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        r8 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper + 83;
        com.appsflyer.internal.AFa1uSDK.f15590d = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        if ((r8 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        com.appsflyer.internal.AFb1jSDK.getCurrencyIso4217Code(r8, ((com.appsflyer.internal.AFc1bSDK) getRevenue(new java.lang.Object[]{r7}, 389316487, -389316474, java.lang.System.identityHashCode(r7))).component2());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r7.toString == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r7.toString == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
        r8 = com.appsflyer.internal.AFa1uSDK.f15590d + 57;
        com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r8 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setInstallId(@androidx.annotation.NonNull java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            int r2 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r2 = r2 + 95
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r3
            int r2 = r2 % 2
            java.lang.String r3 = "setInstallId"
            r4 = -389316474(0xffffffffe8cb8086, float:-7.68809E24)
            r5 = 389316487(0x17347f87, float:5.83221E-25)
            if (r2 != 0) goto L32
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r7
            int r6 = java.lang.System.identityHashCode(r7)
            java.lang.Object r2 = getRevenue(r2, r5, r4, r6)
            com.appsflyer.internal.AFc1bSDK r2 = (com.appsflyer.internal.AFc1bSDK) r2
            com.appsflyer.internal.AFd1mSDK r2 = r2.equals()
            java.lang.String[] r6 = new java.lang.String[r1]
            r2.getCurrencyIso4217Code(r3, r6)
            boolean r2 = r7.toString
            if (r2 != 0) goto L66
            goto L4d
        L32:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r7
            int r6 = java.lang.System.identityHashCode(r7)
            java.lang.Object r2 = getRevenue(r2, r5, r4, r6)
            com.appsflyer.internal.AFc1bSDK r2 = (com.appsflyer.internal.AFc1bSDK) r2
            com.appsflyer.internal.AFd1mSDK r2 = r2.equals()
            java.lang.String[] r6 = new java.lang.String[r1]
            r2.getCurrencyIso4217Code(r3, r6)
            boolean r2 = r7.toString
            if (r2 != 0) goto L66
        L4d:
            com.appsflyer.AFLogger r8 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r0 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r2 = "AppsFlyerLib.init() method should be called first"
            r8.d(r0, r2)
            int r8 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r8 = r8 + 57
            int r0 = r8 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r0
            int r8 = r8 % 2
            if (r8 == 0) goto L65
            r8 = 52
            int r8 = r8 / r1
        L65:
            return
        L66:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r7
            int r3 = java.lang.System.identityHashCode(r7)
            java.lang.Object r2 = getRevenue(r2, r5, r4, r3)
            com.appsflyer.internal.AFc1bSDK r2 = (com.appsflyer.internal.AFc1bSDK) r2
            com.appsflyer.internal.AFc1pSDK r2 = r2.getCurrencyIso4217Code()
            java.lang.String r3 = "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID"
            boolean r2 = r2.getRevenue(r3)
            if (r2 != 0) goto L8a
            com.appsflyer.AFLogger r8 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r0 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r1 = "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first"
            r8.d(r0, r1)
            return
        L8a:
            if (r8 != 0) goto Lab
            int r8 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r8 = r8 + 83
            int r0 = r8 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r0
            int r8 = r8 % 2
            java.lang.String r0 = "AppsFlyer installId can't be null"
            if (r8 == 0) goto La2
            com.appsflyer.AFLogger r8 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.GENERAL
            r8.d(r1, r0)
            return
        La2:
            com.appsflyer.AFLogger r8 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.GENERAL
            r8.d(r1, r0)
            r8 = 0
            throw r8
        Lab:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.Object r0 = getRevenue(r0, r5, r4, r1)
            com.appsflyer.internal.AFc1bSDK r0 = (com.appsflyer.internal.AFc1bSDK) r0
            com.appsflyer.internal.AFc1oSDK r0 = r0.component2()
            com.appsflyer.internal.AFb1jSDK.getCurrencyIso4217Code(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.setInstallId(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        int i10 = f15590d + 55;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setIsUpdate", String.valueOf(z10));
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setIsUpdate", String.valueOf(z10));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z10;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            AFKeystoreWrapper = (f15590d + 125) % 128;
            z10 = true;
        } else {
            AFKeystoreWrapper = (f15590d + 43) % 128;
            z10 = false;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code(s.z.f67719y, String.valueOf(z10));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z10) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().areAllFieldsValid();
            return;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getRevenue();
        int i10 = AFKeystoreWrapper + 11;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        getRevenue(new Object[]{this, Integer.valueOf(i10)}, 1308989660, -1308989654, i10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        f15590d = (AFKeystoreWrapper + 3) % 128;
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setOaidData", str);
        AFb1kSDK.getRevenue = str;
        int i10 = AFKeystoreWrapper + 3;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        Object revenue;
        int i10 = f15590d + 91;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        } else {
            AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
            revenue = getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        }
        ((AFc1bSDK) revenue).i().areAllFieldsValid = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i10 = f15590d;
        AFKeystoreWrapper = (i10 + 75) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i11 = i10 + 1;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        } else {
            String lowerCase2 = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        f15590d = (AFKeystoreWrapper + 9) % 128;
        AFc1eSDK aFc1eSDKAfInfoLog = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog();
        if (aFc1eSDKAfInfoLog.getCurrencyIso4217Code == null) {
            aFc1eSDKAfInfoLog.getCurrencyIso4217Code = new AFb1rSDK();
        }
        AFb1rSDK aFb1rSDK = aFc1eSDKAfInfoLog.getCurrencyIso4217Code;
        if (str != null) {
            AFKeystoreWrapper = (f15590d + 53) % 128;
            if (!str.isEmpty()) {
                if (map != null) {
                    int i10 = f15590d + 5;
                    AFKeystoreWrapper = i10 % 128;
                    if (i10 % 2 != 0) {
                        map.isEmpty();
                        throw null;
                    }
                    if (!map.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder("Setting partner data for ");
                        sb2.append(str);
                        sb2.append(": ");
                        sb2.append(map);
                        AFLogger.afDebugLog(sb2.toString());
                        int length = new JSONObject(map).toString().length();
                        if (length <= 1000) {
                            aFb1rSDK.getRevenue.put(str, map);
                            aFb1rSDK.getCurrencyIso4217Code.remove(str);
                            return;
                        } else {
                            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                            HashMap map2 = new HashMap();
                            map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                            aFb1rSDK.getCurrencyIso4217Code.put(str, map2);
                            return;
                        }
                    }
                }
                AFLogger.afWarnLog(aFb1rSDK.getRevenue.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(str));
                int i11 = f15590d + 65;
                AFKeystoreWrapper = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i10 = AFKeystoreWrapper + 23;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().getMonetizationNetwork = AFj1bSDK.getCurrencyIso4217Code(str);
            throw null;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afInfoLog().getMonetizationNetwork = AFj1bSDK.getCurrencyIso4217Code(str);
        f15590d = (AFKeystoreWrapper + 5) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        getRevenue(new Object[]{this, pluginInfo}, 1343916491, -1343916486, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i10 = f15590d + 73;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.put("pid", str);
                    int i11 = 48 / 0;
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, str2);
                AFKeystoreWrapper = (f15590d + 69) % 128;
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        } else {
            AFKeystoreWrapper = (f15590d + 77) % 128;
            getCurrencyIso4217Code("preInstallName", jSONObject.toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFKeystoreWrapper = (f15590d + 51) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1rSDK aFa1rSDKI = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i();
        aFa1rSDKI.component4.clear();
        aFa1rSDKI.component4.addAll(Arrays.asList(strArr));
        f15590d = (AFKeystoreWrapper + 37) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        getRevenue(new Object[]{this, strArr}, -134062068, 134062070, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        AFKeystoreWrapper = (f15590d + 113) % 128;
        setSharingFilterForPartners("all");
        int i10 = AFKeystoreWrapper + 57;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getRevenue(new Object[]{this, strArr}, -251208297, 251208317, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i10 = f15590d + 89;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i11 = 48 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i10 = f15590d + 27;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            start(context, null);
            throw null;
        }
        start(context, null);
        AFKeystoreWrapper = (f15590d + 61) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        f15590d = (AFKeystoreWrapper + 63) % 128;
        getMediationNetwork(context);
        final AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        aFc1bSDK.AFKeystoreWrapper().getRevenue(z10);
        aFc1bSDK.getMediationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                AFa1uSDK.getMediationNetwork(aFc1bSDK);
            }
        });
        if (z10) {
            int i10 = AFKeystoreWrapper + 31;
            f15590d = i10 % 128;
            if (i10 % 2 == 0) {
                aFc1bSDK.component2().getCurrencyIso4217Code("is_stop_tracking_used", false);
            } else {
                aFc1bSDK.component2().getCurrencyIso4217Code("is_stop_tracking_used", true);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j10) {
        int i10 = AFKeystoreWrapper + 61;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getRevenue = deepLinkListener;
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().component2 = j10;
        } else {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().getRevenue = deepLinkListener;
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).i().component2 = j10;
            int i11 = 45 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        getRevenue(new Object[]{this}, 1122585742, -1122585731, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, 912251885, -912251862, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
            sb2.append(str3);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str5);
            aFLogger.i(aFg1cSDK, sb2.toString());
        }
        if (str != null && str4 != null) {
            int i10 = AFKeystoreWrapper;
            f15590d = (i10 + 55) % 128;
            if (str2 != null) {
                int i11 = i10 + 105;
                int i12 = i11 % 128;
                f15590d = i12;
                if (i11 % 2 == 0) {
                    throw null;
                }
                if (str5 != null) {
                    AFKeystoreWrapper = (i12 + 35) % 128;
                    if (str3 != null) {
                        new Thread(new AFa1vSDK(context.getApplicationContext(), getCurrencyIso4217Code().AFKeystoreWrapper().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                        return;
                    }
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        AFKeystoreWrapper = (f15590d + 43) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z10)), true);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z10)}, -222394073, 222394090, (int) System.currentTimeMillis());
        f15590d = (AFKeystoreWrapper + 107) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0070 -> B:22:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r10, java.lang.String r11, int[] r12, int r13, java.lang.Object[] r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.a(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }

    @WorkerThread
    private void component2() {
        f15590d = (AFKeystoreWrapper + 77) % 128;
        try {
            final AFi1jSDK aFi1jSDKV = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).v();
            if (aFi1jSDKV == null) {
                return;
            }
            if (aFi1jSDKV.getMonetizationNetwork()) {
                AFKeystoreWrapper = (f15590d + 9) % 128;
                aFi1jSDKV.getMonetizationNetwork(new AFi1eSDK() { // from class: com.appsflyer.internal.a
                    @Override // com.appsflyer.internal.AFi1eSDK
                    public final void onRequestFinished() {
                        this.f15611a.getMediationNetwork(aFi1jSDKV);
                    }
                });
            } else {
                if (aFi1jSDKV.getMediationNetwork()) {
                    return;
                }
                getMonetizationNetwork(aFi1jSDKV);
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th2);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th2)));
        }
    }

    public final void getMonetizationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String monetizationNetwork = ((AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this))).getMonetizationNetwork("extraReferrers", null);
            if (monetizationNetwork == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(monetizationNetwork);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                f15590d = (AFKeystoreWrapper + 21) % 128;
                jSONArray.put(jCurrentTimeMillis);
                AFKeystoreWrapper = (f15590d + 57) % 128;
            }
            if (jSONObject.length() >= 4) {
                int i10 = AFKeystoreWrapper + 117;
                f15590d = i10 % 128;
                if (i10 % 2 == 0) {
                    AFAdRevenueData(jSONObject);
                    int i11 = 14 / 0;
                } else {
                    AFAdRevenueData(jSONObject);
                }
            }
            jSONObject.put(str, jSONArray.toString());
            ((AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this))).AFAdRevenueData("extraReferrers", jSONObject.toString());
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e10);
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    static void component3() {
        AFInAppEventParameterName = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
        AFInAppEventType = 1912311211;
        registerClient = true;
        AFLogger = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        AFi1pSDK aFi1qSDK;
        int i10 = AFKeystoreWrapper + 125;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afRDLog().getMonetizationNetwork();
            throw null;
        }
        if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afRDLog().getMonetizationNetwork()) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afRDLog().getRevenue();
        }
        AFi1sSDK aFi1sSDKW = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).w();
        if (Build.VERSION.SDK_INT >= 31) {
            aFi1qSDK = new AFi1oSDK(aFi1sSDKW.getCurrencyIso4217Code);
        } else {
            aFi1qSDK = new AFi1qSDK(aFi1sSDKW.getCurrencyIso4217Code);
            AFKeystoreWrapper = (f15590d + 67) % 128;
        }
        aFi1sSDKW.getMediationNetwork = aFi1qSDK;
        AFf1cSDK aFf1cSDKAFKeystoreWrapper = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper();
        AFf1cSDK.getRevenue(new Object[]{aFf1cSDKAFKeystoreWrapper, ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code()}, 826598914, -826598912, System.identityHashCode(aFf1cSDKAFKeystoreWrapper));
        AFh1tSDK aFh1tSDKComponent3 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component3();
        aFh1tSDKComponent3.component2 = System.currentTimeMillis();
        int mediationNetwork = aFh1tSDKComponent3.getMediationNetwork.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0);
        if (mediationNetwork == 1 && aFh1tSDKComponent3.getCurrencyIso4217Code.getRevenue("first_launch")) {
            AFKeystoreWrapper = (f15590d + 71) % 128;
            aFh1tSDKComponent3.getMonetizationNetwork.putAll(aFh1tSDKComponent3.AFAdRevenueData("first_launch"));
        }
        if (mediationNetwork > 0 && aFh1tSDKComponent3.getCurrencyIso4217Code.getRevenue("gcd")) {
            AFKeystoreWrapper = (f15590d + 75) % 128;
            aFh1tSDKComponent3.AFAdRevenueData.putAll(aFh1tSDKComponent3.AFAdRevenueData("gcd"));
        }
        aFh1tSDKComponent3.hashCode = aFh1tSDKComponent3.getCurrencyIso4217Code.getCurrencyIso4217Code("prev_session_dur", 0L);
        component2();
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFInAppEventType().getCurrencyIso4217Code();
    }

    private static void copydefault() {
        int i10 = f15590d + 121;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        int i10 = AFKeystoreWrapper + 105;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            return AppsFlyerProperties.getInstance().getString(str);
        }
        AppsFlyerProperties.getInstance().getString(str);
        throw null;
    }

    final void component4() {
        f15590d = (AFKeystoreWrapper + 9) % 128;
        if (AFe1dSDK.component2()) {
            int i10 = AFKeystoreWrapper + 45;
            f15590d = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 68 / 0;
                return;
            }
            return;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
        AFe1nSDK aFe1nSDKCopydefault = aFc1bSDK.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFe1dSDK(aFc1bSDK)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        f15590d = (AFKeystoreWrapper + 1) % 128;
        start(context, str, null);
        f15590d = (AFKeystoreWrapper + 29) % 128;
    }

    final void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        boolean z10;
        long j10;
        Context context = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).registerClient().getRevenue;
        if (context == null) {
            int i10 = f15590d + 71;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 != 0) {
                AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            } else {
                AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            }
        }
        String mediationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1jSDK.getMonetizationNetwork;
        if (mediationNetwork != null && mediationNetwork.length() != 0) {
            AFc1oSDK aFc1oSDK = (AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this));
            AppsFlyerProperties.getInstance().saveProperties(aFc1oSDK);
            if (!((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("sendWithEvent from activity: ");
                sb2.append(context.getClass().getName());
                aFLogger.i(aFg1cSDK, sb2.toString(), true);
            }
            boolean mediationNetwork2 = aFh1jSDK.getMediationNetwork();
            Map<String, ?> revenue = getRevenue(aFh1jSDK);
            if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork()) {
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                AFKeystoreWrapper = (f15590d + 109) % 128;
            }
            int monetizationNetwork = getMonetizationNetwork(aFc1oSDK, false);
            getRevenue(new Object[]{this, revenue}, 1290570600, -1290570599, System.identityHashCode(this));
            AFa1tSDK aFa1tSDK = new AFa1tSDK(getCurrencyIso4217Code(), aFh1jSDK.getMonetizationNetwork(revenue).getMonetizationNetwork(monetizationNetwork), getCurrencyIso4217Code().unregisterClient().getCurrencyIso4217Code());
            if (!(!mediationNetwork2)) {
                z10 = false;
                for (AFj1qSDK aFj1qSDK : (AFj1qSDK[]) getRevenue(new Object[]{this}, -187960988, 187961006, System.identityHashCode(this))) {
                    if (aFj1qSDK.areAllFieldsValid == AFj1qSDK.AFa1vSDK.STARTED) {
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                        StringBuilder sb3 = new StringBuilder("Failed to get ");
                        sb3.append(aFj1qSDK.getCurrencyIso4217Code);
                        sb3.append(" referrer, wait ...");
                        aFLogger2.d(aFg1cSDK2, sb3.toString());
                        z10 = true;
                    }
                }
                if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).unregisterClient().getRevenue()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                    z10 = true;
                }
                if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().AFAdRevenueData()) {
                    AFKeystoreWrapper = (f15590d + 15) % 128;
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            ScheduledExecutorService monetizationNetwork2 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getMonetizationNetwork();
            if (z10) {
                int i11 = AFKeystoreWrapper + 99;
                f15590d = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 29 / 0;
                }
                j10 = 500;
            } else {
                j10 = 0;
            }
            AFj1aSDK.AFAdRevenueData(monetizationNetwork2, aFa1tSDK, j10, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger aFLogger3 = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK3 = AFg1cSDK.GENERAL;
        aFLogger3.i(aFg1cSDK3, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        aFLogger3.i(aFg1cSDK3, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f15590d + 121;
            AFKeystoreWrapper = i11 % 128;
            if (i11 % 2 == 0) {
                String str2 = strArr[i10];
                if (AnonymousClass2.getRevenue[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(AFj1bSDK.getCurrencyIso4217Code(str2));
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    str = "plain_el_arr";
                }
            } else {
                String str3 = strArr[i10];
                int i12 = AnonymousClass2.getRevenue[emailsCryptType.ordinal()];
                throw null;
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        int i13 = f15590d + 35;
        AFKeystoreWrapper = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afDebugLog().getCurrencyIso4217Code()) {
            return;
        }
        if (!this.toString) {
            getMediationNetwork("start");
            if (str == null) {
                int i10 = AFKeystoreWrapper + 79;
                int i11 = i10 % 128;
                f15590d = i11;
                if (i10 % 2 == 0) {
                    throw null;
                }
                if (appsFlyerRequestListener != null) {
                    int i12 = i11 + 21;
                    AFKeystoreWrapper = i12 % 128;
                    if (i12 % 2 != 0) {
                        appsFlyerRequestListener.onError(88, "No dev key");
                        return;
                    } else {
                        appsFlyerRequestListener.onError(41, "No dev key");
                        return;
                    }
                }
                return;
            }
        }
        getMediationNetwork(context);
        final AFh1tSDK aFh1tSDKComponent3 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component3();
        aFh1tSDKComponent3.getRevenue(AFh1uSDK.getRevenue(context));
        if (this.component3 == null) {
            f15590d = (AFKeystoreWrapper + 35) % 128;
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return;
            }
            f15590d = (AFKeystoreWrapper + 109) % 128;
            this.component3 = applicationO_;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).equals().getCurrencyIso4217Code("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getRevenue;
        aFLogger.i(aFg1cSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.17.3", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        aFLogger.i(aFg1cSDK, sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component2());
        if (!TextUtils.isEmpty(str)) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork(str);
        } else if (!(!TextUtils.isEmpty(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork()))) {
            int i13 = AFKeystoreWrapper + 63;
            f15590d = i13 % 128;
            if (i13 % 2 == 0) {
                copydefault();
                int i14 = 69 / 0;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            } else {
                copydefault();
                if (appsFlyerRequestListener == null) {
                    return;
                }
            }
            AFKeystoreWrapper = (f15590d + 29) % 128;
            appsFlyerRequestListener.onError(41, "No dev key");
            return;
        }
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component1().getRevenue(AFAdRevenueData());
        component4();
        c_(this.component3.getBaseContext(), this.hashCode.getCurrencyIso4217Code().n_());
        ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).unregisterClient().getMediationNetwork();
        this.hashCode.afDebugLog().getCurrencyIso4217Code(context, new AFb1aSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1uSDK.3
            @Override // com.appsflyer.internal.AFb1aSDK.AFa1ySDK
            public final void getMediationNetwork() {
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                Context context2 = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).registerClient().getRevenue;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1tSDK aFh1tSDK = aFh1tSDKComponent3;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = aFh1tSDK.component3;
                if (j10 != 0) {
                    long j11 = jCurrentTimeMillis - j10;
                    if (j11 > 0 && j11 < 1000) {
                        j11 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j11);
                    aFh1tSDK.hashCode = seconds;
                    aFh1tSDK.getCurrencyIso4217Code.getRevenue("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1uSDK aFa1uSDK2 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK2}, 389316487, -389316474, System.identityHashCode(aFa1uSDK2))).afWarnLog().getCurrencyIso4217Code();
                AFa1uSDK aFa1uSDK3 = AFa1uSDK.this;
                AFd1mSDK aFd1mSDKEquals = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK3}, 389316487, -389316474, System.identityHashCode(aFa1uSDK3))).equals();
                if (aFd1mSDKEquals.areAllFieldsValid()) {
                    aFd1mSDKEquals.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1mSDKEquals.q_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1mSDKEquals.getRevenue();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1uSDK aFa1uSDK4 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).copy().getMediationNetwork();
                AFa1uSDK aFa1uSDK5 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK5}, 389316487, -389316474, System.identityHashCode(aFa1uSDK5))).afErrorLogForExcManagerOnly().getMediationNetwork();
                AFa1uSDK aFa1uSDK6 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK6}, 389316487, -389316474, System.identityHashCode(aFa1uSDK6))).AFAdRevenueData().AFAdRevenueData();
                AFa1uSDK aFa1uSDK7 = AFa1uSDK.this;
                AFh1qSDK aFh1qSDKAfLogForce = ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK7}, 389316487, -389316474, System.identityHashCode(aFa1uSDK7))).afLogForce();
                if (aFh1qSDKAfLogForce != null) {
                    aFh1qSDKAfLogForce.getCurrencyIso4217Code();
                }
            }

            @Override // com.appsflyer.internal.AFb1aSDK.AFa1ySDK
            public final void getMonetizationNetwork(@NonNull AFh1rSDK aFh1rSDK) throws UnsupportedEncodingException {
                Intent intent;
                aFh1tSDKComponent3.getMonetizationNetwork();
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                AFc1bSDK aFc1bSDK = (AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK));
                aFc1bSDK.component1().getRevenue(AFa1uSDK.this.AFAdRevenueData());
                AFa1uSDK.this.component4();
                int mediationNetwork = aFc1bSDK.getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (mediationNetwork < 2) {
                    AFa1uSDK aFa1uSDK2 = AFa1uSDK.this;
                    ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK2}, 389316487, -389316474, System.identityHashCode(aFa1uSDK2))).copy().getMonetizationNetwork();
                }
                AFh1eSDK aFh1eSDK = new AFh1eSDK();
                AFa1uSDK aFa1uSDK3 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK3}, 389316487, -389316474, System.identityHashCode(aFa1uSDK3))).i().f_(AFa1gSDK.AFAdRevenueData(aFh1eSDK), aFh1rSDK.getMediationNetwork, aFc1bSDK.registerClient().getRevenue);
                AFh1qSDK aFh1qSDKAfLogForce = aFc1bSDK.afLogForce();
                if (aFh1qSDKAfLogForce != null && (intent = aFh1rSDK.getMediationNetwork) != null) {
                    AFa1uSDK aFa1uSDK4 = AFa1uSDK.this;
                    aFh1qSDKAfLogForce.u_(intent, ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK4}, 389316487, -389316474, System.identityHashCode(aFa1uSDK4))).i());
                }
                AFa1uSDK aFa1uSDK5 = AFa1uSDK.this;
                aFh1eSDK.getMonetizationNetwork = appsFlyerRequestListener;
                aFa1uSDK5.getMediationNetwork(aFh1eSDK, aFh1rSDK);
                AFa1uSDK aFa1uSDK6 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK6}, 389316487, -389316474, System.identityHashCode(aFa1uSDK6))).AFAdRevenueData().AFAdRevenueData();
                AFa1uSDK aFa1uSDK7 = AFa1uSDK.this;
                ((AFc1bSDK) AFa1uSDK.getRevenue(new Object[]{aFa1uSDK7}, 389316487, -389316474, System.identityHashCode(aFa1uSDK7))).AFAdRevenueData().getRevenue.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
            }
        });
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        getRevenue(new Object[]{this, deepLinkListener}, 1831672072, -1831672058, System.identityHashCode(this));
    }

    private boolean areAllFieldsValid() {
        f15590d = (AFKeystoreWrapper + 19) % 128;
        if (this.component4 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.component4;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String mediationNetwork = getMediationNetwork(simpleDateFormat, this.component4);
            String mediationNetwork2 = getMediationNetwork(simpleDateFormat, this.getMonetizationNetwork);
            if (jCurrentTimeMillis < this.component2 && !isStopped()) {
                int i10 = AFKeystoreWrapper + 121;
                f15590d = i10 % 128;
                if (i10 % 2 != 0) {
                    AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.component2)));
                    return true;
                }
                Object[] objArr = new Object[4];
                objArr[1] = mediationNetwork;
                objArr[1] = mediationNetwork2;
                objArr[4] = Long.valueOf(jCurrentTimeMillis);
                objArr[2] = Long.valueOf(this.component2);
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr));
                return false;
            }
            if (!isStopped()) {
                AFKeystoreWrapper = (f15590d + 97) % 128;
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis)));
            }
        } else if (!isStopped()) {
            int i11 = AFKeystoreWrapper + 77;
            f15590d = i11 % 128;
            if (i11 % 2 != 0) {
                AFLogger.afInfoLog("Sending first launch for this session!");
            } else {
                AFLogger.afInfoLog("Sending first launch for this session!");
                throw null;
            }
        }
        return false;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFj1kSDK aFj1kSDK = new AFj1kSDK((Intent) objArr[2]);
        if (aFj1kSDK.getCurrencyIso4217Code("appsflyer_preinstall") != null) {
            int i10 = AFKeystoreWrapper + 53;
            f15590d = i10 % 128;
            if (i10 % 2 == 0) {
                getRevenue(new Object[]{aFj1kSDK.getCurrencyIso4217Code("appsflyer_preinstall")}, 698517988, -698517984, (int) System.currentTimeMillis());
                throw null;
            }
            getRevenue(new Object[]{aFj1kSDK.getCurrencyIso4217Code("appsflyer_preinstall")}, 698517988, -698517984, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String currencyIso4217Code = aFj1kSDK.getCurrencyIso4217Code(Constants.REFERRER);
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(currencyIso4217Code)));
        if (currencyIso4217Code != null) {
            f15590d = (AFKeystoreWrapper + 87) % 128;
            ((AFc1oSDK) getRevenue(new Object[]{aFa1uSDK, context}, -1595266545, 1595266567, System.identityHashCode(aFa1uSDK))).AFAdRevenueData(Constants.REFERRER, currencyIso4217Code);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", currencyIso4217Code);
            appsFlyerProperties.AFAdRevenueData = currencyIso4217Code;
            if (AppsFlyerProperties.getInstance().AFAdRevenueData()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                aFa1uSDK.getMediationNetwork(context, AFh1xSDK.onReceive);
                aFa1uSDK.getRevenue(currencyIso4217Code);
                AFKeystoreWrapper = (f15590d + 55) % 128;
            }
        }
        int i11 = f15590d + 35;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 83 / 0;
        }
        return null;
    }

    private static void component2(Context context) {
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                f15590d = (AFKeystoreWrapper + 73) % 128;
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFKeystoreWrapper = (f15590d + 95) % 128;
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32 && (!listAsList.contains("com.google.android.gms.permission.AD_ID"))) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                f15590d = (AFKeystoreWrapper + 33) % 128;
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x000d, B:24:0x003b, B:16:0x001e, B:18:0x0028, B:19:0x0030, B:23:0x003a, B:11:0x0017, B:14:0x001a, B:7:0x0011, B:21:0x0038), top: B:31:0x0001, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized com.appsflyer.internal.AFf1nSDK AFAdRevenueData() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 83
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r1     // Catch: java.lang.Throwable -> L18
            int r0 = r0 % 2
            if (r0 != 0) goto L1a
            com.appsflyer.internal.AFf1nSDK r0 = r3.equals     // Catch: java.lang.Throwable -> L18
            r2 = 14
            int r2 = r2 / 0
            if (r0 != 0) goto L3b
            goto L1e
        L16:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = move-exception
            goto L3f
        L1a:
            com.appsflyer.internal.AFf1nSDK r0 = r3.equals     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L3b
        L1e:
            int r1 = r1 + 123
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r0     // Catch: java.lang.Throwable -> L18
            int r1 = r1 % 2
            if (r1 != 0) goto L30
            com.appsflyer.internal.b r0 = new com.appsflyer.internal.b     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            r3.equals = r0     // Catch: java.lang.Throwable -> L18
            goto L3b
        L30:
            com.appsflyer.internal.b r0 = new com.appsflyer.internal.b     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            r3.equals = r0     // Catch: java.lang.Throwable -> L18
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L18
        L3b:
            com.appsflyer.internal.AFf1nSDK r0 = r3.equals     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return r0
        L3f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.AFAdRevenueData():com.appsflyer.internal.AFf1nSDK");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1nSDK aFe1nSDKCopydefault = this.hashCode.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFf1zSDK(this.hashCode, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i10 = f15590d + 119;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[LOOP:4: B:22:0x0071->B:42:0x00dd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void AFAdRevenueData(org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.AFAdRevenueData(org.json.JSONObject):void");
    }

    private void getMonetizationNetwork(AFi1jSDK aFi1jSDK) {
        AFf1ySDK aFf1ySDK = new AFf1ySDK(aFi1jSDK, getCurrencyIso4217Code().getCurrencyIso4217Code(), getCurrencyIso4217Code(), getCurrencyIso4217Code().component4(), getCurrencyIso4217Code().registerClient());
        AFe1nSDK aFe1nSDKCopydefault = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFf1ySDK));
        f15590d = (AFKeystoreWrapper + 1) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(AFc1bSDK aFc1bSDK) {
        int i10 = f15590d + 49;
        AFKeystoreWrapper = i10 % 128;
        int i11 = i10 % 2;
        aFc1bSDK.AFInAppEventType().getMonetizationNetwork();
        if (i11 != 0) {
            int i12 = 22 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        getRevenue(new Object[]{this, context, str, map}, -1613836572, 1613836582, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(boolean z10) {
        int i10 = AFKeystoreWrapper;
        f15590d = (i10 + 113) % 128;
        if (!z10) {
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getMonetizationNetwork();
        } else {
            f15590d = (i10 + 99) % 128;
            ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).afErrorLog().getCurrencyIso4217Code();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1jSDK aFi1jSDK) {
        int i10 = f15590d + 57;
        AFKeystoreWrapper = i10 % 128;
        int i11 = i10 % 2;
        getMonetizationNetwork(aFi1jSDK);
        if (i11 != 0) {
            throw null;
        }
    }

    @Deprecated
    public static Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        Map<String, Object> map2;
        AFKeystoreWrapper = (f15590d + 27) % 128;
        if (map.containsKey(Constants.REFERRER_API_META)) {
            f15590d = (AFKeystoreWrapper + 109) % 128;
            map2 = (Map) map.get(Constants.REFERRER_API_META);
        } else {
            HashMap map3 = new HashMap();
            map.put(Constants.REFERRER_API_META, map3);
            map2 = map3;
        }
        int i10 = AFKeystoreWrapper + 7;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
        }
        return map2;
    }

    public static String getMediationNetwork() {
        AFKeystoreWrapper = (f15590d + 63) % 128;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        int i10 = AFKeystoreWrapper + 85;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 76 / 0;
        }
        return currencyIso4217Code;
    }

    private void getMediationNetwork(Context context, AFh1xSDK aFh1xSDK) {
        AFKeystoreWrapper = (f15590d + 29) % 128;
        getMediationNetwork(context);
        AFh1tSDK aFh1tSDKComponent3 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component3();
        AFh1uSDK revenue = AFh1uSDK.getRevenue(context);
        if (aFh1tSDKComponent3.getCurrencyIso4217Code()) {
            int i10 = f15590d + 125;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 != 0) {
                aFh1tSDKComponent3.getMonetizationNetwork.put("api_name", aFh1xSDK.toString());
                aFh1tSDKComponent3.getRevenue(revenue);
                int i11 = 2 / 0;
            } else {
                aFh1tSDKComponent3.getMonetizationNetwork.put("api_name", aFh1xSDK.toString());
                aFh1tSDKComponent3.getRevenue(revenue);
            }
        }
        aFh1tSDKComponent3.getMonetizationNetwork();
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (new JSONObject(str).has("pid")) {
                int i10 = AFKeystoreWrapper + 45;
                f15590d = i10 % 128;
                if (i10 % 2 != 0) {
                    getCurrencyIso4217Code("preInstallName", str);
                    AFKeystoreWrapper = (f15590d + 43) % 128;
                    return null;
                }
                getCurrencyIso4217Code("preInstallName", str);
                throw null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            f15590d = (AFKeystoreWrapper + 113) % 128;
            return null;
        } catch (JSONException e10) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e10);
            return null;
        }
    }

    private static boolean AFAdRevenueData(String str) {
        int i10 = AFKeystoreWrapper + 63;
        f15590d = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        AFKeystoreWrapper = (f15590d + 87) % 128;
        return z10;
    }

    @Nullable
    private AFh1rSDK AFAdRevenueData(Context context) {
        f15590d = (AFKeystoreWrapper + 87) % 128;
        if (!(context instanceof Activity)) {
            return null;
        }
        AFh1rSDK aFh1rSDK = new AFh1rSDK((Activity) context, getCurrencyIso4217Code().d());
        int i10 = AFKeystoreWrapper + 67;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            return aFh1rSDK;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: Exception -> 0x0075, TryCatch #1 {Exception -> 0x0075, blocks: (B:16:0x0056, B:18:0x006f, B:27:0x0091, B:29:0x0099, B:30:0x009e, B:32:0x00ba, B:34:0x00c2, B:25:0x0077), top: B:41:0x0054 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object getCurrencyIso4217Code(java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.getCurrencyIso4217Code(java.lang.Object[]):java.lang.Object");
    }

    @VisibleForTesting
    final void getMediationNetwork(@NonNull AFh1jSDK aFh1jSDK, @Nullable AFh1rSDK aFh1rSDK) throws UnsupportedEncodingException {
        AppsFlyerRequestListener appsFlyerRequestListener;
        AFAdRevenueData(aFh1jSDK, aFh1rSDK);
        if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork() == null) {
            int i10 = AFKeystoreWrapper + 117;
            f15590d = i10 % 128;
            if (i10 % 2 == 0) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                appsFlyerRequestListener = aFh1jSDK.getMonetizationNetwork;
                int i11 = 1 / 0;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            } else {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                appsFlyerRequestListener = aFh1jSDK.getMonetizationNetwork;
                if (appsFlyerRequestListener == null) {
                    return;
                }
            }
            appsFlyerRequestListener.onError(41, "No dev key");
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component2());
        if (referrer == null) {
            int i12 = f15590d + 117;
            AFKeystoreWrapper = i12 % 128;
            if (i12 % 2 == 0) {
                referrer = "";
            } else {
                throw null;
            }
        }
        aFh1jSDK.areAllFieldsValid = referrer;
        getMonetizationNetwork(aFh1jSDK);
    }

    @NonNull
    private AFj1qSDK[] component1() {
        return (AFj1qSDK[]) getRevenue(new Object[]{this}, -187960988, 187961006, System.identityHashCode(this));
    }

    public static int getMonetizationNetwork(AFc1oSDK aFc1oSDK, boolean z10) {
        int i10 = f15590d + 95;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AFAdRevenueData(aFc1oSDK, "appsFlyerCount", z10);
            throw null;
        }
        int iAFAdRevenueData = AFAdRevenueData(aFc1oSDK, "appsFlyerCount", z10);
        AFKeystoreWrapper = (f15590d + 97) % 128;
        return iAFAdRevenueData;
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.component4 = str;
        aFh1hSDK.AFAdRevenueData = map;
        getMediationNetwork(aFh1hSDK, AFAdRevenueData(context));
        int i10 = f15590d + 7;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 38 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (areAllFieldsValid() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (areAllFieldsValid() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r5 = r5.getMonetizationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1uSDK.f15590d + 7) % 128;
        r5.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getMonetizationNetwork(com.appsflyer.internal.AFh1jSDK r5) throws java.io.UnsupportedEncodingException {
        /*
            r4 = this;
            java.lang.String r0 = r5.component4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            int r0 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r0 = r0 + 25
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r0
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r3 = r4.getRevenue()
            if (r3 == 0) goto L2d
            int r5 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r5 = r5 + 107
            int r0 = r5 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r0
            int r5 = r5 % 2
            java.lang.String r0 = "CustomerUserId not set, reporting is disabled"
            if (r5 != 0) goto L29
            com.appsflyer.AFLogger.afInfoLog(r0, r1)
            return
        L29:
            com.appsflyer.AFLogger.afInfoLog(r0, r2)
            return
        L2d:
            if (r0 == 0) goto L76
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r3 = "launchProtectEnabled"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L6b
            int r0 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r0 = r0 + 105
            int r2 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L51
            boolean r0 = r4.areAllFieldsValid()
            r2 = 53
            int r2 = r2 / r1
            if (r0 != 0) goto L57
            goto L70
        L51:
            boolean r0 = r4.areAllFieldsValid()
            if (r0 == 0) goto L70
        L57:
            com.appsflyer.attribution.AppsFlyerRequestListener r5 = r5.getMonetizationNetwork
            if (r5 == 0) goto L6a
            int r0 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r0 = r0 + 7
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r0
            r0 = 10
            java.lang.String r1 = "Event timeout. Check 'minTimeBetweenSessions' param"
            r5.onError(r0, r1)
        L6a:
            return
        L6b:
            java.lang.String r0 = "Allowing multiple launches within a 5 second time window."
            com.appsflyer.AFLogger.afInfoLog(r0)
        L70:
            long r0 = java.lang.System.currentTimeMillis()
            r4.component4 = r0
        L76:
            r4.getCurrencyIso4217Code(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.getMonetizationNetwork(com.appsflyer.internal.AFh1jSDK):void");
    }

    private static void AFAdRevenueData(@NonNull AFh1jSDK aFh1jSDK, @Nullable AFh1rSDK aFh1rSDK) {
        int i10 = f15590d + 89;
        int i11 = i10 % 128;
        AFKeystoreWrapper = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (aFh1rSDK != null) {
            aFh1jSDK.getMediationNetwork = aFh1rSDK.AFAdRevenueData;
            aFh1jSDK.component2 = aFh1rSDK.getMonetizationNetwork;
            f15590d = (i11 + 95) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r0
  0x001b: PHI (r0v4 int) = (r0v3 int), (r0v7 int) binds: [B:8:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int AFAdRevenueData(com.appsflyer.internal.AFc1oSDK r3, java.lang.String r4, boolean r5) {
        /*
            int r0 = com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.f15590d = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L15
            int r0 = r3.getMediationNetwork(r4, r1)
            if (r5 == 0) goto L1f
            goto L1b
        L15:
            int r0 = r3.getMediationNetwork(r4, r2)
            if (r5 == 0) goto L1f
        L1b:
            int r0 = r0 + r1
            r3.getRevenue(r4, r0)
        L1f:
            int r3 = com.appsflyer.internal.AFa1uSDK.f15590d
            int r3 = r3 + 99
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1uSDK.AFKeystoreWrapper = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L2e
            r3 = 63
            int r3 = r3 / r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.AFAdRevenueData(com.appsflyer.internal.AFc1oSDK, java.lang.String, boolean):int");
    }

    public static String getMediationNetwork(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j10));
        f15590d = (AFKeystoreWrapper + 35) % 128;
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        int i10 = f15590d + 11;
        AFKeystoreWrapper = i10 % 128;
        int i11 = i10 % 2;
        getCurrencyIso4217Code(aFh1jSDK);
        if (i11 != 0) {
            throw null;
        }
    }

    private static void getMonetizationNetwork(String str) {
        getRevenue(new Object[]{str}, 698517988, -698517984, (int) System.currentTimeMillis());
    }

    public final boolean getRevenue() {
        AFKeystoreWrapper = (f15590d + 27) % 128;
        if (!AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) || getMediationNetwork() != null) {
            return false;
        }
        int i10 = f15590d + 49;
        AFKeystoreWrapper = i10 % 128;
        return i10 % 2 == 0;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i10 = f15590d + 11;
        AFKeystoreWrapper = i10 % 128;
        Object[] objArr2 = new Object[1];
        if (i10 % 2 == 0) {
            objArr2[0] = aFa1uSDK;
            return ((AFc1bSDK) getRevenue(objArr2, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFInAppEventParameterName().getMonetizationNetwork();
        }
        objArr2[0] = aFa1uSDK;
        String monetizationNetwork = ((AFc1bSDK) getRevenue(objArr2, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).AFInAppEventParameterName().getMonetizationNetwork();
        int i11 = 26 / 0;
        return monetizationNetwork;
    }

    private static int getMediationNetwork(AFc1oSDK aFc1oSDK, boolean z10) {
        int i10 = AFKeystoreWrapper + 15;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            return AFAdRevenueData(aFc1oSDK, "appsFlyerInAppEventCount", z10);
        }
        AFAdRevenueData(aFc1oSDK, "appsFlyerInAppEventCount", z10);
        throw null;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            AFKeystoreWrapper = (f15590d + 13) % 128;
            return;
        }
        this.getMediationNetwork = appsFlyerConversionListener;
        int i10 = f15590d + 109;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 20 / 0;
        }
    }

    private static void getMediationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb2 = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb2.append(str);
        sb2.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb2.toString());
        int i10 = AFKeystoreWrapper + 3;
        f15590d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @VisibleForTesting
    private void getRevenue(Context context, String str) throws UnsupportedEncodingException {
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        getMediationNetwork(context);
        aFh1eSDK.component4 = null;
        aFh1eSDK.AFAdRevenueData = null;
        aFh1eSDK.areAllFieldsValid = str;
        aFh1eSDK.getMediationNetwork = null;
        getMonetizationNetwork(aFh1eSDK);
        f15590d = (AFKeystoreWrapper + 5) % 128;
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        Intent intent;
        String string = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            AFKeystoreWrapper = (f15590d + 123) % 128;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i10 = AFKeystoreWrapper + 125;
                    f15590d = i10 % 128;
                    if (i10 % 2 == 0) {
                        string = extras.getString(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT);
                        int i11 = 53 / 0;
                        if (string != null) {
                            AFKeystoreWrapper = (f15590d + 11) % 128;
                            AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                            extras.remove(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT);
                            activity.setIntent(intent.putExtras(extras));
                            AFKeystoreWrapper = (f15590d + 69) % 128;
                        }
                    } else {
                        string = extras.getString(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT);
                        if (string != null) {
                            AFKeystoreWrapper = (f15590d + 11) % 128;
                            AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                            extras.remove(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT);
                            activity.setIntent(intent.putExtras(extras));
                            AFKeystoreWrapper = (f15590d + 69) % 128;
                        }
                    }
                }
                return string;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th2.getMessage(), th2);
            }
        }
        return string;
    }

    private void getRevenue(String str) {
        final AFh1jSDK monetizationNetwork = new AFh1lSDK().getMonetizationNetwork(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0));
        monetizationNetwork.areAllFieldsValid = str;
        if (str != null) {
            int i10 = f15590d + 39;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 == 0 ? str.length() > 5 : str.length() > 2) {
                int i11 = f15590d + 35;
                AFKeystoreWrapper = i11 % 128;
                if (i11 % 2 != 0) {
                    ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFLogger().AFAdRevenueData(monetizationNetwork);
                    throw null;
                }
                if (((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFLogger().AFAdRevenueData(monetizationNetwork)) {
                    AFj1aSDK.AFAdRevenueData(((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getMonetizationNetwork(), new Runnable() { // from class: com.appsflyer.internal.c
                        @Override // java.lang.Runnable
                        public final void run() throws UnsupportedEncodingException {
                            this.f15617b.getMediationNetwork(monetizationNetwork);
                        }
                    }, 5L, TimeUnit.MILLISECONDS);
                }
            }
        }
        f15590d = (AFKeystoreWrapper + 111) % 128;
    }

    @Nullable
    @VisibleForTesting
    private String getCurrencyIso4217Code(Context context, String str) {
        f15590d = (AFKeystoreWrapper + 117) % 128;
        if (context == null) {
            return null;
        }
        getMediationNetwork(context);
        String monetizationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).getCurrencyIso4217Code().getMonetizationNetwork(str);
        f15590d = (AFKeystoreWrapper + 33) % 128;
        return monetizationNetwork;
    }

    public static String getCurrencyIso4217Code(AFc1oSDK aFc1oSDK, String str) {
        String monetizationNetwork = aFc1oSDK.getMonetizationNetwork("CACHED_CHANNEL", null);
        if (monetizationNetwork != null) {
            int i10 = f15590d;
            int i11 = i10 + 99;
            AFKeystoreWrapper = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 83 / 0;
            }
            int i13 = i10 + 111;
            AFKeystoreWrapper = i13 % 128;
            if (i13 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        aFc1oSDK.AFAdRevenueData("CACHED_CHANNEL", str);
        int i14 = f15590d + 77;
        AFKeystoreWrapper = i14 % 128;
        if (i14 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @NonNull
    @WorkerThread
    final Map<String, Object> getRevenue(AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        int i10;
        Context context = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).registerClient().getRevenue;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this));
        AFg1rSDK aFg1rSDKComponent4 = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).component4();
        boolean monetizationNetwork = ((AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork();
        boolean mediationNetwork = aFh1jSDK.getMediationNetwork();
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a(null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (monetizationNetwork) {
                f15590d = (AFKeystoreWrapper + 29) % 128;
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                i10 = AFKeystoreWrapper + 123;
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                sb2.append(mediationNetwork ? LogConstants.EVENT_LAUNCH_URL : aFh1jSDK.component4);
                aFLogger.i(aFg1cSDK, sb2.toString(), true);
                i10 = AFKeystoreWrapper + 57;
            }
            f15590d = i10 % 128;
            component2(context);
            int monetizationNetwork2 = getMonetizationNetwork(aFc1oSDK, mediationNetwork);
            int mediationNetwork2 = getMediationNetwork(aFc1oSDK, aFh1jSDK.component4 != null);
            if (mediationNetwork && monetizationNetwork2 == 1) {
                AppsFlyerProperties.getInstance().getRevenue = true;
            }
            aFg1rSDKComponent4.getCurrencyIso4217Code(map, monetizationNetwork2, mediationNetwork2);
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th2, true, true, true);
        }
        f15590d = (AFKeystoreWrapper + 115) % 128;
        return map;
    }

    public final AFc1oSDK getCurrencyIso4217Code(Context context) {
        return (AFc1oSDK) getRevenue(new Object[]{this, context}, -1595266545, 1595266567, System.identityHashCode(this));
    }

    public final AFc1bSDK getCurrencyIso4217Code() {
        return (AFc1bSDK) getRevenue(new Object[]{this}, 389316487, -389316474, System.identityHashCode(this));
    }

    public static boolean getRevenue(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i10 = AFKeystoreWrapper + 71;
                f15590d = i10 % 128;
                if (i10 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i11 = f15590d + 107;
            AFKeystoreWrapper = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 15 / 0;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e10);
            return false;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        PluginInfo pluginInfo = (PluginInfo) objArr[1];
        int i10 = AFKeystoreWrapper + 79;
        f15590d = i10 % 128;
        if (i10 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).e().getMediationNetwork(pluginInfo);
            return null;
        }
        Objects.requireNonNull(pluginInfo);
        ((AFc1bSDK) getRevenue(new Object[]{aFa1uSDK}, 389316487, -389316474, System.identityHashCode(aFa1uSDK))).e().getMediationNetwork(pluginInfo);
        throw null;
    }

    private void getRevenue(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1290570600, -1290570599, System.identityHashCode(this));
    }

    private static void getRevenue(String str, boolean z10) {
        getRevenue(new Object[]{str, Boolean.valueOf(z10)}, -222394073, 222394090, (int) System.currentTimeMillis());
    }
}
