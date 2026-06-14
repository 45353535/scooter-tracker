package com.yandex.div.core.view2;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class AccessibilityListDelegate$firstChild$1 extends y implements Function1<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$1 INSTANCE = new AccessibilityListDelegate$firstChild$1();

    AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull View view) {
        return Integer.valueOf(view.getTop());
    }
}
