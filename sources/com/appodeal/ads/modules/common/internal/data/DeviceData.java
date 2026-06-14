package com.appodeal.ads.modules.common.internal.data;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\nH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\nH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "", "isConnected", "", "getOsBuildVersion", "", "isDeviceRooted", "getBrandName", "getModelName", "getTotalFreeRam", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getAppRamSize", "getStorageFree", "getStorageSize", "getDeviceName", "getDeviceLanguage", "getTimeZone", "getTimeStamp", "getLowRamMemoryStatus", "isDeviceEmulator", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DeviceData {
    long getAppRamSize(Context context);

    String getBrandName();

    String getDeviceLanguage();

    String getDeviceName(Context context);

    boolean getLowRamMemoryStatus(Context context);

    String getModelName();

    String getOsBuildVersion();

    long getStorageFree();

    long getStorageSize();

    long getTimeStamp();

    String getTimeZone();

    long getTotalFreeRam(Context context);

    boolean isConnected();

    boolean isDeviceEmulator();

    boolean isDeviceRooted();
}
