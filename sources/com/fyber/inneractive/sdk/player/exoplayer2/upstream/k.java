package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C4240b4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f23036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23041f;

    public k(Uri uri, long j10, long j11, long j12, String str, int i10) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        if (j12 <= 0 && j12 != -1) {
            throw new IllegalArgumentException();
        }
        this.f23036a = uri;
        this.f23037b = j10;
        this.f23038c = j11;
        this.f23039d = j12;
        this.f23040e = str;
        this.f23041f = i10;
    }

    public final String toString() {
        return "DataSpec[" + this.f23036a + ", " + Arrays.toString((byte[]) null) + ", " + this.f23037b + ", " + this.f23038c + ", " + this.f23039d + ", " + this.f23040e + ", " + this.f23041f + C4240b4.j.f42674e;
    }
}
