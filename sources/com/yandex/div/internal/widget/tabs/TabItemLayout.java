package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/TabItemLayout;", "Landroid/widget/LinearLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabItemLayout extends LinearLayout {
    public TabItemLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(R$id.div_tabbed_tab_title_item);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(0);
    }

    public /* synthetic */ TabItemLayout(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
