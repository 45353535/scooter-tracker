package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
class CrashlyticsAppQualitySessionsStore {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f31992d = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f31993e = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileStore f31994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31995b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31996c = null;

    CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.f31994a = fileStore;
    }

    private static void c(FileStore fileStore, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.getSessionFile(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            Logger.getLogger().w("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String d(FileStore fileStore, String str) {
        List<File> sessionFiles = fileStore.getSessionFiles(str, f31992d);
        if (!sessionFiles.isEmpty()) {
            return ((File) Collections.min(sessionFiles, f31993e)).getName().substring(4);
        }
        Logger.getLogger().w("Unable to read App Quality Sessions session id.");
        return null;
    }

    @Nullable
    public synchronized String getAppQualitySessionId(@NonNull String str) {
        if (Objects.equals(this.f31995b, str)) {
            return this.f31996c;
        }
        return d(this.f31994a, str);
    }

    public synchronized void rotateAppQualitySessionId(@NonNull String str) {
        if (!Objects.equals(this.f31996c, str)) {
            c(this.f31994a, this.f31995b, str);
            this.f31996c = str;
        }
    }

    public synchronized void rotateSessionId(@Nullable String str) {
        if (!Objects.equals(this.f31995b, str)) {
            c(this.f31994a, str, this.f31996c);
            this.f31995b = str;
        }
    }
}
