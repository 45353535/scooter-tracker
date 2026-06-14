package k8;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum jp {
    DP(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORM),
    SP("sp"),
    PX("px");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f88505c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f88506d = new Function1() { // from class: k8.jp.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(jp jpVar) {
            return jp.f88505c.b(jpVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f88507e = new Function1() { // from class: k8.jp.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jp invoke(String str) {
            return jp.f88505c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88512b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jp a(String str) {
            jp jpVar = jp.DP;
            if (Intrinsics.areEqual(str, jpVar.f88512b)) {
                return jpVar;
            }
            jp jpVar2 = jp.SP;
            if (Intrinsics.areEqual(str, jpVar2.f88512b)) {
                return jpVar2;
            }
            jp jpVar3 = jp.PX;
            if (Intrinsics.areEqual(str, jpVar3.f88512b)) {
                return jpVar3;
            }
            return null;
        }

        public final String b(jp jpVar) {
            return jpVar.f88512b;
        }

        private c() {
        }
    }

    jp(String str) {
        this.f88512b = str;
    }
}
