package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.math.IntMath;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class RtpPacket {
    public static final int CSRC_SIZE = 4;
    private static final byte[] EMPTY = new byte[0];
    public static final int MAX_SEQUENCE_NUMBER = 65535;
    public static final int MAX_SIZE = 65507;
    public static final int MIN_HEADER_SIZE = 12;
    public static final int MIN_SEQUENCE_NUMBER = 0;
    public static final int RTP_VERSION = 2;
    public final byte[] csrc;
    public final byte csrcCount;
    public final boolean extension;
    public final boolean marker;
    public final boolean padding;
    public final byte[] payloadData;
    public final byte payloadType;
    public final int sequenceNumber;
    public final int ssrc;
    public final long timestamp;
    public final byte version;

    public static final class Builder {
        private boolean marker;
        private boolean padding;
        private byte payloadType;
        private int sequenceNumber;
        private int ssrc;
        private long timestamp;
        private byte[] csrc = RtpPacket.EMPTY;
        private byte[] payloadData = RtpPacket.EMPTY;

        public RtpPacket build() {
            return new RtpPacket(this);
        }

        public Builder setCsrc(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.csrc = bArr;
            return this;
        }

        public Builder setMarker(boolean z10) {
            this.marker = z10;
            return this;
        }

        public Builder setPadding(boolean z10) {
            this.padding = z10;
            return this;
        }

        public Builder setPayloadData(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.payloadData = bArr;
            return this;
        }

        public Builder setPayloadType(byte b10) {
            this.payloadType = b10;
            return this;
        }

        public Builder setSequenceNumber(int i10) {
            Assertions.checkArgument(i10 >= 0 && i10 <= 65535);
            this.sequenceNumber = i10 & 65535;
            return this;
        }

        public Builder setSsrc(int i10) {
            this.ssrc = i10;
            return this;
        }

        public Builder setTimestamp(long j10) {
            this.timestamp = j10;
            return this;
        }
    }

    public static int getNextSequenceNumber(int i10) {
        return IntMath.mod(i10 + 1, 65536);
    }

    public static int getPreviousSequenceNumber(int i10) {
        return IntMath.mod(i10 - 1, 65536);
    }

    @Nullable
    public static RtpPacket parse(ParsableByteArray parsableByteArray) {
        byte[] bArr;
        if (parsableByteArray.bytesLeft() < 12) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        byte b10 = (byte) (unsignedByte >> 6);
        boolean z10 = ((unsignedByte >> 5) & 1) == 1;
        byte b11 = (byte) (unsignedByte & 15);
        if (b10 != 2) {
            return null;
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        boolean z11 = ((unsignedByte2 >> 7) & 1) == 1;
        byte b12 = (byte) (unsignedByte2 & 127);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i10 = parsableByteArray.readInt();
        if (b11 > 0) {
            bArr = new byte[b11 * 4];
            for (int i11 = 0; i11 < b11; i11++) {
                parsableByteArray.readBytes(bArr, i11 * 4, 4);
            }
        } else {
            bArr = EMPTY;
        }
        byte[] bArr2 = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr2, 0, parsableByteArray.bytesLeft());
        return new Builder().setPadding(z10).setMarker(z11).setPayloadType(b12).setSequenceNumber(unsignedShort).setTimestamp(unsignedInt).setSsrc(i10).setCsrc(bArr).setPayloadData(bArr2).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RtpPacket.class == obj.getClass()) {
            RtpPacket rtpPacket = (RtpPacket) obj;
            if (this.payloadType == rtpPacket.payloadType && this.sequenceNumber == rtpPacket.sequenceNumber && this.marker == rtpPacket.marker && this.timestamp == rtpPacket.timestamp && this.ssrc == rtpPacket.ssrc) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.payloadType) * 31) + this.sequenceNumber) * 31) + (this.marker ? 1 : 0)) * 31;
        long j10 = this.timestamp;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.ssrc;
    }

    public String toString() {
        return Util.formatInvariant("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.payloadType), Integer.valueOf(this.sequenceNumber), Long.valueOf(this.timestamp), Integer.valueOf(this.ssrc), Boolean.valueOf(this.marker));
    }

    public int writeToBuffer(byte[] bArr, int i10, int i11) {
        int length = (this.csrcCount * 4) + 12 + this.payloadData.length;
        if (i11 < length || bArr.length - i10 < length) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, i11);
        byte b10 = (byte) (((this.padding ? 1 : 0) << 5) | 128 | ((this.extension ? 1 : 0) << 4) | (this.csrcCount & Ascii.SI));
        byteBufferWrap.put(b10).put((byte) (((this.marker ? 1 : 0) << 7) | (this.payloadType & Ascii.DEL))).putShort((short) this.sequenceNumber).putInt((int) this.timestamp).putInt(this.ssrc).put(this.csrc).put(this.payloadData);
        return length;
    }

    private RtpPacket(Builder builder) {
        this.version = (byte) 2;
        this.padding = builder.padding;
        this.extension = false;
        this.marker = builder.marker;
        this.payloadType = builder.payloadType;
        this.sequenceNumber = builder.sequenceNumber;
        this.timestamp = builder.timestamp;
        this.ssrc = builder.ssrc;
        byte[] bArr = builder.csrc;
        this.csrc = bArr;
        this.csrcCount = (byte) (bArr.length / 4);
        this.payloadData = builder.payloadData;
    }

    @Nullable
    public static RtpPacket parse(byte[] bArr, int i10) {
        return parse(new ParsableByteArray(bArr, i10));
    }
}
