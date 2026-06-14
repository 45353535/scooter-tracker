package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bb f59296a = new bb();

    public static void a(ab abVar, Map map, int i10, Context context) {
        f59296a.b(abVar.f59176a, map, abVar.f59177b, i10, context);
    }

    public static void b(ab abVar, int i10, Context context) {
        if (abVar.f59176a.isEmpty()) {
            return;
        }
        f59296a.b(abVar.f59176a, (Map) null, abVar.f59177b, i10, context);
    }

    public static void c(za zaVar, String str, int i10, Context context) {
        ab abVarB = zaVar.b(str);
        if (abVarB.f59176a.isEmpty()) {
            return;
        }
        f59296a.b(abVarB.f59176a, (Map) null, abVarB.f59177b, i10, context);
    }

    public static void a(List list, o oVar, int i10, Context context) {
        f59296a.b(list, (Map) null, oVar, i10, context);
    }

    public static void a(ab abVar, int i10, Context context) {
        f59296a.b(abVar.f59176a, (Map) null, abVar.f59177b, i10, context);
    }

    public static void b(za zaVar, String str, int i10, Context context) {
        ab abVarB = zaVar.b(str);
        f59296a.b(abVarB.f59176a, (Map) null, abVarB.f59177b, i10, context);
    }

    public static void a(za zaVar, String str, int i10, Context context) {
        f59296a.b(zaVar.a(str), (Map) null, zaVar.a(), i10, context);
    }

    public static void c(String str, Context context) {
        f59296a.b(str, context);
    }

    public void b(final List list, final Map map, final o oVar, final int i10, final Context context) {
        if (list != null && !list.isEmpty()) {
            f0.e(new Runnable() { // from class: k5.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86072b.a(list, map, oVar, i10, context);
                }
            });
        } else {
            gb.a("No stats here, nothing to send");
        }
    }

    public final /* synthetic */ void a(List list, Map map, o oVar, int i10, Context context) {
        p2 p2VarA = p2.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((ya) it.next(), map, p2VarA, oVar, i10, context);
        }
    }

    public void b(final List list, final Map map, final h0 h0Var, final int i10, final Context context) {
        if (list.isEmpty()) {
            gb.a("No stats here, nothing to send");
        } else {
            f0.e(new Runnable() { // from class: k5.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86061b.a(list, map, h0Var, i10, context);
                }
            });
        }
    }

    public final /* synthetic */ void a(List list, Map map, h0 h0Var, int i10, Context context) {
        p2 p2VarA = p2.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((ya) it.next(), map, p2VarA, h0Var, i10, context);
        }
    }

    public void b(final String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        f0.e(new Runnable() { // from class: k5.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f86054b.a(str, applicationContext);
            }
        });
    }

    public final /* synthetic */ void a(String str, Context context) {
        String strA = a(str);
        if (strA != null) {
            p2.a().a(strA, null, context);
        }
    }

    public String a(String str) {
        return a(str, true);
    }

    public String a(String str, boolean z10) {
        if (z10) {
            str = lb.a(str);
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        gb.a("StatResolver: Invalid stat url: " + str);
        return null;
    }

    public final void a(ya yaVar) {
        if (yaVar instanceof w8) {
            gb.a("StatResolver: Tracking progress stat value - " + ((w8) yaVar).e() + ", url - " + yaVar.b());
            return;
        }
        if (yaVar instanceof o8) {
            o8 o8Var = (o8) yaVar;
            gb.a("StatResolver: Tracking ovv stat percent - " + o8Var.f59178d + ", value - " + o8Var.f() + ", ovv - " + o8Var.g() + ", url - " + yaVar.b());
            return;
        }
        if (yaVar instanceof t6) {
            t6 t6Var = (t6) yaVar;
            gb.a("StatResolver: Tracking mrc stat percent - , percent - " + t6Var.f59178d + ", duration - " + t6Var.f60838f + ", url - " + yaVar.b());
            return;
        }
        gb.a("StatResolver: Tracking stat type - " + yaVar.a() + ", url - " + yaVar.b());
    }

    public final void a(ya yaVar, Map map, p2 p2Var, o oVar, int i10, Context context) {
        a(yaVar);
        String strA = a(yaVar.b(), yaVar.c());
        if (strA == null) {
            oVar.a(i10, 9000, "getValidUrl is null for statType=" + yaVar.a() + ", needDecode=" + yaVar.c() + ", statUrl=" + yaVar.b());
            return;
        }
        if (map != null && !map.isEmpty()) {
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            strA = strA + builder.build().toString();
        }
        Context applicationContext = context.getApplicationContext();
        if (p2Var == null) {
            p2Var = p2.a();
        }
        o2 o2VarA = p2Var.a(strA, null, applicationContext);
        if (o2VarA.b() != 200) {
            oVar.a(i10, 9000, "responseCode=" + o2VarA.b() + ", statType=" + yaVar.a() + ", needDecode=" + yaVar.c() + ", statUrl=" + yaVar.b());
        }
    }

    public final void a(ya yaVar, Map map, p2 p2Var, h0 h0Var, int i10, Context context) {
        a(yaVar);
        String strA = a(yaVar.b(), yaVar.c());
        if (strA == null) {
            h0Var.a(i10, 9000, "getValidUrl is null, statType=" + yaVar.a() + ", needDecode=" + yaVar.c() + ", statUrl=" + yaVar.b());
            return;
        }
        if (map != null && !map.isEmpty()) {
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            strA = strA + builder.build().toString();
        }
        Context applicationContext = context.getApplicationContext();
        if (p2Var == null) {
            p2Var = p2.a();
        }
        o2 o2VarA = p2Var.a(strA, null, applicationContext);
        if (o2VarA.b() != 200) {
            h0Var.a(i10, 9000, "send failed: responseCode=" + o2VarA.b() + ", statType=" + yaVar.a() + ", needDecode=" + yaVar.c() + ", statUrl=" + yaVar.b());
        }
    }
}
