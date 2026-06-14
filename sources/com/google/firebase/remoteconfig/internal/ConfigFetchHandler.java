package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigFetchHandler {
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int[] f33036j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseInstallationsApi f33037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f33039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Clock f33040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f33041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConfigCacheClient f33042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f33043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConfigSharedPrefsClient f33044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f33045i;

    public static class FetchResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Date f33046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f33047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ConfigContainer f33048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f33049d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(Date date, int i10, ConfigContainer configContainer, String str) {
            this.f33046a = date;
            this.f33047b = i10;
            this.f33048c = configContainer;
            this.f33049d = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        String a() {
            return this.f33049d;
        }

        int b() {
            return this.f33047b;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.f33048c;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33051b;

        FetchType(String str) {
            this.f33051b = str;
        }

        String g() {
            return this.f33051b;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, Map<String, String> map) {
        this.f33037a = firebaseInstallationsApi;
        this.f33038b = provider;
        this.f33039c = executor;
        this.f33040d = clock;
        this.f33041e = random;
        this.f33042f = configCacheClient;
        this.f33043g = configFetchHttpClient;
        this.f33044h = configSharedPrefsClient;
        this.f33045i = map;
    }

    public static /* synthetic */ Task a(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date, Map map, Task task3) {
        configFetchHandler.getClass();
        return !task.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException())) : !task2.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : configFetchHandler.j((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date, map);
    }

    public static /* synthetic */ Task c(ConfigFetchHandler configFetchHandler, Date date, Task task) {
        configFetchHandler.t(task, date);
        return task;
    }

    private boolean f(long j10, Date date) {
        Date dateC = this.f33044h.c();
        if (dateC.equals(ConfigSharedPrefsClient.f33101f)) {
            return false;
        }
        return date.before(new Date(dateC.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (httpStatusCode == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (httpStatusCode != 500) {
                switch (httpStatusCode) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private FetchResponse i(String str, String str2, Date date, Map map) throws FirebaseRemoteConfigException {
        Date date2;
        try {
            date2 = date;
        } catch (FirebaseRemoteConfigServerException e10) {
            e = e10;
            date2 = date;
        }
        try {
            FetchResponse fetchResponseFetch = this.f33043g.fetch(this.f33043g.d(), str, str2, o(), this.f33044h.b(), map, m(), date2, this.f33044h.getCustomSignals());
            if (fetchResponseFetch.getFetchedConfigs() != null) {
                this.f33044h.i(fetchResponseFetch.getFetchedConfigs().getTemplateVersionNumber());
            }
            if (fetchResponseFetch.a() != null) {
                this.f33044h.h(fetchResponseFetch.a());
            }
            this.f33044h.e();
            return fetchResponseFetch;
        } catch (FirebaseRemoteConfigServerException e11) {
            e = e11;
            FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
            ConfigSharedPrefsClient.BackoffMetadata backoffMetadataR = r(firebaseRemoteConfigServerException.getHttpStatusCode(), date2);
            if (q(backoffMetadataR, firebaseRemoteConfigServerException.getHttpStatusCode())) {
                throw new FirebaseRemoteConfigFetchThrottledException(backoffMetadataR.a().getTime());
            }
            throw g(firebaseRemoteConfigServerException);
        }
    }

    private Task j(String str, String str2, Date date, Map map) {
        try {
            final FetchResponse fetchResponseI = i(str, str2, date, map);
            return fetchResponseI.b() != 0 ? Tasks.forResult(fetchResponseI) : this.f33042f.put(fetchResponseI.getFetchedConfigs()).onSuccessTask(this.f33039c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(fetchResponseI);
                }
            });
        } catch (FirebaseRemoteConfigException e10) {
            return Tasks.forException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task k(Task task, long j10, final Map map) {
        final ConfigFetchHandler configFetchHandler;
        Task taskContinueWithTask;
        final Date date = new Date(this.f33040d.currentTimeMillis());
        if (task.isSuccessful() && f(j10, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date dateL = l(date);
        if (dateL != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(h(dateL.getTime() - date.getTime()), dateL.getTime()));
            configFetchHandler = this;
        } else {
            final Task<String> id2 = this.f33037a.getId();
            final Task<InstallationTokenResult> token = this.f33037a.getToken(false);
            configFetchHandler = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, token}).continueWithTask(this.f33039c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return ConfigFetchHandler.a(this.f33141a, id2, token, date, map, task2);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(configFetchHandler.f33039c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return ConfigFetchHandler.c(this.f33146a, date, task2);
            }
        });
    }

    private Date l(Date date) {
        Date dateA = this.f33044h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private Long m() {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f33038b.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.getUserProperties(true).get("_fot");
    }

    private long n(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f33036j;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f33041e.nextInt((int) millis));
    }

    private Map o() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f33038b.get();
        if (analyticsConnector != null) {
            for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean p(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private boolean q(ConfigSharedPrefsClient.BackoffMetadata backoffMetadata, int i10) {
        return backoffMetadata.b() > 1 || i10 == 429;
    }

    private ConfigSharedPrefsClient.BackoffMetadata r(int i10, Date date) {
        if (p(i10)) {
            s(date);
        }
        return this.f33044h.a();
    }

    private void s(Date date) {
        int iB = this.f33044h.a().b() + 1;
        this.f33044h.g(iB, new Date(date.getTime() + n(iB)));
    }

    private void t(Task task, Date date) {
        if (task.isSuccessful()) {
            this.f33044h.l(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f33044h.m();
        } else {
            this.f33044h.k();
        }
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.f33044h.getMinimumFetchIntervalInSeconds());
    }

    public Task<FetchResponse> fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i10) {
        final HashMap map = new HashMap(this.f33045i);
        map.put("X-Firebase-RC-Fetch-Type", fetchType.g() + "/" + i10);
        return this.f33042f.get().continueWithTask(this.f33039c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f33139a.k(task, 0L, map);
            }
        });
    }

    @VisibleForTesting
    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.f33038b;
    }

    public long getTemplateVersionNumber() {
        return this.f33044h.d();
    }

    public Task<FetchResponse> fetch(final long j10) {
        final HashMap map = new HashMap(this.f33045i);
        map.put("X-Firebase-RC-Fetch-Type", FetchType.BASE.g() + "/1");
        return this.f33042f.get().continueWithTask(this.f33039c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f33136a.k(task, j10, map);
            }
        });
    }
}
