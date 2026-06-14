package com.yandex.div.core.actions;

import android.net.Uri;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.fw;
import k8.k4;
import k8.m5;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u000b\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSetStoredValueHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/k4;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleAction", "(Lk8/k4;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/fw;", "value", "", "name", "Lcom/yandex/div/data/StoredValue;", "createStoredValue", "(Lk8/fw;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/data/StoredValue;", "scopeId", "Lk8/m5;", "", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedSetStoredValueHandler implements DivActionTypedHandler {
    private final StoredValue createStoredValue(fw value, String name, ExpressionResolver resolver) {
        if (value instanceof fw.i) {
            return new StoredValue.StringStoredValue(name, (String) ((fw.i) value).c().f88738a.evaluate(resolver));
        }
        if (value instanceof fw.g) {
            return new StoredValue.IntegerStoredValue(name, ((Number) ((fw.g) value).c().f86858a.evaluate(resolver)).longValue());
        }
        if (value instanceof fw.b) {
            return new StoredValue.BooleanStoredValue(name, ((Boolean) ((fw.b) value).c().f88541a.evaluate(resolver)).booleanValue());
        }
        if (value instanceof fw.h) {
            return new StoredValue.DoubleStoredValue(name, ((Number) ((fw.h) value).c().f90115a.evaluate(resolver)).doubleValue());
        }
        if (value instanceof fw.c) {
            return new StoredValue.ColorStoredValue(name, Color.m7660constructorimpl(((Number) ((fw.c) value).c().f91540a.evaluate(resolver)).intValue()), null);
        }
        if (value instanceof fw.j) {
            return new StoredValue.UrlStoredValue(name, Url.INSTANCE.m7677fromVcSV9u8(((Uri) ((fw.j) value).c().f91871a.evaluate(resolver)).toString()), null);
        }
        if (value instanceof fw.a) {
            return new StoredValue.ArrayStoredValue(name, (JSONArray) ((fw.a) value).c().f86177a.evaluate(resolver));
        }
        if (value instanceof fw.f) {
            return new StoredValue.DictStoredValue(name, (JSONObject) ((fw.f) value).c().f90125a.evaluate(resolver));
        }
        throw new m();
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof m5.q)) {
            return false;
        }
        handleAction(((m5.q) action).c(), view, resolver);
        return true;
    }

    private final void handleAction(k4 action, Div2View view, ExpressionResolver resolver) {
        String str = (String) action.f88562b.evaluate(resolver);
        long jLongValue = ((Number) action.f88561a.evaluate(resolver)).longValue();
        StoredValuesActionHandler.INSTANCE.executeAction(createStoredValue(action.f88563c, str, resolver), jLongValue, view);
    }
}
