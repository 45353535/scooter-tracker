package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum gx {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f87922c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f87923d = new Function1() { // from class: k8.gx.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(gx gxVar) {
            return gx.f87922c.b(gxVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f87924e = new Function1() { // from class: k8.gx.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gx invoke(String str) {
            return gx.f87922c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87929b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gx a(String str) {
            gx gxVar = gx.VISIBLE;
            if (Intrinsics.areEqual(str, gxVar.f87929b)) {
                return gxVar;
            }
            gx gxVar2 = gx.INVISIBLE;
            if (Intrinsics.areEqual(str, gxVar2.f87929b)) {
                return gxVar2;
            }
            gx gxVar3 = gx.GONE;
            if (Intrinsics.areEqual(str, gxVar3.f87929b)) {
                return gxVar3;
            }
            return null;
        }

        public final String b(gx gxVar) {
            return gxVar.f87929b;
        }

        private c() {
        }
    }

    gx(String str) {
        this.f87929b = str;
    }
}
