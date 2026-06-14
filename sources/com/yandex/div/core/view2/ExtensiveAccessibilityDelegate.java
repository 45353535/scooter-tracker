package com.yandex.div.core.view2;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/ExtensiveAccessibilityDelegate;", "Landroidx/core/view/AccessibilityDelegateCompat;", "className", "", "isHeading", "", "isCheckable", "(Ljava/lang/String;ZZ)V", "isChecked", "Ljava/lang/Boolean;", "onInitializeAccessibilityNodeInfo", "", "host", "Landroid/view/View;", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "setChecked", "checked", "(Ljava/lang/Boolean;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ExtensiveAccessibilityDelegate extends AccessibilityDelegateCompat {

    @NotNull
    private final String className;
    private final boolean isCheckable;

    @Nullable
    private Boolean isChecked;
    private final boolean isHeading;

    public ExtensiveAccessibilityDelegate(@NotNull String str, boolean z10, boolean z11) {
        this.className = str;
        this.isHeading = z10;
        this.isCheckable = z11;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (this.className.length() > 0) {
            info.setClassName(this.className);
        }
        info.setHeading(this.isHeading);
        if (this.isCheckable) {
            info.setCheckable(true);
            Boolean bool = this.isChecked;
            if (bool != null) {
                info.setChecked(bool.booleanValue());
            }
        }
    }

    public final void setChecked(@Nullable Boolean checked) {
        this.isChecked = checked;
    }
}
