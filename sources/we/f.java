package we;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import pg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f107935a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f107935a = body;
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Deferred f107936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.ktor.utils.io.e f107937b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Deferred headers, io.ktor.utils.io.e body) {
            super(null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.f107936a = headers;
            this.f107937b = body;
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f107938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.f107938a = body;
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
