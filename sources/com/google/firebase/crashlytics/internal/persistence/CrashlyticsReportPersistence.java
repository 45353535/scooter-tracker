package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsReportPersistence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f32655e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f32656f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final CrashlyticsReportJsonTransform f32657g = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f32658h = new Comparator() { // from class: q3.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f32659i = new FilenameFilter() { // from class: q3.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f32660a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileStore f32661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SettingsProvider f32662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CrashlyticsAppQualitySessionsSubscriber f32663d;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f32661b = fileStore;
        this.f32662c = settingsProvider;
        this.f32663d = crashlyticsAppQualitySessionsSubscriber;
    }

    private SortedSet e(String str) {
        this.f32661b.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() > 8) {
            while (openSessionIds.size() > 8) {
                String strLast = openSessionIds.last();
                Logger.getLogger().d("Removing session over cap: " + strLast);
                this.f32661b.deleteSessionFiles(strLast);
                openSessionIds.remove(strLast);
            }
        }
        return openSessionIds;
    }

    private static int f(List list, int i10) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i10) {
                break;
            }
            FileStore.g(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f32662c.getSettingsSync().sessionData.maxCompleteSessionsCount;
        List listK = k();
        int size = listK.size();
        if (size <= i10) {
            return;
        }
        Iterator it = listK.subList(i10, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String j(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    private List k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f32661b.getPriorityReports());
        arrayList.addAll(this.f32661b.getNativeReports());
        Comparator comparator = f32658h;
        Collections.sort(arrayList, comparator);
        List<File> reports = this.f32661b.getReports();
        Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    private static String l(String str) {
        return str.substring(0, f32656f);
    }

    private static boolean m(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(File file, File file2) {
        return l(file.getName()).compareTo(l(file2.getName()));
    }

    private static String p(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f32655e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void q(File file, CrashlyticsReport.FilesPayload filesPayload, String str, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        String appQualitySessionId = this.f32663d.getAppQualitySessionId(str);
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f32657g;
            u(this.f32661b.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(p(file)).withNdkPayload(filesPayload).withApplicationExitInfo(applicationExitInfo).withAppQualitySessionId(appQualitySessionId)));
        } catch (IOException e10) {
            Logger.getLogger().w("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void r(String str, long j10) {
        boolean z10;
        List<File> sessionFiles = this.f32661b.getSessionFiles(str, f32659i);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().v("Session " + str + " has no events.");
            return;
        }
        Collections.sort(sessionFiles);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : sessionFiles) {
                try {
                    arrayList.add(f32657g.eventFromJson(p(file)));
                } catch (IOException e10) {
                    Logger.getLogger().w("Could not add event to report for " + file, e10);
                }
                if (z10 || m(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            s(this.f32661b.getSessionFile(str, Constants.REPORT), arrayList, j10, z10, UserMetadata.readUserId(str, this.f32661b), this.f32663d.getAppQualitySessionId(str));
        } else {
            Logger.getLogger().w("Could not parse event files for session " + str);
        }
    }

    private void s(File file, List list, long j10, boolean z10, String str, String str2) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f32657g;
            CrashlyticsReport crashlyticsReportWithEvents = crashlyticsReportJsonTransform.reportFromJson(p(file)).withSessionEndFields(j10, z10, str).withAppQualitySessionId(str2).withEvents(list);
            CrashlyticsReport.Session session = crashlyticsReportWithEvents.getSession();
            if (session == null) {
                return;
            }
            Logger.getLogger().d("appQualitySessionId: " + str2);
            u(z10 ? this.f32661b.getPriorityReport(session.getIdentifier()) : this.f32661b.getReport(session.getIdentifier()), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportWithEvents));
        } catch (IOException e10) {
            Logger.getLogger().w("Could not synthesize final report file for " + file, e10);
        }
    }

    private int t(String str, int i10) {
        List<File> sessionFiles = this.f32661b.getSessionFiles(str, new FilenameFilter() { // from class: q3.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return CrashlyticsReportPersistence.n(file, str2);
            }
        });
        Collections.sort(sessionFiles, new Comparator() { // from class: q3.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CrashlyticsReportPersistence.o((File) obj, (File) obj2);
            }
        });
        return f(sessionFiles, i10);
    }

    private static void u(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f32655e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void v(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f32655e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void deleteAllReports() {
        i(this.f32661b.getReports());
        i(this.f32661b.getPriorityReports());
        i(this.f32661b.getNativeReports());
    }

    public void finalizeReports(@Nullable String str, long j10) {
        for (String str2 : e(str)) {
            Logger.getLogger().v("Finalizing report for session " + str2);
            r(str2, j10);
            this.f32661b.deleteSessionFiles(str2);
        }
        g();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        File sessionFile = this.f32661b.getSessionFile(str, Constants.REPORT);
        Logger.getLogger().d("Writing native session report for " + str + " to file: " + sessionFile);
        q(sessionFile, filesPayload, str, applicationExitInfo);
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.f32661b.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.f32661b.getSessionFile(str, "start-time").lastModified();
    }

    public boolean hasFinalizedReports() {
        return (this.f32661b.getReports().isEmpty() && this.f32661b.getPriorityReports().isEmpty() && this.f32661b.getNativeReports().isEmpty()) ? false : true;
    }

    @NonNull
    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> listK = k();
        ArrayList arrayList = new ArrayList();
        for (File file : listK) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(f32657g.reportFromJson(p(file)), file.getName(), file));
            } catch (IOException e10) {
                Logger.getLogger().w("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str) {
        persistEvent(event, str, false);
    }

    public void persistReport(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            u(this.f32661b.getSessionFile(identifier, Constants.REPORT), f32657g.reportToJson(crashlyticsReport));
            v(this.f32661b.getSessionFile(identifier, "start-time"), "", session.getStartedAt());
        } catch (IOException e10) {
            Logger.getLogger().d("Could not persist report for session " + identifier, e10);
        }
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str, boolean z10) {
        int i10 = this.f32662c.getSettingsSync().sessionData.maxCustomExceptionEvents;
        try {
            u(this.f32661b.getSessionFile(str, j(this.f32660a.getAndIncrement(), z10)), f32657g.eventToJson(event));
        } catch (IOException e10) {
            Logger.getLogger().w("Could not persist event for session " + str, e10);
        }
        t(str, i10);
    }
}
