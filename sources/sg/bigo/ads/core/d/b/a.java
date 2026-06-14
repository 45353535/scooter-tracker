package sg.bigo.ads.core.d.b;

import androidx.annotation.Nullable;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.z;
import com.taurusx.tax.g.e0;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f104018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f104019b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f104020c;

    public a(String str, @Nullable Map<String, String> map) {
        this.f104018a = str;
        this.f104020c = map;
    }

    private JSONObject a(g gVar) {
        String str;
        Object objB;
        JSONObject jSONObject = new JSONObject();
        if (gVar != null) {
            try {
                jSONObject.putOpt(MBridgeConstans.APP_KEY, gVar.a());
                jSONObject.putOpt("pkg_name", gVar.b());
                jSONObject.putOpt("pkg_ver", gVar.c());
                jSONObject.putOpt("pkg_vc", Integer.valueOf(gVar.d()));
                jSONObject.putOpt("pkg_ch", gVar.e());
                jSONObject.putOpt("os", gVar.i());
                jSONObject.putOpt("os_ver", gVar.j());
                jSONObject.putOpt("os_lang", gVar.k());
                jSONObject.putOpt(z.f66061c, gVar.l());
                jSONObject.putOpt("model", gVar.m());
                jSONObject.putOpt("isp", gVar.n());
                jSONObject.putOpt("resolution", gVar.o());
                jSONObject.putOpt("dpi", Integer.valueOf(gVar.p()));
                jSONObject.putOpt("dpi_f", gVar.q());
                jSONObject.putOpt("net", gVar.r());
                jSONObject.putOpt("tz", gVar.s());
                jSONObject.putOpt("country", gVar.u());
                jSONObject.putOpt("state", gVar.w());
                jSONObject.putOpt("city", gVar.x());
                jSONObject.putOpt("sdk_ver", gVar.y());
                jSONObject.putOpt("sdk_vc", 50602);
                if (sg.bigo.ads.common.x.a.q()) {
                    str = "consent_status";
                    objB = Integer.valueOf(sg.bigo.ads.core.d.b.b());
                } else {
                    jSONObject.putOpt(N6.V0, gVar.A());
                    jSONObject.putOpt("hw_id", gVar.G());
                    jSONObject.putOpt("fire_id", gVar.ae());
                    str = "af_id";
                    objB = gVar.B();
                }
                jSONObject.putOpt(str, objB);
                jSONObject.putOpt(e0.f66120c, gVar.C());
                jSONObject.putOpt("ts", Integer.valueOf(gVar.D()));
                jSONObject.putOpt("abflags", gVar.E());
                jSONObject.putOpt("gg_service_ver", gVar.H());
                jSONObject.putOpt("webkit_ver", gVar.I());
                jSONObject.putOpt("time", Long.valueOf(this.f104019b));
                jSONObject.putOpt("event_id", this.f104018a);
                jSONObject.putOpt("sdk_channel", gVar.aa());
                jSONObject.putOpt("gp_vc", String.valueOf(gVar.aw()));
                Map<String, String> map = this.f104020c;
                boolean z10 = false;
                if (map != null) {
                    if (q.a((CharSequence) map.get("session_id"))) {
                        this.f104020c.put("session_id", UUID.randomUUID().toString());
                    } else {
                        z10 = true;
                    }
                    for (Map.Entry<String, String> entry : this.f104020c.entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                if (!z10) {
                    jSONObject.putOpt("gps_country", gVar.Q());
                    jSONObject.putOpt("sim_country", gVar.R());
                    jSONObject.putOpt("system_country", gVar.S());
                }
                jSONObject.putOpt("ts_cold", Long.valueOf(gVar.V()));
                jSONObject.putOpt("ts_hot", Long.valueOf(gVar.W()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final sg.bigo.ads.common.g.b.b a(g gVar, long j10) {
        return new sg.bigo.ads.common.g.b.b(this.f104018a, a(gVar).toString(), j10);
    }
}
