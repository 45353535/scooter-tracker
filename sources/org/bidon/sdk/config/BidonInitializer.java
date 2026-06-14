package org.bidon.sdk.config;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.bidon.sdk.adapter.Adapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0012H&J!\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H&¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000eH&J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000eH&J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0004\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lorg/bidon/sdk/config/BidonInitializer;", "", "isInitialized", "", "()Z", "initializationState", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/bidon/sdk/config/SdkState;", "getInitializationState", "()Lkotlinx/coroutines/flow/StateFlow;", "isTestMode", "setTestMode", "(Z)V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "registerDefaultAdapters", "", "registerAdapters", "adapters", "", "Lorg/bidon/sdk/adapter/Adapter;", "([Lorg/bidon/sdk/adapter/Adapter;)V", "registerAdapter", "adaptersClassName", "setInitializationCallback", "initializationCallback", "Lorg/bidon/sdk/config/InitializationCallback;", "setBaseUrl", "host", MobileAdsBridgeBase.initializeMethodName, POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "appKey", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BidonInitializer {
    @NotNull
    String getBaseUrl();

    @NotNull
    StateFlow getInitializationState();

    void initialize(@NotNull Context context, @NotNull String appKey);

    boolean isInitialized();

    boolean isTestMode();

    void registerAdapter(@NotNull String adaptersClassName);

    void registerAdapters(@NotNull Adapter... adapters);

    void registerDefaultAdapters();

    void setBaseUrl(@NotNull String host);

    void setInitializationCallback(@NotNull InitializationCallback initializationCallback);

    void setTestMode(boolean z10);
}
