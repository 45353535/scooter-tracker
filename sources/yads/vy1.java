package yads;

import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x41 f117250a;

    public /* synthetic */ vy1() {
        this(new x41());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static List a(jz1 jz1Var) {
        ?? ListOf;
        if (jz1Var instanceof i12) {
            ArrayList arrayListI = ((i12) jz1Var).i();
            ListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListI, 10));
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                ListOf.add(((jz1) it.next()).a());
            }
        } else {
            ListOf = CollectionsKt.listOf(jz1Var != null ? jz1Var.a() : null);
        }
        return CollectionsKt.filterNotNull(ListOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List b(yads.jz1 r5) {
        /*
            boolean r0 = r5 instanceof yads.i12
            r1 = 0
            if (r0 == 0) goto L4b
            yads.i12 r5 = (yads.i12) r5
            java.util.ArrayList r5 = r5.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r5.next()
            yads.jz1 r2 = (yads.jz1) r2
            if (r2 == 0) goto L27
            java.lang.String r3 = r2.getCreativeId()
            goto L28
        L27:
            r3 = r1
        L28:
            if (r3 != 0) goto L37
            if (r2 == 0) goto L31
            java.lang.String r3 = r2.getCampaignId()
            goto L32
        L31:
            r3 = r1
        L32:
            if (r3 == 0) goto L35
            goto L37
        L35:
            r3 = r1
            goto L44
        L37:
            yads.wz r3 = new yads.wz
            java.lang.String r4 = r2.getCreativeId()
            java.lang.String r2 = r2.getCampaignId()
            r3.<init>(r4, r2)
        L44:
            if (r3 == 0) goto L14
            r0.add(r3)
            goto L14
        L4a:
            return r0
        L4b:
            if (r5 == 0) goto L66
            java.lang.String r0 = r5.getCreativeId()
            if (r0 != 0) goto L59
            java.lang.String r0 = r5.getCampaignId()
            if (r0 == 0) goto L66
        L59:
            yads.wz r1 = new yads.wz
            java.lang.String r0 = r5.getCreativeId()
            java.lang.String r5 = r5.getCampaignId()
            r1.<init>(r0, r5)
        L66:
            java.util.List r5 = kotlin.collections.CollectionsKt.listOfNotNull(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vy1.b(yads.jz1):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.util.List] */
    public final String c(jz1 jz1Var) {
        ?? ListOfNotNull;
        if (jz1Var instanceof i12) {
            ArrayList arrayListI = ((i12) jz1Var).i();
            ListOfNotNull = new ArrayList();
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                String info = ((jz1) it.next()).getInfo();
                if (info != null) {
                    ListOfNotNull.add(info);
                }
            }
        } else {
            ListOfNotNull = CollectionsKt.listOfNotNull(jz1Var != null ? jz1Var.getInfo() : null);
        }
        ?? r22 = ListOfNotNull;
        this.f117250a.getClass();
        if (r22.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(r22, StringUtils.COMMA, C4240b4.j.f42672d, C4240b4.j.f42674e, 0, null, null, 56, null);
    }

    public vy1(x41 x41Var) {
        this.f117250a = x41Var;
    }
}
