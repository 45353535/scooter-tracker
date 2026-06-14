package f1;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f70844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f70847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f70848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f70849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f70850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f70851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f70852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f70853j;

    public qb(long j10, int i10, int i11, long j11, long j12, long j13, int i12, i iVar) {
        this.f70844a = j10;
        this.f70845b = i10;
        this.f70846c = i11;
        this.f70847d = j11;
        this.f70848e = j12;
        this.f70849f = j13;
        this.f70850g = i12;
        this.f70851h = iVar;
    }

    public final void a() {
        eg.e("addDownloadToTimeWindow() - timeWindowStartTimeStamp " + this.f70852i + ", timeWindowCachedVideosCount " + this.f70853j, null, 2, null);
        if (this.f70852i == 0) {
            this.f70852i = o3.a();
        }
        this.f70853j++;
    }

    public final void b(int i10) {
        this.f70850g = i10;
    }

    public final boolean c(long j10) {
        return o3.a() - j10 > this.f70849f * ((long) 1000);
    }

    public final boolean d(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return c(file.lastModified());
    }

    public final long e() {
        return this.f70844a;
    }

    public final void f(int i10) {
        this.f70845b = i10;
    }

    public final boolean g(long j10) {
        return j10 >= this.f70844a;
    }

    public final int h() {
        i iVar = this.f70851h;
        return (iVar == null || !iVar.d()) ? this.f70845b : this.f70846c;
    }

    public final void i(int i10) {
        this.f70846c = i10;
    }

    public final void j(long j10) {
        this.f70844a = j10;
    }

    public final long k() {
        return o() - m();
    }

    public final void l(long j10) {
        this.f70847d = j10;
    }

    public final long m() {
        return o3.a() - this.f70852i;
    }

    public final void n(long j10) {
        this.f70848e = j10;
    }

    public final long o() {
        i iVar = this.f70851h;
        return ((iVar == null || !iVar.d()) ? this.f70847d : this.f70848e) * ((long) 1000);
    }

    public final void p(long j10) {
        this.f70849f = j10;
    }

    public final boolean q() {
        r();
        boolean z10 = this.f70853j >= h();
        if (z10) {
            h8.b("Video loading limit reached, will resume in timeToResetWindow: " + k());
        }
        eg.e("isMaxCountForTimeWindowReached() - " + z10, null, 2, null);
        return z10;
    }

    public final void r() {
        eg.e("resetWindowWhenTimeReached()", null, 2, null);
        if (m() > o()) {
            eg.e("resetWindowWhenTimeReached() - timer and count reset", null, 2, null);
            h8.b("Video loading limit reset");
            this.f70853j = 0;
            this.f70852i = 0L;
        }
    }

    public final long s() {
        return o() - (o3.a() - this.f70852i);
    }
}
