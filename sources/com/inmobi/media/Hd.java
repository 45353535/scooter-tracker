package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class Hd implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Jd f37014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gg.v f37015b;

    public Hd(Jd jd2, gg.v vVar) {
        this.f37014a = jd2;
        this.f37015b = vVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC3603bc abstractC3603bc = (AbstractC3603bc) obj;
        if (abstractC3603bc instanceof Xm) {
            Jd jd2 = this.f37014a;
            Xm xm = (Xm) abstractC3603bc;
            gg.v vVar = this.f37015b;
            if (!jd2.f37133c) {
                Long l10 = jd2.f37134d;
                if (l10 != null) {
                    if (xm.f38012a >= l10.longValue() + jd2.f37131a.f37465b && gg.k.i(vVar.e(Unit.f93236a))) {
                        jd2.f37133c = true;
                        jd2.f37134d = null;
                        jd2.f37132b.set(false);
                    }
                } else {
                    jd2.f37134d = Long.valueOf(xm.f38012a);
                    jd2.f37132b.set(true);
                }
            }
        } else if ((abstractC3603bc instanceof C3842kn) || (abstractC3603bc instanceof Om)) {
            Jd jd3 = this.f37014a;
            jd3.f37134d = null;
            jd3.f37132b.set(false);
        }
        return Unit.f93236a;
    }
}
