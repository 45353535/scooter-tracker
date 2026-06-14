package f1;

import com.google.android.exoplayer2.offline.Download;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c5 {
    public static final n4 a(Download download) {
        Intrinsics.checkNotNullParameter(download, "<this>");
        return new n4(download);
    }

    public static final File b(n4 n4Var, File file) {
        Intrinsics.checkNotNullParameter(n4Var, "<this>");
        return new File(file, n4Var.b());
    }

    public static final String c(int i10) {
        if (i10 == 0) {
            return "STATE_QUEUED";
        }
        if (i10 == 1) {
            return "STATE_STOPPED";
        }
        if (i10 == 2) {
            return "STATE_DOWNLOADING";
        }
        if (i10 == 3) {
            return "STATE_COMPLETED";
        }
        if (i10 == 4) {
            return "STATE_FAILED";
        }
        if (i10 == 5) {
            return "STATE_REMOVING";
        }
        if (i10 == 7) {
            return "STATE_RESTARTING";
        }
        return "UNKNOWN STATE " + i10;
    }
}
