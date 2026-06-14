package sg.bigo.ads.controller.e;

import android.os.Build;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.z;
import com.taurusx.tax.g.e0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPOutputStream;
import net.pubnative.lite.sdk.models.RemoteConfigFeature;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.c.p;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f103645b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f103646a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103648d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f103649e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f103650f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f103651g = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f103647c = 0;

    private String c(d dVar) {
        sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f102116a;
        this.f103646a = (hVar == null || hVar.v() != 1) ? d(dVar) : e(dVar);
        this.f103647c = System.currentTimeMillis();
        return this.f103646a;
    }

    @Nullable
    private static String d(d dVar) {
        String string;
        if (dVar == null) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String appKey = dVar.f103594a.getAppKey();
        String str = dVar.f103597d;
        String str2 = dVar.f103598e;
        int i10 = dVar.f103599f;
        String channel = dVar.f103594a.getChannel();
        String str3 = Build.VERSION.RELEASE;
        String str4 = dVar.f103600g;
        String str5 = dVar.f103601h;
        String str6 = dVar.f103602i;
        String str7 = dVar.f103604k;
        int i11 = dVar.f103605l;
        String str8 = dVar.f103606m;
        String strR = dVar.r();
        String strU = dVar.U();
        String strA = dVar.A();
        String strA2 = sg.bigo.ads.common.b.a.a(dVar.f103595b);
        String strF = dVar.f103596c.F();
        String strD = q.d(sg.bigo.ads.common.utils.c.a());
        int iD = dVar.D();
        String strJ = dVar.f103596c.j();
        String strG = dVar.G();
        String strR2 = dVar.R();
        String strS = dVar.S();
        String strA3 = sg.bigo.ads.controller.g.d.a(null, dVar);
        String strR3 = sg.bigo.ads.common.x.a.r();
        sg.bigo.ads.common.b bVarAc = dVar.ac();
        String strValueOf = bVarAc != null ? String.valueOf(bVarAc.f102289c) : "";
        String strValueOf2 = bVarAc != null ? String.valueOf(bVarAc.f102287a) : "";
        String strValueOf3 = bVarAc != null ? String.valueOf(bVarAc.f102288b) : "";
        int i12 = dVar.f103612s;
        String strE = sg.bigo.ads.common.m.b.e();
        int iO = sg.bigo.ads.common.x.a.o();
        int iN = sg.bigo.ads.common.x.a.n();
        int iP = sg.bigo.ads.common.x.a.p();
        int iB = sg.bigo.ads.core.d.b.b();
        String strAe = dVar.ae();
        boolean z10 = dVar.z();
        boolean zF = dVar.F();
        boolean zAd = dVar.ad();
        boolean zK = sg.bigo.ads.common.aa.b.k(dVar.f103595b);
        int iL = sg.bigo.ads.common.aa.b.l(dVar.f103595b);
        boolean zC = sg.bigo.ads.common.aa.b.c();
        int i13 = dVar.f103614u;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(MBridgeConstans.APP_KEY, appKey);
            jSONObject.putOpt("pkg_name", str);
            jSONObject.putOpt("pkg_ver", str2);
            jSONObject.putOpt("pkg_vc", Integer.valueOf(i10));
            jSONObject.putOpt("pkg_ch", channel);
            jSONObject.putOpt("os", "android");
            jSONObject.putOpt("os_ver", str3);
            jSONObject.putOpt("os_lang", str4);
            jSONObject.putOpt(z.f66061c, str5);
            jSONObject.putOpt("model", str6);
            jSONObject.putOpt("resolution", str7);
            jSONObject.putOpt("dpi", Integer.valueOf(i11));
            jSONObject.putOpt("dpi_f", str8);
            jSONObject.putOpt("net", strR);
            jSONObject.putOpt("country", strU);
            jSONObject.putOpt("sdk_ver", "5.6.2");
            jSONObject.putOpt("sdk_vc", 50602);
            jSONObject.putOpt(N6.V0, strA);
            jSONObject.putOpt("af_id", strA2);
            jSONObject.putOpt(e0.f66120c, strF);
            jSONObject.putOpt("timezone", strD);
            jSONObject.putOpt("timestamp", Integer.valueOf(iD));
            jSONObject.putOpt("abflags", strJ);
            jSONObject.putOpt("hw_id", strG);
            jSONObject.putOpt("sim_country", strR2);
            jSONObject.putOpt("system_country", strS);
            jSONObject.putOpt("ad_info", strA3);
            jSONObject.putOpt(CommonUrlParts.UUID, strR3);
            jSONObject.putOpt("bat_stat", strValueOf);
            jSONObject.putOpt("bat_num", strValueOf2);
            jSONObject.putOpt("bat_scale", strValueOf3);
            jSONObject.putOpt("simulator_file", Integer.valueOf(i12));
            jSONObject.putOpt("tc_string", strE);
            jSONObject.putOpt("fire_id", strAe);
            jSONObject.putOpt("lat_enable", Integer.valueOf(z10 ? 1 : 0));
            jSONObject.putOpt("hw_lat_enable", Integer.valueOf(zF ? 1 : 0));
            jSONObject.putOpt("fire_lat_enable", Integer.valueOf(zAd ? 1 : 0));
            jSONObject.putOpt("lgdp", Integer.valueOf(iO));
            jSONObject.putOpt(RemoteConfigFeature.UserConsent.CCPA, Integer.valueOf(iN));
            jSONObject.putOpt("coppa", Integer.valueOf(iP));
            jSONObject.putOpt("consent_status", Integer.valueOf(iB));
            jSONObject.putOpt("batsa", Integer.valueOf(zK ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(iL));
            jSONObject.putOpt("root", Integer.valueOf(zC ? 1 : 0));
            jSONObject.putOpt("imp_pattern", Integer.valueOf(dVar.av()));
            jSONObject.putOpt("gp_vc", Integer.valueOf(i13));
            string = jSONObject.toString();
        } catch (Exception unused) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to unknown error.");
            string = null;
        }
        if (string == null) {
            return null;
        }
        return sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F") + "a2";
    }

    private static String e(d dVar) {
        if (dVar == null) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String strF = f(dVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(POBCoreNativeConstants.NATIVE_VERSION, 1);
            jSONObject.put("token", strF);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private static String f(@NonNull d dVar) {
        p pVar = new p();
        pVar.a(dVar.f103594a.getAppKey());
        pVar.a(dVar.f103597d);
        pVar.a(dVar.f103598e);
        pVar.a(dVar.f103599f);
        pVar.a(dVar.f103594a.getChannel());
        pVar.a("android");
        pVar.a(Build.VERSION.RELEASE);
        pVar.a(dVar.f103600g);
        pVar.a(dVar.f103601h);
        pVar.a(dVar.f103602i);
        pVar.a(dVar.f103604k);
        pVar.a(dVar.f103605l);
        pVar.a(dVar.f103606m);
        pVar.a(dVar.r());
        pVar.a(dVar.U());
        pVar.a("5.6.2");
        pVar.a(50602);
        pVar.a(dVar.A());
        pVar.a(sg.bigo.ads.common.b.a.a(dVar.f103595b));
        pVar.a(dVar.f103596c.F());
        pVar.a(q.d(sg.bigo.ads.common.utils.c.a()));
        pVar.a(dVar.D());
        pVar.a(dVar.f103596c.j());
        pVar.a(dVar.G());
        pVar.a(dVar.R());
        pVar.a(dVar.S());
        pVar.a(sg.bigo.ads.controller.g.d.a(null, dVar));
        pVar.a(sg.bigo.ads.common.x.a.r());
        sg.bigo.ads.common.b bVarAc = dVar.ac();
        String strValueOf = bVarAc != null ? String.valueOf(bVarAc.f102289c) : "";
        String strValueOf2 = bVarAc != null ? String.valueOf(bVarAc.f102287a) : "";
        String strValueOf3 = bVarAc != null ? String.valueOf(bVarAc.f102288b) : "";
        pVar.a(strValueOf);
        pVar.a(strValueOf2);
        pVar.a(strValueOf3);
        pVar.a(dVar.f103612s);
        pVar.a(sg.bigo.ads.common.m.b.e());
        pVar.a(dVar.ae());
        pVar.a(dVar.z() ? 1 : 0);
        pVar.a(dVar.F() ? 1 : 0);
        pVar.a(dVar.ad() ? 1 : 0);
        pVar.a(sg.bigo.ads.common.x.a.o());
        pVar.a(sg.bigo.ads.common.x.a.n());
        pVar.a(sg.bigo.ads.common.x.a.p());
        pVar.a(sg.bigo.ads.core.d.b.b());
        pVar.a(sg.bigo.ads.common.aa.b.k(dVar.f103595b) ? 1 : 0);
        pVar.a(sg.bigo.ads.common.aa.b.l(dVar.f103595b));
        pVar.a(sg.bigo.ads.common.aa.b.c() ? 1 : 0);
        pVar.a("");
        pVar.a("");
        pVar.a("");
        pVar.a(dVar.av());
        pVar.a(dVar.f103614u);
        int iA = 0;
        for (int i10 = 0; i10 < pVar.f103496a.size(); i10++) {
            iA += pVar.f103496a.get(i10).a();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iA);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (int i11 = 0; i11 < pVar.f103496a.size(); i11++) {
            pVar.f103496a.get(i11).a(byteBufferAllocate);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArrArray);
            gZIPOutputStream.close();
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            byteArrayOutputStream.close();
            return strEncodeToString;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String a(d dVar) {
        String str = this.f103646a;
        if (str != null) {
            return str;
        }
        synchronized (f.class) {
            try {
                String str2 = this.f103646a;
                if (str2 != null) {
                    return str2;
                }
                String strC = c(dVar);
                this.f103646a = strC;
                return strC;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String b(d dVar) {
        String strC;
        strC = c(dVar);
        this.f103646a = strC;
        return strC;
    }
}
