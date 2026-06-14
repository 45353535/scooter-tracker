package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.e0;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements e0.a, d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e0 f61451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p1 f61452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d f61453c;

    private e(e0 e0Var, p1 p1Var, d.a aVar) {
        this.f61451a = e0Var;
        this.f61452b = p1Var;
        this.f61453c = aVar.a(this);
    }

    @Override // com.my.tracker.obfuscated.d.b
    public void c(List list) {
        if (list.isEmpty()) {
            x2.a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f61451a.c(list);
        }
    }

    public static e a(e0 e0Var, p1 p1Var, Context context) {
        d.a aVarA = d.a(context.getApplicationContext());
        if (aVarA != null) {
            return new e(e0Var, p1Var, aVarA);
        }
        x2.a("AppGalleryPurchaseHandler: can't support appGallery purchases ");
        return null;
    }

    @Override // com.my.tracker.obfuscated.e0.a
    public void b(List list) {
        if (list.isEmpty()) {
            x2.a("AppGalleryPurchaseHandler: empty subs raw purchases list");
        } else {
            this.f61453c.a(list);
        }
    }

    void c() {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.e4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61468b.b();
            }
        });
    }

    public void a() {
        this.f61451a.a(this);
        c();
    }

    public void b(final Object obj, final String str, final String str2, final String str3, final Map map) {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.d4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61437b.a(obj, str, str2, str3, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f61452b.b() < SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            x2.a("AppGalleryPurchaseHandler: not yet time for tracking");
        } else {
            this.f61453c.a();
            this.f61452b.a(jCurrentTimeMillis);
        }
    }

    public void a(int i10, Intent intent) {
        if (i10 != -1) {
            x2.a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            x2.a("AppGalleryPurchaseHandler: empty intent has been received");
        } else {
            this.f61453c.a(intent);
        }
    }

    @Override // com.my.tracker.obfuscated.d.b
    public void a(List list) {
        if (list.isEmpty()) {
            x2.a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f61451a.a(list, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj, String str, String str2, String str3, Map map) {
        JSONObject jSONObjectA = d.a(obj);
        if (jSONObjectA == null) {
            x2.a("AppGalleryPurchaseHandler: error parse productInfo object");
        } else {
            this.f61451a.a(jSONObjectA, str, str2, str3, map);
        }
    }
}
