package com.yandex.div.core.view2.divs;

import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.Expression;
import k8.dp;
import k8.hx;
import k8.ra;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\"\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lk8/dp;", "Lcom/yandex/div/json/expressions/Expression;", "", "getDuration", "(Lk8/dp;)Lcom/yandex/div/json/expressions/Expression;", "duration", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivSightExtensionsKt {
    @NotNull
    public static final Expression<Long> getDuration(@NotNull dp dpVar) {
        if (dpVar instanceof hx) {
            return ((hx) dpVar).f88152j;
        }
        if (dpVar instanceof ra) {
            return ((ra) dpVar).f90655a;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Trying to get duration field for unsupported DivSightAction class");
        }
        return Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    }
}
