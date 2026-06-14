package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum jd {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f88378c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f88379d = new Function1() { // from class: k8.jd.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(jd jdVar) {
            return jd.f88378c.b(jdVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f88380e = new Function1() { // from class: k8.jd.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jd invoke(String str) {
            return jd.f88378c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88386b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jd a(String str) {
            jd jdVar = jd.LIGHT;
            if (Intrinsics.areEqual(str, jdVar.f88386b)) {
                return jdVar;
            }
            jd jdVar2 = jd.MEDIUM;
            if (Intrinsics.areEqual(str, jdVar2.f88386b)) {
                return jdVar2;
            }
            jd jdVar3 = jd.REGULAR;
            if (Intrinsics.areEqual(str, jdVar3.f88386b)) {
                return jdVar3;
            }
            jd jdVar4 = jd.BOLD;
            if (Intrinsics.areEqual(str, jdVar4.f88386b)) {
                return jdVar4;
            }
            return null;
        }

        public final String b(jd jdVar) {
            return jdVar.f88386b;
        }

        private c() {
        }
    }

    jd(String str) {
        this.f88386b = str;
    }
}
