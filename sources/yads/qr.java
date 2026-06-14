package yads;

import com.ironsource.C4240b4;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qr implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f115132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f115133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f115134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f115135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f115136g;

    public qr(String str, long j10, long j11, long j12, File file) {
        this.f115131b = str;
        this.f115132c = j10;
        this.f115133d = j11;
        this.f115134e = file != null;
        this.f115135f = file;
        this.f115136g = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qr qrVar = (qr) obj;
        if (!this.f115131b.equals(qrVar.f115131b)) {
            return this.f115131b.compareTo(qrVar.f115131b);
        }
        long j10 = this.f115132c - qrVar.f115132c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        return C4240b4.j.f42672d + this.f115132c + ", " + this.f115133d + C4240b4.j.f42674e;
    }
}
