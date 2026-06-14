package ha;

import java.util.List;
import lb.t;
import oa.s;
import oa.s0;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
public interface f {

    public interface a {
        a a(t.a aVar);

        a b(int i10);

        io.bidmachine.media3.common.a c(io.bidmachine.media3.common.a aVar);

        f d(int i10, io.bidmachine.media3.common.a aVar, boolean z10, List list, s0 s0Var, c2 c2Var);

        a experimentalParseSubtitlesDuringExtraction(boolean z10);
    }

    public interface b {
        s0 track(int i10, int i11);
    }

    boolean a(s sVar);

    void b(b bVar, long j10, long j11);

    oa.h getChunkIndex();

    io.bidmachine.media3.common.a[] getSampleFormats();

    void release();
}
