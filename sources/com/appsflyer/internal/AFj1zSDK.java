package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class AFj1zSDK extends AFi1aSDK {
    private final AFj1ySDK getMediationNetwork;
    private final AFc1bSDK getRevenue;

    public AFj1zSDK(Runnable runnable, AFc1bSDK aFc1bSDK, AFj1ySDK aFj1ySDK) {
        super("store", "huawei", aFc1bSDK.getCurrencyIso4217Code(), runnable);
        this.getRevenue = aFc1bSDK;
        this.getMediationNetwork = aFj1ySDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Context context) {
        this.component1 = System.currentTimeMillis();
        this.areAllFieldsValid = AFj1qSDK.AFa1vSDK.STARTED;
        addObserver(new AFj1qSDK.AnonymousClass1());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.getCurrencyIso4217Code(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getRevenue(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            } else if (cursorQuery.moveToFirst()) {
                this.AFAdRevenueData.put("response", "OK");
                this.AFAdRevenueData.put(Constants.REFERRER, cursorQuery.getString(0));
                this.AFAdRevenueData.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                if (cursorQuery.getColumnCount() > 3) {
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorQuery.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorQuery.getString(5));
                    this.AFAdRevenueData.put("huawei_custom", map);
                }
            } else {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
            }
        } catch (Throwable th2) {
            try {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th2.getMessage() != null ? th2.getMessage() : "", th2, false, true);
                if (0 != 0) {
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        getMonetizationNetwork();
    }

    private boolean getRevenue(Context context) {
        if (!getMediationNetwork()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMediationNetwork.AFAdRevenueData(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMediationNetwork.getMonetizationNetwork(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getCurrencyIso4217Code(final Context context) {
        if (getRevenue(context)) {
            this.getRevenue.getMediationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15650b.AFAdRevenueData(context);
                }
            });
        }
    }
}
