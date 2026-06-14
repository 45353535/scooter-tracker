package yads;

import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f110716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ko0 f110718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lo0 f110719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f110720e;

    public /* synthetic */ fg2() {
        this(SignalManager.TWENTY_FOUR_HOURS_MILLIS, 5, new ko0(), new lo0());
    }

    public final synchronized void a(zw0 zw0Var, Object obj) {
        a();
        if (this.f110720e.size() < this.f110717b) {
            ArrayList arrayList = this.f110720e;
            lo0 lo0Var = this.f110719d;
            long j10 = this.f110716a;
            lo0Var.getClass();
            arrayList.add(new eg2(zw0Var, obj, System.currentTimeMillis() + j10));
        }
    }

    public final synchronized boolean b() {
        a();
        return this.f110720e.size() < this.f110717b;
    }

    public fg2(long j10, int i10, ko0 ko0Var, lo0 lo0Var) {
        this.f110716a = j10;
        this.f110717b = i10;
        this.f110718c = ko0Var;
        this.f110719d = lo0Var;
        this.f110720e = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f110720e;
        ko0 ko0Var = this.f110718c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ko0Var.getClass();
            if (System.currentTimeMillis() > ((eg2) ((jo0) obj)).f110366c) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f110720e.remove((eg2) it.next());
        }
    }

    public final synchronized Object a(zw0 zw0Var) {
        Object obj;
        Object next;
        Object obj2;
        try {
            a();
            Iterator it = this.f110720e.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((eg2) next).f110364a, zw0Var)) {
                    break;
                }
            }
            eg2 eg2Var = (eg2) next;
            if (eg2Var != null && (obj2 = eg2Var.f110365b) != null) {
                this.f110720e.remove(eg2Var);
                obj = obj2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return obj;
    }
}
