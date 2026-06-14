package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FileStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f32664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f32665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f32666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f32667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f32668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f32669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f32670g;

    public FileStore(Context context) {
        String str;
        String processName = ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails(context).getProcessName();
        this.f32664a = processName;
        File filesDir = context.getFilesDir();
        this.f32665b = filesDir;
        if (j()) {
            str = ".crashlytics.v3" + File.separator + i(processName);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileE = e(new File(filesDir, str));
        this.f32666c = fileE;
        this.f32667d = e(new File(fileE, "open-sessions"));
        this.f32668e = e(new File(fileE, "reports"));
        this.f32669f = e(new File(fileE, "priority-reports"));
        this.f32670g = e(new File(fileE, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f32665b, str);
        if (file.exists() && g(file)) {
            Logger.getLogger().d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f32665b.exists() || (list = this.f32665b.list(new FilenameFilter() { // from class: q3.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File d(String str) {
        return f(new File(this.f32667d, str));
    }

    private static synchronized File e(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                Logger.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                Logger.getLogger().e("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static File f(File file) {
        file.mkdirs();
        return file;
    }

    static boolean g(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                g(file2);
            }
        }
        return file.delete();
    }

    private static List h(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    static String i(String str) {
        return str.length() > 40 ? CommonUtils.sha1(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean j() {
        return !this.f32664a.isEmpty();
    }

    public void cleanupPreviousFileSystems() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (j()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    @VisibleForTesting
    public void deleteAllCrashlyticsFiles() {
        g(this.f32666c);
    }

    public boolean deleteSessionFiles(String str) {
        return g(new File(this.f32667d, str));
    }

    public List<String> getAllOpenSessionIds() {
        return h(this.f32667d.list());
    }

    public File getCommonFile(String str) {
        return new File(this.f32666c, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return h(this.f32666c.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.f32670g, str);
    }

    public List<File> getNativeReports() {
        return h(this.f32670g.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return f(new File(d(str), "native"));
    }

    public File getPriorityReport(String str) {
        return new File(this.f32669f, str);
    }

    public List<File> getPriorityReports() {
        return h(this.f32669f.listFiles());
    }

    public File getReport(String str) {
        return new File(this.f32668e, str);
    }

    public List<File> getReports() {
        return h(this.f32668e.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(d(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return h(d(str).listFiles(filenameFilter));
    }
}
