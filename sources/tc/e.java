package tc;

import id.e0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements yc.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f105055c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f105056d = CollectionsKt.listOf(e0.OnClick);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f105057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f105058b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(d animationController, Function0 function0) {
        Intrinsics.checkNotNullParameter(animationController, "animationController");
        this.f105057a = animationController;
        this.f105058b = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @Override // yc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            java.lang.Object r1 = kotlin.collections.CollectionsKt.getOrNull(r8, r0)
            boolean r2 = r1 instanceof id.e0
            if (r2 != 0) goto Lf
            return r0
        Lf:
            r2 = 1
            java.lang.Object r8 = kotlin.collections.CollectionsKt.getOrNull(r8, r2)
            boolean r3 = r8 instanceof java.lang.Integer
            if (r3 != 0) goto L19
            return r0
        L19:
            java.util.List r3 = tc.e.f105056d
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L22
            return r0
        L22:
            kotlin.jvm.functions.Function0 r3 = r7.f105058b
            r4 = 0
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r3.invoke()
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L46
            int r5 = r3.intValue()
            r6 = -1
            if (r5 == r6) goto L39
            r4 = r3
        L39:
            if (r4 == 0) goto L46
            int r3 = r4.intValue()
            tc.d r4 = r7.f105057a
            boolean r3 = r4.a(r3)
            goto L47
        L46:
            r3 = r0
        L47:
            tc.d r4 = r7.f105057a
            r5 = r8
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r4 = r4.a(r5)
            if (r3 != 0) goto L5a
            if (r4 == 0) goto L59
            goto L5a
        L59:
            r2 = r0
        L5a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Intercept result="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "; eventType="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "; viewId="
            r3.append(r1)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "AdAnimationEventInterceptor"
            ic.v.g(r1, r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.e.a(java.util.List):boolean");
    }
}
