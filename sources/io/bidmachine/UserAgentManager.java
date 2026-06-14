package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lio/bidmachine/UserAgentManager;", "", "()V", "DEFAULT_EXPIRATION_MS", "", "SYSTEM_HTTP_AGENT", "", "SYSTEM_PROPERTY_HTTP_AGENT", "WEB_USER_AGENT_PROCESSED", "Ljava/util/concurrent/atomic/AtomicBoolean;", "WEB_USER_AGENT_UPDATED", "applicationContext", "Landroid/content/Context;", "generatedUserAgent", "webUserAgent", "clear", "", "findWebUserAgent", POBCoreNativeConstants.NATIVE_CONTEXT, "findWebUserAgent$bidmachine_android_sdk_bh_3_5_0", "getUserAgent", MobileAdsBridgeBase.initializeMethodName, "updateWebViewUserAgent", "ApplovinUserAgentSource", "BidMachineUserAgentSource", "FacebookUserAgentSource", "GeneratedUserAgentSource", "IronSourceUserAgentSource", "SharedPreferenceUserAgentSource", "UserAgentSource", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserAgentManager {

    @Nullable
    private static final String SYSTEM_HTTP_AGENT;

    @NotNull
    private static final String SYSTEM_PROPERTY_HTTP_AGENT = "http.agent";

    @NotNull
    private static final AtomicBoolean WEB_USER_AGENT_PROCESSED;

    @NotNull
    private static final AtomicBoolean WEB_USER_AGENT_UPDATED;

    @Nullable
    private static Context applicationContext;

    @Nullable
    private static String generatedUserAgent;

    @Nullable
    public static String webUserAgent;

    @NotNull
    public static final UserAgentManager INSTANCE = new UserAgentManager();
    private static final long DEFAULT_EXPIRATION_MS = TimeUnit.DAYS.toMillis(14);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$ApplovinUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ApplovinUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplovinUserAgentSource(@NotNull Context context) {
            super(context, "com.applovin.sdk.shared", "com.applovin.sdk.user_agent");
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lio/bidmachine/UserAgentManager$BidMachineUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", "Ljava/lang/Runnable;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "expirationMs", "", "(Landroid/content/Context;J)V", "applicationContext", "getExpirationMs", "()J", "calculateExpirationMs", "checkAndUpdate", "", "get", "", "run", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class BidMachineUserAgentSource implements UserAgentSource, Runnable {

        @NotNull
        private final Context applicationContext;
        private final long expirationMs;

        public BidMachineUserAgentSource(@NotNull Context context, long j10) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.expirationMs = j10;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        public final long calculateExpirationMs() {
            return System.currentTimeMillis() + this.expirationMs;
        }

        public final void checkAndUpdate() {
            String str = get();
            if (str == null || str.length() == 0) {
                pd.b0.b(this);
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        @Nullable
        public String get() {
            return n2.x(this.applicationContext);
        }

        public final long getExpirationMs() {
            return this.expirationMs;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserAgentManager userAgentManager = UserAgentManager.INSTANCE;
                String defaultUserAgent = WebSettings.getDefaultUserAgent(this.applicationContext);
                if (defaultUserAgent != null) {
                    Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "getDefaultUserAgent(applicationContext)");
                    n2.N(this.applicationContext, defaultUserAgent, calculateExpirationMs());
                } else {
                    defaultUserAgent = null;
                }
                UserAgentManager.webUserAgent = defaultUserAgent;
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$FacebookUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FacebookUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookUserAgentSource(@NotNull Context context) {
            super(context, "com.facebook.ads.internal.ua", "user_agent");
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0002J$\u0010\r\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/bidmachine/UserAgentManager$GeneratedUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "appendChromeToUserAgent", "", "packageManager", "Landroid/content/pm/PackageManager;", "userAgentBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "appendMobileToUserAgent", "create", "", "get", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GeneratedUserAgentSource implements UserAgentSource {

        @NotNull
        private final Context applicationContext;

        public GeneratedUserAgentSource(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        private final void appendChromeToUserAgent(PackageManager packageManager, StringBuilder userAgentBuilder) {
            String[] strArr = {"com.android.chrome", "com.google.android.webview", "com.android.webview"};
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i10], 0);
                    userAgentBuilder.append(" Chrome/");
                    userAgentBuilder.append(packageInfo.versionName);
                    return;
                } catch (Throwable unused) {
                }
            }
        }

        private final void appendMobileToUserAgent(Context context, PackageManager packageManager, StringBuilder userAgentBuilder) {
            String string;
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                userAgentBuilder.append(" Mobile");
                userAgentBuilder.append(" ");
                int i10 = applicationInfo.labelRes;
                if (i10 == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n                      …                        }");
                }
                userAgentBuilder.append(string);
                userAgentBuilder.append("/");
                userAgentBuilder.append(packageInfo.versionName);
            } catch (Throwable unused) {
            }
        }

        private final String create(Context context) {
            try {
                StringBuilder userAgentBuilder = new StringBuilder("Mozilla/5.0");
                userAgentBuilder.append(" (Linux; Android ");
                userAgentBuilder.append(pd.f.d());
                userAgentBuilder.append("; ");
                userAgentBuilder.append(pd.f.c());
                userAgentBuilder.append(" Build/");
                userAgentBuilder.append(pd.f.a());
                userAgentBuilder.append("; wv)");
                userAgentBuilder.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                userAgentBuilder.append(" Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
                Intrinsics.checkNotNullExpressionValue(userAgentBuilder, "userAgentBuilder");
                appendChromeToUserAgent(packageManager, userAgentBuilder);
                appendMobileToUserAgent(context, packageManager, userAgentBuilder);
                String string = userAgentBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string, "userAgentBuilder.toString()");
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        @NotNull
        public String get() {
            return create(this.applicationContext);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$IronSourceUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class IronSourceUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IronSourceUserAgentSource(@NotNull Context context) {
            super(context, "Mediation_Shared_Preferences", "browser_user_agent");
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "name", "", "field", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "applicationContext", "sharedPreferences", "Landroid/content/SharedPreferences;", "get", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class SharedPreferenceUserAgentSource implements UserAgentSource {

        @NotNull
        private final Context applicationContext;

        @NotNull
        private final String field;

        @NotNull
        private final String name;

        @Nullable
        private SharedPreferences sharedPreferences;

        public SharedPreferenceUserAgentSource(@NotNull Context context, @NotNull String name, @NotNull String field) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(field, "field");
            this.name = name;
            this.field = field;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        @Nullable
        public String get() {
            try {
                if (this.sharedPreferences == null) {
                    this.sharedPreferences = this.applicationContext.getSharedPreferences(this.name, 0);
                }
                SharedPreferences sharedPreferences = this.sharedPreferences;
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(this.field, null);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lio/bidmachine/UserAgentManager$UserAgentSource;", "", "get", "", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface UserAgentSource {
        @Nullable
        String get();
    }

    static {
        String property;
        try {
            property = System.getProperty(SYSTEM_PROPERTY_HTTP_AGENT);
        } catch (Throwable unused) {
            property = null;
        }
        SYSTEM_HTTP_AGENT = property;
        WEB_USER_AGENT_PROCESSED = new AtomicBoolean(false);
        WEB_USER_AGENT_UPDATED = new AtomicBoolean(false);
    }

    private UserAgentManager() {
    }

    public static final void clear() {
        WEB_USER_AGENT_PROCESSED.set(false);
        webUserAgent = null;
        generatedUserAgent = null;
    }

    @Nullable
    public static final String getUserAgent() {
        return getUserAgent(applicationContext);
    }

    public static final void initialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        applicationContext = context.getApplicationContext();
        INSTANCE.findWebUserAgent$bidmachine_android_sdk_bh_3_5_0(context);
    }

    public static final void updateWebViewUserAgent() {
        Context context;
        if (WEB_USER_AGENT_UPDATED.compareAndSet(false, true) && (context = applicationContext) != null) {
            try {
                new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).checkAndUpdate();
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
    }

    @Nullable
    public final String findWebUserAgent$bidmachine_android_sdk_bh_3_5_0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!WEB_USER_AGENT_PROCESSED.compareAndSet(false, true)) {
            return webUserAgent;
        }
        String str = new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).get();
        if (str != null && str.length() > 0) {
            return str;
        }
        String str2 = new ApplovinUserAgentSource(context).get();
        if (str2 != null && str2.length() > 0) {
            return str2;
        }
        String str3 = new IronSourceUserAgentSource(context).get();
        if (str3 != null && str3.length() > 0) {
            return str3;
        }
        String str4 = new FacebookUserAgentSource(context).get();
        if (str4 != null && str4.length() > 0) {
            return str4;
        }
        updateWebViewUserAgent();
        return webUserAgent;
    }

    @Nullable
    public static final String getUserAgent(@Nullable Context context) {
        if (context == null) {
            context = applicationContext;
        }
        if (webUserAgent == null && context != null) {
            webUserAgent = INSTANCE.findWebUserAgent$bidmachine_android_sdk_bh_3_5_0(context);
        }
        String str = webUserAgent;
        if (str != null && str.length() > 0) {
            return webUserAgent;
        }
        if (generatedUserAgent == null && context != null) {
            generatedUserAgent = new GeneratedUserAgentSource(context).get();
        }
        String str2 = generatedUserAgent;
        return (str2 == null || str2.length() <= 0) ? SYSTEM_HTTP_AGENT : generatedUserAgent;
    }
}
