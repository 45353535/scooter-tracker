package com.yandex.div.core.dagger;

import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.histogram.reporter.HistogramReporter;

/* JADX INFO: loaded from: classes11.dex */
public interface Div2Component {

    public interface Builder {
        @NonNull
        Builder baseContext(@NonNull ContextThemeWrapper contextThemeWrapper);

        @NonNull
        Div2Component build();

        @NonNull
        Builder configuration(@NonNull DivConfiguration divConfiguration);

        @NonNull
        Builder divCreationTracker(@NonNull DivCreationTracker divCreationTracker);

        @NonNull
        Builder divVariableController(@NonNull DivVariableController divVariableController);

        @NonNull
        Builder themeId(@StyleRes int i10);
    }

    @NonNull
    DivActionBinder getActionBinder();

    @NonNull
    DivActionHandler getActionHandler();

    @NonNull
    DivActionTypedHandlerCombiner getActionTypedHandlerCombiner();

    @NonNull
    BitmapEffectHelper getBitmapEffectHelper();

    @NonNull
    Div2Builder getDiv2Builder();

    @NonNull
    Div2Logger getDiv2Logger();

    @NonNull
    DivBinder getDivBinder();

    @NonNull
    DivCreationTracker getDivCreationTracker();

    @NonNull
    DivCustomContainerChildFactory getDivCustomContainerChildFactory();

    @NonNull
    DivDataChangeListener getDivDataChangeListener();

    @NonNull
    DivDownloader getDivDownloader();

    @NonNull
    DivStateChangeListener getDivStateChangeListener();

    @NonNull
    DivTimerEventDispatcherProvider getDivTimersControllerProvider();

    @NonNull
    DivVariableController getDivVariableController();

    @NonNull
    DivVideoActionHandler getDivVideoActionHandler();

    @NonNull
    DivViewDataPreloader getDivViewDataPreloader();

    @NonNull
    HistogramReporter getHistogramReporter();

    @NonNull
    ReleaseManager getReleaseManager();

    @NonNull
    RuntimeStoreProvider getRuntimeStoreProvider();

    @NonNull
    DivStateManager getStateManager();

    @NonNull
    StoredValuesController getStoredValuesController();

    @NonNull
    TemporaryDivStateCache getTemporaryDivStateCache();

    @NonNull
    DivTooltipController getTooltipController();

    @NonNull
    DivVisibilityActionTracker getVisibilityActionTracker();

    @NonNull
    boolean isBindOnAttachEnabled();

    @NonNull
    boolean isComplexRebindEnabled();

    @NonNull
    boolean isPagerPageClipEnabled();

    @NonNull
    Div2ViewComponent.Builder viewComponent();
}
