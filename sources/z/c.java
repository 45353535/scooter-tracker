package z;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f119120a;

        public a(int i10) {
            super(null);
            this.f119120a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f119120a == ((a) obj).f119120a;
        }

        public int hashCode() {
            return this.f119120a;
        }

        public String toString() {
            return String.valueOf(this.f119120a);
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f119121a = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
