package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzer {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgup zzc = zzgup.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzer(byte[] bArr, int i10) {
        this.zze = bArr;
        this.zzg = i10;
    }

    private final char zzS(ByteOrder byteOrder, int i10) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i11 = this.zzf + i10;
            return zzgxw.zza(bArr[i11], bArr[i11 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i12 = this.zzf + i10;
        return zzgxw.zza(bArr2[i12 + 1], bArr2[i12]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j10 = i;
                char c10 = (char) j10;
                zzgrc.zze(((long) c10) == j10, "Out of range: %s", j10);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.zzf += zzgxz.zza(iZzU & 255);
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int zzU(Charset charset) {
        int codePoint;
        int i10;
        int iA;
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i11 = this.zzf;
            int i12 = this.zzg;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 17 + String.valueOf(i12).length());
            sb2.append("position=");
            sb2.append(i11);
            sb2.append(", limit=");
            sb2.append(i12);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.zze[this.zzf];
            if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                codePoint = o0.a(b10);
                return (codePoint << 8) | i13;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.zze[this.zzf];
            if ((b11 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                i10 = 1;
            } else if ((b11 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i10 = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i14 = this.zzf;
                    if (zzX(bArr[i14 + 1]) && zzX(bArr[i14 + 2])) {
                        i10 = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i15 = this.zzf;
                    if (zzX(bArr2[i15 + 1]) && zzX(bArr2[i15 + 2]) && zzX(bArr2[i15 + 3])) {
                        i10 = 4;
                    }
                }
                i10 = 0;
            }
            if (i10 == 1) {
                iA = o0.a(this.zze[this.zzf]);
            } else if (i10 == 2) {
                byte[] bArr3 = this.zze;
                int i16 = this.zzf;
                iA = zzY(0, 0, bArr3[i16], bArr3[i16 + 1]);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        byte[] bArr4 = this.zze;
                        int i17 = this.zzf;
                        iA = zzY(bArr4[i17], bArr4[i17 + 1], bArr4[i17 + 2], bArr4[i17 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i18 = this.zzf;
                iA = zzY(0, bArr5[i18] & Ascii.SI, bArr5[i18 + 1], bArr5[i18 + 2]);
            }
            i13 = i10;
            codePoint = iA;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i13 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i13 = 4;
            }
        }
        return (codePoint << 8) | i13;
    }

    private static int zzV(Charset charset) {
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i10) {
        if (!zzd.get() || zzd() >= i10) {
            return;
        }
        int iZzd = zzd();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + String.valueOf(iZzd).length());
        sb2.append("bytesNeeded= ");
        sb2.append(i10);
        sb2.append(", bytesLeft=");
        sb2.append(iZzd);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    private static boolean zzX(byte b10) {
        return (b10 & 192) == 128;
    }

    private static int zzY(int i10, int i11, int i12, int i13) {
        return zzgxz.zze((byte) 0, zzgyd.zza(((i10 & 7) << 2) | ((i11 & 48) >> 4)), zzgyd.zza(((i12 & 60) >> 2) | ((i11 & 15) << 4)), zzgyd.zza((i13 & 63) | ((i12 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.zzf = i13;
        long j12 = bArr[i12];
        this.zzf = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | (255 & j10) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.zzf = i15;
        int i16 = bArr[i13] & 255;
        this.zzf = i10 + 4;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.zzf = i15;
        int i16 = bArr[i13] & 255;
        this.zzf = i10 + 4;
        return ((bArr[i15] & 255) << 24) | (i14 << 8) | i12 | (i16 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.zzf = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.zzf = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.zzf = i16;
        long j15 = bArr[i15];
        int i17 = i10 + 7;
        this.zzf = i17;
        long j16 = bArr[i16];
        this.zzf = i10 + 8;
        return ((j16 & 255) << 8) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (((long) bArr[i17]) & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i10 + 4;
        this.zzf = i14;
        long j13 = bArr[i13];
        int i15 = i10 + 5;
        this.zzf = i15;
        long j14 = bArr[i14];
        int i16 = i10 + 6;
        this.zzf = i16;
        long j15 = bArr[i15];
        int i17 = i10 + 7;
        this.zzf = i17;
        long j16 = bArr[i16];
        this.zzf = i10 + 8;
        return ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((((long) bArr[i17]) & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        this.zzf = i10 + 2;
        int i13 = bArr[i11] & 255;
        this.zzf = i10 + 4;
        return (i12 << 8) | i13;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(iZzB);
        throw new IllegalStateException(sb2.toString());
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(iZzC);
        throw new IllegalStateException(sb2.toString());
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(jZzD).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(jZzD);
        throw new IllegalStateException(sb2.toString());
    }

    public final String zzK(int i10, Charset charset) {
        zzW(i10);
        byte[] bArr = this.zze;
        int i11 = this.zzf;
        String str = new String(bArr, i11, i10, charset);
        this.zzf = i11 + i10;
        return str;
    }

    public final String zzL(int i10) {
        zzW(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zzf;
        int i12 = (i11 + i10) - 1;
        String strZzj = zzfj.zzj(this.zze, i11, (i12 >= this.zzg || this.zze[i12] != 0) ? i10 : i10 - 1);
        this.zzf += i10;
        return strZzj;
    }

    @Nullable
    public final String zzM(char c10) {
        if (zzd() == 0) {
            return null;
        }
        int i10 = this.zzf;
        while (i10 < this.zzg && this.zze[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.zze;
        int i11 = this.zzf;
        String strZzj = zzfj.zzj(bArr, i11, i10 - i11);
        this.zzf = i10;
        if (i10 < this.zzg) {
            this.zzf = i10 + 1;
        }
        return strZzj;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzN(java.nio.charset.Charset r5) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzer.zzN(java.nio.charset.Charset):java.lang.String");
    }

    public final long zzO() {
        int i10;
        zzW(1);
        long j10 = this.zze[this.zzf];
        int i11 = 7;
        while (true) {
            i10 = 0;
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j10) != 0) {
                i11--;
            } else if (i11 < 6) {
                j10 &= (long) (i12 - 1);
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j10);
            throw new NumberFormatException(sb2.toString());
        }
        zzW(i10);
        for (int i13 = 1; i13 < i10; i13++) {
            byte b10 = this.zze[this.zzf + i13];
            if ((b10 & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 42);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j10);
                throw new NumberFormatException(sb3.toString());
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.zzf += i10;
        return j10;
    }

    public final long zzP() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j10 |= (127 & jZzs) << (i10 * 7);
            if ((jZzs & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    @Nullable
    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i10 = this.zzf;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.zzf = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i11 = this.zzf;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.zzf = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.zzf = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i10) {
        byte[] bArr = this.zze;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzb(bArr, i10);
    }

    public final void zzb(byte[] bArr, int i10) {
        this.zze = bArr;
        this.zzg = i10;
        this.zzf = 0;
    }

    public final void zzc(int i10) {
        byte[] bArr = this.zze;
        if (i10 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i10);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zze.length) {
            z10 = true;
        }
        zzgrc.zza(z10);
        this.zzg = i10;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzg) {
            z10 = true;
        }
        zzgrc.zza(z10);
        this.zzf = i10;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i10) {
        zzh(this.zzf + i10);
    }

    public final void zzl(zzeq zzeqVar, int i10) {
        zzm(zzeqVar.zza, 0, i10);
        zzeqVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i10, int i11) {
        zzW(i11);
        System.arraycopy(this.zze, this.zzf, bArr, i10, i11);
        this.zzf += i11;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & 255;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        if (zzU(charset) != 0) {
            return zzgxz.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i10 = this.zzf;
        int i11 = this.zzg;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length());
        sb2.append("position=");
        sb2.append(i10);
        sb2.append(", limit=");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i10 = this.zzf;
        int i11 = this.zzg;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length());
        sb2.append("position=");
        sb2.append(i10);
        sb2.append(", limit=");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        this.zzf = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        this.zzf = i10 + 2;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        this.zzf = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        this.zzf = i10 + 2;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        this.zzf = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & 255;
        this.zzf = i10 + 3;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zzf = i13;
        int i14 = bArr[i11] & 255;
        this.zzf = i10 + 3;
        return (bArr[i13] & 255) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i10 + 2;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i10 + 3;
        this.zzf = i13;
        long j12 = bArr[i12];
        this.zzf = i10 + 4;
        return (((long) bArr[i13]) & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public zzer() {
        this.zze = zzfj.zzb;
    }

    public zzer(int i10) {
        this.zze = new byte[i10];
        this.zzg = i10;
    }

    public zzer(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
