package k8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public enum zv {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f93010c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Function1 f93011d = new Function1() { // from class: k8.zv.b
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zv zvVar) {
            return zv.f93010c.b(zvVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Function1 f93012e = new Function1() { // from class: k8.zv.a
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final zv invoke(String str) {
            return zv.f93010c.a(str);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f93018b;

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv a(String str) {
            zv zvVar = zv.NONE;
            if (Intrinsics.areEqual(str, zvVar.f93018b)) {
                return zvVar;
            }
            zv zvVar2 = zv.DATA_CHANGE;
            if (Intrinsics.areEqual(str, zvVar2.f93018b)) {
                return zvVar2;
            }
            zv zvVar3 = zv.STATE_CHANGE;
            if (Intrinsics.areEqual(str, zvVar3.f93018b)) {
                return zvVar3;
            }
            zv zvVar4 = zv.ANY_CHANGE;
            if (Intrinsics.areEqual(str, zvVar4.f93018b)) {
                return zvVar4;
            }
            return null;
        }

        public final String b(zv zvVar) {
            return zvVar.f93018b;
        }

        private c() {
        }
    }

    zv(String str) {
        this.f93018b = str;
    }
}
