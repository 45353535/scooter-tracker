package com.yandex.div.internal.widget.tabs;

import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;", "", "typefaceProvider", "Lcom/yandex/div/core/font/DivTypefaceProvider;", "(Lcom/yandex/div/core/font/DivTypefaceProvider;)V", "getTypefaceProvider", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabTextStyleProvider {

    @NotNull
    private final DivTypefaceProvider typefaceProvider;

    public TabTextStyleProvider(@NotNull DivTypefaceProvider divTypefaceProvider) {
        this.typefaceProvider = divTypefaceProvider;
    }

    @NotNull
    public final DivTypefaceProvider getTypefaceProvider() {
        return this.typefaceProvider;
    }
}
