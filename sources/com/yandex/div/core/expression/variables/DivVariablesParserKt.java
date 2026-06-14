package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.kw;
import kotlin.Metadata;
import lf.m;
import lf.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk8/kw;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/data/Variable;", "toVariable", "(Lk8/kw;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/data/Variable;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivVariablesParserKt {
    @NotNull
    public static final Variable toVariable(@NotNull kw kwVar, @NotNull ExpressionResolver expressionResolver) {
        if (kwVar instanceof kw.b) {
            kw.b bVar = (kw.b) kwVar;
            return new Variable.BooleanVariable(bVar.c().f90288a, ((Boolean) bVar.c().f90289b.evaluate(expressionResolver)).booleanValue());
        }
        if (kwVar instanceof kw.g) {
            kw.g gVar = (kw.g) kwVar;
            return new Variable.IntegerVariable(gVar.c().f88158a, ((Number) gVar.c().f88159b.evaluate(expressionResolver)).longValue());
        }
        if (kwVar instanceof kw.h) {
            kw.h hVar = (kw.h) kwVar;
            return new Variable.DoubleVariable(hVar.c().f91208a, ((Number) hVar.c().f91209b.evaluate(expressionResolver)).doubleValue());
        }
        if (kwVar instanceof kw.j) {
            kw.j jVar = (kw.j) kwVar;
            return new Variable.StringVariable(jVar.c().f90499a, (String) jVar.c().f90500b.evaluate(expressionResolver));
        }
        if (kwVar instanceof kw.c) {
            kw.c cVar = (kw.c) kwVar;
            return new Variable.ColorVariable(cVar.c().f92834a, ((Number) cVar.c().f92835b.evaluate(expressionResolver)).intValue());
        }
        if (kwVar instanceof kw.k) {
            kw.k kVar = (kw.k) kwVar;
            return new Variable.UrlVariable(kVar.c().f93034a, (Uri) kVar.c().f93035b.evaluate(expressionResolver));
        }
        if (kwVar instanceof kw.f) {
            kw.f fVar = (kw.f) kwVar;
            return new Variable.DictVariable(fVar.c().f91220a, (JSONObject) fVar.c().f91221b.evaluate(expressionResolver));
        }
        if (kwVar instanceof kw.a) {
            kw.a aVar = (kw.a) kwVar;
            return new Variable.ArrayVariable(aVar.c().f87404a, (JSONArray) aVar.c().f87405b.evaluate(expressionResolver));
        }
        if (!(kwVar instanceof kw.i)) {
            throw new m();
        }
        throw new n("An operation is not implemented: Support property variables");
    }
}
