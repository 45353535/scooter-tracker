package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Dd extends AbstractC4167y implements InterfaceC3636cj, InterfaceC3693f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ec f36725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jc f36726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3669e1 f36727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f36728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4117w f36729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dd(Ec nativeAdUnitComponent, Jc stateMachine) {
        NativeMedia media;
        super(nativeAdUnitComponent.f36789a);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f36725b = nativeAdUnitComponent;
        this.f36726c = stateMachine;
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "<this>");
        JsonAssetObject assetsObject = nativeAdUnitComponent.f36790b.getAssetsObject();
        CoroutineScope coroutineScope = nativeAdUnitComponent.f36789a.f39882a.f39147e;
        this.f36727d = Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video") ? new Ae(coroutineScope, nativeAdUnitComponent.f36789a.f39882a.f39145c) : new Cc(coroutineScope, nativeAdUnitComponent.f36789a.f39882a.f39145c);
        this.f36728e = P4.a(k());
        C4142x adComponent = nativeAdUnitComponent.f36789a;
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.f36790b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f36729f = new C4117w(adComponent.f39882a.f39144b, adChoice, adComponent.f39883b.f36898a.f39234b.getNative().getAdChoiceConfig(), adComponent.f39882a.f39145c);
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        eg.i.d(this.f36728e, null, null, new C4006rd(this, null), 3, null);
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
        F3.a(this.f36728e);
    }

    @Override // com.inmobi.media.InterfaceC3693f
    public final Object a(Continuation continuation) {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeLoadingState", "onDestroy");
        }
        Object objA = this.f36726c.a(new Vc(), this, (kotlin.coroutines.jvm.internal.d) continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.Deferred r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Bd
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Bd r0 = (com.inmobi.media.Bd) r0
            int r1 = r0.f36623c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36623c = r1
            goto L18
        L13:
            com.inmobi.media.Bd r0 = new com.inmobi.media.Bd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f36621a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36623c
            java.lang.String r3 = "NativeLoadingState"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.d.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L41
        L2b:
            r6 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.d.b(r7)
            r0.f36623c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r6.await(r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L41
            return r1
        L41:
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Exception -> L2b
            com.inmobi.media.m9 r6 = r5.l()     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L50
            java.lang.String r0 = "waitForAdChoiceView - ad choice view inflated successfully"
            com.inmobi.media.n9 r6 = (com.inmobi.media.C3903n9) r6     // Catch: java.lang.Exception -> L2b
            r6.a(r3, r0)     // Catch: java.lang.Exception -> L2b
        L50:
            return r7
        L51:
            com.inmobi.media.Ec r7 = r5.f36725b
            com.inmobi.media.x r7 = r7.f36789a
            com.inmobi.media.o1 r7 = r7.f39882a
            com.inmobi.media.n9 r7 = r7.f39145c
            if (r7 == 0) goto L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdChoiceView inflation failed: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.b(r3, r6)
        L6f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Dd.a(kotlinx.coroutines.Deferred, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a(MediaView mediaView, View view, Nc nc2) {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.f36726c.a(new C3982qd(mediaView, view, this.f36727d, nc2, this.f36725b, this.f36726c), this);
    }

    public final void a(short s10) {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeLoadingState", "transitionToFailedState - errorCode: " + ((int) s10));
        }
        this.f36726c.a(new Xc(s10, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f36725b, this.f36726c), this);
    }
}
