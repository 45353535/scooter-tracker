package io.sentry;

import com.unity3d.services.core.di.ServiceProvider;
import io.sentry.b7;
import io.sentry.util.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes3.dex */
public class v7 {
    static final g7 DEFAULT_DIAGNOSTIC_LEVEL = g7.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @ApiStatus.Internal
    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @ApiStatus.Experimental
    @NotNull
    private io.sentry.backpressure.b backpressureMonitor;

    @Nullable
    private a beforeBreadcrumb;

    @Nullable
    private b beforeEnvelopeCallback;

    @Nullable
    private c beforeSend;

    @Nullable
    private c beforeSendFeedback;

    @Nullable
    private d beforeSendReplay;

    @Nullable
    private e beforeSendTransaction;

    @NotNull
    private final Set<String> bundleIds;

    @Nullable
    private String cacheDirPath;

    @ApiStatus.Experimental
    private boolean captureOpenTelemetryEvents;

    @NotNull
    io.sentry.clientreport.h clientReportRecorder;

    @NotNull
    private io.sentry.i compositePerformanceCollector;

    @NotNull
    private n0 connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @NotNull
    private o0 continuousProfiler;

    @ApiStatus.Experimental
    @Nullable
    private f cron;

    @ApiStatus.Internal
    @NotNull
    private final io.sentry.util.q dateProvider;
    private long deadlineTimeout;
    private boolean debug;

    @NotNull
    private io.sentry.internal.debugmeta.a debugMetaLoader;

    @NotNull
    private l4 defaultScopeType;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private g7 diagnosticLevel;

    @Nullable
    private String dist;

    @Nullable
    private String distinctId;

    @NotNull
    private g distribution;

    @NotNull
    private p0 distributionController;

    @Nullable
    private String dsn;

    @Nullable
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;

    @ApiStatus.Experimental
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;

    @NotNull
    private io.sentry.cache.g envelopeDiskCache;

    @NotNull
    private final io.sentry.util.q envelopeReader;

    @Nullable
    private String environment;

    @NotNull
    private final List<d0> eventProcessors;

    @NotNull
    private f1 executorService;

    @NotNull
    private final e0 experimental;

    @ApiStatus.Experimental
    @NotNull
    private ILogger fatalLogger;

    @NotNull
    private b7 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;

    @NotNull
    private h0 fullyDisplayedReporter;

    @NotNull
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;

    @Nullable
    private Boolean globalHubMode;

    @Nullable
    private Long idleTimeout;

    @ApiStatus.Experimental
    @Nullable
    private List<g0> ignoredCheckIns;

    @Nullable
    private List<g0> ignoredErrors;

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;

    @ApiStatus.Experimental
    @Nullable
    private List<g0> ignoredSpanOrigins;

    @Nullable
    private List<g0> ignoredTransactions;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private p1 initPriority;

    @NotNull
    private q1 instrumenter;

    @NotNull
    private final List<r1> integrations;

    @Nullable
    private volatile c9 internalTracesSampler;

    @NotNull
    protected final io.sentry.util.a lock;

    @NotNull
    private ILogger logger;

    @NotNull
    private h logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;

    @NotNull
    private l maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;

    @NotNull
    private io.sentry.internal.modules.b modulesLoader;

    @NotNull
    private final List<z0> observers;

    @Nullable
    private i onDiscard;

    @NotNull
    private p7 openTelemetryMode;

    @NotNull
    private final List<t0> optionsObservers;

    @NotNull
    private final io.sentry.util.q parsedDsn;

    @NotNull
    private final List<u0> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @NotNull
    private w3 profileLifecycle;

    @Nullable
    private Double profileSessionSampleRate;

    @NotNull
    private x0 profilerConverter;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private j profilesSampler;

    @Nullable
    private String profilingTracesDirPath;
    private int profilingTracesHz;

    @Nullable
    private String proguardUuid;
    private boolean propagateTraceparent;

    @Nullable
    private k proxy;
    private int readTimeoutMillis;

    @Nullable
    private String release;

    @NotNull
    private c4 replayController;

    @NotNull
    private io.sentry.util.runtime.a runtimeManager;

    @Nullable
    private Double sampleRate;

    @Nullable
    private io.sentry.protocol.r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;

    @Nullable
    private String sentryClientName;

    @NotNull
    private final io.sentry.util.q serializer;

