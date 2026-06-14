package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4272d2 implements Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f42851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.e f42852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42853c;

    public C4272d2(@NotNull V0 adTools, @NotNull com.ironsource.mediationsdk.e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.f42851a = adTools;
        this.f42852b = auctionHandler;
    }

    @Override // com.ironsource.Sc
    public void a(@NotNull AbstractC4643z instance, @Nullable String str, @NotNull C4432ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f42852b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.Sc
    public void a(@NotNull List<? extends AbstractC4643z> waterfallInstances, @NotNull AbstractC4643z winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.f42853c) {
            return;
        }
        this.f42853c = true;
        C4424m2 c4424m2H = winnerInstance.h();
        this.f42852b.a(c4424m2H, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C4424m2> concurrentHashMap = new ConcurrentHashMap<>();
        for (AbstractC4643z abstractC4643z : waterfallInstances) {
            arrayList.add(abstractC4643z.p());
            concurrentHashMap.put(abstractC4643z.p(), abstractC4643z.h());
        }
        this.f42852b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), c4424m2H);
    }

    private final void a(C4432ma c4432ma, AbstractC4643z abstractC4643z) {
        final W8 w82 = new W8(abstractC4643z.e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c4432ma.a())) {
            this.f42851a.e(new Runnable() { // from class: com.ironsource.mk
                @Override // java.lang.Runnable
                public final void run() {
                    C4272d2.a(this.f44420b, impressionDataListener, w82);
                }
            });
            this.f42851a.e().h().a(w82);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4272d2 this$0, ImpressionDataListener listener, W8 impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        IronLog.CALLBACK.verbose(C4441n0.a(this$0.f42851a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
