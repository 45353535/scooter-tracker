package com.google.android.exoplayer2.extractor.avi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes7.dex */
final class StreamFormatChunk implements AviChunk {
    private static final String TAG = "StreamFormatChunk";
    public final Format format;

    public StreamFormatChunk(Format format) {
        this.format = format;
    }

    @Nullable
    private static String getMimeTypeFromCompression(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    @Nullable
    private static String getMimeTypeFromTag(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @Nullable
    private static AviChunk parseBitmapInfoHeader(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        String mimeTypeFromCompression = getMimeTypeFromCompression(littleEndianInt3);
        if (mimeTypeFromCompression != null) {
            Format.Builder builder = new Format.Builder();
            builder.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
            return new StreamFormatChunk(builder.build());
        }
        Log.w(TAG, "Ignoring track with unsupported compression " + littleEndianInt3);
        return null;
    }

    @Nullable
    public static AviChunk parseFrom(int i10, ParsableByteArray parsableByteArray) {
        if (i10 == 2) {
            return parseBitmapInfoHeader(parsableByteArray);
        }
        if (i10 == 1) {
            return parseWaveFormatEx(parsableByteArray);
        }
        Log.w(TAG, "Ignoring strf box for unsupported track type: " + Util.getTrackTypeString(i10));
        return null;
    }

    @Nullable
    private static AviChunk parseWaveFormatEx(ParsableByteArray parsableByteArray) {
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        String mimeTypeFromTag = getMimeTypeFromTag(littleEndianUnsignedShort);
        if (mimeTypeFromTag == null) {
            Log.w(TAG, "Ignoring track with unsupported format tag " + littleEndianUnsignedShort);
            return null;
        }
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = Util.getPcmEncoding(parsableByteArray.readUnsignedShort());
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        byte[] bArr = new byte[littleEndianUnsignedShort3];
        parsableByteArray.readBytes(bArr, 0, littleEndianUnsignedShort3);
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(mimeTypeFromTag).setChannelCount(littleEndianUnsignedShort2).setSampleRate(littleEndianInt);
        if ("audio/raw".equals(mimeTypeFromTag) && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if ("audio/mp4a-latm".equals(mimeTypeFromTag) && littleEndianUnsignedShort3 > 0) {
            builder.setInitializationData(ImmutableList.of(bArr));
        }
        return new StreamFormatChunk(builder.build());
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return 1718776947;
    }
}