    @Nullable
    private String serverName;
    private long sessionFlushTimeoutMillis;

    @NotNull
    private x7 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;

    @NotNull
    private i1 socketTagger;

    @NotNull
    private k1 spanFactory;

    @Nullable
    private String spotlightConnectionUrl;

    @Nullable
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;

    @NotNull
    private final Map<String, String> tags;

    @NotNull
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;

    @Nullable
    private List<String> tracePropagationTargets;
    private boolean traceSampling;

    @Nullable
    private Double tracesSampleRate;

    @Nullable
    private m tracesSampler;

    @NotNull
    private m1 transactionProfiler;

    @NotNull
    private n1 transportFactory;

    @NotNull
    private io.sentry.transport.s transportGate;

    @NotNull
    private o1 versionDetector;

    @NotNull
    private final List<Object> viewHierarchyExporters;

    public interface a {
        io.sentry.e a(io.sentry.e eVar, i0 i0Var);
    }

    public interface b {
        void d(u5 u5Var, i0 i0Var);
    }

    public interface c {
        w6 a(w6 w6Var, i0 i0Var);
    }

    public interface d {
    }

    public interface e {
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f84349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f84350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f84351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f84352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f84353e;

        public Long a() {
            return this.f84349a;
        }

        public Long b() {
            return this.f84352d;
        }

        public Long c() {
            return this.f84350b;
        }

        public Long d() {
            return this.f84353e;
        }

        public String e() {
            return this.f84351c;
        }

        public void f(Long l10) {
            this.f84349a = l10;
        }

        public void g(Long l10) {
            this.f84352d = l10;
        }

        public void h(Long l10) {
            this.f84350b = l10;
        }

        public void i(Long l10) {
            this.f84353e = l10;
        }

        public void j(String str) {
            this.f84351c = str;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f84354a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f84355b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f84356c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f84357d = "https://sentry.io";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f84358e = null;
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f84359a = false;

        public boolean a() {
            return this.f84359a;
        }

        public void b(boolean z10) {
            this.f84359a = z10;
        }
    }

    public interface i {
    }

    public interface j {
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f84360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f84361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f84362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f84363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Proxy.Type f84364e;

        public k(String str, String str2, String str3, String str4) {
            this(str, str2, null, str3, str4);
        }

        public String a() {
            return this.f84360a;
        }

        public String b() {
            return this.f84363d;
        }

        public String c() {
            return this.f84361b;
        }

        public Proxy.Type d() {
            return this.f84364e;
        }

        public String e() {
            return this.f84362c;
        }

        public k(String str, String str2, Proxy.Type type, String str3, String str4) {
            this.f84360a = str;
            this.f84361b = str2;
            this.f84364e = type;
            this.f84362c = str3;
            this.f84363d = str4;
        }
    }

    public enum l {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface m {
    }

    public v7() {
        this(false);
    }

    public static /* synthetic */ t5 a() {
        return new m5();
    }

    public static /* synthetic */ v b(v7 v7Var) {
        return new v(v7Var.dsn);
    }

    public static /* synthetic */ q0 c(v7 v7Var) {
        v7Var.getClass();
        return new x((h1) v7Var.serializer.a());
    }

    private io.sentry.protocol.r createSdkVersion() {
        io.sentry.protocol.r rVar = new io.sentry.protocol.r("sentry.java", "8.26.0");
        rVar.j("8.26.0");
        return rVar;
    }

    public static /* synthetic */ h1 d(v7 v7Var) {
        v7Var.getClass();
        return new e2(v7Var);
    }

    private void e() {
        e7.d().b("maven:io.sentry:sentry", "8.26.0");
    }

    @ApiStatus.Internal
    @NotNull
    public static v7 empty() {
        return new v7(true);
    }

    public void addBundleId(@Nullable String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(@NotNull String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(@NotNull d0 d0Var) {
        this.eventProcessors.add(d0Var);
    }

    @ApiStatus.Experimental
    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new g0(str));
    }

    public void addIgnoredError(@NotNull String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new g0(str));
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    @ApiStatus.Experimental
    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new g0(str));
    }

