package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import k8.pw;
import k8.xw;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk8/pw;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "Lcom/yandex/div/core/player/DivVideoSource;", "createSource", "(Lk8/pw;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivVideoBinderKt {
    @NotNull
    public static final List<DivVideoSource> createSource(@NotNull pw pwVar, @NotNull ExpressionResolver expressionResolver) {
        List<xw> list = pwVar.Q;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (xw xwVar : list) {
            Uri uri = (Uri) xwVar.f92542d.evaluate(expressionResolver);
            String str = (String) xwVar.f92540b.evaluate(expressionResolver);
            xw.c cVar = xwVar.f92541c;
            Long l10 = null;
            DivVideoResolution divVideoResolution = cVar != null ? new DivVideoResolution((int) ((Number) cVar.f92548b.evaluate(expressionResolver)).longValue(), (int) ((Number) cVar.f92547a.evaluate(expressionResolver)).longValue()) : null;
            Expression expression = xwVar.f92539a;
            if (expression != null) {
                l10 = (Long) expression.evaluate(expressionResolver);
            }
            arrayList.add(new DivVideoSource(uri, str, divVideoResolution, l10));
        }
        return arrayList;
    }
}
