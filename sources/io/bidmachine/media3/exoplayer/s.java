package io.bidmachine.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import ga.f0;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends n9.y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f81282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f81283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f81284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final io.bidmachine.media3.common.a f81285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f81286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0.b f81287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final boolean f81288q;

    private s(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static s b(Throwable th2, String str, int i10, io.bidmachine.media3.common.a aVar, int i11, boolean z10, int i12) {
        if (aVar == null) {
            i11 = 4;
        }
        return new s(1, th2, null, i12, str, i10, aVar, i11, z10);
    }

    public static s c(IOException iOException, int i10) {
        return new s(0, iOException, i10);
    }

    public static s d(RuntimeException runtimeException, int i10) {
        return new s(2, runtimeException, i10);
    }

    private static String g(int i10, String str, String str2, int i11, io.bidmachine.media3.common.a aVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + aVar + ", format_supported=" + q9.o0.d0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    s a(f0.b bVar) {
        return new s((String) q9.o0.i(getMessage()), getCause(), this.f95673b, this.f81282k, this.f81283l, this.f81284m, this.f81285n, this.f81286o, bVar, this.f95674c, this.f81288q);
    }

    private s(int i10, Throwable th2, String str, int i11, String str2, int i12, io.bidmachine.media3.common.a aVar, int i13, boolean z10) {
        this(g(i10, str, str2, i12, aVar, i13), th2, i11, i10, str2, i12, aVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private s(String str, Throwable th2, int i10, int i11, String str2, int i12, io.bidmachine.media3.common.a aVar, int i13, f0.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        q9.a.a(!z10 || i11 == 1);
        q9.a.a(th2 != null || i11 == 3);
        this.f81282k = i11;
        this.f81283l = str2;
        this.f81284m = i12;
        this.f81285n = aVar;
        this.f81286o = i13;
        this.f81287p = bVar;
        this.f81288q = z10;
    }
}
