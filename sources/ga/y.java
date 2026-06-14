package ga;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f72544h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9.k f72546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f72547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f72548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f72549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f72550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f72551g;

    public y(long j10, s9.k kVar, long j11) {
        this(j10, kVar, kVar.f99819a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f72544h.getAndIncrement();
    }

    public y(long j10, s9.k kVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f72545a = j10;
        this.f72546b = kVar;
        this.f72547c = uri;
        this.f72548d = map;
        this.f72549e = j11;
        this.f72550f = j12;
        this.f72551g = j13;
    }
}
