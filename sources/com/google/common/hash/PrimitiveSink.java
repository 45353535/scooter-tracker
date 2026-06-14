package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface PrimitiveSink {
    @CanIgnoreReturnValue
    PrimitiveSink putBoolean(boolean z10);

    @CanIgnoreReturnValue
    PrimitiveSink putByte(byte b10);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(ByteBuffer byteBuffer);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bArr);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bArr, int i10, int i11);

    @CanIgnoreReturnValue
    PrimitiveSink putChar(char c10);

    @CanIgnoreReturnValue
    PrimitiveSink putDouble(double d10);

    @CanIgnoreReturnValue
    PrimitiveSink putFloat(float f10);

    @CanIgnoreReturnValue
    PrimitiveSink putInt(int i10);

    @CanIgnoreReturnValue
    PrimitiveSink putLong(long j10);

    @CanIgnoreReturnValue
    PrimitiveSink putShort(short s10);

    @CanIgnoreReturnValue
    PrimitiveSink putString(CharSequence charSequence, Charset charset);

    @CanIgnoreReturnValue
    PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
