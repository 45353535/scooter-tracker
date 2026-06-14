package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f75978a = C5186j4.l().g().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5533x0 f75979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ve f75980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ye f75981d;

    public J0() {
        C5533x0 c5533x0 = new C5533x0();
        this.f75979b = c5533x0;
        this.f75980c = new Ve(c5533x0);
        this.f75981d = new Ye();
    }

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        Ve ve2 = this.f75980c;
        ve2.f76595a.a(null);
        ve2.f76596b.a(pluginErrorDetails);
        Ye ye2 = this.f75981d;
        Intrinsics.checkNotNull(pluginErrorDetails);
        ye2.getClass();
        this.f75978a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.gp
            @Override // java.lang.Runnable
            public final void run() {
                J0.a(this.f77280b, pluginErrorDetails);
            }
        });
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        Ve ve2 = this.f75980c;
        ve2.f76595a.a(null);
        ve2.f76596b.a(pluginErrorDetails);
        if (ve2.f76598d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f78248a) {
            Ye ye2 = this.f75981d;
            Intrinsics.checkNotNull(pluginErrorDetails);
            ye2.getClass();
            this.f75978a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.hp
                @Override // java.lang.Runnable
                public final void run() {
                    J0.a(this.f77359b, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        Ve ve2 = this.f75980c;
        ve2.f76595a.a(null);
        ve2.f76597c.a(str);
        Ye ye2 = this.f75981d;
        Intrinsics.checkNotNull(str);
        ye2.getClass();
        this.f75978a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.ip
            @Override // java.lang.Runnable
            public final void run() {
                J0.a(this.f77447b, str, str2, pluginErrorDetails);
            }
        });
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails, String str) {
        j02.f75979b.getClass();
        C5508w0 c5508w0 = C5508w0.f78473e;
        Intrinsics.checkNotNull(c5508w0);
        C5371qc c5371qcI = c5508w0.f().i();
        Intrinsics.checkNotNull(c5371qcI);
        c5371qcI.f78069a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(J0 j02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        j02.f75979b.getClass();
        C5508w0 c5508w0 = C5508w0.f78473e;
        Intrinsics.checkNotNull(c5508w0);
        C5371qc c5371qcI = c5508w0.f().i();
        Intrinsics.checkNotNull(c5371qcI);
        c5371qcI.f78069a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails) {
        j02.f75979b.getClass();
        C5508w0 c5508w0 = C5508w0.f78473e;
        Intrinsics.checkNotNull(c5508w0);
        C5371qc c5371qcI = c5508w0.f().i();
        Intrinsics.checkNotNull(c5371qcI);
        c5371qcI.f78069a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
