package com.unity3d.services.core.request.metrics;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.log.Logger;
import eg.c0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/unity3d/services/core/request/metrics/MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Leg/c0;", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends a implements c0 {
    final /* synthetic */ List $metrics$inlined;
    final /* synthetic */ MetricSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(c0.b bVar, MetricSender metricSender, List list) {
        super(bVar);
        this.this$0 = metricSender;
        this.$metrics$inlined = list;
    }

    @Override // eg.c0
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        Logger.DefaultImpls.trace$default(this.this$0.logger, "Metric " + this.$metrics$inlined + " failed to send with error: " + exception, null, 2, null);
    }
}
