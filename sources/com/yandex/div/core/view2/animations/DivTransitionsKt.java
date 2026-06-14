package com.yandex.div.core.view2.animations;

import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.aw;
import k8.ea;
import k8.lq;
import k8.zv;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u001b\u0010\u0004\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk8/zv;", "", "allowsTransitionsOnDataChange", "(Lk8/zv;)Z", "allowsTransitionsOnStateChange", "", "Lk8/aw;", "(Ljava/util/List;)Z", "allowsTransitionsOnVisibilityChange", "Lk8/ea;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "(Lk8/ea;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/lq;", "(Lk8/lq;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTransitionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[zv.values().length];
            try {
                iArr[zv.DATA_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zv.ANY_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zv.STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull zv zvVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[zvVar.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull zv zvVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[zvVar.ordinal()];
        return i10 == 2 || i10 == 3;
    }

    public static final boolean allowsTransitionsOnVisibilityChange(@NotNull List<? extends aw> list) {
        return list.contains(aw.VISIBILITY_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull List<? extends aw> list) {
        return list.contains(aw.DATA_CHANGE);
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull List<? extends aw> list) {
        return list.contains(aw.STATE_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull ea eaVar, @NotNull ExpressionResolver expressionResolver) {
        return allowsTransitionsOnDataChange((zv) eaVar.f87207e.evaluate(expressionResolver));
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull lq lqVar, @NotNull ExpressionResolver expressionResolver) {
        return allowsTransitionsOnStateChange((zv) lqVar.L.evaluate(expressionResolver));
    }
}
