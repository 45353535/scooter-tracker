package com.my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Boolean f61668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f61669h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BillingClientStateListener f61670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f61671b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f61672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f61674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BillingClient f61675f;

    class a implements BillingClientStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicInteger f61676a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f61677b;

        a(b bVar) {
            this.f61677b = bVar;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            if (this.f61676a.incrementAndGet() >= 3 || !m0.this.c()) {
                x2.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                this.f61677b.a(1, Collections.EMPTY_MAP);
                m0.this.a();
            }
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                x2.a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
            } else {
                x2.a("GooglePlayProductHelper: connection with billing client has been established");
                this.f61676a.set(0);
                m0.this.b();
            }
        }
    }

    public interface b {
        void a(int i10, Map map);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    static {
        /*
            java.lang.Class<com.android.billingclient.api.BillingClient> r0 = com.android.billingclient.api.BillingClient.class
            java.lang.Class<com.android.billingclient.api.Purchase> r1 = com.android.billingclient.api.Purchase.class
            boolean r1 = r1.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            boolean r0 = r0.equals(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.my.tracker.obfuscated.m0.f61668g = r1
            if (r0 == 0) goto L23
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.my.tracker.obfuscated.m0.f61669h = r0
            goto L27
        L23:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            com.my.tracker.obfuscated.m0.f61669h = r0
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.m0.<clinit>():void");
    }

    private m0(List list, String str, b bVar, Context context) {
        this.f61672c = list;
        this.f61674e = bVar;
        this.f61675f = BillingClient.newBuilder(context).setListener(new PurchasesUpdatedListener() { // from class: com.my.tracker.obfuscated.n6
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list2) {
                m0.a(billingResult, list2);
            }
        }).enablePendingPurchases().build();
        this.f61673d = str;
        this.f61670a = new a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final BillingResult billingResult, final List list) {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.l6
            @Override // java.lang.Runnable
            public final void run() {
                this.f61654b.b(billingResult, list);
            }
        });
        a();
    }

    void b() {
        try {
            x2.a("GooglePlayProductHelper: querying for " + this.f61673d);
            this.f61675f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.f61672c).setType(this.f61673d).build(), new SkuDetailsResponseListener() { // from class: com.my.tracker.obfuscated.k6
                @Override // com.android.billingclient.api.SkuDetailsResponseListener
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    this.f61630a.c(billingResult, list);
                }
            });
        } catch (Throwable th2) {
            x2.b("GooglePlayProductHelper error: exception while querying details for " + this.f61673d, th2);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(BillingResult billingResult, List list) {
        if (!this.f61671b.compareAndSet(false, true)) {
            x2.a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            x2.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + (billingResult != null ? billingResult.getDebugMessage() : "{empty message}"));
            this.f61674e.a(1, Collections.EMPTY_MAP);
            return;
        }
        if (list == null || list.isEmpty()) {
            x2.a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.f61674e.a(0, Collections.EMPTY_MAP);
            return;
        }
        HashMap map = new HashMap();
        x2.a("GooglePlayProductHelper: populating map of skuDetails data");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it.next();
            try {
                map.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
            } catch (Throwable th2) {
                x2.b("GooglePlayProductHelper error: exception while parsing skuData", th2);
            }
        }
        this.f61674e.a(0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BillingResult billingResult, List list) {
    }

    public static o0 a(Object obj) {
        if (!f61668g.booleanValue()) {
            x2.b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return o0.a(purchase.getOriginalJson(), purchase.getSignature(), v2.a());
            }
        } catch (Throwable th2) {
            x2.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th2);
        }
        return null;
    }

    boolean c() {
        try {
            x2.a("GooglePlayProductHelper: start connection with billing client");
            this.f61675f.startConnection(this.f61670a);
            f61669h.add(this);
            return true;
        } catch (Throwable th2) {
            x2.b("GooglePlayProductHelper error: exception while start connection:", th2);
            return false;
        }
    }

    public static void a(List list, boolean z10, final b bVar, final Context context) {
        if (list.isEmpty()) {
            x2.a("GooglePlayProductHelper: empty purchases list");
            bVar.a(0, Collections.EMPTY_MAP);
            return;
        }
        final String str = z10 ? "subs" : "inapp";
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strC = ((o0) it.next()).c();
            if (!arrayList.contains(strC)) {
                arrayList.add(strC);
            }
        }
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.m6
            @Override // java.lang.Runnable
            public final void run() {
                m0.a(arrayList, str, bVar, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list, String str, b bVar, Context context) {
        try {
            m0 m0Var = new m0(list, str, bVar, context);
            if (m0Var.c()) {
                return;
            } else {
                m0Var.a();
            }
        } catch (Throwable th2) {
            x2.b("GooglePlayProductHelper error: error while creating ProductHelper", th2);
        }
        bVar.a(1, Collections.EMPTY_MAP);
    }

    void a() {
        try {
            x2.a("GooglePlayProductHelper: end connection with billing client");
            f61669h.remove(this);
            this.f61675f.endConnection();
        } catch (Throwable th2) {
            x2.b("GooglePlayProductHelper error: exception while end connection:", th2);
        }
    }
}
