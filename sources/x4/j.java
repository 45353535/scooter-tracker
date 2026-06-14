package x4;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class j implements PurchasesUpdatedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f108122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BillingClient f108123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f108124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ProductDetails f108125d;

    class a implements BillingClientStateListener {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            j.this.f108124c.d();
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult.getResponseCode() == 0) {
                j.this.t();
                j.this.u();
            }
            if (j.this.f108124c != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x4.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f108121b.b();
                    }
                });
            }
        }
    }

    public interface b {
        void a(ProductDetails productDetails);

        void d();

        void h();

        void l();
    }

    public j(Context context) {
        this.f108122a = context;
    }

    private void j(Purchase purchase) {
        if (purchase.getPurchaseState() == 1) {
            int iE = x.E(this.f108122a);
            if (!purchase.isAcknowledged()) {
                this.f108123b.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: x4.c
                    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                    public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                        this.f108115a.l(billingResult);
                    }
                });
                return;
            }
            if (iE != 1) {
                x.X(this.f108122a, 1);
            }
            if (this.f108124c != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f108116b.m();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f108124c.l();
        this.f108124c.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(BillingResult billingResult) {
        x.X(this.f108122a, 1);
        if (this.f108124c != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x4.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108120b.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f108124c.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f108124c.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f108124c.a(this.f108125d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        if (billingResult.getResponseCode() != 0 || queryProductDetailsResult.getProductDetailsList().isEmpty()) {
            return;
        }
        this.f108125d = queryProductDetailsResult.getProductDetailsList().get(0);
        if (this.f108124c != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x4.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108119b.o();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f108124c.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(BillingResult billingResult, List list) {
        int iE = x.E(this.f108122a);
        if (billingResult.getResponseCode() == 0) {
            if (list.isEmpty()) {
                if (iE != 0) {
                    x.X(this.f108122a, 0);
                }
            } else if (((Purchase) list.get(0)).getPurchaseState() == 1) {
                if (iE != 1) {
                    x.X(this.f108122a, 1);
                }
            } else if (iE != 0) {
                x.X(this.f108122a, 0);
            }
            if (this.f108124c != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f108117b.q();
                    }
                });
            }
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        int iE = x.E(this.f108122a);
        if (billingResult.getResponseCode() == 0) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j((Purchase) it.next());
                }
                return;
            }
            return;
        }
        if (billingResult.getResponseCode() == 7) {
            if (iE != 1) {
                x.X(this.f108122a, 1);
            }
            if (this.f108124c != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f108110b.n();
                    }
                });
            }
        }
    }

    public void s(Activity activity) {
        if (this.f108125d != null) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(this.f108125d).build());
                this.f108123b.launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).build());
            } catch (Exception unused) {
            }
        }
    }

    public void t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId("premium_upgrade").setProductType("inapp").build());
        this.f108123b.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new ProductDetailsResponseListener() { // from class: x4.f
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                this.f108118a.p(billingResult, queryProductDetailsResult);
            }
        });
    }

    public void u() {
        if (this.f108123b.isReady()) {
            this.f108123b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: x4.b
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    this.f108114a.r(billingResult, list);
                }
            });
        }
    }

    public void v(b bVar) {
        this.f108124c = bVar;
    }

    public void w() {
        BillingClient billingClientBuild = BillingClient.newBuilder(this.f108122a).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(this).build();
        this.f108123b = billingClientBuild;
        billingClientBuild.startConnection(new a());
    }
}
