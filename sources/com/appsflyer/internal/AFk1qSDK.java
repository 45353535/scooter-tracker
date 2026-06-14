package com.appsflyer.internal;

import androidx.collection.SieveCacheKt;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class AFk1qSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private short component1;
    private int component2;
    private byte[] component3;
    private long[] component4;
    private int equals;
    private final int getCurrencyIso4217Code;
    private int getMediationNetwork;
    private long[] getMonetizationNetwork;
    private final int getRevenue;

    public AFk1qSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13) throws IOException {
        this(inputStream, i10, i11, s10, i12, i13, (byte) 0);
    }

    private int getMediationNetwork() throws IOException {
        int i10;
        if (this.component2 == Integer.MAX_VALUE) {
            this.component2 = ((FilterInputStream) this).in.read();
        }
        if (this.areAllFieldsValid == this.AFAdRevenueData) {
            byte[] bArr = this.component3;
            int i11 = this.component2;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.component3, i12, this.AFAdRevenueData - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < this.AFAdRevenueData);
            if (i12 < this.AFAdRevenueData) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.getRevenue;
            if (i14 == this.getCurrencyIso4217Code) {
                getMonetizationNetwork();
            } else {
                if (this.getMediationNetwork <= i14) {
                    getMonetizationNetwork();
                }
                int i15 = this.getMediationNetwork;
                if (i15 < this.getCurrencyIso4217Code) {
                    this.getMediationNetwork = i15 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.component2 = i16;
            this.areAllFieldsValid = 0;
            if (i16 < 0) {
                int i17 = this.AFAdRevenueData;
                i10 = i17 - (this.component3[i17 - 1] & 255);
            } else {
                i10 = this.AFAdRevenueData;
            }
            this.equals = i10;
        }
        return this.equals;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getMonetizationNetwork;
        long[] jArr2 = this.component4;
        short s10 = this.component1;
        long j10 = jArr[s10 % 4] * 2147483085;
        long j11 = jArr2[(s10 + 2) % 4];
        long j12 = (j10 + j11) % SieveCacheKt.NodeLinkMask;
        int i10 = (s10 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / SieveCacheKt.NodeLinkMask;
        jArr[i10] = j12;
        for (int i11 = 0; i11 < this.AFAdRevenueData; i11++) {
            this.component3[i11] = (byte) (((long) r1[i11]) ^ ((this.getMonetizationNetwork[this.component1] >> (i11 << 3)) & 255));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.equals - this.areAllFieldsValid;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i10 = this.areAllFieldsValid;
        if (i10 >= this.equals) {
            return -1;
        }
        byte[] bArr = this.component3;
        this.areAllFieldsValid = i10 + 1;
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

    private AFk1qSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13, byte b10) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMediationNetwork = 1;
        this.component2 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s10, 4), 8);
        this.AFAdRevenueData = iMin;
        this.component3 = new byte[iMin];
        this.getMonetizationNetwork = new long[4];
        this.component4 = new long[4];
        this.areAllFieldsValid = iMin;
        this.equals = iMin;
        this.getMonetizationNetwork = AFk1rSDK.AFAdRevenueData(i10 ^ i13, iMin ^ i13);
        this.component4 = AFk1rSDK.AFAdRevenueData(i11 ^ i13, i12 ^ i13);
        this.getRevenue = 100;
        this.getCurrencyIso4217Code = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            getMediationNetwork();
            int i14 = this.areAllFieldsValid;
            if (i14 >= this.equals) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.component3;
            this.areAllFieldsValid = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
