package com.my.target;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.my.target.common.MyTargetManager;
import com.my.target.h6;
import com.my.target.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f60012f = "ad.mail.ru";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f60013g = "https://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f60014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f60015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h6.a f60016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f60017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f60018e;

    public interface a {
        v a();

        s b();

        boolean c();

        q d();
    }

    public interface b {
        void a(t tVar, m mVar);
    }

    public l(a aVar, j jVar, h6.a aVar2) {
        this.f60014a = aVar;
        this.f60015b = jVar;
        this.f60016c = aVar2;
    }

    public static void a(h6 h6Var, int i10, long j10) {
        h6Var.a(i10, System.currentTimeMillis() - j10);
    }

    public static long b(h6 h6Var, int i10, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        h6Var.b(i10, jCurrentTimeMillis - j10);
        return jCurrentTimeMillis;
    }

    public final l a(b bVar) {
        this.f60018e = bVar;
        return this;
    }

    public l a(final h6 h6Var, Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (!MyTargetManager.isSdkInitialized()) {
            MyTargetManager.initSdk(applicationContext);
        }
        f0.a(new Runnable() { // from class: k5.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f86022b.b(h6Var, applicationContext);
            }
        });
        return this;
    }

    public final /* synthetic */ void b(final h6 h6Var, final Context context) {
        a(h6Var, context, new b() { // from class: k5.c1
            @Override // com.my.target.l.b
            public final void a(com.my.target.t tVar, com.my.target.m mVar) {
                this.f86005a.a(h6Var, context, tVar, mVar);
            }
        });
    }

    public void a(final h6 h6Var, final Context context, final b bVar) {
        r5.c(context);
        if (!k2.a(context)) {
            this.f60015b.a().a(0, 1002);
            bVar.a(null, m.f60099d);
            return;
        }
        final v8 v8VarA = v8.a(context);
        final ArrayList arrayList = new ArrayList();
        String strF = v8VarA.f();
        if (!TextUtils.isEmpty(strF)) {
            Collections.addAll(arrayList, strF.split(StringUtils.COMMA));
        }
        arrayList.add(f60012f);
        final v vVarA = this.f60014a.a();
        vVarA.a((String) arrayList.get(0), this.f60015b, h6Var, context, new v.b() { // from class: k5.b1
            @Override // com.my.target.v.b
            public final void a(com.my.target.u uVar, String str) {
                this.f85992a.a(h6Var, arrayList, vVarA, v8VarA, context, bVar, uVar, str);
            }
        });
    }

    public t a(t tVar, n nVar, Context context) {
        s sVarB;
        this.f60015b.a().b(0, 4000);
        return (tVar == null || (sVarB = this.f60014a.b()) == null) ? tVar : sVarB.a(tVar, this.f60015b, nVar, context);
    }

    public w a(u uVar, k2 k2Var, Map map, Context context) {
        o2 o2VarB = k2Var.b(uVar.f60846b, uVar.f60845a, map, context);
        if (o2VarB.d()) {
            return new w(o2VarB, (String) o2VarB.c());
        }
        this.f60017d = o2VarB.a();
        return new w(o2VarB, null);
    }

    public t a(List list, t tVar, q qVar, k2 k2Var, h6 h6Var, n nVar, Context context) {
        if (list.size() <= 0) {
            return tVar;
        }
        Iterator it = list.iterator();
        t tVar2 = tVar;
        while (it.hasNext()) {
            tVar2 = (t) a((u) it.next(), tVar2, qVar, k2Var, h6Var, nVar, context).f60974b;
        }
        return tVar2;
    }

    public w a(u uVar, t tVar, q qVar, k2 k2Var, h6 h6Var, n nVar, Context context) {
        u uVar2;
        int i10;
        t tVarA;
        Context context2 = context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o2 o2VarA = k2Var.a(uVar.f60846b, null, context2);
        a(h6Var, 1, jCurrentTimeMillis);
        if (!o2VarA.d()) {
            return new w(o2VarA, tVar);
        }
        bb.a(uVar.a("serviceRequested"), this.f60015b.a(), 0, context2);
        int iA = tVar != null ? tVar.a() : 0;
        String str = (String) o2VarA.c();
        if (str != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            i10 = iA;
            t tVarA2 = qVar.a(str, uVar, tVar, this.f60015b, this.f60016c, h6Var, null, nVar, context2);
            uVar2 = uVar;
            a(h6Var, 2, jCurrentTimeMillis2);
            context2 = context;
            tVarA = a(uVar2.D(), tVarA2, qVar, k2Var, h6Var, nVar, context2);
        } else {
            uVar2 = uVar;
            i10 = iA;
            tVarA = tVar;
        }
        if (i10 == (tVarA != null ? tVarA.a() : 0)) {
            bb.a(uVar2.a("serviceAnswerEmpty"), this.f60015b.a(), 0, context2);
            u uVarW = uVar2.w();
            if (uVarW != null) {
                tVarA = (t) a(uVarW, tVarA, qVar, k2Var, h6Var, nVar, context2).f60974b;
            }
        }
        return new w(o2VarA, tVarA);
    }

    public void a(final t tVar, final m mVar, h6 h6Var, Context context) {
        h6Var.b(context);
        if (this.f60018e == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f60018e.a(tVar, mVar);
            this.f60018e = null;
        } else {
            f0.f(new Runnable() { // from class: k5.d1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86016b.a(tVar, mVar);
                }
            });
        }
    }

    public final /* synthetic */ void a(t tVar, m mVar) {
        b bVar = this.f60018e;
        if (bVar != null) {
            bVar.a(tVar, mVar);
            this.f60018e = null;
        }
    }

    public final void a(u uVar, String str, h6 h6Var, List list, v vVar, v8 v8Var, Context context, b bVar) {
        String str2;
        o2 o2Var;
        Context context2;
        if (uVar == null) {
            this.f60015b.a().a(0, 1003, "adService == null");
            bVar.a(null, m.f60110o);
            return;
        }
        k2 k2VarA = k2.a(this.f60015b.a());
        h6Var.b();
        String str3 = uVar.f60845a;
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        this.f60015b.a().b(0, 2000);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int size = list.size() - 1;
        o2 o2Var2 = null;
        for (int i10 = 0; i10 <= size; i10++) {
            String str4 = (String) list.get(i10);
            u uVarA = vVar.a(f60013g + str4 + "/mobile/", this.f60015b, str3);
            w wVarA = a(uVarA, k2VarA, map, context);
            o2 o2Var3 = (o2) wVarA.f60973a;
            if (o2Var3 != null) {
                o2Var2 = o2Var3;
            }
            str2 = (String) wVarA.f60974b;
            if (q.a(str2)) {
                this.f60015b.a().a(uVarA.f60846b);
                o2Var = o2Var2;
                break;
            } else {
                if (i10 == size) {
                    break;
                }
                if (sb2.length() != 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str4);
                map.put("X-Failed-Hosts", sb2.toString());
            }
        }
        o2Var = o2Var2;
        str2 = null;
        if (str2 == null) {
            this.f60015b.a().c(0, 2002, o2Var != null ? "response: code=" + o2Var.b() + ", error=" + o2Var.a() + ", deflatedRequestParams=" + str3 : "response==null, deflatedRequestParams=" + str3);
            a(o2Var, bVar);
            return;
        }
        long jB = b(h6Var, 1, jCurrentTimeMillis);
        List arrayList = new ArrayList();
        q qVarD = this.f60014a.d();
        n nVarB = n.b();
        String str5 = str2;
        h6 h6Var2 = h6Var;
        t tVarA = qVarD.a(str5, uVar, null, this.f60015b, this.f60016c, h6Var2, arrayList, nVarB, context);
        b(h6Var2, 2, jB);
        v8Var.f(arrayList.isEmpty() ? null : TextUtils.join(StringUtils.COMMA, arrayList));
        if (this.f60014a.c()) {
            tVarA = a(uVar.D(), tVarA, qVarD, k2VarA, h6Var2, nVarB, context);
            context2 = context;
            h6Var2 = h6Var2;
        } else {
            context2 = context;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        t tVarA2 = a(tVarA, nVarB, context2);
        b(h6Var2, 3, jCurrentTimeMillis2);
        bVar.a(tVarA2, nVarB.a());
    }

    public final void a(o2 o2Var, b bVar) {
        if (o2Var == null) {
            bVar.a(null, m.f60098c);
            return;
        }
        int iB = o2Var.b();
        String str = iB + " – " + o2Var.a();
        if (iB == 403) {
            bVar.a(null, m.f60101f);
            return;
        }
        if (iB != 404) {
            if (iB != 408) {
                if (iB == 500) {
                    bVar.a(null, m.f60103h);
                    return;
                } else if (iB != 504) {
                    if (iB == 200) {
                        bVar.a(null, m.f60105j);
                        return;
                    } else {
                        bVar.a(null, m.a(1000, str));
                        return;
                    }
                }
            }
            bVar.a(null, m.f60100e);
            return;
        }
        bVar.a(null, m.f60102g);
    }
}
