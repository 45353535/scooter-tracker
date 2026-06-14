package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3758hd implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3807jd f38709a;

    public C3758hd(C3807jd c3807jd) {
        this.f38709a = c3807jd;
    }

    @Override // com.inmobi.media.Ma
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38709a.f38808a.f38881g;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC3744h abstractC3744h = (AbstractC3744h) this.f38709a.f38808a.f38880f;
        abstractC3744h.getClass();
        InterfaceC3636cj interfaceC3636cj = ((Ac) abstractC3744h).f36566c;
        AbstractC4011ri abstractC4011ri = interfaceC3636cj instanceof AbstractC4011ri ? (AbstractC4011ri) interfaceC3636cj : null;
        if (abstractC4011ri != null) {
            InterfaceC3878m9 interfaceC3878m9L = abstractC4011ri.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("AUM-RenderedState", "onUserLeftApplication");
            }
            P4.a(abstractC4011ri.k(), new C3987qi(abstractC4011ri, null));
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3878m9 interfaceC3878m9 = this.f38709a.f38808a.f38881g;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("PublisherViewClickHandler", "Landing page error: " + message + " " + str2);
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        InterfaceC3878m9 interfaceC3878m9 = this.f38709a.f38808a.f38881g;
        if (interfaceC3878m9 != null) {
            ComponentName component = intent.getComponent();
            ((C3903n9) interfaceC3878m9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.f38709a.a(intent);
    }
}
