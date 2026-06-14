package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c3 extends Exception {

    public static final class a extends c3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f69507b = new a();

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 400454163;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BAD_BASE_64";
        }
    }

    public c3() {
    }

    public /* synthetic */ c3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
