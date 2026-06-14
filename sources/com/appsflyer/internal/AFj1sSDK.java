package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes6.dex */
public final class AFj1sSDK extends AFj1qSDK {
    private final AFc1bSDK getMediationNetwork;
    final ProviderInfo getRevenue;

    public AFj1sSDK(ProviderInfo providerInfo, Runnable runnable, AFc1bSDK aFc1bSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMediationNetwork = aFc1bSDK;
        this.getRevenue = providerInfo;
    }

    @Nullable
    @VisibleForTesting
    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false, true, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getCurrencyIso4217Code(final Context context) {
        this.getMediationNetwork.getMediationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK.5
            /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 321
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.AnonymousClass5.run():void");
            }
        });
    }
}
