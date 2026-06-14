package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MediaFormatUtil {
    public static final String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private MediaFormatUtil() {
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, com.taurusx.tax.f.a.f65992s, format.bitrate);
        maybeSetInteger(mediaFormat, "max-bitrate", format.peakBitrate);
        maybeSetInteger(mediaFormat, "channel-count", format.channelCount);
        maybeSetColorInfo(mediaFormat, format.colorInfo);
        maybeSetString(mediaFormat, "mime", format.sampleMimeType);
        maybeSetString(mediaFormat, "codecs-string", format.codecs);
        maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        maybeSetInteger(mediaFormat, "width", format.width);
        maybeSetInteger(mediaFormat, "height", format.height);
        setCsdBuffers(mediaFormat, format.initializationData);
        maybeSetPcmEncoding(mediaFormat, format.pcmEncoding);
        maybeSetString(mediaFormat, "language", format.language);
        maybeSetInteger(mediaFormat, "max-input-size", format.maxInputSize);
        maybeSetInteger(mediaFormat, "sample-rate", format.sampleRate);
        maybeSetInteger(mediaFormat, "caption-service-number", format.accessibilityChannel);
        mediaFormat.setInteger("rotation-degrees", format.rotationDegrees);
        int i10 = format.selectionFlags;
        setBooleanAsInt(mediaFormat, "is-autoselect", i10 & 4);
        setBooleanAsInt(mediaFormat, "is-default", i10 & 1);
        setBooleanAsInt(mediaFormat, "is-forced-subtitle", i10 & 2);
        mediaFormat.setInteger("encoder-delay", format.encoderDelay);
        mediaFormat.setInteger("encoder-padding", format.encoderPadding);
        maybeSetPixelAspectRatio(mediaFormat, format.pixelWidthHeightRatio);
        return mediaFormat;
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Nullable
    public static ColorInfo getColorInfo(MediaFormat mediaFormat) {
        if (Util.SDK_INT < 29) {
            return null;
        }
        int integer = mediaFormat.getInteger("color-standard", -1);
        int integer2 = mediaFormat.getInteger("color-range", -1);
        int integer3 = mediaFormat.getInteger("color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (!isValidColorSpace(integer)) {
            integer = -1;
        }
        if (!isValidColorRange(integer2)) {
            integer2 = -1;
        }
        if (!isValidColorTransfer(integer3)) {
            integer3 = -1;
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && array == null) {
            return null;
        }
        return new ColorInfo(integer, integer2, integer3, array);
    }

    private static boolean isValidColorRange(int i10) {
        return i10 == 2 || i10 == 1 || i10 == -1;
    }

    private static boolean isValidColorSpace(int i10) {
        return i10 == 2 || i10 == 1 || i10 == 6 || i10 == -1;
    }

    private static boolean isValidColorTransfer(int i10) {
        return i10 == 3 || i10 == 6 || i10 == 7 || i10 == -1;
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, @Nullable ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPcmEncoding(MediaFormat mediaFormat, int i10) {
        int i11;
        if (i10 == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, "exo-pcm-encoding-int", i10);
        if (i10 == 0) {
            i11 = 0;
        } else if (i10 == 536870912) {
            i11 = 21;
        } else if (i10 != 805306368) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return;
                    }
                }
            }
        } else {
            i11 = 22;
        }
        mediaFormat.setInteger("pcm-encoding", i11);
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPixelAspectRatio(MediaFormat mediaFormat, float f10) {
        int i10;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f10);
        int i11 = 1073741824;
        if (f10 < 1.0f) {
            i11 = (int) (f10 * 1073741824);
            i10 = 1073741824;
        } else if (f10 > 1.0f) {
            i10 = (int) (1073741824 / f10);
        } else {
            i11 = 1;
            i10 = 1;
        }
        mediaFormat.setInteger("sar-width", i11);
        mediaFormat.setInteger("sar-height", i10);
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, @Nullable String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    private static void setBooleanAsInt(MediaFormat mediaFormat, String str, int i10) {
        mediaFormat.setInteger(str, i10 != 0 ? 1 : 0);
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
