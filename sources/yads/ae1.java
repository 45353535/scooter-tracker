package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class ae1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv f108653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u23 f108654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd1 f108655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f108656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f108657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f108658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f108659g;

    public ae1(Looper looper, hv hvVar, yd1 yd1Var) {
        this(new CopyOnWriteArraySet(), looper, hvVar, yd1Var);
    }

    public final void a() {
        if (this.f108658f.isEmpty()) {
            return;
        }
        if (!this.f108654b.f116471a.hasMessages(0)) {
            u23 u23Var = this.f108654b;
            u23Var.getClass();
            t23 t23VarA = u23.a();
            Message messageObtainMessage = u23Var.f116471a.obtainMessage(0);
            t23VarA.f116042a = messageObtainMessage;
            Handler handler = u23Var.f116471a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            t23VarA.a();
        }
        boolean zIsEmpty = this.f108657e.isEmpty();
        this.f108657e.addAll(this.f108658f);
        this.f108658f.clear();
        if (zIsEmpty) {
            while (!this.f108657e.isEmpty()) {
                ((Runnable) this.f108657e.peekFirst()).run();
                this.f108657e.removeFirst();
            }
        }
    }

    public ae1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, hv hvVar, yd1 yd1Var) {
        this.f108653a = hvVar;
        this.f108656d = copyOnWriteArraySet;
        this.f108655c = yd1Var;
        this.f108657e = new ArrayDeque();
        this.f108658f = new ArrayDeque();
        this.f108654b = ((r23) hvVar).a(looper, new Handler.Callback() { // from class: yads.y2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f118062b.a(message);
            }
        });
    }

    public final boolean a(Message message) {
        for (zd1 zd1Var : this.f108656d) {
            yd1 yd1Var = this.f108655c;
            if (!zd1Var.f118631d && zd1Var.f118630c) {
                pu0 pu0VarA = zd1Var.f118629b.a();
                zd1Var.f118629b = new ou0();
                zd1Var.f118630c = false;
                yd1Var.a(zd1Var.f118628a, pu0VarA);
            }
            if (this.f108654b.f116471a.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, xd1 xd1Var) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            zd1 zd1Var = (zd1) it.next();
            if (!zd1Var.f118631d) {
                if (i10 != -1) {
                    zd1Var.f118629b.a(i10);
                }
                zd1Var.f118630c = true;
                xd1Var.invoke(zd1Var.f118628a);
            }
        }
    }

    public final void a(final int i10, final xd1 xd1Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f108656d);
        this.f108658f.add(new Runnable() { // from class: yads.x2
            @Override // java.lang.Runnable
            public final void run() {
                ae1.a(copyOnWriteArraySet, i10, xd1Var);
            }
        });
    }
}
