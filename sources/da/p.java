package da;

import android.os.Bundle;

/* JADX INFO: loaded from: classes12.dex */
interface p {
    void a(int i10, int i11, t9.c cVar, long j10, int i12);

    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();
}
