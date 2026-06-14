package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.d6;
import com.applovin.impl.e3;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.N6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class p3 implements q0.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f10083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f10084m = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f10086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f10087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3 f10088d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10091g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f10094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f10095k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10089e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f10090f = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10092h = 2;

    class a extends b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.this.c() || p3.f10083l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = p3.f10083l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(p3.this.f10088d, p3.this.f10085a.e());
                }
                p3.f10084m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = p3.f10083l = null;
            }
        }
    }

    public p3(com.applovin.impl.sdk.k kVar) {
        this.f10085a = kVar;
        this.f10086b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f10087c = contextO;
        o3 o3Var = new o3(contextO);
        this.f10088d = o3Var;
        this.f10095k = new b0(kVar, o3Var);
    }

    private void f() {
        this.f10085a.e().a(new a());
    }

    public boolean g() {
        return this.f10091g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f10088d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f10083l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityU0 = this.f10085a.u0();
        if (activityU0 == null || activityU0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityU0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.od
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f10053b.a(dialogInterface, i10);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void e() {
        if (this.f10090f.compareAndSet(false, true)) {
            this.f10085a.q0().a((i5) new w5(this, this.f10085a), d6.b.OTHER);
        }
    }

    public void a(boolean z10, int i10) {
        this.f10091g = z10;
        this.f10092h = i10;
    }

    public void a(Map map) {
        this.f10094j = map;
        e();
        if (!c() && f10084m.compareAndSet(false, true)) {
            if (!this.f10093i) {
                f();
                this.f10093i = true;
            }
            Intent intent = new Intent(this.f10087c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            this.f10087c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f10094j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f10094j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.z() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.pd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10132b.d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, N6.E1, new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, kVar);
                arrayList.add(e3Var);
                this.f10089e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.f10089e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds = kVar.J() != null ? kVar.J().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (adUnitIds.contains(nVar.c())) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f10086b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List listA = a(jSONObject, this.f10085a);
        List listA2 = a(jSONObject, listA, this.f10085a);
        List listA3 = a(listA2, this.f10085a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f10088d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, PglCryptUtils.KEY_MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f10085a);
        if (!listA4.isEmpty()) {
            this.f10095k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.nd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9916b.h();
                }
            }, TimeUnit.SECONDS.toMillis(this.f10092h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10086b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f10085a.D().a("fetchMediationDebuggerInfo", str, i10, str2);
        this.f10088d.a(null, null, null, null, null, null, null, false, this.f10085a);
        this.f10090f.set(false);
    }
}
