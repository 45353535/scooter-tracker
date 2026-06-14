package oa;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.primitives.UnsignedBytes;
import io.bidmachine.media3.common.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f96469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f96470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f96471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f96472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f96473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f96474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n9.v f96475l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f96476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f96477b;

        public a(long[] jArr, long[] jArr2) {
            this.f96476a = jArr;
            this.f96477b = jArr2;
        }
    }

    public b0(byte[] bArr, int i10) {
        q9.c0 c0Var = new q9.c0(bArr);
        c0Var.p(i10 * 8);
        this.f96464a = c0Var.h(16);
        this.f96465b = c0Var.h(16);
        this.f96466c = c0Var.h(24);
        this.f96467d = c0Var.h(24);
        int iH = c0Var.h(20);
        this.f96468e = iH;
        this.f96469f = j(iH);
        this.f96470g = c0Var.h(3) + 1;
        int iH2 = c0Var.h(5) + 1;
        this.f96471h = iH2;
        this.f96472i = e(iH2);
        this.f96473j = c0Var.j(36);
        this.f96474k = null;
        this.f96475l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public b0 a(List list) {
        return new b0(this.f96464a, this.f96465b, this.f96466c, this.f96467d, this.f96468e, this.f96470g, this.f96471h, this.f96473j, this.f96474k, h(new n9.v(list)));
    }

    public b0 b(a aVar) {
        return new b0(this.f96464a, this.f96465b, this.f96466c, this.f96467d, this.f96468e, this.f96470g, this.f96471h, this.f96473j, aVar, this.f96475l);
    }

    public b0 c(List list) {
        return new b0(this.f96464a, this.f96465b, this.f96466c, this.f96467d, this.f96468e, this.f96470g, this.f96471h, this.f96473j, this.f96474k, h(v0.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f96467d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f96466c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f96464a;
            j10 = ((((i11 != this.f96465b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.f96470g)) * ((long) this.f96471h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f96473j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f96468e);
    }

    public io.bidmachine.media3.common.a g(byte[] bArr, n9.v vVar) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i10 = this.f96467d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new a.b().u0("audio/flac").k0(i10).R(this.f96470g).v0(this.f96468e).o0(q9.o0.i0(this.f96471h)).g0(Collections.singletonList(bArr)).n0(h(vVar)).N();
    }

    public n9.v h(n9.v vVar) {
        n9.v vVar2 = this.f96475l;
        return vVar2 == null ? vVar : vVar2.b(vVar);
    }

    public long i(long j10) {
        return q9.o0.q((j10 * ((long) this.f96468e)) / 1000000, 0L, this.f96473j - 1);
    }

    private b0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, n9.v vVar) {
        this.f96464a = i10;
        this.f96465b = i11;
        this.f96466c = i12;
        this.f96467d = i13;
        this.f96468e = i14;
        this.f96469f = j(i14);
        this.f96470g = i15;
        this.f96471h = i16;
        this.f96472i = e(i16);
        this.f96473j = j10;
        this.f96474k = aVar;
        this.f96475l = vVar;
    }
}
