package com.yandex.div.internal.core;

import androidx.activity.s;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.appodeal.ads.Appodeal;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.target.common.menu.MenuActionType;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.as;
import k8.ee;
import k8.ff;
import k8.go;
import k8.jk;
import k8.k8;
import k8.le;
import k8.lq;
import k8.pw;
import k8.rn;
import k8.td;
import k8.te;
import k8.tp;
import k8.tr;
import k8.u8;
import k8.us;
import k8.x9;
import k8.y0;
import k8.yf;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\b\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u000f\u001a!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0016\u001a\u0004\u0018\u00010\u0004*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u000b*\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020 2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b!\u0010\"\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020#2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b!\u0010$\u001a!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020%2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010*\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b*\u0010+\"\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003*\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003*\u00020 8F¢\u0006\u0006\u001a\u0004\b-\u00100¨\u00061"}, d2 = {"Lk8/u8;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "buildItems", "(Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lk8/td;", "(Lk8/td;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lk8/jk;", "(Lk8/jk;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lk8/y0;", FirebaseAnalytics.Param.ITEMS, "Lk8/k8;", "itemBuilder", "(Ljava/util/List;Lk8/k8;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "build", "(Lk8/k8;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "", "data", "", FirebaseAnalytics.Param.INDEX, "buildItem", "(Lk8/k8;Ljava/lang/Object;ILcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItemResolver", "(Lk8/k8;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/json/expressions/ExpressionResolver;", "dataElement", "(Lk8/k8;Ljava/lang/Object;ILcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/json/expressions/ExpressionResolver;", "", "id", MenuActionType.COPY, "(Lk8/y0;Ljava/lang/String;)Lk8/y0;", "Lk8/le;", "itemsToDivItemBuilderResult", "(Lk8/le;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lk8/as;", "(Lk8/as;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lk8/lq;", "statesToDivItemBuilderResult", "(Lk8/lq;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "toDivItemBuilderResult", "(Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "toItemBuilderResult", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/internal/core/DivItemBuilderResult;", "Lk8/x9;", "getNonNullItems", "(Lk8/x9;)Ljava/util/List;", "nonNullItems", "(Lk8/le;)Ljava/util/List;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivCollectionExtensionsKt {
    @NotNull
    public static final List<DivItemBuilderResult> build(@NotNull k8 k8Var, @NotNull ExpressionResolver expressionResolver) {
        JSONArray jSONArray = (JSONArray) k8Var.f88580a.evaluate(expressionResolver);
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            DivItemBuilderResult divItemBuilderResultBuildItem = buildItem(k8Var, jSONArray.get(i10), i10, expressionResolver);
            if (divItemBuilderResultBuildItem != null) {
                arrayList.add(divItemBuilderResultBuildItem);
            }
        }
        return arrayList;
    }

    private static final DivItemBuilderResult buildItem(k8 k8Var, Object obj, int i10, ExpressionResolver expressionResolver) {
        Object next;
        ExpressionResolver itemResolver = getItemResolver(k8Var, obj, i10, expressionResolver);
        if (itemResolver == null) {
            return null;
        }
        Iterator it = k8Var.f88582c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) ((k8.c) next).f88590c.evaluate(itemResolver)).booleanValue()) {
                break;
            }
        }
        k8.c cVar = (k8.c) next;
        if (cVar == null) {
            return null;
        }
        y0 y0Var = cVar.f88588a;
        Expression expression = cVar.f88589b;
        return toItemBuilderResult(copy(y0Var, expression != null ? (String) expression.evaluate(itemResolver) : null), itemResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull u8 u8Var, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(u8Var.B, u8Var.f91616z, expressionResolver);
    }

    private static final y0 copy(y0 y0Var, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (y0Var instanceof y0.h) {
            return new y0.h(te.z(((y0.h) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 8388607, null));
        }
        if (y0Var instanceof y0.f) {
            return new y0.f(ee.z(((y0.f) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 262143, null));
        }
        if (y0Var instanceof y0.r) {
            return new y0.r(us.z(((y0.r) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, -1, 31, null));
        }
        if (y0Var instanceof y0.m) {
            return new y0.m(go.z(((y0.m) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 2047, null));
        }
        if (y0Var instanceof y0.c) {
            y0.c cVar = (y0.c) y0Var;
            u8 u8VarD = cVar.d();
            List list = cVar.d().B;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(copy$default((y0) it.next(), null, 1, null));
                }
                arrayList4 = arrayList5;
            } else {
                arrayList4 = null;
            }
            return new y0.c(u8.z(u8VarD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, arrayList4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -150994945, 4194303, null));
        }
        if (y0Var instanceof y0.g) {
            y0.g gVar = (y0.g) y0Var;
            le leVarD = gVar.d();
            List list3 = gVar.d().f88817y;
            if (list3 != null) {
                List list4 = list3;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(copy$default((y0) it2.next(), null, 1, null));
                }
                arrayList3 = arrayList6;
            } else {
                arrayList3 = null;
            }
            return new y0.g(le.z(leVarD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25165825, 16383, null));
        }
        if (y0Var instanceof y0.e) {
            y0.e eVar = (y0.e) y0Var;
            td tdVarD = eVar.d();
            List list5 = eVar.d().f91300u;
            if (list5 != null) {
                List list6 = list5;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(copy$default((y0) it3.next(), null, 1, null));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            return new y0.e(td.z(tdVarD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1179649, 2047, null));
        }
        if (y0Var instanceof y0.k) {
            y0.k kVar = (y0.k) y0Var;
            jk jkVarD = kVar.d();
            List list7 = kVar.d().f88456t;
            if (list7 != null) {
                List list8 = list7;
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(copy$default((y0) it4.next(), null, 1, null));
                }
                arrayList = arrayList8;
            } else {
                arrayList = null;
            }
            return new y0.k(jk.z(jkVarD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -557057, 2047, null));
        }
        if (y0Var instanceof y0.q) {
            y0.q qVar = (y0.q) y0Var;
            as asVarD = qVar.d();
            List<as.c> list9 = qVar.d().f86342q;
            ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
            for (as.c cVar2 : list9) {
                arrayList9.add(as.c.b(cVar2, copy$default(cVar2.f86355a, null, 1, null), null, null, 6, null));
            }
            return new y0.q(as.z(asVarD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98305, 2047, null));
        }
        if (y0Var instanceof y0.o) {
            y0.o oVar = (y0.o) y0Var;
            lq lqVarD = oVar.d();
            List<lq.c> list10 = oVar.d().I;
            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
            for (lq.c cVar3 : list10) {
                y0 y0Var2 = cVar3.f88889c;
                arrayList10.add(lq.c.b(cVar3, null, null, y0Var2 != null ? copy$default(y0Var2, null, 1, null) : null, null, null, 27, null));
            }
            return new y0.o(lq.z(lqVarD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, arrayList10, null, null, null, null, null, null, null, null, null, null, null, null, null, -8421377, 65531, null));
        }
        if (y0Var instanceof y0.d) {
            x9 x9VarD = ((y0.d) y0Var).d();
            return new y0.d(x9VarD.y(((-32769) & 1) != 0 ? x9VarD.o() : null, ((-32769) & 2) != 0 ? x9VarD.g() : null, ((-32769) & 4) != 0 ? x9VarD.m() : null, ((-32769) & 8) != 0 ? x9VarD.getAlpha() : null, ((-32769) & 16) != 0 ? x9VarD.w() : null, ((-32769) & 32) != 0 ? x9VarD.getBackground() : null, ((-32769) & 64) != 0 ? x9VarD.x() : null, ((-32769) & 128) != 0 ? x9VarD.b() : null, ((-32769) & 256) != 0 ? x9VarD.f92310i : null, ((-32769) & 512) != 0 ? x9VarD.f92311j : null, ((-32769) & 1024) != 0 ? x9VarD.k() : null, ((-32769) & 2048) != 0 ? x9VarD.getExtensions() : null, ((-32769) & 4096) != 0 ? x9VarD.n() : null, ((-32769) & 8192) != 0 ? x9VarD.u() : null, ((-32769) & 16384) != 0 ? x9VarD.getHeight() : null, ((-32769) & 32768) != 0 ? x9VarD.getId() : str, ((-32769) & 65536) != 0 ? x9VarD.f92318q : null, ((-32769) & 131072) != 0 ? x9VarD.r() : null, ((-32769) & 262144) != 0 ? x9VarD.d() : null, ((-32769) & 524288) != 0 ? x9VarD.p() : null, ((-32769) & 1048576) != 0 ? x9VarD.f() : null, ((-32769) & 2097152) != 0 ? x9VarD.e() : null, ((-32769) & 4194304) != 0 ? x9VarD.q() : null, ((-32769) & 8388608) != 0 ? x9VarD.h() : null, ((-32769) & 16777216) != 0 ? x9VarD.getTransform() : null, ((-32769) & 33554432) != 0 ? x9VarD.j() : null, ((-32769) & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? x9VarD.v() : null, ((-32769) & 134217728) != 0 ? x9VarD.i() : null, ((-32769) & 268435456) != 0 ? x9VarD.l() : null, ((-32769) & 536870912) != 0 ? x9VarD.s() : null, ((-32769) & 1073741824) != 0 ? x9VarD.c() : null, ((-32769) & Integer.MIN_VALUE) != 0 ? x9VarD.getVisibility() : null, (7 & 1) != 0 ? x9VarD.t() : null, (7 & 2) != 0 ? x9VarD.a() : null, (7 & 4) != 0 ? x9VarD.getWidth() : null));
        }
        if (y0Var instanceof y0.i) {
            return new y0.i(ff.z(((y0.i) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, Appodeal.ALL, null));
        }
        if (y0Var instanceof y0.n) {
            return new y0.n(tp.z(((y0.n) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 32767, null));
        }
        if (y0Var instanceof y0.j) {
            return new y0.j(yf.z(((y0.j) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 134217727, null));
        }
        if (y0Var instanceof y0.l) {
            return new y0.l(rn.z(((y0.l) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 8191, null));
        }
        if (y0Var instanceof y0.s) {
            return new y0.s(pw.z(((y0.s) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 32767, null));
        }
        if (y0Var instanceof y0.p) {
            return new y0.p(tr.z(((y0.p) y0Var).d(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 7, null));
        }
        throw new m();
    }

    static /* synthetic */ y0 copy$default(y0 y0Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = y0Var.c().getId();
        }
        return copy(y0Var, str);
    }

    @NotNull
    public static final ExpressionResolver getItemResolver(@NotNull k8 k8Var, @NotNull ExpressionResolver expressionResolver) throws JSONException {
        ExpressionResolver itemResolver;
        JSONArray jSONArray = (JSONArray) k8Var.f88580a.evaluate(expressionResolver);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (s.a(obj) && (itemResolver = getItemResolver(k8Var, obj, i10, expressionResolver)) != null) {
                return itemResolver;
            }
        }
        return expressionResolver;
    }

    @NotNull
    public static final List<y0> getNonNullItems(@NotNull x9 x9Var) {
        List<y0> list = x9Var.f92318q;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull le leVar, @NotNull ExpressionResolver expressionResolver) {
        return toDivItemBuilderResult(getNonNullItems(leVar), expressionResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> statesToDivItemBuilderResult(@NotNull lq lqVar, @NotNull ExpressionResolver expressionResolver) {
        List list = lqVar.I;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0 y0Var = ((lq.c) it.next()).f88889c;
            DivItemBuilderResult itemBuilderResult = y0Var != null ? toItemBuilderResult(y0Var, expressionResolver) : null;
            if (itemBuilderResult != null) {
                arrayList.add(itemBuilderResult);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> toDivItemBuilderResult(@NotNull List<? extends y0> list, @NotNull ExpressionResolver expressionResolver) {
        List<? extends y0> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult((y0) it.next(), expressionResolver));
        }
        return arrayList;
    }

    @NotNull
    public static final DivItemBuilderResult toItemBuilderResult(@NotNull y0 y0Var, @NotNull ExpressionResolver expressionResolver) {
        return new DivItemBuilderResult(y0Var, expressionResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull td tdVar, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(tdVar.f91300u, tdVar.f91298s, expressionResolver);
    }

    @NotNull
    public static final List<y0> getNonNullItems(@NotNull le leVar) {
        List<y0> list = leVar.f88817y;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull as asVar, @NotNull ExpressionResolver expressionResolver) {
        List list = asVar.f86342q;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult(((as.c) it.next()).f86355a, expressionResolver));
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull jk jkVar, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(jkVar.f88456t, jkVar.f88454r, expressionResolver);
    }

    private static final List<DivItemBuilderResult> buildItems(List<? extends y0> list, k8 k8Var, ExpressionResolver expressionResolver) {
        List<DivItemBuilderResult> listBuild;
        if (k8Var != null && (listBuild = build(k8Var, expressionResolver)) != null) {
            return listBuild;
        }
        if (list != null) {
            return toDivItemBuilderResult(list, expressionResolver);
        }
        return CollectionsKt.emptyList();
    }

    private static final ExpressionResolver getItemResolver(final k8 k8Var, Object obj, final int i10, ExpressionResolver expressionResolver) {
        final ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(expressionResolver);
        if (asImpl == null) {
            return expressionResolver;
        }
        final JSONObject jSONObjectValidateItemBuilderDataElement = asImpl.validateItemBuilderDataElement(obj, i10);
        if (jSONObjectValidateItemBuilderDataElement == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(':');
        sb2.append(i10);
        final String string = sb2.toString();
        return asImpl.getRuntimeStore().getOrPutItemBuilderResolver(asImpl.getPath() + IOUtils.DIR_SEPARATOR_UNIX + string, expressionResolver, new Function0<ExpressionResolver>() { // from class: com.yandex.div.internal.core.DivCollectionExtensionsKt.getItemResolver.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExpressionResolver invoke() {
                return asImpl.withConstants$div_release(string, new ConstantsProvider(MapsKt.mapOf(TuplesKt.to(k8Var.f88581b, jSONObjectValidateItemBuilderDataElement), TuplesKt.to(FirebaseAnalytics.Param.INDEX, Long.valueOf(i10)))));
            }
        });
    }
}
