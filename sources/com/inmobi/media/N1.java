package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class N1 extends C3567a2 {
    public final T1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(Context context, C4093v0 placement, W1 w12) {
        super(context, placement, w12);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.K = new T1();
    }

    @Override // com.inmobi.media.C3567a2
    public final boolean V() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3903n9.c("l1", "canProceedToLoad");
        }
        E();
        byte b10 = this.f38916b;
        if (1 == b10 || 2 == b10) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            Kb.a((byte) 1, "l1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n92.b("l1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == b10) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f38926l.f39711a);
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n93.b("l1", "Ad is active. ignore load");
            }
            return false;
        }
        if (b10 == 4) {
            if (!z()) {
                C3903n9 c3903n94 = this.f38923i;
                if (c3903n94 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n94.c("l1", "signalCanShowForStateReady");
                }
                C3903n9 c3903n95 = this.f38923i;
                if (c3903n95 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n95.a("l1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3721g1 abstractC3721g1M = m();
                if (abstractC3721g1M == null) {
                    Kb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    C3903n9 c3903n96 = this.f38923i;
                    if (c3903n96 != null) {
                        Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                        c3903n96.b("l1", "listener is null. load show callback missed");
                    }
                } else {
                    C3903n9 c3903n97 = this.f38923i;
                    if (c3903n97 != null) {
                        Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                        c3903n97.a("l1", "callback - onLoadSuccess");
                    }
                    d(abstractC3721g1M);
                }
                return false;
            }
            C3903n9 c3903n98 = this.f38923i;
            if (c3903n98 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n98.b("l1", "ad is expired, clearing");
            }
            d();
        }
        D();
        return true;
    }

    @Override // com.inmobi.media.C3567a2, com.inmobi.media.AbstractC3686ei
    public final void a(V1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.a(audioStatusInternal);
        }
        T1 t12 = this.K;
        t12.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!t12.f37753a && audioStatusInternal == V1.f37872e) {
            t12.f37753a = true;
            T8 t82 = T8.f37759c;
            t82.f38537a = System.currentTimeMillis();
            t82.f38538b++;
        }
    }

    public final void c0() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3903n9.d("l1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        e((short) 2153);
    }

    public final void e(short s10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3903n9.c("l1", "onShowFailure");
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M == null) {
            Kb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n92.b("l1", "listener is null. show fail callback missed. ");
            }
        } else {
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n93.b("l1", "callback - onAdShowFailed");
            }
            abstractC3721g1M.b();
        }
        if (s10 != 0) {
            C3903n9 c3903n94 = this.f38923i;
            if (c3903n94 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n94.b("l1", "show failed - " + ((int) s10));
            }
            d(s10);
        }
    }

    @Override // com.inmobi.media.C3567a2, com.inmobi.media.AbstractC3845l1, com.inmobi.media.AbstractC3686ei
    public final void j(GestureDetectorOnGestureListenerC3635ci renderView) {
        AbstractC3721g1 abstractC3721g1M;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
            c3903n9.c("l1", "onRenderViewVisible");
        }
        if (this.f38916b == 4 && (abstractC3721g1M = m()) != null) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n92.a("l1", "callback - onAdDisplayed");
            }
            a(abstractC3721g1M);
        }
        super.j(renderView);
    }

    @Override // com.inmobi.media.C3567a2, com.inmobi.media.AbstractC3845l1
    public final String l() {
        return "audio";
    }

    @Override // com.inmobi.media.C3567a2, com.inmobi.media.AbstractC3686ei
    public final void a(boolean z10) {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", C4240b4.i.W);
        int i10 = eaA.f36783a.getInt("user_mute_count", 0);
        eaA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }
}
