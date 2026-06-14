package com.moloco.sdk.internal.client_metrics_data;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0658a f54144c = new C0658a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54145d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f54147b;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.client_metrics_data.a$a, reason: collision with other inner class name */
    public static final class C0658a {
        public /* synthetic */ C0658a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0658a() {
        }
    }

    public a(com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54146a = metricsRecorder;
        this.f54147b = new AtomicBoolean(false);
    }

    public final void a() {
        this.f54147b.set(false);
    }

    public final void b(AdFormatType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (this.f54147b.compareAndSet(false, true)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AcmClickDeduper", "Deduped click logged", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar = this.f54146a;
            com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(b.G.g());
            String strG = c.f54175d.g();
            String lowerCase = adType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            aVar.b(cVar.e(strG, lowerCase));
        }
        this.f54147b.set(true);
    }
}
