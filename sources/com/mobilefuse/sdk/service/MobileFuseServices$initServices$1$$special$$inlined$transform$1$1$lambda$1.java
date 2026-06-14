package com.mobilefuse.sdk.service;

import androidx.core.app.NotificationCompat;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.FlowCollector;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"serviceCallback", "", NotificationCompat.CATEGORY_SERVICE, "Lcom/mobilefuse/sdk/service/MobileFuseService;", "success", "", "invoke", "com/mobilefuse/sdk/service/MobileFuseServices$initServices$1$2$1"}, k = 3, mv = {1, 4, 3})
final class MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 extends Lambda implements Function2<MobileFuseService, Boolean, Unit> {
    final /* synthetic */ Set $services;
    final /* synthetic */ Map $servicesResultMap;
    final /* synthetic */ FlowCollector $this_transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1(FlowCollector flowCollector, Map map, Set set) {
        super(2);
        this.$this_transform = flowCollector;
        this.$servicesResultMap = map;
        this.$services = set;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MobileFuseService mobileFuseService, Boolean bool) {
        invoke(mobileFuseService, bool.booleanValue());
        return Unit.f93236a;
    }

    public final void invoke(@NotNull MobileFuseService service, boolean z10) {
        Intrinsics.checkNotNullParameter(service, "service");
        MobileFuseServices mobileFuseServices = MobileFuseServices.INSTANCE;
        MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "Service \"" + service + "\" completed initialization with success result: " + z10);
        Map map = this.$servicesResultMap;
        Pair pair = TuplesKt.to(service, Boolean.valueOf(z10));
        map.put(pair.getFirst(), pair.getSecond());
        if (this.$servicesResultMap.size() == this.$services.size()) {
            MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "All services completed initialization. Emit completion signal");
            this.$this_transform.emit(new SuccessResult(this.$servicesResultMap));
        }
    }
}
