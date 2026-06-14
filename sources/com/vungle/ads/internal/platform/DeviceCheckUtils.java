package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.provider.Settings;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/platform/DeviceCheckUtils;", "", "()V", "getSensorCount", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "hasSystemAlertWindowPermission", "", "isEmulator", "isProxyEnabled", "isVpnConnected", "isEnabled", "Landroid/net/ProxyInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceCheckUtils {

    @NotNull
    public static final DeviceCheckUtils INSTANCE = new DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    private final boolean isEnabled(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !Intrinsics.areEqual(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final int getSensorCount(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isEmulator() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.platform.DeviceCheckUtils.isEmulator():boolean");
    }

    public final boolean isProxyEnabled(@NotNull Context context) {
        Object objB;
        boolean zIsEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.f93230c;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objB = Result.b(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.i(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final boolean isVpnConnected(@NotNull Context context) {
        Object objB;
        boolean z10 = true;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.f93230c;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
            int length = allNetworks.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i10]);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            objB = Result.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.i(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
