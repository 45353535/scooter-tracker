package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f21440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f21442d;

    public d(g gVar, e eVar) {
        this.f21442d = gVar;
        this.f21439a = eVar;
        this.f21440b = eVar.f21445c ? null : new boolean[gVar.f21456g];
    }

    public final void a(byte[] bArr) {
        OutputStream cVar;
        FileOutputStream fileOutputStream;
        g gVar = this.f21442d;
        if (gVar.f21456g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f21442d.f21456g);
        }
        synchronized (gVar) {
            try {
                e eVar = this.f21439a;
                if (eVar.f21446d != this) {
                    throw new IllegalStateException();
                }
                if (!eVar.f21445c) {
                    this.f21440b[0] = true;
                }
                File fileB = eVar.b(0);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f21442d.f21450a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        cVar = g.f21449q;
                    }
                }
                cVar = new c(this, fileOutputStream);
            } finally {
            }
        }
        try {
            cVar.write(bArr);
            Charset charset = l.f21472a;
            try {
                cVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
        } catch (Throwable th2) {
            Charset charset2 = l.f21472a;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception unused4) {
                }
            }
            throw th2;
        }
    }

    public final void a() {
        if (this.f21441c) {
            g.a(this.f21442d, this, false);
            this.f21442d.c(this.f21439a.f21443a);
        } else {
            g.a(this.f21442d, this, true);
        }
    }
}
