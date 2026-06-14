package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.v2;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    private final BitmapDecoder bitmapDecoder;

    @VisibleForTesting(otherwise = 2)
    public interface BitmapDecoder {
        Bitmap decode(byte[] bArr, int i10) throws ImageDecoderException;
    }

    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapDecoder bitmapDecoder;

        public Factory() {
            this.bitmapDecoder = new BitmapDecoder() { // from class: androidx.media3.exoplayer.image.a
                @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
                public final Bitmap decode(byte[] bArr, int i10) {
                    return BitmapFactoryImageDecoder.decode(bArr, i10);
                }
            };
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return (str == null || !MimeTypes.isImage(str)) ? v2.c(0) : Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? v2.c(4) : v2.c(1);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.bitmapDecoder);
        }

        public Factory(BitmapDecoder bitmapDecoder) {
            this.bitmapDecoder = bitmapDecoder;
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    protected DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException {
        return (ImageOutputBuffer) super.dequeueOutputBuffer();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(BitmapDecoder bitmapDecoder) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.bitmapDecoder = bitmapDecoder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    @Nullable
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
            Assertions.checkState(byteBuffer.hasArray());
            Assertions.checkArgument(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.bitmap = this.bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ImageDecoderException e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr, int i10) throws ImageDecoderException {
        try {
            return BitmapUtil.decode(bArr, i10, null);
        } catch (ParserException e10) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new ImageDecoderException(e11);
        }
    }
}
