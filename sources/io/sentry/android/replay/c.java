package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f82870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f82871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f82872c;

    public c(File video, int i10, long j10) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f82870a = video;
        this.f82871b = i10;
        this.f82872c = j10;
    }

    public final File a() {
        return this.f82870a;
    }

    public final int b() {
        return this.f82871b;
    }

    public final long c() {
        return this.f82872c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f82870a, cVar.f82870a) && this.f82871b == cVar.f82871b && this.f82872c == cVar.f82872c;
    }

    public int hashCode() {
        return (((this.f82870a.hashCode() * 31) + this.f82871b) * 31) + androidx.collection.b.a(this.f82872c);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.f82870a + ", frameCount=" + this.f82871b + ", duration=" + this.f82872c + ')';
    }
}
