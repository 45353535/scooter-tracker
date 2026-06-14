package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
final class ChannelMappingAudioProcessor extends BaseAudioProcessor {

    @Nullable
    private int[] outputChannels;

    @Nullable
    private int[] pendingOutputChannels;

    ChannelMappingAudioProcessor() {
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    @CanIgnoreReturnValue
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z10 = audioFormat.channelCount != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= audioFormat.channelCount) {
                throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, iArr.length, 2) : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onFlush() {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    protected void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) Assertions.checkNotNull(this.outputChannels);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(((iLimit - iPosition) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.inputAudioFormat.bytesPerFrame;
        }
        byteBuffer.position(iLimit);
        byteBufferReplaceOutputBuffer.flip();
    }

    public void setChannelMap(@Nullable int[] iArr) {
        this.pendingOutputChannels = iArr;
    }
}
