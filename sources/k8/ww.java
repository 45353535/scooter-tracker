package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes12.dex */
public enum ww {
    FILL(Reporting.EventType.FILL),
    NO_SCALE("no_scale"),
    FIT("fit");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f92252c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f92253d = new Function1() { // from class: k8.ww.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(ww wwVar) {
            return ww.f92252c.b(wwVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f92254e = new Function1() { // from class: k8.ww.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ww invoke(String str) {
            return ww.f92252c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92259b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ww a(String str) {
            ww wwVar = ww.FILL;
            if (Intrinsics.areEqual(str, wwVar.f92259b)) {
                return wwVar;
            }
            ww wwVar2 = ww.NO_SCALE;
            if (Intrinsics.areEqual(str, wwVar2.f92259b)) {
                return wwVar2;
            }
            ww wwVar3 = ww.FIT;
            if (Intrinsics.areEqual(str, wwVar3.f92259b)) {
                return wwVar3;
            }
            return null;
        }

        public final String b(ww wwVar) {
            return wwVar.f92259b;
        }

        private c() {
        }
    }

    ww(String str) {
        this.f92259b = str;
    }
}
