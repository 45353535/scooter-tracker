package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.config.m0;
import com.fyber.inneractive.sdk.config.p;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.ignite.l;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.o1;
import com.fyber.inneractive.sdk.util.s;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.y;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.b1;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class InneractiveAdManager implements r {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f20573e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Context f20574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20576c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20577d;

    public enum GdprConsentSource {
        Internal,
        External
    }

    public static void a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (d.f20606a.f20574a == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        w wVar = new w(t.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        if (!TextUtils.isEmpty(str)) {
            wVar.a(PglCryptUtils.KEY_MESSAGE, str);
        }
        wVar.a("init_status", fyberInitStatus.name());
        wVar.a((String) null);
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            gVar.a();
        } else {
            IAlog.f("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.O.A.f23923a = null;
    }

    public static void clearLgpdConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            gVar.b();
        } else {
            IAlog.f("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearUSPrivacyString() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            gVar.c();
        }
    }

    public static void currentAudienceAppliesToCoppa() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("currentAudienceAppliesToCoppa was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (o.f23888a == null) {
            IAlog.f("setCurrentAudienceAppliesToCoppa was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.f20361j = Boolean.TRUE;
        }
    }

    public static void currentAudienceIsAChild() {
        d.f20606a.f20576c = true;
    }

    public static void destroy() {
        l lVar;
        IAlog.a("InneractiveAdManager:destroy called", new Object[0]);
        if (d.f20606a.f20574a == null) {
            IAlog.a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        d.f20606a.f20574a = null;
        IAConfigManager.removeListener(f20573e);
        f20573e = null;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        iAConfigManager.A.f23923a = null;
        iAConfigManager.f20302h = false;
        try {
            com.fyber.inneractive.sdk.config.cellular.a aVar = iAConfigManager.N;
            if (aVar != null && aVar.f20327a != null) {
                aVar.f20329c.clear();
                aVar.f20327a.a((com.fyber.inneractive.sdk.config.cellular.h) aVar);
                aVar.f20327a.a();
            }
        } catch (Throwable th2) {
            IAlog.a("failed to destroy network watchdog", th2, new Object[0]);
        }
        com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager.E;
        if (!TextUtils.isEmpty(hVar.f21080l) && (lVar = hVar.f21084p) != null) {
            lVar.destroy();
            hVar.f21084p = null;
        }
        l0.f23879a.a();
        b0 b0Var = z.f23924a;
        synchronized (b0Var) {
            if (b0Var.f23855c != null) {
                IAlog.a("%sremoving screen state receiver and destroying singleton", IAlog.a(b0Var));
                try {
                    b0Var.f23855c.unregisterReceiver(b0Var.f23856d);
                } catch (Exception unused) {
                }
                b0Var.f23855c = null;
                b0Var.f23856d = null;
                b0Var.f23853a.clear();
            }
        }
        com.fyber.inneractive.sdk.factories.d.f20613a.f20614a.clear();
        com.fyber.inneractive.sdk.factories.b.f20611a.f20612a.clear();
        com.fyber.inneractive.sdk.factories.h.f20615a.f20616a.clear();
        InneractiveAdSpotManager.destroy();
        n.f23883a.clear();
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.f20172h;
        com.fyber.inneractive.sdk.bidder.f fVar = bVar.f20176d;
        if (fVar != null) {
            try {
                o.f23888a.unregisterReceiver(fVar);
            } catch (Exception unused2) {
            }
        }
        bVar.f20176d = null;
        com.fyber.inneractive.sdk.config.cellular.a aVar2 = IAConfigManager.O.N;
        if (aVar2 != null) {
            try {
                aVar2.f20329c.remove(bVar);
            } catch (Throwable th3) {
                IAlog.a("failed to remove network observer", th3, new Object[0]);
            }
        }
        com.fyber.inneractive.sdk.nativead.b.f21275f.a();
    }

    public static String getAppId() {
        return IAConfigManager.O.f20297c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return d.f20606a.f20575b;
    }

    public static Boolean getGdprConsent() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public static GdprConsentSource getGdprStatusSource() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            return gVar.f20357f;
        }
        IAlog.f("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.O.f20305k;
    }

    public static String getUserId() {
        return IAConfigManager.O.D.f20358g;
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.O.f20304j;
    }

    public static String getVersion() {
        return "8.4.1";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    public static boolean isCurrentUserAChild() {
        return d.f20606a.f20576c;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        d.f20606a.f20575b = str;
    }

    public static void setGdprConsent(boolean z10) {
        setGdprConsent(z10, GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f23888a == null) {
            IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f20355d = str;
        if (gVar.a("IAGdprConsentData", str)) {
            return;
        }
        IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.O.A.f23923a = onGlobalImpressionDataListener;
    }

    public static void setLgpdConsent(boolean z10) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f23888a == null) {
            IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f20360i = Boolean.valueOf(z10);
        if (gVar.a(z10, "IALgpdConsentStatus")) {
            return;
        }
        IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
    }

    public static void setLogLevel(int i10) {
        IAlog.f23840a = i10;
    }

    public static void setMediationName(String str) {
        IAConfigManager.O.f20306l = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.O.f20308n = str;
        }
    }

    public static void setMuteVideo(boolean z10) {
        IAConfigManager.O.f20305k = z10;
    }

    public static void setUSPrivacyString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f23888a == null) {
            IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f20359h = str;
        if (gVar.a("IACCPAConsentData", str)) {
            return;
        }
        IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
    }

    public static void setUseLocation(boolean z10) {
        IAConfigManager.O.getClass();
    }

    public static void setUserId(String str) {
        if (o.f23888a != null) {
            IAConfigManager.O.D.a(str);
        } else {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            IAlog.f("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.O.f20304j = inneractiveUserConfig;
        IAlog.a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z10) {
        IAConfigManager.O.f20311q = z10;
        IAlog.a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z10));
        if (s.a() || z10) {
            return;
        }
        IAlog.f("************************************************************************************************************************", new Object[0]);
        IAlog.f("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.f("***  The traffic will be Secured  ", new Object[0]);
        IAlog.f("************************************************************************************************************************", new Object[0]);
    }

    public static boolean wasInitialized() {
        return d.f20606a.f20574a != null;
    }

    public Context getAppContext() {
        return this.f20574a;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public void onGlobalConfigChanged(com.fyber.inneractive.sdk.config.s sVar, com.fyber.inneractive.sdk.config.o oVar) {
        if (oVar == null || !oVar.a(false, GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT)) {
            return;
        }
        com.fyber.inneractive.sdk.util.r.f23896b.post(new c());
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        String language;
        List<ResolveInfo> listQueryIntentServices;
        char c10;
        if (context == null || str == null) {
            IAlog.b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            a(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, (str == null ? "appid" : POBCoreNativeConstants.NATIVE_CONTEXT).concat(" is null"));
            return;
        }
        String str2 = IAConfigManager.O.f20297c;
        boolean z10 = (str2 == null || str2.equalsIgnoreCase(str)) ? false : true;
        String str3 = null;
        if (d.f20606a.f20574a != null && !z10) {
            IAlog.a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        IAlog.f23842c.retainAll(Collections.singleton(IAlog.f23841b));
        int i10 = k.f20410a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
        if (property != null) {
            for (String str4 : property.split(StringUtils.COMMA)) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(str4).newInstance();
                    fMPLogger.initialize(context);
                    IAlog.f23842c.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
        o.f23888a = (Application) context.getApplicationContext();
        b0 b0Var = z.f23924a;
        Context applicationContext = context.getApplicationContext();
        b0Var.getClass();
        IAlog.a("%sinit called", IAlog.a(b0Var));
        b0Var.f23855c = applicationContext;
        b0Var.f23856d = new y(b0Var);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b0Var.f23855c.registerReceiver(b0Var.f23856d, intentFilter);
        Intent intent = new Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(o.f23888a.getPackageName());
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        List<BroadcastReceiver> listAsList = Arrays.asList(new IAMraidKit(), new IAVideoKit(), new com.fyber.inneractive.sdk.dv.g(), new com.fyber.inneractive.sdk.nativead.e());
        for (BroadcastReceiver broadcastReceiver : listAsList) {
            try {
                broadcastReceiver.onReceive(applicationContext2, intent);
            } catch (Throwable unused2) {
                IAlog.f("%sCould not trigger receiver for %s", IAlog.a(com.fyber.inneractive.sdk.b.class), broadcastReceiver);
            }
        }
        if (com.fyber.inneractive.sdk.factories.d.f20613a.f20614a.size() == 0) {
            Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        if (listAsList.size() == 0) {
            IAlog.b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        a aVar = new a(context, onFyberMarketplaceInitializedListener);
        f20573e = aVar;
        IAConfigManager.addListener(aVar);
        if (z10) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.f20297c = str;
            HashMap map = iAConfigManager.f20295a;
            if (map != null) {
                map.clear();
            }
            HashMap map2 = iAConfigManager.f20296b;
            if (map2 != null) {
                map2.clear();
            }
            iAConfigManager.f20299e = null;
            iAConfigManager.f20298d = "";
            IAConfigManager.a();
        } else {
            Context applicationContext3 = context.getApplicationContext();
            IAConfigManager iAConfigManager2 = IAConfigManager.O;
            if (!iAConfigManager2.f20302h) {
                iAConfigManager2.f20316v = new i(context, applicationContext3);
                s1 s1Var = new s1();
                iAConfigManager2.f20319y = s1Var;
                s1Var.f23905c = applicationContext3.getApplicationContext();
                com.fyber.inneractive.sdk.util.r.f23895a.execute(new o1(s1Var));
                com.fyber.inneractive.sdk.network.l0 l0Var = iAConfigManager2.f20313s;
                if (!l0Var.f21336b) {
                    l0Var.f21336b = true;
                    for (int i11 = 0; i11 < 6; i11++) {
                        l0Var.f21338d.submit(l0Var.f21339e);
                    }
                }
                b1.f23931c.getClass();
                iAConfigManager2.D = new com.fyber.inneractive.sdk.config.g();
                com.fyber.inneractive.sdk.config.s sVar = new com.fyber.inneractive.sdk.config.s(applicationContext3);
                iAConfigManager2.f20315u = sVar;
                iAConfigManager2.f20317w = new com.fyber.inneractive.sdk.config.t(sVar);
                IAConfigManager.O.f20313s.a(new v0(new p(sVar), sVar.f20483a, sVar.f20487e));
                iAConfigManager2.I.a((Application) applicationContext3.getApplicationContext());
                iAConfigManager2.f20315u.f20485c.add(new x(iAConfigManager2));
                iAConfigManager2.f20320z = new com.fyber.inneractive.sdk.config.global.a();
                IAlog.a("Initializing config manager", new Object[0]);
                IAlog.a("Config manager: lib name = %s", "Android");
                IAlog.a("Config manager: app version = %s", "8.4.1");
                com.fyber.inneractive.sdk.config.w wVar = u.f20500a;
                if (wVar.f20507a == null) {
                    wVar.f20507a = applicationContext3;
                    new Thread(new m0(applicationContext3, wVar)).start();
                }
                if (!str.matches("[0-9]+")) {
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                    IAlog.b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                    IAlog.b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                }
                iAConfigManager2.f20300f = applicationContext3;
                iAConfigManager2.f20297c = str;
                iAConfigManager2.f20304j = new InneractiveUserConfig();
                iAConfigManager2.f20302h = true;
                x0 x0Var = iAConfigManager2.f20318x;
                x0Var.getClass();
                new com.fyber.inneractive.sdk.config.e(x0Var).a();
                x0Var.f20512c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                com.fyber.inneractive.sdk.cache.session.e eVar = new com.fyber.inneractive.sdk.cache.session.e();
                x0Var.f20510a = eVar;
                com.fyber.inneractive.sdk.cache.session.c cVar = new com.fyber.inneractive.sdk.cache.session.c(eVar);
                ThreadPoolExecutor threadPoolExecutor = com.fyber.inneractive.sdk.util.r.f23895a;
                threadPoolExecutor.execute(cVar);
                iAConfigManager2.B = new v0(new com.fyber.inneractive.sdk.config.b0(iAConfigManager2), iAConfigManager2.f20300f, new com.fyber.inneractive.sdk.config.f());
                threadPoolExecutor.execute(new d0(iAConfigManager2));
                try {
                    language = Locale.getDefault().getLanguage();
                    try {
                        IAlog.a("Available device language: %s", language);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    language = null;
                }
                iAConfigManager2.f20309o = language;
                com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager2.E;
                hVar.f21069a = applicationContext3;
                Intent intent2 = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
                Context context2 = hVar.f21069a;
                if (context2 != null && (listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent2, 0)) != null && listQueryIntentServices.size() > 0) {
                    str3 = listQueryIntentServices.get(0).serviceInfo.packageName;
                }
                hVar.f21080l = str3;
                com.fyber.inneractive.sdk.config.cellular.a aVar2 = new com.fyber.inneractive.sdk.config.cellular.a(iAConfigManager2.f20300f);
                iAConfigManager2.N = aVar2;
                com.fyber.inneractive.sdk.config.cellular.d dVar = aVar2.f20327a;
                if (dVar != null) {
                    try {
                        dVar.a(aVar2);
                    } catch (Throwable th2) {
                        IAlog.a("failed to register network detector", th2, new Object[0]);
                    }
                }
            }
        }
        d.f20606a.f20574a = context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        String string = sharedPreferences.getString("FyberExceptionKey", "empty");
        String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
        String string3 = sharedPreferences.getString("FyberNameKey", "empty");
        String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
        IAlog.a(" name- %s   description - %s exception - %s", string3, string2, string);
        if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
            IAlog.a("Firing Event 999 for %s", string);
            w wVar2 = new w(com.fyber.inneractive.sdk.network.u.IA_UNCAUGHT_EXCEPTION);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_name", string3);
                c10 = 1;
            } catch (Exception unused5) {
                c10 = 1;
                IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", string3);
            }
            try {
                jSONObject.put("description", string2);
            } catch (Exception unused6) {
                Object[] objArr = new Object[2];
                objArr[0] = "description";
                objArr[c10] = string2;
                IAlog.f("Got exception adding param to json object: %s, %s", objArr);
            }
            try {
                jSONObject.put("stack_trace", string);
            } catch (Exception unused7) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = "stack_trace";
                objArr2[c10] = string;
                IAlog.f("Got exception adding param to json object: %s, %s", objArr2);
            }
            wVar2.f21421f.put(jSONObject);
            wVar2.a(string4);
            sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
        }
        Thread.setDefaultUncaughtExceptionHandler(new b(sharedPreferences, Thread.getDefaultUncaughtExceptionHandler()));
        IAConfigManager iAConfigManager3 = IAConfigManager.O;
        iAConfigManager3.f20315u.f20485c.remove(d.f20606a);
        iAConfigManager3.f20315u.f20485c.add(d.f20606a);
    }

    public static void setGdprConsent(boolean z10, GdprConsentSource gdprConsentSource) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f23888a == null) {
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f20352a = Boolean.valueOf(z10);
        if (!gVar.a(z10, "IAGDPRBool")) {
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
        gVar.f20357f = gdprConsentSource;
        if (gVar.a("IAGdprSource", gdprConsentSource.name())) {
            return;
        }
        IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.f20307m = inneractiveMediationName;
            iAConfigManager.f20306l = inneractiveMediationName.getKey();
        }
    }
}
