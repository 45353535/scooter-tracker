package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f112705a;

    public kh0(Uri uri) {
        this.f112705a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh0) && Intrinsics.areEqual(this.f112705a, ((kh0) obj).f112705a);
    }

    public final int hashCode() {
        return this.f112705a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.f112705a + ")";
    }
}
