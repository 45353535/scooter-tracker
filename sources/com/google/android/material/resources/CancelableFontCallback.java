package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f27271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ApplyFont f27272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27273c;

    public interface ApplyFont {
        void apply(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f27271a = typeface;
        this.f27272b = applyFont;
    }

    private void a(Typeface typeface) {
        if (this.f27273c) {
            return;
        }
        this.f27272b.apply(typeface);
    }

    public void cancel() {
        this.f27273c = true;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrievalFailed(int i10) {
        a(this.f27271a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrieved(Typeface typeface, boolean z10) {
        a(typeface);
    }
}
