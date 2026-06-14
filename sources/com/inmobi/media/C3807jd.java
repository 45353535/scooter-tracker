package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3807jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3832kd f38808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ua f38812e;

    public C3807jd(C3832kd landingPageModel) {
        Intrinsics.checkNotNullParameter(landingPageModel, "landingPageModel");
        this.f38808a = landingPageModel;
        C3758hd c3758hd = new C3758hd(this);
        C3783id c3783id = new C3783id(this);
        this.f38812e = new Ua(landingPageModel.f38875a, new Va(false, landingPageModel.f38878d.f38114i, landingPageModel.f38876b.f36898a.f39234b.getCctEnabled(), 16), c3758hd, c3783id, landingPageModel.f38878d, landingPageModel.f38881g, 128);
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f38809b = jElapsedRealtime;
        InterfaceC3878m9 interfaceC3878m9 = this.f38808a.f38881g;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + jElapsedRealtime + ", lastClickedAssetUrl=" + this.f38810c);
        }
        String str = this.f38810c;
        if (str != null) {
            a(str, this.f38811d);
        }
    }

    public final void b(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3878m9 interfaceC3878m9 = this.f38808a.f38881g;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + url + ", fallbackUrl=" + str);
        }
        this.f38810c = url;
        this.f38811d = str;
        C3832kd c3832kd = this.f38808a;
        if (c3832kd.f38876b.f36898a.f39233a.f37146f) {
            InterfaceC3878m9 interfaceC3878m92 = c3832kd.f38881g;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((AbstractC3744h) this.f38808a.f38880f).a(MapsKt.emptyMap());
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = c3832kd.f38881g;
        if (interfaceC3878m93 != null) {
            ((C3903n9) interfaceC3878m93).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((AbstractC3744h) this.f38808a.f38880f).a(MapsKt.emptyMap());
        a();
    }

    public final void a(String str, String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38808a.f38881g;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        Ta taA = Ua.a(this.f38812e, "nativeOpen", (String) null, str, (Ya) null, 24);
        InterfaceC3878m9 interfaceC3878m92 = this.f38808a.f38881g;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("PublisherViewClickHandler", "processOpenRequest result: " + taA.f37760a);
        }
        if (taA.f37760a == 1) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38808a.f38881g;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 != null) {
            InterfaceC3878m9 interfaceC3878m94 = this.f38808a.f38881g;
            if (interfaceC3878m94 != null) {
                ((C3903n9) interfaceC3878m94).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
            }
            a(str2, null);
            return;
        }
        InterfaceC3878m9 interfaceC3878m95 = this.f38808a.f38881g;
        if (interfaceC3878m95 != null) {
            ((C3903n9) interfaceC3878m95).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void b() {
        C3832kd c3832kd = this.f38808a;
        InterfaceC3878m9 interfaceC3878m9 = c3832kd.f38881g;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c3832kd.f38876b.f36898a.f39233a.f37146f);
        }
        if (this.f38808a.f38876b.f36898a.f39233a.f37146f) {
            a();
        }
    }

    public final void a(Intent intent) {
        C3832kd c3832kd = this.f38808a;
        InterfaceC3878m9 interfaceC3878m9 = c3832kd.f38881g;
        if (interfaceC3878m9 != null) {
            G g10 = c3832kd.f38876b;
            ((C3903n9) interfaceC3878m9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g10.f36902e + ", placementId=" + g10.f36898a.f39233a.f37141a);
        }
        intent.putExtra("creativeId", this.f38808a.f38876b.f36902e);
        intent.putExtra("impressionId", this.f38808a.f38876b.f36910m.f36818b);
        intent.putExtra("placementId", this.f38808a.f38876b.f36898a.f39233a.f37141a);
        intent.putExtra("supportLockScreen", this.f38808a.f38877c);
        Context context = Ji.f37157a;
        Context context2 = this.f38808a.f38875a;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context2.startActivity(intent);
        InterfaceC3878m9 interfaceC3878m92 = this.f38808a.f38881g;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }
}
