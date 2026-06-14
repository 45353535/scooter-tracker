package com.google.firebase.sessions.settings;

import androidx.annotation.VisibleForTesting;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0001\u0018\u0000 22\u00020\u0001:\u00013B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Lcom/google/firebase/sessions/settings/SettingsCache;)V", "", "s", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "clearCachedSettings", "Lcom/google/firebase/sessions/TimeProvider;", "b", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/google/firebase/sessions/ApplicationInfo;", "d", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lkotlinx/coroutines/sync/Mutex;", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlinx/coroutines/sync/Mutex;", "fetchInProgress", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/b;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/b;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "g", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteSettings implements SettingsProvider {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Companion f33449g = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f33450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Regex f33451i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FirebaseInstallationsApi firebaseInstallationsApi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ApplicationInfo appInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CrashlyticsSettingsFetcher configsFetcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SettingsCache settingsCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Mutex fetchInProgress;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "<init>", "()V", "defaultCacheDuration", "", "getDefaultCacheDuration", "()I", "sanitizeRegex", "Lkotlin/text/Regex;", "getSanitizeRegex", "()Lkotlin/text/Regex;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultCacheDuration() {
            return RemoteSettings.f33450h;
        }

        @NotNull
        public final Regex getSanitizeRegex() {
            return RemoteSettings.f33451i;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
    static final class AnonymousClass1 extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f33458r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f33459s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f33460t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f33462v;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33460t = obj;
            this.f33462v |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    static {
        b.a aVar = b.f93560c;
        f33450h = (int) b.s(c.s(24, cg.b.f6841h));
        f33451i = new Regex("/");
    }

    public RemoteSettings(@NotNull TimeProvider timeProvider, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo appInfo, @NotNull CrashlyticsSettingsFetcher configsFetcher, @NotNull SettingsCache settingsCache) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(settingsCache, "settingsCache");
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = f.b(false, 1, null);
    }

    private final String a(String s10) {
        return f33451i.replace(s10, "");
    }

    @VisibleForTesting
    @Nullable
    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(@NotNull Continuation continuation) {
        Object objUpdateConfigs = this.settingsCache.updateConfigs(SessionConfigsSerializer.INSTANCE.getDefaultValue(), continuation);
        return objUpdateConfigs == pf.b.g() ? objUpdateConfigs : Unit.f93236a;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public b mo4498getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        b.a aVar = b.f93560c;
        return b.g(c.s(numSessionRestartTimeout.intValue(), cg.b.f6839f));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00af, B:46:0x00bd, B:49:0x00c8, B:36:0x008a, B:38:0x0092, B:41:0x009d), top: B:58:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00af, B:46:0x00bd, B:49:0x00c8, B:36:0x008a, B:38:0x0092, B:41:0x009d), top: B:58:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.updateSettings(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
