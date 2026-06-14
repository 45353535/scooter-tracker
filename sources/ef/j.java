package ef;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f69112a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f69112a = relativeTo;
        }

        public final i a() {
            return this.f69112a;
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f69113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f69113a = relativeTo;
        }
    }

    public static final class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f69114a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 967869129;
        }

        public String toString() {
            return "Last";
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
