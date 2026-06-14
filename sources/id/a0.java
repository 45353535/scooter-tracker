package id;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f74366b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f74367a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 a(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            String message = throwable.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new a0(message);
        }

        private a() {
        }
    }

    public a0(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f74367a = message;
    }

    public static final a0 a(Throwable th2) {
        return f74366b.a(th2);
    }

    public final String b() {
        return this.f74367a;
    }

    public String toString() {
        return this.f74367a;
    }
}
