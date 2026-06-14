package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsReportDataCapture {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f32053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f32054h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdManager f32056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppData f32057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StackTraceTrimmingStrategy f32058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SettingsProvider f32059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ProcessDetailsProvider f32060f = ProcessDetailsProvider.INSTANCE;

    static {
        HashMap map = new HashMap();
        f32053g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f32054h = String.format(Locale.US, "Crashlytics Android SDK/%s", BuildConfig.VERSION_NAME);
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider) {
        this.f32055a = context;
        this.f32056b = idManager;
        this.f32057c = appData;
        this.f32058d = stackTraceTrimmingStrategy;
        this.f32059e = settingsProvider;
    }

    private CrashlyticsReport.ApplicationExitInfo a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> listUnmodifiableList;
        if (!this.f32059e.getSettingsSync().featureFlagData.collectBuildIds || this.f32057c.buildIdInfoList.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (BuildIdInfo buildIdInfo : this.f32057c.buildIdInfoList) {
                arrayList.add(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder().setLibraryName(buildIdInfo.getLibraryName()).setArch(buildIdInfo.getArch()).setBuildId(buildIdInfo.getBuildId()).build());
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReasonCode()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(applicationExitInfo.getTraceFile()).setBuildIdMappingForArch(listUnmodifiableList).build();
    }

    private CrashlyticsReport.Builder b() {
        return CrashlyticsReport.builder().setSdkVersion(BuildConfig.VERSION_NAME).setGmpAppId(this.f32057c.googleAppId).setInstallationUuid(this.f32056b.getInstallIds().getCrashlyticsInstallId()).setFirebaseInstallationId(this.f32056b.getInstallIds().getFirebaseInstallationId()).setFirebaseAuthenticationToken(this.f32056b.getInstallIds().getFirebaseAuthenticationToken()).setBuildVersion(this.f32057c.versionCode).setDisplayVersion(this.f32057c.versionName).setPlatform(4);
    }

    private static long c(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int d() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f32053g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.BinaryImage e() {
        return CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder().setBaseAddress(0L).setSize(0L).setName(this.f32057c.packageName).setUuid(this.f32057c.buildId).build();
    }

    private List f() {
        return Collections.singletonList(e());
    }

    private CrashlyticsReport.Session.Event.Application g(int i10, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(Boolean.valueOf(applicationExitInfo.getImportance() != 100)).setCurrentProcessDetails(x(applicationExitInfo)).setUiOrientation(i10).setExecution(l(applicationExitInfo)).build();
    }

    private CrashlyticsReport.Session.Event.Application h(int i10, TrimmedThrowableData trimmedThrowableData, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails = this.f32060f.getCurrentProcessDetails(this.f32055a);
        if (currentProcessDetails.getImportance() > 0) {
            boolValueOf = Boolean.valueOf(currentProcessDetails.getImportance() != 100);
        } else {
            boolValueOf = null;
        }
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(boolValueOf).setCurrentProcessDetails(currentProcessDetails).setAppProcessDetails(this.f32060f.getAppProcessDetails(this.f32055a)).setUiOrientation(i10).setExecution(m(trimmedThrowableData, thread, i11, i12, z10)).build();
    }

    private CrashlyticsReport.Session.Event.Device i(int i10) {
        BatteryState batteryState = BatteryState.get(this.f32055a);
        Float batteryLevel = batteryState.getBatteryLevel();
        Double dValueOf = batteryLevel != null ? Double.valueOf(batteryLevel.doubleValue()) : null;
        int batteryVelocity = batteryState.getBatteryVelocity();
        boolean proximitySensorEnabled = CommonUtils.getProximitySensorEnabled(this.f32055a);
        return CrashlyticsReport.Session.Event.Device.builder().setBatteryLevel(dValueOf).setBatteryVelocity(batteryVelocity).setProximityOn(proximitySensorEnabled).setOrientation(i10).setRamUsed(c(CommonUtils.calculateTotalRamInBytes(this.f32055a) - CommonUtils.calculateFreeRamInBytes(this.f32055a))).setDiskUsed(CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath())).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Exception j(TrimmedThrowableData trimmedThrowableData, int i10, int i11) {
        return k(trimmedThrowableData, i10, i11, 0);
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Exception k(TrimmedThrowableData trimmedThrowableData, int i10, int i11, int i12) {
        String str = trimmedThrowableData.className;
        String str2 = trimmedThrowableData.localizedMessage;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (i12 >= i11) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.cause;
                i13++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder overflowCount = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder().setType(str).setReason(str2).setFrames(o(stackTraceElementArr, i10)).setOverflowCount(i13);
        if (trimmedThrowableData2 != null && i13 == 0) {
            overflowCount.setCausedBy(k(trimmedThrowableData2, i10, i11, i12 + 1));
        }
        return overflowCount.build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution l(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setAppExitInfo(applicationExitInfo).setSignal(t()).setBinaries(f()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution m(TrimmedThrowableData trimmedThrowableData, Thread thread, int i10, int i11, boolean z10) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setThreads(w(trimmedThrowableData, thread, i10, z10)).setException(j(trimmedThrowableData, i10, i11)).setSignal(t()).setBinaries(f()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame n(StackTraceElement stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return builder.setPc(jMax).setSymbol(str).setFile(fileName).setOffset(lineNumber).build();
    }

    private List o(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(n(stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder().setImportance(i10)));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private CrashlyticsReport.Session.Application p() {
        return CrashlyticsReport.Session.Application.builder().setIdentifier(this.f32056b.getAppIdentifier()).setVersion(this.f32057c.versionCode).setDisplayVersion(this.f32057c.versionName).setInstallationUuid(this.f32056b.getInstallIds().getCrashlyticsInstallId()).setDevelopmentPlatform(this.f32057c.developmentPlatformProvider.getDevelopmentPlatform()).setDevelopmentPlatformVersion(this.f32057c.developmentPlatformProvider.getDevelopmentPlatformVersion()).build();
    }

    private CrashlyticsReport.Session q(String str, long j10) {
        return CrashlyticsReport.Session.builder().setStartedAt(j10).setIdentifier(str).setGenerator(f32054h).setApp(p()).setOs(s()).setDevice(r()).setGeneratorType(3).build();
    }

    private CrashlyticsReport.Session.Device r() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iD = d();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jCalculateTotalRamInBytes = CommonUtils.calculateTotalRamInBytes(this.f32055a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zIsEmulator = CommonUtils.isEmulator();
        int deviceState = CommonUtils.getDeviceState();
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.Session.Device.builder().setArch(iD).setModel(Build.MODEL).setCores(iAvailableProcessors).setRam(jCalculateTotalRamInBytes).setDiskSpace(blockCount).setSimulator(zIsEmulator).setState(deviceState).setManufacturer(str).setModelClass(Build.PRODUCT).build();
    }

    private CrashlyticsReport.Session.OperatingSystem s() {
        return CrashlyticsReport.Session.OperatingSystem.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(CommonUtils.isRooted()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Signal t() {
        return CrashlyticsReport.Session.Event.Application.Execution.Signal.builder().setName("0").setCode("0").setAddress(0L).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread u(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return v(thread, stackTraceElementArr, 0);
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread v(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread.getName()).setImportance(i10).setFrames(o(stackTraceElementArr, i10)).build();
    }

    private List w(TrimmedThrowableData trimmedThrowableData, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(v(thread, trimmedThrowableData.stacktrace, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(u(key, this.f32058d.getTrimmedStackTrace(entry.getValue())));
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private CrashlyticsReport.Session.Event.Application.ProcessDetails x(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return this.f32060f.buildProcessDetails(applicationExitInfo.getProcessName(), applicationExitInfo.getPid(), applicationExitInfo.getImportance());
    }

    public CrashlyticsReport.Session.Event captureAnrEventData(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i10 = this.f32055a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.builder().setType("anr").setTimestamp(applicationExitInfo.getTimestamp()).setApp(g(i10, a(applicationExitInfo))).setDevice(i(i10)).build();
    }

    public CrashlyticsReport.Session.Event captureEventData(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f32055a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.builder().setType(str).setTimestamp(j10).setApp(h(i12, TrimmedThrowableData.makeTrimmedThrowableData(th2, this.f32058d), thread, i10, i11, z10)).setDevice(i(i12)).build();
    }

    public CrashlyticsReport captureReportData(String str, long j10) {
        return b().setSession(q(str, j10)).build();
    }
}
