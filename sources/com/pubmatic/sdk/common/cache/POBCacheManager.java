package com.pubmatic.sdk.common.cache;

import android.content.Context;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.POBCrashAnalysing;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBMultipleRequestsHandler;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.network.POBResponse;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBCacheManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f62273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final POBNetworkHandler f62274c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile String f62278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f62280i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f62285n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62272a = "POBCacheManager";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f62281j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f62282k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Queue f62283l = new ArrayDeque(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Queue f62284m = new ArrayDeque(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f62286o = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f62275d = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f62276e = DesugarCollections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f62277f = new AtomicReference(null);

    public interface ProfileResultListener {
        void onProfileResult(boolean z10);
    }

    public interface UserAgentListener {
        void onUserAgentReceived(@NonNull String str);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBCacheManager.this.f62278g != null) {
                return;
            }
            synchronized (POBCacheManager.this.f62282k) {
                POBCacheManager pOBCacheManager = POBCacheManager.this;
                pOBCacheManager.f62278g = POBUtils.readFromAssets(pOBCacheManager.f62273b, "pob_mraid.js");
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ UserAgentListener f62288a;

        b(UserAgentListener userAgentListener) {
            this.f62288a = userAgentListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (POBCacheManager.this.f62281j) {
                POBCacheManager pOBCacheManager = POBCacheManager.this;
                pOBCacheManager.f62280i = pOBCacheManager.fetchUserAgent();
                this.f62288a.onUserAgentReceived(POBCacheManager.this.f62280i);
            }
        }
    }

    class c implements POBNetworkHandler.POBNetworkListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProfileResultListener f62290a;

        c(ProfileResultListener profileResultListener) {
            this.f62290a = profileResultListener;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onFailure(POBError pOBError) {
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onSuccess(Map map) {
            if (map == null || map.isEmpty()) {
                POBLog.error("POBCacheManager", "Failed to fetch profile info from CDN. Empty response.", new Object[0]);
            } else {
                POBCacheManager.this.a(map, this.f62290a);
            }
        }
    }

    public POBCacheManager(@NonNull Context context, @NonNull POBNetworkHandler pOBNetworkHandler) {
        this.f62273b = context.getApplicationContext();
        this.f62274c = pOBNetworkHandler;
    }

    public void fetchProfileConfigs(@NonNull final Context context, @NonNull OpenWrapSDKConfig openWrapSDKConfig) {
        a(openWrapSDKConfig.getPublisherId(), new HashSet(openWrapSDKConfig.getProfileIds()), !POBUtils.isDebugBuild(context) ? new ProfileResultListener() { // from class: com.pubmatic.sdk.common.cache.a
            @Override // com.pubmatic.sdk.common.cache.POBCacheManager.ProfileResultListener
            public final void onProfileResult(boolean z10) {
                this.f62294a.a(context, z10);
            }
        } : null);
    }

    @NonNull
    @WorkerThread
    public String fetchUserAgent() {
        String str = this.f62280i;
        if (str != null) {
            return str;
        }
        try {
            return WebSettings.getDefaultUserAgent(this.f62273b);
        } catch (Exception e10) {
            POBLog.error("POBCacheManager", "Failed to retrieve user agent from web view, %s", e10.getLocalizedMessage());
            try {
                String property = System.getProperty("http.agent");
                return property != null ? property : "";
            } catch (Exception e11) {
                POBLog.error("POBCacheManager", "Failed to retrieve user agent (using http.agent) from WebView, %s", e11.getLocalizedMessage());
                return "";
            }
        }
    }

    public void generateUserAgent(@NonNull UserAgentListener userAgentListener) {
        String str = this.f62280i;
        if (str != null) {
            userAgentListener.onUserAgentReceived(str);
        }
        POBTaskHandler.getInstance().runOnBackgroundThread(new b(userAgentListener));
    }

    @NonNull
    public JSONArray getCachedBidResponses() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f62284m.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        Iterator it2 = this.f62283l.iterator();
        while (it2.hasNext()) {
            jSONArray.put((JSONObject) it2.next());
        }
        return jSONArray;
    }

    @Nullable
    public String getMraidJs() {
        if (this.f62278g == null) {
            this.f62278g = POBUtils.readFromAssets(this.f62273b, "pob_mraid.js");
        }
        return this.f62278g;
    }

    @Nullable
    public POBProfileInfo getProfileInfo(@NonNull String str) {
        return (POBProfileInfo) this.f62275d.get(str);
    }

    @Nullable
    public String getPublisherId() {
        return this.f62279h;
    }

    @NonNull
    public String getUserAgent() {
        String str = this.f62280i;
        return str == null ? "" : str;
    }

    public void loadInternalServiceJS(@NonNull POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        String str = (String) this.f62277f.get();
        if (str != null) {
            pOBScriptListener.onMeasurementScriptReceived(str);
        } else {
            c(pOBScriptListener);
        }
    }

    public void loadMraidJs() {
        if (this.f62278g != null) {
            return;
        }
        POBTaskHandler.getInstance().runOnBackgroundThread(new a());
    }

    public void saveReceivedBid(@NonNull JSONObject jSONObject) {
        if (this.f62283l.size() == 3) {
            this.f62283l.remove();
        }
        this.f62283l.add(jSONObject);
    }

    public void saveRenderedBid(@NonNull JSONObject jSONObject) {
        this.f62283l.remove(jSONObject);
        if (this.f62284m.size() == 3) {
            this.f62284m.remove();
        }
        this.f62284m.add(jSONObject);
    }

    public boolean verifyCrashAnalyticsStatus() {
        Iterator it = this.f62275d.values().iterator();
        while (it.hasNext()) {
            if (!((POBProfileInfo) it.next()).isCrashAnalyticsEnabled()) {
                return false;
            }
        }
        return true;
    }

    private void c(final POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        POBTaskHandler.getInstance().runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.common.cache.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f62296b.b(pOBScriptListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        androidx.compose.animation.core.c.a(this.f62277f, null, POBUtils.readFromAssets(this.f62273b, "omsdk-v1.js"));
        POBTaskHandler.getInstance().runOnMainThread(new Runnable() { // from class: com.pubmatic.sdk.common.cache.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f62298b.a(pOBScriptListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        String str = (String) this.f62277f.get();
        if (str != null) {
            pOBScriptListener.onMeasurementScriptReceived(str);
        } else {
            pOBScriptListener.onFailedToReceiveMeasurementScript(1);
        }
    }

    private void b(Context context, boolean z10) {
        POBCrashAnalysing crashAnalytics = POBInstanceProvider.getCrashAnalytics();
        if (crashAnalytics == null) {
            POBLog.debug("POBCacheManager", "CrashAnalytics is not initialized : ", new Object[0]);
            return;
        }
        boolean z11 = this.f62285n;
        if (!z11 && z10) {
            this.f62285n = true;
            crashAnalytics.initialize(context);
        } else if (z11 && !z10) {
            this.f62285n = false;
            crashAnalytics.invalidate();
        }
        POBLog.debug("POBCacheManager", "CrashAnalytics Enabled : " + this.f62285n, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, boolean z10) {
        if (z10) {
            b(context, verifyCrashAnalyticsStatus());
        }
    }

    private void a(String str, Set set, ProfileResultListener profileResultListener) {
        this.f62279h = str;
        this.f62286o.set(false);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            String strValueOf = String.valueOf(iIntValue);
            if (!this.f62276e.contains(strValueOf)) {
                POBProfileInfo pOBProfileInfo = (POBProfileInfo) this.f62275d.get(strValueOf);
                if (pOBProfileInfo != null && !pOBProfileInfo.isProfileInfoExpired()) {
                    POBLog.debug("POBCacheManager", "ProfileInfo already available for profileId: %s", strValueOf);
                } else if (!POBNetworkMonitor.isNetworkAvailable(this.f62273b)) {
                    a(new POBError(1003, "No network available"), strValueOf);
                } else {
                    String strBuildConfigURL = POBUtils.buildConfigURL(str, iIntValue);
                    POBHttpRequest pOBHttpRequest = new POBHttpRequest();
                    pOBHttpRequest.setUrl(strBuildConfigURL);
                    pOBHttpRequest.setRequestTag(strValueOf);
                    POBLog.debug("POBCacheManager", "Requesting profile config with url - : %s", strBuildConfigURL);
                    pOBHttpRequest.setTimeout(5000);
                    this.f62276e.add(strValueOf);
                    arrayList.add(pOBHttpRequest);
                }
            }
        }
        new POBMultipleRequestsHandler(this.f62274c).sendRequests(arrayList, new c(profileResultListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, ProfileResultListener profileResultListener) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            POBResponse pOBResponse = (POBResponse) entry.getValue();
            if (pOBResponse instanceof POBResponse.Success) {
                POBLog.debug("POBCacheManager", "Received profile config for profile %s, response - %s", str, pOBResponse);
                try {
                    this.f62275d.put(str, POBProfileInfo.build(new JSONObject(((POBResponse.Success) pOBResponse).getResponse())));
                    this.f62276e.remove(str);
                    this.f62286o.set(true);
                } catch (JSONException e10) {
                    a(new POBError(1007, e10.getMessage() != null ? e10.getMessage() : "Error while parsing profile info."), str);
                }
            } else if (pOBResponse instanceof POBResponse.Error) {
                a(((POBResponse.Error) pOBResponse).getError(), str);
            }
        }
        if (profileResultListener != null) {
            profileResultListener.onProfileResult(this.f62286o.get());
        }
    }

    private void a(POBError pOBError, String str) {
        POBLog.debug("POBCacheManager", "Profile config request status code: %s for %s", Integer.valueOf(pOBError.getErrorCode()), str);
        POBLog.info("POBCacheManager", "No remote configurations are detected for profile %s. OpenWrap SDK will use default configurations.", str);
        if (pOBError.getErrorCode() != 1003) {
            this.f62275d.put(str, new POBProfileInfo());
            this.f62286o.set(true);
        }
        this.f62276e.remove(str);
    }
}
