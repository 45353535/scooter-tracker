package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum vs {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f92011c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f92012d = new Function1() { // from class: k8.vs.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(vs vsVar) {
            return vs.f92011c.b(vsVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f92013e = new Function1() { // from class: k8.vs.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final vs invoke(String str) {
            return vs.f92011c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92019b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vs a(String str) {
            vs vsVar = vs.TOP;
            if (Intrinsics.areEqual(str, vsVar.f92019b)) {
                return vsVar;
            }
            vs vsVar2 = vs.CENTER;
            if (Intrinsics.areEqual(str, vsVar2.f92019b)) {
                return vsVar2;
            }
            vs vsVar3 = vs.BOTTOM;
            if (Intrinsics.areEqual(str, vsVar3.f92019b)) {
                return vsVar3;
            }
            vs vsVar4 = vs.BASELINE;
            if (Intrinsics.areEqual(str, vsVar4.f92019b)) {
                return vsVar4;
            }
            return null;
        }

        public final String b(vs vsVar) {
            return vsVar.f92019b;
        }

        private c() {
        }
    }

    vs(String str) {
        this.f92019b = str;
    }
}
