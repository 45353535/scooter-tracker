package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f75079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f75080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f75081c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f75079a = iVar;
        this.f75080b = billingResult;
        this.f75081c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f75079a;
        BillingResult billingResult = this.f75080b;
        List<PurchaseHistoryRecord> list = this.f75081c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f75090f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.f75088d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.areEqual(str2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f75087c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f75085a, linkedHashMap, iVar.f75087c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f75088d, iVar.f75087c.getBillingInfoManager());
                iVar.f75090f.onUpdateFinished();
            } else {
                List list2 = CollectionsKt.toList(billingInfoToUpdate.keySet());
                n nVar = iVar.f75090f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f75088d;
                BillingClient billingClient = iVar.f75086b;
                UtilsProvider utilsProvider = iVar.f75087c;
                d dVar = iVar.f75089e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f75068b.add(fVar);
                if (iVar.f75086b.isReady()) {
                    BillingClient billingClient2 = iVar.f75086b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f75088d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f75089e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f75079a;
        iVar2.f75089e.a(iVar2);
    }
}
