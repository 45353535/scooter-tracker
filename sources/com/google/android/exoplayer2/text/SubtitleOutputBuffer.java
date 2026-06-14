package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    private long subsampleOffsetUs;

    @Nullable
    private Subtitle subtitle;

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getCues(j10 - this.subsampleOffsetUs);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTime(i10) + this.subsampleOffsetUs;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTimeCount();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getNextEventTimeIndex(j10 - this.subsampleOffsetUs);
    }

    public void setContent(long j10, Subtitle subtitle, long j11) {
        this.timeUs = j10;
        this.subtitle = subtitle;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.subsampleOffsetUs = j10;
    }
}
