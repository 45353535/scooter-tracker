package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua f69695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f69696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f69697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cif f69698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wc f69699e;

    public e3(ua sdkInitializer, wf networkService, g2 requestBodyBuilder, Cif eventTracker, wc session) {
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f69695a = sdkInitializer;
        this.f69696b = networkService;
        this.f69697c = requestBodyBuilder;
        this.f69698d = eventTracker;
        this.f69699e = session;
    }
}
