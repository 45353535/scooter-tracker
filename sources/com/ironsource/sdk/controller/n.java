package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4462o4;
import com.ironsource.C4500q8;
import com.ironsource.InterfaceC4546t4;
import com.ironsource.InterfaceC4563u4;
import com.ironsource.InterfaceC4580v4;
import com.ironsource.S7;
import com.ironsource.V4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S7 f45166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45167b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f45168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f45169b;

        a(l.a aVar, f.c cVar) {
            this.f45168a = aVar;
            this.f45169b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f45168a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.f45167b);
                this.f45168a.a(new f.a(this.f45169b.f(), jSONObject));
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4580v4 f45171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4 f45172b;

        b(InterfaceC4580v4 interfaceC4580v4, V4 v42) {
            this.f45171a = interfaceC4580v4;
            this.f45172b = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45171a.a(C4500q8.e.RewardedVideo, this.f45172b.h(), n.this.f45167b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4580v4 f45174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f45175b;

        c(InterfaceC4580v4 interfaceC4580v4, JSONObject jSONObject) {
            this.f45174a = interfaceC4580v4;
            this.f45175b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45174a.b(this.f45175b.optString("demandSourceName"), n.this.f45167b);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4 f45178b;

        d(InterfaceC4563u4 interfaceC4563u4, V4 v42) {
            this.f45177a = interfaceC4563u4;
            this.f45178b = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45177a.a(C4500q8.e.Interstitial, this.f45178b.h(), n.this.f45167b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45181b;

        e(InterfaceC4563u4 interfaceC4563u4, String str) {
            this.f45180a = interfaceC4563u4;
            this.f45181b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45180a.a(this.f45181b, n.this.f45167b);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4 f45184b;

        f(InterfaceC4563u4 interfaceC4563u4, V4 v42) {
            this.f45183a = interfaceC4563u4;
            this.f45184b = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45183a.a(this.f45184b.h(), n.this.f45167b);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f45187b;

        g(InterfaceC4563u4 interfaceC4563u4, JSONObject jSONObject) {
            this.f45186a = interfaceC4563u4;
            this.f45187b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45186a.d(this.f45187b.optString("demandSourceName"), n.this.f45167b);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4563u4 f45189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4 f45190b;

        h(InterfaceC4563u4 interfaceC4563u4, V4 v42) {
            this.f45189a = interfaceC4563u4;
            this.f45190b = v42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45189a.d(this.f45190b.h(), n.this.f45167b);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4546t4 f45192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f45193b;

        i(InterfaceC4546t4 interfaceC4546t4, Map map) {
            this.f45192a = interfaceC4546t4;
            this.f45193b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45192a.c((String) this.f45193b.get("demandSourceName"), n.this.f45167b);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4546t4 f45195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f45196b;

        j(InterfaceC4546t4 interfaceC4546t4, JSONObject jSONObject) {
            this.f45195a = interfaceC4546t4;
            this.f45196b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45195a.c(this.f45196b.optString("demandSourceName"), n.this.f45167b);
        }
    }

    n(String str, S7 s72) {
        this.f45166a = s72;
        this.f45167b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C4500q8.c h() {
        return C4500q8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(V4 v42) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4) {
        if (interfaceC4563u4 != null) {
            a(new f(interfaceC4563u4, v42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4580v4 interfaceC4580v4) {
        if (interfaceC4580v4 != null) {
            a(new b(interfaceC4580v4, v42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4580v4 interfaceC4580v4) {
        if (interfaceC4580v4 != null) {
            a(new c(interfaceC4580v4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4563u4 interfaceC4563u4) {
        if (interfaceC4563u4 != null) {
            a(new d(interfaceC4563u4, v42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4563u4 interfaceC4563u4) {
        if (interfaceC4563u4 != null) {
            a(new e(interfaceC4563u4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4563u4 interfaceC4563u4) {
        if (interfaceC4563u4 != null) {
            a(new g(interfaceC4563u4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4) {
        if (interfaceC4563u4 != null) {
            a(new h(interfaceC4563u4, v42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4546t4 interfaceC4546t4) {
        if (interfaceC4546t4 != null) {
            interfaceC4546t4.a(C4500q8.e.Banner, v42.h(), this.f45167b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42, Map<String, String> map, InterfaceC4546t4 interfaceC4546t4) {
        if (interfaceC4546t4 != null) {
            a(new i(interfaceC4546t4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4546t4 interfaceC4546t4) {
        if (interfaceC4546t4 != null) {
            a(new j(interfaceC4546t4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
        a(new a(aVar, cVar));
    }

    void a(Runnable runnable) {
        S7 s72 = this.f45166a;
        if (s72 != null) {
            s72.c(runnable);
        }
    }
}
