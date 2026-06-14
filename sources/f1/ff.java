package f1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ff {

    public static final class a extends ff {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f69866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List clickTrackingUrls) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f69866a = clickTrackingUrls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f69866a, ((a) obj).f69866a);
        }

        public int hashCode() {
            return this.f69866a.hashCode();
        }

        public String toString() {
            return "CtaClick(clickTrackingUrls=" + this.f69866a + ")";
        }
    }

    public ff() {
    }

    public /* synthetic */ ff(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
