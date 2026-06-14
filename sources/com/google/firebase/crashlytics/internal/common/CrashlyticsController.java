package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.sessions.api.CrashEventReceiver;
import com.ironsource.C4240b4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
class CrashlyticsController {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final FilenameFilter f31999t = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Charset f32000u = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataCollectionArbiter f32002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CrashlyticsFileMarker f32003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UserMetadata f32004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CrashlyticsWorkers f32005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IdManager f32006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FileStore f32007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppData f32008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LogFileManager f32009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CrashlyticsNativeComponent f32010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AnalyticsEventLogger f32011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CrashlyticsAppQualitySessionsSubscriber f32012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SessionReportingCoordinator f32013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CrashlyticsUncaughtExceptionHandler f32014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SettingsProvider f32015o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final TaskCompletionSource f32016p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final TaskCompletionSource f32017q = new TaskCompletionSource();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final TaskCompletionSource f32018r = new TaskCompletionSource();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicBoolean f32019s = new AtomicBoolean(false);

    CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        this.f32001a = context;
        this.f32006f = idManager;
        this.f32002b = dataCollectionArbiter;
        this.f32007g = fileStore;
        this.f32003c = crashlyticsFileMarker;
        this.f32008h = appData;
        this.f32004d = userMetadata;
        this.f32009i = logFileManager;
        this.f32010j = crashlyticsNativeComponent;
        this.f32011k = analyticsEventLogger;
        this.f32012l = crashlyticsAppQualitySessionsSubscriber;
        this.f32013m = sessionReportingCoordinator;
        this.f32005e = crashlyticsWorkers;
    }

    private static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C() {
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.f32013m.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    private static long D() {
        return G(System.currentTimeMillis());
    }

    static List E(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File sessionFile = fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        File sessionFile2 = fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        File sessionFile3 = fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", com.taurusx.tax.g.b.f66095s, nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", C4240b4.i.G, nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(Q(nativeSessionFileProvider));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", sessionFile));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", UserMetadata.KEYDATA_FILENAME, sessionFile2));
        arrayList.add(new FileBackedNativeSessionFile("rollouts_file", "rollouts", sessionFile3));
        return arrayList;
    }

    private InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        Logger.getLogger().w("Couldn't get Class Loader");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long G(long j10) {
        return j10 / 1000;
    }

    private Task M(final long j10) {
        if (B()) {
            Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", j10);
                CrashlyticsController.this.f32011k.logEvent("_ae", bundle);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger.getLogger().w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean P(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            Logger.getLogger().w("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            Logger.getLogger().i("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && applicationExitInfo == null;
    }

    private static NativeSessionFile Q(NativeSessionFileProvider nativeSessionFileProvider) {
        File minidumpFile = nativeSessionFileProvider.getMinidumpFile();
        return (minidumpFile == null || !minidumpFile.exists()) ? new BytesBackedNativeSessionFile("minidump_file", "minidump", new byte[]{0}) : new FileBackedNativeSessionFile("minidump_file", "minidump", minidumpFile);
    }

    private static byte[] S(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private Task a0() {
        if (this.f32002b.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            this.f32016p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        Logger.getLogger().d("Automatic data collection is disabled.");
        Logger.getLogger().v("Notifying that unsent reports are available.");
        this.f32016p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> taskOnSuccessTask = this.f32002b.waitForAutomaticDataCollectionEnabled().onSuccessTask(new SuccessContinuation<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task<Boolean> then(@Nullable Void r12) throws Exception {
                return Tasks.forResult(Boolean.TRUE);
            }
        });
        Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        return CrashlyticsTasks.race(taskOnSuccessTask, this.f32017q.getTask());
    }

    private void b0(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            Logger.getLogger().v("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f32001a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f32013m.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, new LogFileManager(this.f32007g, str), UserMetadata.loadFromExistingSession(str, this.f32007g, this.f32005e));
        } else {
            Logger.getLogger().v("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static StaticSessionData.AppData o(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    private static StaticSessionData.DeviceData p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.calculateTotalRamInBytes(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static StaticSessionData.OsData q() {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(boolean z10, SettingsProvider settingsProvider, boolean z11) {
        String str;
        CrashlyticsWorkers.checkBackgroundThread();
        ArrayList arrayList = new ArrayList(this.f32013m.listSortedOpenSessionIds());
        if (arrayList.size() <= z10) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            b0(str2);
        } else {
            Logger.getLogger().v("ANR feature disabled.");
        }
        if (z11 && this.f32010j.hasCrashDataForSession(str2)) {
            z(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f32012l.setSessionId(null);
            str = null;
        }
        this.f32013m.finalizeSessions(D(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, Boolean bool) {
        long jD = D();
        Logger.getLogger().d("Opening a new session with ID " + str);
        this.f32010j.prepareNativeSession(str, String.format(Locale.US, "Crashlytics Android SDK/%s", CrashlyticsCore.getVersion()), jD, StaticSessionData.create(o(this.f32006f, this.f32008h), q(), p(this.f32001a)));
        if (bool.booleanValue() && str != null) {
            this.f32004d.setNewSession(str);
        }
        this.f32009i.setCurrentSession(str);
        this.f32012l.setSessionId(str);
        this.f32013m.onBeginSession(str, jD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(long j10) {
        try {
            if (this.f32007g.getCommonFile(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Logger.getLogger().w("Could not create app exception marker file.", e10);
        }
    }

    private void z(String str) {
        Logger.getLogger().v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.f32010j.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (P(str, minidumpFile, applicationExitInto)) {
            Logger.getLogger().w("No native core present");
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.f32007g, str);
        File nativeSessionDir = this.f32007g.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(jLastModified);
        List<NativeSessionFile> listE = E(sessionFileProvider, str, this.f32007g, logFileManager.getBytesForLog());
        NativeSessionFileGzipper.b(nativeSessionDir, listE);
        Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
        this.f32013m.finalizeSessionWithNativeEvent(str, listE, applicationExitInto);
        logFileManager.clearLog();
    }

    boolean A(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        if (K()) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            v(true, settingsProvider, true);
            Logger.getLogger().v("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    String H() throws IOException {
        String versionControlInfo = CommonUtils.getVersionControlInfo(this.f32001a);
        if (versionControlInfo != null) {
            Logger.getLogger().d("Read version control info from string resource");
            return Base64.encodeToString(versionControlInfo.getBytes(f32000u), 0);
        }
        InputStream inputStreamF = F("META-INF/version-control-info.textproto");
        if (inputStreamF == null) {
            if (inputStreamF != null) {
                inputStreamF.close();
            }
            Logger.getLogger().i("No version control information found");
            return null;
        }
        try {
            Logger.getLogger().d("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(S(inputStreamF), 0);
            inputStreamF.close();
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                inputStreamF.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    void I(SettingsProvider settingsProvider, Thread thread, Throwable th2) throws Throwable {
        J(settingsProvider, thread, th2, false);
    }

    synchronized void J(final SettingsProvider settingsProvider, final Thread thread, final Throwable th2, final boolean z10) throws Throwable {
        Throwable th3;
        try {
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            Logger.getLogger().d("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
            if (!z10) {
                try {
                    CrashEventReceiver.notifyCrashOccurred();
                } catch (Throwable th5) {
                    th3 = th5;
                    throw th3;
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            Task taskSubmitTask = this.f32005e.common.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Task<Void> call() throws Exception {
                    long jG = CrashlyticsController.G(jCurrentTimeMillis);
                    final String strC = CrashlyticsController.this.C();
                    if (strC == null) {
                        Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                        return Tasks.forResult(null);
                    }
                    CrashlyticsController.this.f32003c.create();
                    CrashlyticsController.this.f32013m.persistFatalEvent(th2, thread, strC, jG);
                    CrashlyticsController.this.x(jCurrentTimeMillis);
                    CrashlyticsController.this.u(settingsProvider);
                    CrashlyticsController.this.w(new CLSUUID().getSessionId(), Boolean.valueOf(z10));
                    return !CrashlyticsController.this.f32002b.isAutomaticDataCollectionEnabled() ? Tasks.forResult(null) : settingsProvider.getSettingsAsync().onSuccessTask(CrashlyticsController.this.f32005e.common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        @NonNull
                        public Task<Void> then(@Nullable Settings settings) throws Exception {
                            if (settings != null) {
                                return Tasks.whenAll((Task<?>[]) new Task[]{CrashlyticsController.this.N(), CrashlyticsController.this.f32013m.sendReports(CrashlyticsController.this.f32005e.common, z10 ? strC : null)});
                            }
                            Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                            return Tasks.forResult(null);
                        }
                    });
                }
            });
            if (!z10) {
                try {
                    Utils.awaitEvenIfOnMainThread(taskSubmitTask);
                } catch (TimeoutException unused) {
                    Logger.getLogger().e("Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e10) {
                    Logger.getLogger().e("Error handling uncaught exception", e10);
                }
            }
        } catch (Throwable th6) {
            th = th6;
            th3 = th;
            throw th3;
        }
    }

    boolean K() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.f32014n;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.a();
    }

    List L() {
        return this.f32007g.getCommonFiles(f31999t);
    }

    void O(Thread thread, Throwable th2) {
        SettingsProvider settingsProvider = this.f32015o;
        if (settingsProvider == null) {
            Logger.getLogger().w("settingsProvider not set");
        } else {
            J(settingsProvider, thread, th2, true);
        }
    }

    void R(final String str) {
        this.f32005e.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f32108b.w(str, Boolean.FALSE);
            }
        });
    }

    void T() {
        try {
            String strH = H();
            if (strH != null) {
                X("com.crashlytics.version-control-info", strH);
                Logger.getLogger().i("Saved version control info");
            }
        } catch (IOException e10) {
            Logger.getLogger().w("Unable to save version control info", e10);
        }
    }

    Task U() {
        this.f32017q.trySetResult(Boolean.TRUE);
        return this.f32018r.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(String str, String str2) {
        try {
            this.f32004d.setCustomKey(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f32001a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e10;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(Map map) {
        this.f32004d.setCustomKeys(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(String str, String str2) {
        try {
            this.f32004d.setInternalKey(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f32001a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e10;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(String str) {
        this.f32004d.setUserId(str);
    }

    void Z(final Task task) {
        if (this.f32013m.hasReportsToSend()) {
            Logger.getLogger().v("Crash reports are available to be sent.");
            a0().onSuccessTask(this.f32005e.common, new SuccessContinuation<Boolean, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
                @Override // com.google.android.gms.tasks.SuccessContinuation
                @NonNull
                public Task<Void> then(@Nullable Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        Logger.getLogger().d("Sending cached crash reports...");
                        CrashlyticsController.this.f32002b.grantDataCollectionPermission(bool.booleanValue());
                        return task.onSuccessTask(CrashlyticsController.this.f32005e.common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            @NonNull
                            public Task<Void> then(@Nullable Settings settings) throws Exception {
                                if (settings == null) {
                                    Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                                    return Tasks.forResult(null);
                                }
                                CrashlyticsController.this.N();
                                CrashlyticsController.this.f32013m.sendReports(CrashlyticsController.this.f32005e.common);
                                CrashlyticsController.this.f32018r.trySetResult(null);
                                return Tasks.forResult(null);
                            }
                        });
                    }
                    Logger.getLogger().v("Deleting cached crash reports...");
                    CrashlyticsController.r(CrashlyticsController.this.L());
                    CrashlyticsController.this.f32013m.removeAllReports();
                    CrashlyticsController.this.f32018r.trySetResult(null);
                    return Tasks.forResult(null);
                }
            });
        } else {
            Logger.getLogger().v("No crash reports are available to be sent.");
            this.f32016p.trySetResult(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(Thread thread, Throwable th2, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (K()) {
            return;
        }
        long jG = G(jCurrentTimeMillis);
        String strC = C();
        if (strC == null) {
            Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f32013m.persistNonFatalEvent(th2, thread, new EventMetadata(strC, jG, map));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(long j10, String str) {
        if (K()) {
            return;
        }
        this.f32009i.writeToLog(j10, str);
    }

    Task n() {
        if (this.f32019s.compareAndSet(false, true)) {
            return this.f32016p.getTask();
        }
        Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    Task s() {
        this.f32017q.trySetResult(Boolean.FALSE);
        return this.f32018r.getTask();
    }

    boolean t() {
        CrashlyticsWorkers.checkBackgroundThread();
        if (!this.f32003c.isPresent()) {
            String strC = C();
            return strC != null && this.f32010j.hasCrashDataForSession(strC);
        }
        Logger.getLogger().v("Found previous crash marker.");
        this.f32003c.remove();
        return true;
    }

    void u(SettingsProvider settingsProvider) {
        v(false, settingsProvider, false);
    }

    void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.f32015o = settingsProvider;
        R(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(@NonNull SettingsProvider settingsProvider2, @NonNull Thread thread, @NonNull Throwable th2) throws Throwable {
                CrashlyticsController.this.I(settingsProvider2, thread, th2);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.f32010j);
        this.f32014n = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }
}
