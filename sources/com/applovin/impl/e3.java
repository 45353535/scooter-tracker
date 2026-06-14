package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final a7 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f8733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f8738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f8740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f8741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f8742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f8743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f8744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f8746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f8747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f8748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f8749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f8750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f8752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f8753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f8754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f8755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f8756y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f8757z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8763a;

        a(String str) {
            this.f8763a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f8763a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8772c;

        b(String str, int i10, String str2) {
            this.f8770a = str;
            this.f8771b = i10;
            this.f8772c = str2;
        }

        public String b() {
            return this.f8772c;
        }

        public String c() {
            return this.f8770a;
        }

        public int d() {
            return this.f8771b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cb  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e3(org.json.JSONObject r22, com.applovin.impl.sdk.k r23) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.f8735d ? this.f8736e ? a.COMPLETE : this.f8738g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f8736e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f8757z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f8746o || com.applovin.impl.sdk.k.F0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f8737f;
    }

    public boolean B() {
        return this.f8739h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f8746o;
    }

    public boolean E() {
        if (!this.f8745n || !StringUtils.isValidString(this.f8750s)) {
            return false;
        }
        return !n7.d(this.f8750s).equals(n7.a(this.f8751t, this.f8750s.split("\\.").length));
    }

    public boolean F() {
        return this.f8735d;
    }

    public boolean G() {
        return this.f8733b == a.MISSING && this.f8742k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f8743l;
    }

    public boolean J() {
        return this.f8744m;
    }

    public String b() {
        return this.f8749r;
    }

    public String c() {
        return this.f8751t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f8748q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f8755x;
    }

    public int i() {
        return this.f8734c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f8747p);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f8733b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f8735d || TextUtils.isEmpty(this.f8750s)) ? "UNAVAILABLE" : this.f8750s);
        sb2.append("\nAdapter - ");
        if (this.f8736e && !TextUtils.isEmpty(this.f8751t)) {
            str = this.f8751t;
        }
        sb2.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(p4Var.b());
                sb2.append(": ");
                sb2.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(k1Var.b());
                sb2.append(": ");
                sb2.append(k1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f8752u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f8747p;
    }

    public List n() {
        return this.f8757z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f8732a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f8749r.equals(string)) {
            this.f8734c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = w3.a(string, this.f8732a);
            if (maxAdapterA != null) {
                String strA = w3.a(maxAdapterA);
                if (this.f8750s.equals(strA)) {
                    return;
                }
                this.f8750s = strA;
                this.f8732a.t().a(this.f8750s, string);
            }
        }
    }

    public String p() {
        return this.f8750s;
    }

    public a q() {
        return this.f8733b;
    }

    public List r() {
        return this.f8756y;
    }

    public List s() {
        return this.B;
    }

    public a7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f8747p + ", displayName=" + this.f8748q + ", sdkAvailable=" + this.f8735d + ", sdkVersion=" + this.f8750s + ", adapterAvailable=" + this.f8736e + ", adapterVersion=" + this.f8751t + "}";
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f8753v;
    }

    public String w() {
        return this.f8754w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f8740i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f8733b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.f8732a.s0().c() ? b.DISABLED : (this.f8741j && (this.f8734c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f8734c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f8736e;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f8749r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new p4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.f8748q.compareToIgnoreCase(e3Var.f8748q);
    }
}
