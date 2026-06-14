package f1;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3 f71064a;

    public s8(y3 downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        this.f71064a = downloadManager;
    }

    public final MediaItem a(c9 asset) {
        Download downloadA;
        DownloadRequest downloadRequest;
        Intrinsics.checkNotNullParameter(asset, "asset");
        n4 n4VarB = this.f71064a.b(asset.e());
        if (n4VarB == null || (downloadA = n4VarB.a()) == null || (downloadRequest = downloadA.request) == null) {
            return null;
        }
        return downloadRequest.toMediaItem();
    }
}
