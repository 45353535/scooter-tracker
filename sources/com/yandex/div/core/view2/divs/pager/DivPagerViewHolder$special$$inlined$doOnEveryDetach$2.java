package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import com.yandex.div.core.Disposable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "close", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class DivPagerViewHolder$special$$inlined$doOnEveryDetach$2 implements Disposable, AutoCloseable {
    final /* synthetic */ DivPagerViewHolder$special$$inlined$doOnEveryDetach$1 $listener;
    final /* synthetic */ View $this_doOnEveryDetach;

    public DivPagerViewHolder$special$$inlined$doOnEveryDetach$2(View view, DivPagerViewHolder$special$$inlined$doOnEveryDetach$1 divPagerViewHolder$special$$inlined$doOnEveryDetach$1) {
        this.$this_doOnEveryDetach = view;
        this.$listener = divPagerViewHolder$special$$inlined$doOnEveryDetach$1;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.$this_doOnEveryDetach.removeOnAttachStateChangeListener(this.$listener);
    }
}
