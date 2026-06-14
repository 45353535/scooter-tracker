package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x43 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p72 f117701a;

    public x43(p72 p72Var, Looper looper) {
        super(looper);
        this.f117701a = p72Var;
    }

    public final boolean a() {
        return hasMessages(2);
    }

    public final void b() {
        removeMessages(2);
        removeMessages(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            Object obj = message.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.monetization.ads.base.impression.tracking.handler.TrackHandler.TrackNoticeObject");
            w43 w43Var = (w43) obj;
            fv1 fv1Var = (fv1) w43Var.f117315a.get();
            if (fv1Var != null) {
                boolean z10 = lb1.f113032a;
                p53 p53Var = w43Var.f117316b;
                fv1Var.f110941f.a(p53Var.f114562a, x53.f117718h);
                fv1Var.f110948m.remove(p53Var);
                if (!fv1Var.f110947l && fv1Var.f110948m.isEmpty()) {
                    fv1Var.f110947l = true;
                    m41 m41Var = fv1Var.f110945j;
                    if (m41Var != null) {
                        m41Var.g();
                    }
                }
                p72 p72Var = this.f117701a;
                dw2 dw2Var = w43Var.f117316b.f114565d;
                List list = CollectionsKt.toList(fv1Var.f110948m);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p53) it.next()).f114565d);
                }
                p72Var.a(dw2Var, arrayList, w43Var.f117317c);
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        Object obj2 = message.obj;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
        fv1 fv1Var2 = (fv1) ((WeakReference) obj2).get();
        if (fv1Var2 != null) {
            List<p53> list2 = CollectionsKt.toList(fv1Var2.f110948m);
            list2.size();
            boolean z11 = lb1.f113032a;
            int i11 = Integer.MIN_VALUE;
            for (p53 p53Var2 : list2) {
                if (p53Var2.f114564c > i11) {
                    h93 h93VarB = fv1Var2.b(p53Var2);
                    if (h93VarB instanceof f93) {
                        i11 = p53Var2.f114564c;
                        a(p53Var2, fv1Var2, (f93) h93VarB);
                    } else if (h93VarB instanceof e93) {
                        p53Var2.f114566e = null;
                        this.f117701a.a(p53Var2.f114565d, (e93) h93VarB);
                    }
                } else {
                    a(p53Var2, fv1Var2, new f93(CollectionsKt.emptyList()));
                }
            }
            if (list2.isEmpty()) {
                return;
            }
            sendMessageDelayed(Message.obtain(this, 2, new WeakReference(fv1Var2)), 200L);
        }
    }

    public final void a(p53 p53Var, fv1 fv1Var, f93 f93Var) {
        long jElapsedRealtime;
        Long l10 = p53Var.f114566e;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            p53Var.f114566e = Long.valueOf(jElapsedRealtime);
        }
        if (SystemClock.elapsedRealtime() - jElapsedRealtime >= p53Var.f114563b) {
            sendMessage(Message.obtain(this, 1, new w43(new WeakReference(fv1Var), p53Var, f93Var)));
        }
        if (!fv1Var.f110946k) {
            fv1Var.f110946k = true;
            m41 m41Var = fv1Var.f110945j;
            if (m41Var != null) {
                m41Var.c();
            }
        }
        this.f117701a.a(p53Var.f114565d, f93Var);
    }

    public final void a(s72 s72Var) {
        sendMessage(Message.obtain(this, 2, new WeakReference(s72Var)));
    }
}
