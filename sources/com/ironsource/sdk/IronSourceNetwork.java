package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4462o4;
import com.ironsource.C4516r8;
import com.ironsource.C4618x8;
import com.ironsource.C4635y8;
import com.ironsource.F5;
import com.ironsource.Jc;
import com.ironsource.L9;
import com.ironsource.P9;
import com.ironsource.V9;
import com.ironsource.Y9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f44923a = "IronSourceNetwork";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static V9 f44924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Jc> f44925c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Y9 f44926d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            F5 f5A = C4635y8.a(jSONObject);
            if (f5A.a()) {
                C4618x8.a(f5A, C4635y8.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(Jc jc2) {
        Y9 y92 = f44926d;
        if (y92 == null) {
            f44925c.add(jc2);
        } else if (y92.b()) {
            jc2.onSuccess();
        } else {
            jc2.onFail(f44926d.a());
        }
    }

    public static synchronized void destroyAd(L9 l92) throws Exception {
        a();
        f44924b.b(l92);
    }

    public static synchronized e getControllerManager() {
        return f44924b.a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(f44923a, "applicationKey is NULL");
            return;
        }
        if (f44924b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                Logger.e(f44923a, "Failed to init event tracker: " + e10.getMessage());
            }
            f44924b = P9.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(L9 l92) {
        V9 v92 = f44924b;
        if (v92 == null) {
            return false;
        }
        return v92.a(l92);
    }

    public static synchronized void loadAd(L9 l92, Map<String, String> map) throws Exception {
        a();
        f44924b.a(l92, map);
    }

    public static synchronized void loadAdView(Activity activity, L9 l92, Map<String, String> map) throws Exception {
        a();
        f44924b.b(activity, l92, map);
    }

    public static void onPause(Activity activity) {
        V9 v92 = f44924b;
        if (v92 == null) {
            return;
        }
        v92.onPause(activity);
    }

    public static void onResume(Activity activity) {
        V9 v92 = f44924b;
        if (v92 == null) {
            return;
        }
        v92.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        V9 v92 = f44924b;
        if (v92 == null) {
            return;
        }
        v92.a(activity);
    }

    public static synchronized void showAd(Activity activity, L9 l92, Map<String, String> map) throws Exception {
        a();
        f44924b.a(activity, l92, map);
    }

    public static synchronized void updateInitFailed(C4516r8 c4516r8) {
        try {
            f44926d = new Y9(c4516r8);
            Iterator<Jc> it = f44925c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c4516r8);
            }
            f44925c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void updateInitSucceeded() {
        try {
            f44926d = new Y9();
            Iterator<Jc> it = f44925c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            f44925c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void a() throws Exception {
        if (f44924b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }
}
