package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextDrawableHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f26862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26863d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextAppearance f26866g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f26860a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextAppearanceFontCallback f26861b = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i10) {
            TextDrawableHelper.this.f26864e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f26865f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            TextDrawableHelper.this.f26864e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f26865f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26864e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f26865f = new WeakReference(null);

    public interface TextDrawableDelegate {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f26860a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f26860a.measureText(charSequence, 0, charSequence.length());
    }

    private void e(String str) {
        this.f26862c = d(str);
        this.f26863d = c(str);
        this.f26864e = false;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f26866g;
    }

    public float getTextHeight(@Nullable String str) {
        if (!this.f26864e) {
            return this.f26863d;
        }
        e(str);
        return this.f26863d;
    }

    @NonNull
    public TextPaint getTextPaint() {
        return this.f26860a;
    }

    public float getTextWidth(String str) {
        if (!this.f26864e) {
            return this.f26862c;
        }
        e(str);
        return this.f26862c;
    }

    public boolean isTextWidthDirty() {
        return this.f26864e;
    }

    public void setDelegate(@Nullable TextDrawableDelegate textDrawableDelegate) {
        this.f26865f = new WeakReference(textDrawableDelegate);
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance, Context context) {
        if (this.f26866g != textAppearance) {
            this.f26866g = textAppearance;
            if (textAppearance != null) {
                textAppearance.updateMeasureState(context, this.f26860a, this.f26861b);
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) this.f26865f.get();
                if (textDrawableDelegate != null) {
                    this.f26860a.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, this.f26860a, this.f26861b);
                this.f26864e = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = (TextDrawableDelegate) this.f26865f.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void setTextSizeDirty(boolean z10) {
        this.f26864e = z10;
    }

    public void setTextWidthDirty(boolean z10) {
        this.f26864e = z10;
    }

    public void updateTextPaintDrawState(Context context) {
        this.f26866g.updateDrawState(context, this.f26860a, this.f26861b);
    }
}
