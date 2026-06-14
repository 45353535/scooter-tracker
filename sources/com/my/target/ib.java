package com.my.target;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes11.dex */
public final class ib {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ib f59875e = new ib(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59879d;

    public ib(int i10, int i11, int i12, int i13) {
        this.f59876a = i10;
        this.f59877b = i11;
        this.f59878c = i12;
        this.f59879d = i13;
    }

    public static ib a(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f59875e : new ib(i10, i11, i12, i13);
    }

    public String toString() {
        return "TrgInsets{left=" + this.f59876a + ", top=" + this.f59877b + ", right=" + this.f59878c + ", bottom=" + this.f59879d + '}';
    }

    public static ib a(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }
}
