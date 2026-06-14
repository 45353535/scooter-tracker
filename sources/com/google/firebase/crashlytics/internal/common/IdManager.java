package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f32089g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f32090h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InstallerPackageNameProvider f32091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f32092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseInstallationsApi f32094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DataCollectionArbiter f32095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InstallIdProvider.InstallIds f32096f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f32092b = context;
        this.f32093c = str;
        this.f32094d = firebaseInstallationsApi;
        this.f32095e = dataCollectionArbiter;
        this.f32091a = new InstallerPackageNameProvider();
    }

    private synchronized String a(String str, SharedPreferences sharedPreferences) {
        String strC;
        strC = c(UUID.randomUUID().toString());
        Logger.getLogger().v("Created new Crashlytics installation ID: " + strC + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strC).putString("firebase.installation.id", str).apply();
        return strC;
    }

    static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String c(String str) {
        return f32089g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean d(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String e(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String f(String str) {
        return str.replaceAll(f32090h, "");
    }

    private boolean g() {
        InstallIdProvider.InstallIds installIds = this.f32096f;
        if (installIds != null) {
            return installIds.getFirebaseInstallationId() == null && this.f32095e.isAutomaticDataCollectionEnabled();
        }
        return true;
    }

    @NonNull
    public FirebaseInstallationId fetchTrueFid(boolean z10) {
        String token;
        CrashlyticsWorkers.checkNotMainThread();
        String str = null;
        if (z10) {
            try {
                token = ((InstallationTokenResult) Tasks.await(this.f32094d.getToken(false), 10000L, TimeUnit.MILLISECONDS)).getToken();
            } catch (Exception e10) {
                Logger.getLogger().w("Error getting Firebase authentication token.", e10);
                token = null;
            }
        } else {
            token = null;
        }
        try {
            str = (String) Tasks.await(this.f32094d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            Logger.getLogger().w("Error getting Firebase installation id.", e11);
        }
        return new FirebaseInstallationId(str, token);
    }

    public String getAppIdentifier() {
        return this.f32093c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public synchronized InstallIdProvider.InstallIds getInstallIds() {
        if (!g()) {
            return this.f32096f;
        }
        Logger.getLogger().v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.f32092b);
        String string = sharedPrefs.getString("firebase.installation.id", null);
        Logger.getLogger().v("Cached Firebase Installation ID: " + string);
        if (this.f32095e.isAutomaticDataCollectionEnabled()) {
            FirebaseInstallationId firebaseInstallationIdFetchTrueFid = fetchTrueFid(false);
            Logger.getLogger().v("Fetched Firebase Installation ID: " + firebaseInstallationIdFetchTrueFid.getFid());
            if (firebaseInstallationIdFetchTrueFid.getFid() == null) {
                firebaseInstallationIdFetchTrueFid = new FirebaseInstallationId(string == null ? b() : string, null);
            }
            if (Objects.equals(firebaseInstallationIdFetchTrueFid.getFid(), string)) {
                this.f32096f = InstallIdProvider.InstallIds.a(e(sharedPrefs), firebaseInstallationIdFetchTrueFid);
            } else {
                this.f32096f = InstallIdProvider.InstallIds.a(a(firebaseInstallationIdFetchTrueFid.getFid(), sharedPrefs), firebaseInstallationIdFetchTrueFid);
            }
        } else if (d(string)) {
            this.f32096f = InstallIdProvider.InstallIds.createWithoutFid(e(sharedPrefs));
        } else {
            this.f32096f = InstallIdProvider.InstallIds.createWithoutFid(a(b(), sharedPrefs));
        }
        Logger.getLogger().v("Install IDs: " + this.f32096f);
        return this.f32096f;
    }

    public String getInstallerPackageName() {
        return this.f32091a.a(this.f32092b);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", f(Build.MANUFACTURER), f(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return f(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return f(Build.VERSION.RELEASE);
    }
}
