package z9;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9.k f119301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f119302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f119303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f119304e;

    public o0(s9.k kVar, Uri uri, Map map, long j10, Throwable th2) {
        super(th2);
        this.f119301b = kVar;
        this.f119302c = uri;
        this.f119303d = map;
        this.f119304e = j10;
    }
}
