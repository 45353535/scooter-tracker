package org.bidon.sdk.databinders.session;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.ironsource.V5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J \u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0002J\b\u0010/\u001a\u00020\rH\u0002J\u0010\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\rH\u0002J\u0010\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\rH\u0002J\u0010\u00103\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\rH\u0002J\u0010\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u001aH\u0002J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lorg/bidon/sdk/databinders/session/SessionDataSourceImpl;", "Lorg/bidon/sdk/databinders/session/SessionDataSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "sessionTracker", "Lorg/bidon/sdk/databinders/session/SessionTracker;", "<init>", "(Landroid/content/Context;Lorg/bidon/sdk/databinders/session/SessionTracker;)V", "weakActivityManager", "Ljava/lang/ref/WeakReference;", "Landroid/app/ActivityManager;", "maxCpuFrequency", "", "", "", "minCpuFrequency", "totalStorageSize", "", "totalRamSize", "coreCount", "getStorageFree", "getStorageUsed", "getRamSize", "getRamUsed", "getCpuUsage", "getId", "", "getLaunchTs", "getLaunchMonotonicTs", "getStartTs", "getMonotonicStartTs", "getTs", "getMonotonicTs", "getMemoryWarningsTs", "", "getMemoryWarningsMonotonicTs", "getBattery", "getBatteryIntent", "Landroid/content/Intent;", "getMemoryInfo", "Landroid/app/ActivityManager$MemoryInfo;", "getStorageSize", "getActivityManager", "getAverageClock", "currentFreqSum", "minFreqSum", "maxFreqSum", "getNumCores", "getCurCpuFreq", "coreNum", "getMaxCpuFreq", "getMinCpuFreq", "readIntegerFile", V5.c.f41893c, "close", "", "closeable", "Ljava/io/Closeable;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SessionDataSourceImpl implements SessionDataSource {

    @NotNull
    private final Context context;
    private int coreCount;

    @NotNull
    private final Map<Integer, Float> maxCpuFrequency;

    @NotNull
    private final Map<Integer, Float> minCpuFrequency;

    @NotNull
    private final SessionTracker sessionTracker;
    private long totalRamSize;
    private long totalStorageSize;

    @Nullable
    private WeakReference<ActivityManager> weakActivityManager;

    public SessionDataSourceImpl(@NotNull Context context, @NotNull SessionTracker sessionTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionTracker, "sessionTracker");
        this.context = context;
        this.sessionTracker = sessionTracker;
        this.maxCpuFrequency = new HashMap();
        this.minCpuFrequency = new HashMap();
    }

    private final void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                LogExtKt.logError("SessionDataSource", message, th2);
            }
        }
    }

    private final ActivityManager getActivityManager(Context context) {
        ActivityManager activityManager;
        WeakReference<ActivityManager> weakReference = this.weakActivityManager;
        if (weakReference != null && (activityManager = weakReference.get()) != null) {
            return activityManager;
        }
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager2 = (ActivityManager) systemService;
        this.weakActivityManager = new WeakReference<>(activityManager2);
        return activityManager2;
    }

    private final float getAverageClock(float currentFreqSum, float minFreqSum, float maxFreqSum) {
        float f10 = maxFreqSum - minFreqSum;
        if (f10 > 0.0f && maxFreqSum >= 0.0f) {
            return (currentFreqSum - minFreqSum) / f10;
        }
        return 0.0f;
    }

    private final Intent getBatteryIntent(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private final float getCurCpuFreq(int coreNum) {
        a1 a1Var = a1.f93282a;
        String str = String.format("/sys/devices/system/cpu/cpu%s/cpufreq/scaling_cur_freq", Arrays.copyOf(new Object[]{Integer.valueOf(coreNum)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return readIntegerFile(str);
    }

    private final float getMaxCpuFreq(int coreNum) {
        Map<Integer, Float> map = this.maxCpuFrequency;
        if (map.containsKey(Integer.valueOf(coreNum))) {
            Float f10 = map.get(Integer.valueOf(coreNum));
            if (f10 != null) {
                return f10.floatValue();
            }
            return 0.0f;
        }
        a1 a1Var = a1.f93282a;
        String str = String.format("/sys/devices/system/cpu/cpu%s/cpufreq/cpuinfo_max_freq", Arrays.copyOf(new Object[]{Integer.valueOf(coreNum)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        float integerFile = readIntegerFile(str);
        if (integerFile > 0.0f) {
            map.put(Integer.valueOf(coreNum), Float.valueOf(integerFile));
        }
        return integerFile;
    }

    private final ActivityManager.MemoryInfo getMemoryInfo(Context context) {
        ActivityManager activityManager = getActivityManager(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    private final float getMinCpuFreq(int coreNum) {
        Map<Integer, Float> map = this.minCpuFrequency;
        if (map.containsKey(Integer.valueOf(coreNum))) {
            Float f10 = map.get(Integer.valueOf(coreNum));
            if (f10 != null) {
                return f10.floatValue();
            }
            return 0.0f;
        }
        a1 a1Var = a1.f93282a;
        String str = String.format("/sys/devices/system/cpu/cpu%s/cpufreq/cpuinfo_min_freq", Arrays.copyOf(new Object[]{Integer.valueOf(coreNum)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        float integerFile = readIntegerFile(str);
        if (integerFile > 0.0f) {
            map.put(Integer.valueOf(coreNum), Float.valueOf(integerFile));
        }
        return integerFile;
    }

    private final int getNumCores() {
        Integer numValueOf = Integer.valueOf(this.coreCount);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: org.bidon.sdk.databinders.session.a
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return SessionDataSourceImpl.getNumCores$lambda$4(file);
                }
            });
            int length = fileArrListFiles != null ? fileArrListFiles.length : Runtime.getRuntime().availableProcessors();
            this.coreCount = length;
            return length;
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, th2);
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            this.coreCount = iAvailableProcessors;
            return iAvailableProcessors;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getNumCores$lambda$4(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }

    private final long getStorageSize() {
        try {
            if (this.totalStorageSize == 0) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                this.totalStorageSize = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, th2);
        }
        return this.totalStorageSize;
    }

    private final float readIntegerFile(String filePath) {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Closeable closeable = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader, 1024);
                    try {
                        String line = bufferedReader.readLine();
                        if (!TextUtils.isEmpty(line)) {
                            float f10 = Float.parseFloat(line);
                            close(fileInputStream);
                            close(inputStreamReader);
                            close(bufferedReader);
                            return f10;
                        }
                        close(fileInputStream);
                    } catch (Throwable unused) {
                        closeable = fileInputStream;
                        close(closeable);
                    }
                } catch (Throwable unused2) {
                    bufferedReader = null;
                }
            } catch (Throwable unused3) {
                inputStreamReader = null;
                bufferedReader = null;
            }
        } catch (Throwable unused4) {
            inputStreamReader = null;
            bufferedReader = null;
        }
        close(inputStreamReader);
        close(bufferedReader);
        return 0.0f;
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public float getBattery() {
        try {
            Intent batteryIntent = getBatteryIntent(this.context);
            if (batteryIntent == null) {
                return -1.0f;
            }
            int intExtra = batteryIntent.getIntExtra("level", -1);
            int intExtra2 = batteryIntent.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return -1.0f;
            }
            return (intExtra / intExtra2) * 100.0f;
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, th2);
            return -1.0f;
        }
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public float getCpuUsage() {
        try {
            int numCores = getNumCores();
            float curCpuFreq = 0.0f;
            float minCpuFreq = 0.0f;
            float maxCpuFreq = 0.0f;
            for (int i10 = 0; i10 < numCores; i10++) {
                curCpuFreq += getCurCpuFreq(i10);
                minCpuFreq += getMinCpuFreq(i10);
                maxCpuFreq += getMaxCpuFreq(i10);
            }
            return getAverageClock(curCpuFreq, minCpuFreq, maxCpuFreq);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, th2);
            return 0.0f;
        }
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    @NotNull
    public String getId() {
        return this.sessionTracker.getSessionId();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getLaunchMonotonicTs() {
        return this.sessionTracker.getLaunchMonotonicTs();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getLaunchTs() {
        return this.sessionTracker.getLaunchTs();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    @NotNull
    public List<Long> getMemoryWarningsMonotonicTs() {
        return this.sessionTracker.getMemoryWarningsMonotonicTs();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    @NotNull
    public List<Long> getMemoryWarningsTs() {
        return this.sessionTracker.getMemoryWarningsTs();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getMonotonicStartTs() {
        return this.sessionTracker.getStartMonotonicTs();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getMonotonicTs() {
        return this.sessionTracker.getMonotonicTs();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getRamSize() {
        Long lValueOf = Long.valueOf(this.totalRamSize);
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        try {
            Long lValueOf2 = Long.valueOf(getMemoryInfo(this.context).totalMem);
            this.totalRamSize = lValueOf2.longValue();
            return lValueOf2.longValue();
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, e10);
            return 0L;
        }
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getRamUsed() {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            return ((long) memoryInfo.getTotalPss()) * 1024;
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, th2);
            return 0L;
        }
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getStartTs() {
        return this.sessionTracker.getStartTs();
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getStorageFree() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, th2);
            return 0L;
        }
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getStorageUsed() {
        try {
            return getStorageSize() - getStorageFree();
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("SessionDataSource", message, th2);
            return 0L;
        }
    }

    @Override // org.bidon.sdk.databinders.session.SessionDataSource
    public long getTs() {
        return this.sessionTracker.getTs();
    }
}
