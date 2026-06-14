package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapClient;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final IapClient f61393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f61394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f61395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Set f61396d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IapClient f61397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f61398b;

        a(IapClient iapClient, Context context) {
            this.f61397a = iapClient;
            this.f61398b = context;
        }

        public d a(b bVar) {
            return new d(this.f61397a, bVar, this.f61398b);
        }
    }

    public interface b {
        void a(List list);

        void c(List list);
    }

    final class c implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f61399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f61400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f61401c = DesugarCollections.synchronizedList(new ArrayList());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List f61402d = DesugarCollections.synchronizedList(new ArrayList());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f61403e;

        public c(int i10, int i11) {
            this.f61399a = i10;
            this.f61400b = i11;
            x2.a("OwnedPurchaseLoader: loader created");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {
            this.f61401c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.f61402d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                x2.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                b(continuationToken);
                return;
            }
            if (this.f61401c.isEmpty()) {
                x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.f61400b + " priceType is " + this.f61399a);
                d.this.b(this);
                return;
            }
            if (!this.f61402d.isEmpty()) {
                this.f61403e = ownedPurchasesResult.getSignatureAlgorithm();
                d.this.a(this);
                return;
            }
            x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.f61400b + " priceType is " + this.f61399a);
            d.this.b(this);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final OwnedPurchasesResult ownedPurchasesResult) {
            m.a(new Runnable() { // from class: com.my.tracker.obfuscated.u3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61847b.a(ownedPurchasesResult);
                }
            });
        }

        void b(final String str) {
            m.f(new Runnable() { // from class: com.my.tracker.obfuscated.t3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61838b.a(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            Task taskObtainOwnedPurchaseRecord;
            x2.a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.f61399a);
            ownedPurchasesReq.setContinuationToken(str);
            int i10 = this.f61400b;
            if (i10 == 2) {
                taskObtainOwnedPurchaseRecord = d.this.f61393a.obtainOwnedPurchases(ownedPurchasesReq);
            } else if (i10 == 3) {
                taskObtainOwnedPurchaseRecord = d.this.f61393a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            } else {
                x2.a("OwnedPurchaseLoader: invalid source to load purchases");
                d.this.b(this);
                return;
            }
            taskObtainOwnedPurchaseRecord.addOnFailureListener(new OnFailureListener() { // from class: com.my.tracker.obfuscated.s3
            });
            taskObtainOwnedPurchaseRecord.addOnSuccessListener(this);
        }

        private /* synthetic */ void a(Exception exc) {
            x2.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            d.this.b(this);
        }
    }

    protected d(IapClient iapClient, b bVar, Context context) {
        this.f61393a = iapClient;
        this.f61395c = bVar;
        this.f61394b = context;
        x2.a("AppGalleryHelper AppGalleryHelper created");
    }

    public static a a(Context context) {
        try {
            return new a(Iap.getIapClient(context), context);
        } catch (Throwable th2) {
            x2.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Intent intent) {
        PurchaseResultInfo purchaseResultInfoFromIntent = this.f61393a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = purchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.f61395c.a(Collections.singletonList(f.a(purchaseResultInfoFromIntent.getInAppPurchaseData(), purchaseResultInfoFromIntent.getInAppDataSignature(), purchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, v2.a())));
        } else {
            x2.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
        }
    }

    public static JSONObject a(Object obj) {
        x2.a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, productInfo.getProductId());
            jSONObject.put("productName", productInfo.getProductName());
            jSONObject.put("productDesc", productInfo.getProductDesc());
            jSONObject.put("currency", productInfo.getCurrency());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e10) {
            x2.b("AppGalleryHelper: ", e10);
            return null;
        } catch (Throwable th2) {
            x2.b("AppGalleryHelper: ", th2);
            return null;
        }
    }

    void b(c cVar) {
        Set set = this.f61396d;
        if (set == null) {
            x2.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(cVar);
        if (set.isEmpty()) {
            this.f61396d = null;
        }
    }

    static ArrayList a(List list, List list2, String str, int i10) {
        ArrayList arrayList = new ArrayList();
        long jA = v2.a();
        int i11 = 0;
        while (i11 < list.size()) {
            String str2 = str;
            int i12 = i10;
            f fVarA = f.a((String) list.get(i11), (String) list2.get(i11), str2, i12, jA);
            if (fVarA == null) {
                x2.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(fVarA);
            }
            i11++;
            str = str2;
            i10 = i12;
        }
        return arrayList;
    }

    public void a(final Intent intent) {
        x2.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.n3
            @Override // java.lang.Runnable
            public final void run() {
                this.f61718b.b(intent);
            }
        });
    }

    public void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new c(0, 2));
        hashSet.add(new c(1, 2));
        hashSet.add(new c(2, 2));
        hashSet.add(new c(0, 3));
        hashSet.add(new c(2, 3));
        this.f61396d = DesugarCollections.synchronizedSet(hashSet);
        x2.a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b((String) null);
        }
    }

    public void a(List list) {
        x2.a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            try {
                int i10 = fVar.e().getInt("kind");
                if (i10 == 0) {
                    arrayList.add(fVar);
                } else if (i10 == 1) {
                    arrayList2.add(fVar);
                } else if (i10 == 2) {
                    arrayList3.add(fVar);
                }
            } catch (Throwable th2) {
                x2.b("AppGalleryHelper: can not getting price type ", th2);
            }
        }
        if (arrayList.size() > 0) {
            a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            a(arrayList3, 2);
        }
    }

    JSONObject a(List list, String str) {
        if (str == null) {
            x2.a("AppGalleryHelper: can't get product by id, id is null");
            return null;
        }
        if (list == null) {
            x2.a("AppGalleryHelper: can't get product by id, productInfoListJson is null");
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            try {
            } catch (Throwable th2) {
                x2.a("AppGalleryHelper: error while reading product_id", th2);
            }
            if (jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID).equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    void a(List list, int i10) {
        x2.a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            f fVar = (f) it.next();
            hashSet.add(fVar.c());
            arrayList.add(fVar);
            it.remove();
        }
        x2.a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (hashSet.contains(fVar2.c())) {
                arrayList.add(fVar2);
                it.remove();
            }
        }
        x2.a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            x2.a("AppGalleryHelper: there are still unloaded products, we are loading more");
            a(list, i10);
        }
        final ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i10);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.m3
            @Override // java.lang.Runnable
            public final void run() {
                this.f61686b.a(productInfoReq, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoReq productInfoReq, final List list) {
        Task taskObtainProductInfo = this.f61393a.obtainProductInfo(productInfoReq);
        taskObtainProductInfo.addOnFailureListener(new OnFailureListener() { // from class: com.my.tracker.obfuscated.q3
        });
        taskObtainProductInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.my.tracker.obfuscated.r3
        });
    }

    private /* synthetic */ void a(final List list, final Exception exc) {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.o3
            @Override // java.lang.Runnable
            public final void run() {
                this.f61744b.a(exc, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc, List list) {
        x2.a("AppGalleryHelper: error while loading products ", exc);
        this.f61395c.c(list);
    }

    private /* synthetic */ void a(final List list, final ProductInfoResult productInfoResult) {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.p3
            @Override // java.lang.Runnable
            public final void run() {
                this.f61772b.a(productInfoResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {
        List productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            x2.a("AppGalleryHelper: productInfoList is null, finish products loading");
            this.f61395c.c(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = productInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ProductInfo) it.next()));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f fVar = (f) it2.next();
            fVar.a(a(arrayList, fVar.c()));
        }
        this.f61395c.c(list);
    }

    void a(c cVar) {
        this.f61395c.a(a(cVar.f61401c, cVar.f61402d, cVar.f61403e, cVar.f61400b));
        b(cVar);
    }
}
