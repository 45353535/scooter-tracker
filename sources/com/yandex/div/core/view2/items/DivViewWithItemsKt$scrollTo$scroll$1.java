package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class DivViewWithItemsKt$scrollTo$scroll$1 extends y implements Function2<Integer, Integer, Unit> {
    DivViewWithItemsKt$scrollTo$scroll$1(Object obj) {
        super(2, obj, RecyclerView.class, "smoothScrollBy", "smoothScrollBy(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.f93236a;
    }

    public final void invoke(int i10, int i11) {
        ((RecyclerView) this.receiver).smoothScrollBy(i10, i11);
    }
}
