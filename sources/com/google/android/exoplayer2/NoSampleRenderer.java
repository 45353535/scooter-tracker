package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private int state;

    @Nullable
    private SampleStream stream;
    private boolean streamIsFinal;

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
        Assertions.checkState(this.state == 1);
        this.state = 0;
        this.stream = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException {
        Assertions.checkState(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z10);
        replaceStream(formatArr, sampleStream, j11, j12);
        onPositionReset(j10, z10);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Nullable
    protected final RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    protected final int getIndex() {
        return this.index;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public final SampleStream getStream() {
        return this.stream;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void init(int i10, PlayerId playerId) {
        this.index = i10;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z10) throws ExoPlaybackException {
    }

    protected void onPositionReset(long j10, boolean z10) throws ExoPlaybackException {
    }

    protected void onRendererOffsetChanged(long j10) throws ExoPlaybackException {
    }

    protected void onReset() {
    }

    protected void onStarted() throws ExoPlaybackException {
    }

    protected void onStopped() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j10, long j11) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        onRendererOffsetChanged(j11);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        Assertions.checkState(this.state == 0);
        onReset();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long j10) throws ExoPlaybackException {
        this.streamIsFinal = false;
        onPositionReset(j10, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void setPlaybackSpeed(float f10, float f11) {
        v2.a(this, f10, f11);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        Assertions.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) throws ExoPlaybackException {
        return w2.a(0);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }
}
