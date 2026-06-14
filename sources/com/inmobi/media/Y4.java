package com.inmobi.media;

import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsClient;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Y4 extends AbstractC3668e0 implements InterfaceC3636cj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3920o1 f38022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f38023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f38024j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(C3920o1 adManagerComponent, Hc publisherCallbacks, Ac stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38022h = adManagerComponent;
        this.f38023i = publisherCallbacks;
        this.f38024j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
    }

    public final boolean b() {
        try {
            kotlin.jvm.internal.v0.b(Picasso.class).getSimpleName();
            try {
                kotlin.jvm.internal.v0.b(CustomTabsClient.class).getSimpleName();
                return false;
            } catch (NoClassDefFoundError unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    public final void a(byte[] bArr) {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.a("AUM-CreatedState", "load called: " + (bArr != null ? new String(bArr, Charsets.UTF_8) : null));
        }
        C3617c0 c3617c0 = this.f38480f;
        c3617c0.getClass();
        c3617c0.f38308a = SystemClock.elapsedRealtime();
        C3869m0 c3869m0 = this.f38481g;
        eg.i.d(c3869m0.f38999a, null, null, new C3694f0(c3869m0, null), 3, null);
        if (b()) {
            C3903n9 c3903n92 = this.f38479e;
            if (c3903n92 != null) {
                c3903n92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3920o1 adManagerComponent = this.f38022h;
        Ac stateMachine = this.f38024j;
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C3602bb adUnitTimeout = new C3602bb(adManagerComponent, stateMachine);
        Tc tc2 = (Tc) this;
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        C3903n9 c3903n93 = tc2.f38479e;
        if (c3903n93 != null) {
            c3903n93.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        tc2.f37764m.a(new C3907nd(bArr, tc2.f37762k, adUnitTimeout, tc2.f37763l, tc2.f37764m), tc2);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.f38024j.a(new C3654db((short) 2007, inMobiAdRequestStatus, this.f38022h, this.f38023i, this.f38024j), this);
    }
}