    @ApiStatus.Experimental
    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new g0(str));
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull r1 r1Var) {
        this.integrations.add(r1Var);
    }

    public void addOptionsObserver(@NotNull t0 t0Var) {
        this.optionsObservers.add(t0Var);
    }

    @ApiStatus.Internal
    public void addPerformanceCollector(@NotNull u0 u0Var) {
        this.performanceCollectors.add(u0Var);
    }

    public void addScopeObserver(@NotNull z0 z0Var) {
        this.observers.add(z0Var);
    }

    boolean containsIgnoredExceptionForType(@NotNull Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    @ApiStatus.Internal
    @Nullable
    public io.sentry.cache.q findPersistingScopeObserver() {
        for (z0 z0Var : this.observers) {
            if (z0Var instanceof io.sentry.cache.q) {
                return (io.sentry.cache.q) z0Var;
            }
        }
        return null;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    @Nullable
    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    @ApiStatus.Internal
    @Nullable
    public b getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    @Nullable
    public c getBeforeSend() {
        return this.beforeSend;
    }

    @Nullable
    public c getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    @Nullable
    public d getBeforeSendReplay() {
        return null;
    }

    @Nullable
    public e getBeforeSendTransaction() {
        return null;
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    @Nullable
    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @Nullable
    String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.i getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    @NotNull
    public n0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    @NotNull
    public List<String> getContextTags() {
        return this.contextTags;
    }

    @NotNull
    public o0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    @Nullable
    public f getCron() {
        return this.cron;
    }

    @ApiStatus.Internal
    @NotNull
    public t5 getDateProvider() {
        return (t5) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public l4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    @NotNull
    public g7 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @Nullable
    public String getDistinctId() {
        return this.distinctId;
    }

    @ApiStatus.Experimental
    @NotNull
    public g getDistribution() {
        return this.distribution;
    }

    @ApiStatus.Experimental
    @NotNull
    public p0 getDistributionController() {
        return this.distributionController;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @NotNull
    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public q0 getEnvelopeReader() {
        return (q0) this.envelopeReader.a();
    }

    @Nullable
    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : "production";
    }

    @NotNull
    public List<d0> getEventProcessors() {
        return this.eventProcessors;
    }

    @ApiStatus.Internal
    @NotNull
    public f1 getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public e0 getExperimental() {
        return this.experimental;
    }

    @ApiStatus.Experimental
    @NotNull
    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    @NotNull
    public b7 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @ApiStatus.Internal
    @NotNull
    public h0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @ApiStatus.Experimental
    @Nullable
    public List<g0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @Nullable
    public List<g0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @ApiStatus.Experimental
    @Nullable
    public List<g0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    @Nullable
    public List<g0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    @NotNull
    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    @NotNull
    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    @ApiStatus.Internal
    @NotNull
    public p1 getInitPriority() {
        return this.initPriority;
    }

    @NotNull
    public q1 getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<r1> getIntegrations() {
        return this.integrations;
    }

    @ApiStatus.Internal
    @NotNull
    public c9 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            g1 g1VarD = this.lock.d();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new c9(this);
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.internalTracesSampler;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

    @ApiStatus.Experimental
    @NotNull
    public h getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    @NotNull
    public l getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @ApiStatus.Experimental
    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    @Nullable
    public i getOnDiscard() {
        return null;
    }

    @NotNull
    public p7 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    @NotNull
    public List<t0> getOptionsObservers() {
        return this.optionsObservers;
    }

    @Nullable
    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @ApiStatus.Internal
    @NotNull
    public List<u0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @NotNull
    public w3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    @Nullable
    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @NotNull
    public x0 getProfilerConverter() {
        return this.profilerConverter;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public j getProfilesSampler() {
        return null;
    }

    @Nullable
    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    @ApiStatus.Internal
    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public k getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @NotNull
    public c4 getReplayController() {
        return this.replayController;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.util.runtime.a getRuntimeManager() {
        return this.runtimeManager;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<z0> getScopeObservers() {
        return this.observers;
    }

    @Nullable
    public io.sentry.protocol.r getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public h1 getSerializer() {
        return (h1) this.serializer.a();
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    @ApiStatus.Internal
    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @NotNull
    public x7 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @NotNull
    public i1 getSocketTagger() {
        return this.socketTagger;
    }

    @ApiStatus.Internal
    @NotNull
    public k1 getSpanFactory() {
        return this.spanFactory;
    }

    @ApiStatus.Experimental
    @Nullable
    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @NotNull
    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    @NotNull
    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    @Nullable
    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    @Nullable
    public m getTracesSampler() {
        return null;
    }

    @NotNull
    public m1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public n1 getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public io.sentry.transport.s getTransportGate() {
        return this.transportGate;
    }

    @ApiStatus.Internal
    @NotNull
    public o1 getVersionDetector() {
        return this.versionDetector;
    }

    @NotNull
    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    @ApiStatus.Experimental
    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    @ApiStatus.Internal
    public boolean isContinuousProfilingEnabled() {
        Double d10;
        return this.profilesSampleRate == null && (d10 = this.profileSessionSampleRate) != null && d10.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    @ApiStatus.Experimental
    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    @ApiStatus.Experimental
    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    @ApiStatus.Experimental
    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    @Nullable
    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d10 = this.profilesSampleRate;
        return d10 != null && d10.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    @ApiStatus.Experimental
    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(@NotNull f0 f0Var) {
        if (f0Var.m() != null) {
            setDsn(f0Var.m());
        }
        if (f0Var.p() != null) {
            setEnvironment(f0Var.p());
        }
        if (f0Var.F() != null) {
            setRelease(f0Var.F());
        }
        if (f0Var.l() != null) {
            setDist(f0Var.l());
        }
        if (f0Var.H() != null) {
            setServerName(f0Var.H());
        }
        if (f0Var.E() != null) {
            setProxy(f0Var.E());
        }
        if (f0Var.o() != null) {
            setEnableUncaughtExceptionHandler(f0Var.o().booleanValue());
        }
        if (f0Var.y() != null) {
            setPrintUncaughtStackTrace(f0Var.y().booleanValue());
        }
        if (f0Var.L() != null) {
            setTracesSampleRate(f0Var.L());
        }
        if (f0Var.B() != null) {
            setProfilesSampleRate(f0Var.B());
        }
        if (f0Var.k() != null) {
            setDebug(f0Var.k().booleanValue());
        }
        if (f0Var.n() != null) {
            setEnableDeduplication(f0Var.n().booleanValue());
        }
        if (f0Var.G() != null) {
            setSendClientReports(f0Var.G().booleanValue());
        }
        if (f0Var.S() != null) {
            setForceInit(f0Var.S().booleanValue());
        }
        for (Map.Entry entry : new HashMap(f0Var.J()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(f0Var.w()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(f0Var.v()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(f0Var.t()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (f0Var.K() != null) {
            setTracePropagationTargets(new ArrayList(f0Var.K()));
        }
        Iterator it4 = new ArrayList(f0Var.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (f0Var.D() != null) {
            setProguardUuid(f0Var.D());
        }
        if (f0Var.q() != null) {
            setIdleTimeout(f0Var.q());
        }
        Iterator it5 = f0Var.h().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (f0Var.R() != null) {
            setEnabled(f0Var.R().booleanValue());
        }
        if (f0Var.P() != null) {
            setEnablePrettySerializationOutput(f0Var.P().booleanValue());
        }
        if (f0Var.V() != null) {
            setSendModules(f0Var.V().booleanValue());
        }
        if (f0Var.r() != null) {
            setIgnoredCheckIns(new ArrayList(f0Var.r()));
        }
        if (f0Var.u() != null) {
            setIgnoredTransactions(new ArrayList(f0Var.u()));
        }
        if (f0Var.s() != null) {
            setIgnoredErrors(new ArrayList(f0Var.s()));
        }
        if (f0Var.N() != null) {
            setEnableBackpressureHandling(f0Var.N().booleanValue());
        }
        if (f0Var.x() != null) {
            setMaxRequestBodySize(f0Var.x());
        }
        if (f0Var.U() != null) {
            setSendDefaultPii(f0Var.U().booleanValue());
        }
        if (f0Var.M() != null) {
            setCaptureOpenTelemetryEvents(f0Var.M().booleanValue());
        }
        if (f0Var.Q() != null) {
            setEnableSpotlight(f0Var.Q().booleanValue());
        }
        if (f0Var.I() != null) {
            setSpotlightConnectionUrl(f0Var.I());
        }
        if (f0Var.T() != null) {
            setGlobalHubMode(f0Var.T());
        }
        if (f0Var.j() != null) {
            if (getCron() == null) {
                setCron(f0Var.j());
            } else {
                if (f0Var.j().a() != null) {
                    getCron().f(f0Var.j().a());
                }
                if (f0Var.j().c() != null) {
                    getCron().h(f0Var.j().c());
                }
                if (f0Var.j().e() != null) {
                    getCron().j(f0Var.j().e());
                }
                if (f0Var.j().b() != null) {
                    getCron().g(f0Var.j().b());
                }
                if (f0Var.j().d() != null) {
                    getCron().i(f0Var.j().d());
                }
            }
        }
        if (f0Var.O() != null) {
            getLogs().b(f0Var.O().booleanValue());
        }
        if (f0Var.A() != null) {
            setProfileSessionSampleRate(f0Var.A());
        }
        if (f0Var.C() != null) {
            setProfilingTracesDirPath(f0Var.C());
        }
        if (f0Var.z() != null) {
            setProfileLifecycle(f0Var.z());
        }
    }

    @ApiStatus.Internal
    @NotNull
    v retrieveParsedDsn() throws IllegalArgumentException {
        return (v) this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    @ApiStatus.Internal
    public void setBackpressureMonitor(@NotNull io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(@Nullable a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    @ApiStatus.Internal
    public void setBeforeEnvelopeCallback(@Nullable b bVar) {
        this.beforeEnvelopeCallback = bVar;
    }

    public void setBeforeSend(@Nullable c cVar) {
        this.beforeSend = cVar;
    }

    public void setBeforeSendFeedback(@Nullable c cVar) {
        this.beforeSendFeedback = cVar;
    }

    public void setBeforeSendReplay(@Nullable d dVar) {
    }

    public void setBeforeSendTransaction(@Nullable e eVar) {
    }

    public void setCacheDirPath(@Nullable String str) {
        this.cacheDirPath = str;
    }

    @ApiStatus.Experimental
    public void setCaptureOpenTelemetryEvents(boolean z10) {
        this.captureOpenTelemetryEvents = z10;
    }

    @ApiStatus.Internal
    public void setCompositePerformanceCollector(@NotNull io.sentry.i iVar) {
        this.compositePerformanceCollector = iVar;
    }

    public void setConnectionStatusProvider(@NotNull n0 n0Var) {
        this.connectionStatusProvider = n0Var;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setContinuousProfiler(@Nullable o0 o0Var) {
        if (this.continuousProfiler != l2.a() || o0Var == null) {
            return;
        }
        this.continuousProfiler = o0Var;
    }

    @ApiStatus.Experimental
    public void setCron(@Nullable f fVar) {
        this.cron = fVar;
    }

    @ApiStatus.Internal
    public void setDateProvider(@NotNull t5 t5Var) {
        this.dateProvider.c(t5Var);
    }

    public void setDeadlineTimeout(long j10) {
        this.deadlineTimeout = j10;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    @ApiStatus.Internal
    public void setDebugMetaLoader(@Nullable io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(@NotNull l4 l4Var) {
        this.defaultScopeType = l4Var;
    }

    public void setDiagnosticLevel(@Nullable g7 g7Var) {
        if (g7Var == null) {
            g7Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = g7Var;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setDistinctId(@Nullable String str) {
        this.distinctId = str;
    }

    @ApiStatus.Experimental
    public void setDistribution(@NotNull g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.distribution = gVar;
    }

    @ApiStatus.Experimental
    public void setDistributionController(@Nullable p0 p0Var) {
        if (p0Var == null) {
            p0Var = m2.a();
        }
        this.distributionController = p0Var;
    }

    public void setDsn(@Nullable String str) {
        this.dsn = str;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.d0.a(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z10) {
        this.enableAppStartProfiling = z10;
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    @ApiStatus.Experimental
    public void setEnableBackpressureHandling(boolean z10) {
        this.enableBackpressureHandling = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnablePrettySerializationOutput(boolean z10) {
        this.enablePrettySerializationOutput = z10;
    }

    public void setEnableScopePersistence(boolean z10) {
        this.enableScopePersistence = z10;
    }

    @ApiStatus.Experimental
    public void setEnableScreenTracking(boolean z10) {
        this.enableScreenTracking = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    @ApiStatus.Experimental
    public void setEnableSpotlight(boolean z10) {
        this.enableSpotlight = z10;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z10) {
        this.enableTimeToFullDisplayTracing = z10;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z10) {
        this.enableUserInteractionBreadcrumbs = z10;
    }

    public void setEnableUserInteractionTracing(boolean z10) {
        this.enableUserInteractionTracing = z10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setEnvelopeDiskCache(@Nullable io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.t.e();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(@Nullable q0 q0Var) {
        io.sentry.util.q qVar = this.envelopeReader;
        if (q0Var == null) {
            q0Var = n2.b();
        }
        qVar.c(q0Var);
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    @TestOnly
    @ApiStatus.Internal
    public void setExecutorService(@NotNull f1 f1Var) {
        if (f1Var != null) {
            this.executorService = f1Var;
        }
    }

    @ApiStatus.Experimental
    public void setFatalLogger(@Nullable ILogger iLogger) {
        if (iLogger == null) {
            iLogger = p2.e();
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(@NotNull b7 b7Var) {
        this.feedbackOptions = b7Var;
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setForceInit(boolean z10) {
        this.forceInit = z10;
    }

    @TestOnly
    @ApiStatus.Internal
    public void setFullyDisplayedReporter(@NotNull h0 h0Var) {
        this.fullyDisplayedReporter = h0Var;
    }

    public void setGestureTargetLocators(@NotNull List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(@Nullable Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(@Nullable Long l10) {
        this.idleTimeout = l10;
    }

    @ApiStatus.Experimental
    public void setIgnoredCheckIns(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new g0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new g0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    @ApiStatus.Experimental
    public void setIgnoredSpanOrigins(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new g0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    @ApiStatus.Experimental
    public void setIgnoredTransactions(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new g0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    @ApiStatus.Internal
    public void setInitPriority(@NotNull p1 p1Var) {
        this.initPriority = p1Var;
    }

    @Deprecated
    public void setInstrumenter(@NotNull q1 q1Var) {
        this.instrumenter = q1Var;
    }

    public void setLogger(@Nullable ILogger iLogger) {
        this.logger = iLogger == null ? p2.e() : new r(this, iLogger);
    }

    @ApiStatus.Experimental
    public void setLogs(@NotNull h hVar) {
        this.logs = hVar;
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxFeatureFlags(int i10) {
        this.maxFeatureFlags = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(@NotNull l lVar) {
        this.maxRequestBodySize = lVar;
    }

    @ApiStatus.Experimental
    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    @ApiStatus.Internal
    public void setModulesLoader(@Nullable io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOnDiscard(@Nullable i iVar) {
    }

    public void setOpenTelemetryMode(@NotNull p7 p7Var) {
        this.openTelemetryMode = p7Var;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfileLifecycle(@NotNull w3 w3Var) {
        this.profileLifecycle = w3Var;
        if (w3Var != w3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.c(g7.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(@Nullable Double d10) {
        if (io.sentry.util.a0.c(d10)) {
            this.profileSessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(@NotNull x0 x0Var) {
        this.profilerConverter = x0Var;
    }

    public void setProfilesSampleRate(@Nullable Double d10) {
        if (io.sentry.util.a0.d(d10)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(@Nullable j jVar) {
    }

    public void setProfilingTracesDirPath(@Nullable String str) {
        this.profilingTracesDirPath = str;
    }

    @ApiStatus.Internal
    public void setProfilingTracesHz(int i10) {
        this.profilingTracesHz = i10;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z10) {
        this.propagateTraceparent = z10;
    }

    public void setProxy(@Nullable k kVar) {
        this.proxy = kVar;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setReplayController(@Nullable c4 c4Var) {
        if (c4Var == null) {
            c4Var = s2.a();
        }
        this.replayController = c4Var;
    }

    @ApiStatus.Internal
    public void setRuntimeManager(@NotNull io.sentry.util.runtime.a aVar) {
        this.runtimeManager = aVar;
    }

    public void setSampleRate(@Nullable Double d10) {
        if (io.sentry.util.a0.f(d10)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    @ApiStatus.Internal
    public void setSdkVersion(@Nullable io.sentry.protocol.r rVar) {
        io.sentry.protocol.r rVarJ = getSessionReplay().j();
        io.sentry.protocol.r rVar2 = this.sdkVersion;
        if (rVar2 != null && rVarJ != null && rVar2.equals(rVarJ)) {
            getSessionReplay().y(rVar);
        }
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSendModules(boolean z10) {
        this.sendModules = z10;
    }

    public void setSentryClientName(@Nullable String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(@Nullable h1 h1Var) {
        io.sentry.util.q qVar = this.serializer;
        if (h1Var == null) {
            h1Var = d3.g();
        }
        qVar.c(h1Var);
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    @ApiStatus.Internal
    public void setSessionFlushTimeoutMillis(long j10) {
        this.sessionFlushTimeoutMillis = j10;
    }

    public void setSessionReplay(@NotNull x7 x7Var) {
        this.sessionReplay = x7Var;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSocketTagger(@Nullable i1 i1Var) {
        if (i1Var == null) {
            i1Var = e3.c();
        }
        this.socketTagger = i1Var;
    }

    @ApiStatus.Internal
    public void setSpanFactory(@NotNull k1 k1Var) {
        this.spanFactory = k1Var;
    }

    @ApiStatus.Experimental
    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z10) {
        this.startProfilerOnAppStart = z10;
    }

    public void setTag(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(@NotNull io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z10) {
        this.traceOptionsRequests = z10;
    }

    public void setTracePropagationTargets(@Nullable List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(@Nullable Double d10) {
        if (io.sentry.util.a0.g(d10)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(@Nullable m mVar) {
    }

    public void setTransactionProfiler(@Nullable m1 m1Var) {
        if (this.transactionProfiler != i3.c() || m1Var == null) {
            return;
        }
        this.transactionProfiler = m1Var;
    }

    public void setTransportFactory(@Nullable n1 n1Var) {
        if (n1Var == null) {
            n1Var = j3.b();
        }
        this.transportFactory = n1Var;
    }

    public void setTransportGate(@Nullable io.sentry.transport.s sVar) {
        if (sVar == null) {
            sVar = io.sentry.transport.v.a();
        }
        this.transportGate = sVar;
    }

    @ApiStatus.Internal
    public void setVersionDetector(@NotNull o1 o1Var) {
        this.versionDetector = o1Var;
    }

    public void setViewHierarchyExporters(@NotNull List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private v7(boolean z10) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.q(new q.a() { // from class: io.sentry.q7
            @Override // io.sentry.util.q.a
            public final Object a() {
                return v7.b(this.f84083a);
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = p2.e();
        this.fatalLogger = p2.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.q(new q.a() { // from class: io.sentry.r7
            @Override // io.sentry.util.q.a
            public final Object a() {
                return v7.d(this.f84098a);
            }
        });
        this.envelopeReader = new io.sentry.util.q(new q.a() { // from class: io.sentry.s7
            @Override // io.sentry.util.q.a
            public final Object a() {
                return v7.c(this.f84179a);
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = j3.b();
        this.transportGate = io.sentry.transport.v.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = c3.e();
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.t.e();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = ServiceProvider.HTTP_CACHE_DISK_SIZE;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = l.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = i3.c();
        this.continuousProfiler = l2.a();
        this.profilerConverter = q2.b();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = q1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.d();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.q(new q.a() { // from class: io.sentry.t7
            @Override // io.sentry.util.q.a
            public final Object a() {
                return v7.a();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = j2.g();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = h0.a();
        this.connectionStatusProvider = new k2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = g3.b();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = s2.a();
        this.distributionController = m2.a();
        this.enableScreenTracking = true;
        this.defaultScopeType = l4.ISOLATION;
        this.initPriority = p1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = p7.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = k3.b();
        this.profileLifecycle = w3.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        this.logs = new h();
        this.socketTagger = e3.c();
        this.runtimeManager = new io.sentry.util.runtime.b();
        this.distribution = new g();
        io.sentry.protocol.r rVarCreateSdkVersion = createSdkVersion();
        this.experimental = new e0(z10, rVarCreateSdkVersion);
        this.sessionReplay = new x7(z10, rVarCreateSdkVersion);
        this.feedbackOptions = new b7(new b7.a() { // from class: io.sentry.u7
        });
        if (z10) {
            return;
        }
        setSpanFactory(q8.a(new io.sentry.util.t(), p2.e()));
        a7 a7Var = new a7(this);
        this.executorService = a7Var;
        a7Var.a();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new f2(this));
        copyOnWriteArrayList.add(new w(this));
        if (io.sentry.util.y.c()) {
            copyOnWriteArrayList.add(new y7());
        }
        setSentryClientName("sentry.java/8.26.0");
        setSdkVersion(rVarCreateSdkVersion);
        e();
    }
}
