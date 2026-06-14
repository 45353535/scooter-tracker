package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f36708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f36709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H5 f36711d;

    public D5(H5 h52, E5 e52) {
        this.f36711d = h52;
        this.f36708a = e52;
        this.f36709b = e52.f36773c ? null : new boolean[h52.f36985h];
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStream;
        C5 c52;
        synchronized (this.f36711d) {
            try {
                E5 e52 = this.f36708a;
                if (e52.f36774d != this) {
                    throw new IllegalStateException();
                }
                if (!e52.f36773c) {
                    this.f36709b[i10] = true;
                }
                File fileB = e52.b(i10);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f36711d.f36979b.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        return H5.f36977q;
                    }
                }
                c52 = new C5(this, fileOutputStream);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c52;
    }
}
