package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigRealtimeHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f33066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConfigRealtimeHttpClient f33067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConfigFetchHandler f33068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseApp f33069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FirebaseInstallationsApi f33070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConfigCacheClient f33071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f33072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f33073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConfigSharedPrefsClient f33074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f33075j;

    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConfigUpdateListener f33076a;

        public ConfigUpdateListenerRegistrationInternal(ConfigUpdateListener configUpdateListener) {
            this.f33076a = configUpdateListener;
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration
        public void remove() {
            ConfigRealtimeHandler.this.c(this.f33076a);
        }
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f33066a = linkedHashSet;
        this.f33067b = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, linkedHashSet, configSharedPrefsClient, scheduledExecutorService);
        this.f33069d = firebaseApp;
        this.f33068c = configFetchHandler;
        this.f33070e = firebaseInstallationsApi;
        this.f33071f = configCacheClient;
        this.f33072g = context;
        this.f33073h = str;
        this.f33074i = configSharedPrefsClient;
        this.f33075j = scheduledExecutorService;
    }

    private synchronized void b() {
        if (!this.f33066a.isEmpty()) {
            this.f33067b.startHttpConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(ConfigUpdateListener configUpdateListener) {
        this.f33066a.remove(configUpdateListener);
    }

    @NonNull
    public synchronized ConfigUpdateListenerRegistration addRealtimeConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        this.f33066a.add(configUpdateListener);
        b();
        return new ConfigUpdateListenerRegistrationInternal(configUpdateListener);
    }

    public synchronized void setBackgroundState(boolean z10) {
        this.f33067b.setIsInBackground(z10);
        if (!z10) {
            b();
        }
    }
}
