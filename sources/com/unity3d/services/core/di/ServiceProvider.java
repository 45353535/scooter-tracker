package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidIntentCreation;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import eg.c0;
import eg.h;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020-H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "()V", "CDN_CREATIVES_HOST", "", "CDN_CREATIVES_PORT", "", "DATA_STORE_GATEWAY_CACHE", "DATA_STORE_GL_INFO", "DATA_STORE_IAP_TRANSACTION", "DATA_STORE_NATIVE_CONFIG", "DATA_STORE_PRIVACY", "DATA_STORE_PRIVACY_FSM", "DATA_STORE_UNIVERSAL_REQUEST", "DATA_STORE_WEBVIEW_CONFIG", "DEFAULT_DISPATCHER", "DEV_CONSENT_PRIVACY_RULES", "GATEWAY_HOST", "GATEWAY_PORT", "HTTP_CACHE_DISK_SIZE", "", "HTTP_CLIENT_FETCH_TIMEOUT", "IO_DISPATCHER", "LEGACY_PRIVACY_RULES", "MAIN_DISPATCHER", "NAMED_AD_REQ", "NAMED_GET_TOKEN_SCOPE", "NAMED_INIT_REQ", "NAMED_INIT_SCOPE", "NAMED_LOAD_SCOPE", "NAMED_LOCAL", "NAMED_OFFERWALL_SCOPE", "NAMED_OMID_SCOPE", "NAMED_OPERATIVE_REQ", "NAMED_OTHER_REQ", "NAMED_PUBLIC_JOB", "NAMED_REMOTE", "NAMED_SCAR_SCOPE", "NAMED_SDK", "NAMED_SHOW_SCOPE", "NAMED_TRANSACTION_SCOPE", "PREF_GL_INFO", "SCAR_SIGNALS_FETCH_TIMEOUT", "SCAR_VERSION_FETCH_TIMEOUT", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", MobileAdsBridgeBase.initializeMethodName, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ServiceProvider implements IServiceProvider {

    @NotNull
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;

    @NotNull
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";

    @NotNull
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";

    @NotNull
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";

    @NotNull
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY = "privacy.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";

    @NotNull
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";

    @NotNull
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";

    @NotNull
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";

    @NotNull
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";

    @NotNull
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;

    @NotNull
    public static final ServiceProvider INSTANCE;

    @NotNull
    public static final String IO_DISPATCHER = "io_dispatcher";

    @NotNull
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";

    @NotNull
    public static final String MAIN_DISPATCHER = "main_dispatcher";

    @NotNull
    public static final String NAMED_AD_REQ = "ad_req";

    @NotNull
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";

    @NotNull
    public static final String NAMED_INIT_REQ = "init_req";

    @NotNull
    public static final String NAMED_INIT_SCOPE = "init_scope";

    @NotNull
    public static final String NAMED_LOAD_SCOPE = "load_scope";

    @NotNull
    public static final String NAMED_LOCAL = "local";

    @NotNull
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";

    @NotNull
    public static final String NAMED_OMID_SCOPE = "omid_scope";

    @NotNull
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";

    @NotNull
    public static final String NAMED_OTHER_REQ = "other_req";

    @NotNull
    public static final String NAMED_PUBLIC_JOB = "public_job";

    @NotNull
    public static final String NAMED_REMOTE = "remote";

    @NotNull
    public static final String NAMED_SCAR_SCOPE = "scar_scope";

    @NotNull
    public static final String NAMED_SDK = "sdk";

    @NotNull
    public static final String NAMED_SHOW_SCOPE = "show_scope";

    @NotNull
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";

    @NotNull
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;

    @NotNull
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new Function1<ServicesRegistry, Unit>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServicesRegistry servicesRegistry) {
                invoke2(servicesRegistry);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final ServicesRegistry registry) {
                Intrinsics.checkNotNullParameter(registry, "$this$registry");
                final UnityAdsModule unityAdsModule = new UnityAdsModule();
                registry.updateService(new ServiceKey("", v0.b(Context.class)), i.a(new Function0<Context>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Context invoke() {
                        return ClientProperties.getApplicationContext();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, v0.b(CoroutineDispatcher.class)), i.a(new Function0<CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.mainDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class)), i.a(new Function0<CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.3
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.defaultDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class)), i.a(new Function0<CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.4
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineDispatcher invoke() {
                        return unityAdsModule.ioDispatcher();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ISDKDispatchers.class)), i.a(new Function0<ISDKDispatchers>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.5
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ISDKDispatchers invoke() {
                        return unityAdsModule.sdkDispatchers();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SDKMetricsSender.class)), i.a(new Function0<SDKMetricsSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.6
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SDKMetricsSender invoke() {
                        return unityAdsModule.sdkMetrics();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.initCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.loadCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.showCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.scarSignalsCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, v0.b(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineScope invoke() {
                        return unityAdsModule.omidCoroutineScope((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))), (Job) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, v0.b(Job.class)), ServiceFactoryKt.factoryOf(new Function0<Job>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Job invoke() {
                        return unityAdsModule.publicApiJob((DiagnosticEventRepository) registry.resolveService(new ServiceKey("", v0.b(DiagnosticEventRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, v0.b(ByteStringDataSource.class)), i.a(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.16
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return new AndroidLegacyConfigStoreDataSource((StorageManager) registry.resolveService(new ServiceKey("", v0.b(StorageManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, v0.b(DataStore.class)), i.a(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.privacyDataStore((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, v0.b(ByteStringDataSource.class)), i.a(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.privacyDataStore((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, v0.b(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, v0.b(DataStore.class)), i.a(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.privacyFsmDataStore((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, v0.b(ByteStringDataSource.class)), i.a(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.privacyFsmDataStore((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, v0.b(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, v0.b(DataStore.class)), i.a(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.21
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, v0.b(ByteStringDataSource.class)), i.a(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.22
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, v0.b(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, v0.b(DataStore.class)), i.a(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.23
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.glInfoDataStore((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))), (DataMigration) registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, v0.b(DataMigration.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, v0.b(ByteStringDataSource.class)), i.a(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.24
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.glInfoDataStore((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, v0.b(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, v0.b(DataStore.class)), i.a(new Function0<DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.25
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
                        return unityAdsModule.universalRequestDataStore((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, v0.b(DataStore.class)), i.a(new Function0<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.26
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.iapTransactionDataStore((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, v0.b(ByteStringDataSource.class)), i.a(new Function0<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.27
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.iapTransactionDataStore((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, v0.b(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, v0.b(DataStore.class)), i.a(new Function0<DataStore<WebviewConfigurationStore.WebViewConfigurationStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.28
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> invoke() {
                        return unityAdsModule.webViewConfigurationDataStore((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AsyncTokenStorage.class)), i.a(new Function0<AsyncTokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.29
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AsyncTokenStorage invoke() {
                        return unityAdsModule.asyncTokenStorage((TokenStorage) registry.resolveService(new ServiceKey("", v0.b(TokenStorage.class))), (SDKMetricsSender) registry.resolveService(new ServiceKey("", v0.b(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(VolumeChangeMonitor.class)), i.a(new Function0<VolumeChangeMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.30
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final VolumeChangeMonitor invoke() {
                        return unityAdsModule.volumeChangeMonitor((VolumeChange) registry.resolveService(new ServiceKey("", v0.b(VolumeChange.class))));
                    }
                }));
                registry.updateService(new ServiceKey("PUBLIC", v0.b(JsonStorage.class)), i.a(new Function0<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.31
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.publicJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("PRIVATE", v0.b(JsonStorage.class)), i.a(new Function0<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.32
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.privateJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("MEMORY", v0.b(JsonStorage.class)), i.a(new Function0<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.33
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.memoryJsonStorage();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(NativeConfigurationOuterClass.NativeConfiguration.class)), i.a(new Function0<NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.34
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                        return unityAdsModule.defaultNativeConfiguration();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(MeasurementsService.class)), i.a(new Function0<MeasurementsService>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.35
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MeasurementsService invoke() {
                        return unityAdsModule.measurementService((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TopicsService.class)), i.a(new Function0<TopicsService>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.36
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TopicsService invoke() {
                        return unityAdsModule.topicsService((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CronetEngineBuilderFactory.class)), i.a(new Function0<CronetEngineBuilderFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.37
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CronetEngineBuilderFactory invoke() {
                        return new CronetEngineBuilderFactory();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HttpClientProvider.class)), i.a(new Function0<HttpClientProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.38
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HttpClientProvider invoke() {
                        return new AndroidHttpClientProvider((AlternativeFlowReader) registry.resolveService(new ServiceKey("", v0.b(AlternativeFlowReader.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CronetEngineBuilderFactory) registry.resolveService(new ServiceKey("", v0.b(CronetEngineBuilderFactory.class))), (MediationTraitsMetadataReader) registry.resolveService(new ServiceKey("", v0.b(MediationTraitsMetadataReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HttpClient.class)), i.a(new Function0<HttpClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.39

                    /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @e(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", l = {459}, m = "invokeSuspend")
                    static final class C08471 extends k implements Function2<CoroutineScope, Continuation, Object> {
                        final /* synthetic */ ServicesRegistry $this_registry;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C08471(ServicesRegistry servicesRegistry, Continuation continuation) {
                            super(2, continuation);
                            this.$this_registry = servicesRegistry;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            return new C08471(this.$this_registry, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object objG = b.g();
                            int i10 = this.label;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                d.b(obj);
                                return obj;
                            }
                            d.b(obj);
                            HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", v0.b(HttpClientProvider.class)));
                            this.label = 1;
                            Object objInvoke = httpClientProvider.invoke(this);
                            return objInvoke == objG ? objG : objInvoke;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                            return ((C08471) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                        }
                    }

                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HttpClient invoke() {
                        return (HttpClient) h.b(null, new C08471(registry, null), 1, null);
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new Function0<MediationTraitsMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.40
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MediationTraitsMetadataReader invoke() {
                        return new MediationTraitsMetadataReader((JsonStorage) registry.resolveService(new ServiceKey("MEMORY", v0.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AlternativeFlowReader.class)), i.a(new Function0<AlternativeFlowReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.41
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AlternativeFlowReader invoke() {
                        return new CommonAlternativeFlowReader((ConfigurationReader) registry.resolveService(new ServiceKey("", v0.b(ConfigurationReader.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (MediationTraitsMetadataReader) registry.resolveService(new ServiceKey("", v0.b(MediationTraitsMetadataReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TcfDataSource.class)), i.a(new Function0<TcfDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.42
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TcfDataSource invoke() {
                        return new AndroidTcfDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TcfRepository.class)), i.a(new Function0<TcfRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.43
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TcfRepository invoke() {
                        return new AndroidTcfRepository((TcfDataSource) registry.resolveService(new ServiceKey("", v0.b(TcfDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidManifestIntPropertyReader.class)), i.a(new Function0<AndroidManifestIntPropertyReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.44
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidManifestIntPropertyReader invoke() {
                        return new AndroidManifestIntPropertyReader((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidTestDataInfo.class)), i.a(new Function0<AndroidTestDataInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.45
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidTestDataInfo invoke() {
                        return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) registry.resolveService(new ServiceKey("", v0.b(AndroidManifestIntPropertyReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GameServerIdReader.class)), i.a(new Function0<GameServerIdReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.46
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GameServerIdReader invoke() {
                        return new GameServerIdReader((JsonStorage) registry.resolveService(new ServiceKey("PUBLIC", v0.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(StoreDataSource.class)), i.a(new Function0<StoreDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.47
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final StoreDataSource invoke() {
                        return new AndroidStoreDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AnalyticsDataSource.class)), i.a(new Function0<AnalyticsDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.48
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AnalyticsDataSource invoke() {
                        return new AndroidAnalyticsDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DeveloperConsentDataSource.class)), i.a(new Function0<DeveloperConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.49
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DeveloperConsentDataSource invoke() {
                        return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, v0.b(FlattenerRulesUseCase.class))), (JsonStorage) registry.resolveService(new ServiceKey("PUBLIC", v0.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DynamicDeviceInfoDataSource.class)), i.a(new Function0<DynamicDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.50
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DynamicDeviceInfoDataSource invoke() {
                        return new AndroidDynamicDeviceInfoDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (LifecycleDataSource) registry.resolveService(new ServiceKey("", v0.b(LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(LegacyUserConsentDataSource.class)), i.a(new Function0<LegacyUserConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.51
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LegacyUserConsentDataSource invoke() {
                        return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, v0.b(FlattenerRulesUseCase.class))), (JsonStorage) registry.resolveService(new ServiceKey("PRIVATE", v0.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(LifecycleDataSource.class)), i.a(new Function0<LifecycleDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.52
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LifecycleDataSource invoke() {
                        return new AndroidLifecycleDataSource();
                    }
                }));
                registry.updateService(new ServiceKey("local", v0.b(CacheDataSource.class)), i.a(new Function0<CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.53
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CacheDataSource invoke() {
                        return new AndroidLocalCacheDataSource((CreateFile) registry.resolveService(new ServiceKey("", v0.b(CreateFile.class))), (GetFileExtensionFromUrl) registry.resolveService(new ServiceKey("", v0.b(GetFileExtensionFromUrl.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CreateFile.class)), i.a(new Function0<CreateFile>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.54
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CreateFile invoke() {
                        return new CommonCreateFile();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetFileExtensionFromUrl.class)), i.a(new Function0<GetFileExtensionFromUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.55
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetFileExtensionFromUrl invoke() {
                        return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) registry.resolveService(new ServiceKey("", v0.b(RemoveUrlQuery.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(RemoveUrlQuery.class)), i.a(new Function0<RemoveUrlQuery>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.56
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final RemoveUrlQuery invoke() {
                        return new AndroidRemoveUrlQuery();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(MediationDataSource.class)), i.a(new Function0<MediationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.57
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MediationDataSource invoke() {
                        return new AndroidMediationDataSource((JsonStorage) registry.resolveService(new ServiceKey("MEMORY", v0.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(PrivacyDeviceInfoDataSource.class)), i.a(new Function0<PrivacyDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.58
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final PrivacyDeviceInfoDataSource invoke() {
                        return new AndroidPrivacyDeviceInfoDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (FIdDataSource) registry.resolveService(new ServiceKey("", v0.b(FIdDataSource.class))), (AndroidAppSetIdDataSource) registry.resolveService(new ServiceKey("", v0.b(AndroidAppSetIdDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, v0.b(CacheDataSource.class)), i.a(new Function0<CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.59
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CacheDataSource invoke() {
                        return new AndroidRemoteCacheDataSource((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))), (CreateFile) registry.resolveService(new ServiceKey("", v0.b(CreateFile.class))), (GetFileExtensionFromUrl) registry.resolveService(new ServiceKey("", v0.b(GetFileExtensionFromUrl.class))), (HttpClient) registry.resolveService(new ServiceKey("", v0.b(HttpClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(StaticDeviceInfoDataSource.class)), i.a(new Function0<StaticDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.60
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final StaticDeviceInfoDataSource invoke() {
                        return new AndroidStaticDeviceInfoDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, v0.b(ByteStringDataSource.class))), (AnalyticsDataSource) registry.resolveService(new ServiceKey("", v0.b(AnalyticsDataSource.class))), (StoreDataSource) registry.resolveService(new ServiceKey("", v0.b(StoreDataSource.class))), (UnityBootConfigDataSource) registry.resolveService(new ServiceKey("", v0.b(UnityBootConfigDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, v0.b(DataMigration.class)), i.a(new Function0<DataMigration<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.61
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) registry.resolveService(new ServiceKey("", v0.b(GetOpenGLRendererInfo.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(UniversalRequestDataSource.class)), i.a(new Function0<UniversalRequestDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.62
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final UniversalRequestDataSource invoke() {
                        return new UniversalRequestDataSource((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, v0.b(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(WebviewConfigurationDataSource.class)), i.a(new Function0<WebviewConfigurationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.63
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final WebviewConfigurationDataSource invoke() {
                        return new WebviewConfigurationDataSource((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, v0.b(DataStore.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OmidManager.class)), i.a(new Function0<OmidManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.64
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OmidManager invoke() {
                        return new AndroidOmidManager();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SDKPropertiesManager.class)), i.a(new Function0<SDKPropertiesManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.65
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SDKPropertiesManager invoke() {
                        return new AndroidSDKPropertiesManager();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(StorageManager.class)), i.a(new Function0<StorageManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.66
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final StorageManager invoke() {
                        return new AndroidStorageManager();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(BillingClientAdapter.class)), i.a(new Function0<BillingClientAdapter>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.67
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final BillingClientAdapter invoke() {
                        return new BillingClientAdapterFactory().createBillingClientAdapter((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ProductDetailsFetcher.class)), i.a(new Function0<ProductDetailsFetcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.68
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ProductDetailsFetcher invoke() {
                        return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) registry.resolveService(new ServiceKey("", v0.b(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) registry.resolveService(new ServiceKey("", v0.b(BillingClientAdapter.class))), "subs"));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TransactionEventManager.class)), i.a(new Function0<TransactionEventManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.69
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TransactionEventManager invoke() {
                        return new TransactionEventManager((CoroutineScope) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, v0.b(CoroutineScope.class))), (BillingClientAdapter) registry.resolveService(new ServiceKey("", v0.b(BillingClientAdapter.class))), (GetTransactionData) registry.resolveService(new ServiceKey("", v0.b(GetTransactionData.class))), (GetTransactionRequest) registry.resolveService(new ServiceKey("", v0.b(GetTransactionRequest.class))), (TransactionEventRepository) registry.resolveService(new ServiceKey("", v0.b(TransactionEventRepository.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, v0.b(ByteStringDataSource.class))), (IsBillingClientAvailable) registry.resolveService(new ServiceKey("", v0.b(IsBillingClientAvailable.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (ProductDetailsFetcher) registry.resolveService(new ServiceKey("", v0.b(ProductDetailsFetcher.class))), (Logger) registry.resolveService(new ServiceKey("", v0.b(Logger.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AdRepository.class)), i.a(new Function0<AdRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.70
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AdRepository invoke() {
                        return new AndroidAdRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CacheRepository.class)), i.a(new Function0<CacheRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.71
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CacheRepository invoke() {
                        return new AndroidCacheRepository((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))), (GetCacheDirectory) registry.resolveService(new ServiceKey("", v0.b(GetCacheDirectory.class))), (CacheDataSource) registry.resolveService(new ServiceKey("local", v0.b(CacheDataSource.class))), (CacheDataSource) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, v0.b(CacheDataSource.class))), (Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (CleanupDirectory) registry.resolveService(new ServiceKey("", v0.b(CleanupDirectory.class))), (DownloadPriorityQueue) registry.resolveService(new ServiceKey("", v0.b(DownloadPriorityQueue.class))), (CreateFile) registry.resolveService(new ServiceKey("", v0.b(CreateFile.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetCacheDirectory.class)), i.a(new Function0<GetCacheDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.72
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetCacheDirectory invoke() {
                        return new CommonGetCacheDirectory();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CampaignRepository.class)), i.a(new Function0<CampaignRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.73
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CampaignRepository invoke() {
                        return new AndroidCampaignRepository((GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", v0.b(GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DeveloperConsentRepository.class)), i.a(new Function0<DeveloperConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.74
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DeveloperConsentRepository invoke() {
                        return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) registry.resolveService(new ServiceKey("", v0.b(DeveloperConsentDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DeviceInfoRepository.class)), i.a(new Function0<DeviceInfoRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.75
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DeviceInfoRepository invoke() {
                        return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) registry.resolveService(new ServiceKey("", v0.b(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) registry.resolveService(new ServiceKey("", v0.b(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) registry.resolveService(new ServiceKey("", v0.b(PrivacyDeviceInfoDataSource.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DiagnosticEventRepository.class)), i.a(new Function0<DiagnosticEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.76
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DiagnosticEventRepository invoke() {
                        return new AndroidDiagnosticEventRepository((CoroutineTimer) registry.resolveService(new ServiceKey("", v0.b(CoroutineTimer.class))), (GetDiagnosticEventRequest) registry.resolveService(new ServiceKey("", v0.b(GetDiagnosticEventRequest.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(LegacyUserConsentRepository.class)), i.a(new Function0<LegacyUserConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.77
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LegacyUserConsentRepository invoke() {
                        return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) registry.resolveService(new ServiceKey("", v0.b(LegacyUserConsentDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(MediationRepository.class)), i.a(new Function0<MediationRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.78
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MediationRepository invoke() {
                        return new AndroidMediationRepository((MediationDataSource) registry.resolveService(new ServiceKey("", v0.b(MediationDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OpenMeasurementRepository.class)), i.a(new Function0<OpenMeasurementRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.79
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OpenMeasurementRepository invoke() {
                        return new AndroidOpenMeasurementRepository((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, v0.b(CoroutineDispatcher.class))), (OmidManager) registry.resolveService(new ServiceKey("", v0.b(OmidManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SessionRepository.class)), i.a(new Function0<SessionRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.80
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SessionRepository invoke() {
                        return new AndroidSessionRepository((ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, v0.b(ByteStringDataSource.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, v0.b(ByteStringDataSource.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, v0.b(ByteStringDataSource.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, v0.b(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) registry.resolveService(new ServiceKey("", v0.b(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) registry.resolveService(new ServiceKey("", v0.b(NativeConfigurationOuterClass.NativeConfiguration.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TransactionEventRepository.class)), i.a(new Function0<TransactionEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.81
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TransactionEventRepository invoke() {
                        return new AndroidTransactionEventRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OperativeEventRepository.class)), i.a(new Function0<OperativeEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.82
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OperativeEventRepository invoke() {
                        return new OperativeEventRepository();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ExecuteAdViewerRequest.class)), i.a(new Function0<ExecuteAdViewerRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.83
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ExecuteAdViewerRequest invoke() {
                        return new AndroidExecuteAdViewerRequest((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))), (HttpClient) registry.resolveService(new ServiceKey("", v0.b(HttpClient.class))), (GetCachedAsset) registry.resolveService(new ServiceKey("", v0.b(GetCachedAsset.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetByteStringId.class)), i.a(new Function0<GetByteStringId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.84
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetByteStringId invoke() {
                        return new AndroidGenerateByteStringId();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(IntentCreation.class)), ServiceFactoryKt.factoryOf(new Function0<IntentCreation>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.85
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IntentCreation invoke() {
                        return new AndroidIntentCreation();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleOpenUrl.class)), ServiceFactoryKt.factoryOf(new Function0<HandleOpenUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.86
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleOpenUrl invoke() {
                        return new AndroidHandleOpenUrl((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (IntentCreation) registry.resolveService(new ServiceKey("", v0.b(IntentCreation.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(Refresh.class)), i.a(new Function0<Refresh>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.87
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Refresh invoke() {
                        return new AndroidRefresh((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (GetAdDataRefreshRequest) registry.resolveService(new ServiceKey("", v0.b(GetAdDataRefreshRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, v0.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SendDiagnosticEvent.class)), i.a(new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.88
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SendDiagnosticEvent invoke() {
                        return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) registry.resolveService(new ServiceKey("", v0.b(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) registry.resolveService(new ServiceKey("", v0.b(GetDiagnosticEventRequest.class))), (LifecycleDataSource) registry.resolveService(new ServiceKey("", v0.b(LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SendWebViewClientErrorDiagnostics.class)), i.a(new Function0<SendWebViewClientErrorDiagnostics>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.89
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SendWebViewClientErrorDiagnostics invoke() {
                        return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(Show.class)), i.a(new Function0<Show>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.90
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Show invoke() {
                        return new AndroidShow((AdRepository) registry.resolveService(new ServiceKey("", v0.b(AdRepository.class))), (GameServerIdReader) registry.resolveService(new ServiceKey("", v0.b(GameServerIdReader.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CacheFile.class)), i.a(new Function0<CacheFile>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.91
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CacheFile invoke() {
                        return new CommonCacheFile((CacheRepository) registry.resolveService(new ServiceKey("", v0.b(CacheRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CleanAssets.class)), i.a(new Function0<CleanAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.92
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CleanAssets invoke() {
                        return new CommonCleanAssets((CacheRepository) registry.resolveService(new ServiceKey("", v0.b(CacheRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetAdObject.class)), i.a(new Function0<GetAdObject>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.93
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetAdObject invoke() {
                        return new CommonGetAdObject((AdRepository) registry.resolveService(new ServiceKey("", v0.b(AdRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0<GetHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.94
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetHeaderBiddingToken invoke() {
                        return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) registry.resolveService(new ServiceKey("", v0.b(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) registry.resolveService(new ServiceKey("", v0.b(FetchSignalsAndSendUseCase.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0<BuildHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.95
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final BuildHeaderBiddingToken invoke() {
                        return new AndroidBuildHeaderBiddingToken((GetByteStringId) registry.resolveService(new ServiceKey("", v0.b(GetByteStringId.class))), (GetClientInfo) registry.resolveService(new ServiceKey("", v0.b(GetClientInfo.class))), (GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", v0.b(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) registry.resolveService(new ServiceKey("", v0.b(GetLimitedSessionToken.class))), (GetInitializationData) registry.resolveService(new ServiceKey("", v0.b(GetInitializationData.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", v0.b(CampaignRepository.class))), (TcfRepository) registry.resolveService(new ServiceKey("", v0.b(TcfRepository.class))), (AndroidTestDataInfo) registry.resolveService(new ServiceKey("", v0.b(AndroidTestDataInfo.class))), (OfferwallManager) registry.resolveService(new ServiceKey("", v0.b(OfferwallManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new Function0<TokenNumberProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.96
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TokenNumberProvider invoke() {
                        return new CommonTokenNumberProvider((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetInitializationData.class)), i.a(new Function0<GetInitializationData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.97
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetInitializationData invoke() {
                        return new AndroidGetInitializationData((GetInitializationRequestPayload) registry.resolveService(new ServiceKey("", v0.b(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestSharedData.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new Function0<MediationInitBlobMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.98
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MediationInitBlobMetadataReader invoke() {
                        return new MediationInitBlobMetadataReader((JsonStorage) registry.resolveService(new ServiceKey("MEMORY", v0.b(JsonStorage.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetInitializationRequestPayload.class)), i.a(new Function0<GetInitializationRequestPayload>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.99
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetInitializationRequestPayload invoke() {
                        return new AndroidGetInitializationRequestPayload((GetClientInfo) registry.resolveService(new ServiceKey("", v0.b(GetClientInfo.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (LegacyUserConsentRepository) registry.resolveService(new ServiceKey("", v0.b(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) registry.resolveService(new ServiceKey("", v0.b(MediationInitBlobMetadataReader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetInitializationState.class)), i.a(new Function0<GetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.100
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetInitializationState invoke() {
                        return new CommonGetInitializationState((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (SDKPropertiesManager) registry.resolveService(new ServiceKey("", v0.b(SDKPropertiesManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetIsFileCache.class)), i.a(new Function0<GetIsFileCache>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.101
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetIsFileCache invoke() {
                        return new CommonGetIsFileCache((CacheRepository) registry.resolveService(new ServiceKey("", v0.b(CacheRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SetInitializationState.class)), i.a(new Function0<SetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.102
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SetInitializationState invoke() {
                        return new CommonSetInitializationState((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (SDKPropertiesManager) registry.resolveService(new ServiceKey("", v0.b(SDKPropertiesManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, v0.b(GetRequestPolicy.class)), i.a(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.103
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new AndroidGetAdRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetAdDataRefreshRequest.class)), i.a(new Function0<GetAdDataRefreshRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.104
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetAdDataRefreshRequest invoke() {
                        return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", v0.b(CampaignRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetAdPlayerConfigRequest.class)), i.a(new Function0<GetAdPlayerConfigRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.105
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetAdPlayerConfigRequest invoke() {
                        return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidGetAdPlayerContext.class)), i.a(new Function0<AndroidGetAdPlayerContext>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.106
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidGetAdPlayerContext invoke() {
                        return new AndroidGetAdPlayerContext((DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetAdRequest.class)), i.a(new Function0<GetAdRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.107
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetAdRequest invoke() {
                        return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", v0.b(CampaignRepository.class))), (WebviewConfigurationDataSource) registry.resolveService(new ServiceKey("", v0.b(WebviewConfigurationDataSource.class))), (TcfRepository) registry.resolveService(new ServiceKey("", v0.b(TcfRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetHbTokenEventRequest.class)), i.a(new Function0<GetHbTokenEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.108
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetHbTokenEventRequest invoke() {
                        return new GetAndroidTokenEventRequest();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CommonScarEventReceiver.class)), i.a(new Function0<CommonScarEventReceiver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.109
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CommonScarEventReceiver invoke() {
                        return new CommonScarEventReceiver((CoroutineScope) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, v0.b(CoroutineScope.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GMAScarAdapterBridge.class)), i.a(new Function0<GMAScarAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.110
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GMAScarAdapterBridge invoke() {
                        GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) registry.resolveService(new ServiceKey("", v0.b(CommonScarEventReceiver.class))))).getBridge();
                        Intrinsics.checkNotNullExpressionValue(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                        return bridge;
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ScarTimeHackFixer.class)), i.a(new Function0<ScarTimeHackFixer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.111
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ScarTimeHackFixer invoke() {
                        return new ScarTimeHackFixer((SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ScarManager.class)), i.a(new Function0<ScarManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.112
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ScarManager invoke() {
                        return new AndroidScarManager((CommonScarEventReceiver) registry.resolveService(new ServiceKey("", v0.b(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) registry.resolveService(new ServiceKey("", v0.b(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) registry.resolveService(new ServiceKey("", v0.b(ScarTimeHackFixer.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(FetchSignalsAndSendUseCase.class)), i.a(new Function0<FetchSignalsAndSendUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.113
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final FetchSignalsAndSendUseCase invoke() {
                        return new AndroidFetchSignalsAndSendUseCase((CoroutineScope) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, v0.b(CoroutineScope.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (ScarManager) registry.resolveService(new ServiceKey("", v0.b(ScarManager.class))), (HandleGetTokenRequest) registry.resolveService(new ServiceKey("", v0.b(HandleGetTokenRequest.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(LoadScarAd.class)), i.a(new Function0<LoadScarAd>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.114
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LoadScarAd invoke() {
                        return new LoadScarAd((ScarManager) registry.resolveService(new ServiceKey("", v0.b(ScarManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleGetTokenRequest.class)), i.a(new Function0<HandleGetTokenRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.115
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleGetTokenRequest invoke() {
                        return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) registry.resolveService(new ServiceKey("", v0.b(GetHbTokenEventRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, v0.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetClientInfo.class)), i.a(new Function0<GetClientInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.116
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetClientInfo invoke() {
                        return new AndroidGetClientInfo((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (MediationRepository) registry.resolveService(new ServiceKey("", v0.b(MediationRepository.class))), (OmidManager) registry.resolveService(new ServiceKey("", v0.b(OmidManager.class))), (ScarManager) registry.resolveService(new ServiceKey("", v0.b(ScarManager.class))), (OfferwallManager) registry.resolveService(new ServiceKey("", v0.b(OfferwallManager.class))), (FIdExistenceDataSource) registry.resolveService(new ServiceKey("", v0.b(FIdExistenceDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetInitializationCompletedRequest.class)), i.a(new Function0<GetInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.117
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetInitializationCompletedRequest invoke() {
                        return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetInitializationRequest.class)), i.a(new Function0<GetInitializationRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.118
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetInitializationRequest invoke() {
                        return new AndroidGetInitializationRequest((GetInitializationRequestPayload) registry.resolveService(new ServiceKey("", v0.b(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetLimitedSessionToken.class)), i.a(new Function0<GetLimitedSessionToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.119
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetLimitedSessionToken invoke() {
                        return new AndroidGetLimitedSessionToken((DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (MediationRepository) registry.resolveService(new ServiceKey("", v0.b(MediationRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetOpenGLRendererInfo.class)), i.a(new Function0<GetOpenGLRendererInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.120
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetOpenGLRendererInfo invoke() {
                        return new AndroidGetOpenGLRendererInfo((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetSharedDataTimestamps.class)), i.a(new Function0<GetSharedDataTimestamps>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.121
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetSharedDataTimestamps invoke() {
                        return new AndroidGetSharedDataTimestamps();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class)), i.a(new Function0<GetUniversalRequestForPayLoad>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.122
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetUniversalRequestForPayLoad invoke() {
                        return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestSharedData.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetUniversalRequestSharedData.class)), i.a(new Function0<GetUniversalRequestSharedData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.123
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetUniversalRequestSharedData invoke() {
                        return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", v0.b(GetSharedDataTimestamps.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (GetLimitedSessionToken) registry.resolveService(new ServiceKey("", v0.b(GetLimitedSessionToken.class))), (DeveloperConsentRepository) registry.resolveService(new ServiceKey("", v0.b(DeveloperConsentRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetCachedAsset.class)), i.a(new Function0<GetCachedAsset>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.124
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetCachedAsset invoke() {
                        return new GetCachedAsset((CacheRepository) registry.resolveService(new ServiceKey("", v0.b(CacheRepository.class))), (Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (CacheWebViewAssets) registry.resolveService(new ServiceKey("", v0.b(CacheWebViewAssets.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetWebViewBridgeUseCase.class)), i.a(new Function0<GetWebViewBridgeUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.125
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetWebViewBridgeUseCase invoke() {
                        return new CommonGetWebViewBridgeUseCase((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (Logger) registry.resolveService(new ServiceKey("", v0.b(Logger.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, v0.b(GetRequestPolicy.class)), i.a(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.126
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetInitRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetLatestWebViewConfiguration.class)), i.a(new Function0<GetLatestWebViewConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.127
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetLatestWebViewConfiguration invoke() {
                        return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) registry.resolveService(new ServiceKey("", v0.b(WebviewConfigurationDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, v0.b(GetRequestPolicy.class)), i.a(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.128
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetOperativeEventRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, v0.b(GetRequestPolicy.class)), i.a(new Function0<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.129
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetOtherRequestPolicy((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetPrivacyUpdateRequest.class)), i.a(new Function0<GetPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.130
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetPrivacyUpdateRequest invoke() {
                        return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleGatewayInitializationResponse.class)), i.a(new Function0<HandleGatewayInitializationResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.131
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleGatewayInitializationResponse invoke() {
                        return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) registry.resolveService(new ServiceKey("", v0.b(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) registry.resolveService(new ServiceKey("", v0.b(TriggerInitializationCompletedRequest.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (CoroutineScope) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, v0.b(CoroutineScope.class))), (HandleDebugSettings) registry.resolveService(new ServiceKey("", v0.b(HandleDebugSettings.class))), (GetSafeguardedInitializationPolicy) registry.resolveService(new ServiceKey("", v0.b(GetSafeguardedInitializationPolicy.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleGatewayUniversalResponse.class)), i.a(new Function0<HandleGatewayUniversalResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.132
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleGatewayUniversalResponse invoke() {
                        return new AndroidHandleGatewayUniversalResponse((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) registry.resolveService(new ServiceKey("", v0.b(AndroidAppSetIdDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeBoldSDK.class)), i.a(new Function0<InitializeBoldSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.133
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeBoldSDK invoke() {
                        return new AndroidInitializeBoldSDK((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (InitializeOMSDK) registry.resolveService(new ServiceKey("", v0.b(InitializeOMSDK.class))), (GetInitializationRequest) registry.resolveService(new ServiceKey("", v0.b(GetInitializationRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, v0.b(GetRequestPolicy.class))), (CleanAssets) registry.resolveService(new ServiceKey("", v0.b(CleanAssets.class))), (HandleGatewayInitializationResponse) registry.resolveService(new ServiceKey("", v0.b(HandleGatewayInitializationResponse.class))), (GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (EventObservers) registry.resolveService(new ServiceKey("", v0.b(EventObservers.class))), (TriggerInitializeListener) registry.resolveService(new ServiceKey("", v0.b(TriggerInitializeListener.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (DiagnosticEventRepository) registry.resolveService(new ServiceKey("", v0.b(DiagnosticEventRepository.class))), (StorageManager) registry.resolveService(new ServiceKey("", v0.b(StorageManager.class))), (ConfigurationReader) registry.resolveService(new ServiceKey("", v0.b(ConfigurationReader.class))), (SDKPropertiesManager) registry.resolveService(new ServiceKey("", v0.b(SDKPropertiesManager.class))), (GetGameId) registry.resolveService(new ServiceKey("", v0.b(GetGameId.class))), (Logger) registry.resolveService(new ServiceKey("", v0.b(Logger.class))), (AndroidHandleFocusCounters) registry.resolveService(new ServiceKey("", v0.b(AndroidHandleFocusCounters.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new Function0<LegacyShowUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.134
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LegacyShowUseCase invoke() {
                        return new LegacyShowUseCase((Show) registry.resolveService(new ServiceKey("", v0.b(Show.class))), (AdRepository) registry.resolveService(new ServiceKey("", v0.b(AdRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) registry.resolveService(new ServiceKey("", v0.b(GetOperativeEventApi.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", v0.b(GetInitializationState.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (SafeCallbackInvoke) registry.resolveService(new ServiceKey("", v0.b(SafeCallbackInvoke.class))), (Logger) registry.resolveService(new ServiceKey("", v0.b(Logger.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SendPrivacyUpdateRequest.class)), i.a(new Function0<SendPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.135
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SendPrivacyUpdateRequest invoke() {
                        return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) registry.resolveService(new ServiceKey("", v0.b(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, v0.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TriggerInitializationCompletedRequest.class)), i.a(new Function0<TriggerInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.136
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TriggerInitializationCompletedRequest invoke() {
                        return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) registry.resolveService(new ServiceKey("", v0.b(GetInitializationCompletedRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, v0.b(GetRequestPolicy.class))), (GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TriggerInitializeListener.class)), i.a(new Function0<TriggerInitializeListener>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.137
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TriggerInitializeListener invoke() {
                        return new TriggerInitializeListener((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DiagnosticEventObserver.class)), i.a(new Function0<DiagnosticEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.138
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DiagnosticEventObserver invoke() {
                        return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) registry.resolveService(new ServiceKey("", v0.b(GetDiagnosticEventBatchRequest.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (DiagnosticEventRepository) registry.resolveService(new ServiceKey("", v0.b(DiagnosticEventRepository.class))), (UniversalRequestDataSource) registry.resolveService(new ServiceKey("", v0.b(UniversalRequestDataSource.class))), (BackgroundWorker) registry.resolveService(new ServiceKey("", v0.b(BackgroundWorker.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(EventObservers.class)), i.a(new Function0<EventObservers>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.139
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final EventObservers invoke() {
                        return new EventObservers((OperativeEventObserver) registry.resolveService(new ServiceKey("", v0.b(OperativeEventObserver.class))), (DiagnosticEventObserver) registry.resolveService(new ServiceKey("", v0.b(DiagnosticEventObserver.class))), (TransactionEventObserver) registry.resolveService(new ServiceKey("", v0.b(TransactionEventObserver.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetTransactionData.class)), i.a(new Function0<GetTransactionData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.140
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetTransactionData invoke() {
                        return new AndroidGetTransactionData((GetByteStringId) registry.resolveService(new ServiceKey("", v0.b(GetByteStringId.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetTransactionRequest.class)), i.a(new Function0<GetTransactionRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.141
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetTransactionRequest invoke() {
                        return new CommonGetTransactionRequest((DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetDiagnosticEventBatchRequest.class)), i.a(new Function0<GetDiagnosticEventBatchRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.142
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetDiagnosticEventBatchRequest invoke() {
                        return new GetDiagnosticEventBatchRequest();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetDiagnosticEventRequest.class)), i.a(new Function0<GetDiagnosticEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.143
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetDiagnosticEventRequest invoke() {
                        return new GetDiagnosticEventRequest((GetSharedDataTimestamps) registry.resolveService(new ServiceKey("", v0.b(GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetOperativeEventApi.class)), i.a(new Function0<GetOperativeEventApi>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.144
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetOperativeEventApi invoke() {
                        return new GetOperativeEventApi((OperativeEventRepository) registry.resolveService(new ServiceKey("", v0.b(OperativeEventRepository.class))), (GetOperativeEventRequest) registry.resolveService(new ServiceKey("", v0.b(GetOperativeEventRequest.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetOperativeEventRequest.class)), i.a(new Function0<GetOperativeEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.145
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetOperativeEventRequest invoke() {
                        return new GetOperativeEventRequest((GetByteStringId) registry.resolveService(new ServiceKey("", v0.b(GetByteStringId.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", v0.b(CampaignRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleGatewayEventResponse.class)), i.a(new Function0<HandleGatewayEventResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.146
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleGatewayEventResponse invoke() {
                        return new AndroidHandleGatewayEventResponse();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OperativeEventObserver.class)), i.a(new Function0<OperativeEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.147
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OperativeEventObserver invoke() {
                        return new OperativeEventObserver((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (OperativeEventRepository) registry.resolveService(new ServiceKey("", v0.b(OperativeEventRepository.class))), (UniversalRequestDataSource) registry.resolveService(new ServiceKey("", v0.b(UniversalRequestDataSource.class))), (BackgroundWorker) registry.resolveService(new ServiceKey("", v0.b(BackgroundWorker.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TransactionEventObserver.class)), i.a(new Function0<TransactionEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.148
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TransactionEventObserver invoke() {
                        return new TransactionEventObserver((GetUniversalRequestForPayLoad) registry.resolveService(new ServiceKey("", v0.b(GetUniversalRequestForPayLoad.class))), (CoroutineScope) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, v0.b(CoroutineScope.class))), (TransactionEventRepository) registry.resolveService(new ServiceKey("", v0.b(TransactionEventRepository.class))), (GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, v0.b(GetRequestPolicy.class))), (ByteStringDataSource) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, v0.b(ByteStringDataSource.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(UniversalRequestTtlValidator.class)), i.a(new Function0<UniversalRequestTtlValidator>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.149
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final UniversalRequestTtlValidator invoke() {
                        return new CommonUniversalRequestTtlValidator();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(UniversalRequestEventSender.class)), i.a(new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.150
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final UniversalRequestEventSender invoke() {
                        return new UniversalRequestEventSender((GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))), (HandleGatewayEventResponse) registry.resolveService(new ServiceKey("", v0.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) registry.resolveService(new ServiceKey("", v0.b(UniversalRequestTtlValidator.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OmFinishSession.class)), i.a(new Function0<OmFinishSession>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.151
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OmFinishSession invoke() {
                        return new AndroidOmFinishSession((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", v0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OmImpressionOccurred.class)), i.a(new Function0<OmImpressionOccurred>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.152
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OmImpressionOccurred invoke() {
                        return new AndroidOmImpressionOccurred((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", v0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidOmInteraction.class)), i.a(new Function0<AndroidOmInteraction>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.153
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidOmInteraction invoke() {
                        return new AndroidOmStartSession((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", v0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetOmData.class)), i.a(new Function0<GetOmData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.154
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetOmData invoke() {
                        return new CommonGetOmData((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", v0.b(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(IsOMActivated.class)), i.a(new Function0<IsOMActivated>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.155
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IsOMActivated invoke() {
                        return new CommonIsOMActivated((OpenMeasurementRepository) registry.resolveService(new ServiceKey("", v0.b(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeOMSDK.class)), i.a(new Function0<InitializeOMSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.156
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeOMSDK invoke() {
                        return new AndroidInitializeOMSDK((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (OpenMeasurementRepository) registry.resolveService(new ServiceKey("", v0.b(OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, v0.b(FlattenerRulesUseCase.class)), i.a(new Function0<FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.157
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final FlattenerRulesUseCase invoke() {
                        return new DeveloperConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, v0.b(FlattenerRulesUseCase.class)), i.a(new Function0<FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.158
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final FlattenerRulesUseCase invoke() {
                        return new LegacyUserConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(BackgroundWorker.class)), i.a(new Function0<BackgroundWorker>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.159
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final BackgroundWorker invoke() {
                        return new BackgroundWorker((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DiagnosticEventRequestWorkModifier.class)), i.a(new Function0<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.160
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DiagnosticEventRequestWorkModifier invoke() {
                        return new DiagnosticEventRequestWorkModifier((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GatewayClient.class)), i.a(new Function0<GatewayClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.161
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GatewayClient invoke() {
                        return new CommonGatewayClient((HttpClient) registry.resolveService(new ServiceKey("", v0.b(HttpClient.class))), (HandleGatewayUniversalResponse) registry.resolveService(new ServiceKey("", v0.b(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("sdk", v0.b(c0.class)), i.a(new Function0<c0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.162
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final c0 invoke() {
                        return new SDKErrorHandler((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, v0.b(CoroutineDispatcher.class))), (AlternativeFlowReader) registry.resolveService(new ServiceKey("", v0.b(AlternativeFlowReader.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (SDKMetricsSender) registry.resolveService(new ServiceKey("", v0.b(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(TokenStorage.class)), i.a(new Function0<TokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.163
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final TokenStorage invoke() {
                        return new InMemoryTokenStorage();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(VolumeChange.class)), i.a(new Function0<VolumeChange>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.164
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final VolumeChange invoke() {
                        return new VolumeChangeContentObserver();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ConfigFileFromLocalStorage.class)), i.a(new Function0<ConfigFileFromLocalStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.165
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ConfigFileFromLocalStorage invoke() {
                        return new ConfigFileFromLocalStorage((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeSDK.class)), i.a(new Function0<InitializeSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.166
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeSDK invoke() {
                        return new InitializeSDK((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) registry.resolveService(new ServiceKey("", v0.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) registry.resolveService(new ServiceKey("", v0.b(InitializeStateReset.class))), (InitializeStateError) registry.resolveService(new ServiceKey("", v0.b(InitializeStateError.class))), (InitializeStateConfig) registry.resolveService(new ServiceKey("", v0.b(InitializeStateConfig.class))), (InitializeStateCreate) registry.resolveService(new ServiceKey("", v0.b(InitializeStateCreate.class))), (InitializeStateLoadCache) registry.resolveService(new ServiceKey("", v0.b(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) registry.resolveService(new ServiceKey("", v0.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) registry.resolveService(new ServiceKey("", v0.b(InitializeStateComplete.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateComplete.class)), i.a(new Function0<InitializeStateComplete>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.167
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateComplete invoke() {
                        return new InitializeStateComplete((DataStore) registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, v0.b(DataStore.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateConfig.class)), i.a(new Function0<InitializeStateConfig>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.168
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateConfig invoke() {
                        return new InitializeStateConfig((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) registry.resolveService(new ServiceKey("", v0.b(InitializeStateConfigWithLoader.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateConfigWithLoader.class)), i.a(new Function0<InitializeStateConfigWithLoader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.169
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateConfigWithLoader invoke() {
                        return new InitializeStateConfigWithLoader((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (InitializeStateNetworkError) registry.resolveService(new ServiceKey("", v0.b(InitializeStateNetworkError.class))), (TokenStorage) registry.resolveService(new ServiceKey("", v0.b(TokenStorage.class))), (SDKMetricsSender) registry.resolveService(new ServiceKey("", v0.b(SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateCreate.class)), i.a(new Function0<InitializeStateCreate>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.170
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateCreate invoke() {
                        return new InitializeStateCreate((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateError.class)), i.a(new Function0<InitializeStateError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.171
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateError invoke() {
                        return new InitializeStateError((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateLoadCache.class)), i.a(new Function0<InitializeStateLoadCache>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.172
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateLoadCache invoke() {
                        return new InitializeStateLoadCache((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateLoadWeb.class)), i.a(new Function0<InitializeStateLoadWeb>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.173
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateLoadWeb invoke() {
                        return new InitializeStateLoadWeb((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (InitializeStateNetworkError) registry.resolveService(new ServiceKey("", v0.b(InitializeStateNetworkError.class))), (HttpClient) registry.resolveService(new ServiceKey("", v0.b(HttpClient.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateReset.class)), i.a(new Function0<InitializeStateReset>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.174
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateReset invoke() {
                        return new InitializeStateReset((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(StoreMonitor.class)), i.a(new Function0<StoreMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.175
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final StoreMonitor invoke() {
                        return new StoreMonitor((StoreExceptionHandler) registry.resolveService(new ServiceKey("", v0.b(StoreExceptionHandler.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(StoreWebViewEventSender.class)), i.a(new Function0<StoreWebViewEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.176
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final StoreWebViewEventSender invoke() {
                        return new StoreWebViewEventSender((IEventSender) registry.resolveService(new ServiceKey("", v0.b(IEventSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(StoreExceptionHandler.class)), i.a(new Function0<StoreExceptionHandler>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.177
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final StoreExceptionHandler invoke() {
                        return new GatewayStoreExceptionHandler();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(StoreEventListenerFactory.class)), i.a(new Function0<StoreEventListenerFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.178
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final StoreEventListenerFactory invoke() {
                        return new StoreEventListenerFactory((StoreWebViewEventSender) registry.resolveService(new ServiceKey("", v0.b(StoreWebViewEventSender.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ConfigurationReader.class)), i.a(new Function0<ConfigurationReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.179
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ConfigurationReader invoke() {
                        return new ConfigurationReader();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidAttribution.class)), i.a(new Function0<AndroidAttribution>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.180
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidAttribution invoke() {
                        return new AndroidAttribution((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new Function0<AdPlayerScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.181
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AdPlayerScope invoke() {
                        return new AdPlayerScope((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (c0) registry.resolveService(new ServiceKey("sdk", v0.b(c0.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new Function0<AndroidWebViewClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.182
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidWebViewClient invoke() {
                        return new AndroidWebViewClient((GetCachedAsset) registry.resolveService(new ServiceKey("", v0.b(GetCachedAsset.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new Function0<AndroidGetWebViewContainerUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.183
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidGetWebViewContainerUseCase invoke() {
                        return new AndroidGetWebViewContainerUseCase((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))), (AndroidWebViewClient) registry.resolveService(new ServiceKey("", v0.b(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) registry.resolveService(new ServiceKey("", v0.b(SendWebViewClientErrorDiagnostics.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, v0.b(CoroutineDispatcher.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(Load.class)), ServiceFactoryKt.factoryOf(new Function0<Load>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.184
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Load invoke() {
                        return new AndroidLoad((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (GetAdRequest) registry.resolveService(new ServiceKey("", v0.b(GetAdRequest.class))), (GetAdPlayerConfigRequest) registry.resolveService(new ServiceKey("", v0.b(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, v0.b(GetRequestPolicy.class))), (HandleGatewayAdResponse) registry.resolveService(new ServiceKey("", v0.b(HandleGatewayAdResponse.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (GatewayClient) registry.resolveService(new ServiceKey("", v0.b(GatewayClient.class))), (AdRepository) registry.resolveService(new ServiceKey("", v0.b(AdRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new Function0<AwaitInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.185
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AwaitInitialization invoke() {
                        return new CommonAwaitInitialization((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.186
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetAsyncHeaderBiddingToken invoke() {
                        return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) registry.resolveService(new ServiceKey("", v0.b(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", v0.b(GetInitializationState.class))), (AwaitInitialization) registry.resolveService(new ServiceKey("", v0.b(AwaitInitialization.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (SafeCallbackInvoke) registry.resolveService(new ServiceKey("", v0.b(SafeCallbackInvoke.class))), (Logger) registry.resolveService(new ServiceKey("", v0.b(Logger.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new Function0<GetAdPlayer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.187
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetAdPlayer invoke() {
                        return new CommonGetAdPlayer((DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), (CoroutineScope) registry.resolveService(new ServiceKey("", v0.b(AdPlayerScope.class))), (OpenMeasurementRepository) registry.resolveService(new ServiceKey("", v0.b(OpenMeasurementRepository.class))), (ScarManager) registry.resolveService(new ServiceKey("", v0.b(ScarManager.class))), (OfferwallManager) registry.resolveService(new ServiceKey("", v0.b(OfferwallManager.class))), (AdRepository) registry.resolveService(new ServiceKey("", v0.b(AdRepository.class))), (LifecycleDataSource) registry.resolveService(new ServiceKey("", v0.b(LifecycleDataSource.class))), (OrientationRepository) registry.resolveService(new ServiceKey("", v0.b(OrientationRepository.class))), (Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CacheWebViewAssets.class)), i.a(new Function0<CacheWebViewAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.188
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CacheWebViewAssets invoke() {
                        return new AndroidCacheWebViewAssets((CacheRepository) registry.resolveService(new ServiceKey("", v0.b(CacheRepository.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new Function0<HandleGatewayAdResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.189
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleGatewayAdResponse invoke() {
                        return new AndroidHandleGatewayAdResponse((AdRepository) registry.resolveService(new ServiceKey("", v0.b(AdRepository.class))), (AndroidGetWebViewContainerUseCase) registry.resolveService(new ServiceKey("", v0.b(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) registry.resolveService(new ServiceKey("", v0.b(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) registry.resolveService(new ServiceKey("", v0.b(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) registry.resolveService(new ServiceKey("", v0.b(HandleInvocationsFromAdViewer.class))), (CampaignRepository) registry.resolveService(new ServiceKey("", v0.b(CampaignRepository.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) registry.resolveService(new ServiceKey("", v0.b(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) registry.resolveService(new ServiceKey("", v0.b(GetLatestWebViewConfiguration.class))), (AdPlayerScope) registry.resolveService(new ServiceKey("", v0.b(AdPlayerScope.class))), (GetAdPlayer) registry.resolveService(new ServiceKey("", v0.b(GetAdPlayer.class))), (CacheWebViewAssets) registry.resolveService(new ServiceKey("", v0.b(CacheWebViewAssets.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(new Function0<HandleInvocationsFromAdViewer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.190
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleInvocationsFromAdViewer invoke() {
                        return new HandleInvocationsFromAdViewer();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new Function0<LegacyLoadUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.191
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LegacyLoadUseCase invoke() {
                        return new LegacyLoadUseCase((Load) registry.resolveService(new ServiceKey("", v0.b(Load.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", v0.b(GetInitializationState.class))), (AwaitInitialization) registry.resolveService(new ServiceKey("", v0.b(AwaitInitialization.class))), (SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (AdRepository) registry.resolveService(new ServiceKey("", v0.b(AdRepository.class))), (SafeCallbackInvoke) registry.resolveService(new ServiceKey("", v0.b(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) registry.resolveService(new ServiceKey("", v0.b(CleanUpWhenOpportunityExpires.class))), (Logger) registry.resolveService(new ServiceKey("", v0.b(Logger.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SafeCallbackInvoke.class)), i.a(new Function0<SafeCallbackInvoke>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.192
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SafeCallbackInvoke invoke() {
                        return new CommonSafeCallbackInvoke((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new Function0<InitializeStateNetworkError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.193
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final InitializeStateNetworkError invoke() {
                        return new InitializeStateNetworkError((ISDKDispatchers) registry.resolveService(new ServiceKey("", v0.b(ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new Function0<CoroutineTimer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.194
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CoroutineTimer invoke() {
                        return new CommonCoroutineTimer((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(IEventSender.class)), i.a(new Function0<IEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.195
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IEventSender invoke() {
                        return SharedInstances.INSTANCE.getWebViewEventSender();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(SetGameId.class)), i.a(new Function0<SetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.196
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final SetGameId invoke() {
                        return new CommonSetGameId((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetGameId.class)), i.a(new Function0<GetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.197
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetGameId invoke() {
                        return new CommonGetGameId((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ValidateGameId.class)), i.a(new Function0<ValidateGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.198
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ValidateGameId invoke() {
                        return new CommonValidateGameId((GetGameId) registry.resolveService(new ServiceKey("", v0.b(GetGameId.class))), (SetGameId) registry.resolveService(new ServiceKey("", v0.b(SetGameId.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(ShouldAllowInitialization.class)), i.a(new Function0<ShouldAllowInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.199
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ShouldAllowInitialization invoke() {
                        return new CommonShouldAllowInitialization((AlternativeFlowReader) registry.resolveService(new ServiceKey("", v0.b(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) registry.resolveService(new ServiceKey("", v0.b(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) registry.resolveService(new ServiceKey("", v0.b(GetInitializationState.class))), (SetInitializationState) registry.resolveService(new ServiceKey("", v0.b(SetInitializationState.class))), (ValidateGameId) registry.resolveService(new ServiceKey("", v0.b(ValidateGameId.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CheckForGameIdAndTestModeChanges.class)), i.a(new Function0<CheckForGameIdAndTestModeChanges>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.200
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CheckForGameIdAndTestModeChanges invoke() {
                        return new CommonCheckForGameIdAndTestModeChanges((GetGameId) registry.resolveService(new ServiceKey("", v0.b(GetGameId.class))), (SendDiagnosticEvent) registry.resolveService(new ServiceKey("", v0.b(SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(DownloadPriorityQueue.class)), i.a(new Function0<DownloadPriorityQueue>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.201
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DownloadPriorityQueue invoke() {
                        return new DownloadPriorityQueue();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CleanupDirectory.class)), i.a(new Function0<CleanupDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.202
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CleanupDirectory invoke() {
                        return new CleanupDirectory();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(FocusRepository.class)), i.a(new Function0<FocusRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.203
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final FocusRepository invoke() {
                        return new FocusRepository((AndroidGetLifecycleFlow) registry.resolveService(new ServiceKey("", v0.b(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidGetIsAdActivity.class)), i.a(new Function0<AndroidGetIsAdActivity>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.204
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidGetIsAdActivity invoke() {
                        return new AndroidGetIsAdActivity((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidGetLifecycleFlow.class)), i.a(new Function0<AndroidGetLifecycleFlow>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.205
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidGetLifecycleFlow invoke() {
                        return new AndroidGetLifecycleFlow((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidHandleFocusCounters.class)), i.a(new Function0<AndroidHandleFocusCounters>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.206
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidHandleFocusCounters invoke() {
                        return new AndroidHandleFocusCounters((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (FocusRepository) registry.resolveService(new ServiceKey("", v0.b(FocusRepository.class))), (AndroidGetIsAdActivity) registry.resolveService(new ServiceKey("", v0.b(AndroidGetIsAdActivity.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))), null, 16, null);
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OfferwallAdapterBridge.class)), i.a(new Function0<OfferwallAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.207
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OfferwallAdapterBridge invoke() {
                        return new OfferwallAdapterBridge((CoroutineScope) registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, v0.b(CoroutineScope.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OfferwallManager.class)), i.a(new Function0<OfferwallManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.208
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OfferwallManager invoke() {
                        return new AndroidOfferwallManager((OfferwallAdapterBridge) registry.resolveService(new ServiceKey("", v0.b(OfferwallAdapterBridge.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(LoadOfferwallAd.class)), i.a(new Function0<LoadOfferwallAd>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.209
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LoadOfferwallAd invoke() {
                        return new LoadOfferwallAd((OfferwallManager) registry.resolveService(new ServiceKey("", v0.b(OfferwallManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetIsOfferwallAdReady.class)), i.a(new Function0<GetIsOfferwallAdReady>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.210
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetIsOfferwallAdReady invoke() {
                        return new GetIsOfferwallAdReady((OfferwallManager) registry.resolveService(new ServiceKey("", v0.b(OfferwallManager.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(FIdDataSource.class)), i.a(new Function0<FIdDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.211
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final FIdDataSource invoke() {
                        return new AndroidFIdDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(FIdExistenceDataSource.class)), i.a(new Function0<FIdExistenceDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.212
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final FIdExistenceDataSource invoke() {
                        return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(CleanUpWhenOpportunityExpires.class)), i.a(new Function0<CleanUpWhenOpportunityExpires>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.213
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final CleanUpWhenOpportunityExpires invoke() {
                        return new CleanUpWhenOpportunityExpires((CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(OrientationRepository.class)), i.a(new Function0<OrientationRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.214
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OrientationRepository invoke() {
                        return new OrientationRepository((AndroidGetLifecycleFlow) registry.resolveService(new ServiceKey("", v0.b(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, v0.b(CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidAppSetIdDataSource.class)), i.a(new Function0<AndroidAppSetIdDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.215
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidAppSetIdDataSource invoke() {
                        return new AndroidAppSetIdDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(AndroidUnityInfoDataSource.class)), i.a(new Function0<AndroidUnityInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.216
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AndroidUnityInfoDataSource invoke() {
                        return new AndroidUnityInfoDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(HandleDebugSettings.class)), i.a(new Function0<HandleDebugSettings>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.217
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HandleDebugSettings invoke() {
                        return new HandleDebugSettings((Logger) registry.resolveService(new ServiceKey("", v0.b(Logger.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(Logger.class)), i.a(new Function0<Logger>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.218
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Logger invoke() {
                        return new UnityLogger((SessionRepository) registry.resolveService(new ServiceKey("", v0.b(SessionRepository.class))), (CreateFile) registry.resolveService(new ServiceKey("", v0.b(CreateFile.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(IsBillingClientAvailable.class)), i.a(new Function0<IsBillingClientAvailable>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.219
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IsBillingClientAvailable invoke() {
                        return new IsBillingClientAvailable();
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(UnityBootConfigDataSource.class)), i.a(new Function0<UnityBootConfigDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.220
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final UnityBootConfigDataSource invoke() {
                        return new AndroidUnityBootConfigDataSource((Context) registry.resolveService(new ServiceKey("", v0.b(Context.class))));
                    }
                }));
                registry.updateService(new ServiceKey("", v0.b(GetSafeguardedInitializationPolicy.class)), i.a(new Function0<GetSafeguardedInitializationPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.221
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GetSafeguardedInitializationPolicy invoke() {
                        return new AndroidGetSafeguardedInitializationPolicy();
                    }
                }));
            }
        });
    }
}
