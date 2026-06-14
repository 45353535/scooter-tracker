package com.yandex.div.core.util;

import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k8.a7;
import k8.ar;
import k8.cb;
import k8.cc;
import k8.ep;
import k8.fi;
import k8.fm;
import k8.g9;
import k8.hb;
import k8.kp;
import k8.l7;
import k8.ml;
import k8.oa;
import k8.oo;
import k8.sm;
import k8.to;
import k8.wv;
import k8.xc;
import k8.yf;
import k8.z0;
import k8.zl;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import lf.m;
import mf.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0003\u0010\u000b\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0005\u0010\f\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0003\u0010\u000e\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0005\u0010\u000f\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00102\b\u0010\u0001\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0003\u0010\u0011\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0005\u0010\u0012\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00132\b\u0010\u0001\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0003\u0010\u0014\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0005\u0010\u0015\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00162\b\u0010\u0001\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0003\u0010\u0017\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0005\u0010\u0018\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00192\b\u0010\u0001\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u0003\u0010\u001a\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u0005\u0010\u001b\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u001c2\b\u0010\u0001\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u0003\u0010\u001d\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u0005\u0010\u001e\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u001f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b\u0003\u0010 \u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b\u0005\u0010!\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\"2\b\u0010\u0001\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b\u0003\u0010#\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b\u0005\u0010$\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010%2\b\u0010\u0001\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b\u0003\u0010&\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b\u0005\u0010'\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010(2\b\u0010\u0001\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b\u0003\u0010)\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b\u0005\u0010*\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010+2\b\u0010\u0001\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b\u0003\u0010,\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b\u0005\u0010-\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010.2\b\u0010\u0001\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b\u0003\u0010/\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b\u0005\u00100\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u0001012\b\u0010\u0001\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b\u0003\u00102\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u000101H\u0000¢\u0006\u0004\b\u0005\u00103\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u0001042\b\u0010\u0001\u001a\u0004\u0018\u000104H\u0000¢\u0006\u0004\b\u0003\u00105\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u000104H\u0000¢\u0006\u0004\b\u0005\u00106\u001a\u001b\u0010;\u001a\u00020:*\u0002072\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010=2\b\u0010\u0001\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0004\b\u0003\u0010>\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010=H\u0000¢\u0006\u0004\b\u0005\u0010?\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010@2\b\u0010\u0001\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\b\u0003\u0010A\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010@H\u0000¢\u0006\u0004\b\u0005\u0010B\u001a\u001f\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010C2\b\u0010\u0001\u001a\u0004\u0018\u00010CH\u0000¢\u0006\u0004\b\u0003\u0010D\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010CH\u0000¢\u0006\u0004\b\u0005\u0010E¨\u0006F"}, d2 = {"Lk8/ep;", "other", "", "equalsToConstant", "(Lk8/ep;Lk8/ep;)Z", "isConstant", "(Lk8/ep;)Z", "Lk8/xc;", "(Lk8/xc;Lk8/xc;)Z", "(Lk8/xc;)Z", "Lk8/hb;", "(Lk8/hb;Lk8/hb;)Z", "(Lk8/hb;)Z", "Lk8/z0;", "(Lk8/z0;Lk8/z0;)Z", "(Lk8/z0;)Z", "Lk8/wv;", "(Lk8/wv;Lk8/wv;)Z", "(Lk8/wv;)Z", "Lk8/ml;", "(Lk8/ml;Lk8/ml;)Z", "(Lk8/ml;)Z", "Lk8/cc;", "(Lk8/cc;Lk8/cc;)Z", "(Lk8/cc;)Z", "Lk8/cb;", "(Lk8/cb;Lk8/cb;)Z", "(Lk8/cb;)Z", "Lk8/to;", "(Lk8/to;Lk8/to;)Z", "(Lk8/to;)Z", "Lk8/ar;", "(Lk8/ar;Lk8/ar;)Z", "(Lk8/ar;)Z", "Lk8/l7;", "(Lk8/l7;Lk8/l7;)Z", "(Lk8/l7;)Z", "Lk8/g9;", "(Lk8/g9;Lk8/g9;)Z", "(Lk8/g9;)Z", "Lk8/oo;", "(Lk8/oo;Lk8/oo;)Z", "(Lk8/oo;)Z", "Lk8/zl;", "(Lk8/zl;Lk8/zl;)Z", "(Lk8/zl;)Z", "Lk8/oa;", "(Lk8/oa;Lk8/oa;)Z", "(Lk8/oa;)Z", "Lk8/a7;", "(Lk8/a7;Lk8/a7;)Z", "(Lk8/a7;)Z", "Lk8/fi$a;", "(Lk8/fi$a;Lk8/fi$a;)Z", "(Lk8/fi$a;)Z", "Lk8/fi;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/internal/graphics/Colormap;", "toColormap", "(Lk8/fi;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/internal/graphics/Colormap;", "Lk8/fm;", "(Lk8/fm;Lk8/fm;)Z", "(Lk8/fm;)Z", "Lk8/sm;", "(Lk8/sm;Lk8/sm;)Z", "(Lk8/sm;)Z", "Lk8/yf$f;", "(Lk8/yf$f;Lk8/yf$f;)Z", "(Lk8/yf$f;)Z", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivDataExtensionsKt {
    public static final boolean equalsToConstant(@Nullable ep epVar, @Nullable ep epVar2) {
        if (epVar == null) {
            return epVar2 == null;
        }
        if (epVar instanceof ep.c) {
            if (epVar2 instanceof ep.c) {
                ep.c cVar = (ep.c) epVar;
                ep.c cVar2 = (ep.c) epVar2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f92339b, cVar2.c().f92339b) && ExpressionsKt.equalsToConstant(cVar.c().f92338a, cVar2.c().f92338a)) {
                    return true;
                }
            }
            return false;
        }
        if (epVar instanceof ep.d) {
            if (epVar2 instanceof ep.d) {
                ep.d dVar = (ep.d) epVar;
                ep.d dVar2 = (ep.d) epVar2;
                if (ExpressionsKt.equalsToConstant(dVar.c().f90044c, dVar2.c().f90044c)) {
                    kp kpVar = dVar.c().f90043b;
                    Expression expression = kpVar != null ? kpVar.f88677b : null;
                    kp kpVar2 = dVar2.c().f90043b;
                    if (ExpressionsKt.equalsToConstant(expression, kpVar2 != null ? kpVar2.f88677b : null)) {
                        kp kpVar3 = dVar.c().f90043b;
                        Expression expression2 = kpVar3 != null ? kpVar3.f88676a : null;
                        kp kpVar4 = dVar2.c().f90043b;
                        if (ExpressionsKt.equalsToConstant(expression2, kpVar4 != null ? kpVar4.f88676a : null)) {
                            kp kpVar5 = dVar.c().f90042a;
                            Expression expression3 = kpVar5 != null ? kpVar5.f88677b : null;
                            kp kpVar6 = dVar2.c().f90042a;
                            if (ExpressionsKt.equalsToConstant(expression3, kpVar6 != null ? kpVar6.f88677b : null)) {
                                kp kpVar7 = dVar.c().f90042a;
                                Expression expression4 = kpVar7 != null ? kpVar7.f88676a : null;
                                kp kpVar8 = dVar2.c().f90042a;
                                if (ExpressionsKt.equalsToConstant(expression4, kpVar8 != null ? kpVar8.f88676a : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (!(epVar instanceof ep.e)) {
            throw new m();
        }
        if (epVar2 instanceof ep.e) {
            ep.e eVar = (ep.e) epVar;
            ep.e eVar2 = (ep.e) epVar2;
            if (ExpressionsKt.equalsToConstant(eVar.c().f90108a, eVar2.c().f90108a)) {
                kp kpVar9 = eVar.c().f90110c;
                Expression expression5 = kpVar9 != null ? kpVar9.f88677b : null;
                kp kpVar10 = eVar2.c().f90110c;
                if (ExpressionsKt.equalsToConstant(expression5, kpVar10 != null ? kpVar10.f88677b : null)) {
                    kp kpVar11 = eVar.c().f90110c;
                    Expression expression6 = kpVar11 != null ? kpVar11.f88676a : null;
                    kp kpVar12 = eVar2.c().f90110c;
                    if (ExpressionsKt.equalsToConstant(expression6, kpVar12 != null ? kpVar12.f88676a : null)) {
                        kp kpVar13 = eVar.c().f90109b;
                        Expression expression7 = kpVar13 != null ? kpVar13.f88677b : null;
                        kp kpVar14 = eVar2.c().f90109b;
                        if (ExpressionsKt.equalsToConstant(expression7, kpVar14 != null ? kpVar14.f88677b : null)) {
                            kp kpVar15 = eVar.c().f90109b;
                            Expression expression8 = kpVar15 != null ? kpVar15.f88676a : null;
                            kp kpVar16 = eVar2.c().f90109b;
                            if (ExpressionsKt.equalsToConstant(expression8, kpVar16 != null ? kpVar16.f88676a : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable ep epVar) {
        if (epVar == null) {
            return true;
        }
        if (epVar instanceof ep.c) {
            ep.c cVar = (ep.c) epVar;
            return ExpressionsKt.isConstant(cVar.c().f92339b) && ExpressionsKt.isConstant(cVar.c().f92338a);
        }
        if (epVar instanceof ep.d) {
            ep.d dVar = (ep.d) epVar;
            if (ExpressionsKt.isConstantOrNull(dVar.c().f90044c)) {
                kp kpVar = dVar.c().f90043b;
                if (ExpressionsKt.isConstantOrNull(kpVar != null ? kpVar.f88677b : null)) {
                    kp kpVar2 = dVar.c().f90043b;
                    if (ExpressionsKt.isConstantOrNull(kpVar2 != null ? kpVar2.f88676a : null)) {
                        kp kpVar3 = dVar.c().f90042a;
                        if (ExpressionsKt.isConstantOrNull(kpVar3 != null ? kpVar3.f88677b : null)) {
                            kp kpVar4 = dVar.c().f90042a;
                            if (ExpressionsKt.isConstantOrNull(kpVar4 != null ? kpVar4.f88676a : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (!(epVar instanceof ep.e)) {
            throw new m();
        }
        ep.e eVar = (ep.e) epVar;
        if (ExpressionsKt.isConstantOrNull(eVar.c().f90108a)) {
            kp kpVar5 = eVar.c().f90110c;
            if (ExpressionsKt.isConstantOrNull(kpVar5 != null ? kpVar5.f88677b : null)) {
                kp kpVar6 = eVar.c().f90110c;
                if (ExpressionsKt.isConstantOrNull(kpVar6 != null ? kpVar6.f88676a : null)) {
                    kp kpVar7 = eVar.c().f90109b;
                    if (ExpressionsKt.isConstantOrNull(kpVar7 != null ? kpVar7.f88677b : null)) {
                        kp kpVar8 = eVar.c().f90109b;
                        if (ExpressionsKt.isConstantOrNull(kpVar8 != null ? kpVar8.f88676a : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final Colormap toColormap(@NotNull fi fiVar, @NotNull final ExpressionResolver expressionResolver) {
        List list = fiVar.f87515b;
        List listSortedWith = list != null ? CollectionsKt.sortedWith(list, new Comparator() { // from class: com.yandex.div.core.util.DivDataExtensionsKt$toColormap$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.d((Double) ((fi.a) t10).f87521b.evaluate(expressionResolver), (Double) ((fi.a) t11).f87521b.evaluate(expressionResolver));
            }
        }) : null;
        ExpressionList expressionList = fiVar.f87516c;
        if (listSortedWith == null) {
            return expressionList != null ? new Colormap(CollectionsKt.toIntArray(expressionList.evaluate(expressionResolver)), null, 2, null) : Colormap.EMPTY;
        }
        int[] iArr = new int[listSortedWith.size()];
        float[] fArr = new float[listSortedWith.size()];
        int size = listSortedWith.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Number) ((fi.a) listSortedWith.get(i10)).f87520a.evaluate(expressionResolver)).intValue();
            fArr[i10] = (float) ((Number) ((fi.a) listSortedWith.get(i10)).f87521b.evaluate(expressionResolver)).doubleValue();
        }
        return new Colormap(iArr, fArr);
    }

    public static final boolean isConstant(@Nullable xc xcVar) {
        if (xcVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(xcVar.f92339b) && ExpressionsKt.isConstant(xcVar.f92338a);
    }

    public static final boolean isConstant(@Nullable hb hbVar) {
        if (hbVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(hbVar.f88002c) && ExpressionsKt.isConstant(hbVar.f88005f) && ExpressionsKt.isConstant(hbVar.f88003d) && ExpressionsKt.isConstant(hbVar.f88000a) && ExpressionsKt.isConstantOrNull(hbVar.f88004e) && ExpressionsKt.isConstantOrNull(hbVar.f88001b);
    }

    public static final boolean equalsToConstant(@Nullable xc xcVar, @Nullable xc xcVar2) {
        if (xcVar == null && xcVar2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(xcVar != null ? xcVar.f92339b : null, xcVar2 != null ? xcVar2.f92339b : null)) {
            return ExpressionsKt.equalsToConstant(xcVar != null ? xcVar.f92338a : null, xcVar2 != null ? xcVar2.f92338a : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable hb hbVar, @Nullable hb hbVar2) {
        if (hbVar == null && hbVar2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(hbVar != null ? hbVar.f88002c : null, hbVar2 != null ? hbVar2.f88002c : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(hbVar != null ? hbVar.f88005f : null, hbVar2 != null ? hbVar2.f88005f : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(hbVar != null ? hbVar.f88003d : null, hbVar2 != null ? hbVar2.f88003d : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(hbVar != null ? hbVar.f88000a : null, hbVar2 != null ? hbVar2.f88000a : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(hbVar != null ? hbVar.f88004e : null, hbVar2 != null ? hbVar2.f88004e : null)) {
            return ExpressionsKt.equalsToConstant(hbVar != null ? hbVar.f88001b : null, hbVar2 != null ? hbVar2.f88001b : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable z0 z0Var) {
        if (z0Var == null) {
            return true;
        }
        return ExpressionsKt.isConstant(z0Var.f92845b) && ExpressionsKt.isConstant(z0Var.f92847d) && ExpressionsKt.isConstant(z0Var.f92846c) && ExpressionsKt.isConstant(z0Var.f92844a);
    }

    public static final boolean isConstant(@Nullable wv wvVar) {
        if (wvVar == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(wvVar.f92249c) && isConstant(wvVar.f92247a) && isConstant(wvVar.f92248b);
    }

    public static final boolean equalsToConstant(@Nullable z0 z0Var, @Nullable z0 z0Var2) {
        if (z0Var == null && z0Var2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(z0Var != null ? z0Var.f92845b : null, z0Var2 != null ? z0Var2.f92845b : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(z0Var != null ? z0Var.f92847d : null, z0Var2 != null ? z0Var2.f92847d : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(z0Var != null ? z0Var.f92846c : null, z0Var2 != null ? z0Var2.f92846c : null)) {
            return ExpressionsKt.equalsToConstant(z0Var != null ? z0Var.f92844a : null, z0Var2 != null ? z0Var2.f92844a : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable ml mlVar) {
        if (mlVar == null) {
            return true;
        }
        if (mlVar instanceof ml.c) {
            ml.c cVar = (ml.c) mlVar;
            return ExpressionsKt.isConstantOrNull(cVar.c().f90052b) && ExpressionsKt.isConstantOrNull(cVar.c().f90052b);
        }
        if (mlVar instanceof ml.d) {
            return ExpressionsKt.isConstant(((ml.d) mlVar).c().f91404a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable wv wvVar, @Nullable wv wvVar2) {
        if (wvVar == null && wvVar2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(wvVar != null ? wvVar.f92249c : null, wvVar2 != null ? wvVar2.f92249c : null)) {
            return false;
        }
        if (equalsToConstant(wvVar != null ? wvVar.f92247a : null, wvVar2 != null ? wvVar2.f92247a : null)) {
            return equalsToConstant(wvVar != null ? wvVar.f92248b : null, wvVar2 != null ? wvVar2.f92248b : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable cc ccVar) {
        if (ccVar == null || (ccVar instanceof cc.d)) {
            return true;
        }
        if (ccVar instanceof cc.a) {
            return ExpressionsKt.isConstant(((cc.a) ccVar).c().f87989a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable cb cbVar) {
        if (cbVar == null) {
            return true;
        }
        if (!(cbVar instanceof cb.c)) {
            throw new m();
        }
        cb.c cVar = (cb.c) cbVar;
        return ExpressionsKt.isConstant(cVar.c().f91703a) && isConstant(cVar.c().f91704b) && isConstant(cVar.c().f91705c);
    }

    public static final boolean equalsToConstant(@Nullable ml mlVar, @Nullable ml mlVar2) {
        if (mlVar == null) {
            return mlVar2 == null;
        }
        if (mlVar instanceof ml.c) {
            if (mlVar2 instanceof ml.c) {
                ml.c cVar = (ml.c) mlVar;
                ml.c cVar2 = (ml.c) mlVar2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f90052b, cVar2.c().f90052b) && ExpressionsKt.equalsToConstant(cVar.c().f90051a, cVar2.c().f90051a)) {
                    return true;
                }
            }
            return false;
        }
        if (mlVar instanceof ml.d) {
            return (mlVar2 instanceof ml.d) && ExpressionsKt.equalsToConstant(((ml.d) mlVar).c().f91404a, ((ml.d) mlVar2).c().f91404a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable to toVar) {
        ar arVar;
        if (toVar == null) {
            return true;
        }
        if (toVar instanceof to.d) {
            to.d dVar = (to.d) toVar;
            return ExpressionsKt.isConstantOrNull(dVar.c().f87840a) && isConstant(dVar.c().f87844e) && isConstant(dVar.c().f87843d) && isConstant(dVar.c().f87842c) && isConstant(dVar.c().f87841b);
        }
        if (!(toVar instanceof to.a)) {
            throw new m();
        }
        to.a aVar = (to.a) toVar;
        return ExpressionsKt.isConstantOrNull(aVar.c().f86906a) && ((arVar = aVar.c().f86908c) == null || isConstant(arVar)) && isConstant(aVar.c().f86907b);
    }

    public static final boolean equalsToConstant(@Nullable cc ccVar, @Nullable cc ccVar2) {
        if (ccVar == null) {
            return ccVar2 == null;
        }
        if (ccVar instanceof cc.d) {
            return ccVar2 instanceof cc.d;
        }
        if (ccVar instanceof cc.a) {
            return (ccVar2 instanceof cc.a) && ExpressionsKt.equalsToConstant(((cc.a) ccVar).c().f87989a, ((cc.a) ccVar2).c().f87989a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable cb cbVar, @Nullable cb cbVar2) {
        if (cbVar == null) {
            return cbVar2 == null;
        }
        if (!(cbVar instanceof cb.c)) {
            throw new m();
        }
        if (cbVar2 instanceof cb.c) {
            cb.c cVar = (cb.c) cbVar;
            cb.c cVar2 = (cb.c) cbVar2;
            if (ExpressionsKt.equalsToConstant(cVar.c().f91703a, cVar2.c().f91703a) && equalsToConstant(cVar.c().f91704b, cVar2.c().f91704b) && equalsToConstant(cVar.c().f91705c, cVar2.c().f91705c)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable ar arVar) {
        if (arVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(arVar.f86313a) && ExpressionsKt.isConstant(arVar.f86316d) && ExpressionsKt.isConstant(arVar.f86315c);
    }

    public static final boolean equalsToConstant(@Nullable to toVar, @Nullable to toVar2) {
        if (toVar == null) {
            return toVar2 == null;
        }
        if (toVar instanceof to.d) {
            if (toVar2 instanceof to.d) {
                to.d dVar = (to.d) toVar;
                to.d dVar2 = (to.d) toVar2;
                if (ExpressionsKt.equalsToConstant(dVar.c().f87840a, dVar2.c().f87840a) && equalsToConstant(dVar.c().f87844e, dVar2.c().f87844e) && equalsToConstant(dVar.c().f87843d, dVar2.c().f87843d) && equalsToConstant(dVar.c().f87842c, dVar2.c().f87842c) && equalsToConstant(dVar.c().f87841b, dVar2.c().f87841b)) {
                    return true;
                }
            }
            return false;
        }
        if (!(toVar instanceof to.a)) {
            throw new m();
        }
        if (toVar2 instanceof to.a) {
            to.a aVar = (to.a) toVar;
            to.a aVar2 = (to.a) toVar2;
            if (ExpressionsKt.equalsToConstant(aVar.c().f86906a, aVar2.c().f86906a) && equalsToConstant(aVar.c().f86908c, aVar2.c().f86908c) && equalsToConstant(aVar.c().f86907b, aVar2.c().f86907b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable l7 l7Var) {
        if (l7Var == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(l7Var.f88755a) && isConstant(l7Var.f88756b) && ExpressionsKt.isConstant(l7Var.f88757c) && isConstant(l7Var.f88758d) && isConstant(l7Var.f88759e);
    }

    public static final boolean isConstant(@Nullable g9 g9Var) {
        if (g9Var == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(g9Var.f87782c) && ExpressionsKt.isConstantOrNull(g9Var.f87783d) && ExpressionsKt.isConstantOrNull(g9Var.f87781b) && ExpressionsKt.isConstantOrNull(g9Var.f87780a);
    }

    public static final boolean isConstant(@Nullable oo ooVar) {
        if (ooVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(ooVar.f90233a) && ExpressionsKt.isConstant(ooVar.f90234b) && ExpressionsKt.isConstant(ooVar.f90235c) && isConstant(ooVar.f90236d);
    }

    public static final boolean equalsToConstant(@Nullable ar arVar, @Nullable ar arVar2) {
        if (arVar == null && arVar2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(arVar != null ? arVar.f86313a : null, arVar2 != null ? arVar2.f86313a : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(arVar != null ? arVar.f86316d : null, arVar2 != null ? arVar2.f86316d : null)) {
            return ExpressionsKt.equalsToConstant(arVar != null ? arVar.f86315c : null, arVar2 != null ? arVar2.f86315c : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable l7 l7Var, @Nullable l7 l7Var2) {
        if (l7Var == null && l7Var2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(l7Var != null ? l7Var.f88755a : null, l7Var2 != null ? l7Var2.f88755a : null)) {
            return false;
        }
        if (!equalsToConstant(l7Var != null ? l7Var.f88756b : null, l7Var2 != null ? l7Var2.f88756b : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(l7Var != null ? l7Var.f88757c : null, l7Var2 != null ? l7Var2.f88757c : null)) {
            return false;
        }
        if (equalsToConstant(l7Var != null ? l7Var.f88758d : null, l7Var2 != null ? l7Var2.f88758d : null)) {
            return equalsToConstant(l7Var != null ? l7Var.f88759e : null, l7Var2 != null ? l7Var2.f88759e : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable zl zlVar) {
        if (zlVar == null) {
            return true;
        }
        return isConstant(zlVar.f92958a) && isConstant(zlVar.f92959b);
    }

    public static final boolean isConstant(@Nullable oa oaVar) {
        if (oaVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(oaVar.f90179a) && ExpressionsKt.isConstant(oaVar.f90180b);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isConstant(@org.jetbrains.annotations.Nullable k8.a7 r4) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.DivDataExtensionsKt.isConstant(k8.a7):boolean");
    }

    public static final boolean equalsToConstant(@Nullable g9 g9Var, @Nullable g9 g9Var2) {
        if (g9Var == null && g9Var2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(g9Var != null ? g9Var.f87782c : null, g9Var2 != null ? g9Var2.f87782c : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(g9Var != null ? g9Var.f87783d : null, g9Var2 != null ? g9Var2.f87783d : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(g9Var != null ? g9Var.f87781b : null, g9Var2 != null ? g9Var2.f87781b : null)) {
            return ExpressionsKt.equalsToConstant(g9Var != null ? g9Var.f87780a : null, g9Var2 != null ? g9Var2.f87780a : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable oo ooVar, @Nullable oo ooVar2) {
        if (ooVar == null && ooVar2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(ooVar != null ? ooVar.f90233a : null, ooVar2 != null ? ooVar2.f90233a : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(ooVar != null ? ooVar.f90234b : null, ooVar2 != null ? ooVar2.f90234b : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(ooVar != null ? ooVar.f90235c : null, ooVar2 != null ? ooVar2.f90235c : null)) {
            return equalsToConstant(ooVar != null ? ooVar.f90236d : null, ooVar2 != null ? ooVar2.f90236d : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable zl zlVar, @Nullable zl zlVar2) {
        if (zlVar == null && zlVar2 == null) {
            return true;
        }
        if (equalsToConstant(zlVar != null ? zlVar.f92958a : null, zlVar2 != null ? zlVar2.f92958a : null)) {
            return equalsToConstant(zlVar != null ? zlVar.f92959b : null, zlVar2 != null ? zlVar2.f92959b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable oa oaVar, @Nullable oa oaVar2) {
        if (oaVar == null && oaVar2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(oaVar != null ? oaVar.f90179a : null, oaVar2 != null ? oaVar2.f90179a : null)) {
            return ExpressionsKt.equalsToConstant(oaVar != null ? oaVar.f90180b : null, oaVar2 != null ? oaVar2.f90180b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable a7 a7Var, @Nullable a7 a7Var2) {
        if (a7Var == null) {
            return a7Var2 == null;
        }
        if (a7Var instanceof a7.g) {
            return (a7Var2 instanceof a7.g) && ExpressionsKt.equalsToConstant(((a7.g) a7Var).c().f87894a, ((a7.g) a7Var2).c().f87894a);
        }
        if (a7Var instanceof a7.c) {
            a7.c cVar = (a7.c) a7Var;
            List listEmptyList = cVar.c().f91661d;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (a7Var2 instanceof a7.c) {
                a7.c cVar2 = (a7.c) a7Var2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f91658a, cVar2.c().f91658a) && ExpressionsKt.equalsToConstant(cVar.c().f91659b, cVar2.c().f91659b) && ExpressionsKt.equalsToConstant(cVar.c().f91660c, cVar2.c().f91660c)) {
                    List listEmptyList2 = cVar2.c().f91661d;
                    if (listEmptyList2 == null) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    }
                    if (listEmptyList.size() == listEmptyList2.size()) {
                        Iterator it = listEmptyList.iterator();
                        int i10 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (!equalsToConstant((cc) next, (cc) listEmptyList2.get(i10))) {
                                    break;
                                }
                                i10 = i11;
                            } else {
                                if (!ExpressionsKt.equalsToConstant(cVar.c().f91662e, cVar2.c().f91662e) || !ExpressionsKt.equalsToConstant(cVar.c().f91663f, cVar2.c().f91663f) || !ExpressionsKt.equalsToConstant(cVar.c().f91664g, cVar2.c().f91664g)) {
                                    break;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (a7Var instanceof a7.d) {
            a7.d dVar = (a7.d) a7Var;
            List listEmptyList3 = dVar.c().f87515b;
            if (listEmptyList3 == null) {
                listEmptyList3 = CollectionsKt.emptyList();
            }
            if (a7Var2 instanceof a7.d) {
                a7.d dVar2 = (a7.d) a7Var2;
                if (ExpressionsKt.equalsToConstant(dVar.c().f87514a, dVar2.c().f87514a) && ExpressionsKt.equalsToConstant(dVar.c().f87516c, dVar2.c().f87516c)) {
                    List listEmptyList4 = dVar2.c().f87515b;
                    if (listEmptyList4 == null) {
                        listEmptyList4 = CollectionsKt.emptyList();
                    }
                    if (listEmptyList3.size() == listEmptyList4.size()) {
                        int i12 = 0;
                        for (Object obj : listEmptyList3) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (equalsToConstant((fi.a) obj, (fi.a) listEmptyList4.get(i12))) {
                                i12 = i13;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        if (a7Var instanceof a7.f) {
            if (a7Var2 instanceof a7.f) {
                a7.f fVar = (a7.f) a7Var;
                a7.f fVar2 = (a7.f) a7Var2;
                if (equalsToConstant(fVar.c().f87339a, fVar2.c().f87339a) && equalsToConstant(fVar.c().f87340b, fVar2.c().f87340b) && ExpressionsKt.equalsToConstant(fVar.c().f87342d, fVar2.c().f87342d) && equalsToConstant(fVar.c().f87343e, fVar2.c().f87343e)) {
                    return true;
                }
            }
            return false;
        }
        if (!(a7Var instanceof a7.e)) {
            throw new m();
        }
        if (a7Var2 instanceof a7.e) {
            a7.e eVar = (a7.e) a7Var;
            a7.e eVar2 = (a7.e) a7Var2;
            if (ExpressionsKt.equalsToConstant(eVar.c().f92188a, eVar2.c().f92188a) && equalsToConstant(eVar.c().f92189b, eVar2.c().f92189b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable fi.a aVar) {
        if (aVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(aVar.f87520a) && ExpressionsKt.isConstant(aVar.f87521b);
    }

    public static final boolean isConstant(@Nullable fm fmVar) {
        if (fmVar == null) {
            return true;
        }
        if (fmVar instanceof fm.c) {
            fm.c cVar = (fm.c) fmVar;
            return ExpressionsKt.isConstant(cVar.c().f89022a) && ExpressionsKt.isConstant(cVar.c().f89023b);
        }
        if (fmVar instanceof fm.d) {
            return ExpressionsKt.isConstant(((fm.d) fmVar).c().f92408a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable sm smVar) {
        if (smVar == null) {
            return true;
        }
        if (smVar instanceof sm.c) {
            sm.c cVar = (sm.c) smVar;
            return ExpressionsKt.isConstant(cVar.c().f92338a) && ExpressionsKt.isConstant(cVar.c().f92339b);
        }
        if (smVar instanceof sm.d) {
            return ExpressionsKt.isConstant(((sm.d) smVar).c().f86759a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable yf.f fVar) {
        if (fVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(fVar.f92735a);
    }

    public static final boolean equalsToConstant(@Nullable fi.a aVar, @Nullable fi.a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.f87520a : null, aVar2 != null ? aVar2.f87520a : null)) {
            return ExpressionsKt.equalsToConstant(aVar != null ? aVar.f87521b : null, aVar2 != null ? aVar2.f87521b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable fm fmVar, @Nullable fm fmVar2) {
        if (fmVar == null) {
            return fmVar2 == null;
        }
        if (fmVar instanceof fm.c) {
            if (fmVar2 instanceof fm.c) {
                fm.c cVar = (fm.c) fmVar;
                fm.c cVar2 = (fm.c) fmVar2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f89022a, cVar2.c().f89022a) && ExpressionsKt.equalsToConstant(cVar.c().f89023b, cVar2.c().f89023b)) {
                    return true;
                }
            }
            return false;
        }
        if (fmVar instanceof fm.d) {
            return (fmVar2 instanceof fm.d) && ExpressionsKt.equalsToConstant(((fm.d) fmVar).c().f92408a, ((fm.d) fmVar2).c().f92408a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable sm smVar, @Nullable sm smVar2) {
        if (smVar == null) {
            return smVar2 == null;
        }
        if (smVar instanceof sm.c) {
            if (smVar2 instanceof sm.c) {
                sm.c cVar = (sm.c) smVar;
                sm.c cVar2 = (sm.c) smVar2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f92338a, cVar2.c().f92338a) && ExpressionsKt.equalsToConstant(cVar.c().f92339b, cVar2.c().f92339b)) {
                    return true;
                }
            }
            return false;
        }
        if (smVar instanceof sm.d) {
            return (smVar2 instanceof sm.d) && ExpressionsKt.equalsToConstant(((sm.d) smVar).c().f86759a, ((sm.d) smVar2).c().f86759a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable yf.f fVar, @Nullable yf.f fVar2) {
        if (fVar == null && fVar2 == null) {
            return true;
        }
        return ExpressionsKt.equalsToConstant(fVar != null ? fVar.f92735a : null, fVar2 != null ? fVar2.f92735a : null);
    }
}
