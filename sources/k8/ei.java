package k8;

import com.ironsource.C4488pd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum ei {
    NONE("none"),
    SINGLE(C4488pd.f44651d);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f87311c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f87312d = new Function1() { // from class: k8.ei.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(ei eiVar) {
            return ei.f87311c.b(eiVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f87313e = new Function1() { // from class: k8.ei.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ei invoke(String str) {
            return ei.f87311c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87317b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ei a(String str) {
            ei eiVar = ei.NONE;
            if (Intrinsics.areEqual(str, eiVar.f87317b)) {
                return eiVar;
            }
            ei eiVar2 = ei.SINGLE;
            if (Intrinsics.areEqual(str, eiVar2.f87317b)) {
                return eiVar2;
            }
            return null;
        }

        public final String b(ei eiVar) {
            return eiVar.f87317b;
        }

        private c() {
        }
    }

    ei(String str) {
        this.f87317b = str;
    }
}
