package f1;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d3 f69579a = new d3();

    public final Pair a(i6 appRequest, yd params, Function2 loadOpenRTBAd, Function2 loadAdGet) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadOpenRTBAd, "loadOpenRTBAd");
        Intrinsics.checkNotNullParameter(loadAdGet, "loadAdGet");
        return appRequest.h() != null ? new Pair(loadOpenRTBAd, params) : new Pair(loadAdGet, params);
    }
}
