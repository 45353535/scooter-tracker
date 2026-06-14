package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55450d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55451e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f55452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f55453c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public t(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        this.f55452b = activityManager;
        this.f55453c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] Updating m state", false, 4, null);
        this.f55453c = e();
    }

    public final boolean b(s sVar, s sVar2) {
        return (Intrinsics.areEqual(sVar.a(), sVar2.a()) && Intrinsics.areEqual(sVar.b(), sVar2.b()) && Intrinsics.areEqual(sVar.c(), sVar2.c())) ? false : true;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "MemorySignalProvider";
    }

    public final s e() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.f55452b.getMemoryInfo(memoryInfo);
            return new s(Boolean.valueOf(memoryInfo.lowMemory), Long.valueOf(memoryInfo.threshold), Long.valueOf(memoryInfo.totalMem));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] MI Error", e10, false, 8, null);
            return new s(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public s d() {
        s sVar = this.f55453c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] lm: " + sVar.a() + ", t: " + sVar.b() + ", tm: " + sVar.c(), false, 4, null);
        return sVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        s sVarE = e();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] cached lm: " + this.f55453c.a() + ", t: " + this.f55453c.b() + ", tm: " + this.f55453c.c(), false, 4, null);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] current lm: " + sVarE.a() + ", t: " + sVarE.b() + ", tm: " + sVarE.c(), false, 4, null);
        boolean zB = b(sVarE, this.f55453c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[CBT] m needsRefresh: ");
        sb2.append(zB);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", sb2.toString(), false, 4, null);
        return zB;
    }
}
