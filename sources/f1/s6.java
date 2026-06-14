package f1;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes6.dex */
public final class s6 {
    public final File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str + ".tmp");
    }

    public final RandomAccessFile b(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }

    public final boolean c(File file, String str) {
        if (file != null && str != null) {
            try {
                File fileA = a(file, str);
                if (fileA != null) {
                    return fileA.exists();
                }
                return false;
            } catch (Exception e10) {
                eg.e(e10.toString(), null, 2, null);
            }
        }
        return false;
    }
}
