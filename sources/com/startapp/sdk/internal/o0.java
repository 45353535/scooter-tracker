package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64979c = vi.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64980d = vi.a(66, 3, 5, -9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64981e = vi.a(61, 12, -14, 17, 1, -14);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64982f = vi.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64983g = vi.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f64985b = new AtomicInteger(0);

    public o0(Context context) {
        this.f64984a = context;
    }

    public final String a() {
        Context context = this.f64984a;
        StringBuilder sb2 = new StringBuilder();
        String str = f64979c;
        sb2.append(str);
        sb2.append(f64981e);
        String str2 = f64983g;
        sb2.append(str2);
        int[] iArrA = vi.a(context, sb2.toString(), str + f64980d + str2, str + f64982f + str2);
        StringBuilder sb3 = new StringBuilder(iArrA.length);
        for (int i10 : iArrA) {
            sb3.append(i10);
        }
        return sb3.toString();
    }
}
