package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i51 implements j51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f111865a;

    public i51(Uri uri) {
        this.f111865a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i51) && Intrinsics.areEqual(this.f111865a, ((i51) obj).f111865a);
    }

    public final int hashCode() {
        return this.f111865a.hashCode();
    }

    public final String toString() {
        return "Success(reportUri=" + this.f111865a + ")";
    }
}
