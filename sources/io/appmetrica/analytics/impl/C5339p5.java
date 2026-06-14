package io.appmetrica.analytics.impl;

import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5339p5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f77961a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NotNull
    public final String getDescription() {
        return CollectionsKt.joinToString$default(this.f77961a, null, "Composite processor with " + this.f77961a.size() + " children: [", C4240b4.j.f42674e, 0, null, C5314o5.f77881a, 25, null);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@NotNull Object... objArr) {
        Object next;
        boolean zProcess;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        Iterator it = this.f77961a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ModuleAdRevenueProcessor moduleAdRevenueProcessor = (ModuleAdRevenueProcessor) next;
            try {
                zProcess = moduleAdRevenueProcessor.process(Arrays.copyOf(objArr, objArr.length));
                if (!zProcess) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
            } catch (Throwable th2) {
                LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
            }
            if (zProcess) {
                break;
            }
        }
        boolean z10 = ((ModuleAdRevenueProcessor) next) != null;
        if (!z10) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(@NotNull ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.f77961a.add(moduleAdRevenueProcessor);
    }
}
