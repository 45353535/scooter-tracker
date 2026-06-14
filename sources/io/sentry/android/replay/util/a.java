package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Layout f83149a;

    public a(Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f83149a = layout;
    }

    @Override // io.sentry.android.replay.util.r
    public float a(int i10, int i11) {
        return this.f83149a.getPrimaryHorizontal(i11);
    }

    @Override // io.sentry.android.replay.util.r
    public Integer b() {
        int i10;
        if (!(this.f83149a.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.f83149a.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.f83149a.getText().length(), ForegroundColorSpan.class);
        Intrinsics.checkNotNull(foregroundColorSpanArr);
        int i11 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = this.f83149a.getText();
            Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.f83149a.getText();
            Intrinsics.checkNotNull(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i10 = spanEnd - spanStart) > i11) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i11 = i10;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(s.j(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.r
    public int c(int i10) {
        return this.f83149a.getLineVisibleEnd(i10);
    }

    @Override // io.sentry.android.replay.util.r
    public int d(int i10) {
        return this.f83149a.getEllipsisCount(i10);
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineBottom(int i10) {
        return this.f83149a.getLineBottom(i10);
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineCount() {
        return this.f83149a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineStart(int i10) {
        return this.f83149a.getLineStart(i10);
    }

    @Override // io.sentry.android.replay.util.r
    public int getLineTop(int i10) {
        return this.f83149a.getLineTop(i10);
    }
}
