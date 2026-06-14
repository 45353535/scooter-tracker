package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class LogFileManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NoopLogStore f32175c = new NoopLogStore();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileStore f32176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLogStore f32177b;

    private static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void closeLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void deleteLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public byte[] getLogAsBytes() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public String getLogAsString() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void writeToLog(long j10, String str) {
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.f32176a = fileStore;
        this.f32177b = f32175c;
    }

    private File a(String str) {
        return this.f32176a.getSessionFile(str, "userlog");
    }

    void b(File file, int i10) {
        this.f32177b = new QueueFileLogStore(file, i10);
    }

    public void clearLog() {
        this.f32177b.deleteLogFile();
    }

    public byte[] getBytesForLog() {
        return this.f32177b.getLogAsBytes();
    }

    @Nullable
    public String getLogString() {
        return this.f32177b.getLogAsString();
    }

    public final void setCurrentSession(String str) {
        this.f32177b.closeLogFile();
        this.f32177b = f32175c;
        if (str == null) {
            return;
        }
        b(a(str), 65536);
    }

    public void writeToLog(long j10, String str) {
        this.f32177b.writeToLog(j10, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        setCurrentSession(str);
    }
}
