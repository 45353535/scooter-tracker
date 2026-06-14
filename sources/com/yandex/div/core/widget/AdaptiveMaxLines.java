package com.yandex.div.core.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "", "textView", "Landroid/widget/TextView;", "drawingPassOverrideStrategy", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "(Landroid/widget/TextView;Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;)V", "isAdaptLinesRequested", "", "params", "Lcom/yandex/div/core/widget/AdaptiveMaxLines$Params;", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "viewAttachListener", "Landroid/view/View$OnAttachStateChangeListener;", "addAttachListener", "", "addPreDrawListener", "apply", "removeAttachListener", "removePreDrawListener", "reset", "Params", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdaptiveMaxLines {

    @NotNull
    private final DrawingPassOverrideStrategy drawingPassOverrideStrategy;
    private boolean isAdaptLinesRequested;

    @Nullable
    private Params params;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;

    @NotNull
    private final TextView textView;

    @Nullable
    private View.OnAttachStateChangeListener viewAttachListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/widget/AdaptiveMaxLines$Params;", "", "", "maxLines", "minHiddenLines", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMaxLines", "getMinHiddenLines", "getTotalVisibleLines", "totalVisibleLines", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params {
        private final int maxLines;
        private final int minHiddenLines;

        public Params(int i10, int i11) {
            this.maxLines = i10;
            this.minHiddenLines = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.maxLines == params.maxLines && this.minHiddenLines == params.minHiddenLines;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final int getTotalVisibleLines() {
            return this.maxLines + this.minHiddenLines;
        }

        public int hashCode() {
            return (this.maxLines * 31) + this.minHiddenLines;
        }

        @NotNull
        public String toString() {
            return "Params(maxLines=" + this.maxLines + ", minHiddenLines=" + this.minHiddenLines + ')';
        }
    }

    public AdaptiveMaxLines(@NotNull TextView textView, @NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.textView = textView;
        this.drawingPassOverrideStrategy = drawingPassOverrideStrategy;
    }

    private final void addAttachListener() {
        if (this.viewAttachListener != null) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines.addAttachListener.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View v10) {
                AdaptiveMaxLines.this.addPreDrawListener();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View v10) {
                AdaptiveMaxLines.this.removePreDrawListener();
            }
        };
        this.textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.viewAttachListener = onAttachStateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPreDrawListener() {
        if (this.preDrawListener != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = OnPreDrawListeners.onPreDrawListener(this.drawingPassOverrideStrategy, new Function0<Boolean>() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines.addPreDrawListener.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Params params = AdaptiveMaxLines.this.params;
                if (params == null) {
                    return Boolean.TRUE;
                }
                if (TextUtils.isEmpty(AdaptiveMaxLines.this.textView.getText())) {
                    return Boolean.TRUE;
                }
                boolean z10 = false;
                if (AdaptiveMaxLines.this.isAdaptLinesRequested) {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    AdaptiveMaxLines.this.isAdaptLinesRequested = false;
                    return Boolean.TRUE;
                }
                Integer num = AdaptiveMaxLines.this.textView.getLineCount() > params.getTotalVisibleLines() ? null : Integer.MAX_VALUE;
                int iIntValue = num != null ? num.intValue() : params.getMaxLines();
                if (iIntValue != AdaptiveMaxLines.this.textView.getMaxLines()) {
                    AdaptiveMaxLines.this.textView.setMaxLines(iIntValue);
                    AdaptiveMaxLines.this.isAdaptLinesRequested = true;
                } else {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
        this.textView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        this.preDrawListener = onPreDrawListener;
    }

    private final void removeAttachListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.viewAttachListener;
        if (onAttachStateChangeListener != null) {
            this.textView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.viewAttachListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePreDrawListener() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        this.preDrawListener = null;
    }

    public final void apply(@NotNull Params params) {
        if (Intrinsics.areEqual(this.params, params)) {
            return;
        }
        this.params = params;
        if (ViewCompat.isAttachedToWindow(this.textView)) {
            addPreDrawListener();
        }
        addAttachListener();
    }

    public final void reset() {
        removeAttachListener();
        removePreDrawListener();
    }
}
