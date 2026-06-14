package com.applovin.impl;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f9164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f9165b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f9167d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h5 f9170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final h5 f9171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f9173j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9166c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Object f9168e = new Object();

    public k3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f9164a = kVar;
        if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
            this.f9170g = new h5(jSONObject2);
            this.f9171h = new h5(jSONObject);
            this.f9165b = null;
            this.f9167d = null;
        } else {
            this.f9165b = jSONObject2;
            this.f9167d = jSONObject;
            this.f9170g = null;
            this.f9171h = null;
        }
        this.f9169f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f9164a.a(r3.f10309b8)).intValue()));
    }

    protected JSONObject a() {
        JSONObject jSONObject;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f9168e) {
            jSONObject = this.f9167d;
        }
        return jSONObject;
    }

    protected Boolean b(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f9170g;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f9166c) {
            bool2 = JsonUtils.getBoolean(this.f9165b, str, bool);
        }
        return bool2;
    }

    protected boolean c(String str) {
        boolean zHas;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f9168e) {
            zHas = this.f9167d.has(str);
        }
        return zHas;
    }

    protected boolean d(String str) {
        boolean zHas;
        h5 h5Var = this.f9170g;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.f9166c) {
            zHas = this.f9165b.has(str);
        }
        return zHas;
    }

    protected Object e(String str) {
        Object objOpt;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.b(str);
        }
        synchronized (this.f9168e) {
            objOpt = this.f9167d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        h5 h5Var = this.f9170g;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.f9166c) {
            jSONObject = this.f9165b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f9172i;
    }

    public Map i() {
        return this.f9169f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            h5 h5Var = this.f9171h;
            bundle = h5Var != null ? (Bundle) h5Var.a(new Function() { // from class: com.applovin.impl.jb
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return k3.a((h5) obj);
                }
            }) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f9164a.n0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f9164a.a(r3.f10342x7)).longValue());
    }

    public Boolean n() {
        String str = this.f9164a.n0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f9164a.n0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public void f(String str) {
        this.f9173j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    protected Boolean a(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.f9168e) {
            bool2 = JsonUtils.getBoolean(this.f9167d, str, bool);
        }
        return bool2;
    }

    protected int b(String str, int i10) {
        int i11;
        h5 h5Var = this.f9170g;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f9166c) {
            i11 = JsonUtils.getInt(this.f9165b, str, i10);
        }
        return i11;
    }

    protected void c(String str, int i10) {
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            h5Var.b(str, i10);
            return;
        }
        synchronized (this.f9168e) {
            JsonUtils.putInt(this.f9167d, str, i10);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f9164a.r0().j();
    }

    public String e() {
        return this.f9173j;
    }

    public void g(String str) {
        this.f9172i = str;
    }

    protected float a(String str, float f10) {
        float f11;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str, f10);
        }
        synchronized (this.f9168e) {
            f11 = JsonUtils.getFloat(this.f9167d, str, f10);
        }
        return f11;
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f9170g;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f9166c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f9165b, str, jSONArray);
        }
        return jSONArray2;
    }

    protected void c(String str, long j10) {
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            h5Var.b(str, j10);
            return;
        }
        synchronized (this.f9168e) {
            JsonUtils.putLong(this.f9167d, str, j10);
        }
    }

    protected int a(String str, int i10) {
        int i11;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.f9168e) {
            i11 = JsonUtils.getInt(this.f9167d, str, i10);
        }
        return i11;
    }

    protected long b(String str, long j10) {
        long j11;
        h5 h5Var = this.f9170g;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f9166c) {
            j11 = JsonUtils.getLong(this.f9165b, str, j10);
        }
        return j11;
    }

    protected void c(String str, String str2) {
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            h5Var.b(str, str2);
            return;
        }
        synchronized (this.f9168e) {
            JsonUtils.putString(this.f9167d, str, str2);
        }
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.f9168e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f9167d, str, jSONArray);
        }
        return jSONArray2;
    }

    protected String b(String str, String str2) {
        String string;
        h5 h5Var = this.f9170g;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f9166c) {
            string = JsonUtils.getString(this.f9165b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    protected JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.f9168e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f9167d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            h5 h5Var = this.f9170g;
            if (h5Var != null) {
                listOptList = h5Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            h5 h5Var2 = this.f9171h;
            if (h5Var2 != null) {
                listOptList2 = h5Var2.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList.size() + listOptList2.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    protected long a(String str, long j10) {
        long j11;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.f9168e) {
            j11 = JsonUtils.getLong(this.f9167d, str, j10);
        }
        return j11;
    }

    protected String a(String str, String str2) {
        String string;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.f9168e) {
            string = JsonUtils.getString(this.f9167d, str, str2);
        }
        return string;
    }

    protected void a(String str, Object obj) {
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            h5Var.a(str, obj);
            return;
        }
        synchronized (this.f9168e) {
            JsonUtils.putObject(this.f9167d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(h5 h5Var) {
        return JsonUtils.toBundle(h5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}
