package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
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
    public final /* synthetic */ i f75132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f75133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f75134c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f75132a = iVar;
        this.f75133b = billingResult;
        this.f75134c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f75132a;
        BillingResult billingResult = this.f75133b;
        List<Purchase> list = this.f75134c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            iVar.f75143f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                for (String str : purchase.getProducts()) {
                    String str2 = iVar.f75141d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.areEqual(str2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.getPurchaseToken(), purchase.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f75140c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f75138a, linkedHashMap, iVar.f75140c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f75141d, iVar.f75140c.getBillingInfoManager());
                iVar.f75143f.onUpdateFinished();
            } else {
                List list2 = CollectionsKt.toList(billingInfoToUpdate.keySet());
                n nVar = iVar.f75143f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f75141d;
                BillingClient billingClient = iVar.f75139b;
                UtilsProvider utilsProvider = iVar.f75140c;
                d dVar = iVar.f75142e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f75121b.add(fVar);
                if (iVar.f75139b.isReady()) {
                    BillingClient billingClient2 = iVar.f75139b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f75141d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f75142e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f75132a;
        iVar2.f75142e.a(iVar2);
    }
}
