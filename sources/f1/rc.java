package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70992c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f70993d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce f70994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f70995b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public rc(ce sharedPrefsHelper, e4 resourcesLoader) {
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        this.f70994a = sharedPrefsHelper;
        this.f70995b = resourcesLoader;
    }
}
