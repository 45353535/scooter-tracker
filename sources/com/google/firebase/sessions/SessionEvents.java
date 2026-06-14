package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/firebase/sessions/SessionEvents;", "", "<init>", "()V", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "Lcom/google/firebase/sessions/DataCollectionState;", "a", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/DataCollectionState;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "Lcom/google/firebase/sessions/SessionEvent;", "buildSession", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/settings/SessionsSettings;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/sessions/SessionEvent;", "Lcom/google/firebase/sessions/ApplicationInfo;", "getApplicationInfo", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/encoders/DataEncoder;", "Lcom/google/firebase/encoders/DataEncoder;", "getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/encoders/DataEncoder;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionEvents {

    @NotNull
    public static final SessionEvents INSTANCE = new SessionEvents();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final DataEncoder SESSION_EVENT_ENCODER;

    static {
        DataEncoder dataEncoderBuild = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        Intrinsics.checkNotNullExpressionValue(dataEncoderBuild, "build(...)");
        SESSION_EVENT_ENCODER = dataEncoderBuild;
    }

    private SessionEvents() {
    }

    private final DataCollectionState a(SessionSubscriber subscriber) {
        return subscriber == null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : subscriber.isDataCollectionEnabled() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionEvent buildSession$default(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map map, String str, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, map, (i10 & 16) != 0 ? "" : str, (i10 & 32) != 0 ? "" : str2);
    }

    @NotNull
    public final SessionEvent buildSession(@NotNull FirebaseApp firebaseApp, @NotNull SessionDetails sessionDetails, @NotNull SessionsSettings sessionsSettings, @NotNull Map<SessionSubscriber.Name, ? extends SessionSubscriber> subscribers, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(a(subscribers.get(SessionSubscriber.Name.PERFORMANCE)), a(subscribers.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.getSamplingRate()), firebaseInstallationId, firebaseAuthenticationToken), getApplicationInfo(firebaseApp));
    }

    @NotNull
    public final ApplicationInfo getApplicationInfo(@NotNull FirebaseApp firebaseApp) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        Intrinsics.checkNotNullExpressionValue(applicationId, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNull(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        ProcessDetails myProcessDetails = processDetailsProvider.getMyProcessDetails(applicationContext2);
        Context applicationContext3 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
        return new ApplicationInfo(applicationId, MODEL, BuildConfig.VERSION_NAME, RELEASE, logEnvironment, new AndroidApplicationInfo(packageName, str2, strValueOf, MANUFACTURER, myProcessDetails, processDetailsProvider.getAppProcessDetails(applicationContext3)));
    }

    @NotNull
    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }
}
