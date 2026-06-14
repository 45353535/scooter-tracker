package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class Mp4WebvttSubtitle implements Subtitle {
    private final List<Cue> cues;

    public Mp4WebvttSubtitle(List<Cue> list) {
        this.cues = DesugarCollections.unmodifiableList(list);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        return j10 >= 0 ? this.cues : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        Assertions.checkArgument(i10 == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
