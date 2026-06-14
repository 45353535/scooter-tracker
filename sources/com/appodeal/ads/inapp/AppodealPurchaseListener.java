package com.appodeal.ads.inapp;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005H'J,\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\u0005H'¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/inapp/AppodealPurchaseListener;", "", "onPurchaseReceived", "", "successPurchases", "", "", "", "onPurchaseFailed", "reason", "", "failedPurchases", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppodealPurchaseListener {
    void onPurchaseFailed(Throwable reason, List<Map<String, Object>> failedPurchases);

    void onPurchaseReceived(List<Map<String, Object>> successPurchases);
}
