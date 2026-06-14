package yads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f118242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f118243b;

    public yj(File file) {
        this.f118242a = file;
        this.f118243b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f118243b.exists()) {
            this.f118242a.delete();
            this.f118243b.renameTo(this.f118242a);
        }
        return new FileInputStream(this.f118242a);
    }

    public final xj b() throws IOException {
        if (this.f118242a.exists()) {
            if (this.f118243b.exists()) {
                this.f118242a.delete();
            } else if (!this.f118242a.renameTo(this.f118243b)) {
                uf1.d("AtomicFile", "Couldn't rename file " + this.f118242a + " to backup file " + this.f118243b);
            }
        }
        try {
            return new xj(this.f118242a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f118242a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f118242a, e10);
            }
            try {
                return new xj(this.f118242a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f118242a, e11);
            }
        }
    }
}
