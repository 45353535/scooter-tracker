package io.bidmachine.analytics.internal.g;

import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g.c;
import lf.m;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final c.a a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            ReaderConfig.Rule.GeneralRule generalRule = (ReaderConfig.Rule.GeneralRule) rule;
            return new c.a.C0949a(generalRule.getCom.taurusx.tax.y.z.w.s.z.z java.lang.String(), generalRule.getPath());
        }
        if (!(rule instanceof ReaderConfig.Rule.PurRule)) {
            throw new m();
        }
        ReaderConfig.Rule.PurRule purRule = (ReaderConfig.Rule.PurRule) rule;
        return new c.a.b(purRule.getCom.taurusx.tax.y.z.w.s.z.z java.lang.String(), purRule.getPath(), purRule.getQuery(), purRule.getShouldReport());
    }
}
