package ze;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    public static final class a extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f119364a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1051825272;
        }

        public String toString() {
            return "Jvm";
        }
    }

    public static final class b extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f119365a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1059277600;
        }

        public String toString() {
            return LogConstants.KEY_NATIVE;
        }
    }

    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private t() {
    }
}
