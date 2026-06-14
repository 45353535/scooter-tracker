package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements BillingInfoSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f74974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f74975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f74976c;

    public j(@NotNull ServiceComponentModuleReporter serviceComponentModuleReporter, @NotNull Executor executor, @NotNull o oVar) {
        this.f74974a = serviceComponentModuleReporter;
        this.f74975b = executor;
        this.f74976c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f74974a;
        ServiceModuleCounterReport.Builder builderWithType = ServiceModuleCounterReport.INSTANCE.newBuilder().withType(40976);
        jVar.f74976c.getClass();
        serviceComponentModuleReporter.handleReport(builderWithType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@NotNull List<? extends ProductInfo> list) {
        for (final ProductInfo productInfo : list) {
            this.f74975b.execute(new Runnable() { // from class: o8.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(this.f96363b, productInfo);
                }
            });
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(serviceComponentModuleReporter, executor, (i10 & 4) != 0 ? new o() : oVar);
    }
}
