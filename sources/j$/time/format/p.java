package j$.time.format;

import j$.time.chrono.InterfaceC5639b;
import j$.time.w;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.n f84650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f84651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84652c;

    public p(j$.time.temporal.n nVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.t tVar = dateTimeFormatter.f84613d;
        if (tVar != null) {
            j$.time.chrono.m mVar = (j$.time.chrono.m) nVar.p(j$.time.temporal.r.f84717b);
            w wVar = (w) nVar.p(j$.time.temporal.r.f84716a);
            InterfaceC5639b interfaceC5639bL = null;
            tVar = Objects.equals(tVar, mVar) ? null : tVar;
            Objects.equals(null, wVar);
            if (tVar != null) {
                j$.time.chrono.m mVar2 = tVar != null ? tVar : mVar;
                if (tVar != null) {
                    if (nVar.f(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC5639bL = mVar2.l(nVar);
                    } else if (tVar != j$.time.chrono.t.f84589c || mVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.t() && nVar.f(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + tVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + nVar);
                            }
                        }
                    }
                }
                nVar = new o(interfaceC5639bL, nVar, mVar2, wVar);
            }
        }
        this.f84650a = nVar;
        this.f84651b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i10 = this.f84652c;
        j$.time.temporal.n nVar = this.f84650a;
        if (i10 <= 0 || nVar.f(qVar)) {
            return Long.valueOf(nVar.t(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f84650a.toString();
    }
}
