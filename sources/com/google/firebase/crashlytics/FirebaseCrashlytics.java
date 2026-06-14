package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CrashlyticsCore f31940a;

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.f31940a = crashlyticsCore;
    }

    static FirebaseCrashlytics b(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Deferred deferred, Deferred deferred2, Deferred deferred3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        Logger.getLogger().i("Initializing Firebase Crashlytics " + CrashlyticsCore.getVersion() + " for " + packageName);
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
        FileStore fileStore = new FileStore(applicationContext);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3), crashlyticsWorkers);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        String mappingFileId = CommonUtils.getMappingFileId(applicationContext);
        List<BuildIdInfo> buildIdInfo = CommonUtils.getBuildIdInfo(applicationContext);
        Logger.getLogger().d("Mapping file ID is: " + mappingFileId);
        for (BuildIdInfo buildIdInfo2 : buildIdInfo) {
            Logger.getLogger().d(String.format("Build id for %s on %s: %s", buildIdInfo2.getLibraryName(), buildIdInfo2.getArch(), buildIdInfo2.getBuildId()));
        }
        try {
            AppData appDataCreate = AppData.create(applicationContext, idManager, applicationId, mappingFileId, buildIdInfo, new DevelopmentPlatformProvider(applicationContext));
            Logger.getLogger().v("Installer package name is: " + appDataCreate.installerPackageName);
            SettingsController settingsControllerCreate = SettingsController.create(applicationContext, applicationId, idManager, new HttpRequestFactory(), appDataCreate.versionCode, appDataCreate.versionName, fileStore, dataCollectionArbiter);
            settingsControllerCreate.loadSettingsData(crashlyticsWorkers).addOnFailureListener(executorService3, new OnFailureListener() { // from class: com.google.firebase.crashlytics.e
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Logger.getLogger().e("Error fetching settings.", exc);
                }
            });
            if (crashlyticsCore.onPreExecute(appDataCreate, settingsControllerCreate)) {
                crashlyticsCore.doBackgroundInitializationAsync(settingsControllerCreate);
            }
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.getLogger().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f31940a.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.f31940a.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f31940a.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f31940a.isCrashlyticsCollectionEnabled();
    }

    public void log(@NonNull String str) {
        this.f31940a.log(str);
    }

    public void recordException(@NonNull Throwable th2) {
        if (th2 == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.f31940a.logException(th2, Collections.EMPTY_MAP);
        }
    }

    public void sendUnsentReports() {
        this.f31940a.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f31940a.setCrashlyticsCollectionEnabled(Boolean.valueOf(z10));
    }

    public void setCustomKey(@NonNull String str, boolean z10) {
        this.f31940a.setCustomKey(str, Boolean.toString(z10));
    }

    public void setCustomKeys(@NonNull CustomKeysAndValues customKeysAndValues) {
        this.f31940a.setCustomKeys(customKeysAndValues.f31938a);
    }

    public void setUserId(@NonNull String str) {
        this.f31940a.setUserId(str);
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.f31940a.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCustomKey(@NonNull String str, double d10) {
        this.f31940a.setCustomKey(str, Double.toString(d10));
    }

    public void setCustomKey(@NonNull String str, float f10) {
        this.f31940a.setCustomKey(str, Float.toString(f10));
    }

    public void setCustomKey(@NonNull String str, int i10) {
        this.f31940a.setCustomKey(str, Integer.toString(i10));
    }

    public void recordException(@NonNull Throwable th2, @NonNull CustomKeysAndValues customKeysAndValues) {
        if (th2 == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.f31940a.logException(th2, customKeysAndValues.f31938a);
        }
    }

    public void setCustomKey(@NonNull String str, long j10) {
        this.f31940a.setCustomKey(str, Long.toString(j10));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.f31940a.setCustomKey(str, str2);
    }
}
