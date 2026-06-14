package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f23103b;

    public c(File file) {
        this.f23102a = file;
        this.f23103b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f23103b.exists()) {
            this.f23102a.delete();
            this.f23103b.renameTo(this.f23102a);
        }
        return new FileInputStream(this.f23102a);
    }

    public final b b() throws IOException {
        if (this.f23102a.exists()) {
            if (this.f23103b.exists()) {
                this.f23102a.delete();
            } else if (!this.f23102a.renameTo(this.f23103b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f23102a + " to backup file " + this.f23103b);
            }
        }
        try {
            return new b(this.f23102a);
        } catch (FileNotFoundException unused) {
            if (!this.f23102a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f23102a);
            }
            try {
                return new b(this.f23102a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f23102a);
            }
        }
    }
}
