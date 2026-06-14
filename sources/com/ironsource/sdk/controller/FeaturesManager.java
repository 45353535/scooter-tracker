package com.ironsource.sdk.controller;

import com.ironsource.C4240b4;
import com.ironsource.C4462o4;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4466o8;
import com.ironsource.Me;
import com.ironsource.O3;
import com.ironsource.P3;
import com.ironsource.Z6;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class FeaturesManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile FeaturesManager f44949d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44950e = "debugMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ?> f44951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f44952b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4466o8 f44953c = Ib.U().t();

    class a extends ArrayList<String> {
        a() {
            add(C4240b4.d.f42553f);
            add(C4240b4.d.f42552e);
            add(C4240b4.d.f42554g);
            add(C4240b4.d.f42555h);
            add(C4240b4.d.f42556i);
            add(C4240b4.d.f42557j);
            add(C4240b4.d.f42558k);
            add(C4240b4.d.f42559l);
            add(C4240b4.d.f42560m);
        }
    }

    private FeaturesManager() {
        if (f44949d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f44951a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f44949d == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (f44949d == null) {
                        f44949d = new FeaturesManager();
                    }
                } finally {
                }
            }
        }
        return f44949d;
    }

    ArrayList<String> a() {
        return new ArrayList<>(this.f44952b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(C4240b4.a.f42499d) ? networkConfiguration.optJSONObject(C4240b4.a.f42499d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f44951a.containsKey("debugMode")) {
                num = (Integer) this.f44951a.get("debugMode");
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public O3 getFeatureFlagCatchUrlError() {
        return new O3(SDKUtils.getNetworkConfiguration().optJSONObject(O3.a.f41498c));
    }

    public P3 getFeatureFlagClickCheck() {
        return new P3(SDKUtils.getNetworkConfiguration());
    }

    public Z6 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.f44953c.a(C4240b4.a.f42513r);
        return androidx.activity.s.a(jSONObjectA) ? new Z6(jSONObjectA) : new Z6(null);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(C4240b4.a.f42500e, 0);
        }
        return 0;
    }

    public Me getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new Me(networkConfiguration.has(C4240b4.a.f42514s) ? networkConfiguration.optJSONObject(C4240b4.a.f42514s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f44953c.c(C4240b4.a.f42516u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f44951a = map;
    }
}
