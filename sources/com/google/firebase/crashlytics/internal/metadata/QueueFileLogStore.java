package com.google.firebase.crashlytics.internal.metadata;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class QueueFileLogStore implements FileLogStore {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f32197d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f32198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private QueueFile f32200c;

    private static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        LogBytes(byte[] bArr, int i10) {
            this.bytes = bArr;
            this.offset = i10;
        }
    }

    QueueFileLogStore(File file, int i10) {
        this.f32198a = file;
        this.f32199b = i10;
    }

    private void a(long j10, String str) {
        if (this.f32200c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f32199b / 4;
            if (str.length() > i10) {
                str = APSSharedUtil.TRUNCATE_SEPARATOR + str.substring(str.length() - i10);
            }
            this.f32200c.add(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ")).getBytes(f32197d));
            while (!this.f32200c.isEmpty() && this.f32200c.usedBytes() > this.f32199b) {
                this.f32200c.remove();
            }
        } catch (IOException e10) {
            Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private LogBytes b() {
        if (!this.f32198a.exists()) {
            return null;
        }
        c();
        QueueFile queueFile = this.f32200c;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.usedBytes()];
        try {
            this.f32200c.forEach(new QueueFile.ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.1
                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i10) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i10);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i10;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e10) {
            Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    private void c() {
        if (this.f32200c == null) {
            try {
                this.f32200c = new QueueFile(this.f32198a);
            } catch (IOException e10) {
                Logger.getLogger().e("Could not open log file: " + this.f32198a, e10);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void closeLogFile() {
        CommonUtils.closeOrLog(this.f32200c, "There was a problem closing the Crashlytics log file.");
        this.f32200c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.f32198a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] getLogAsBytes() {
        LogBytes logBytesB = b();
        if (logBytesB == null) {
            return null;
        }
        int i10 = logBytesB.offset;
        byte[] bArr = new byte[i10];
        System.arraycopy(logBytesB.bytes, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new String(logAsBytes, f32197d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void writeToLog(long j10, String str) {
        c();
        a(j10, str);
    }
}
