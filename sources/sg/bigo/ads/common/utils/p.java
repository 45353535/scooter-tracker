package sg.bigo.ads.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f102821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f102822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f102823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f102824d;

    public static long a() {
        if (System.currentTimeMillis() - f102822b > 60000) {
            f102821a = e();
            f102822b = System.currentTimeMillis();
        }
        return f102821a;
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.totalMem, 3);
    }

    public static int c(Context context) {
        try {
            return (int) Math.min(15728640L, (((long) ((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass()) / 8) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    private static ActivityManager.MemoryInfo d(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    private static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "StorageUtils", "getExternalStorageRemainSpace" + th2.getMessage());
            return 0L;
        }
    }

    private static long f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.availMem, 3);
    }

    public static boolean b() {
        return f() > ServiceProvider.HTTP_CACHE_DISK_SIZE;
    }

    public static long c() {
        if (System.currentTimeMillis() - f102824d > 60000) {
            try {
                f102823c = f();
            } catch (Throwable th2) {
                sg.bigo.ads.common.t.a.a(0, "StorageUtils", th2.toString());
            }
            f102824d = System.currentTimeMillis();
        }
        return f102823c;
    }

    public static File d() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    public static <T> Set<T> a(final int i10) {
        return Collections.newSetFromMap(new LinkedHashMap<T, Boolean>() { // from class: sg.bigo.ads.common.utils.p.1
            @Override // java.util.LinkedHashMap
            protected final boolean removeEldestEntry(Map.Entry<T, Boolean> entry) {
                return size() > i10;
            }
        });
    }
}
