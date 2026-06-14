package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.e0;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicBoolean f61374a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final y2 f61375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Application f61376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final e0 f61377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.my.tracker.obfuscated.a f61378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final n f61379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final y f61380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final s1 f61381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final w1 f61382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    n1 f61383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected t1 f61384k;

    final class a implements e0.b {
        a() {
        }

        @Override // com.my.tracker.obfuscated.e0.b
        public void a(String str) {
            c1.this.f61379f.b(str);
        }

        @Override // com.my.tracker.obfuscated.e0.b
        public void a() {
            c1.this.f61378e.e();
        }
    }

    c1(y2 y2Var, Application application) {
        this.f61375b = y2Var;
        this.f61376c = application;
        x2.c("MyTracker created, version: 3.5.0");
        e0 e0VarA = e0.a(y2Var, new a(), application);
        this.f61377d = e0VarA;
        w1 w1VarA = w1.a(e0VarA, y2Var.a(), application);
        this.f61382i = w1VarA;
        this.f61378e = com.my.tracker.obfuscated.a.a(e0VarA, y2Var, w1VarA, application);
        this.f61379f = n.a(y2Var, application);
        this.f61380g = y.a(e0VarA);
        this.f61381h = s1.a(e0VarA, application);
        this.f61384k = t1.a();
    }

    public static c1 a(String str, y2 y2Var, Application application) {
        y2Var.b(str);
        return new c1(y2Var, application);
    }

    public void b(String str, String str2, Map map) {
        if (b()) {
            return;
        }
        this.f61377d.b(str, str2, map);
    }

    public void a(List list) {
        if (!this.f61374a.compareAndSet(false, true)) {
            x2.a("MyTracker: tracker has already been initialized");
            return;
        }
        x2.c("MyTracker is initialized with id: " + this.f61375b.g());
        b1.c(this.f61376c);
        y2 y2Var = this.f61375b;
        final e0 e0Var = this.f61377d;
        Objects.requireNonNull(e0Var);
        s sVar = new s() { // from class: com.my.tracker.obfuscated.j3
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                e0Var.b((Boolean) obj);
            }
        };
        final e0 e0Var2 = this.f61377d;
        Objects.requireNonNull(e0Var2);
        y2Var.a(sVar, new s() { // from class: com.my.tracker.obfuscated.k3
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                e0Var2.c((Boolean) obj);
            }
        });
        this.f61377d.d();
        w0.a(this.f61375b, this.f61377d, this.f61382i, this.f61376c);
        p0.a(this.f61377d, this.f61379f, this.f61376c);
        v0.a(this.f61377d, this.f61379f, this.f61376c);
        l2.d().a(this.f61375b, this.f61376c);
        this.f61378e.a();
        this.f61381h.a();
        if (!list.isEmpty()) {
            n1 n1VarA = n1.a(this.f61377d, this.f61376c);
            this.f61383j = n1VarA;
            n1VarA.a(list);
        }
        t1 t1Var = this.f61384k;
        Application application = this.f61376c;
        final e0 e0Var3 = this.f61377d;
        Objects.requireNonNull(e0Var3);
        t1Var.a(application, new s() { // from class: com.my.tracker.obfuscated.l3
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                e0Var3.b((String) obj);
            }
        });
    }

    public void b(Map map) {
        if (b()) {
            return;
        }
        this.f61377d.d(map);
    }

    public void b(int i10, boolean z10) {
        if (b()) {
            return;
        }
        l2.e().b(i10, z10);
    }

    boolean b() {
        boolean z10 = this.f61374a.get();
        boolean z11 = !z10;
        if (!z10) {
            x2.b("MyTracker error: tracker hasn't been initialized");
        }
        return z11;
    }

    public void a() {
        if (b()) {
            return;
        }
        this.f61377d.a();
    }

    public void a(Activity activity) {
        if (b()) {
            return;
        }
        this.f61378e.d(activity);
    }

    public void a(String str, Map map) {
        if (b()) {
            return;
        }
        this.f61377d.a(str, map);
    }

    public void a(String str, String str2, Map map) {
        if (b()) {
            return;
        }
        this.f61377d.a(str, str2, map);
    }

    public void a(Map map) {
        if (b()) {
            return;
        }
        this.f61377d.c(map);
    }

    public void a(int i10, Map map) {
        if (b()) {
            return;
        }
        this.f61377d.a(i10, map);
    }

    public void a(AdEvent adEvent) {
        if (b()) {
            return;
        }
        this.f61377d.a(adEvent);
    }

    public void a(MiniAppEvent miniAppEvent) {
        if (b()) {
            return;
        }
        this.f61377d.a(miniAppEvent);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        if (b()) {
            return;
        }
        if (this.f61375b.s()) {
            x2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
        } else {
            this.f61381h.a(jSONObject, jSONObject2, str, map);
        }
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        if (b()) {
            return;
        }
        if (this.f61375b.s()) {
            x2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");
        } else {
            this.f61381h.a(obj, str, str2, str3, map);
        }
    }

    public void a(int i10, Intent intent) {
        if (b()) {
            return;
        }
        if (!this.f61375b.s()) {
            x2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
        } else {
            this.f61381h.b(i10, intent);
        }
    }

    public void a(int i10, List list) {
        if (b()) {
            return;
        }
        if (!this.f61375b.s()) {
            x2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
        } else {
            this.f61381h.a(i10, list);
        }
    }

    public String a(Intent intent) {
        return this.f61380g.a(intent);
    }

    public void a(int i10, boolean z10) {
        if (b()) {
            return;
        }
        l2.e().a(i10, z10);
    }

    public void a(int i10) {
        if (b()) {
            return;
        }
        l2.e().a(i10);
    }
}
