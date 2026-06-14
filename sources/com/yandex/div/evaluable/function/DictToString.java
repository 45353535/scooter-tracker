package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u001d*\u00020\u001eH\u0002J\f\u0010\u001f\u001a\u00020\f*\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/yandex/div/evaluable/function/DictToString;", "Lcom/yandex/div/evaluable/Function;", "()V", "declaredArgs", "", "Lcom/yandex/div/evaluable/FunctionArgument;", "getDeclaredArgs", "()Ljava/util/List;", "isPure", "", "()Z", "name", "", "getName", "()Ljava/lang/String;", "resultType", "Lcom/yandex/div/evaluable/EvaluableType;", "getResultType", "()Lcom/yandex/div/evaluable/EvaluableType;", "evaluate", "", "evaluationContext", "Lcom/yandex/div/evaluable/EvaluationContext;", "expressionContext", "Lcom/yandex/div/evaluable/ExpressionContext;", "args", "evaluate-ex6DHhM", "(Lcom/yandex/div/evaluable/EvaluationContext;Lcom/yandex/div/evaluable/Evaluable;Ljava/util/List;)Ljava/lang/Object;", "sort", "", "Lorg/json/JSONObject;", "toStringLikeJson", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DictToString extends Function {
    private static final boolean isPure = false;

    @NotNull
    public static final DictToString INSTANCE = new DictToString();

    @NotNull
    private static final String name = "toString";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = CollectionsKt.listOf(new FunctionArgument(EvaluableType.DICT, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.STRING;

    private DictToString() {
    }

    private final Map<String, Object> sort(JSONObject jSONObject) throws JSONException {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            arrayList.add(key);
        }
        CollectionsKt.sort(arrayList);
        SortedMap sortedMapSortedMapOf = MapsKt.sortedMapOf(new Pair[0]);
        for (String str : arrayList) {
            Object objSort = jSONObject.get(str);
            if (objSort instanceof JSONObject) {
                objSort = INSTANCE.sort((JSONObject) objSort);
            }
            sortedMapSortedMapOf.put(str, objSort);
        }
        return sortedMapSortedMapOf;
    }

    private final String toStringLikeJson(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
            return sb2.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('\"');
            sb3.append(entry.getKey());
            sb3.append("\":");
            Object value = entry.getValue();
            sb3.append(value != null ? INSTANCE.toStringLikeJson(value) : null);
            arrayList.add(sb3.toString());
        }
        return '{' + CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null) + '}';
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    protected Object mo7589evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object objFirst = CollectionsKt.first(args);
        Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type org.json.JSONObject");
        return toStringLikeJson(sort((JSONObject) objFirst));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: isPure */
    public boolean getIsPure() {
        return isPure;
    }
}
