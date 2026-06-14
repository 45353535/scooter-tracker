package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import pd.g0;

/* JADX INFO: loaded from: classes12.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f80246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f80247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f80248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f80249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f80250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f80251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f80252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f80253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f80254i;

    public p(float f10, Rect screenRectPx, Rect screenRectDp, Rect rootViewRectPx, Rect rootViewRectDp, Rect currentAdRectPx, Rect currentAdRectDp, Rect defaultAdRectPx, Rect defaultAdRectDp) {
        Intrinsics.checkNotNullParameter(screenRectPx, "screenRectPx");
        Intrinsics.checkNotNullParameter(screenRectDp, "screenRectDp");
        Intrinsics.checkNotNullParameter(rootViewRectPx, "rootViewRectPx");
        Intrinsics.checkNotNullParameter(rootViewRectDp, "rootViewRectDp");
        Intrinsics.checkNotNullParameter(currentAdRectPx, "currentAdRectPx");
        Intrinsics.checkNotNullParameter(currentAdRectDp, "currentAdRectDp");
        Intrinsics.checkNotNullParameter(defaultAdRectPx, "defaultAdRectPx");
        Intrinsics.checkNotNullParameter(defaultAdRectDp, "defaultAdRectDp");
        this.f80246a = f10;
        this.f80247b = screenRectPx;
        this.f80248c = screenRectDp;
        this.f80249d = rootViewRectPx;
        this.f80250e = rootViewRectDp;
        this.f80251f = currentAdRectPx;
        this.f80252g = currentAdRectDp;
        this.f80253h = defaultAdRectPx;
        this.f80254i = defaultAdRectDp;
    }

    private final boolean a(Rect rect, Rect rect2, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && i10 + i12 == rect.right && i11 + i13 == rect.bottom) {
            return false;
        }
        rect.set(i10, i11, i12 + i10, i13 + i11);
        g0.E(rect2, rect, this.f80246a);
        return true;
    }

    public final Rect b() {
        return this.f80252g;
    }

    public final Rect c() {
        return this.f80254i;
    }

    public final Rect d() {
        return this.f80250e;
    }

    public final Rect e() {
        return this.f80248c;
    }

    public final boolean f(int i10, int i11, int i12, int i13) {
        return a(this.f80251f, this.f80252g, i10, i11, i12, i13);
    }

    public final boolean g(int i10, int i11, int i12, int i13) {
        return a(this.f80253h, this.f80254i, i10, i11, i12, i13);
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        return a(this.f80249d, this.f80250e, i10, i11, i12, i13);
    }

    public final boolean i(int i10, int i11) {
        if (this.f80247b.width() == i10 && this.f80247b.height() == i11) {
            return false;
        }
        this.f80247b.set(0, 0, i10, i11);
        g0.E(this.f80248c, this.f80247b, this.f80246a);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        this(pd.g.e(context), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect());
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
