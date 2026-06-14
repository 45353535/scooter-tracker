package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/util/SafePopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "contentView", "", "width", "height", "", "focusable", "<init>", "(Landroid/view/View;IIZ)V", "", "setContentView", "(Landroid/view/View;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SafePopupWindow extends PopupWindow {
    public SafePopupWindow(@NotNull View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@Nullable View contentView) {
        if (contentView != null) {
            contentView.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(contentView);
    }
}
