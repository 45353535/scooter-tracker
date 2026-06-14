package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 150000;
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int STATE_MAYBE_SILENT = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SILENT = 2;
    private int bytesPerFrame;
    private boolean enabled;
    private boolean hasOutputNoise;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferSize;
    private final long minimumSilenceDurationUs;
    private byte[] paddingBuffer;
    private final long paddingSilenceUs;
    private int paddingSize;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 20000L, (short) 1024);
    }

    private int durationUsToFrames(long j10) {
        return (int) ((j10 * ((long) this.inputAudioFormat.sampleRate)) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.silenceThresholdLevel);
        int i10 = this.bytesPerFrame;
        return ((iLimit / i10) * i10) + i10;
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.silenceThresholdLevel) {
                int i10 = this.bytesPerFrame;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void output(byte[] bArr, int i10) {
        replaceOutputBuffer(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.hasOutputNoise = true;
        }
    }

    private void processMaybeSilence(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        byte[] bArr = this.maybeSilenceBuffer;
        int length = bArr.length;
        int i10 = this.maybeSilenceBufferSize;
        int i11 = length - i10;
        if (iFindNoisePosition < iLimit && iPosition < i11) {
            output(bArr, i10);
            this.maybeSilenceBufferSize = 0;
            this.state = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.maybeSilenceBuffer, this.maybeSilenceBufferSize, iMin);
        int i12 = this.maybeSilenceBufferSize + iMin;
        this.maybeSilenceBufferSize = i12;
        byte[] bArr2 = this.maybeSilenceBuffer;
        if (i12 == bArr2.length) {
            if (this.hasOutputNoise) {
                output(bArr2, this.paddingSize);
                this.skippedFrames += (long) ((this.maybeSilenceBufferSize - (this.paddingSize * 2)) / this.bytesPerFrame);
            } else {
                this.skippedFrames += (long) ((i12 - this.paddingSize) / this.bytesPerFrame);
            }
            updatePaddingBuffer(byteBuffer, this.maybeSilenceBuffer, this.maybeSilenceBufferSize);
            this.maybeSilenceBufferSize = 0;
            this.state = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(iFindNoiseLimit);
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void processSilence(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        byteBuffer.limit(iFindNoisePosition);
        this.skippedFrames += (long) (byteBuffer.remaining() / this.bytesPerFrame);
        updatePaddingBuffer(byteBuffer, this.paddingBuffer, this.paddingSize);
        if (iFindNoisePosition < iLimit) {
            output(this.paddingBuffer, this.paddingSize);
            this.state = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void updatePaddingBuffer(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.paddingSize);
        int i11 = this.paddingSize - iMin;
        System.arraycopy(bArr, i10 - i11, this.paddingBuffer, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.paddingBuffer, i11, iMin);
    }

    public long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.enabled;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            return this.enabled ? audioFormat : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onFlush() {
        if (this.enabled) {
            this.bytesPerFrame = this.inputAudioFormat.bytesPerFrame;
            int iDurationUsToFrames = durationUsToFrames(this.minimumSilenceDurationUs) * this.bytesPerFrame;
            if (this.maybeSilenceBuffer.length != iDurationUsToFrames) {
                this.maybeSilenceBuffer = new byte[iDurationUsToFrames];
            }
            int iDurationUsToFrames2 = durationUsToFrames(this.paddingSilenceUs) * this.bytesPerFrame;
            this.paddingSize = iDurationUsToFrames2;
            if (this.paddingBuffer.length != iDurationUsToFrames2) {
                this.paddingBuffer = new byte[iDurationUsToFrames2];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.maybeSilenceBufferSize = 0;
        this.hasOutputNoise = false;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onQueueEndOfStream() {
        int i10 = this.maybeSilenceBufferSize;
        if (i10 > 0) {
            output(this.maybeSilenceBuffer, i10);
        }
        if (this.hasOutputNoise) {
            return;
        }
        this.skippedFrames += (long) (this.paddingSize / this.bytesPerFrame);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onReset() {
        this.enabled = false;
        this.paddingSize = 0;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.paddingBuffer = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !hasPendingOutput()) {
            int i10 = this.state;
            if (i10 == 0) {
                processNoisy(byteBuffer);
            } else if (i10 == 1) {
                processMaybeSilence(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                processSilence(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public SilenceSkippingAudioProcessor(long j10, long j11, short s10) {
        Assertions.checkArgument(j11 <= j10);
        this.minimumSilenceDurationUs = j10;
        this.paddingSilenceUs = j11;
        this.silenceThresholdLevel = s10;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.paddingBuffer = bArr;
    }

    private void output(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        replaceOutputBuffer(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.hasOutputNoise = true;
        }
    }
}
