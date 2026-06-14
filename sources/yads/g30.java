package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f111042a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f111045d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f111047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111048g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111043b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f111044c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f111046e = -1;

    public final h30 a() {
        fi.a(this.f111042a, "The uri must be set.");
        return new h30(this.f111042a, 0L, this.f111043b, null, this.f111044c, this.f111045d, this.f111046e, this.f111047f, this.f111048g, null);
    }

    public final g30 a(int i10) {
        this.f111048g = i10;
        return this;
    }

    public final g30 a(String str) {
        this.f111047f = str;
        return this;
    }

    public final g30 a(Uri uri) {
        this.f111042a = uri;
        return this;
    }
}
