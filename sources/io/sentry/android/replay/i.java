package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f83050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f83051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83052c;

    public i(File screenshot, long j10, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.f83050a = screenshot;
        this.f83051b = j10;
        this.f83052c = str;
    }

    public final String a() {
        return this.f83052c;
    }

    public final File b() {
        return this.f83050a;
    }

    public final long c() {
        return this.f83051b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f83050a, iVar.f83050a) && this.f83051b == iVar.f83051b && Intrinsics.areEqual(this.f83052c, iVar.f83052c);
    }

    public int hashCode() {
        int iHashCode = ((this.f83050a.hashCode() * 31) + androidx.collection.b.a(this.f83051b)) * 31;
        String str = this.f83052c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.f83050a + ", timestamp=" + this.f83051b + ", screen=" + this.f83052c + ')';
    }
}
