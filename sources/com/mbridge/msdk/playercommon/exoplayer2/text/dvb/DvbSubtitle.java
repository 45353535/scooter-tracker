package com.mbridge.msdk.playercommon.exoplayer2.text.dvb;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
final class DvbSubtitle implements Subtitle {
    private final List<Cue> cues;

    public DvbSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        return this.cues;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        return -1;
    }
}
