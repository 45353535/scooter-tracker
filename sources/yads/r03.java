package yads;

import android.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public final class r03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f115252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f115253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f115254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f115255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f115256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f115257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f115258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f115259j;

    public r03(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f115250a = str;
        this.f115251b = i10;
        this.f115252c = num;
        this.f115253d = num2;
        this.f115254e = f10;
        this.f115255f = z10;
        this.f115256g = z11;
        this.f115257h = z12;
        this.f115258i = z13;
        this.f115259j = i11;
    }

    public static boolean a(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            uf1.d("SsaStyle", uf1.a("Failed to parse boolean value: '" + str + "'", e10));
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(ec1.a(((j10 >> 24) & 255) ^ 255), ec1.a(j10 & 255), ec1.a((j10 >> 8) & 255), ec1.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            uf1.d("SsaStyle", uf1.a("Failed to parse color expression: '" + str + "'", e10));
            return null;
        }
    }
}
