package com.applovin.impl.sdk;

import android.os.Bundle;
import com.adjust.sdk.purchase.ADJPConstants;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.d6;
import com.applovin.impl.h7;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class j implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f10679b;

    j(k kVar) {
        this.f10678a = kVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(k.o());
        this.f10679b = appLovinCommunicator;
        if (((Boolean) kVar.a(x4.f11357k7)).booleanValue()) {
            appLovinCommunicator.a(kVar);
            appLovinCommunicator.subscribe(this, h7.f8990a);
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (b("safedk_init") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10678a.i0());
            bundle.putString("applovin_random_token", this.f10678a.h0());
            bundle.putString("compass_random_token", this.f10678a.u());
            bundle.putString(CommonUrlParts.DEVICE_TYPE, AppLovinSdkUtils.isTablet(k.o()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(w3.b(this.f10678a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f10678a.w0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f10678a.a(x4.f11366l7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f10678a.O();
            if (o.a()) {
                this.f10678a.O().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j10;
        int i10;
        long j11;
        Map<String, Object> map2;
        if (((Boolean) this.f10678a.a(x4.f11357k7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map3.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map3.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10678a.i0());
                }
                this.f10678a.f0().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map3).a(stringMap2).a(((Boolean) this.f10678a.a(x4.f11355k5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f10678a.k().addCustomQueryParams(n7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f10678a.k().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f10678a.X().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f10678a.a(x4.f11344j3)).longValue();
            int i11 = messageData2.getInt("retry_count", ((Integer) this.f10678a.a(x4.f11353k3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f10678a.a(x4.f11362l3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f10678a.A().a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                j10 = millis;
                i10 = i11;
                j11 = millis2;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapG = this.f10678a.A().G();
                    Map mapP = this.f10678a.A().p();
                    j11 = millis2;
                    if (mapP.containsKey("idfv") && mapP.containsKey("idfv_scope")) {
                        i10 = i11;
                        String str = (String) mapP.get("idfv");
                        j10 = millis;
                        Integer num = (Integer) mapP.get("idfv_scope");
                        num.getClass();
                        mapP.remove("idfv");
                        mapP.remove("idfv_scope");
                        mapG.put("idfv", str);
                        mapG.put("idfv_scope", num);
                    } else {
                        j10 = millis;
                        i10 = i11;
                    }
                    mapG.put("server_installed_at", this.f10678a.a(x4.f11383o));
                    mapG.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10678a.i0());
                    map.put("app", mapG);
                    map.put(C4240b4.i.G, mapP);
                } else {
                    j10 = millis;
                    i10 = i11;
                    j11 = millis2;
                }
            }
            this.f10678a.q0().a((i5) new com.applovin.impl.n0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f10678a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j10).a(i10).b((int) j11).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f10678a), d6.b.OTHER);
        }
    }

    public void b(y2 y2Var, String str) {
        if (b("max_ad_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("type", str);
            this.f10678a.O();
            if (o.a()) {
                this.f10678a.O().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void b(y2 y2Var) {
        if (b("max_revenue_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putAll(JsonUtils.toBundle(y2Var.P()));
            bundleA.putString("country_code", this.f10678a.v().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            a(bundle, "test_mode_networks_updated");
        }
    }

    public void a(y2 y2Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f10678a.a(x4.f11357k7)).booleanValue()) {
            return this.f10678a.c(x4.f11348j7).contains(str) || this.f10679b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString(ADJPConstants.KEY_SDK_VERSION, str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            a(bundle, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString("response", strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f10679b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f10678a.c(x4.f11348j7).contains(str)));
        }
    }

    public boolean a(String str) {
        return h7.f8990a.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle a(com.applovin.impl.y2 r5) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.j.a(com.applovin.impl.y2):android.os.Bundle");
    }
}
