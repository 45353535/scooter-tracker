package wg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    public static final class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f108006a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108007a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String simpleName = v0.b(getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }

    private l() {
    }
}
