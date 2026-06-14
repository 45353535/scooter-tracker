package nh;

import hh.b0;
import hh.z;
import vh.j0;
import vh.l0;

/* JADX INFO: loaded from: classes10.dex */
public interface d {
    void a(z zVar);

    l0 b(b0 b0Var);

    long c(b0 b0Var);

    void cancel();

    j0 d(z zVar, long j10);

    void finishRequest();

    void flushRequest();

    mh.f getConnection();

    b0.a readResponseHeaders(boolean z10);
}
