package com.bytedance.sdk.component.ud.qdl.ud;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class qdl implements lnr, ud, Cloneable, ByteChannel, AutoCloseable {
    private static final byte[] lnr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    mzz qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    long f16714ud;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdl)) {
            return false;
        }
        qdl qdlVar = (qdl) obj;
        long j10 = this.f16714ud;
        if (j10 != qdlVar.f16714ud) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        mzz mzzVar = this.qdl;
        mzz mzzVar2 = qdlVar.qdl;
        int i10 = mzzVar.f16712ud;
        int i11 = mzzVar2.f16712ud;
        while (j11 < this.f16714ud) {
            long jMin = Math.min(mzzVar.lnr - i10, mzzVar2.lnr - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (mzzVar.qdl[i10] != mzzVar2.qdl[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == mzzVar.lnr) {
                mzzVar = mzzVar.mo;
                i10 = mzzVar.f16712ud;
            }
            if (i11 == mzzVar2.lnr) {
                mzzVar2 = mzzVar2.mo;
                i11 = mzzVar2.f16712ud;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        mzz mzzVar = this.qdl;
        if (mzzVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = mzzVar.lnr;
            for (int i12 = mzzVar.f16712ud; i12 < i11; i12++) {
                i10 = (i10 * 31) + mzzVar.qdl[i12];
            }
            mzzVar = mzzVar.mo;
        } while (mzzVar != this.qdl);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public String lnr() {
        try {
            return qdl(this.f16714ud, tvp.qdl);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public qdl clone() {
        qdl qdlVar = new qdl();
        if (this.f16714ud == 0) {
            return qdlVar;
        }
        mzz mzzVarQdl = this.qdl.qdl();
        qdlVar.qdl = mzzVarQdl;
        mzzVarQdl.f16713wd = mzzVarQdl;
        mzzVarQdl.mo = mzzVarQdl;
        mzz mzzVar = this.qdl;
        while (true) {
            mzzVar = mzzVar.mo;
            if (mzzVar == this.qdl) {
                qdlVar.f16714ud = this.f16714ud;
                return qdlVar;
            }
            qdlVar.qdl.f16713wd.qdl(mzzVar.qdl());
        }
    }

    public final mml mzz() {
        long j10 = this.f16714ud;
        if (j10 <= SieveCacheKt.NodeLinkMask) {
            return mml((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f16714ud);
    }

    public boolean qdl() {
        return this.f16714ud == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        mzz mzzVar = this.qdl;
        if (mzzVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), mzzVar.lnr - mzzVar.f16712ud);
        byteBuffer.put(mzzVar.qdl, mzzVar.f16712ud, iMin);
        int i10 = mzzVar.f16712ud + iMin;
        mzzVar.f16712ud = i10;
        this.f16714ud -= (long) iMin;
        if (i10 == mzzVar.lnr) {
            this.qdl = mzzVar.ud();
            mo.qdl(mzzVar);
        }
        return iMin;
    }

    public String toString() {
        return mzz().toString();
    }

    public byte ud() {
        long j10 = this.f16714ud;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        mzz mzzVar = this.qdl;
        int i10 = mzzVar.f16712ud;
        int i11 = mzzVar.lnr;
        int i12 = i10 + 1;
        byte b10 = mzzVar.qdl[i10];
        this.f16714ud = j10 - 1;
        if (i12 != i11) {
            mzzVar.f16712ud = i12;
            return b10;
        }
        this.qdl = mzzVar.ud();
        mo.qdl(mzzVar);
        return b10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            mzz mzzVarLnr = lnr(1);
            int iMin = Math.min(i10, 8192 - mzzVarLnr.lnr);
            byteBuffer.get(mzzVarLnr.qdl, mzzVarLnr.lnr, iMin);
            i10 -= iMin;
            mzzVarLnr.lnr += iMin;
        }
        this.f16714ud += (long) iRemaining;
        return iRemaining;
    }

    public String qdl(long j10, Charset charset) throws EOFException {
        tvp.qdl(this.f16714ud, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        mzz mzzVar = this.qdl;
        int i10 = mzzVar.f16712ud;
        if (((long) i10) + j10 > mzzVar.lnr) {
            return new String(qdl(j10), charset);
        }
        String str = new String(mzzVar.qdl, i10, (int) j10, charset);
        int i11 = (int) (((long) mzzVar.f16712ud) + j10);
        mzzVar.f16712ud = i11;
        this.f16714ud -= j10;
        if (i11 == mzzVar.lnr) {
            this.qdl = mzzVar.ud();
            mo.qdl(mzzVar);
        }
        return str;
    }

    mzz lnr(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            mzz mzzVar = this.qdl;
            if (mzzVar == null) {
                mzz mzzVarQdl = mo.qdl();
                this.qdl = mzzVarQdl;
                mzzVarQdl.f16713wd = mzzVarQdl;
                mzzVarQdl.mo = mzzVarQdl;
                return mzzVarQdl;
            }
            mzz mzzVar2 = mzzVar.f16713wd;
            return (mzzVar2.lnr + i10 > 8192 || !mzzVar2.mzz) ? mzzVar2.qdl(mo.qdl()) : mzzVar2;
        }
        throw new IllegalArgumentException();
    }

    public final mml mml(int i10) {
        if (i10 == 0) {
            return mml.lnr;
        }
        return new wd(this, i10);
    }

    public qdl ud(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            tvp.qdl(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                mzz mzzVarLnr = lnr(1);
                int iMin = Math.min(i12 - i10, 8192 - mzzVarLnr.lnr);
                System.arraycopy(bArr, i10, mzzVarLnr.qdl, mzzVarLnr.lnr, iMin);
                i10 += iMin;
                mzzVarLnr.lnr += iMin;
            }
            this.f16714ud += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] qdl(long j10) throws EOFException {
        tvp.qdl(this.f16714ud, 0L, j10);
        if (j10 <= SieveCacheKt.NodeLinkMask) {
            byte[] bArr = new byte[(int) j10];
            qdl(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    public void qdl(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iQdl = qdl(bArr, i10, bArr.length - i10);
            if (iQdl == -1) {
                throw new EOFException();
            }
            i10 += iQdl;
        }
    }

    public qdl ud(int i10) {
        mzz mzzVarLnr = lnr(1);
        byte[] bArr = mzzVarLnr.qdl;
        int i11 = mzzVarLnr.lnr;
        mzzVarLnr.lnr = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f16714ud++;
        return this;
    }

    public int qdl(byte[] bArr, int i10, int i11) {
        tvp.qdl(bArr.length, i10, i11);
        mzz mzzVar = this.qdl;
        if (mzzVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, mzzVar.lnr - mzzVar.f16712ud);
        System.arraycopy(mzzVar.qdl, mzzVar.f16712ud, bArr, i10, iMin);
        int i12 = mzzVar.f16712ud + iMin;
        mzzVar.f16712ud = i12;
        this.f16714ud -= (long) iMin;
        if (i12 == mzzVar.lnr) {
            this.qdl = mzzVar.ud();
            mo.qdl(mzzVar);
        }
        return iMin;
    }

    public qdl ud(long j10) {
        if (j10 == 0) {
            return ud(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        mzz mzzVarLnr = lnr(iNumberOfTrailingZeros);
        byte[] bArr = mzzVarLnr.qdl;
        int i10 = mzzVarLnr.lnr;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = lnr[(int) (15 & j10)];
            j10 >>>= 4;
        }
        mzzVarLnr.lnr += iNumberOfTrailingZeros;
        this.f16714ud += (long) iNumberOfTrailingZeros;
        return this;
    }

    public qdl qdl(String str) {
        return qdl(str, 0, str.length());
    }

    public qdl qdl(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    mzz mzzVarLnr = lnr(1);
                    byte[] bArr = mzzVarLnr.qdl;
                    int i12 = mzzVarLnr.lnr - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = mzzVarLnr.lnr;
                    int i15 = (i12 + i10) - i14;
                    mzzVarLnr.lnr = i14 + i15;
                    this.f16714ud += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        ud((cCharAt2 >> 6) | 192);
                        ud((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            ud((i17 >> 18) | 240);
                            ud(((i17 >> 12) & 63) | 128);
                            ud(((i17 >> 6) & 63) | 128);
                            ud((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            ud(63);
                            i10 = i16;
                        }
                    } else {
                        ud((cCharAt2 >> '\f') | 224);
                        ud(((cCharAt2 >> 6) & 63) | 128);
                        ud((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public qdl qdl(int i10) {
        if (i10 < 128) {
            ud(i10);
            return this;
        }
        if (i10 < 2048) {
            ud((i10 >> 6) | 192);
            ud((i10 & 63) | 128);
            return this;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                ud(63);
                return this;
            }
            ud((i10 >> 12) | 224);
            ud(((i10 >> 6) & 63) | 128);
            ud((i10 & 63) | 128);
            return this;
        }
        if (i10 <= 1114111) {
            ud((i10 >> 18) | 240);
            ud(((i10 >> 12) & 63) | 128);
            ud(((i10 >> 6) & 63) | 128);
            ud((i10 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    public qdl qdl(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            if (charset != null) {
                if (charset.equals(tvp.qdl)) {
                    return qdl(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return ud(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }
}
