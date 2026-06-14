package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3669e1 implements X2, Kl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38482f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f38483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f38484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSession f38485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaEvents f38486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdEvents f38487e;

    static {
        String simpleName = AbstractC3669e1.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f38482f = simpleName;
    }

    public AbstractC3669e1(CoroutineScope coroutineScope, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f38483a = coroutineScope;
        this.f38484b = interfaceC3878m9;
    }

    public void a() {
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z10);

    public final void b() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a(f38482f, "initAdEvents");
        }
        try {
            this.f38487e = AdEvents.createAdEvents(this.f38485c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38484b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a(f38482f, "Failure initAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }

    public final void c() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a(f38482f, "initMediaAdEvents");
        }
        try {
            this.f38486d = MediaEvents.createMediaEvents(this.f38485c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38484b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a(f38482f, "Failure initMediaAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }

    public void a(boolean z10) {
    }

    @Override // com.inmobi.media.Kl
    public void a(Rl videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
    }

    public final void a(InteractionType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f38486d == null) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a(f38482f, "Failed to register adUserInteractionEvent with type: " + type);
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38484b;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a(f38482f, "trackAdUserInteractionEvent with type: " + type);
        }
        P4.a(this.f38483a, new C3644d1(this, type, null));
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        Intrinsics.checkNotNullParameter(adSessionContext, "adSessionContext");
        if (this.f38485c != null) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a(f38482f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38484b;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a(f38482f, "initAdSession");
        }
        try {
            this.f38485c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38484b;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).a(f38482f, "AdSession creation failed. " + e10);
            }
        }
    }
}
