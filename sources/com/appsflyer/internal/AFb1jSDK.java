package com.appsflyer.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFb1jSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFc1oSDK;)Ljava/lang/String;", "p1", "", "getCurrencyIso4217Code", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1oSDK;)V", "getMediationNetwork", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFb1jSDK {

    @NotNull
    public static final AFb1jSDK INSTANCE = new AFb1jSDK();

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @Nullable
    private static String getRevenue;

    private AFb1jSDK() {
    }

    public static final synchronized void getCurrencyIso4217Code(@NotNull String p02, @NotNull AFc1oSDK p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        getRevenue = p02;
        p12.getCurrencyIso4217Code("CUSTOM_INSTALL_ID_APPLIED", true);
        p12.AFAdRevenueData("AF_INSTALLATION", p02);
    }

    @NotNull
    public static final synchronized String getRevenue(@NotNull AFc1oSDK p02) {
        String str;
        try {
            Intrinsics.checkNotNullParameter(p02, "");
            if (getRevenue == null) {
                String monetizationNetwork = p02.getMonetizationNetwork("AF_INSTALLATION", null);
                if (monetizationNetwork == null) {
                    monetizationNetwork = System.currentTimeMillis() + TokenBuilder.TOKEN_DELIMITER + Math.abs(new SecureRandom().nextLong());
                    p02.AFAdRevenueData("AF_INSTALLATION", monetizationNetwork);
                }
                getRevenue = monetizationNetwork;
            }
            str = getRevenue;
            Intrinsics.checkNotNull(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }
}
