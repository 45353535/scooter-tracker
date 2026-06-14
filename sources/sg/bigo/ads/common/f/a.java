package sg.bigo.ads.common.f;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f102314e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f102315a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f102316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f102317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1258a f102318d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1258a {
        void a(long j10, long j11);

        void a(boolean z10, long j10, long j11, long j12);
    }

    private a() {
        b();
    }

    public static a a() {
        return f102314e;
    }

    final void b() {
        this.f102316b = SystemClock.elapsedRealtime();
        this.f102317c = System.currentTimeMillis();
    }

    final boolean c() {
        return this.f102316b > 0;
    }
}
