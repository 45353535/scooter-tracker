package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3783id implements InterfaceC3911nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3807jd f38761a;

    public C3783id(C3807jd c3807jd) {
        this.f38761a = c3807jd;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final boolean a() {
        long userTouchResetTime = this.f38761a.f38808a.f38876b.f36898a.f39234b.getRendering().getUserTouchResetTime();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f38761a.f38809b;
        return j10 != 0 && jElapsedRealtime - j10 < userTouchResetTime;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final boolean c() {
        return !this.f38761a.f38808a.f38876b.f36898a.f39234b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final long getViewTouchTimestamp() {
        return this.f38761a.f38809b;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final void a(String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        Map mapA = AbstractC3789ik.a(this.f38761a.f38808a.f38879e.f36723a);
        Wj wj = Wj.f37959a;
        Wj.b("BlockAutoRedirection", mapA, EnumC3585ak.f38215a);
    }
}
