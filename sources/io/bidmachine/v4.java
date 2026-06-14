package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.protobuf.AdNetwork;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
abstract class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f81998a = {"network", "format", "ad_units"};

    static NetworkConfig f(Context context, AdNetwork adNetwork) {
        NetworkConfig networkConfigG;
        if (context == null) {
            return null;
        }
        final String name = adNetwork.getName();
        if (TextUtils.isEmpty(name) || (networkConfigG = g(context, name, adNetwork.getCustomParamsMap())) == null) {
            return null;
        }
        for (AdNetwork.AdUnit adUnit : adNetwork.getAdUnitsList()) {
            AdFormat adFormatByRemoteName = AdFormat.byRemoteName(adUnit.getAdFormat());
            if (adFormatByRemoteName != null) {
                networkConfigG.withMediationConfig(adFormatByRemoteName, adUnit.getCustomParamsMap());
            } else {
                io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.q4
                    @Override // ce.b
                    public final Object get() {
                        return String.format("Network (%s) adUnit register fail: %s not provided", name, "format");
                    }
                });
            }
        }
        return networkConfigG;
    }

    private static NetworkConfig g(Context context, final String str, Map map) {
        o4 o4VarD = n4.d(context, str);
        if (o4VarD == null) {
            return null;
        }
        try {
            return (NetworkConfig) Class.forName(o4VarD.b()).getConstructor(Map.class).newInstance(i(map));
        } catch (Throwable th2) {
            io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.u4
                @Override // ce.b
                public final Object get() {
                    return String.format("Network (%s) load fail!", str);
                }
            });
            io.bidmachine.core.a.p(th2);
            return null;
        }
    }

    static NetworkConfig h(Context context, JSONObject jSONObject) {
        final String string;
        if (context == null) {
            return null;
        }
        try {
            string = jSONObject.getString("network");
            try {
                final NetworkConfig networkConfigG = g(context, string, io.bidmachine.core.h.k0(jSONObject));
                if (networkConfigG == null) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("ad_units");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    AdFormat adFormatByRemoteName = AdFormat.byRemoteName(jSONObject2.getString("format"));
                    if (adFormatByRemoteName != null) {
                        networkConfigG.withMediationConfig(adFormatByRemoteName, i(io.bidmachine.core.h.k0(jSONObject2)));
                    } else {
                        io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.r4
                            @Override // ce.b
                            public final Object get() {
                                return String.format("Network (%s) adUnit register fail: %s not provided", string, "format");
                            }
                        });
                    }
                }
                io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.s4
                    @Override // ce.b
                    public final Object get() {
                        return String.format("Load network from json config completed successfully: %s", networkConfigG.getNetworkKey());
                    }
                });
                return networkConfigG;
            } catch (Throwable th2) {
                th = th2;
                io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.t4
                    @Override // ce.b
                    public final Object get() {
                        return String.format("Network (%s) load fail!", string);
                    }
                });
                io.bidmachine.core.a.p(th);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            string = null;
        }
    }

    private static Map i(Map map) {
        if (map != null) {
            try {
                for (String str : f81998a) {
                    map.remove(str);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
