package com.appsflyer.internal.connectors;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.appsflyer.AFLogger;
import com.appsflyer.api.AFActivityLifecycleCallbacksImpl;
import com.appsflyer.api.AndroidLifecycleListener;
import com.appsflyer.api.PurchaseClientImpl;
import com.appsflyer.common.ExtentionsKt;
import com.appsflyer.internal.PurchaseProcessingManager;
import com.appsflyer.internal.connectors.BillingClientConnector;
import com.appsflyer.internal.connectors.callbacks.BillingLibraryAsyncListenersImpl;
import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleConnector implements BillingClientConnector, BillingClientStateListener, PurchasesUpdatedListener, AndroidLifecycleListener {
    private final AFActivityLifecycleCallbacksImpl activityLifecycleCallbacksImpl;
    private final BillingClient billingClient;
    private final Context context;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private final PurchaseDatabaseHelper f15621db;
    private BillingClientConnector.BillingUpdatesListener listener;
    private final SharedPreferences sharedPreferences;
    private final PurchasesResponseListener purchasesResponseListenerOnFirstLaunchForInapps = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connectors.GoogleConnector.1
        @Override // com.android.billingclient.api.PurchasesResponseListener
        public void onQueryPurchasesResponse(@NonNull BillingResult billingResult, @NonNull List<Purchase> list) {
            if (billingResult.getResponseCode() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
            } else if (!list.isEmpty()) {
                GoogleConnector.this.saveOldHistoryInappPurchasesToDB(list);
            } else {
                GoogleConnector.this.sharedPreferences.edit().putBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No history for non-consumed one-time purchases found");
            }
        }
    };
    private final PurchasesResponseListener purchasesResponseListenerOnFirstLaunchForSubs = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connectors.GoogleConnector.2
        @Override // com.android.billingclient.api.PurchasesResponseListener
        public void onQueryPurchasesResponse(@NonNull BillingResult billingResult, @NonNull List<Purchase> list) {
            if (billingResult.getResponseCode() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
            } else if (!list.isEmpty()) {
                GoogleConnector.this.processNewPurchases(billingResult, list, true);
            } else {
                GoogleConnector.this.sharedPreferences.edit().putBoolean(PurchaseClientImpl.ARS_HISTORY_SENT_KEY, true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No active subscriptions and/or non-consumed one-time purchases found");
            }
        }
    };
    private final PurchasesResponseListener purchasesResponseListenerOnResume = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connectors.a
        @Override // com.android.billingclient.api.PurchasesResponseListener
        public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
            GoogleConnector.a(this.f15622a, billingResult, list);
        }
    };
    private boolean isStopped = true;

    public class GoogleClientFactory implements BillingClientConnector.BillingClientFactory<BillingClient> {

        @NonNull
        private final PurchasesUpdatedListener purchaseUpdatedListener;

        public GoogleClientFactory(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.purchaseUpdatedListener = purchasesUpdatedListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.connectors.BillingClientConnector.BillingClientFactory
        public BillingClient buildBillingClient() {
            return BillingClient.newBuilder(GoogleConnector.this.context).setListener(this.purchaseUpdatedListener).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).enableAutoServiceReconnection().build();
        }
    }

    public GoogleConnector(@NonNull Context context, @Nullable GoogleClientFactory googleClientFactory, @NonNull SharedPreferences sharedPreferences, @NonNull PurchaseDatabaseHelper purchaseDatabaseHelper) {
        googleClientFactory = googleClientFactory == null ? new GoogleClientFactory(this) : googleClientFactory;
        this.context = context;
        this.sharedPreferences = sharedPreferences;
        this.billingClient = googleClientFactory.buildBillingClient();
        this.f15621db = purchaseDatabaseHelper;
        this.activityLifecycleCallbacksImpl = new AFActivityLifecycleCallbacksImpl(this);
    }

    public static /* synthetic */ void a(GoogleConnector googleConnector, BillingResult billingResult, List list) {
        googleConnector.getClass();
        if (billingResult.getResponseCode() != 0) {
            AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
        } else {
            googleConnector.processNewPurchases(billingResult, list, false);
        }
    }

    private void handlePurchases(@NonNull String str, List<String> list, List<Purchase> list2, boolean z10) {
        if (!"subs".equals(str) && !"inapp".equals(str)) {
            AFLogger.afWarnLog("[PurchaseConnector]: " + str + " SKU type is illegal");
            return;
        }
        AFLogger.afDebugLog("[PurchaseConnector]: Querying Sku details:\n\ttype: " + str + "\n\tSkus: " + ExtentionsKt.join(list, ", "));
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType(str).build());
        }
        QueryProductDetailsParams queryProductDetailsParamsBuild = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        BillingClientConnector.BillingUpdatesListener billingUpdatesListener = this.listener;
        if (billingUpdatesListener == null) {
            AFLogger.afWarnLog("[PurchaseConnector]: Skipping queryProductDetailsAsync because BillingUpdatesListener is null");
        } else {
            this.billingClient.queryProductDetailsAsync(queryProductDetailsParamsBuild, new BillingLibraryAsyncListenersImpl(str, billingUpdatesListener, list2, z10));
        }
    }

    private void processInappPurchaseHistory() {
        try {
            if (this.sharedPreferences.getBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, false)) {
                return;
            }
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), this.purchasesResponseListenerOnFirstLaunchForInapps);
        } catch (Throwable th2) {
            ExtentionsKt.warnIfBillingLibraryWrongVersion(th2);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th2, true);
        }
    }

    private void processSubscriptionHistory() {
        try {
            if (this.sharedPreferences.getBoolean(PurchaseClientImpl.ARS_HISTORY_SENT_KEY, false)) {
                return;
            }
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), this.purchasesResponseListenerOnFirstLaunchForSubs);
        } catch (Throwable th2) {
            ExtentionsKt.warnIfBillingLibraryWrongVersion(th2);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveOldHistoryInappPurchasesToDB(List<Purchase> list) {
        HashSet hashSet = new HashSet();
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getPurchaseToken());
        }
        this.f15621db.savePurchaseTokens(hashSet);
        this.sharedPreferences.edit().putBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, true).apply();
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public boolean getStopped() {
        return this.isStopped;
    }

    @Override // com.appsflyer.api.AndroidLifecycleListener
    public void onActivityOnCreate() {
        PurchaseProcessingManager.clearAll();
    }

    @Override // com.appsflyer.api.AndroidLifecycleListener
    public void onActivityOnResume() {
        if (this.sharedPreferences.getBoolean(PurchaseClientImpl.ARS_HISTORY_SENT_KEY, false)) {
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), this.purchasesResponseListenerOnResume);
        }
        if (this.sharedPreferences.getBoolean(PurchaseClientImpl.INAPP_PURCHASES_HISTORY_PROCESSED_KEY, false)) {
            this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), this.purchasesResponseListenerOnResume);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingServiceDisconnected");
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingSetupFinished");
        if (billingResult.getResponseCode() != 0) {
            return;
        }
        processSubscriptionHistory();
        processInappPurchaseHistory();
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
        AFLogger.afDebugLog("[PurchaseConnector]: onPurchasesUpdated");
        processNewPurchases(billingResult, list, false);
    }

    @VisibleForTesting
    public void processNewPurchases(BillingResult billingResult, List<Purchase> list, boolean z10) {
        try {
            if (billingResult.getResponseCode() == 0 && list != null) {
                if (this.billingClient == null) {
                    AFLogger.afWarnLog("[PurchaseConnector]: Got Ars billing callback but billing client is missing!");
                    return;
                }
                Set<String> purchasedTokens = this.f15621db.getPurchasedTokens();
                AFLogger.afDebugLog("tokens: " + Arrays.deepToString(purchasedTokens.toArray(new String[0])));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Purchase purchase : list) {
                    String strSha256AsBase64 = ExtentionsKt.sha256AsBase64(purchase.getPurchaseToken());
                    boolean zIsTokenInProcessing = PurchaseProcessingManager.isTokenInProcessing(strSha256AsBase64);
                    if (!purchasedTokens.contains(strSha256AsBase64) && !zIsTokenInProcessing) {
                        PurchaseProcessingManager.addToken(strSha256AsBase64);
                        arrayList2.add(purchase);
                        arrayList.addAll(purchase.getProducts());
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                handlePurchases("subs", arrayList, arrayList2, z10);
                handlePurchases("inapp", arrayList, arrayList2, z10);
                return;
            }
            AFLogger.afWarnLog("[PurchaseConnector]: Failed to setup Ars Play billing service: " + billingResult.getResponseCode() + " " + billingResult.getDebugMessage());
        } catch (Throwable th2) {
            ExtentionsKt.warnIfBillingLibraryWrongVersion(th2);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to query new purchase details", th2, true);
        }
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public void setListener(BillingClientConnector.BillingUpdatesListener billingUpdatesListener) {
        this.listener = billingUpdatesListener;
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public void start() {
        if (this.isStopped) {
            this.isStopped = false;
            this.billingClient.startConnection(this);
            Context context = this.context;
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(this.activityLifecycleCallbacksImpl);
            }
        }
    }

    @Override // com.appsflyer.internal.connectors.BillingClientConnector
    public void stop() {
        if (this.isStopped) {
            return;
        }
        this.isStopped = true;
        this.billingClient.endConnection();
    }
}
