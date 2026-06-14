package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3648d5 extends CustomTabsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3673e5 f38425a;

    public C3648d5(C3673e5 c3673e5) {
        this.f38425a = c3673e5;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle extras) throws JSONException {
        Intrinsics.checkNotNullParameter(extras, "extras");
        super.onActivityLayout(i10, i11, i12, i13, i14, extras);
        Intrinsics.checkNotNullExpressionValue("e5", "access$getLOG_TAG$cp(...)");
        R2 r22 = this.f38425a.f38500c;
        if (r22 != null) {
            r22.a(i10, i11, i12, i13, i14);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i10, Bundle bundle) {
        super.onNavigationEvent(i10, bundle);
        Intrinsics.checkNotNullExpressionValue("e5", "access$getLOG_TAG$cp(...)");
        R2 r22 = this.f38425a.f38500c;
        if (r22 != null) {
            C3699f5 c3699f5 = r22.f37633g;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6 && c3699f5.f38545c == null) {
                            if (c3699f5.f38546d == 4) {
                                c3699f5.f38545c = Boolean.TRUE;
                            } else {
                                c3699f5.f38545c = Boolean.FALSE;
                            }
                            if (Intrinsics.areEqual(c3699f5.f38545c, Boolean.TRUE)) {
                                Rh rh2 = (Rh) c3699f5.f38547e.get();
                                if (rh2 != null) {
                                    Na landingPageFunnelState = Na.f37435i;
                                    Ya ya2 = c3699f5.f38543a;
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                                    rh2.f37672a.getLandingPageHandler().a(landingPageFunnelState, ya2, (Integer) 8003);
                                }
                                Rh rh3 = (Rh) c3699f5.f38547e.get();
                                if (rh3 != null) {
                                    InterfaceC3878m9 interfaceC3878m9 = rh3.f37672a.f38368i;
                                    if (interfaceC3878m9 != null) {
                                        String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                                        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                                        ((C3903n9) interfaceC3878m9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    rh3.f37672a.D();
                                }
                            } else {
                                Rh rh4 = (Rh) c3699f5.f38547e.get();
                                if (rh4 != null) {
                                    Na landingPageFunnelState2 = Na.f37436j;
                                    Ya ya3 = c3699f5.f38543a;
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState2, "landingPageFunnelState");
                                    rh4.f37672a.getLandingPageHandler().a(landingPageFunnelState2, ya3, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c3699f5.f38545c == null) {
                        c3699f5.f38545c = Boolean.FALSE;
                        Rh rh5 = (Rh) c3699f5.f38547e.get();
                        if (rh5 != null) {
                            Na landingPageFunnelState3 = Na.f37436j;
                            Ya ya4 = c3699f5.f38543a;
                            Intrinsics.checkNotNullParameter(landingPageFunnelState3, "landingPageFunnelState");
                            rh5.f37672a.getLandingPageHandler().a(landingPageFunnelState3, ya4, (Integer) 8004);
                        }
                    }
                } else if (c3699f5.f38545c == null) {
                    c3699f5.f38545c = Boolean.TRUE;
                    Rh rh6 = (Rh) c3699f5.f38547e.get();
                    if (rh6 != null) {
                        J2.a(rh6, Na.f37435i, c3699f5.f38543a);
                    }
                    Rh rh7 = (Rh) c3699f5.f38547e.get();
                    if (rh7 != null) {
                        InterfaceC3878m9 interfaceC3878m92 = rh7.f37672a.f38368i;
                        if (interfaceC3878m92 != null) {
                            String str2 = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                            ((C3903n9) interfaceC3878m92).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        rh7.f37672a.D();
                    }
                }
            } else if (!c3699f5.f38544b) {
                c3699f5.f38544b = true;
                Rh rh8 = (Rh) c3699f5.f38547e.get();
                if (rh8 != null) {
                    J2.a(rh8, Na.f37434h, c3699f5.f38543a);
                }
            }
            c3699f5.f38546d = i10;
            if (i10 == 1) {
                Rh rh9 = (Rh) r22.f37635i.get();
                if (rh9 != null) {
                    GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
                    rh9.a(Mh.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i10 == 4) {
                Rh rh10 = (Rh) r22.f37635i.get();
                if (rh10 != null) {
                    GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
                    rh10.a(Mh.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i10 == 5) {
                Rh rh11 = (Rh) r22.f37635i.get();
                if (rh11 != null) {
                    GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
                    rh11.a(Mh.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                Rh rh12 = (Rh) r22.f37635i.get();
                if (rh12 != null) {
                    InterfaceC3878m9 interfaceC3878m93 = rh12.f37672a.f38368i;
                    if (interfaceC3878m93 != null) {
                        String str3 = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                        ((C3903n9) interfaceC3878m93).a(str3, "onCCTScreenDisplayed");
                    }
                    rh12.f37672a.getListener().f(rh12.f37672a);
                    rh12.f37672a.b((String) null, (String) null, (String) null);
                    return;
                }
                return;
            }
            if (i10 != 6) {
                return;
            }
            Rh rh13 = (Rh) r22.f37635i.get();
            if (rh13 != null) {
                GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
                rh13.a(Mh.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            Rh rh14 = (Rh) r22.f37635i.get();
            if (rh14 != null) {
                InterfaceC3878m9 interfaceC3878m94 = rh14.f37672a.f38368i;
                if (interfaceC3878m94 != null) {
                    String str4 = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                    ((C3903n9) interfaceC3878m94).a(str4, "onCCTScreenDismissed");
                }
                rh14.f37672a.W();
            }
        }
    }
}
