package com.yandex.div.core.dagger;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.image.DivImageLoaderWrapper;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.util.bitmap.blur.HighApiBitmapEffectHelper;
import com.yandex.div.core.util.bitmap.blur.LowApiBitmapEffectHelper;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Div2Module {
    @NonNull
    public static BitmapEffectHelper provideBitmapEffectHelper(@NonNull Context context, boolean z10) {
        return (!z10 || Build.VERSION.SDK_INT < 31) ? new LowApiBitmapEffectHelper(context) : new HighApiBitmapEffectHelper();
    }

    @NonNull
    public static DivImageLoader provideDivImageLoader(@NonNull DivImageLoader divImageLoader, @NonNull Context context) {
        return new DivImageLoaderWrapper(divImageLoader, context);
    }

    @NonNull
    public static DivPreloader provideDivPreloader(@NonNull DivImagePreloader divImagePreloader, @NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NonNull DivPlayerPreloader divPlayerPreloader, @NonNull DivExtensionController divExtensionController) {
        return new DivPreloader(divImagePreloader, divCustomContainerViewAdapter, divExtensionController, divPlayerPreloader, DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER);
    }

    @NonNull
    public static DivViewDataPreloader provideDivViewDataPreloader(@NonNull DivImagePreloader divImagePreloader, @NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NonNull DivPlayerPreloader divPlayerPreloader, @NonNull DivExtensionController divExtensionController) {
        return new DivViewDataPreloader(divImagePreloader, divCustomContainerViewAdapter, divExtensionController, divPlayerPreloader, DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER);
    }

    @NonNull
    public static TabTextStyleProvider provideTabTextStyleProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        return new TabTextStyleProvider(divTypefaceProvider);
    }

    @NonNull
    public static Context provideThemedContext(@NonNull ContextThemeWrapper contextThemeWrapper, @StyleRes int i10, boolean z10) {
        return z10 ? new ContextThemeWrapperWithResourceCache(contextThemeWrapper, i10) : new ContextThemeWrapper(contextThemeWrapper, i10);
    }

    @NonNull
    public static ViewPool provideViewPool(boolean z10, @NonNull ExternalOptional<ViewPoolProfiler> externalOptional, @NonNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NonNull ViewCreator viewCreator) {
        return z10 ? new AdvanceViewPool((ViewPoolProfiler) externalOptional.getOptional().d(), performanceDependentSessionProfiler, viewCreator) : new PseudoViewPool();
    }

    @NonNull
    public static ExternalOptional<ViewPoolProfiler> provideViewPoolProfiler(boolean z10, @NonNull ViewPoolProfiler.Reporter reporter) {
        return z10 ? ExternalOptional.of(new ViewPoolProfiler(reporter)) : ExternalOptional.empty();
    }
}
