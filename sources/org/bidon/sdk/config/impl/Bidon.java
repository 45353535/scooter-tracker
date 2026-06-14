package org.bidon.sdk.config.impl;

import android.content.Context;
import com.ironsource.A1;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.config.BidonInitializer;
import org.bidon.sdk.config.InitializationCallback;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.databinders.extras.ExtrasImpl;
import org.bidon.sdk.logs.logging.Logger;
import org.bidon.sdk.logs.logging.impl.LoggerImpl;
import org.bidon.sdk.regulation.Consent;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.sdk.regulation.impl.ConsentImpl;
import org.bidon.sdk.segment.Segment;
import org.bidon.sdk.segment.Segmentation;
import org.bidon.sdk.segment.impl.SegmentationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0001J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u000fH\u0096\u0001J\u0019\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000bH\u0096\u0001J\"\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0096\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\tH\u0096\u0001J\u0011\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0096\u0001J\u0011\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0096\u0001R\u0012\u0010$\u001a\u00020\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0012\u0010,\u001a\u00020-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010.R\u0018\u0010/\u001a\u00020-X\u0096\u000f¢\u0006\f\u001a\u0004\b/\u0010.\"\u0004\b0\u00101R\u0012\u00102\u001a\u00020#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0012\u00105\u001a\u000206X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0012\u00109\u001a\u00020:X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lorg/bidon/sdk/config/impl/Bidon;", "Lorg/bidon/sdk/config/BidonInitializer;", "Lorg/bidon/sdk/logs/logging/Logger;", "Lorg/bidon/sdk/databinders/extras/Extras;", "Lorg/bidon/sdk/segment/Segmentation;", "Lorg/bidon/sdk/regulation/Consent;", "<init>", "()V", "addExtra", "", C4240b4.i.W, "", "value", "", "getExtras", "", MobileAdsBridgeBase.initializeMethodName, POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "appKey", "registerAdapter", "adaptersClassName", "registerAdapters", "adapters", "", "Lorg/bidon/sdk/adapter/Adapter;", "([Lorg/bidon/sdk/adapter/Adapter;)V", "registerDefaultAdapters", "setBaseUrl", "host", "setInitializationCallback", "initializationCallback", "Lorg/bidon/sdk/config/InitializationCallback;", "setLogLevel", "logLevel", "Lorg/bidon/sdk/logs/logging/Logger$Level;", "baseUrl", "getBaseUrl", "()Ljava/lang/String;", "initializationState", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/bidon/sdk/config/SdkState;", "getInitializationState", "()Lkotlinx/coroutines/flow/StateFlow;", "isInitialized", "", "()Z", "isTestMode", "setTestMode", "(Z)V", "loggerLevel", "getLoggerLevel", "()Lorg/bidon/sdk/logs/logging/Logger$Level;", "regulation", "Lorg/bidon/sdk/regulation/Regulation;", "getRegulation", "()Lorg/bidon/sdk/regulation/Regulation;", A1.f40174i, "Lorg/bidon/sdk/segment/Segment;", "getSegment", "()Lorg/bidon/sdk/segment/Segment;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Bidon implements BidonInitializer, Logger, Extras, Segmentation, Consent {
    private final /* synthetic */ BidonInitializerImpl $$delegate_0 = new BidonInitializerImpl();
    private final /* synthetic */ LoggerImpl $$delegate_1 = new LoggerImpl();
    private final /* synthetic */ ExtrasImpl $$delegate_2 = new ExtrasImpl();
    private final /* synthetic */ SegmentationImpl $$delegate_3 = new SegmentationImpl();
    private final /* synthetic */ ConsentImpl $$delegate_4 = new ConsentImpl();

    @Override // org.bidon.sdk.databinders.extras.Extras
    public void addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.$$delegate_2.addExtra(key, value);
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    @NotNull
    public String getBaseUrl() {
        return this.$$delegate_0.getBaseUrl();
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    @NotNull
    public Map<String, Object> getExtras() {
        return this.$$delegate_2.getExtras();
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    @NotNull
    public StateFlow getInitializationState() {
        return this.$$delegate_0.getInitializationState();
    }

    @Override // org.bidon.sdk.logs.logging.Logger
    @NotNull
    public Logger.Level getLoggerLevel() {
        return this.$$delegate_1.getLoggerLevel();
    }

    @Override // org.bidon.sdk.regulation.Consent
    @NotNull
    public Regulation getRegulation() {
        return this.$$delegate_4.getRegulation();
    }

    @Override // org.bidon.sdk.segment.Segmentation
    @NotNull
    public Segment getSegment() {
        return this.$$delegate_3.getSegment();
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void initialize(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.$$delegate_0.initialize(context, appKey);
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public boolean isInitialized() {
        return this.$$delegate_0.isInitialized();
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void registerAdapter(@NotNull String adaptersClassName) {
        Intrinsics.checkNotNullParameter(adaptersClassName, "adaptersClassName");
        this.$$delegate_0.registerAdapter(adaptersClassName);
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void registerAdapters(@NotNull Adapter... adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.$$delegate_0.registerAdapters(adapters);
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void registerDefaultAdapters() {
        this.$$delegate_0.registerDefaultAdapters();
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void setBaseUrl(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.$$delegate_0.setBaseUrl(host);
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void setInitializationCallback(@NotNull InitializationCallback initializationCallback) {
        Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        this.$$delegate_0.setInitializationCallback(initializationCallback);
    }

    @Override // org.bidon.sdk.logs.logging.Logger
    public void setLogLevel(@NotNull Logger.Level logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.$$delegate_1.setLogLevel(logLevel);
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }
}
