package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {
    private final String name;

    protected SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.name = str;
        setInitialInputBufferSize(1024);
    }

    protected abstract Subtitle decode(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
        return this.name;
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final SubtitleInputBuffer createInputBuffer() {
        return new SubtitleInputBuffer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final SubtitleOutputBuffer createOutputBuffer() {
        return new SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.SimpleSubtitleDecoder.1
            @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
            public void release() {
                SimpleSubtitleDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final SubtitleDecoderException createUnexpectedDecodeException(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    @Nullable
    public final SubtitleDecoderException decode(SubtitleInputBuffer subtitleInputBuffer, SubtitleOutputBuffer subtitleOutputBuffer, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
            subtitleOutputBuffer.setContent(subtitleInputBuffer.timeUs, decode(byteBuffer.array(), byteBuffer.limit(), z10), subtitleInputBuffer.subsampleOffsetUs);
            subtitleOutputBuffer.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }
}
