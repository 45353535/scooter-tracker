package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.taurusx.tax.ui.CircularProgressBar;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class AFf1mSDK extends AFe1lSDK<AFf1oSDK> {
    private final AFc1pSDK areAllFieldsValid;

    @Nullable
    public final AFf1nSDK component1;

    @Nullable
    public AFf1oSDK component2;
    public AFi1vSDK component3;
    private final AFf1qSDK component4;
    private final String copy;
    private final AFf1iSDK copydefault;
    private final AFf1hSDK equals;
    private final AFf1cSDK hashCode;
    private final AFd1lSDK toString;

    public AFf1mSDK(@NonNull AFf1qSDK aFf1qSDK, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFf1cSDK aFf1cSDK, @NonNull AFf1iSDK aFf1iSDK, @NonNull AFd1lSDK aFd1lSDK, @NonNull AFf1hSDK aFf1hSDK, @NonNull String str, @Nullable AFf1nSDK aFf1nSDK) {
        super(AFe1mSDK.RC_CDN, new AFe1mSDK[0], "UpdateRemoteConfiguration");
        this.component2 = null;
        this.component4 = aFf1qSDK;
        this.areAllFieldsValid = aFc1pSDK;
        this.hashCode = aFf1cSDK;
        this.copydefault = aFf1iSDK;
        this.toString = aFd1lSDK;
        this.equals = aFf1hSDK;
        this.copy = str;
        this.component1 = aFf1nSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.appsflyer.internal.AFf1oSDK component2() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1mSDK.component2():com.appsflyer.internal.AFf1oSDK");
    }

    private void getRevenue(String str, long j10, AFi1uSDK aFi1uSDK, @Nullable String str2, @Nullable AFe1xSDK<AFi1wSDK> aFe1xSDK) {
        getMediationNetwork(str, j10, aFe1xSDK, aFe1xSDK != null ? aFe1xSDK.getBody() : null, aFi1uSDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return CircularProgressBar.E;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() throws Exception {
        try {
            AFf1oSDK aFf1oSDKComponent2 = component2();
            this.component2 = aFf1oSDKComponent2;
            return aFf1oSDKComponent2 == AFf1oSDK.FAILURE ? AFe1uSDK.FAILURE : AFe1uSDK.SUCCESS;
        } catch (InterruptedException e10) {
            e = e10;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component2 = AFf1oSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component2 = AFf1oSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (InterruptedIOException e11) {
            e = e11;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component2 = AFf1oSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        }
    }

    private void getMediationNetwork(String str, long j10, @Nullable AFe1xSDK<?> aFe1xSDK, AFi1wSDK aFi1wSDK, AFi1uSDK aFi1uSDK, @Nullable String str2, @Nullable Throwable th2) {
        long j11;
        int statusCode;
        Throwable th3;
        if (aFe1xSDK != null) {
            j11 = aFe1xSDK.AFAdRevenueData.getRevenue;
            statusCode = aFe1xSDK.getStatusCode();
        } else {
            j11 = 0;
            statusCode = 0;
        }
        int i10 = statusCode;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j11 = ((HttpException) th2).getMetrics().getRevenue;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.component3 = new AFi1vSDK(aFi1wSDK != null ? aFi1wSDK.getCurrencyIso4217Code : null, str, j11, System.currentTimeMillis() - j10, i10, aFi1uSDK, str2, th3);
    }
}
