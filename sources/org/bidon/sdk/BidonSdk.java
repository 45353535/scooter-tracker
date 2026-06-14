package org.bidon.sdk;

import android.content.Context;
import com.ironsource.A1;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.config.InitializationCallback;
import org.bidon.sdk.config.impl.Bidon;
import org.bidon.sdk.databinders.app.UnitySpecificInfo;
import org.bidon.sdk.logs.logging.Logger;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.sdk.segment.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010%\u001a\u00020\"H\u0007J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0014H\u0007J\b\u0010(\u001a\u00020\u0000H\u0007J!\u0010)\u001a\u00020\u00002\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,H\u0007¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0007H\u0007J\u0010\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u000202H\u0007J\u0010\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0007H\u0007J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0007H\u0007J\u001a\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0007J\u0014\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010>H\u0007J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0007H\u0007J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0007H\u0007J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010$¨\u0006E"}, d2 = {"Lorg/bidon/sdk/BidonSdk;", "", "<init>", "()V", "DefaultPricefloor", "", "SdkVersion", "", "bidon", "Lorg/bidon/sdk/config/impl/Bidon;", "getBidon$bidon_productionRelease", "()Lorg/bidon/sdk/config/impl/Bidon;", "bidon$delegate", "Lkotlin/Lazy;", A1.f40174i, "Lorg/bidon/sdk/segment/Segment;", "getSegment$annotations", "getSegment", "()Lorg/bidon/sdk/segment/Segment;", "loggerLevel", "Lorg/bidon/sdk/logs/logging/Logger$Level;", "getLoggerLevel$annotations", "getLoggerLevel", "()Lorg/bidon/sdk/logs/logging/Logger$Level;", "regulation", "Lorg/bidon/sdk/regulation/Regulation;", "getRegulation$annotations", "getRegulation", "()Lorg/bidon/sdk/regulation/Regulation;", "baseUrl", "getBaseUrl$annotations", "getBaseUrl", "()Ljava/lang/String;", "isTestMode", "", "isTestMode$annotations", "()Z", "isInitialized", "setLoggerLevel", "logLevel", "registerDefaultAdapters", "registerAdapters", "adapters", "", "Lorg/bidon/sdk/adapter/Adapter;", "([Lorg/bidon/sdk/adapter/Adapter;)Lorg/bidon/sdk/BidonSdk;", "registerAdapter", "adaptersClassName", "setInitializationCallback", "initializationCallback", "Lorg/bidon/sdk/config/InitializationCallback;", "setBaseUrl", "host", MobileAdsBridgeBase.initializeMethodName, "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "appKey", "addExtra", C4240b4.i.W, "value", "getExtras", "", "setTestMode", "setFramework", "framework", "setFrameworkVersion", "version", "setPluginVersion", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidonSdk {
    public static final double DefaultPricefloor = 0.0d;

    @NotNull
    public static final String SdkVersion = "0.13.0";

    @NotNull
    public static final BidonSdk INSTANCE = new BidonSdk();

    /* JADX INFO: renamed from: bidon$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy bidon = i.a(new Function0() { // from class: org.bidon.sdk.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BidonSdk.bidon_delegate$lambda$0();
        }
    });

    private BidonSdk() {
    }

    @NotNull
    public static final BidonSdk addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().addExtra(key, value);
        return bidonSdk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bidon bidon_delegate$lambda$0() {
        return new Bidon();
    }

    @NotNull
    public static final String getBaseUrl() {
        return INSTANCE.getBidon$bidon_productionRelease().getBaseUrl();
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    @NotNull
    public static final Map<String, Object> getExtras() {
        return INSTANCE.getBidon$bidon_productionRelease().getExtras();
    }

    @NotNull
    public static final Logger.Level getLoggerLevel() {
        return INSTANCE.getBidon$bidon_productionRelease().getLoggerLevel();
    }

    public static /* synthetic */ void getLoggerLevel$annotations() {
    }

    @NotNull
    public static final Regulation getRegulation() {
        return INSTANCE.getBidon$bidon_productionRelease().getRegulation();
    }

    public static /* synthetic */ void getRegulation$annotations() {
    }

    @NotNull
    public static final Segment getSegment() {
        return INSTANCE.getBidon$bidon_productionRelease().getSegment();
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    public static final void initialize(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Bidon bidon$bidon_productionRelease = INSTANCE.getBidon$bidon_productionRelease();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        bidon$bidon_productionRelease.initialize(applicationContext, appKey);
    }

    public static final boolean isInitialized() {
        return INSTANCE.getBidon$bidon_productionRelease().isInitialized();
    }

    public static final boolean isTestMode() {
        return INSTANCE.getBidon$bidon_productionRelease().isTestMode();
    }

    public static /* synthetic */ void isTestMode$annotations() {
    }

    @NotNull
    public static final BidonSdk registerAdapter(@NotNull String adaptersClassName) {
        Intrinsics.checkNotNullParameter(adaptersClassName, "adaptersClassName");
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().registerAdapter(adaptersClassName);
        return bidonSdk;
    }

    @NotNull
    public static final BidonSdk registerAdapters(@NotNull Adapter... adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().registerAdapters((Adapter[]) Arrays.copyOf(adapters, adapters.length));
        return bidonSdk;
    }

    @NotNull
    public static final BidonSdk registerDefaultAdapters() {
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().registerDefaultAdapters();
        return bidonSdk;
    }

    @NotNull
    public static final BidonSdk setBaseUrl(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().setBaseUrl(host);
        return bidonSdk;
    }

    @NotNull
    public static final BidonSdk setFramework(@NotNull String framework) {
        Intrinsics.checkNotNullParameter(framework, "framework");
        UnitySpecificInfo.INSTANCE.setFrameworkName(framework);
        return INSTANCE;
    }

    @NotNull
    public static final BidonSdk setFrameworkVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        UnitySpecificInfo.INSTANCE.setFrameworkVersion(version);
        return INSTANCE;
    }

    @NotNull
    public static final BidonSdk setInitializationCallback(@NotNull InitializationCallback initializationCallback) {
        Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().setInitializationCallback(initializationCallback);
        return bidonSdk;
    }

    @NotNull
    public static final BidonSdk setLoggerLevel(@NotNull Logger.Level logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().setLogLevel(logLevel);
        return bidonSdk;
    }

    @NotNull
    public static final BidonSdk setPluginVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        UnitySpecificInfo.INSTANCE.setPluginVersion(version);
        return INSTANCE;
    }

    @NotNull
    public static final BidonSdk setTestMode(boolean isTestMode) {
        BidonSdk bidonSdk = INSTANCE;
        bidonSdk.getBidon$bidon_productionRelease().setTestMode(isTestMode);
        return bidonSdk;
    }

    @NotNull
    public final Bidon getBidon$bidon_productionRelease() {
        return (Bidon) bidon.getValue();
    }
}
