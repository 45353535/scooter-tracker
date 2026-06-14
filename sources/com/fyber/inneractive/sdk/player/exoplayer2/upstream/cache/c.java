package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f22946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22947b = 10485760;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22948c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f22949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f22950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OutputStream f22951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileOutputStream f22952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f22955j;

    public c(l lVar) {
        this.f22946a = lVar;
    }

    public final void a() {
        OutputStream outputStream = this.f22951f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f22952g.getFD().sync();
            z.a(this.f22951f);
            this.f22951f = null;
            File file = this.f22950e;
            this.f22950e = null;
            l lVar = this.f22946a;
            synchronized (lVar) {
                m mVarA = m.a(file, lVar.f23002d);
                if (mVarA == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.f23001c.containsKey(mVarA.f22978a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jA = lVar.a(mVarA.f22978a);
                    if (jA != -1 && mVarA.f22979b + mVarA.f22980c > jA) {
                        throw new IllegalStateException();
                    }
                    lVar.a(mVarA);
                    lVar.f23002d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th2) {
            z.a(this.f22951f);
            this.f22951f = null;
            File file2 = this.f22950e;
            this.f22950e = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b() {
        File file;
        long j10 = this.f22949d.f23039d;
        long jMin = j10 == -1 ? this.f22947b : Math.min(j10 - this.f22954i, this.f22947b);
        l lVar = this.f22946a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f22949d;
        String str = kVar.f23040e;
        long j11 = kVar.f23037b + this.f22954i;
        synchronized (lVar) {
            try {
                if (!lVar.f23001c.containsKey(str)) {
                    throw new IllegalStateException();
                }
                if (!lVar.f22999a.exists()) {
                    lVar.a();
                    lVar.f22999a.mkdirs();
                }
                lVar.f23000b.a(lVar, jMin);
                File file2 = lVar.f22999a;
                i iVar = lVar.f23002d;
                h hVarA = (h) iVar.f22988a.get(str);
                if (hVarA == null) {
                    hVarA = iVar.a(str, -1L);
                }
                int i10 = hVarA.f22984a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pattern pattern = m.f23005g;
                file = new File(file2, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22950e = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f22950e);
        this.f22952g = fileOutputStream;
        if (this.f22948c > 0) {
            p pVar = this.f22955j;
            if (pVar == null) {
                this.f22955j = new p(this.f22952g, this.f22948c);
            } else {
                pVar.a(fileOutputStream);
            }
            this.f22951f = this.f22955j;
        } else {
            this.f22951f = fileOutputStream;
        }
        this.f22953h = 0L;
    }
}
