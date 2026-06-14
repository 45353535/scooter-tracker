package com.mbridge.msdk.playercommon.exoplayer2.text;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface Subtitle {
    List<Cue> getCues(long j10);

    long getEventTime(int i10);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j10);
}
