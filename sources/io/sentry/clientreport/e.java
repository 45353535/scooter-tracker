package io.sentry.clientreport;

import io.sentry.f7;
import io.sentry.g7;
import io.sentry.k;
import io.sentry.k7;
import io.sentry.l;
import io.sentry.protocol.e0;
import io.sentry.u5;
import io.sentry.u6;
import io.sentry.v7;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f83377a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83378b;

    public e(v7 v7Var) {
        this.f83378b = v7Var;
    }

    private k f(f7 f7Var) {
        return f7.Event.equals(f7Var) ? k.Error : f7.Session.equals(f7Var) ? k.Session : f7.Transaction.equals(f7Var) ? k.Transaction : f7.UserFeedback.equals(f7Var) ? k.UserReport : f7.Feedback.equals(f7Var) ? k.Feedback : f7.Profile.equals(f7Var) ? k.Profile : f7.ProfileChunk.equals(f7Var) ? k.ProfileChunkUi : f7.Attachment.equals(f7Var) ? k.Attachment : f7.CheckIn.equals(f7Var) ? k.Monitor : f7.ReplayVideo.equals(f7Var) ? k.Replay : f7.Log.equals(f7Var) ? k.LogItem : k.Default;
    }

    private void g(f fVar, k kVar, Long l10) {
        this.f83378b.getOnDiscard();
    }

    private void h(String str, String str2, Long l10) {
        this.f83377a.a(new d(str, str2), l10);
    }

    private void j(c cVar) {
        if (cVar == null) {
            return;
        }
        for (g gVar : cVar.a()) {
            h(gVar.c(), gVar.a(), gVar.b());
        }
    }

    @Override // io.sentry.clientreport.h
    public void a(f fVar, k kVar) {
        b(fVar, kVar, 1L);
    }

    @Override // io.sentry.clientreport.h
    public void b(f fVar, k kVar, long j10) {
        try {
            h(fVar.getReason(), kVar.getCategory(), Long.valueOf(j10));
            g(fVar, kVar, Long.valueOf(j10));
        } catch (Throwable th2) {
            this.f83378b.getLogger().b(g7.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void c(f fVar, u6 u6Var) {
        if (u6Var == null) {
            return;
        }
        try {
            f7 f7VarB = u6Var.J().b();
            if (f7.ClientReport.equals(f7VarB)) {
                try {
                    j(u6Var.H(this.f83378b.getSerializer()));
                    return;
                } catch (Exception unused) {
                    this.f83378b.getLogger().c(g7.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            k kVarF = f(f7VarB);
            if (kVarF.equals(k.Transaction)) {
                e0 e0VarL = u6Var.L(this.f83378b.getSerializer());
                if (e0VarL != null) {
                    List listQ0 = e0VarL.q0();
                    String reason = fVar.getReason();
                    k kVar = k.Span;
                    h(reason, kVar.getCategory(), Long.valueOf(((long) listQ0.size()) + 1));
                    g(fVar, kVar, Long.valueOf(((long) listQ0.size()) + 1));
                }
                h(fVar.getReason(), kVarF.getCategory(), 1L);
                g(fVar, kVarF, 1L);
                return;
            }
            if (!kVarF.equals(k.LogItem)) {
                h(fVar.getReason(), kVarF.getCategory(), 1L);
                g(fVar, kVarF, 1L);
                return;
            }
            k7 k7VarK = u6Var.K(this.f83378b.getSerializer());
            if (k7VarK == null) {
                this.f83378b.getLogger().c(g7.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                return;
            }
            long size = k7VarK.a().size();
            h(fVar.getReason(), kVarF.getCategory(), Long.valueOf(size));
            h(fVar.getReason(), k.LogByte.getCategory(), Long.valueOf(u6Var.I().length));
            g(fVar, kVarF, Long.valueOf(size));
        } catch (Throwable th2) {
            this.f83378b.getLogger().b(g7.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void d(f fVar, u5 u5Var) {
        if (u5Var == null) {
            return;
        }
        try {
            Iterator it = u5Var.c().iterator();
            while (it.hasNext()) {
                c(fVar, (u6) it.next());
            }
        } catch (Throwable th2) {
            this.f83378b.getLogger().b(g7.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public u5 e(u5 u5Var) {
        c cVarI = i();
        if (cVarI == null) {
            return u5Var;
        }
        try {
            this.f83378b.getLogger().c(g7.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator it = u5Var.c().iterator();
            while (it.hasNext()) {
                arrayList.add((u6) it.next());
            }
            arrayList.add(u6.A(this.f83378b.getSerializer(), cVarI));
            return new u5(u5Var.b(), arrayList);
        } catch (Throwable th2) {
            this.f83378b.getLogger().b(g7.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return u5Var;
        }
    }

    c i() {
        Date dateD = l.d();
        List listB = this.f83377a.b();
        if (listB.isEmpty()) {
            return null;
        }
        return new c(dateD, listB);
    }
}
