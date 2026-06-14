package yads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class te2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w53 f116215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu f116216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f116217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oe2 f116218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final df0 f116219e;

    public /* synthetic */ te2(c4 c4Var, es2 es2Var, t9 t9Var, w53 w53Var, vu vuVar) {
        this(w53Var, vuVar, new a1(), new oe2(), new df0(c4Var, es2Var, t9Var));
    }

    public final void a(ne2 ne2Var, boolean z10) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(CampaignEx.JSON_KEY_CLICK_URL, l83.a(ne2Var.f113842b));
        mapCreateMapBuilder.put("deeplink_package_name", ne2Var.f113841a);
        mapCreateMapBuilder.put("deeplink_success", Boolean.valueOf(z10));
        if (z10) {
            String str = ne2Var.f113848h;
            if (str == null) {
                ku kuVar = ku.f112853c;
                str = "unknown";
            }
            mapCreateMapBuilder.put("click_destination", str);
        }
        Map mutableMap = MapsKt.toMutableMap(MapsKt.build(mapCreateMapBuilder));
        vu vuVar = this.f116216b;
        xl2 xl2Var = xl2.f117885v;
        zl2 zl2VarA = vuVar.a(xl2Var, mutableMap);
        vuVar.f117202d.a(zl2VarA);
        vuVar.f117204f.a(xl2Var, zl2VarA.f118734b, wl2.f117511a, null);
    }

    public te2(w53 w53Var, vu vuVar, a1 a1Var, oe2 oe2Var, df0 df0Var) {
        this.f116215a = w53Var;
        this.f116216b = vuVar;
        this.f116217c = a1Var;
        this.f116218d = oe2Var;
        this.f116219e = df0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r6, yads.ne2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof yads.re2
            if (r0 == 0) goto L13
            r0 = r8
            yads.re2 r0 = (yads.re2) r0
            int r1 = r0.f115432f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115432f = r1
            goto L18
        L13:
            yads.re2 r0 = new yads.re2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f115430d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f115432f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yads.ne2 r7 = r0.f115429c
            yads.te2 r6 = r0.f115428b
            kotlin.d.b(r8)     // Catch: java.lang.Exception -> L6a
            goto L5a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.d.b(r8)
            yads.oe2 r8 = r5.f116218d     // Catch: java.lang.Exception -> L69
            r8.getClass()     // Catch: java.lang.Exception -> L69
            android.content.Intent r8 = yads.oe2.a(r6, r7)     // Catch: java.lang.Exception -> L69
            yads.oa0 r2 = r7.f113845e     // Catch: java.lang.Exception -> L69
            yads.oa0 r4 = yads.oa0.f114245d     // Catch: java.lang.Exception -> L69
            if (r2 != r4) goto L56
            yads.df0 r2 = r5.f116219e     // Catch: java.lang.Exception -> L69
            r0.f115428b = r5     // Catch: java.lang.Exception -> L69
            r0.f115429c = r7     // Catch: java.lang.Exception -> L69
            r0.f115432f = r3     // Catch: java.lang.Exception -> L69
            java.lang.Object r6 = r2.a(r6, r8, r0)     // Catch: java.lang.Exception -> L69
            if (r6 != r1) goto L59
            return r1
        L56:
            r6.startActivity(r8)     // Catch: java.lang.Exception -> L69
        L59:
            r6 = r5
        L5a:
            yads.w53 r8 = r6.f116215a     // Catch: java.lang.Exception -> L6a
            java.util.List r0 = r7.f113846f     // Catch: java.lang.Exception -> L6a
            r8.a(r0)     // Catch: java.lang.Exception -> L6a
            r6.a(r7, r3)     // Catch: java.lang.Exception -> L6a
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        L69:
            r6 = r5
        L6a:
            yads.w53 r8 = r6.f116215a
            java.util.List r0 = r7.f113847g
            r8.a(r0)
            r8 = 0
            r6.a(r7, r8)
            boolean r6 = yads.lb1.f113032a
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.te2.a(android.content.Context, yads.ne2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0089 -> B:35:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r8, java.util.List r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof yads.se2
            if (r0 == 0) goto L13
            r0 = r10
            yads.se2 r0 = (yads.se2) r0
            int r1 = r0.f115778h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115778h = r1
            goto L18
        L13:
            yads.se2 r0 = new yads.se2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f115776f
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f115778h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            yads.ne2 r8 = r0.f115775e
            java.util.Iterator r9 = r0.f115774d
            android.content.Context r2 = r0.f115773c
            yads.te2 r5 = r0.f115772b
            kotlin.d.b(r10)
            goto L8c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.d.b(r10)
            android.app.Activity r10 = yads.j1.a()
            if (r10 == 0) goto L45
            r8 = r10
            goto L69
        L45:
            yads.a1 r10 = r7.f116217c
            r10.getClass()
            r10 = 0
            r2 = r8
        L4c:
            boolean r5 = r2 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L65
            int r5 = r10 + 1
            r6 = 10
            if (r10 >= r6) goto L65
            boolean r10 = r2 instanceof android.app.Activity
            if (r10 == 0) goto L5d
            android.app.Activity r2 = (android.app.Activity) r2
            goto L66
        L5d:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            r10 = r5
            goto L4c
        L65:
            r2 = r3
        L66:
            if (r2 == 0) goto L69
            r8 = r2
        L69:
            java.util.Iterator r9 = r9.iterator()
            r5 = r7
            r2 = r8
        L6f:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L95
            java.lang.Object r8 = r9.next()
            yads.ne2 r8 = (yads.ne2) r8
            r0.f115772b = r5
            r0.f115773c = r2
            r0.f115774d = r9
            r0.f115775e = r8
            r0.f115778h = r4
            java.lang.Object r10 = r5.a(r2, r8, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6f
            return r8
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.te2.a(android.content.Context, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
