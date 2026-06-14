package com.google.firebase.sessions;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.DoubleCheck;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.settings.LocalOverrideSettings_Factory;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher_Factory;
import com.google.firebase.sessions.settings.RemoteSettings_Factory;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SessionsSettings_Factory;
import com.google.firebase.sessions.settings.SettingsCacheImpl_Factory;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@DaggerGenerated
public final class DaggerFirebaseSessionsComponent {

    private static final class Builder implements FirebaseSessionsComponent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f33235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CoroutineContext f33236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CoroutineContext f33237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private FirebaseApp f33238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private FirebaseInstallationsApi f33239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Provider f33240f;

        private Builder() {
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public FirebaseSessionsComponent build() {
            Preconditions.checkBuilderRequirement(this.f33235a, Context.class);
            Preconditions.checkBuilderRequirement(this.f33236b, CoroutineContext.class);
            Preconditions.checkBuilderRequirement(this.f33237c, CoroutineContext.class);
            Preconditions.checkBuilderRequirement(this.f33238d, FirebaseApp.class);
            Preconditions.checkBuilderRequirement(this.f33239e, FirebaseInstallationsApi.class);
            Preconditions.checkBuilderRequirement(this.f33240f, Provider.class);
            return new FirebaseSessionsComponentImpl(this.f33235a, this.f33236b, this.f33237c, this.f33238d, this.f33239e, this.f33240f);
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder transportFactoryProvider(Provider provider) {
            return transportFactoryProvider((Provider<TransportFactory>) provider);
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder appContext(Context context) {
            this.f33235a = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder backgroundDispatcher(CoroutineContext coroutineContext) {
            this.f33236b = (CoroutineContext) Preconditions.checkNotNull(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder blockingDispatcher(CoroutineContext coroutineContext) {
            this.f33237c = (CoroutineContext) Preconditions.checkNotNull(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder firebaseApp(FirebaseApp firebaseApp) {
            this.f33238d = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder firebaseInstallationsApi(FirebaseInstallationsApi firebaseInstallationsApi) {
            this.f33239e = (FirebaseInstallationsApi) Preconditions.checkNotNull(firebaseInstallationsApi);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder transportFactoryProvider(Provider<TransportFactory> provider) {
            this.f33240f = (Provider) Preconditions.checkNotNull(provider);
            return this;
        }
    }

    private static final class FirebaseSessionsComponentImpl implements FirebaseSessionsComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirebaseSessionsComponentImpl f33241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33248h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33249i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33250j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33251k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33252l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33253m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33254n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33255o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33256p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33257q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33258r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33259s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33260t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33261u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33262v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33263w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33264x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private com.google.firebase.sessions.dagger.internal.Provider f33265y;

        private void a(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider) {
            this.f33242b = InstanceFactory.create(firebaseApp);
            Factory factoryCreate = InstanceFactory.create(context);
            this.f33243c = factoryCreate;
            this.f33244d = DoubleCheck.provider(LocalOverrideSettings_Factory.create(factoryCreate));
            this.f33245e = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory.create());
            this.f33246f = InstanceFactory.create(firebaseInstallationsApi);
            this.f33247g = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory.create(this.f33242b));
            Factory factoryCreate2 = InstanceFactory.create(coroutineContext2);
            this.f33248h = factoryCreate2;
            this.f33249i = DoubleCheck.provider(RemoteSettingsFetcher_Factory.create(this.f33247g, factoryCreate2));
            this.f33250j = InstanceFactory.create(coroutineContext);
            com.google.firebase.sessions.dagger.internal.Provider provider2 = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory.create(this.f33243c, this.f33248h));
            this.f33251k = provider2;
            com.google.firebase.sessions.dagger.internal.Provider provider3 = DoubleCheck.provider(SettingsCacheImpl_Factory.create(this.f33250j, this.f33245e, provider2));
            this.f33252l = provider3;
            com.google.firebase.sessions.dagger.internal.Provider provider4 = DoubleCheck.provider(RemoteSettings_Factory.create(this.f33245e, this.f33246f, this.f33247g, this.f33249i, provider3));
            this.f33253m = provider4;
            this.f33254n = DoubleCheck.provider(SessionsSettings_Factory.create(this.f33244d, provider4));
            com.google.firebase.sessions.dagger.internal.Provider provider5 = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory.create());
            this.f33255o = provider5;
            this.f33256p = DoubleCheck.provider(SessionGenerator_Factory.create(this.f33245e, provider5));
            Factory factoryCreate3 = InstanceFactory.create(provider);
            this.f33257q = factoryCreate3;
            com.google.firebase.sessions.dagger.internal.Provider provider6 = DoubleCheck.provider(EventGDTLogger_Factory.create(factoryCreate3));
            this.f33258r = provider6;
            this.f33259s = DoubleCheck.provider(SessionFirelogPublisherImpl_Factory.create(this.f33242b, this.f33246f, this.f33254n, provider6, this.f33250j));
            com.google.firebase.sessions.dagger.internal.Provider provider7 = DoubleCheck.provider(SessionDataSerializer_Factory.create(this.f33256p));
            this.f33260t = provider7;
            this.f33261u = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory.create(this.f33243c, this.f33248h, provider7));
            com.google.firebase.sessions.dagger.internal.Provider provider8 = DoubleCheck.provider(ProcessDataManagerImpl_Factory.create(this.f33243c, this.f33255o));
            this.f33262v = provider8;
            com.google.firebase.sessions.dagger.internal.Provider provider9 = DoubleCheck.provider(SharedSessionRepositoryImpl_Factory.create(this.f33254n, this.f33256p, this.f33259s, this.f33245e, this.f33261u, provider8, this.f33250j));
            this.f33263w = provider9;
            com.google.firebase.sessions.dagger.internal.Provider provider10 = DoubleCheck.provider(SessionsActivityLifecycleCallbacks_Factory.create(provider9));
            this.f33264x = provider10;
            this.f33265y = DoubleCheck.provider(FirebaseSessions_Factory.create(this.f33242b, this.f33254n, this.f33250j, provider10));
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public FirebaseSessions getFirebaseSessions() {
            return (FirebaseSessions) this.f33265y.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SessionFirelogPublisher getSessionFirelogPublisher() {
            return (SessionFirelogPublisher) this.f33259s.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SessionGenerator getSessionGenerator() {
            return (SessionGenerator) this.f33256p.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SessionsSettings getSessionsSettings() {
            return (SessionsSettings) this.f33254n.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SharedSessionRepository getSharedSessionRepository() {
            return (SharedSessionRepository) this.f33263w.get();
        }

        private FirebaseSessionsComponentImpl(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider) {
            this.f33241a = this;
            a(context, coroutineContext, coroutineContext2, firebaseApp, firebaseInstallationsApi, provider);
        }
    }

    public static FirebaseSessionsComponent.Builder builder() {
        return new Builder();
    }
}
