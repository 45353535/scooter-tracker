package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class SettingsController implements SettingsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SettingsRequest f32703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SettingsJsonParser f32704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CurrentTimeProvider f32705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CachedSettingsIo f32706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SettingsSpiCall f32707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DataCollectionArbiter f32708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference f32709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference f32710i;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1, reason: invalid class name */
    class AnonymousClass1 implements SuccessContinuation<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CrashlyticsWorkers f32711a;

        AnonymousClass1(CrashlyticsWorkers crashlyticsWorkers) {
            this.f32711a = crashlyticsWorkers;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public Task<Void> then(@Nullable Void r52) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f32711a.network.getExecutor().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.settings.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SettingsController.AnonymousClass1 anonymousClass1 = this.f32714b;
                    return SettingsController.this.f32707f.invoke(SettingsController.this.f32703b, true);
                }
            }).get();
            if (jSONObject != null) {
                Settings settingsJson = SettingsController.this.f32704c.parseSettingsJson(jSONObject);
                SettingsController.this.f32706e.writeCachedSettings(settingsJson.expiresAtMillis, jSONObject);
                SettingsController.this.l(jSONObject, "Loaded settings: ");
                SettingsController settingsController = SettingsController.this;
                settingsController.m(settingsController.f32703b.instanceId);
                SettingsController.this.f32709h.set(settingsJson);
                ((TaskCompletionSource) SettingsController.this.f32710i.get()).trySetResult(settingsJson);
            }
            return Tasks.forResult(null);
        }
    }

    SettingsController(Context context, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference atomicReference = new AtomicReference();
        this.f32709h = atomicReference;
        this.f32710i = new AtomicReference(new TaskCompletionSource());
        this.f32702a = context;
        this.f32703b = settingsRequest;
        this.f32705d = currentTimeProvider;
        this.f32704c = settingsJsonParser;
        this.f32706e = cachedSettingsIo;
        this.f32707f = settingsSpiCall;
        this.f32708g = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.a(currentTimeProvider));
    }

    public static SettingsController create(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String installerPackageName = idManager.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        return new SettingsController(context, new SettingsRequest(str, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager, CommonUtils.createInstanceIdFrom(CommonUtils.getMappingFileId(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(installerPackageName).getId()), systemCurrentTimeProvider, new SettingsJsonParser(systemCurrentTimeProvider), new CachedSettingsIo(fileStore), new DefaultSettingsSpiCall(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), httpRequestFactory), dataCollectionArbiter);
    }

    private Settings j(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        Settings settings = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject cachedSettings = this.f32706e.readCachedSettings();
                if (cachedSettings != null) {
                    Settings settingsJson = this.f32704c.parseSettingsJson(cachedSettings);
                    if (settingsJson == null) {
                        Logger.getLogger().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    l(cachedSettings, "Loaded cached settings: ");
                    long currentTimeMillis = this.f32705d.getCurrentTimeMillis();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && settingsJson.isExpired(currentTimeMillis)) {
                        Logger.getLogger().v("Cached settings have expired.");
                        return null;
                    }
                    try {
                        Logger.getLogger().v("Returning cached settings.");
                        return settingsJson;
                    } catch (Exception e10) {
                        e = e10;
                        settings = settingsJson;
                        Logger.getLogger().e("Failed to get cached settings", e);
                        return settings;
                    }
                }
                Logger.getLogger().d("No cached settings data found.");
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private String k() {
        return CommonUtils.getSharedPrefs(this.f32702a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(JSONObject jSONObject, String str) {
        Logger.getLogger().d(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        SharedPreferences.Editor editorEdit = CommonUtils.getSharedPrefs(this.f32702a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task<Settings> getSettingsAsync() {
        return ((TaskCompletionSource) this.f32710i.get()).getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Settings getSettingsSync() {
        return (Settings) this.f32709h.get();
    }

    boolean i() {
        return !k().equals(this.f32703b.instanceId);
    }

    public Task<Void> loadSettingsData(CrashlyticsWorkers crashlyticsWorkers) {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE, crashlyticsWorkers);
    }

    public Task<Void> loadSettingsData(SettingsCacheBehavior settingsCacheBehavior, CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        Settings settingsJ;
        if (!i() && (settingsJ = j(settingsCacheBehavior)) != null) {
            this.f32709h.set(settingsJ);
            ((TaskCompletionSource) this.f32710i.get()).trySetResult(settingsJ);
            return Tasks.forResult(null);
        }
        Settings settingsJ2 = j(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (settingsJ2 != null) {
            this.f32709h.set(settingsJ2);
            ((TaskCompletionSource) this.f32710i.get()).trySetResult(settingsJ2);
        }
        return this.f32708g.waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers.common, new AnonymousClass1(crashlyticsWorkers));
    }
}
