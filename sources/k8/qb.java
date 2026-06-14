package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum qb {
    STRING(TypedValues.Custom.S_STRING),
    INTEGER(TypedValues.Custom.S_INT),
    NUMBER("number"),
    BOOLEAN(TypedValues.Custom.S_BOOLEAN),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT("dict"),
    ARRAY("array");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f90544c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f90545d = new Function1() { // from class: k8.qb.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(qb qbVar) {
            return qb.f90544c.b(qbVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f90546e = new Function1() { // from class: k8.qb.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qb invoke(String str) {
            return qb.f90544c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f90557b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qb a(String str) {
            qb qbVar = qb.STRING;
            if (Intrinsics.areEqual(str, qbVar.f90557b)) {
                return qbVar;
            }
            qb qbVar2 = qb.INTEGER;
            if (Intrinsics.areEqual(str, qbVar2.f90557b)) {
                return qbVar2;
            }
            qb qbVar3 = qb.NUMBER;
            if (Intrinsics.areEqual(str, qbVar3.f90557b)) {
                return qbVar3;
            }
            qb qbVar4 = qb.BOOLEAN;
            if (Intrinsics.areEqual(str, qbVar4.f90557b)) {
                return qbVar4;
            }
            qb qbVar5 = qb.DATETIME;
            if (Intrinsics.areEqual(str, qbVar5.f90557b)) {
                return qbVar5;
            }
            qb qbVar6 = qb.COLOR;
            if (Intrinsics.areEqual(str, qbVar6.f90557b)) {
                return qbVar6;
            }
            qb qbVar7 = qb.URL;
            if (Intrinsics.areEqual(str, qbVar7.f90557b)) {
                return qbVar7;
            }
            qb qbVar8 = qb.DICT;
            if (Intrinsics.areEqual(str, qbVar8.f90557b)) {
                return qbVar8;
            }
            qb qbVar9 = qb.ARRAY;
            if (Intrinsics.areEqual(str, qbVar9.f90557b)) {
                return qbVar9;
            }
            return null;
        }

        public final String b(qb qbVar) {
            return qbVar.f90557b;
        }

        private c() {
        }
    }

    qb(String str) {
        this.f90557b = str;
    }
}
