package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oa implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mg f70731a;

    public oa(mg webViewFactory) {
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        this.f70731a = webViewFactory;
    }

    public /* synthetic */ oa(mg mgVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new x8() : mgVar);
    }
}
