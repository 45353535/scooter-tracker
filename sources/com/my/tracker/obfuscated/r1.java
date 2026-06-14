package com.my.tracker.obfuscated;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f61811b = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final OutputStream f61812a;

    public r1(OutputStream outputStream) {
        this.f61812a = outputStream;
    }

    public int a(int i10, int i11) {
        return b(i10, 0) + b(i11);
    }

    public int b(byte[] bArr) throws IOException {
        this.f61812a.write(bArr);
        return bArr.length;
    }

    private int b(int i10) {
        if (i10 < 0) {
            return a(i10);
        }
        return a(i10);
    }

    public int a(int i10, long j10) {
        return b(i10, 0) + a(j10);
    }

    private int b(int i10, int i11) {
        return a((i10 << 3) | i11);
    }

    public int a(int i10, double d10) {
        return b(i10, 1) + a(d10);
    }

    public int a(int i10, float f10) {
        return b(i10, 5) + a(f10);
    }

    public int a(int i10, byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return b(i10, 2) + a(bArr);
    }

    public int a(int i10, q qVar) throws IOException {
        if (qVar == null) {
            return 0;
        }
        int iB = b(i10, 2);
        int iB2 = qVar.b();
        int iB3 = iB + b(iB2) + iB2;
        qVar.a(this.f61812a);
        return iB3;
    }

    public int a(int i10, String str) {
        if (str == null) {
            return 0;
        }
        return b(i10, 2) + a(str.getBytes(f61811b));
    }

    public int a(int i10, String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int iA = 0;
        for (String str : strArr) {
            iA += a(i10, str);
        }
        return iA;
    }

    public int a(int i10, Map map, q qVar) {
        int iA = 0;
        if (map != null && !map.isEmpty()) {
            for (String str : new TreeSet(map.keySet())) {
                qVar.a();
                qVar.a(1, str);
                qVar.a(2, (String) map.get(str));
                if (qVar.b() > 0) {
                    iA += a(i10, qVar);
                }
            }
        }
        return iA;
    }

    private int a(long j10) throws IOException {
        int i10 = 0;
        while (true) {
            i10++;
            if (((-128) & j10) == 0) {
                this.f61812a.write((int) j10);
                return i10;
            }
            this.f61812a.write(((int) (127 & j10)) | 128);
            j10 >>>= 7;
        }
    }

    private int a(double d10) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        this.f61812a.write(((int) jDoubleToRawLongBits) & 255);
        this.f61812a.write(((int) (jDoubleToRawLongBits >> 8)) & 255);
        this.f61812a.write(((int) (jDoubleToRawLongBits >> 16)) & 255);
        this.f61812a.write(((int) (jDoubleToRawLongBits >> 24)) & 255);
        this.f61812a.write(((int) (jDoubleToRawLongBits >> 32)) & 255);
        this.f61812a.write(((int) (jDoubleToRawLongBits >> 40)) & 255);
        this.f61812a.write(((int) (jDoubleToRawLongBits >> 48)) & 255);
        this.f61812a.write(((int) (jDoubleToRawLongBits >> 56)) & 255);
        return 8;
    }

    private int a(float f10) throws IOException {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        this.f61812a.write(iFloatToRawIntBits & 255);
        this.f61812a.write((iFloatToRawIntBits >> 8) & 255);
        this.f61812a.write((iFloatToRawIntBits >> 16) & 255);
        this.f61812a.write((iFloatToRawIntBits >> 24) & 255);
        return 4;
    }

    private int a(byte[] bArr) throws IOException {
        int iB = b(bArr.length) + bArr.length;
        this.f61812a.write(bArr);
        return iB;
    }

    private int a(int i10) throws IOException {
        int i11 = 0;
        while (true) {
            i11++;
            if ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                this.f61812a.write(i10);
                return i11;
            }
            this.f61812a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
    }
}
