package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jb2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hb2 f112281h = new hb2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile jb2 f112282i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt2 f112284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb2 f112285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fb2 f112286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f112287e = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f112288f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public eb2 f112289g = eb2.f110298d;

    public jb2(Context context, Executor executor, vt2 vt2Var, gb2 gb2Var, fb2 fb2Var) {
        this.f112283a = context;
        this.f112284b = vt2Var;
        this.f112285c = gb2Var;
        this.f112286d = fb2Var;
        executor.execute(new Runnable() { // from class: yads.ma
            @Override // java.lang.Runnable
            public final void run() {
                jb2.a(this.f113353b);
            }
        });
    }

    public static final void a(jb2 jb2Var) {
        eb2 eb2VarA = jb2Var.f112285c.a();
        jb2Var.f112289g = eb2VarA;
        Objects.toString(eb2VarA);
        boolean z10 = lb1.f113032a;
        try {
            jb2Var.f112286d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                jb2Var.f112283a.registerReceiver(jb2Var, intentFilter, 2);
            } else {
                jb2Var.f112283a.registerReceiver(jb2Var, intentFilter);
            }
        } catch (Exception unused) {
            boolean z11 = lb1.f113032a;
        }
    }

    public final void b(ib2 ib2Var) {
        synchronized (this.f112288f) {
            this.f112287e.remove(ib2Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        eb2 eb2Var;
        HashSet hashSet;
        synchronized (this.f112288f) {
            try {
                eb2 eb2Var2 = this.f112289g;
                String action = intent.getAction();
                eb2 eb2Var3 = Intrinsics.areEqual(action, "android.intent.action.SCREEN_OFF") ? eb2.f110297c : Intrinsics.areEqual(action, "android.intent.action.USER_PRESENT") ? eb2.f110298d : (this.f112289g == eb2.f110298d || !Intrinsics.areEqual(action, "android.intent.action.SCREEN_ON")) ? this.f112289g : eb2.f110296b;
                this.f112289g = eb2Var3;
                if (eb2Var2 != eb2Var3) {
                    Objects.toString(eb2Var3);
                    boolean z10 = lb1.f113032a;
                }
                eb2Var = this.f112289g;
                hashSet = new HashSet(this.f112287e.keySet());
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ib2) it.next()).a(eb2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x000e, B:8:0x0012, B:10:0x0018, B:15:0x001f), top: B:23:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r4 = this;
            yads.vt2 r0 = r4.f112284b
            android.content.Context r1 = r4.f112283a
            yads.hr2 r0 = r0.a(r1)
            java.lang.Object r1 = r4.f112288f
            monitor-enter(r1)
            r2 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r0.f111729h     // Catch: java.lang.Throwable -> L1d
            if (r0 != r2) goto L1f
            yads.eb2 r0 = r4.f112289g     // Catch: java.lang.Throwable -> L1d
            yads.eb2 r3 = yads.eb2.f110296b     // Catch: java.lang.Throwable -> L1d
            if (r0 == r3) goto L27
            yads.eb2 r3 = yads.eb2.f110298d     // Catch: java.lang.Throwable -> L1d
            if (r0 != r3) goto L26
            goto L27
        L1d:
            r0 = move-exception
            goto L29
        L1f:
            yads.eb2 r0 = r4.f112289g     // Catch: java.lang.Throwable -> L1d
            yads.eb2 r3 = yads.eb2.f110298d     // Catch: java.lang.Throwable -> L1d
            if (r0 != r3) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            monitor-exit(r1)
            return r2
        L29:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.jb2.a():boolean");
    }

    public final void a(ib2 ib2Var) {
        synchronized (this.f112288f) {
            this.f112287e.put(ib2Var, null);
            Unit unit = Unit.f93236a;
        }
    }
}
