package f1;

import com.google.android.exoplayer2.offline.Download;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Download f70540a;

    public n4(Download download) {
        Intrinsics.checkNotNullParameter(download, "download");
        this.f70540a = download;
    }

    public final Download a() {
        return this.f70540a;
    }

    public final String b() {
        String id2 = this.f70540a.request.f25001id;
        Intrinsics.checkNotNullExpressionValue(id2, "id");
        return id2;
    }

    public final float c() {
        return this.f70540a.getPercentDownloaded();
    }

    public final int d() {
        return this.f70540a.state;
    }

    public final long e() {
        return this.f70540a.updateTimeMs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4) && Intrinsics.areEqual(this.f70540a, ((n4) obj).f70540a);
    }

    public final String f() {
        String string = this.f70540a.request.uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        return this.f70540a.hashCode();
    }

    public String toString() {
        return "DownloadWrapper(download=" + this.f70540a + ")";
    }
}
