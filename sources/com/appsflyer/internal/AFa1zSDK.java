package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1gSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFc1gSDK;Lcom/appsflyer/internal/AFc1pSDK;)V", "", "()Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFa1zSDK {

    @NotNull
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    public static final void getMonetizationNetwork(@NotNull AFc1gSDK p02, @NotNull AFc1pSDK p12) {
        int i10;
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1iSDK.getMonetizationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i10 = 23;
        } else {
            i10 = 18;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i11 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i11 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p02.getRevenue);
        if (aFKeystoreWrapper.getRevenue()) {
            String mediationNetwork = aFKeystoreWrapper.getMediationNetwork();
            synchronized (aFKeystoreWrapper.getMediationNetwork) {
                aFKeystoreWrapper.AFAdRevenueData++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(mediationNetwork)));
                try {
                    synchronized (aFKeystoreWrapper.getMediationNetwork) {
                        aFKeystoreWrapper.getRevenue.deleteEntry(mediationNetwork);
                    }
                } catch (KeyStoreException e10) {
                    StringBuilder sb2 = new StringBuilder("Exception ");
                    sb2.append(e10.getMessage());
                    sb2.append(" occurred");
                    AFLogger.afErrorLog(sb2.toString(), e10);
                }
            }
            aFKeystoreWrapper.getMediationNetwork(aFKeystoreWrapper.getMediationNetwork());
        } else {
            aFKeystoreWrapper.getMonetizationNetwork = AFb1jSDK.getRevenue(p12.getMonetizationNetwork);
            aFKeystoreWrapper.AFAdRevenueData = 0;
            aFKeystoreWrapper.getMediationNetwork(aFKeystoreWrapper.getMediationNetwork());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFAdRevenueData());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getCurrencyIso4217Code()));
    }

    @Nullable
    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    @Nullable
    public static String getMonetizationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }
}
