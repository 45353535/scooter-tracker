package io.sentry.android.replay.util;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83150c = TextLayoutResult.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextLayoutResult f83151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f83152b;

    public b(TextLayoutResult layout, boolean z10) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f83151a = layout;
        this.f83152b = z10;
    }

    @Override // io.sentry.android.replay.util.r
    public float a(int i10, int i11) {
        float horizontalPosition = this.f83151a.getHorizontalPosition(i11, true);
        return (this.f83152b || getLineCount() != 1) ? horizontalPosition : horizontalPosition - this.f83151a.getLineLeft(i10);
    }

    @Override // io.sentry.android.replay.util.r
    public Integer b() {
        return null;
    }

    @Override // io.sentry.android.replay.util.r
    public int c(int i10) {
        return this.f83151a.getLineEnd(i10, true);
    }

    @Override // io.sentry.android.replay.util.r
    public int d(int i10) {
        return this.f83151a.isLineEllipsized(i10) ? 1 : 0;
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineBottom(int i10) {
        return zf.a.d(this.f83151a.getLineBottom(i10));
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineCount() {
        return this.f83151a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineStart(int i10) {
        return this.f83151a.getLineStart(i10);
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineTop(int i10) {
        return zf.a.d(this.f83151a.getLineTop(i10));
    }
}
