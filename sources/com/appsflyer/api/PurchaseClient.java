package com.appsflyer.api;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.BuildConfig;
import com.appsflyer.common.ExtentionsKt;
import com.appsflyer.exceptions.SDKMissingException;
import com.appsflyer.internal.connectors.BillingClientConnector;
import com.appsflyer.internal.connectors.GoogleConnector;
import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u0000 \u00062\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/appsflyer/api/PurchaseClient;", "", "startObservingTransactions", "", "stopObservingTransactions", "Builder", y.f66058y, "InAppPurchaseEventDataSource", "InAppPurchaseValidationResultListener", "PurchaseEventDataSource", "SubscriptionPurchaseEventDataSource", "SubscriptionPurchaseValidationResultListener", "ValidationResultListener", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PurchaseClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0017J\u0012\u0010!\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0016\u0010\"\u001a\u00020\u00002\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0007J\u0012\u0010$\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010%\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0010J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0017J\u0010\u0010+\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0019J\u0010\u0010,\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u001bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$Builder;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "store", "Lcom/appsflyer/api/Store;", "(Landroid/content/Context;Lcom/appsflyer/api/Store;)V", "afClient", "Lcom/appsflyer/AppsFlyerLib;", "billingClientFactory", "Lcom/appsflyer/internal/connectors/BillingClientConnector$BillingClientFactory;", "connector", "Lcom/appsflyer/internal/connectors/BillingClientConnector;", "inAppPurchaseEventDataSource", "Lcom/appsflyer/api/PurchaseClient$InAppPurchaseEventDataSource;", "inAppValidationResultListener", "Lcom/appsflyer/api/PurchaseClient$InAppPurchaseValidationResultListener;", "purchaseDatabaseHelper", "Lcom/appsflyer/internal/db/PurchaseDatabaseHelper;", "purchaseTypes", "", "", "sandbox", "", "subscriptionPurchaseEventDataSource", "Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseEventDataSource;", "subscriptionValidationResultListener", "Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseValidationResultListener;", "autoLogInApps", "enabled", "build", "Lcom/appsflyer/api/PurchaseClient;", "logSubscriptions", "setAfClient", "setBillingClientFactory", "factory", "setConnector", "setInAppPurchaseEventDataSource", "dataSource", "setInAppValidationResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSandbox", "isSandbox", "setSubscriptionPurchaseEventDataSource", "setSubscriptionValidationResultListener", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private AppsFlyerLib afClient;

        @Nullable
        private BillingClientConnector.BillingClientFactory<?> billingClientFactory;

        @Nullable
        private BillingClientConnector connector;

        @NotNull
        private final Context context;

        @Nullable
        private InAppPurchaseEventDataSource inAppPurchaseEventDataSource;

        @Nullable
        private InAppPurchaseValidationResultListener inAppValidationResultListener;

        @NotNull
        private final PurchaseDatabaseHelper purchaseDatabaseHelper;

        @NotNull
        private final Set<String> purchaseTypes;
        private boolean sandbox;

        @NotNull
        private final Store store;

        @Nullable
        private SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource;

        @Nullable
        private SubscriptionPurchaseValidationResultListener subscriptionValidationResultListener;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Store.values().length];
                try {
                    iArr[Store.GOOGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Builder(@NotNull Context context, @NotNull Store store) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(store, "store");
            this.store = store;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.context = applicationContext;
            this.purchaseDatabaseHelper = new PurchaseDatabaseHelper(context);
            this.purchaseTypes = new HashSet();
        }

        @NotNull
        public final Builder autoLogInApps(boolean enabled) {
            if (enabled) {
                this.purchaseTypes.add("inapp");
                return this;
            }
            this.purchaseTypes.remove("inapp");
            return this;
        }

        @NotNull
        public final PurchaseClient build() throws SDKMissingException {
            try {
                if (this.afClient == null) {
                    this.afClient = AppsFlyerLib.getInstance();
                }
                if (WhenMappings.$EnumSwitchMapping$0[this.store.ordinal()] == 1 && this.connector == null) {
                    Context context = this.context;
                    this.connector = new GoogleConnector(context, (GoogleConnector.GoogleClientFactory) this.billingClientFactory, ExtentionsKt.getSharedPreferences(context), this.purchaseDatabaseHelper);
                }
                Context context2 = this.context;
                boolean z10 = this.sandbox;
                BillingClientConnector billingClientConnector = this.connector;
                Intrinsics.checkNotNull(billingClientConnector);
                Set<String> set = this.purchaseTypes;
                SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener = this.subscriptionValidationResultListener;
                InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener = this.inAppValidationResultListener;
                SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource = this.subscriptionPurchaseEventDataSource;
                InAppPurchaseEventDataSource inAppPurchaseEventDataSource = this.inAppPurchaseEventDataSource;
                AppsFlyerLib appsFlyerLib = this.afClient;
                Intrinsics.checkNotNull(appsFlyerLib);
                return new PurchaseClientImpl(context2, z10, billingClientConnector, set, subscriptionPurchaseValidationResultListener, inAppPurchaseValidationResultListener, subscriptionPurchaseEventDataSource, inAppPurchaseEventDataSource, appsFlyerLib, this.purchaseDatabaseHelper);
            } catch (NoClassDefFoundError e10) {
                Log.w("AppsFlyer_Connector", "[PurchaseConnector]: AppsFlyer SDK required!");
                e10.printStackTrace();
                throw new SDKMissingException();
            }
        }

        @NotNull
        public final Builder logSubscriptions(boolean enabled) {
            if (enabled) {
                this.purchaseTypes.add("subs");
                return this;
            }
            this.purchaseTypes.remove("subs");
            return this;
        }

        @VisibleForTesting
        @NotNull
        public final Builder setAfClient(@Nullable AppsFlyerLib afClient) {
            this.afClient = afClient;
            return this;
        }

        @VisibleForTesting
        @NotNull
        public final Builder setBillingClientFactory(@Nullable BillingClientConnector.BillingClientFactory<?> factory) {
            this.billingClientFactory = factory;
            return this;
        }

        @VisibleForTesting
        @NotNull
        public final Builder setConnector(@Nullable BillingClientConnector connector) {
            this.connector = connector;
            return this;
        }

        @NotNull
        public final Builder setInAppPurchaseEventDataSource(@Nullable InAppPurchaseEventDataSource dataSource) {
            this.inAppPurchaseEventDataSource = dataSource;
            return this;
        }

        @NotNull
        public final Builder setInAppValidationResultListener(@Nullable InAppPurchaseValidationResultListener listener) {
            this.inAppValidationResultListener = listener;
            return this;
        }

        @NotNull
        public final Builder setSandbox(boolean isSandbox) {
            this.sandbox = isSandbox;
            return this;
        }

        @NotNull
        public final Builder setSubscriptionPurchaseEventDataSource(@Nullable SubscriptionPurchaseEventDataSource dataSource) {
            this.subscriptionPurchaseEventDataSource = dataSource;
            return this;
        }

        @NotNull
        public final Builder setSubscriptionValidationResultListener(@Nullable SubscriptionPurchaseValidationResultListener listener) {
            this.subscriptionValidationResultListener = listener;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$Companion;", "", "()V", "VERSION_NAME", "", "getVERSION_NAME$annotations", "getVERSION_NAME", "()Ljava/lang/String;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String VERSION_NAME = BuildConfig.VERSION_NAME;

        private Companion() {
        }

        public static /* synthetic */ void getVERSION_NAME$annotations() {
        }

        @NotNull
        public final String getVERSION_NAME() {
            return VERSION_NAME;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$InAppPurchaseEventDataSource;", "Lcom/appsflyer/api/PurchaseClient$PurchaseEventDataSource;", "Lcom/appsflyer/api/InAppPurchaseEvent;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface InAppPurchaseEventDataSource extends PurchaseEventDataSource<InAppPurchaseEvent> {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$InAppPurchaseValidationResultListener;", "Lcom/appsflyer/api/PurchaseClient$ValidationResultListener;", "", "", "Lcom/appsflyer/internal/models/InAppPurchaseValidationResult;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface InAppPurchaseValidationResultListener extends ValidationResultListener<Map<String, ? extends InAppPurchaseValidationResult>> {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¨\u0006\t"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$PurchaseEventDataSource;", "PurchaseType", "Lcom/appsflyer/api/PurchaseEvent;", "", "onNewPurchases", "", "", "purchaseEvents", "", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PurchaseEventDataSource<PurchaseType extends PurchaseEvent> {
        @NotNull
        Map<String, Object> onNewPurchases(@NotNull List<? extends PurchaseType> purchaseEvents);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseEventDataSource;", "Lcom/appsflyer/api/PurchaseClient$PurchaseEventDataSource;", "Lcom/appsflyer/api/SubscriptionPurchaseEvent;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SubscriptionPurchaseEventDataSource extends PurchaseEventDataSource<SubscriptionPurchaseEvent> {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$SubscriptionPurchaseValidationResultListener;", "Lcom/appsflyer/api/PurchaseClient$ValidationResultListener;", "", "", "Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SubscriptionPurchaseValidationResultListener extends ValidationResultListener<Map<String, ? extends SubscriptionValidationResult>> {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/appsflyer/api/PurchaseClient$ValidationResultListener;", "Result", "", "onFailure", "", "result", "", "error", "", "onResponse", "(Ljava/lang/Object;)V", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ValidationResultListener<Result> {
        void onFailure(@NotNull String result, @Nullable Throwable error);

        void onResponse(@Nullable Result result);
    }

    void startObservingTransactions();

    void stopObservingTransactions();
}
