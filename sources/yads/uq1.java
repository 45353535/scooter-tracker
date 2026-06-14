package yads;

import android.content.Context;
import android.os.StatFs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uq1 {
    public static long a(Context context, long j10, long j11) {
        long availableBlocks;
        long jK = kotlin.ranges.g.k(j10, j11);
        try {
            StatFs statFs = new StatFs(cg0.a(context, "").getAbsolutePath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException unused) {
            boolean z10 = lb1.f113032a;
            availableBlocks = jK;
        }
        long j12 = 100;
        return kotlin.ranges.g.f(kotlin.ranges.g.k((((long) 2) * availableBlocks) / j12, j11), kotlin.ranges.g.k(jK, (availableBlocks * ((long) 50)) / j12));
    }
}
