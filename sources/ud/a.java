package ud;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1315a f105618a = new C1315a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f105619b = new a();

    /* JADX INFO: renamed from: ud.a$a, reason: collision with other inner class name */
    public static final class C1315a {
        public /* synthetic */ C1315a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return a.f105619b;
        }

        private C1315a() {
        }
    }

    @Override // ud.b
    public void a(Object obj, Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
    }

    @Override // ud.b
    public void b(Object obj, Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
    }
}
