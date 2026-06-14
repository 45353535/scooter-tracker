package com.yandex.div.core.widget;

import android.os.Build;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.internal.widget.TextViewsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\nR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/widget/FixedLineHeightHelper;", "", "Landroid/widget/TextView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Landroid/widget/TextView;)V", "", "lineHeight", "", "applyLineHeight", "(I)V", "resetLineHeight", "()V", "", "enabled", "setFallbackLineSpacing", "(Z)V", "onFontSizeChanged", "Landroid/widget/TextView;", "textPaddingTop", "I", "textPaddingBottom", "value", "getLineHeight", "()I", "setLineHeight", "getExtraPaddingTop", "extraPaddingTop", "getExtraPaddingBottom", "extraPaddingBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FixedLineHeightHelper {
    private int lineHeight = -1;
    private int textPaddingBottom;
    private int textPaddingTop;

    @NotNull
    private final TextView view;

    public FixedLineHeightHelper(@NotNull TextView textView) {
        this.view = textView;
        textView.setIncludeFontPadding(false);
    }

    private final void applyLineHeight(int lineHeight) {
        if (lineHeight == -1) {
            resetLineHeight();
            return;
        }
        int fontHeightInt = lineHeight - TextViewsKt.getFontHeightInt(this.view);
        if (fontHeightInt < 0) {
            int i10 = fontHeightInt / 2;
            this.textPaddingTop = i10;
            this.textPaddingBottom = fontHeightInt - i10;
        } else {
            int i11 = fontHeightInt / 2;
            this.textPaddingBottom = i11;
            this.textPaddingTop = fontHeightInt - i11;
        }
        this.view.setLineSpacing(lineHeight - TextViewsKt.getFontHeight(this.view), 1.0f);
        setFallbackLineSpacing(false);
    }

    private final void resetLineHeight() {
        this.textPaddingTop = 0;
        this.textPaddingBottom = 0;
        this.view.setLineSpacing(0.0f, 1.0f);
        setFallbackLineSpacing(true);
    }

    private final void setFallbackLineSpacing(boolean enabled) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.view.setFallbackLineSpacing(enabled);
        }
    }

    /* JADX INFO: renamed from: getExtraPaddingBottom, reason: from getter */
    public final int getTextPaddingBottom() {
        return this.textPaddingBottom;
    }

    /* JADX INFO: renamed from: getExtraPaddingTop, reason: from getter */
    public final int getTextPaddingTop() {
        return this.textPaddingTop;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    public final void onFontSizeChanged() {
        applyLineHeight(this.lineHeight);
    }

    public final void setLineHeight(int i10) {
        if (this.lineHeight == i10) {
            return;
        }
        this.lineHeight = i10;
        applyLineHeight(i10);
    }
}
