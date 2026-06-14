package f1;

import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadCursor;
import com.google.android.exoplayer2.offline.DownloadManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ee {
    public static final n4 a(DownloadManager downloadManager, String id2) throws IOException {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        Download download = downloadManager.getDownloadIndex().getDownload(id2);
        if (download != null) {
            return c5.a(download);
        }
        return null;
    }

    public static final List b(DownloadCursor downloadCursor) {
        Intrinsics.checkNotNullParameter(downloadCursor, "<this>");
        ArrayList arrayList = new ArrayList();
        while (downloadCursor.moveToNext()) {
            Download download = downloadCursor.getDownload();
            Intrinsics.checkNotNullExpressionValue(download, "getDownload(...)");
            arrayList.add(c5.a(download));
        }
        return arrayList;
    }

    public static final List c(DownloadManager downloadManager) throws IOException {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        DownloadCursor downloads = downloadManager.getDownloadIndex().getDownloads(new int[0]);
        Intrinsics.checkNotNullExpressionValue(downloads, "getDownloads(...)");
        return b(downloads);
    }
}
