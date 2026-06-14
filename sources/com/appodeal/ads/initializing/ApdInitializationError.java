package com.appodeal.ads.initializing;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError;", "", "<init>", "()V", "Critical", "InternalError", "NonCritical", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ApdInitializationError extends Throwable {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "Lcom/appodeal/ads/initializing/ApdInitializationError;", "description", "", "<init>", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "SdkVersionIsNotSupported", "AppKeyIsNullOrEmpty", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$AppKeyIsNullOrEmpty;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$SdkVersionIsNotSupported;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Critical extends ApdInitializationError {
        private final String description;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$AppKeyIsNullOrEmpty;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "bundleId", "", "<init>", "(Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AppKeyIsNullOrEmpty extends Critical {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppKeyIsNullOrEmpty(String bundleId) {
                super("The Appodeal APP KEY passed to Appodeal initialization method is null or empty. \nYou may check https://app.appodeal.com/apps to find the corresponding App Key for " + bundleId, null);
                Intrinsics.checkNotNullParameter(bundleId, "bundleId");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$SdkVersionIsNotSupported;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SdkVersionIsNotSupported extends Critical {
            public static final SdkVersionIsNotSupported INSTANCE = new SdkVersionIsNotSupported();

            private SdkVersionIsNotSupported() {
                super("Minimum supported Android api version is 21. Appodeal SDK is disabled", null);
            }
        }

        public /* synthetic */ Critical(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getDescription() {
            return this.description;
        }

        private Critical(String str) {
            super(null);
            this.description = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError;", "Lcom/appodeal/ads/initializing/ApdInitializationError;", "<init>", "()V", "SdkConfigurationError", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError$SdkConfigurationError;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class InternalError extends ApdInitializationError {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError$SdkConfigurationError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SdkConfigurationError extends InternalError {
            private final Throwable cause;

            public SdkConfigurationError() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            public SdkConfigurationError(Throwable th2) {
                super(null);
                this.cause = th2;
            }

            public /* synthetic */ SdkConfigurationError(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : th2);
            }
        }

        public /* synthetic */ InternalError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InternalError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "Lcom/appodeal/ads/initializing/ApdInitializationError;", "componentName", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getComponentName", "()Ljava/lang/String;", "getDescription", "OtherError", "AdjustNotInitialized", "AppsflyerNotInitialized", "FacebookAnalyticsNotInitialized", "FirebaseAnalyticsNotInitialized", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FirebaseAnalyticsNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$OtherError;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class NonCritical extends ApdInitializationError {
        private final String componentName;
        private final String description;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "description", "", "<init>", "(Ljava/lang/String;)V", "NoAppToken", "NoEnvironment", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoAppToken;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoEnvironment;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class AdjustNotInitialized extends NonCritical {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoAppToken;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NoAppToken extends AdjustNotInitialized {
                public static final NoAppToken INSTANCE = new NoAppToken();

                private NoAppToken() {
                    super("App token not provided, see https://help.adjust.com/en/article/app-settings#view-your-app-token", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoEnvironment;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NoEnvironment extends AdjustNotInitialized {
                public static final NoEnvironment INSTANCE = new NoEnvironment();

                private NoEnvironment() {
                    super("Environment not provided", null);
                }
            }

            public /* synthetic */ AdjustNotInitialized(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            private AdjustNotInitialized(String str) {
                super("Adjust", str, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "description", "", "<init>", "(Ljava/lang/String;)V", "NoDevKeyProvided", "NoAppIdProvided", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoAppIdProvided;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoDevKeyProvided;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class AppsflyerNotInitialized extends NonCritical {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoAppIdProvided;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NoAppIdProvided extends AppsflyerNotInitialized {
                public static final NoAppIdProvided INSTANCE = new NoAppIdProvided();

                private NoAppIdProvided() {
                    super("AppId not provided", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoDevKeyProvided;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NoDevKeyProvided extends AppsflyerNotInitialized {
                public static final NoDevKeyProvided INSTANCE = new NoDevKeyProvided();

                private NoDevKeyProvided() {
                    super("DevKey not provided, see https://support.appsflyer.com/hc/en-us/articles/207032066-Basic-SDK-integration-guide#retrieving-the-dev-key", null);
                }
            }

            public /* synthetic */ AppsflyerNotInitialized(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            private AppsflyerNotInitialized(String str) {
                super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APPSFLYER, str, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "description", "", "<init>", "(Ljava/lang/String;)V", "AppIdIsNotOverridden", "ClientTokenIsNotOverridden", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$AppIdIsNotOverridden;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$ClientTokenIsNotOverridden;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class FacebookAnalyticsNotInitialized extends NonCritical {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$AppIdIsNotOverridden;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AppIdIsNotOverridden extends FacebookAnalyticsNotInitialized {
                public static final AppIdIsNotOverridden INSTANCE = new AppIdIsNotOverridden();

                private AppIdIsNotOverridden() {
                    super("R.string.facebook_app_id string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#add-app_id", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$ClientTokenIsNotOverridden;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ClientTokenIsNotOverridden extends FacebookAnalyticsNotInitialized {
                public static final ClientTokenIsNotOverridden INSTANCE = new ClientTokenIsNotOverridden();

                private ClientTokenIsNotOverridden() {
                    super("R.facebook_client_token string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#client-token", null);
                }
            }

            public /* synthetic */ FacebookAnalyticsNotInitialized(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            private FacebookAnalyticsNotInitialized(String str) {
                super("Facebook Analytics", str, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FirebaseAnalyticsNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "description", "", "<init>", "(Ljava/lang/String;)V", "GoogleServicesNotApplied", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FirebaseAnalyticsNotInitialized$GoogleServicesNotApplied;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class FirebaseAnalyticsNotInitialized extends NonCritical {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FirebaseAnalyticsNotInitialized$GoogleServicesNotApplied;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FirebaseAnalyticsNotInitialized;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class GoogleServicesNotApplied extends FirebaseAnalyticsNotInitialized {
                public static final GoogleServicesNotApplied INSTANCE = new GoogleServicesNotApplied();

                private GoogleServicesNotApplied() {
                    super("com.google.gms:google-services was not applied, see https://firebase.google.com/docs/android/setup", null);
                }
            }

            public /* synthetic */ FirebaseAnalyticsNotInitialized(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            private FirebaseAnalyticsNotInitialized(String str) {
                super("Firebase Analytics", str, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$OtherError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "componentName", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OtherError extends NonCritical {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OtherError(String componentName, String str) {
                super(componentName, str, null);
                Intrinsics.checkNotNullParameter(componentName, "componentName");
            }
        }

        public /* synthetic */ NonCritical(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public final String getComponentName() {
            return this.componentName;
        }

        public final String getDescription() {
            return this.description;
        }

        private NonCritical(String str, String str2) {
            super(null);
            this.componentName = str;
            this.description = str2;
        }
    }

    public /* synthetic */ ApdInitializationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApdInitializationError() {
    }
}
