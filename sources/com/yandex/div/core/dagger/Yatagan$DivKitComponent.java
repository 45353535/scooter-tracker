package com.yandex.div.core.dagger;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedArrayMutationHandler;
import com.yandex.div.core.actions.DivActionTypedClearFocusHandler;
import com.yandex.div.core.actions.DivActionTypedCopyToClipboardHandler;
import com.yandex.div.core.actions.DivActionTypedDictSetValueHandler;
import com.yandex.div.core.actions.DivActionTypedFocusElementHandler;
import com.yandex.div.core.actions.DivActionTypedHandler;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.actions.DivActionTypedHideTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedScrollHandler;
import com.yandex.div.core.actions.DivActionTypedSetStateHandler;
import com.yandex.div.core.actions.DivActionTypedSetStoredValueHandler;
import com.yandex.div.core.actions.DivActionTypedSetVariableHandler;
import com.yandex.div.core.actions.DivActionTypedShowTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedSubmitHandler;
import com.yandex.div.core.actions.DivActionTypedTimerHandler;
import com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler;
import com.yandex.div.core.actions.DivActionTypedVideoHandler;
import com.yandex.div.core.actions.DivAnimatorTypedActionHandler;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.tooltip.DivTooltipViewBuilder;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ReportingSafeDrawingPassOverrideStrategy;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivValidator;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.ViewVisibilityCalculator;
import com.yandex.div.core.view2.animations.DivAnimatorController;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivLayoutParamsBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.state.DivStateCache;
import com.yandex.div.storage.DivStorageComponent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes11.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    final Context mApplicationContext;
    private volatile Object mDivActionTypedHandlerCombinerInstance;
    final DivKitConfiguration mDivKitConfiguration;
    private volatile Object mDivParsingHistogramReporterInstance;
    private volatile Object mDivStorageComponentInstance;
    private volatile Object mHistogramColdTypeCheckerInstance;
    private volatile Object mHistogramRecorderInstance;
    private volatile Object mSendBeaconManagerInstance;
    private volatile Object mViewCreatorInstance;

    private static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        private Context mApplicationContext;
        private DivKitConfiguration mConfiguration;

        private ComponentFactoryImpl() {
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder applicationContext(Context context) {
            this.mApplicationContext = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.mApplicationContext, this.mConfiguration);
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder configuration(DivKitConfiguration divKitConfiguration) {
            this.mConfiguration = divKitConfiguration;
            return this;
        }
    }

    static final class Div2ComponentImpl implements Div2Component {
        private Object mAccessibilityStateProviderInstance;
        final ContextThemeWrapper mBaseContext;
        private Object mBitmapEffectHelperInstance;
        private Object mDiv2BuilderInstance;
        private Object mDivActionBeaconSenderInstance;
        private Object mDivActionBinderInstance;
        private Object mDivBaseBinderInstance;
        private Object mDivBinderInstance;
        final DivConfiguration mDivConfiguration;
        final DivCreationTracker mDivCreationTracker;
        private Object mDivExtensionControllerInstance;
        private Object mDivImageLoaderInstance;
        private Object mDivImagePreloaderInstance;
        final Yatagan$DivKitComponent mDivKitComponent;
        private Object mDivPatchCacheInstance;
        private Object mDivPatchManagerInstance;
        private Object mDivPlaceholderLoaderInstance;
        private Object mDivPreloaderInstance;
        private Object mDivRuntimeVisitorInstance;
        private Object mDivStateManagerInstance;
        private Object mDivTimerEventDispatcherProviderInstance;
        private Object mDivTooltipControllerInstance;
        private Object mDivTypefaceResolverInstance;
        private Object mDivValidatorInstance;
        final DivVariableController mDivVariableController;
        private Object mDivVideoActionHandlerInstance;
        private Object mDivVideoViewMapperInstance;
        private Object mDivViewCreatorInstance;
        private Object mDivViewDataPreloaderInstance;
        private Object mDivViewIdProviderInstance;
        private Object mDivVisibilityActionDispatcherInstance;
        private Object mDivVisibilityActionTrackerInstance;
        private Object mErrorCollectorsInstance;
        private Object mHistogramReporterInstance;
        private Object mJavaxInjectNamedValueThemedContextContextInstance;
        private Object mPagerIndicatorConnectorInstance;
        private Object mPerformanceDependentSessionProfilerInstance;
        private Object mReleaseManagerInstance;
        private Object mRuntimeStoreProviderInstance;
        private Object mStoredValuesControllerInstance;
        private Object mTabsStateCacheInstance;
        private Object mTemporaryDivStateCacheInstance;
        final Integer mThemeId;
        private Object mTwoWayIntegerVariableBinderInstance;
        private Object mTwoWayStringVariableBinderInstance;
        private Object mViewPoolInstance;
        private Object mViewPreCreationProfileRepositoryInstance;

        private static final class ComponentFactoryImpl implements Div2Component.Builder {
            Yatagan$DivKitComponent fDivKitComponent;
            private ContextThemeWrapper mBaseContext;
            private DivConfiguration mConfiguration;
            private DivCreationTracker mDivCreationTracker;
            private DivVariableController mDivVariableController;
            private Integer mThemeId;

            ComponentFactoryImpl(Yatagan$DivKitComponent yatagan$DivKitComponent) {
                this.fDivKitComponent = yatagan$DivKitComponent;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder baseContext(ContextThemeWrapper contextThemeWrapper) {
                this.mBaseContext = contextThemeWrapper;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component build() {
                return new Div2ComponentImpl(this.fDivKitComponent, this.mBaseContext, this.mConfiguration, this.mThemeId, this.mDivCreationTracker, this.mDivVariableController);
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder configuration(DivConfiguration divConfiguration) {
                this.mConfiguration = divConfiguration;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divCreationTracker(DivCreationTracker divCreationTracker) {
                this.mDivCreationTracker = divCreationTracker;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divVariableController(DivVariableController divVariableController) {
                this.mDivVariableController = divVariableController;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder themeId(int i10) {
                this.mThemeId = Integer.valueOf(i10);
                return this;
            }
        }

        static final class Div2ViewComponentImpl implements Div2ViewComponent {
            final Div2ComponentImpl mDiv2Component;
            private Object mDivAnimatorControllerInstance;
            private Object mDivStateSwitcherInstance;
            private Object mDivStateTransitionHolderInstance;
            private Object mDivTransitionBuilderInstance;
            final Div2View mDivView;
            private Object mErrorVisualMonitorInstance;
            private Object mInputFocusTrackerInstance;
            private Object mMediaReleaseViewVisitorInstance;
            private Object mReleaseViewVisitorInstance;
            private Object mReportingSafeDrawingPassOverrideStrategyInstance;
            private Object mViewBindingProviderInstance;

            private static final class CachingProviderImpl implements m8.a {
                private final Div2ViewComponentImpl mDelegate;
                private final int mIndex;
                private Object mValue;

                CachingProviderImpl(Div2ViewComponentImpl div2ViewComponentImpl, int i10) {
                    this.mDelegate = div2ViewComponentImpl;
                    this.mIndex = i10;
                }

                @Override // kf.a
                public Object get() {
                    Object obj = this.mValue;
                    if (obj != null) {
                        return obj;
                    }
                    n8.b.a();
                    Object objSwitch$$access = this.mDelegate.switch$$access(this.mIndex);
                    this.mValue = objSwitch$$access;
                    return objSwitch$$access;
                }
            }

            private static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
                Div2ComponentImpl fDiv2Component;
                private Div2View mDivView;

                ComponentFactoryImpl(Div2ComponentImpl div2ComponentImpl) {
                    this.fDiv2Component = div2ComponentImpl;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.fDiv2Component, this.mDivView);
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent.Builder divView(Div2View div2View) {
                    this.mDivView = div2View;
                    return this;
                }
            }

            Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, Div2View div2View) {
                this.mDiv2Component = div2ComponentImpl;
                this.mDivView = (Div2View) n8.a.a(div2View);
            }

            DivAnimatorController cacheDivAnimatorController() {
                Object divAnimatorController = this.mDivAnimatorControllerInstance;
                if (divAnimatorController == null) {
                    n8.b.a();
                    divAnimatorController = new DivAnimatorController(this.mDivView);
                    this.mDivAnimatorControllerInstance = divAnimatorController;
                }
                return (DivAnimatorController) divAnimatorController;
            }

            DivStateSwitcher cacheDivStateSwitcher() {
                Object objB = this.mDivStateSwitcherInstance;
                if (objB == null) {
                    n8.b.a();
                    objB = n8.a.b(a.a(((Boolean) n8.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isMultipleStateChangeEnabled()))).booleanValue(), new CachingProviderImpl(this, 0), new CachingProviderImpl(this, 1)));
                    this.mDivStateSwitcherInstance = objB;
                }
                return (DivStateSwitcher) objB;
            }

            DivStateTransitionHolder cacheDivStateTransitionHolder() {
                Object divStateTransitionHolder = this.mDivStateTransitionHolderInstance;
                if (divStateTransitionHolder == null) {
                    n8.b.a();
                    divStateTransitionHolder = new DivStateTransitionHolder(this.mDivView);
                    this.mDivStateTransitionHolderInstance = divStateTransitionHolder;
                }
                return (DivStateTransitionHolder) divStateTransitionHolder;
            }

            DivTransitionBuilder cacheDivTransitionBuilder() {
                Object divTransitionBuilder = this.mDivTransitionBuilderInstance;
                if (divTransitionBuilder == null) {
                    n8.b.a();
                    Div2ComponentImpl div2ComponentImpl = this.mDiv2Component;
                    divTransitionBuilder = new DivTransitionBuilder(div2ComponentImpl.mBaseContext, div2ComponentImpl.cacheDivViewIdProvider());
                    this.mDivTransitionBuilderInstance = divTransitionBuilder;
                }
                return (DivTransitionBuilder) divTransitionBuilder;
            }

            ErrorVisualMonitor cacheErrorVisualMonitor() {
                Object obj = this.mErrorVisualMonitorInstance;
                if (obj == null) {
                    n8.b.a();
                    ErrorVisualMonitor errorVisualMonitor = new ErrorVisualMonitor(this.mDiv2Component.cacheErrorCollectors(), this.mDivView, ((Boolean) n8.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue(), ((Boolean) n8.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isPermanentDebugPanelEnabled()))).booleanValue(), cacheViewBindingProvider(), (DivTypefaceProvider) n8.a.b(this.mDiv2Component.mDivConfiguration.getTypefaceProvider()));
                    this.mErrorVisualMonitorInstance = errorVisualMonitor;
                    obj = errorVisualMonitor;
                }
                return (ErrorVisualMonitor) obj;
            }

            InputFocusTracker cacheInputFocusTracker() {
                Object inputFocusTracker = this.mInputFocusTrackerInstance;
                if (inputFocusTracker == null) {
                    n8.b.a();
                    inputFocusTracker = new InputFocusTracker(this.mDivView);
                    this.mInputFocusTrackerInstance = inputFocusTracker;
                }
                return (InputFocusTracker) inputFocusTracker;
            }

            MediaReleaseViewVisitor cacheMediaReleaseViewVisitor() {
                Object mediaReleaseViewVisitor = this.mMediaReleaseViewVisitorInstance;
                if (mediaReleaseViewVisitor == null) {
                    n8.b.a();
                    mediaReleaseViewVisitor = new MediaReleaseViewVisitor();
                    this.mMediaReleaseViewVisitorInstance = mediaReleaseViewVisitor;
                }
                return (MediaReleaseViewVisitor) mediaReleaseViewVisitor;
            }

            ReleaseViewVisitor cacheReleaseViewVisitor() {
                Object releaseViewVisitor = this.mReleaseViewVisitorInstance;
                if (releaseViewVisitor == null) {
                    n8.b.a();
                    releaseViewVisitor = new ReleaseViewVisitor(this.mDivView, (DivCustomContainerViewAdapter) n8.a.b(this.mDiv2Component.mDivConfiguration.getDivCustomContainerViewAdapter()), this.mDiv2Component.cacheDivExtensionController());
                    this.mReleaseViewVisitorInstance = releaseViewVisitor;
                }
                return (ReleaseViewVisitor) releaseViewVisitor;
            }

            ReportingSafeDrawingPassOverrideStrategy cacheReportingSafeDrawingPassOverrideStrategy() {
                Object reportingSafeDrawingPassOverrideStrategy = this.mReportingSafeDrawingPassOverrideStrategyInstance;
                if (reportingSafeDrawingPassOverrideStrategy == null) {
                    n8.b.a();
                    reportingSafeDrawingPassOverrideStrategy = new ReportingSafeDrawingPassOverrideStrategy(this.mDivView, (Div2Logger) n8.a.b(this.mDiv2Component.mDivConfiguration.getDiv2Logger()));
                    this.mReportingSafeDrawingPassOverrideStrategyInstance = reportingSafeDrawingPassOverrideStrategy;
                }
                return (ReportingSafeDrawingPassOverrideStrategy) reportingSafeDrawingPassOverrideStrategy;
            }

            ViewBindingProvider cacheViewBindingProvider() {
                Object viewBindingProvider = this.mViewBindingProviderInstance;
                if (viewBindingProvider == null) {
                    n8.b.a();
                    viewBindingProvider = new ViewBindingProvider();
                    this.mViewBindingProviderInstance = viewBindingProvider;
                }
                return (ViewBindingProvider) viewBindingProvider;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivAnimatorController getAnimatorController() {
                return cacheDivAnimatorController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ViewBindingProvider getBindingProvider() {
                return cacheViewBindingProvider();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTooltipController getDivTooltipController() {
                return this.mDiv2Component.cacheDivTooltipController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DrawingPassOverrideStrategy getDrawingPassOverrideStrategy() {
                return cacheReportingSafeDrawingPassOverrideStrategy();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorCollectors getErrorCollectors() {
                return this.mDiv2Component.cacheErrorCollectors();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorVisualMonitor getErrorMonitor() {
                return cacheErrorVisualMonitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public InputFocusTracker getInputFocusTracker() {
                return cacheInputFocusTracker();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public MediaReleaseViewVisitor getMediaReleaseViewVisitor() {
                return cacheMediaReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ReleaseViewVisitor getReleaseViewVisitor() {
                return cacheReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivRuntimeVisitor getRuntimeVisitor() {
                return this.mDiv2Component.cacheDivRuntimeVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateSwitcher getStateSwitcher() {
                return cacheDivStateSwitcher();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateTransitionHolder getStateTransitionHolder() {
                return cacheDivStateTransitionHolder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTransitionBuilder getTransitionBuilder() {
                return cacheDivTransitionBuilder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivViewIdProvider getViewIdProvider() {
                return this.mDiv2Component.cacheDivViewIdProvider();
            }

            Object switch$$access(int i10) {
                if (i10 == 0) {
                    return new DivJoinedStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                if (i10 == 1) {
                    return new DivMultipleStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                throw new AssertionError();
            }
        }

        static final class ProviderImpl implements m8.a {
            private final Div2ComponentImpl mDelegate;
            private final int mIndex;

            ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i10) {
                this.mDelegate = div2ComponentImpl;
                this.mIndex = i10;
            }

            @Override // kf.a
            public Object get() {
                return this.mDelegate.switch$$access(this.mIndex);
            }
        }

        Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, Integer num, DivCreationTracker divCreationTracker, DivVariableController divVariableController) {
            this.mDivKitComponent = yatagan$DivKitComponent;
            this.mBaseContext = (ContextThemeWrapper) n8.a.a(contextThemeWrapper);
            this.mDivConfiguration = (DivConfiguration) n8.a.a(divConfiguration);
            this.mThemeId = (Integer) n8.a.a(num);
            this.mDivCreationTracker = (DivCreationTracker) n8.a.a(divCreationTracker);
            this.mDivVariableController = (DivVariableController) n8.a.a(divVariableController);
        }

        AccessibilityStateProvider cacheAccessibilityStateProvider() {
            Object accessibilityStateProvider = this.mAccessibilityStateProviderInstance;
            if (accessibilityStateProvider == null) {
                n8.b.a();
                accessibilityStateProvider = new AccessibilityStateProvider(((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue());
                this.mAccessibilityStateProviderInstance = accessibilityStateProvider;
            }
            return (AccessibilityStateProvider) accessibilityStateProvider;
        }

        BitmapEffectHelper cacheBitmapEffectHelper() {
            Object objB = this.mBitmapEffectHelperInstance;
            if (objB == null) {
                n8.b.a();
                objB = n8.a.b(Div2Module.provideBitmapEffectHelper(this.mBaseContext, ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isRenderEffectEnabled()))).booleanValue()));
                this.mBitmapEffectHelperInstance = objB;
            }
            return (BitmapEffectHelper) objB;
        }

        Div2Builder cacheDiv2Builder() {
            Object div2Builder = this.mDiv2BuilderInstance;
            if (div2Builder == null) {
                n8.b.a();
                div2Builder = new Div2Builder(cacheDivViewCreator(), cacheDivBinder(), cacheDivRuntimeVisitor());
                this.mDiv2BuilderInstance = div2Builder;
            }
            return (Div2Builder) div2Builder;
        }

        DivActionBeaconSender cacheDivActionBeaconSender() {
            Object divActionBeaconSender = this.mDivActionBeaconSenderInstance;
            if (divActionBeaconSender == null) {
                n8.b.a();
                divActionBeaconSender = new DivActionBeaconSender(new ProviderImpl(this.mDivKitComponent, 3), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isTapBeaconsEnabled()))).booleanValue(), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isVisibilityBeaconsEnabled()))).booleanValue(), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isSwipeOutBeaconsEnabled()))).booleanValue());
                this.mDivActionBeaconSenderInstance = divActionBeaconSender;
            }
            return (DivActionBeaconSender) divActionBeaconSender;
        }

        DivActionBinder cacheDivActionBinder() {
            Object obj = this.mDivActionBinderInstance;
            if (obj == null) {
                n8.b.a();
                DivActionBinder divActionBinder = new DivActionBinder((DivActionHandler) n8.a.b(this.mDivConfiguration.getActionHandler()), (Div2Logger) n8.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivActionBeaconSender(), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isLongtapActionsPassToChild()))).booleanValue(), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isContextMenuHandlerOverridden()))).booleanValue());
                this.mDivActionBinderInstance = divActionBinder;
                obj = divActionBinder;
            }
            return (DivActionBinder) obj;
        }

        DivBaseBinder cacheDivBaseBinder() {
            Object obj = this.mDivBaseBinderInstance;
            if (obj == null) {
                n8.b.a();
                DivBaseBinder divBaseBinder = new DivBaseBinder(new DivBackgroundBinder(cacheDivImageLoader()), cacheDivTooltipController(), new DivFocusBinder(cacheDivActionBinder()), new DivAccessibilityBinder(((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue(), cacheAccessibilityStateProvider()), new DivLayoutParamsBinder(cacheErrorCollectors()));
                this.mDivBaseBinderInstance = divBaseBinder;
                obj = divBaseBinder;
            }
            return (DivBaseBinder) obj;
        }

        DivBinder cacheDivBinder() {
            Object obj = this.mDivBinderInstance;
            if (obj == null) {
                n8.b.a();
                DivBinder divBinder = new DivBinder(cacheDivValidator(), new DivTextBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), new SpannedTextBuilder(cacheDivTypefaceResolver(), cacheDivImageLoader()), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isHyphenationSupported()))).booleanValue()), new DivContainerBinder(cacheDivBaseBinder(), new ProviderImpl(this, 2), cacheDivPatchManager(), new ProviderImpl(this, 0), cacheErrorCollectors()), new DivSeparatorBinder(cacheDivBaseBinder()), new DivImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGifImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGridBinder(cacheDivBaseBinder(), cacheDivPatchManager(), new ProviderImpl(this, 0), new ProviderImpl(this, 2)), new DivGalleryBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), ((Float) n8.a.b(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue()), new DivPagerBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), cacheDivActionBinder(), cachePagerIndicatorConnector(), cacheAccessibilityStateProvider()), new DivTabsBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheViewPool(), (TabTextStyleProvider) n8.a.b(Div2Module.provideTabTextStyleProvider((DivTypefaceProvider) n8.a.b(this.mDivConfiguration.getTypefaceProvider()))), cacheDivActionBinder(), (Div2Logger) n8.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivImageLoader(), cacheDivVisibilityActionTracker(), cacheDivPatchCache(), cacheJavaxInjectNamedValueThemedContextContext(), cacheDivRuntimeVisitor(), cacheTabsStateCache()), new DivStateBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), (DivStateCache) n8.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheDivActionBinder(), cacheDivActionBeaconSender(), cacheDivPatchManager(), cacheDivPatchCache(), (Div2Logger) n8.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivVisibilityActionTracker(), cacheErrorCollectors(), cacheTwoWayStringVariableBinder(), cacheDivRuntimeVisitor()), new DivCustomBinder(cacheDivBaseBinder(), (DivCustomContainerViewAdapter) n8.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), cacheDivExtensionController(), new ProviderImpl(this, 0)), new DivIndicatorBinder(cacheDivBaseBinder(), cachePagerIndicatorConnector()), new DivSliderBinder(cacheDivBaseBinder(), (Div2Logger) n8.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivTypefaceResolver(), cacheTwoWayIntegerVariableBinder(), cacheErrorCollectors(), ((Float) n8.a.b(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue(), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue()), new DivInputBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheDivActionBinder(), cacheAccessibilityStateProvider(), cacheErrorCollectors()), new DivSelectBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheErrorCollectors()), new DivVideoBinder(cacheDivBaseBinder(), cacheTwoWayIntegerVariableBinder(), cacheDivActionBinder(), cacheDivVideoViewMapper(), (ExecutorService) n8.a.b(this.mDivKitComponent.mDivKitConfiguration.getExecutorService()), (DivPlayerFactory) n8.a.b(this.mDivConfiguration.getDivPlayerFactory())), cacheDivExtensionController(), cachePagerIndicatorConnector(), new DivSwitchBinder(cacheDivBaseBinder(), new TwoWayBooleanVariableBinder(cacheErrorCollectors())));
                this.mDivBinderInstance = divBinder;
                obj = divBinder;
            }
            return (DivBinder) obj;
        }

        DivExtensionController cacheDivExtensionController() {
            Object divExtensionController = this.mDivExtensionControllerInstance;
            if (divExtensionController == null) {
                n8.b.a();
                divExtensionController = new DivExtensionController((List) n8.a.b(this.mDivConfiguration.getExtensionHandlers()));
                this.mDivExtensionControllerInstance = divExtensionController;
            }
            return (DivExtensionController) divExtensionController;
        }

        DivImageLoader cacheDivImageLoader() {
            Object objB = this.mDivImageLoaderInstance;
            if (objB == null) {
                n8.b.a();
                objB = n8.a.b(Div2Module.provideDivImageLoader((DivImageLoader) n8.a.b(this.mDivConfiguration.getImageLoader()), this.mBaseContext));
                this.mDivImageLoaderInstance = objB;
            }
            return (DivImageLoader) objB;
        }

        DivImagePreloader cacheDivImagePreloader() {
            Object divImagePreloader = this.mDivImagePreloaderInstance;
            if (divImagePreloader == null) {
                n8.b.a();
                divImagePreloader = new DivImagePreloader(cacheDivImageLoader());
                this.mDivImagePreloaderInstance = divImagePreloader;
            }
            return (DivImagePreloader) divImagePreloader;
        }

        DivPatchCache cacheDivPatchCache() {
            Object divPatchCache = this.mDivPatchCacheInstance;
            if (divPatchCache == null) {
                n8.b.a();
                divPatchCache = new DivPatchCache();
                this.mDivPatchCacheInstance = divPatchCache;
            }
            return (DivPatchCache) divPatchCache;
        }

        DivPatchManager cacheDivPatchManager() {
            Object divPatchManager = this.mDivPatchManagerInstance;
            if (divPatchManager == null) {
                n8.b.a();
                divPatchManager = new DivPatchManager(cacheDivPatchCache(), new ProviderImpl(this, 1));
                this.mDivPatchManagerInstance = divPatchManager;
            }
            return (DivPatchManager) divPatchManager;
        }

        DivPlaceholderLoader cacheDivPlaceholderLoader() {
            Object divPlaceholderLoader = this.mDivPlaceholderLoaderInstance;
            if (divPlaceholderLoader == null) {
                n8.b.a();
                divPlaceholderLoader = new DivPlaceholderLoader((Div2ImageStubProvider) n8.a.b(this.mDivConfiguration.getDiv2ImageStubProvider()), (ExecutorService) n8.a.b(this.mDivKitComponent.mDivKitConfiguration.getExecutorService()));
                this.mDivPlaceholderLoaderInstance = divPlaceholderLoader;
            }
            return (DivPlaceholderLoader) divPlaceholderLoader;
        }

        DivPreloader cacheDivPreloader() {
            Object objB = this.mDivPreloaderInstance;
            if (objB == null) {
                n8.b.a();
                objB = n8.a.b(Div2Module.provideDivPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) n8.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) n8.a.b(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivPreloaderInstance = objB;
            }
            return (DivPreloader) objB;
        }

        DivRuntimeVisitor cacheDivRuntimeVisitor() {
            Object divRuntimeVisitor = this.mDivRuntimeVisitorInstance;
            if (divRuntimeVisitor == null) {
                n8.b.a();
                divRuntimeVisitor = new DivRuntimeVisitor((DivStateCache) n8.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheTabsStateCache());
                this.mDivRuntimeVisitorInstance = divRuntimeVisitor;
            }
            return (DivRuntimeVisitor) divRuntimeVisitor;
        }

        DivStateManager cacheDivStateManager() {
            Object divStateManager = this.mDivStateManagerInstance;
            if (divStateManager == null) {
                n8.b.a();
                divStateManager = new DivStateManager((DivStateCache) n8.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache());
                this.mDivStateManagerInstance = divStateManager;
            }
            return (DivStateManager) divStateManager;
        }

        DivTimerEventDispatcherProvider cacheDivTimerEventDispatcherProvider() {
            Object divTimerEventDispatcherProvider = this.mDivTimerEventDispatcherProviderInstance;
            if (divTimerEventDispatcherProvider == null) {
                n8.b.a();
                divTimerEventDispatcherProvider = new DivTimerEventDispatcherProvider(cacheDivActionBinder(), cacheErrorCollectors());
                this.mDivTimerEventDispatcherProviderInstance = divTimerEventDispatcherProvider;
            }
            return (DivTimerEventDispatcherProvider) divTimerEventDispatcherProvider;
        }

        DivTooltipController cacheDivTooltipController() {
            Object obj = this.mDivTooltipControllerInstance;
            if (obj == null) {
                n8.b.a();
                DivTooltipController divTooltipController = new DivTooltipController((DivTooltipRestrictor) n8.a.b(this.mDivConfiguration.getTooltipRestrictor()), cacheDivVisibilityActionTracker(), cacheDivPreloader(), new DivTooltipViewBuilder(new ProviderImpl(this, 1)), cacheAccessibilityStateProvider(), cacheErrorCollectors());
                this.mDivTooltipControllerInstance = divTooltipController;
                obj = divTooltipController;
            }
            return (DivTooltipController) obj;
        }

        DivTypefaceResolver cacheDivTypefaceResolver() {
            Object divTypefaceResolver = this.mDivTypefaceResolverInstance;
            if (divTypefaceResolver == null) {
                n8.b.a();
                divTypefaceResolver = new DivTypefaceResolver((Map) n8.a.b(this.mDivConfiguration.getAdditionalTypefaceProviders()), (DivTypefaceProvider) n8.a.b(this.mDivConfiguration.getTypefaceProvider()));
                this.mDivTypefaceResolverInstance = divTypefaceResolver;
            }
            return (DivTypefaceResolver) divTypefaceResolver;
        }

        DivValidator cacheDivValidator() {
            Object divValidator = this.mDivValidatorInstance;
            if (divValidator == null) {
                n8.b.a();
                divValidator = new DivValidator();
                this.mDivValidatorInstance = divValidator;
            }
            return (DivValidator) divValidator;
        }

        DivVideoActionHandler cacheDivVideoActionHandler() {
            Object divVideoActionHandler = this.mDivVideoActionHandlerInstance;
            if (divVideoActionHandler == null) {
                n8.b.a();
                divVideoActionHandler = new DivVideoActionHandler(cacheDivVideoViewMapper());
                this.mDivVideoActionHandlerInstance = divVideoActionHandler;
            }
            return (DivVideoActionHandler) divVideoActionHandler;
        }

        DivVideoViewMapper cacheDivVideoViewMapper() {
            Object divVideoViewMapper = this.mDivVideoViewMapperInstance;
            if (divVideoViewMapper == null) {
                n8.b.a();
                divVideoViewMapper = new DivVideoViewMapper();
                this.mDivVideoViewMapperInstance = divVideoViewMapper;
            }
            return (DivVideoViewMapper) divVideoViewMapper;
        }

        DivViewCreator cacheDivViewCreator() {
            Object obj = this.mDivViewCreatorInstance;
            if (obj == null) {
                n8.b.a();
                DivViewCreator divViewCreator = new DivViewCreator(cacheJavaxInjectNamedValueThemedContextContext(), cacheViewPool(), cacheDivValidator(), (ViewPreCreationProfile) n8.a.b(this.mDivConfiguration.getViewPreCreationProfile()), cacheViewPreCreationProfileRepository());
                this.mDivViewCreatorInstance = divViewCreator;
                obj = divViewCreator;
            }
            return (DivViewCreator) obj;
        }

        DivViewDataPreloader cacheDivViewDataPreloader() {
            Object objB = this.mDivViewDataPreloaderInstance;
            if (objB == null) {
                n8.b.a();
                objB = n8.a.b(Div2Module.provideDivViewDataPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) n8.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) n8.a.b(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivViewDataPreloaderInstance = objB;
            }
            return (DivViewDataPreloader) objB;
        }

        DivViewIdProvider cacheDivViewIdProvider() {
            Object divViewIdProvider = this.mDivViewIdProviderInstance;
            if (divViewIdProvider == null) {
                n8.b.a();
                divViewIdProvider = new DivViewIdProvider();
                this.mDivViewIdProviderInstance = divViewIdProvider;
            }
            return (DivViewIdProvider) divViewIdProvider;
        }

        DivVisibilityActionDispatcher cacheDivVisibilityActionDispatcher() {
            Object divVisibilityActionDispatcher = this.mDivVisibilityActionDispatcherInstance;
            if (divVisibilityActionDispatcher == null) {
                n8.b.a();
                divVisibilityActionDispatcher = new DivVisibilityActionDispatcher((Div2Logger) n8.a.b(this.mDivConfiguration.getDiv2Logger()), (List) n8.a.b(this.mDivConfiguration.getDivVisibilityChangeListeners()), (DivActionHandler) n8.a.b(this.mDivConfiguration.getActionHandler()), cacheDivActionBeaconSender());
                this.mDivVisibilityActionDispatcherInstance = divVisibilityActionDispatcher;
            }
            return (DivVisibilityActionDispatcher) divVisibilityActionDispatcher;
        }

        DivVisibilityActionTracker cacheDivVisibilityActionTracker() {
            Object divVisibilityActionTracker = this.mDivVisibilityActionTrackerInstance;
            if (divVisibilityActionTracker == null) {
                n8.b.a();
                divVisibilityActionTracker = new DivVisibilityActionTracker(new ViewVisibilityCalculator(), cacheDivVisibilityActionDispatcher());
                this.mDivVisibilityActionTrackerInstance = divVisibilityActionTracker;
            }
            return (DivVisibilityActionTracker) divVisibilityActionTracker;
        }

        ErrorCollectors cacheErrorCollectors() {
            Object errorCollectors = this.mErrorCollectorsInstance;
            if (errorCollectors == null) {
                n8.b.a();
                errorCollectors = new ErrorCollectors();
                this.mErrorCollectorsInstance = errorCollectors;
            }
            return (ErrorCollectors) errorCollectors;
        }

        HistogramReporter cacheHistogramReporter() {
            Object objB = this.mHistogramReporterInstance;
            if (objB == null) {
                n8.b.a();
                objB = n8.a.b(DivHistogramsModule.INSTANCE.provideHistogramReporter(this.mDivKitComponent.accessHistogramReporterDelegate()));
                this.mHistogramReporterInstance = objB;
            }
            return (HistogramReporter) objB;
        }

        Context cacheJavaxInjectNamedValueThemedContextContext() {
            Object objB = this.mJavaxInjectNamedValueThemedContextContextInstance;
            if (objB == null) {
                n8.b.a();
                objB = n8.a.b(Div2Module.provideThemedContext(this.mBaseContext, this.mThemeId.intValue(), ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isResourceCacheEnabled()))).booleanValue()));
                this.mJavaxInjectNamedValueThemedContextContextInstance = objB;
            }
            return (Context) objB;
        }

        PagerIndicatorConnector cachePagerIndicatorConnector() {
            Object pagerIndicatorConnector = this.mPagerIndicatorConnectorInstance;
            if (pagerIndicatorConnector == null) {
                n8.b.a();
                pagerIndicatorConnector = new PagerIndicatorConnector();
                this.mPagerIndicatorConnectorInstance = pagerIndicatorConnector;
            }
            return (PagerIndicatorConnector) pagerIndicatorConnector;
        }

        PerformanceDependentSessionProfiler cachePerformanceDependentSessionProfiler() {
            Object performanceDependentSessionProfiler = this.mPerformanceDependentSessionProfilerInstance;
            if (performanceDependentSessionProfiler == null) {
                n8.b.a();
                performanceDependentSessionProfiler = new PerformanceDependentSessionProfiler(((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isDebuggingViewPoolOptimization()))).booleanValue());
                this.mPerformanceDependentSessionProfilerInstance = performanceDependentSessionProfiler;
            }
            return (PerformanceDependentSessionProfiler) performanceDependentSessionProfiler;
        }

        ReleaseManager cacheReleaseManager() {
            Object releaseManager = this.mReleaseManagerInstance;
            if (releaseManager == null) {
                n8.b.a();
                releaseManager = new ReleaseManager(cacheRuntimeStoreProvider());
                this.mReleaseManagerInstance = releaseManager;
            }
            return (ReleaseManager) releaseManager;
        }

        RuntimeStoreProvider cacheRuntimeStoreProvider() {
            Object runtimeStoreProvider = this.mRuntimeStoreProviderInstance;
            if (runtimeStoreProvider == null) {
                n8.b.a();
                runtimeStoreProvider = new RuntimeStoreProvider(new ExpressionsRuntimeProvider(this.mDivVariableController, cacheDivActionBinder(), (Div2Logger) n8.a.b(this.mDivConfiguration.getDiv2Logger()), cacheStoredValuesController()), cacheErrorCollectors());
                this.mRuntimeStoreProviderInstance = runtimeStoreProvider;
            }
            return (RuntimeStoreProvider) runtimeStoreProvider;
        }

        StoredValuesController cacheStoredValuesController() {
            Object storedValuesController = this.mStoredValuesControllerInstance;
            if (storedValuesController == null) {
                n8.b.a();
                storedValuesController = new StoredValuesController(new ProviderImpl(this.mDivKitComponent, 1));
                this.mStoredValuesControllerInstance = storedValuesController;
            }
            return (StoredValuesController) storedValuesController;
        }

        TabsStateCache cacheTabsStateCache() {
            Object tabsStateCache = this.mTabsStateCacheInstance;
            if (tabsStateCache == null) {
                n8.b.a();
                tabsStateCache = new TabsStateCache();
                this.mTabsStateCacheInstance = tabsStateCache;
            }
            return (TabsStateCache) tabsStateCache;
        }

        TemporaryDivStateCache cacheTemporaryDivStateCache() {
            Object temporaryDivStateCache = this.mTemporaryDivStateCacheInstance;
            if (temporaryDivStateCache == null) {
                n8.b.a();
                temporaryDivStateCache = new TemporaryDivStateCache();
                this.mTemporaryDivStateCacheInstance = temporaryDivStateCache;
            }
            return (TemporaryDivStateCache) temporaryDivStateCache;
        }

        TwoWayIntegerVariableBinder cacheTwoWayIntegerVariableBinder() {
            Object twoWayIntegerVariableBinder = this.mTwoWayIntegerVariableBinderInstance;
            if (twoWayIntegerVariableBinder == null) {
                n8.b.a();
                twoWayIntegerVariableBinder = new TwoWayIntegerVariableBinder(cacheErrorCollectors());
                this.mTwoWayIntegerVariableBinderInstance = twoWayIntegerVariableBinder;
            }
            return (TwoWayIntegerVariableBinder) twoWayIntegerVariableBinder;
        }

        TwoWayStringVariableBinder cacheTwoWayStringVariableBinder() {
            Object twoWayStringVariableBinder = this.mTwoWayStringVariableBinderInstance;
            if (twoWayStringVariableBinder == null) {
                n8.b.a();
                twoWayStringVariableBinder = new TwoWayStringVariableBinder(cacheErrorCollectors());
                this.mTwoWayStringVariableBinderInstance = twoWayStringVariableBinder;
            }
            return (TwoWayStringVariableBinder) twoWayStringVariableBinder;
        }

        ViewPool cacheViewPool() {
            Object objB = this.mViewPoolInstance;
            if (objB == null) {
                n8.b.a();
                objB = n8.a.b(Div2Module.provideViewPool(((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isViewPoolEnabled()))).booleanValue(), (ExternalOptional) n8.a.b(Div2Module.provideViewPoolProfiler(((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isViewPoolProfilingEnabled()))).booleanValue(), (ViewPoolProfiler.Reporter) n8.a.b(this.mDivConfiguration.getViewPoolReporter()))), cachePerformanceDependentSessionProfiler(), this.mDivKitComponent.cacheViewCreator()));
                this.mViewPoolInstance = objB;
            }
            return (ViewPool) objB;
        }

        ViewPreCreationProfileRepository cacheViewPreCreationProfileRepository() {
            Object viewPreCreationProfileRepository = this.mViewPreCreationProfileRepositoryInstance;
            if (viewPreCreationProfileRepository == null) {
                n8.b.a();
                viewPreCreationProfileRepository = new ViewPreCreationProfileRepository(this.mDivKitComponent.mApplicationContext, (ViewPreCreationProfile) n8.a.b(this.mDivConfiguration.getViewPreCreationProfile()));
                this.mViewPreCreationProfileRepositoryInstance = viewPreCreationProfileRepository;
            }
            return (ViewPreCreationProfileRepository) viewPreCreationProfileRepository;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionBinder getActionBinder() {
            return cacheDivActionBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionHandler getActionHandler() {
            return (DivActionHandler) n8.a.b(this.mDivConfiguration.getActionHandler());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionTypedHandlerCombiner getActionTypedHandlerCombiner() {
            return this.mDivKitComponent.cacheDivActionTypedHandlerCombiner();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public BitmapEffectHelper getBitmapEffectHelper() {
            return cacheBitmapEffectHelper();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Builder getDiv2Builder() {
            return cacheDiv2Builder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Logger getDiv2Logger() {
            return (Div2Logger) n8.a.b(this.mDivConfiguration.getDiv2Logger());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivBinder getDivBinder() {
            return cacheDivBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCreationTracker getDivCreationTracker() {
            return this.mDivCreationTracker;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCustomContainerChildFactory getDivCustomContainerChildFactory() {
            return new DivCustomContainerChildFactory();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDataChangeListener getDivDataChangeListener() {
            return (DivDataChangeListener) n8.a.b(this.mDivConfiguration.getDivDataChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDownloader getDivDownloader() {
            return (DivDownloader) n8.a.b(this.mDivConfiguration.getDivDownloader());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateChangeListener getDivStateChangeListener() {
            return (DivStateChangeListener) n8.a.b(this.mDivConfiguration.getDivStateChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTimerEventDispatcherProvider getDivTimersControllerProvider() {
            return cacheDivTimerEventDispatcherProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVariableController getDivVariableController() {
            return this.mDivVariableController;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVideoActionHandler getDivVideoActionHandler() {
            return cacheDivVideoActionHandler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivViewDataPreloader getDivViewDataPreloader() {
            return cacheDivViewDataPreloader();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public HistogramReporter getHistogramReporter() {
            return cacheHistogramReporter();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ReleaseManager getReleaseManager() {
            return cacheReleaseManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public RuntimeStoreProvider getRuntimeStoreProvider() {
            return cacheRuntimeStoreProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateManager getStateManager() {
            return cacheDivStateManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public StoredValuesController getStoredValuesController() {
            return cacheStoredValuesController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public TemporaryDivStateCache getTemporaryDivStateCache() {
            return cacheTemporaryDivStateCache();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTooltipController getTooltipController() {
            return cacheDivTooltipController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVisibilityActionTracker getVisibilityActionTracker() {
            return cacheDivVisibilityActionTracker();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isBindOnAttachEnabled() {
            return ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isBindOnAttachEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isComplexRebindEnabled() {
            return ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isComplexRebindEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isPagerPageClipEnabled() {
            return ((Boolean) n8.a.b(Boolean.valueOf(this.mDivConfiguration.isPagerPageClipEnabled()))).booleanValue();
        }

        Object switch$$access(int i10) {
            if (i10 == 0) {
                return cacheDivBinder();
            }
            if (i10 == 1) {
                return cacheDiv2Builder();
            }
            if (i10 == 2) {
                return cacheDivViewCreator();
            }
            throw new AssertionError();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2ViewComponent.Builder viewComponent() {
            return new Div2ViewComponentImpl.ComponentFactoryImpl(this);
        }
    }

    static final class ProviderImpl implements m8.a {
        private final Yatagan$DivKitComponent mDelegate;
        private final int mIndex;

        ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i10) {
            this.mDelegate = yatagan$DivKitComponent;
            this.mIndex = i10;
        }

        @Override // kf.a
        public Object get() {
            return this.mDelegate.switch$$access(this.mIndex);
        }
    }

    private static final class UninitializedLock {
        private UninitializedLock() {
        }
    }

    Yatagan$DivKitComponent(Context context, DivKitConfiguration divKitConfiguration) {
        this.mDivActionTypedHandlerCombinerInstance = new UninitializedLock();
        this.mDivStorageComponentInstance = new UninitializedLock();
        this.mViewCreatorInstance = new UninitializedLock();
        this.mSendBeaconManagerInstance = new UninitializedLock();
        this.mHistogramRecorderInstance = new UninitializedLock();
        this.mDivParsingHistogramReporterInstance = new UninitializedLock();
        this.mHistogramColdTypeCheckerInstance = new UninitializedLock();
        this.mApplicationContext = (Context) n8.a.a(context);
        this.mDivKitConfiguration = (DivKitConfiguration) n8.a.a(divKitConfiguration);
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    HistogramReporterDelegate accessHistogramReporterDelegate() {
        return (HistogramReporterDelegate) n8.a.b(DivKitHistogramsModule.INSTANCE.provideHistogramReporterDelegate((HistogramConfiguration) n8.a.b(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 4), new ProviderImpl(this, 5)));
    }

    DivActionTypedHandlerCombiner cacheDivActionTypedHandlerCombiner() {
        Object divActionTypedHandlerCombiner;
        Object obj = this.mDivActionTypedHandlerCombinerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    divActionTypedHandlerCombiner = this.mDivActionTypedHandlerCombinerInstance;
                    if (divActionTypedHandlerCombiner instanceof UninitializedLock) {
                        divActionTypedHandlerCombiner = new DivActionTypedHandlerCombiner(manyOfSetDivActionTypedHandler());
                        this.mDivActionTypedHandlerCombinerInstance = divActionTypedHandlerCombiner;
                    }
                } finally {
                }
            }
            obj = divActionTypedHandlerCombiner;
        }
        return (DivActionTypedHandlerCombiner) obj;
    }

    DivParsingHistogramReporter cacheDivParsingHistogramReporter() {
        Object objB;
        Object obj = this.mDivParsingHistogramReporterInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objB = this.mDivParsingHistogramReporterInstance;
                    if (objB instanceof UninitializedLock) {
                        objB = n8.a.b(DivKitHistogramsModule.INSTANCE.provideDivParsingHistogramReporter((HistogramConfiguration) n8.a.b(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 0), new ProviderImpl(this, 2)));
                        this.mDivParsingHistogramReporterInstance = objB;
                    }
                } finally {
                }
            }
            obj = objB;
        }
        return (DivParsingHistogramReporter) obj;
    }

    DivStorageComponent cacheDivStorageComponent() {
        Object objB;
        Object obj = this.mDivStorageComponentInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objB = this.mDivStorageComponentInstance;
                    if (objB instanceof UninitializedLock) {
                        objB = n8.a.b(DivStorageModule.INSTANCE.provideDivStorageComponent((ExternalOptional) n8.a.b(this.mDivKitConfiguration.externalDivStorageComponent()), this.mApplicationContext, accessHistogramReporterDelegate(), cacheDivParsingHistogramReporter()));
                        this.mDivStorageComponentInstance = objB;
                    }
                } finally {
                }
            }
            obj = objB;
        }
        return (DivStorageComponent) obj;
    }

    HistogramColdTypeChecker cacheHistogramColdTypeChecker() {
        Object histogramColdTypeChecker;
        Object obj = this.mHistogramColdTypeCheckerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    histogramColdTypeChecker = this.mHistogramColdTypeCheckerInstance;
                    if (histogramColdTypeChecker instanceof UninitializedLock) {
                        histogramColdTypeChecker = new HistogramColdTypeChecker();
                        this.mHistogramColdTypeCheckerInstance = histogramColdTypeChecker;
                    }
                } finally {
                }
            }
            obj = histogramColdTypeChecker;
        }
        return (HistogramColdTypeChecker) obj;
    }

    HistogramRecorder cacheHistogramRecorder() {
        Object objB;
        Object obj = this.mHistogramRecorderInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objB = this.mHistogramRecorderInstance;
                    if (objB instanceof UninitializedLock) {
                        objB = n8.a.b(this.mDivKitConfiguration.histogramRecorder());
                        this.mHistogramRecorderInstance = objB;
                    }
                } finally {
                }
            }
            obj = objB;
        }
        return (HistogramRecorder) obj;
    }

    x6.b cacheSendBeaconManager() {
        Object objB;
        Object obj = this.mSendBeaconManagerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objB = this.mSendBeaconManagerInstance;
                    if (objB instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        Context context = this.mApplicationContext;
                        this.mDivKitConfiguration.sendBeaconConfiguration();
                        androidx.privacysandbox.ads.adservices.topics.a.a(n8.a.b(null));
                        objB = n8.a.b(DivKitModule.provideSendBeaconManager(context, null));
                        this.mSendBeaconManagerInstance = objB;
                    }
                } finally {
                }
            }
            obj = objB;
        }
        return (x6.b) obj;
    }

    ViewCreator cacheViewCreator() {
        Object objB;
        Object obj = this.mViewCreatorInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objB = this.mViewCreatorInstance;
                    if (objB instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        objB = n8.a.b(DivKitModule.provideViewCreator((CpuUsageHistogramReporter) n8.a.b(this.mDivKitConfiguration.cpuUsageHistogramReporter())));
                        this.mViewCreatorInstance = objB;
                    }
                } finally {
                }
            }
            obj = objB;
        }
        return (ViewCreator) obj;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public Div2Component.Builder div2Component() {
        return new Div2ComponentImpl.ComponentFactoryImpl(this);
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public HistogramRecordConfiguration getHistogramRecordConfiguration() {
        return (HistogramRecordConfiguration) n8.a.b(this.mDivKitConfiguration.histogramRecordConfiguration());
    }

    Set<DivActionTypedHandler> manyOfSetDivActionTypedHandler() {
        HashSet hashSet = new HashSet(16);
        hashSet.add(new DivAnimatorTypedActionHandler());
        hashSet.add(new DivActionTypedArrayMutationHandler());
        hashSet.add(new DivActionTypedClearFocusHandler());
        hashSet.add(new DivActionTypedCopyToClipboardHandler());
        hashSet.add(new DivActionTypedDictSetValueHandler());
        hashSet.add(new DivActionTypedFocusElementHandler());
        hashSet.add(new DivActionTypedHideTooltipHandler());
        hashSet.add(new DivActionTypedScrollHandler());
        hashSet.add(new DivActionTypedSetStateHandler());
        hashSet.add(new DivActionTypedSetVariableHandler());
        hashSet.add(new DivActionTypedSetStoredValueHandler());
        hashSet.add(new DivActionTypedShowTooltipHandler());
        hashSet.add(new DivActionTypedSubmitHandler((DivRequestExecutor) n8.a.b(this.mDivKitConfiguration.divRequestExecutor())));
        hashSet.add(new DivActionTypedTimerHandler());
        hashSet.add(new DivActionTypedVideoHandler());
        hashSet.add(new DivActionTypedUpdateStructureHandler());
        return hashSet;
    }

    Object switch$$access(int i10) {
        if (i10 == 0) {
            return accessHistogramReporterDelegate();
        }
        if (i10 == 1) {
            return cacheDivStorageComponent();
        }
        if (i10 == 2) {
            return n8.a.b(this.mDivKitConfiguration.getExecutorService());
        }
        if (i10 == 3) {
            return cacheSendBeaconManager();
        }
        if (i10 == 4) {
            return cacheHistogramRecorder();
        }
        if (i10 == 5) {
            return cacheHistogramColdTypeChecker();
        }
        throw new AssertionError();
    }
}
