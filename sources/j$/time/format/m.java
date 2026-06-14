package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.a f84636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f84637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f84638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f84639d;

    public m(j$.time.temporal.a aVar, v vVar, b bVar) {
        this.f84636a = aVar;
        this.f84637b = vVar;
        this.f84638c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb2) {
        String strB;
        Long lA = pVar.a(this.f84636a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.f84650a.p(j$.time.temporal.r.f84717b);
        if (mVar == null || mVar == j$.time.chrono.t.f84589c) {
            b bVar = this.f84638c;
            long jLongValue = lA.longValue();
            v vVar = this.f84637b;
            Locale locale = pVar.f84651b.f84611b;
            strB = bVar.f84616a.b(jLongValue, vVar);
        } else {
            b bVar2 = this.f84638c;
            long jLongValue2 = lA.longValue();
            v vVar2 = this.f84637b;
            Locale locale2 = pVar.f84651b.f84611b;
            strB = bVar2.f84616a.b(jLongValue2, vVar2);
        }
        if (strB != null) {
            sb2.append(strB);
            return true;
        }
        if (this.f84639d == null) {
            this.f84639d = new i(this.f84636a, 1, 19, u.NORMAL);
        }
        return this.f84639d.j(pVar, sb2);
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.a aVar = this.f84636a;
        v vVar2 = this.f84637b;
        if (vVar2 == vVar) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + StringUtils.COMMA + vVar2 + ")";
    }
}
