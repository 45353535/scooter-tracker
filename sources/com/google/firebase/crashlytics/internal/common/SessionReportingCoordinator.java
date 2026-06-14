package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public class SessionReportingCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CrashlyticsReportDataCapture f32100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CrashlyticsReportPersistence f32101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DataTransportCrashlyticsReportSender f32102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LogFileManager f32103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UserMetadata f32104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IdManager f32105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CrashlyticsWorkers f32106g;

    SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.f32100a = crashlyticsReportDataCapture;
        this.f32101b = crashlyticsReportPersistence;
        this.f32102c = dataTransportCrashlyticsReportSender;
        this.f32103d = logFileManager;
        this.f32104e = userMetadata;
        this.f32105f = idManager;
        this.f32106g = crashlyticsWorkers;
    }

    public static /* synthetic */ void a(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z10) {
        sessionReportingCoordinator.getClass();
        Logger.getLogger().d("disk worker: log non-fatal event to persistence");
        sessionReportingCoordinator.f32101b.persistEvent(event, eventMetadata.getSessionId(), z10);
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
                bufferedInputStream.close();
                throw th2;
            }
        } finally {
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager, crashlyticsWorkers);
    }

    private CrashlyticsReport.Session.Event d(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        return e(event, logFileManager, userMetadata, Collections.EMPTY_MAP);
    }

    private CrashlyticsReport.Session.Event e(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata, Map map) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> listK = k(userMetadata.getCustomKeys(map));
        List<CrashlyticsReport.CustomAttribute> listK2 = k(userMetadata.getInternalKeys());
        if (!listK.isEmpty() || !listK2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(listK).setInternalKeys(listK2).build());
        }
        return builder.build();
    }

    private CrashlyticsReport.Session.Event f(CrashlyticsReport.Session.Event event, Map map) {
        return g(e(event, this.f32103d, this.f32104e, map), this.f32104e);
    }

    private CrashlyticsReport.Session.Event g(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutsState = userMetadata.getRolloutsState();
        if (rolloutsState.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        builder.setRollouts(CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
        return builder.build();
    }

    private static CrashlyticsReport.ApplicationExitInfo h(ApplicationExitInfo applicationExitInfo) {
        String strConvertInputStreamToString = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strConvertInputStreamToString = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e10) {
            Logger.getLogger().w("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(strConvertInputStreamToString).build();
    }

    private CrashlyticsReportWithSessionId i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.getReport().getFirebaseInstallationId() != null && crashlyticsReportWithSessionId.getReport().getFirebaseAuthenticationToken() != null) {
            return crashlyticsReportWithSessionId;
        }
        FirebaseInstallationId firebaseInstallationIdFetchTrueFid = this.f32105f.fetchTrueFid(true);
        return CrashlyticsReportWithSessionId.create(crashlyticsReportWithSessionId.getReport().withFirebaseInstallationId(firebaseInstallationIdFetchTrueFid.getFid()).withFirebaseAuthenticationToken(firebaseInstallationIdFetchTrueFid.getAuthToken()), crashlyticsReportWithSessionId.getSessionId(), crashlyticsReportWithSessionId.getReportFile());
    }

    private ApplicationExitInfo j(String str, List list) {
        long startTimestampMillis = this.f32101b.getStartTimestampMillis(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.j.a(it.next());
            if (applicationExitInfoA.getTimestamp() < startTimestampMillis) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static List k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey((String) entry.getKey()).setValue((String) entry.getValue()).build());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.t
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((CrashlyticsReport.CustomAttribute) obj2).getKey());
            }
        });
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(Task task) {
        if (!task.isSuccessful()) {
            Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.getResult();
        Logger.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        File reportFile = crashlyticsReportWithSessionId.getReportFile();
        if (reportFile.delete()) {
            Logger.getLogger().d("Deleted report file: " + reportFile.getPath());
            return true;
        }
        Logger.getLogger().w("Crashlytics could not delete report file: " + reportFile.getPath());
        return true;
    }

    private void m(Throwable th2, Thread thread, String str, final EventMetadata eventMetadata, boolean z10) {
        final boolean zEquals = str.equals("crash");
        final CrashlyticsReport.Session.Event eventF = f(this.f32100a.captureEventData(th2, thread, str, eventMetadata.getTimestamp(), 4, 8, z10), eventMetadata.getAdditionalCustomKeys());
        if (z10) {
            this.f32101b.persistEvent(eventF, eventMetadata.getSessionId(), zEquals);
        } else {
            this.f32106g.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.r
                @Override // java.lang.Runnable
                public final void run() {
                    SessionReportingCoordinator.a(this.f32137b, eventF, eventMetadata, zEquals);
                }
            });
        }
    }

    public void finalizeSessionWithNativeEvent(@NonNull String str, @NonNull List<NativeSessionFile> list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<NativeSessionFile> it = list.iterator();
        while (it.hasNext()) {
            CrashlyticsReport.FilesPayload.File fileAsFilePayload = it.next().asFilePayload();
            if (fileAsFilePayload != null) {
                arrayList.add(fileAsFilePayload);
            }
        }
        this.f32101b.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(DesugarCollections.unmodifiableList(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j10, @Nullable String str) {
        this.f32101b.finalizeReports(str, j10);
    }

    public boolean hasReportsToSend() {
        return this.f32101b.hasFinalizedReports();
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.f32101b.getOpenSessionIds();
    }

    public void onBeginSession(@NonNull String str, long j10) {
        this.f32101b.persistReport(this.f32100a.captureReportData(str, j10));
    }

    public void persistFatalEvent(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, long j10) {
        Logger.getLogger().v("Persisting fatal event for session " + str);
        m(th2, thread, "crash", new EventMetadata(str, j10), true);
    }

    public void persistNonFatalEvent(@NonNull Throwable th2, @NonNull Thread thread, @NonNull EventMetadata eventMetadata) {
        Logger.getLogger().v("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        m(th2, thread, "error", eventMetadata, false);
    }

    @RequiresApi(api = 30)
    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo applicationExitInfoJ = j(str, list);
        if (applicationExitInfoJ == null) {
            Logger.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event eventCaptureAnrEventData = this.f32100a.captureAnrEventData(h(applicationExitInfoJ));
        Logger.getLogger().d("Persisting anr for session " + str);
        this.f32101b.persistEvent(g(d(eventCaptureAnrEventData, logFileManager, userMetadata), userMetadata), str, true);
    }

    public void removeAllReports() {
        this.f32101b.deleteAllReports();
    }

    public Task<Void> sendReports(@NonNull Executor executor) {
        return sendReports(executor, null);
    }

    public Task<Void> sendReports(@NonNull Executor executor, @Nullable String str) {
        List<CrashlyticsReportWithSessionId> listLoadFinalizedReports = this.f32101b.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : listLoadFinalizedReports) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.getSessionId())) {
                arrayList.add(this.f32102c.enqueueReport(i(crashlyticsReportWithSessionId), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.s
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f32141a.l(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
