package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f32840m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f32841n = new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f32854a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f32854a.getAndIncrement())));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseApp f32842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseInstallationServiceClient f32843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PersistedInstallation f32844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Utils f32845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f32846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RandomFidGenerator f32847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f32848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f32849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f32850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f32852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f32853l;

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f32858b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f32858b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32858b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32858b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f32857a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32857a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    FirebaseInstallations(final FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, Executor executor) {
        this(executorService, executor, firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider), new PersistedInstallation(firebaseApp), Utils.getInstance(), new Lazy(new Provider() { // from class: com.google.firebase.installations.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseInstallations.e(firebaseApp);
            }
        }), new RandomFidGenerator());
    }

    private synchronized void A(String str) {
        this.f32851j = str;
    }

    private synchronized void B(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.f32852k.size() != 0 && !TextUtils.equals(persistedInstallationEntry.getFirebaseInstallationId(), persistedInstallationEntry2.getFirebaseInstallationId())) {
            Iterator it = this.f32852k.iterator();
            while (it.hasNext()) {
                ((FidListener) it.next()).onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
            }
        }
    }

    public static /* synthetic */ IidStore e(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    private Task g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i(new GetAuthTokenListener(this.f32845d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private Task h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i(new GetIdListener(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void i(StateListener stateListener) {
        synchronized (this.f32848g) {
            this.f32853l.add(stateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void j() throws FirebaseInstallationsException {
        A(null);
        PersistedInstallationEntry persistedInstallationEntryR = r();
        if (persistedInstallationEntryR.isRegistered()) {
            this.f32843b.deleteFirebaseInstallation(n(), persistedInstallationEntryR.getFirebaseInstallationId(), t(), persistedInstallationEntryR.getRefreshToken());
        }
        u(persistedInstallationEntryR.withNoGeneratedFid());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z10) {
        PersistedInstallationEntry persistedInstallationEntryX;
        PersistedInstallationEntry persistedInstallationEntryR = r();
        try {
            if (persistedInstallationEntryR.isErrored() || persistedInstallationEntryR.isUnregistered()) {
                persistedInstallationEntryX = x(persistedInstallationEntryR);
            } else {
                if (!z10 && !this.f32845d.isAuthTokenExpired(persistedInstallationEntryR)) {
                    return;
                }
                persistedInstallationEntryX = m(persistedInstallationEntryR);
            }
            u(persistedInstallationEntryX);
            B(persistedInstallationEntryR, persistedInstallationEntryX);
            if (persistedInstallationEntryX.isRegistered()) {
                A(persistedInstallationEntryX.getFirebaseInstallationId());
            }
            if (persistedInstallationEntryX.isErrored()) {
                y(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
            } else if (persistedInstallationEntryX.isNotGenerated()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(persistedInstallationEntryX);
            }
        } catch (FirebaseInstallationsException e10) {
            y(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final boolean z10) {
        PersistedInstallationEntry persistedInstallationEntryS = s();
        if (z10) {
            persistedInstallationEntryS = persistedInstallationEntryS.withClearedAuthToken();
        }
        z(persistedInstallationEntryS);
        this.f32850i.execute(new Runnable() { // from class: com.google.firebase.installations.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f32874b.k(z10);
            }
        });
    }

    private PersistedInstallationEntry m(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult tokenResultGenerateAuthToken = this.f32843b.generateAuthToken(n(), persistedInstallationEntry.getFirebaseInstallationId(), t(), persistedInstallationEntry.getRefreshToken());
        int i10 = AnonymousClass3.f32858b[tokenResultGenerateAuthToken.getResponseCode().ordinal()];
        if (i10 == 1) {
            return persistedInstallationEntry.withAuthToken(tokenResultGenerateAuthToken.getToken(), tokenResultGenerateAuthToken.getTokenExpirationTimestamp(), this.f32845d.currentTimeInSecs());
        }
        if (i10 == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        A(null);
        return persistedInstallationEntry.withNoGeneratedFid();
    }

    private synchronized String p() {
        return this.f32851j;
    }

    private IidStore q() {
        return (IidStore) this.f32846e.get();
    }

    /* JADX WARN: Finally extract failed */
    private PersistedInstallationEntry r() {
        PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (f32840m) {
            try {
                CrossProcessLock crossProcessLockA = CrossProcessLock.a(this.f32842a.getApplicationContext(), "generatefid.lock");
                try {
                    persistedInstallationEntryValue = this.f32844c.readPersistedInstallationEntryValue();
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                } catch (Throwable th2) {
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private PersistedInstallationEntry s() {
        PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (f32840m) {
            try {
                CrossProcessLock crossProcessLockA = CrossProcessLock.a(this.f32842a.getApplicationContext(), "generatefid.lock");
                try {
                    persistedInstallationEntryValue = this.f32844c.readPersistedInstallationEntryValue();
                    if (persistedInstallationEntryValue.isNotGenerated()) {
                        persistedInstallationEntryValue = this.f32844c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(w(persistedInstallationEntryValue)));
                    }
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                } catch (Throwable th2) {
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private void u(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (f32840m) {
            try {
                CrossProcessLock crossProcessLockA = CrossProcessLock.a(this.f32842a.getApplicationContext(), "generatefid.lock");
                try {
                    this.f32844c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                } catch (Throwable th2) {
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void v() {
        Preconditions.checkNotEmpty(o(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(n(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Utils.b(o()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Utils.a(n()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String w(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.f32842a.getName().equals("CHIME_ANDROID_SDK") && !this.f32842a.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.f32847f.createRandomFid();
        }
        String iid = q().readIid();
        return TextUtils.isEmpty(iid) ? this.f32847f.createRandomFid() : iid;
    }

    private PersistedInstallationEntry x(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        InstallationResponse installationResponseCreateFirebaseInstallation = this.f32843b.createFirebaseInstallation(n(), persistedInstallationEntry.getFirebaseInstallationId(), t(), o(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : q().readToken());
        int i10 = AnonymousClass3.f32857a[installationResponseCreateFirebaseInstallation.getResponseCode().ordinal()];
        if (i10 == 1) {
            return persistedInstallationEntry.withRegisteredFid(installationResponseCreateFirebaseInstallation.getFid(), installationResponseCreateFirebaseInstallation.getRefreshToken(), this.f32845d.currentTimeInSecs(), installationResponseCreateFirebaseInstallation.getAuthToken().getToken(), installationResponseCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i10 == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private void y(Exception exc) {
        synchronized (this.f32848g) {
            try {
                Iterator it = this.f32853l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).onException(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f32848g) {
            try {
                Iterator it = this.f32853l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).onStateReached(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<Void> delete() {
        return Tasks.call(this.f32849h, new Callable() { // from class: com.google.firebase.installations.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f32871b.j();
            }
        });
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<String> getId() {
        v();
        String strP = p();
        if (strP != null) {
            return Tasks.forResult(strP);
        }
        Task<String> taskH = h();
        this.f32849h.execute(new Runnable() { // from class: com.google.firebase.installations.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f32870b.l(false);
            }
        });
        return taskH;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<InstallationTokenResult> getToken(final boolean z10) {
        v();
        Task<InstallationTokenResult> taskG = g();
        this.f32849h.execute(new Runnable() { // from class: com.google.firebase.installations.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f32872b.l(z10);
            }
        });
        return taskG;
    }

    String n() {
        return this.f32842a.getOptions().getApiKey();
    }

    String o() {
        return this.f32842a.getOptions().getApplicationId();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public synchronized FidListenerHandle registerFidListener(@NonNull final FidListener fidListener) {
        this.f32852k.add(fidListener);
        return new FidListenerHandle() { // from class: com.google.firebase.installations.FirebaseInstallations.2
            @Override // com.google.firebase.installations.internal.FidListenerHandle
            public void unregister() {
                synchronized (FirebaseInstallations.this) {
                    FirebaseInstallations.this.f32852k.remove(fidListener);
                }
            }
        };
    }

    String t() {
        return this.f32842a.getOptions().getProjectId();
    }

    @NonNull
    public static FirebaseInstallations getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy lazy, RandomFidGenerator randomFidGenerator) {
        this.f32848g = new Object();
        this.f32852k = new HashSet();
        this.f32853l = new ArrayList();
        this.f32842a = firebaseApp;
        this.f32843b = firebaseInstallationServiceClient;
        this.f32844c = persistedInstallation;
        this.f32845d = utils;
        this.f32846e = lazy;
        this.f32847f = randomFidGenerator;
        this.f32849h = executorService;
        this.f32850i = executor;
    }
}
