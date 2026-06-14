package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f60959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab f60960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60961c = -1;

    public v9(za zaVar) {
        ArrayList arrayList = new ArrayList();
        for (ya yaVar : zaVar.b("playheadTimerValue").f59176a) {
            if (yaVar instanceof x9) {
                arrayList.add((x9) yaVar);
            }
        }
        this.f60959a = arrayList;
        ab abVarA = ab.a(new ArrayList(), zaVar.a());
        this.f60960b = abVarA;
        zaVar.a(abVarA);
    }

    public static v9 a(za zaVar) {
        return new v9(zaVar);
    }

    public void a(int i10, int i11, Context context) {
        if (i11 < 0 || i10 < 0 || i10 == this.f60961c) {
            return;
        }
        this.f60961c = i10;
        if (!this.f60959a.isEmpty() && i10 != 0) {
            ArrayList arrayList = this.f60959a;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                a(i10, (x9) obj, context);
            }
        }
        ab abVarA = ab.a(new ArrayList(), this.f60960b.f59177b);
        while (!this.f60960b.f59176a.isEmpty()) {
            List list = this.f60960b.f59176a;
            if (((w8) list.get(list.size() - 1)).e() > i10) {
                break;
            }
            List list2 = this.f60960b.f59176a;
            abVarA.f59176a.add((w8) list2.remove(list2.size() - 1));
        }
        bb.b(abVarA, 1, context);
    }

    public final void a(int i10, x9 x9Var, Context context) {
        int iF = x9Var.f();
        int iD = x9Var.d();
        if (iF <= i10) {
            if ((iD == 0 || iD >= i10) && (i10 - iF) % x9Var.e() == 0) {
                String strReplace = x9Var.b().replace(com.taurusx.tax.n.z.f66399y, String.valueOf(i10));
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                bb.c(strReplace, context);
            }
        }
    }
}
