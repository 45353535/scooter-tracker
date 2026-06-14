package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {

    @Nullable
    private RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private PlayerId playerId;
    private int state;

    @Nullable
    private SampleStream stream;

    @Nullable
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final FormatHolder formatHolder = new FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;

    public BaseRenderer(int i10) {
        this.trackType = i10;
    }

    protected final ExoPlaybackException createRendererException(Throwable th2, @Nullable Format format, int i10) {
        return createRendererException(th2, format, false, i10);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
        Assertions.checkState(this.state == 1);
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException {
        Assertions.checkState(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z10, z11);
        replaceStream(formatArr, sampleStream, j11, j12);
        resetPosition(j10, z10);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    protected final RendererConfiguration getConfiguration() {
        return (RendererConfiguration) Assertions.checkNotNull(this.configuration);
    }

    protected final FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    protected final int getIndex() {
        return this.index;
    }

    protected final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return null;
    }

    protected final PlayerId getPlayerId() {
        return (PlayerId) Assertions.checkNotNull(this.playerId);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
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

    protected final Format[] getStreamFormats() {
        return (Format[]) Assertions.checkNotNull(this.streamFormats);
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void init(int i10, PlayerId playerId) {
        this.index = i10;
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    protected final boolean isSourceReady() {
        return hasReadStreamToEnd() ? this.streamIsFinal : ((SampleStream) Assertions.checkNotNull(this.stream)).isReady();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
        ((SampleStream) Assertions.checkNotNull(this.stream)).maybeThrowError();
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    protected void onPositionReset(long j10, boolean z10) throws ExoPlaybackException {
    }

    protected void onReset() {
    }

    protected void onStarted() throws ExoPlaybackException {
    }

    protected void onStopped() {
    }

    protected void onStreamChanged(Format[] formatArr, long j10, long j11) throws ExoPlaybackException {
    }

    protected final int readSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
        int data = ((SampleStream) Assertions.checkNotNull(this.stream)).readData(formatHolder, decoderInputBuffer, i10);
        if (data != -4) {
            if (data == -5) {
                Format format = (Format) Assertions.checkNotNull(formatHolder.format);
                if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                    formatHolder.format = format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.streamOffsetUs).build();
                }
            }
            return data;
        }
        if (decoderInputBuffer.isEndOfStream()) {
            this.readingPositionUs = Long.MIN_VALUE;
            return this.streamIsFinal ? -4 : -3;
        }
        long j10 = decoderInputBuffer.timeUs + this.streamOffsetUs;
        decoderInputBuffer.timeUs = j10;
        this.readingPositionUs = Math.max(this.readingPositionUs, j10);
        return data;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j10, long j11) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j10;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j11;
        onStreamChanged(formatArr, j10, j11);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        Assertions.checkState(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long j10) throws ExoPlaybackException {
        resetPosition(j10, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void setPlaybackSpeed(float f10, float f11) {
        v2.a(this, f10, f11);
    }

    protected int skipSource(long j10) {
        return ((SampleStream) Assertions.checkNotNull(this.stream)).skipData(j10 - this.streamOffsetUs);
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
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    private void resetPosition(long j10, boolean z10) throws ExoPlaybackException {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j10;
        this.readingPositionUs = j10;
        onPositionReset(j10, z10);
    }

    protected final ExoPlaybackException createRendererException(Throwable th2, @Nullable Format format, boolean z10, int i10) {
        int iF;
        if (format == null || this.throwRendererExceptionIsExecuting) {
            iF = 4;
        } else {
            this.throwRendererExceptionIsExecuting = true;
            try {
                iF = w2.f(supportsFormat(format));
            } catch (ExoPlaybackException unused) {
                iF = 4;
            } finally {
                this.throwRendererExceptionIsExecuting = false;
            }
        }
        return ExoPlaybackException.createForRenderer(th2, getName(), getIndex(), format, iF, z10, i10);
    }
}
