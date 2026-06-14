package ga;

import android.net.Uri;
import java.util.Map;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
public interface r0 {

    public interface a {
        r0 a(c2 c2Var);
    }

    int a(oa.l0 l0Var);

    void b(n9.h hVar, Uri uri, Map map, long j10, long j11, oa.t tVar);

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void release();

    void seek(long j10, long j11);
}
