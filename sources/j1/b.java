package j1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f85463e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(boolean z10) {
        super(null, 1, 0 == true ? 1 : 0);
        f("coppa");
        c(Boolean.valueOf(z10));
    }

    @Override // j1.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean getConsent() {
        Object objB = b();
        Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objB;
    }
}
