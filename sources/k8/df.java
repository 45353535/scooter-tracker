package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes12.dex */
public enum df {
    FILL(Reporting.EventType.FILL),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f87027c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f87028d = new Function1() { // from class: k8.df.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(df dfVar) {
            return df.f87027c.b(dfVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f87029e = new Function1() { // from class: k8.df.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final df invoke(String str) {
            return df.f87027c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87035b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final df a(String str) {
            df dfVar = df.FILL;
            if (Intrinsics.areEqual(str, dfVar.f87035b)) {
                return dfVar;
            }
            df dfVar2 = df.NO_SCALE;
            if (Intrinsics.areEqual(str, dfVar2.f87035b)) {
                return dfVar2;
            }
            df dfVar3 = df.FIT;
            if (Intrinsics.areEqual(str, dfVar3.f87035b)) {
                return dfVar3;
            }
            df dfVar4 = df.STRETCH;
            if (Intrinsics.areEqual(str, dfVar4.f87035b)) {
                return dfVar4;
            }
            return null;
        }

        public final String b(df dfVar) {
            return dfVar.f87035b;
        }

        private c() {
        }
    }

    df(String str) {
        this.f87035b = str;
    }
}
