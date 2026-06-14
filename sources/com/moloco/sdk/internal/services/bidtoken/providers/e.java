package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55394d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55395e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f55396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f55397c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55396b = context;
        this.f55397c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55397c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        d dVar = new d(e());
        boolean z10 = !Intrinsics.areEqual(dVar, this.f55397c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI needsRefresh: " + z10 + ", with adi: " + dVar.a(), false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "ADISignalProvider";
    }

    public final Long e() {
        try {
            return Long.valueOf(this.f55396b.getFilesDir().getTotalSpace());
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ADISignalProvider", "ADI Error", e10, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d d() {
        d dVar = this.f55397c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI providing " + dVar.a(), false, 4, null);
        return dVar;
    }
}
