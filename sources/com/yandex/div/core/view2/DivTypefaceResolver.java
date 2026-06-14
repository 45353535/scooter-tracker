package com.yandex.div.core.view2;

import com.yandex.div.core.font.DivTypefaceProvider;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/DivTypefaceResolver;", "", "typefaceProviders", "", "", "Lcom/yandex/div/core/font/DivTypefaceProvider;", "defaultTypeface", "(Ljava/util/Map;Lcom/yandex/div/core/font/DivTypefaceProvider;)V", "getTypefaceProvider", "fontFamily", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivTypefaceResolver {

    @NotNull
    private final DivTypefaceProvider defaultTypeface;

    @NotNull
    private final Map<String, DivTypefaceProvider> typefaceProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTypefaceResolver(@NotNull Map<String, ? extends DivTypefaceProvider> map, @NotNull DivTypefaceProvider divTypefaceProvider) {
        this.typefaceProviders = map;
        this.defaultTypeface = divTypefaceProvider;
    }

    @NotNull
    public DivTypefaceProvider getTypefaceProvider(@Nullable String fontFamily) {
        DivTypefaceProvider divTypefaceProvider;
        return (fontFamily == null || (divTypefaceProvider = this.typefaceProviders.get(fontFamily)) == null) ? this.defaultTypeface : divTypefaceProvider;
    }
}
