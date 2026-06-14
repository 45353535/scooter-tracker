package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class AFk1mSDK extends FilterInputStream {
    private static final short AFAdRevenueData = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private int AFInAppEventParameterName;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private final int copy;
    private final int copydefault;
    private int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1mSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) throws IOException {
        this(inputStream, iArr, i10, bArr, i11, i12, (byte) 0);
    }

    private int getCurrencyIso4217Code() throws IOException {
        if (this.component4 == Integer.MAX_VALUE) {
            this.component4 = ((FilterInputStream) this).in.read();
        }
        if (this.getRevenue == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i10 = this.component4;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.copy;
            if (i13 == this.copydefault) {
                getMonetizationNetwork();
            } else {
                if (this.AFInAppEventParameterName <= i13) {
                    getMonetizationNetwork();
                }
                int i14 = this.AFInAppEventParameterName;
                if (i14 < this.copydefault) {
                    this.AFInAppEventParameterName = i14 + 1;
                } else {
                    this.AFInAppEventParameterName = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.component4 = i15;
            this.getRevenue = 0;
            this.areAllFieldsValid = i15 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.areAllFieldsValid;
    }

    private void getMonetizationNetwork() {
        if (this.component1 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        boolean z10 = true;
        char c10 = 2;
        int i10 = ((bArr2[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = 0;
        while (true) {
            int i13 = this.component2;
            if (i12 >= i13) {
                break;
            }
            short s10 = AFAdRevenueData;
            i11 -= ((((i13 - i12) * s10) + i10) ^ ((i10 << 4) + this.toString)) ^ ((i10 >>> 5) + this.hashCode);
            i10 -= (((i11 << 4) + this.component3) ^ ((s10 * (i13 - i12)) + i11)) ^ ((i11 >>> 5) + this.equals);
            i12++;
            c10 = c10;
            z10 = z10;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[z10 ? 1 : 0] = (byte) (i10 >> 16);
        bArr3[c10] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.component1 == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.getMonetizationNetwork[i14]);
            }
            byte[] bArr5 = this.getCurrencyIso4217Code;
            System.arraycopy(bArr5, 0, this.getMonetizationNetwork, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.areAllFieldsValid - this.getRevenue;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i10 = this.getRevenue;
        if (i10 >= this.areAllFieldsValid) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getRevenue = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1mSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12, byte b10) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component4 = Integer.MAX_VALUE;
        this.AFInAppEventParameterName = 1;
        this.getMediationNetwork = new byte[8];
        this.getMonetizationNetwork = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.getRevenue = 8;
        this.areAllFieldsValid = 8;
        this.component2 = Math.min(Math.max(i11, 5), 16);
        this.component1 = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.getMonetizationNetwork, 0, 8);
        }
        long j10 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i10 == 0) {
            this.component3 = (int) j10;
            long j11 = j10 >> 3;
            short s10 = AFAdRevenueData;
            this.equals = (int) ((((long) s10) * j11) >> 32);
            this.toString = (int) (j10 >> 32);
            this.hashCode = (int) (j11 + ((long) s10));
        } else {
            int i13 = (int) j10;
            this.component3 = i13;
            this.equals = i13 * i10;
            this.toString = i10 ^ i13;
            this.hashCode = (int) (j10 >> 32);
        }
        this.copy = 100;
        this.copydefault = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            getCurrencyIso4217Code();
            int i14 = this.getRevenue;
            if (i14 >= this.areAllFieldsValid) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getRevenue = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
