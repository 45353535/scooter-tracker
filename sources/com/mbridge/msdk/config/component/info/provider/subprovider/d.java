package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ironsource.C4240b4;
import com.ironsource.X1;
import com.mbridge.msdk.foundation.tools.q0;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f46894a = "OtherDeviceInfoProvider";

    public Map<String, Object> a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long totalBytes = statFs.getTotalBytes();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            HashMap map = new HashMap();
            map.put("totalSpace", Long.valueOf(totalBytes));
            map.put("freeExternalSize", Long.valueOf(availableBlocksLong));
            return map;
        } catch (Throwable th2) {
            q0.b(f46894a, th2.getMessage(), th2);
            return null;
        }
    }

    public String b(Context context) {
        if (context == null) {
            return X1.f42014f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? X1.f42014f : str;
        } catch (Throwable th2) {
            q0.b(f46894a, th2.getMessage());
            return X1.f42014f;
        }
    }

    public float c(Context context) {
        if (context == null) {
            return -1.0f;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th2) {
            q0.b(f46894a, th2.getMessage());
        }
        return -1.0f;
    }

    public int d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
        } catch (Throwable th2) {
            q0.b(f46894a, th2.getMessage());
            return -1;
        }
    }

    public String b() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (Throwable th2) {
            q0.b(f46894a, th2.getMessage(), th2);
            return "";
        }
    }

    public Map<String, Object> a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        HashMap map = new HashMap();
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            int i10 = (intExtra == -1 || intExtra2 == -1) ? -1 : (intExtra * 100) / intExtra2;
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            map.put(C4240b4.j.Y, Integer.valueOf(i10));
            map.put("charging", Integer.valueOf(intExtra3 == 2 ? 1 : 2));
        }
        return map;
    }
}
