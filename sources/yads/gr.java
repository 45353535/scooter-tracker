package yads;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class gr implements a30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er f111304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111305b = 5242880;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111306c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h30 f111307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f111308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f111309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f111310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f111311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f111312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public do2 f111313j;

    public gr(er erVar) {
        this.f111304a = (er) fi.a(erVar);
    }

    public final void a() {
        OutputStream outputStream = this.f111310g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            w83.a((Closeable) this.f111310g);
            this.f111310g = null;
            File file = this.f111309f;
            this.f111309f = null;
            er erVar = this.f111304a;
            long j10 = this.f111311h;
            iw2 iw2Var = (iw2) erVar;
            synchronized (iw2Var) {
                if (file.exists()) {
                    if (j10 == 0) {
                        file.delete();
                        return;
                    }
                    kw2 kw2VarA = kw2.a(file, j10, -9223372036854775807L, iw2Var.f112169c);
                    kw2VarA.getClass();
                    cs csVar = iw2Var.f112169c;
                    yr yrVar = (yr) csVar.f109547a.get(kw2VarA.f115131b);
                    yrVar.getClass();
                    if (!yrVar.c(kw2VarA.f115132c, kw2VarA.f115133d)) {
                        throw new IllegalStateException();
                    }
                    long jA = j5.a(yrVar.f118332e);
                    if (jA != -1 && kw2VarA.f115132c + kw2VarA.f115133d > jA) {
                        throw new IllegalStateException();
                    }
                    if (iw2Var.f112170d == null) {
                        iw2Var.a(kw2VarA);
                        iw2Var.f112169c.a();
                        iw2Var.notifyAll();
                        return;
                    }
                    try {
                        iw2Var.f112170d.a(file.getName(), kw2VarA.f115133d, kw2VarA.f115136g);
                        iw2Var.a(kw2VarA);
                        try {
                            iw2Var.f112169c.a();
                            iw2Var.notifyAll();
                            return;
                        } finally {
                            br brVar = new br(e);
                        }
                    } catch (IOException e10) {
                        throw new br(e10);
                    }
                }
            }
        } catch (Throwable th2) {
            w83.a((Closeable) this.f111310g);
            this.f111310g = null;
            File file2 = this.f111309f;
            this.f111309f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void a(h30 h30Var) {
        File file;
        long j10 = h30Var.f111458g;
        long jMin = j10 == -1 ? -1L : Math.min(j10 - this.f111312i, this.f111308e);
        er erVar = this.f111304a;
        String str = h30Var.f111459h;
        int i10 = w83.f117341a;
        long j11 = h30Var.f111457f + this.f111312i;
        iw2 iw2Var = (iw2) erVar;
        synchronized (iw2Var) {
            try {
                iw2Var.a();
                yr yrVar = (yr) iw2Var.f112169c.f109547a.get(str);
                yrVar.getClass();
                if (yrVar.c(j11, jMin)) {
                    if (!iw2Var.f112167a.exists()) {
                        iw2.a(iw2Var.f112167a);
                        iw2Var.c();
                    }
                    md1 md1Var = (md1) iw2Var.f112168b;
                    if (jMin != -1) {
                        md1Var.a(iw2Var, jMin);
                    } else {
                        md1Var.getClass();
                    }
                    File file2 = new File(iw2Var.f112167a, Integer.toString(iw2Var.f112172f.nextInt(10)));
                    if (!file2.exists()) {
                        iw2.a(file2);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i11 = yrVar.f118328a;
                    Pattern pattern = kw2.f112879h;
                    file = new File(file2, i11 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f111309f = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f111309f);
        if (this.f111306c > 0) {
            do2 do2Var = this.f111313j;
            if (do2Var == null) {
                this.f111313j = new do2(fileOutputStream, this.f111306c);
            } else {
                do2Var.a(fileOutputStream);
            }
            this.f111310g = this.f111313j;
        } else {
            this.f111310g = fileOutputStream;
        }
        this.f111311h = 0L;
    }
}
