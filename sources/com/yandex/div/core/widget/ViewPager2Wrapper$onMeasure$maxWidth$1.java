package com.yandex.div.core.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class ViewPager2Wrapper$onMeasure$maxWidth$1 extends y implements Function2<RecyclerView.LayoutManager, View, Integer> {
    public static final ViewPager2Wrapper$onMeasure$maxWidth$1 INSTANCE = new ViewPager2Wrapper$onMeasure$maxWidth$1();

    ViewPager2Wrapper$onMeasure$maxWidth$1() {
        super(2, RecyclerView.LayoutManager.class, "getDecoratedMeasuredWidth", "getDecoratedMeasuredWidth(Landroid/view/View;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Integer invoke(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View view) {
        return Integer.valueOf(layoutManager.getDecoratedMeasuredWidth(view));
    }
}
