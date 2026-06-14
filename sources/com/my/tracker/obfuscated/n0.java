package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f61709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final e0 f61710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e0.c f61711c = new e0.c() { // from class: com.my.tracker.obfuscated.r6
        @Override // com.my.tracker.obfuscated.e0.c
        public final void a(List list) {
            this.f61817a.b(list);
        }
    };

    final class a implements m0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f61712a;

        a(List list) {
            this.f61712a = list;
        }

        @Override // com.my.tracker.obfuscated.m0.b
        public void a(int i10, final Map map) {
            if (i10 == 1) {
                x2.b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.t6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61843b.a(map);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Map map) {
            for (o0 o0Var : this.f61712a) {
                o0Var.a((JSONObject) map.get(o0Var.c()));
            }
            n0.this.f61710b.d(this.f61712a);
        }
    }

    private n0(e0 e0Var, Context context) {
        this.f61710b = e0Var;
        this.f61709a = context.getApplicationContext();
    }

    public static n0 a(e0 e0Var, Context context) {
        return new n0(e0Var, context);
    }

    void b(List list) {
        x2.a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            String strC = o0Var.c();
            if (o0Var.g()) {
                x2.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + strC);
                arrayList2.add(o0Var);
            } else {
                x2.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + strC);
                arrayList.add(o0Var);
            }
        }
        a((List) arrayList, false);
        a((List) arrayList2, true);
    }

    public void a() {
        this.f61710b.a(this.f61711c);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.f61710b.a(jSONObject, jSONObject2, str, map);
    }

    public void a(int i10, Intent intent) {
        if (!m0.f61668g.booleanValue()) {
            x2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
            return;
        }
        if (i10 != -1) {
            x2.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
            return;
        }
        if (intent == null) {
            x2.a("GooglePlayPurchaseHandler: empty intent has been received");
            return;
        }
        final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (TextUtils.isEmpty(stringExtra)) {
            x2.a("GooglePlayPurchaseHandler: empty purchase data in intent");
            return;
        }
        final String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (stringExtra2 == null) {
            x2.a("GooglePlayPurchaseHandler: null data signature in intent");
        } else {
            m.a(new Runnable() { // from class: com.my.tracker.obfuscated.s6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61832b.a(stringExtra, stringExtra2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        o0 o0VarA = o0.a(str, str2, v2.a());
        if (o0VarA == null) {
            return;
        }
        this.f61710b.a(Collections.singletonList(o0VarA), this.f61711c);
    }

    public void a(int i10, final List list) {
        if (i10 != 0) {
            x2.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (!m0.f61668g.booleanValue()) {
                x2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
                return;
            } else {
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.q6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61806b.a(list);
                    }
                });
                return;
            }
        }
        x2.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        x2.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0 o0VarA = m0.a(it.next());
            if (o0VarA == null) {
                x2.a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(o0VarA);
            }
        }
        if (arrayList.isEmpty()) {
            x2.a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.f61710b.a(arrayList, this.f61711c);
        }
    }

    void a(List list, boolean z10) {
        if (!list.isEmpty()) {
            m0.a(list, z10, new a(list), this.f61709a);
        } else if (z10) {
            x2.a("GooglePlayPurchaseHandler: empty inapp raw purchases list");
        } else {
            x2.a("GooglePlayPurchaseHandler: empty subs raw purchases list");
        }
    }
}
