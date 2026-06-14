package com.mbridge.msdk.config.component.info.provider;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.config.component.info.provider.subprovider.b;
import com.mbridge.msdk.config.component.info.provider.subprovider.c;
import com.mbridge.msdk.config.component.info.provider.subprovider.d;
import com.mbridge.msdk.config.component.info.provider.subprovider.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mobilefuse.sdk.device.UserAgentInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.models.AdExperience;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<String, Object> f46868j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, Object> f46869k = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.subprovider.a f46873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f46874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f46875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f46876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f46877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.info.provider.listener.a f46878i = new com.mbridge.msdk.config.component.info.provider.listener.a() { // from class: c5.a
        @Override // com.mbridge.msdk.config.component.info.provider.listener.a
        public final void a(Map map) {
            com.mbridge.msdk.config.component.info.provider.a.a(map);
        }
    };

    public a(int i10, int i11, int i12) {
        this.f46870a = i10;
        this.f46871b = i11;
        this.f46872c = i12;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map) {
        if (map != null) {
            if (map.containsKey(f.b.f45109c)) {
                f46869k.put(N6.V0, map.get(f.b.f45109c));
            }
            if (map.containsKey("adIdB64")) {
                f46869k.put("gaid2", map.get("adIdB64"));
            }
            if (map.containsKey("adIdLimit")) {
                f46869k.put("adid_litmit", map.get("adIdLimit"));
            }
            if (map.containsKey("amazonIdInfo")) {
                Map<String, Object> map2 = f46869k;
                map2.put("az_aid_info", map.get("amazonIdInfoB64"));
                map2.put("az_aid_info_origin", map.get("amazonIdInfo"));
            }
        }
    }

    public void c() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (this.f46870a == 1) {
            this.f46873d = new com.mbridge.msdk.config.component.info.provider.subprovider.a(contextD, this.f46878i);
        }
        if (this.f46871b == 1) {
            this.f46874e = new e(contextD);
        }
        this.f46875f = new c();
        this.f46876g = new d();
        this.f46877h = new b(contextD);
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap();
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (this.f46871b == 1) {
                map.put("c1", this.f46875f.e(contextD));
                map.put("language", this.f46875f.a(contextD));
                map.put("orientation", Integer.valueOf(this.f46875f.j(contextD)));
                map.put(C4240b4.j.f42699q0, this.f46875f.k(contextD));
                map.put("play_service_enable", Integer.valueOf(this.f46875f.m()));
                map.put("withGP", Integer.valueOf(this.f46875f.l()));
                map.put("networkType", Integer.valueOf(this.f46877h.c()));
                map.put("network_str", this.f46877h.d());
                map.put("vpn", Integer.valueOf(this.f46877h.e()));
            }
            if (this.f46872c == 1) {
                map.put("isLPM", Integer.valueOf(this.f46876g.d(contextD)));
                map.put("mobilePowerValue", Integer.valueOf(this.f46876g.d(contextD)));
                Map<String, Object> mapA = this.f46876g.a(contextD);
                map.put("mobileIsCharging", mapA.get("charging"));
                map.put("mobilePowerValue", mapA.get(C4240b4.j.Y));
                map.put(N6.f41390i0, this.f46876g.b(contextD));
                return map;
            }
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
        }
        return map;
    }

    public Map<String, Object> a() {
        Map<String, Object> mapA;
        String str = "";
        Map<String, Object> map = f46868j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f46869k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
            return map;
        }
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            map.put(C4240b4.j.f42698q, MBConfiguration.SDK_VERSION);
            map.put("platform", "1");
            map.put("package_name", contextD.getPackageName());
            map.put(CommonUrlParts.APP_VERSION, this.f46875f.d(contextD));
            map.put("app_version_code", Integer.valueOf(this.f46875f.c(contextD)));
            map.put("version_flag", "1");
            map.put("dyview_type", "1");
            map.put("pkg_source", this.f46875f.a(contextD, contextD.getPackageName()));
            map.put("http_req", "2");
            map.put("unknown_source", Integer.valueOf(this.f46875f.i()));
            if (this.f46871b == 1) {
                map.put(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, this.f46875f.g());
                map.put("model", this.f46875f.f());
                map.put(AdExperience.BRAND, this.f46875f.a());
                map.put(CommonUrlParts.MANUFACTURER, this.f46875f.d());
                map.put(UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, this.f46874e.c());
                map.put("cpuType", this.f46875f.h());
                map.put(DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY, this.f46875f.h(contextD) + "x" + this.f46875f.f(contextD));
                map.put("hm", "");
                Map<String, Object> mapE = this.f46875f.e();
                if (mapE != null && !mapE.isEmpty()) {
                    map.put("deviceMemoryTotal", mapE.get("totalMem"));
                    map.put("memory_free", mapE.get(N6.f41431w));
                }
                map.put("hasWXOpenSDK", Integer.valueOf(this.f46875f.n()));
                map.put("hasWX", Integer.valueOf(this.f46875f.n(contextD)));
                map.put("wxApiVersion", Integer.valueOf(this.f46875f.j()));
                map.put("weChatSupportApi", Integer.valueOf(this.f46875f.a(com.mbridge.msdk.foundation.controller.c.n().h())));
                map.put("u3", Long.valueOf(this.f46875f.b()));
                map.put("simu", Integer.valueOf(this.f46875f.k()));
                Map<String, String> mapI = this.f46875f.i(contextD);
                if (mapI != null && !mapI.isEmpty()) {
                    String str2 = mapI.get("mnc");
                    String str3 = mapI.get("mcc");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    map.put("mnc", str2);
                    if (!TextUtils.isEmpty(str3)) {
                        str = str3;
                    }
                    map.put("mcc", str);
                }
                map.put("harmony_info", this.f46875f.c());
                map.put("is_pad", Boolean.valueOf(this.f46875f.m(contextD)));
                map.put("time_format", this.f46875f.l(contextD));
                map.put("app_target_sdk_version", Integer.valueOf(this.f46875f.b(contextD)));
            }
            if (this.f46872c == 1) {
                map.put("font", Float.valueOf(this.f46876g.c(contextD)));
                map.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, this.f46876g.b());
                Map<String, Object> mapA2 = this.f46876g.a();
                if (mapA2 != null && !mapA2.isEmpty()) {
                    map.put("mobileCapacity", mapA2.get("totalSpace"));
                    map.put("remainder", mapA2.get("freeExternalSize"));
                }
            }
            if (this.f46870a == 1 && (mapA = this.f46873d.a()) != null && !mapA.isEmpty()) {
                map.put(N6.V0, mapA.get(f.b.f45109c));
                map.put("gaid2", mapA.get("adIdB64"));
                map.put("adid_litmit", mapA.get("adIdLimit"));
                map.put("az_aid_info", mapA.get("amazonIdInfoB64"));
                map.put("az_aid_info_origin", mapA.get("amazonIdInfo"));
            }
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
        }
        return f46868j;
    }

    public String a(String str) {
        Map<String, Object> map = f46868j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f46869k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        Map<String, Object> map3 = f46869k;
        if (map3.containsKey(str)) {
            return String.valueOf(map3.get(str));
        }
        Map<String, Object> mapB = b();
        if (mapB.containsKey(str)) {
            return String.valueOf(mapB.get(str));
        }
        return "";
    }
}
