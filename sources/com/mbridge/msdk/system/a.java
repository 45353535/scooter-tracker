package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.DeveloperTransferIdInfo;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements MBridgeSDK {
    protected static final String LOG_TAG = "com.mbridge.msdk";
    public static Map<String, Object> componentParams = new HashMap();
    public static Map<String, String> map;
    private com.mbridge.msdk.system.b mBridgeSDKImplDiff;
    protected volatile Context mContext;
    protected SDKInitStatusListener mStatusListener;
    protected volatile AtomicBoolean sdkInited;
    public boolean isCoolStart = true;
    protected volatile MBridgeSDK.PLUGIN_LOAD_STATUS STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;
    protected boolean initCallbacked = false;
    protected boolean isRegisteredLifeCycle = false;
    protected volatile boolean isMIMinited = false;
    protected volatile boolean isInitStarted = false;
    private final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new C0576a();

    /* JADX INFO: renamed from: com.mbridge.msdk.system.a$a, reason: collision with other inner class name */
    class C0576a implements Application.ActivityLifecycleCallbacks {
        C0576a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            if (a.this.isMIMinited) {
                MIMManager.b().f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            if (a.this.isMIMinited) {
                MIMManager.b().g();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            q0.b("com.mbridge.msdk", "onActivityPaused currentActivityNum:" + com.mbridge.msdk.foundation.controller.c.n().g());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            int iG = com.mbridge.msdk.foundation.controller.c.n().g();
            q0.b("com.mbridge.msdk", "onActivityStarted currentActivityNum:" + iG);
            q0.b("com.mbridge.msdk", "onActivityStarted isCoolStart:" + a.this.isCoolStart);
            if (!a.this.isCoolStart && iG == 0) {
                j.a("1");
            }
            if (a.this.mBridgeSDKImplDiff != null) {
                com.mbridge.msdk.system.b bVar = a.this.mBridgeSDKImplDiff;
                a aVar = a.this;
                bVar.a(activity, iG, aVar.isCoolStart, aVar.mContext);
            }
            a.this.isCoolStart = false;
            com.mbridge.msdk.foundation.controller.c.n().a(iG + 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            int iG = com.mbridge.msdk.foundation.controller.c.n().g();
            q0.b("com.mbridge.msdk", "onActivityStopped currentActivityNum:" + iG);
            if (iG == 1 || iG == 0) {
                j.a("2");
            }
            com.mbridge.msdk.foundation.controller.c.n().a(iG - 1);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f51030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f51031b;

        b(boolean z10, String str) {
            this.f51030a = z10;
            this.f51031b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKInitStatusListener sDKInitStatusListener = a.this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (this.f51030a) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(this.f51031b);
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z10, long j10) {
        String str;
        a aVar2;
        long j11;
        boolean z11;
        aVar.getClass();
        try {
            com.mbridge.msdk.foundation.controller.c.n().b(aVar.mContext);
            aVar.setDefaultComponentValue();
            Map<String, Object> mapA = com.mbridge.msdk.config.manager.a.b().a(String.valueOf(componentParams.get("app_id")));
            if (mapA != null && !mapA.isEmpty()) {
                Object obj = mapA.get("new_pipeline_id");
                if (obj == null) {
                    com.mbridge.msdk.config.manager.a.b().a(false);
                    return;
                }
                String strValueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(strValueOf)) {
                    com.mbridge.msdk.config.manager.a.b().a(false);
                    return;
                }
                try {
                    boolean z12 = true;
                    if (Integer.parseInt(strValueOf) < 1) {
                        com.mbridge.msdk.config.manager.a.b().a(false);
                        return;
                    }
                    Object obj2 = mapA.get("new_pipeline_config");
                    if (obj2 == null) {
                        com.mbridge.msdk.config.manager.a.b().a(false);
                        return;
                    }
                    if (obj2 instanceof String) {
                        String strValueOf2 = String.valueOf(obj2);
                        if (TextUtils.isEmpty(strValueOf2) || strValueOf2.equalsIgnoreCase("null")) {
                            com.mbridge.msdk.config.manager.a.b().a(false);
                            return;
                        }
                    }
                    com.mbridge.msdk.config.manager.a.b().a(true);
                    com.mbridge.msdk.config.manager.a.b().a(obj2);
                    componentParams.put("app_setting", mapA);
                    v0.f();
                    com.mbridge.msdk.config.component.common.util.a aVar3 = new com.mbridge.msdk.config.component.common.util.a();
                    g5.a aVar4 = new g5.a(aVar3);
                    HashMap map2 = new HashMap();
                    map2.put("callback", aVar4);
                    componentParams.put("sdk_context", map2);
                    componentParams.put(AppsFlyerProperties.CHANNEL, Aa.a());
                    aVar.sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "sdk_init");
                    Map map3 = (Map) aVar3.a(2000L);
                    if (map3 != null) {
                        Object obj3 = map3.get("init_status");
                        int iIntValue = obj3 instanceof Integer ? ((Integer) obj3).intValue() : 1;
                        Object obj4 = map3.get("reason");
                        String strValueOf3 = obj4 instanceof String ? String.valueOf(obj4) : "";
                        if (aVar.initCallbacked) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                        if (iIntValue != 1) {
                            z12 = false;
                        }
                        if (TextUtils.isEmpty(strValueOf3)) {
                            str = "";
                            aVar2 = aVar;
                            z11 = z10;
                            j11 = jCurrentTimeMillis;
                        } else {
                            str = strValueOf3;
                            aVar2 = aVar;
                            j11 = jCurrentTimeMillis;
                            z11 = z10;
                        }
                        aVar2.callbackToDeveloper(z11, j11, z12, str);
                    }
                } catch (Throwable unused) {
                    com.mbridge.msdk.config.manager.a.b().a(false);
                }
            }
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void b(com.mbridge.msdk.system.a r9, boolean r10, long r11) {
        /*
            r9.getClass()
            java.lang.String r7 = "com.mbridge.msdk"
            r8 = 1
            android.content.Context r0 = r9.mContext     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.foundation.tools.t0.a(r0)     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.system.b r0 = new com.mbridge.msdk.system.b     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            r9.mBridgeSDKImplDiff = r0     // Catch: java.lang.Throwable -> L5b
            java.util.Map<java.lang.String, java.lang.String> r2 = com.mbridge.msdk.system.a.map     // Catch: java.lang.Throwable -> L5b
            r0.a(r2)     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.foundation.controller.d r0 = com.mbridge.msdk.foundation.controller.d.a()     // Catch: java.lang.Throwable -> L5b
            java.util.Map<java.lang.String, java.lang.String> r2 = com.mbridge.msdk.system.a.map     // Catch: java.lang.Throwable -> L5b
            android.content.Context r3 = r9.mContext     // Catch: java.lang.Throwable -> L5b
            r0.a(r2, r3)     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.MBridgeSDK$PLUGIN_LOAD_STATUS r0 = com.mbridge.msdk.MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED     // Catch: java.lang.Throwable -> L5b
            r9.STATUS = r0     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.system.b r0 = r9.mBridgeSDKImplDiff     // Catch: java.lang.Throwable -> L5b
            android.content.Context r2 = r9.mContext     // Catch: java.lang.Throwable -> L5b
            r0.a(r2)     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.foundation.same.report.f r0 = com.mbridge.msdk.foundation.same.report.f.a()     // Catch: java.lang.Throwable -> L5b
            r0.c()     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.foundation.tools.v0.f()     // Catch: java.lang.Throwable -> L5b
            r9.initMIMManager()     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.foundation.tools.g0 r0 = com.mbridge.msdk.foundation.tools.g0.a()     // Catch: java.lang.Throwable -> L5b
            r0.c()     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.sdkInited     // Catch: java.lang.Throwable -> L5b
            r0.set(r8)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r9.initCallbacked     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L5d
            r9.initCallbacked = r8     // Catch: java.lang.Throwable -> L5b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            long r2 = r2 - r11
            java.lang.String r6 = ""
            r5 = 1
            r1 = r9
            r3 = r2
            r2 = r10
            r1.callbackToDeveloper(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r0 = move-exception
            goto L84
        L5d:
            com.mbridge.msdk.foundation.same.report.e r0 = com.mbridge.msdk.foundation.same.report.e.c()     // Catch: java.lang.Throwable -> L65
            r0.b()     // Catch: java.lang.Throwable -> L65
            goto L6d
        L65:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.foundation.tools.q0.b(r7, r0)     // Catch: java.lang.Throwable -> L5b
        L6d:
            android.content.Context r0 = r9.mContext     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r0 instanceof android.app.Application     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto La0
            android.content.Context r0 = r9.mContext     // Catch: java.lang.Throwable -> L7b
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L7b
            r9.registerActivityLifecycleListener(r0)     // Catch: java.lang.Throwable -> L7b
            goto La0
        L7b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L5b
            com.mbridge.msdk.foundation.tools.q0.b(r7, r0)     // Catch: java.lang.Throwable -> L5b
            goto La0
        L84:
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.sdkInited
            r3 = 0
            r2.set(r3)
            boolean r2 = r9.initCallbacked
            if (r2 != 0) goto La0
            r9.initCallbacked = r8
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r11
            java.lang.String r6 = r0.getMessage()
            r5 = 0
            r1 = r9
            r3 = r2
            r2 = r10
            r1.callbackToDeveloper(r2, r3, r5, r6)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.system.a.b(com.mbridge.msdk.system.a, boolean, long):void");
    }

    private void callbackToDeveloper(boolean z10, long j10, boolean z11, String str) {
        this.isInitStarted = false;
        if (z10) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b(z11, str));
        } else {
            SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (z11) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(str);
                }
            }
        }
        j.a(z11, j10, str);
    }

    private void initMIMManager() {
        try {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.equals("Xiaomi")) {
                return;
            }
            this.isMIMinited = true;
            MIMManager.b().b(this.mContext.getApplicationContext());
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    private void sendApiCallEvent(String str, String str2) {
        if (this.mContext != null && com.mbridge.msdk.config.manager.a.b().c()) {
            com.mbridge.msdk.config.manager.a.b().a(str, str2, componentParams);
        }
    }

    private void setDefaultComponentValue() {
        if (!componentParams.containsKey("allow_acquire_id")) {
            componentParams.put("allow_acquire_id", 1);
        }
        if (!componentParams.containsKey("allow_transfer_ids_if_limit")) {
            componentParams.put("allow_transfer_ids_if_limit", 1);
        }
        if (!componentParams.containsKey("consent_status")) {
            componentParams.put("consent_status", 3);
        }
        if (!componentParams.containsKey("do_not_track")) {
            componentParams.put("do_not_track", 0);
        }
        if (componentParams.containsKey("coppa")) {
            return;
        }
        componentParams.put("coppa", 0);
    }

    private void unregisterActivityLifecycleListener(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        if (!this.isRegisteredLifeCycle || (activityLifecycleCallbacks = this.activityLifecycleCallbacks) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public void checkAliveContext(Context context) {
        if (com.mbridge.msdk.foundation.controller.c.n().d() != null || context == null) {
            return;
        }
        this.mContext = context.getApplicationContext();
        com.mbridge.msdk.foundation.controller.c.n().b(context);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public boolean getConsentStatus(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().b();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.STATUS;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preload(Map<String, Object> map2) {
        if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            com.mbridge.msdk.foundation.controller.d.a().a(map2, 0);
        }
        componentParams.put("preload", map2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "preload");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preloadFrame(Map<String, Object> map2) {
        com.mbridge.msdk.foundation.controller.d.a().a(map2, 1);
    }

    protected void registerActivityLifecycleListener(Application application) {
        try {
        } catch (Exception e10) {
            q0.b("com.mbridge.msdk", e10.getMessage());
        }
        boolean z10 = s0.a().b("c_r_a_l_c", 0) == 0;
        if (application == null || !z10) {
            return;
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.activityLifecycleCallbacks;
        if (activityLifecycleCallbacks != null) {
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        this.isRegisteredLifeCycle = true;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void release() {
        if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            com.mbridge.msdk.foundation.controller.d.a().f();
        }
        if (this.mContext instanceof Application) {
            unregisterActivityLifecycleListener((Application) this.mContext);
        }
        com.mbridge.msdk.system.b bVar = this.mBridgeSDKImplDiff;
        if (bVar != null) {
            bVar.a();
        }
        g0.a().e();
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "release");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowAcquireIds(boolean z10) {
        componentParams.put("allow_acquire_ids", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.a(z10);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "allow_acquire_ids");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowTransferIdsIfLimit(boolean z10) {
        componentParams.put("allow_transfer_ids_if_limit", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.b(z10);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "allow_transfer_ids_if_limit");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, int i10) {
        checkAliveContext(context);
        componentParams.put("consent_status", Integer.valueOf(i10 != 1 ? 2 : 1));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(i10);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "consent_status");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setCoppaStatus(Context context, boolean z10) {
        checkAliveContext(context);
        componentParams.put("coppa", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().b(z10 ? 1 : 2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "coppa_status");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDeveloperIds(DeveloperTransferIdInfo developerTransferIdInfo) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() || developerTransferIdInfo == null || TextUtils.isEmpty(developerTransferIdInfo.getGaid())) {
            return;
        }
        g.a(developerTransferIdInfo.getGaid());
        componentParams.put("developer_gaid", developerTransferIdInfo.getGaid());
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "developer_ids");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void setDoNotTrackStatus(boolean z10) {
        componentParams.put("do_not_track", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(z10 ? 1 : 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "do_not_track_status");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setPlayVideoMute(int i10, int i11) {
        HashMap map2 = new HashMap();
        if (i10 == 94) {
            com.mbridge.msdk.foundation.same.a.W = i11;
        } else if (i10 == 287) {
            com.mbridge.msdk.foundation.same.a.X = i11;
        }
        map2.put("ad_type", Integer.valueOf(i10));
        map2.put("mute_state", Integer.valueOf(i11));
        componentParams.put("player_video_mute", map2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "player_video_mute");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setThirdPartyFeatures(Map<String, Object> map2) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setUserPrivateInfoType(Context context, String str, int i10) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(str, i10);
        try {
            if (componentParams.containsKey("device_info_range_limit")) {
                Object obj = componentParams.get("device_info_range_limit");
                if (obj instanceof Map) {
                    ((Map) obj).put(str, Integer.valueOf(i10 == 1 ? 1 : 2));
                }
            } else {
                HashMap map2 = new HashMap();
                map2.put(str, Integer.valueOf(i10 == 1 ? 1 : 2));
                componentParams.put("device_info_range_limit", map2);
            }
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "device_info_range_limit");
        } catch (Throwable th2) {
            q0.b("com.mbridge.msdk", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
        com.mbridge.msdk.foundation.controller.c.n().a(weakReference);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public AuthorityInfoBean userPrivateInfo(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, boolean z10) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3) {
        HashMap map2 = new HashMap();
        map2.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        map2.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        map2.put(MBridgeConstans.ID_MBRIDGE_WX_APPID, str3);
        map2.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        componentParams.put("app_id", str);
        componentParams.put(MBridgeConstans.APP_KEY, str2);
        componentParams.put("wx_app_id", str3);
        componentParams.put("crash_report", String.valueOf(1));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "get_configuration_map");
        return map2;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDoNotTrackStatus(Context context, boolean z10) {
        checkAliveContext(context);
        componentParams.put("do_not_track", Integer.valueOf(z10 ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(z10 ? 1 : 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "do_not_track_status");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(context, (OnCompletionListener) null);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "consent_status");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, OnCompletionListener onCompletionListener) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(context, onCompletionListener);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "consent_status");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3, boolean z10) {
        return getMBConfigurationMap(str, str2, "");
    }

    private void init() {
        SDKInitStatusListener sDKInitStatusListener;
        SDKInitStatusListener sDKInitStatusListener2;
        if (this.sdkInited == null) {
            this.sdkInited = new AtomicBoolean(false);
        }
        this.initCallbacked = false;
        try {
            if (this.sdkInited.get() && (sDKInitStatusListener2 = this.mStatusListener) != null && !this.initCallbacked) {
                this.initCallbacked = true;
                sDKInitStatusListener2.onInitSuccess();
                return;
            }
        } catch (Exception e10) {
            q0.b("com.mbridge.msdk", e10.getMessage());
        }
        if (this.mContext == null && (sDKInitStatusListener = this.mStatusListener) != null) {
            this.initCallbacked = true;
            sDKInitStatusListener.onInitFail("Context can not be null.");
            return;
        }
        if (this.isInitStarted) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final boolean z10 = Looper.myLooper() == Looper.getMainLooper();
        this.isInitStarted = true;
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.system.c
                @Override // java.lang.Runnable
                public final void run() {
                    a.b(this.f51033b, z10, jCurrentTimeMillis);
                }
            };
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.system.d
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(this.f51036b, z10, jCurrentTimeMillis);
                }
            });
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnable);
        } catch (Exception e11) {
            q0.b("com.mbridge.msdk", "INIT FAIL", e11);
            if (this.sdkInited != null) {
                this.sdkInited.set(false);
            }
            if (this.initCallbacked) {
                return;
            }
            this.initCallbacked = true;
            callbackToDeveloper(z10, System.currentTimeMillis() - jCurrentTimeMillis, false, e11.getMessage());
        }
    }

    public void init(Application application) {
        this.mContext = application.getApplicationContext();
        init();
    }
}
