package com.yandex.varioqub.protobuf.nano;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class WireFormatNano {
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    static final int WIRETYPE_END_GROUP = 4;
    static final int WIRETYPE_FIXED32 = 5;
    static final int WIRETYPE_FIXED64 = 1;
    static final int WIRETYPE_LENGTH_DELIMITED = 2;
    static final int WIRETYPE_START_GROUP = 3;
    static final int WIRETYPE_VARINT = 0;
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final byte[][] EMPTY_BYTES_ARRAY = new byte[0][];
    public static final byte[] EMPTY_BYTES = new byte[0];

    private WireFormatNano() {
    }

    public static final int getRepeatedFieldArrayLength(CodedInputByteBufferNano codedInputByteBufferNano, int i10) throws IOException {
        int position = codedInputByteBufferNano.getPosition();
        codedInputByteBufferNano.skipField(i10);
        int i11 = 1;
        while (codedInputByteBufferNano.readTag() == i10) {
            codedInputByteBufferNano.skipField(i10);
            i11++;
        }
        codedInputByteBufferNano.rewindToPosition(position);
        return i11;
    }

    public static int getTagFieldNumber(int i10) {
        return i10 >>> 3;
    }

    static int getTagWireType(int i10) {
        return i10 & 7;
    }

    static int makeTag(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public static boolean parseUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int i10) throws IOException {
        return codedInputByteBufferNano.skipField(i10);
    }
}
