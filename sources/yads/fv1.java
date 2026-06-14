package yads;

import android.content.Context;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fv1 implements s72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p72 f110937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b22 f110938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f110939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ta f110940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xa f110941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vt2 f110942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x43 f110943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q53 f110944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m41 f110945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f110946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f110947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f110948m = new ArrayList();

    public fv1(Context context, p72 p72Var, b22 b22Var, String str, ta taVar, xa xaVar, vt2 vt2Var, x43 x43Var, q53 q53Var) {
        this.f110936a = context;
        this.f110937b = p72Var;
        this.f110938c = b22Var;
        this.f110939d = str;
        this.f110940e = taVar;
        this.f110941f = xaVar;
        this.f110942g = vt2Var;
        this.f110943h = x43Var;
        this.f110944i = q53Var;
    }

    public final synchronized void a(List list) {
        dw2 dw2Var;
        try {
            this.f110948m.clear();
            q53 q53Var = this.f110944i;
            ta taVar = this.f110940e;
            q53Var.getClass();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((cw2) it.next()).f109628d);
            }
            Set set = CollectionsKt.toSet(arrayList);
            int iOrdinal = taVar.ordinal();
            if (iOrdinal == 0) {
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (((dw2) it2.next()) == dw2.f110099c) {
                            dw2Var = null;
                            break;
                        }
                    }
                }
                dw2Var = dw2.f110098b;
            } else if (iOrdinal == 1) {
                dw2Var = dw2.f110099c;
            } else {
                if (iOrdinal != 2) {
                    throw new lf.m();
                }
                dw2Var = dw2.f110098b;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList<cw2> arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((cw2) obj).f109626b != null) {
                    arrayList3.add(obj);
                }
            }
            for (cw2 cw2Var : arrayList3) {
                String str = cw2Var.f109626b;
                long j10 = cw2Var.f109625a;
                int i10 = cw2Var.f109627c;
                dw2 dw2Var2 = cw2Var.f109628d;
                dw2 dw2Var3 = (dw2Var2 != dw2.f110100d || dw2Var == null) ? dw2Var2 : dw2Var;
                if (str != null) {
                    arrayList2.add(new p53(i10, j10, dw2Var3, str));
                }
            }
            this.f110948m.addAll(arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        boolean z10 = lb1.f113032a;
        this.f110943h.b();
        Iterator it = this.f110948m.iterator();
        while (it.hasNext()) {
            ((p53) it.next()).f114566e = null;
        }
    }

    public final h93 b(p53 p53Var) {
        h93 h93VarB = this.f110938c.b(p53Var.a());
        Objects.toString(h93VarB);
        boolean z10 = lb1.f113032a;
        return h93VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(yads.eb2 r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            j$.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L17
            boolean r0 = yads.lb1.f113032a     // Catch: java.lang.Throwable -> L17
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r0 = 1
            if (r2 == r0) goto L13
            r0 = 2
            if (r2 == r0) goto L19
            goto L1e
        L13:
            r1.b()     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r2 = move-exception
            goto L20
        L19:
            if (r3 == 0) goto L1e
            r1.a()     // Catch: java.lang.Throwable -> L17
        L1e:
            monitor-exit(r1)
            return
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fv1.a(yads.eb2, boolean):void");
    }

    public final synchronized void a() {
        boolean z10 = lb1.f113032a;
        if (jb2.f112281h.a(this.f110936a).a() && !this.f110948m.isEmpty() && !this.f110943h.a()) {
            this.f110943h.a(this);
        }
    }

    public final synchronized void a(p53 p53Var, f93 f93Var) {
        try {
            this.f110941f.a(p53Var.f114562a, x53.f117718h);
            if (!this.f110946k) {
                this.f110946k = true;
                m41 m41Var = this.f110945j;
                if (m41Var != null) {
                    m41Var.c();
                }
            }
            if (!this.f110947l && this.f110948m.isEmpty()) {
                this.f110947l = true;
                m41 m41Var2 = this.f110945j;
                if (m41Var2 != null) {
                    m41Var2.g();
                }
            }
            this.f110937b.a(p53Var.f114565d, f93Var);
            p72 p72Var = this.f110937b;
            dw2 dw2Var = p53Var.f114565d;
            ArrayList arrayList = this.f110948m;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((p53) it.next()).f114565d);
            }
            p72Var.a(dw2Var, arrayList2, f93Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(t9 t9Var, List list) {
        boolean z10 = lb1.f113032a;
        this.f110937b.a(t9Var);
        this.f110948m.clear();
        this.f110937b.invalidate();
        this.f110947l = false;
        b();
        a(list);
    }

    public final h93 a(p53 p53Var) {
        h93 h93VarA;
        hr2 hr2VarA = this.f110942g.a(this.f110936a);
        if (hr2VarA != null && hr2VarA.f()) {
            h93VarA = this.f110938c.b(p53Var.a());
        } else {
            h93VarA = this.f110938c.a(p53Var.a());
        }
        Objects.toString(h93VarA);
        boolean z10 = lb1.f113032a;
        return h93VarA;
    }
}
