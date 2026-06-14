package yads;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xu f115784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wu f115785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn1 f115786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hf2 f115787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final if2 f115788e;

    public sf2(xu xuVar, wu wuVar, dn1 dn1Var, hf2 hf2Var, if2 if2Var) {
        this.f115784a = xuVar;
        this.f115785b = wuVar;
        this.f115786c = dn1Var;
        this.f115787d = hf2Var;
        this.f115788e = if2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r0 == r11) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(long r14, android.content.Context r16, yads.qz r17, yads.mx2 r18, yads.sf2 r19, java.util.List r20, kotlin.coroutines.Continuation r21) {
        /*
            r0 = r21
            r19.getClass()
            boolean r1 = r0 instanceof yads.pf2
            if (r1 == 0) goto L1a
            r1 = r0
            yads.pf2 r1 = (yads.pf2) r1
            int r2 = r1.f114657d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.f114657d = r2
            r8 = r19
            goto L21
        L1a:
            yads.pf2 r1 = new yads.pf2
            r8 = r19
            r1.<init>(r8, r0)
        L21:
            java.lang.Object r0 = r1.f114655b
            java.lang.Object r11 = pf.b.g()
            int r2 = r1.f114657d
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L41
            if (r2 == r13) goto L3d
            if (r2 != r12) goto L35
            kotlin.d.b(r0)
            goto L87
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3d:
            kotlin.d.b(r0)
            goto L72
        L41:
            kotlin.d.b(r0)
            boolean r0 = r20.isEmpty()
            if (r0 == 0) goto L5a
            yads.ue2 r14 = yads.ue2.f116621d
            yads.df2 r14 = yads.vo1.a()
            yads.ye2 r15 = new yads.ye2
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r14)
            r15.<init>(r14)
            return r15
        L5a:
            yads.qf2 r2 = new yads.qf2
            r10 = 0
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            r1.f114657d = r13
            java.lang.Object r0 = kotlinx.coroutines.i.g(r2, r1)
            if (r0 != r11) goto L72
            goto L86
        L72:
            java.util.List r0 = (java.util.List) r0
            kotlinx.coroutines.CoroutineDispatcher r14 = eg.o0.b()
            yads.rf2 r15 = new yads.rf2
            r2 = 0
            r15.<init>(r0, r2)
            r1.f114657d = r12
            java.lang.Object r0 = eg.g.g(r14, r15, r1)
            if (r0 != r11) goto L87
        L86:
            return r11
        L87:
            java.util.List r0 = (java.util.List) r0
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L9f
            yads.ue2 r14 = yads.ue2.f116621d
            yads.df2 r14 = yads.vo1.a()
            yads.ye2 r15 = new yads.ye2
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r14)
            r15.<init>(r14)
            return r15
        L9f:
            yads.ye2 r14 = new yads.ye2
            r14.<init>(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.sf2.a(long, android.content.Context, yads.qz, yads.mx2, yads.sf2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ sf2(jn1 jn1Var, xu xuVar) {
        this(xuVar, new wu(), new dn1(jn1Var), new hf2(), new if2());
    }

    public static final void a(sf2 sf2Var, cp1 cp1Var) {
        sf2Var.getClass();
        if (StringsKt.e0(cp1Var.f109504b, "LevelPlay", true)) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{MBridgeConstans.APP_KEY, "placement_name"});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                if (!cp1Var.f109505c.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Required configuration parameters are missing");
            }
        }
    }
}
