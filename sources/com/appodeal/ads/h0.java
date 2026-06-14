package com.appodeal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.appodeal.ads.modules.common.internal.data.DeviceData;
import com.appodeal.ads.network.NetworkStatus;
import com.appodeal.ads.utils.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 implements DeviceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f13362a = new h0();

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final long getAppRamSize(Context context) {
        return j2.s(context);
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final String getBrandName() {
        return Build.MANUFACTURER;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final String getDeviceLanguage() {
        HashMap map = j2.f13491a;
        return Locale.getDefault().getLanguage();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final String getDeviceName(Context context) {
        return j2.m(context);
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final boolean getLowRamMemoryStatus(Context context) {
        try {
            ActivityManager activityManagerD = j2.d(context);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerD.getMemoryInfo(memoryInfo);
            return memoryInfo.lowMemory;
        } catch (Throwable th2) {
            Log.log(th2);
            return false;
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final String getModelName() {
        return Build.MODEL;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final String getOsBuildVersion() {
        return Build.DISPLAY;
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final long getStorageFree() {
        return j2.n();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final long getStorageSize() {
        return j2.p();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final long getTimeStamp() {
        return System.currentTimeMillis();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final String getTimeZone() {
        HashMap map = j2.f13491a;
        return TimeZone.getDefault().getID();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final long getTotalFreeRam(Context context) {
        try {
            ActivityManager activityManagerD = j2.d(context);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerD.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Throwable th2) {
            Log.log(th2);
            return 0L;
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final boolean isConnected() {
        HashMap map = j2.f13491a;
        return NetworkStatus.INSTANCE.isConnected();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final boolean isDeviceEmulator() {
        return j2.y();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.DeviceData
    public final boolean isDeviceRooted() {
        return j2.A();
    }
}
