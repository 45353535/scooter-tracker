package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum aw {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f86412c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f86413d = new Function1() { // from class: k8.aw.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(aw awVar) {
            return aw.f86412c.b(awVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f86414e = new Function1() { // from class: k8.aw.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final aw invoke(String str) {
            return aw.f86412c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86419b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final aw a(String str) {
            aw awVar = aw.DATA_CHANGE;
            if (Intrinsics.areEqual(str, awVar.f86419b)) {
                return awVar;
            }
            aw awVar2 = aw.STATE_CHANGE;
            if (Intrinsics.areEqual(str, awVar2.f86419b)) {
                return awVar2;
            }
            aw awVar3 = aw.VISIBILITY_CHANGE;
            if (Intrinsics.areEqual(str, awVar3.f86419b)) {
                return awVar3;
            }
            return null;
        }

        public final String b(aw awVar) {
            return awVar.f86419b;
        }

        private c() {
        }
    }

    aw(String str) {
        this.f86419b = str;
    }
}
