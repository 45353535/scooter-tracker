package oh;

import android.support.v4.media.session.PlaybackStateCompat;
import hh.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.g;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1118a f96975c = new C1118a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f96976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f96977b;

    /* JADX INFO: renamed from: oh.a$a, reason: collision with other inner class name */
    public static final class C1118a {
        public /* synthetic */ C1118a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1118a() {
        }
    }

    public a(g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f96976a = source;
        this.f96977b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String utf8LineStrict = this.f96976a.readUtf8LineStrict(this.f96977b);
        this.f96977b -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
