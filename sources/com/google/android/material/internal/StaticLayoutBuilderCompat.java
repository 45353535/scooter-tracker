package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f26845o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f26846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f26847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26848c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26850e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26857l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private StaticLayoutBuilderConfigurer f26859n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26849d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f26851f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26852g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f26853h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f26854i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26855j = f26845o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26856k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f26858m = null;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f26846a = charSequence;
        this.f26847b = textPaint;
        this.f26848c = i10;
        this.f26850e = charSequence.length();
    }

    @NonNull
    public static StaticLayoutBuilderCompat obtain(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i10) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i10);
    }

    @NonNull
    public StaticLayout build() throws StaticLayoutBuilderCompatException {
        if (this.f26846a == null) {
            this.f26846a = "";
        }
        int iMax = Math.max(0, this.f26848c);
        CharSequence charSequenceEllipsize = this.f26846a;
        if (this.f26852g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f26847b, iMax, this.f26858m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f26850e);
        this.f26850e = iMin;
        if (this.f26857l && this.f26852g == 1) {
            this.f26851f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f26849d, iMin, this.f26847b, iMax);
        builderObtain.setAlignment(this.f26851f);
        builderObtain.setIncludePad(this.f26856k);
        builderObtain.setTextDirection(this.f26857l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f26858m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f26852g);
        float f10 = this.f26853h;
        if (f10 != 0.0f || this.f26854i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f26854i);
        }
        if (this.f26852g > 1) {
            builderObtain.setHyphenationFrequency(this.f26855j);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.f26859n;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(builderObtain);
        }
        return builderObtain.build();
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setAlignment(@NonNull Layout.Alignment alignment) {
        this.f26851f = alignment;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f26858m = truncateAt;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEnd(@IntRange(from = 0) int i10) {
        this.f26850e = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setHyphenationFrequency(int i10) {
        this.f26855j = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setIncludePad(boolean z10) {
        this.f26856k = z10;
        return this;
    }

    @NonNull
    public StaticLayoutBuilderCompat setIsRtl(boolean z10) {
        this.f26857l = z10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setLineSpacing(float f10, float f11) {
        this.f26853h = f10;
        this.f26854i = f11;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setMaxLines(@IntRange(from = 0) int i10) {
        this.f26852g = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStart(@IntRange(from = 0) int i10) {
        this.f26849d = i10;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f26859n = staticLayoutBuilderConfigurer;
        return this;
    }
}
