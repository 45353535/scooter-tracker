package p2;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.d;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1160a f98061b = new C1160a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f98062c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f98063a;

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    public static final class C1160a {
        public /* synthetic */ C1160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1160a() {
        }
    }

    static {
        f98062c = d.f93341b.h() <= 1.0E-4d;
    }

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98063a = new m0(context);
    }

    private final boolean a(String str) {
        if (str != null) {
            return StringsKt.g0(str, "gps", false, 2, null);
        }
        return false;
    }

    public final void b(String str, Bundle bundle) {
        if (f98062c && a(str)) {
            this.f98063a.f(str, bundle);
        }
    }
}
