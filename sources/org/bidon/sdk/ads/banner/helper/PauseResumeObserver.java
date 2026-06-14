package org.bidon.sdk.ads.banner.helper;

import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/PauseResumeObserver;", "", "lifecycleFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/bidon/sdk/ads/banner/helper/ActivityLifecycleState;", "getLifecycleFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PauseResumeObserver {
    @NotNull
    StateFlow getLifecycleFlow();
}
