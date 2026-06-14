package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.k5;
import com.applovin.impl.l1;
import com.applovin.impl.r3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9675c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9676d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9677e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONArray f9678f = new JSONArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f9679g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9680h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f9681i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f9682j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f9683k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f9684l;

    public f(com.applovin.impl.sdk.k kVar) {
        this.f9673a = kVar;
        this.f9674b = kVar.O();
    }

    public void a(Activity activity) {
        if (this.f9675c.compareAndSet(false, true)) {
            String str = (String) this.f9673a.a(z4.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<k3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f9673a.s0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f9684l = listA;
                    for (k3 k3Var : listA) {
                        this.f9681i.put(k3Var.b(), k3Var);
                    }
                    long j10 = StringUtils.parseLong(this.f9673a.n0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    k5 k5Var = new k5(listA, activity, this.f9673a);
                    if (j10 > 0) {
                        this.f9673a.q0().a(k5Var, d6.b.MEDIATION, j10);
                    } else {
                        this.f9673a.q0().a(k5Var);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9674b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                    l1.a((Throwable) e10);
                }
            }
        }
    }

    public boolean c() {
        return this.f9675c.get();
    }

    private void c(k3 k3Var) {
        String strB = k3Var.b();
        synchronized (this.f9677e) {
            try {
                if (this.f9676d.contains(strB)) {
                    return;
                }
                this.f9676d.add(strB);
                this.f9673a.P().d(d2.f8564c0, f2.a(k3Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f9680h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f9678f);
        }
        return jSONArrayShallowCopy;
    }

    boolean b(k3 k3Var) {
        boolean zContainsKey;
        synchronized (this.f9680h) {
            zContainsKey = this.f9679g.containsKey(k3Var.b());
        }
        return zContainsKey;
    }

    public s4 a(k3 k3Var, Activity activity) {
        k3 k3VarA = a(k3Var);
        if (k3VarA == null) {
            return s4.a("AdapterInitialization:" + k3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = k3Var.b();
        synchronized (this.f9683k) {
            try {
                s4 s4Var = (s4) this.f9682j.get(strB);
                if (s4Var != null) {
                    boolean z10 = false;
                    boolean z11 = k3VarA.q() && s4Var.e();
                    if (((Boolean) this.f9673a.a(x4.U6)).booleanValue() && s4Var.a()) {
                        z10 = true;
                    }
                    if (!z11 && !z10) {
                        return s4Var;
                    }
                }
                final s4 s4Var2 = new s4("AdapterInitialization:" + k3Var.c());
                this.f9682j.put(strB, s4Var2);
                h hVarA = this.f9673a.T().a(k3VarA);
                if (hVarA == null) {
                    s4Var2.a("Adapter implementation not found");
                    return s4Var2;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9674b.d("MediationAdapterInitializationManager", "Initializing adapter " + k3VarA);
                }
                c(k3VarA);
                hVarA.a(MaxAdapterParametersImpl.a(k3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.v
                    @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                    public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                        f.a(s4Var2, initializationStatus, str);
                    }
                });
                i6.a(k3VarA.m(), s4Var2, "The adapter (" + k3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f9673a);
                return s4Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(s4 s4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                s4Var.a(str);
                return;
            } else {
                s4Var.b(initializationStatus);
                return;
            }
        }
        l1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        s4Var.a("Adapter reported INITIALIZING");
    }

    private k3 a(k3 k3Var) {
        List<k3> list;
        if (((Boolean) this.f9673a.a(r3.f10339v8)).booleanValue()) {
            k3 k3Var2 = (k3) this.f9681i.get(k3Var.b());
            return k3Var2 != null ? k3Var2 : k3Var;
        }
        if (!this.f9673a.s0().c() || (list = this.f9684l) == null) {
            return k3Var;
        }
        for (k3 k3Var3 : list) {
            if (k3Var3.b().equals(k3Var.b())) {
                return k3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f9680h) {
            num = (Integer) this.f9679g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f9680h) {
            hashSet = new HashSet(this.f9679g.keySet());
        }
        return hashSet;
    }

    void a(k3 k3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zB;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f9680h) {
            try {
                zB = b(k3Var);
                if (!zB) {
                    this.f9679g.put(k3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", k3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j10);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f9678f.put(jSONObject);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zB) {
            return;
        }
        this.f9673a.a(k3Var);
        this.f9673a.X().processAdapterInitializationPostback(k3Var, j10, initializationStatus, str);
        this.f9673a.t().a(initializationStatus, k3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new k3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f9673a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f9680h) {
            this.f9679g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f9673a.t().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
