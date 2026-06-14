package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb f113001a = new zb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd2 f113002b = new wd2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vq2 f113003c = new vq2();

    public final am2 a(e9 e9Var) {
        String str;
        boolean z10;
        am2 am2Var = new am2((Map) null, 3);
        boolean z11 = true;
        if (e9Var != null) {
            Map map = e9Var.f110258g;
            this.f113001a.getClass();
            HashMap map2 = new HashMap();
            if (!kotlin.jvm.internal.b1.q(map2)) {
                map2 = null;
            }
            if (map2 == null) {
                map2 = new LinkedHashMap();
            }
            if (map != null) {
                String str2 = (String) map.get("adapter_network_name");
                String str3 = (String) map.get("adapter_version");
                String str4 = (String) map.get("adapter_network_sdk_version");
                if (str2 != null) {
                    map2.put("adapter_network_name", str2);
                }
                if (str3 != null) {
                    map2.put("adapter_version", str3);
                }
                if (str4 != null) {
                    map2.put("adapter_network_sdk_version", str4);
                }
            }
            this.f113002b.getClass();
            td2 td2Var = (td2) vd2.f116977a.getValue();
            if (td2Var != null) {
                int iOrdinal = td2Var.ordinal();
                if (iOrdinal == 0) {
                    str = PluginErrorDetails.Platform.FLUTTER;
                } else if (iOrdinal == 1) {
                    str = "react-native";
                } else {
                    if (iOrdinal != 2) {
                        throw new lf.m();
                    }
                    str = "unity";
                }
            } else {
                str = map != null ? (String) map.get("plugin_type") : null;
            }
            String str5 = map != null ? (String) map.get("plugin_version") : null;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            if (str != null) {
                mapCreateMapBuilder.put("plugin_type", str);
            }
            if (str5 != null) {
                mapCreateMapBuilder.put("plugin_version", str5);
            }
            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            String str6 = e9Var.f110263l;
            vq2 vq2Var = this.f113003c;
            vq2Var.getClass();
            HashMap map3 = new HashMap();
            if (!kotlin.jvm.internal.b1.q(map3)) {
                map3 = null;
            }
            if (map3 == null) {
                map3 = new LinkedHashMap();
            }
            vt2 vt2Var = vq2Var.f117155a;
            vt2Var.getClass();
            synchronized (vt2.f117186j) {
                z10 = vt2Var.f117194g;
            }
            map3.put("app_ad_analytics_enabled", Boolean.valueOf(z10));
            am2Var.f108722a.putAll(map2);
            am2Var.f108722a.putAll(mapBuild);
            am2Var.a(str6, "preload_type");
            am2Var.f108722a.putAll(map3);
        }
        String str7 = e9Var != null ? e9Var.f110259h : null;
        if (str7 != null && str7.length() != 0) {
            z11 = false;
        }
        am2Var.b(Boolean.valueOf(!z11), "open_bidding");
        if (!z11) {
            am2Var.a("openbidding", "integration_type");
        }
        return am2Var;
    }
}
