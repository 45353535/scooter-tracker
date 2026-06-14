package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x80 implements z80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f117735a;

    public x80(Uri uri) {
        this.f117735a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x80) && Intrinsics.areEqual(this.f117735a, ((x80) obj).f117735a);
    }

    public final int hashCode() {
        return this.f117735a.hashCode();
    }

    public final String toString() {
        return "ShareReport(reportUri=" + this.f117735a + ")";
    }
}
