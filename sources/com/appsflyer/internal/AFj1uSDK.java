package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFj1uSDK extends AFi1aSDK {

    @NotNull
    private final ExecutorService getMediationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1uSDK(@NotNull ExecutorService executorService, @NotNull AFc1pSDK aFc1pSDK, @NotNull Runnable runnable) {
        super("preload", Constants.REFERRER_API_SAMSUNG, aFc1pSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getMediationNetwork = executorService;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void getMonetizationNetwork(com.appsflyer.internal.AFj1uSDK r12, android.content.Context r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1uSDK.getMonetizationNetwork(com.appsflyer.internal.AFj1uSDK, android.content.Context):void");
    }

    private final boolean getRevenue(Context context) {
        if (!getMediationNetwork()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (AFAdRevenueData(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    protected final void getCurrencyIso4217Code() {
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    @SuppressLint({"NewApi"})
    public final void getCurrencyIso4217Code(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getRevenue(context)) {
            this.getMediationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.i0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AFj1uSDK.getMonetizationNetwork(this.f15642b, context);
                }
            });
        }
    }
}
