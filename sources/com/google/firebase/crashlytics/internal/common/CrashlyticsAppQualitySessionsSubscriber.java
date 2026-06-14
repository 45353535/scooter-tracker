package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataCollectionArbiter f31997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CrashlyticsAppQualitySessionsStore f31998b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f31997a = dataCollectionArbiter;
        this.f31998b = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    @Nullable
    public String getAppQualitySessionId(@NonNull String str) {
        return this.f31998b.getAppQualitySessionId(str);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    @NonNull
    public SessionSubscriber.Name getSessionSubscriberName() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
        return this.f31997a.isAutomaticDataCollectionEnabled();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(@NonNull SessionSubscriber.SessionDetails sessionDetails) {
        Logger.getLogger().d("App Quality Sessions session changed: " + sessionDetails);
        this.f31998b.rotateAppQualitySessionId(sessionDetails.getSessionId());
    }

    public void setSessionId(@Nullable String str) {
        this.f31998b.rotateSessionId(str);
    }
}
