package sg.bigo.ads.common.ab;

import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102280b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ColorInt
    public final int f102282d;

    private b(int i10, int i11, @ColorInt int i12) {
        this.f102279a = i10;
        this.f102281c = i11;
        this.f102282d = i12;
    }

    public static b a(int i10, int i11, @ColorInt int i12) {
        return new b(i10, i11, i12);
    }
}
