package ha;

import io.bidmachine.media3.exoplayer.l1;
import java.util.List;
import ka.m;
import u9.m0;

/* JADX INFO: loaded from: classes12.dex */
public interface i {
    long b(long j10, m0 m0Var);

    boolean c(e eVar, boolean z10, m.c cVar, ka.m mVar);

    void e(e eVar);

    boolean f(long j10, e eVar, List list);

    void g(l1 l1Var, long j10, List list, g gVar);

    int getPreferredQueueSize(long j10, List list);

    void maybeThrowError();

    void release();
}
