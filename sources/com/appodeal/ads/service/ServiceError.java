package com.appodeal.ads.service;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u001d\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/appodeal/ads/service/ServiceError;", "", "componentName", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getComponentName", "()Ljava/lang/String;", "getDescription", "Internal", "InitializationTimeout", "IAPValidationTimeout", "PurchaseValidationServiceNotFound", "PurchaseValidationServiceDisabled", "Adjust", "Appsflyer", "FacebookAnalytics", "FirebaseAnalytics", "SentryAnalytics", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "Lcom/appodeal/ads/service/ServiceError$FirebaseAnalytics;", "Lcom/appodeal/ads/service/ServiceError$IAPValidationTimeout;", "Lcom/appodeal/ads/service/ServiceError$InitializationTimeout;", "Lcom/appodeal/ads/service/ServiceError$Internal;", "Lcom/appodeal/ads/service/ServiceError$PurchaseValidationServiceDisabled;", "Lcom/appodeal/ads/service/ServiceError$PurchaseValidationServiceNotFound;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ServiceError extends Throwable {
    private final String componentName;
    private final String description;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "<init>", "(Ljava/lang/String;)V", "NoAppToken", "NoEnvironment", "InAppPurchaseTrackError", "SubscriptionTrackError", "PurchaseValidationError", "Lcom/appodeal/ads/service/ServiceError$Adjust$InAppPurchaseTrackError;", "Lcom/appodeal/ads/service/ServiceError$Adjust$NoAppToken;", "Lcom/appodeal/ads/service/ServiceError$Adjust$NoEnvironment;", "Lcom/appodeal/ads/service/ServiceError$Adjust$PurchaseValidationError;", "Lcom/appodeal/ads/service/ServiceError$Adjust$SubscriptionTrackError;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Adjust extends ServiceError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$InAppPurchaseTrackError;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class InAppPurchaseTrackError extends Adjust {
            public static final InAppPurchaseTrackError INSTANCE = new InAppPurchaseTrackError();

            private InAppPurchaseTrackError() {
                super("Purchase track error", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$NoAppToken;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoAppToken extends Adjust {
            public static final NoAppToken INSTANCE = new NoAppToken();

            private NoAppToken() {
                super("App token not provided, see https://help.adjust.com/en/article/app-settings#view-your-app-token", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$NoEnvironment;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoEnvironment extends Adjust {
            public static final NoEnvironment INSTANCE = new NoEnvironment();

            private NoEnvironment() {
                super("Environment not provided", null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$PurchaseValidationError;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "description", "", "<init>", "(Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PurchaseValidationError extends Adjust {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PurchaseValidationError(String description) {
                super(description, null);
                Intrinsics.checkNotNullParameter(description, "description");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$SubscriptionTrackError;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SubscriptionTrackError extends Adjust {
            public static final SubscriptionTrackError INSTANCE = new SubscriptionTrackError();

            private SubscriptionTrackError() {
                super("Subscription track error", null);
            }
        }

        public /* synthetic */ Adjust(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Adjust(String str) {
            super("Adjust", str, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "<init>", "(Ljava/lang/String;)V", "NoDevKeyProvided", "NoAppIdProvided", "PurchaseValidationError", "ConversionDataError", "AttributionError", "InitializeError", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$AttributionError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$ConversionDataError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$InitializeError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoAppIdProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoDevKeyProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$PurchaseValidationError;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Appsflyer extends ServiceError {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$AttributionError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "description", "", "<init>", "(Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AttributionError extends Appsflyer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AttributionError(String description) {
                super(description, null);
                Intrinsics.checkNotNullParameter(description, "description");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$ConversionDataError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "description", "", "<init>", "(Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ConversionDataError extends Appsflyer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConversionDataError(String description) {
                super(description, null);
                Intrinsics.checkNotNullParameter(description, "description");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$InitializeError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "description", "", "<init>", "(Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class InitializeError extends Appsflyer {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializeError(String description) {
                super(description, null);
                Intrinsics.checkNotNullParameter(description, "description");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoAppIdProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoAppIdProvided extends Appsflyer {
            public static final NoAppIdProvided INSTANCE = new NoAppIdProvided();

            private NoAppIdProvided() {
                super("AppId not provided", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoDevKeyProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoDevKeyProvided extends Appsflyer {
            public static final NoDevKeyProvided INSTANCE = new NoDevKeyProvided();

            private NoDevKeyProvided() {
                super("DevKey not provided, see https://support.appsflyer.com/hc/en-us/articles/207032066-Basic-SDK-integration-guide#retrieving-the-dev-key", null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$PurchaseValidationError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "description", "", "<init>", "(Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PurchaseValidationError extends Appsflyer {
            public PurchaseValidationError(String str) {
                super(str == null ? "" : str, null);
            }
        }

        public /* synthetic */ Appsflyer(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Appsflyer(String str) {
            super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APPSFLYER, str, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "<init>", "(Ljava/lang/String;)V", "AppIdIsNotOverridden", "ClientTokenIsNotOverridden", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$AppIdIsNotOverridden;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$ClientTokenIsNotOverridden;", "Lcom/appodeal/ads/service/ServiceError$FirebaseAnalytics$GoogleServicesNotApplied;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FacebookAnalytics extends ServiceError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$AppIdIsNotOverridden;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AppIdIsNotOverridden extends FacebookAnalytics {
            public static final AppIdIsNotOverridden INSTANCE = new AppIdIsNotOverridden();

            private AppIdIsNotOverridden() {
                super("R.string.facebook_app_id string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#add-app_id", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$ClientTokenIsNotOverridden;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ClientTokenIsNotOverridden extends FacebookAnalytics {
            public static final ClientTokenIsNotOverridden INSTANCE = new ClientTokenIsNotOverridden();

            private ClientTokenIsNotOverridden() {
                super("R.facebook_client_token string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#client-token", null);
            }
        }

        public /* synthetic */ FacebookAnalytics(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private FacebookAnalytics(String str) {
            super("Facebook Analytics", str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FirebaseAnalytics;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "<init>", "(Ljava/lang/String;)V", "GoogleServicesNotApplied", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FirebaseAnalytics extends ServiceError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FirebaseAnalytics$GoogleServicesNotApplied;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GoogleServicesNotApplied extends FacebookAnalytics {
            public static final GoogleServicesNotApplied INSTANCE = new GoogleServicesNotApplied();

            private GoogleServicesNotApplied() {
                super("com.google.gms:google-services was not applied, see https://firebase.google.com/docs/android/setup", null);
            }
        }

        public /* synthetic */ FirebaseAnalytics(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private FirebaseAnalytics(String str) {
            super("Firebase Analytics", str, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$IAPValidationTimeout;", "Lcom/appodeal/ads/service/ServiceError;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IAPValidationTimeout extends ServiceError {
        public static final IAPValidationTimeout INSTANCE = new IAPValidationTimeout();

        private IAPValidationTimeout() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$InitializationTimeout;", "Lcom/appodeal/ads/service/ServiceError;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitializationTimeout extends ServiceError {
        public static final InitializationTimeout INSTANCE = new InitializationTimeout();

        private InitializationTimeout() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Internal;", "Lcom/appodeal/ads/service/ServiceError;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Internal extends ServiceError {
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$PurchaseValidationServiceDisabled;", "Lcom/appodeal/ads/service/ServiceError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PurchaseValidationServiceDisabled extends ServiceError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseValidationServiceDisabled(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$PurchaseValidationServiceNotFound;", "Lcom/appodeal/ads/service/ServiceError;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PurchaseValidationServiceNotFound extends ServiceError {
        public static final PurchaseValidationServiceNotFound INSTANCE = new PurchaseValidationServiceNotFound();

        private PurchaseValidationServiceNotFound() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "<init>", "(Ljava/lang/String;)V", "NoDsnProvided", "NoEnvironmentProvided", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoDsnProvided;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoEnvironmentProvided;", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class SentryAnalytics extends ServiceError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoDsnProvided;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoDsnProvided extends SentryAnalytics {
            public static final NoDsnProvided INSTANCE = new NoDsnProvided();

            private NoDsnProvided() {
                super("DSN not provided", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoEnvironmentProvided;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "<init>", "()V", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoEnvironmentProvided extends SentryAnalytics {
            public static final NoEnvironmentProvided INSTANCE = new NoEnvironmentProvided();

            private NoEnvironmentProvided() {
                super("Environment not provided", null);
            }
        }

        public /* synthetic */ SentryAnalytics(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private SentryAnalytics(String str) {
            super("Sentry Analytics", str, null);
        }
    }

    public /* synthetic */ ServiceError(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getDescription() {
        return this.description;
    }

    public /* synthetic */ ServiceError(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new String() : str, (i10 & 2) != 0 ? new String() : str2, null);
    }

    private ServiceError(String str, String str2) {
        super(str2);
        this.componentName = str;
        this.description = str2;
    }
}
