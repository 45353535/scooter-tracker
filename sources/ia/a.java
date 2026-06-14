package ia;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes12.dex */
interface a {
    boolean a(lb.e eVar, long j10);

    void clear();

    void discardCuesBeforeTimeUs(long j10);

    ImmutableList getCuesAtTimeUs(long j10);

    long getNextCueChangeTimeUs(long j10);

    long getPreviousCueChangeTimeUs(long j10);
}
