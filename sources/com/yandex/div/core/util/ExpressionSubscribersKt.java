package com.yandex.div.core.util;

import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.impl.H2;
import java.util.Iterator;
import java.util.List;
import k8.a7;
import k8.ar;
import k8.cb;
import k8.cc;
import k8.d8;
import k8.em;
import k8.ep;
import k8.fi;
import k8.fm;
import k8.gn;
import k8.hb;
import k8.kp;
import k8.ml;
import k8.ni;
import k8.nl;
import k8.nx;
import k8.sm;
import k8.to;
import k8.ue;
import k8.uo;
import k8.wi;
import k8.wv;
import k8.xc;
import k8.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010 \u001a\u00020\u0007*\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b \u0010!\u001a9\u0010$\u001a\u00020\u0007*\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a9\u0010(\u001a\u00020\u0007*\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b(\u0010)\u001a9\u0010,\u001a\u00020\u0007*\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b,\u0010-\u001a9\u00100\u001a\u00020\u0007*\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b0\u00101\u001a9\u00104\u001a\u00020\u0007*\u00020\u00002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b4\u00105\u001a9\u00108\u001a\u00020\u0007*\u00020\u00002\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b8\u00109\u001a9\u0010<\u001a\u00020\u0007*\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b<\u0010=\u001a9\u0010@\u001a\u00020\u0007*\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b@\u0010A\u001a9\u0010D\u001a\u00020\u0007*\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lk8/ep;", "size", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lkotlin/Function1;", "", "", "callback", "observeSize", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/ep;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/xc;", "fixedSize", "observeFixedSize", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/xc;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/hb;", "insets", "observeEdgeInsets", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/hb;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/z0;", "observeAbsoluteEdgeInsets", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/z0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/wv;", "transform", "observeTransform", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/wv;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/ml;", "pivot", "observePivot", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/ml;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/cc;", "filter", "observeFilter", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/cc;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/cb;", "drawable", "observeDrawable", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/cb;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/to;", "shape", "observeShape", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/to;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/gn;", "roundedRectangle", "observeRoundedRectangleShape", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/gn;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/d8;", "circle", "observeCircleShape", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/d8;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/ar;", "stroke", "observeStroke", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/ar;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/a7;", H2.f75840g, "observeBackground", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/a7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/fi$a;", "colorPoint", "observeColorPoint", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/fi$a;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/fm;", "center", "observeRadialGradientCenter", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/fm;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lk8/sm;", "radius", "observeRadialGradientRadius", "(Lcom/yandex/div/internal/core/ExpressionSubscriber;Lk8/sm;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ExpressionSubscribersKt {
    public static final void observeAbsoluteEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable z0 z0Var, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (z0Var == null) {
            return;
        }
        expressionSubscriber.addSubscription(z0Var.f92845b.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(z0Var.f92847d.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(z0Var.f92846c.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(z0Var.f92844a.observe(expressionResolver, function1));
    }

    public static final void observeBackground(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable a7 a7Var, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (a7Var != null) {
            if (a7Var instanceof a7.g) {
                expressionSubscriber.addSubscription(((a7.g) a7Var).c().f87894a.observe(expressionResolver, function1));
                return;
            }
            if (a7Var instanceof a7.c) {
                ue ueVarC = ((a7.c) a7Var).c();
                expressionSubscriber.addSubscription(ueVarC.f91658a.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(ueVarC.f91662e.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(ueVarC.f91659b.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(ueVarC.f91660c.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(ueVarC.f91663f.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(ueVarC.f91664g.observe(expressionResolver, function1));
                List list = ueVarC.f91661d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        observeFilter(expressionSubscriber, (cc) it.next(), expressionResolver, function1);
                    }
                    return;
                }
                return;
            }
            if (a7Var instanceof a7.d) {
                fi fiVarC = ((a7.d) a7Var).c();
                expressionSubscriber.addSubscription(fiVarC.f87514a.observe(expressionResolver, function1));
                ExpressionList expressionList = fiVarC.f87516c;
                expressionSubscriber.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, function1) : null);
                List list2 = fiVarC.f87515b;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        observeColorPoint(expressionSubscriber, (fi.a) it2.next(), expressionResolver, function1);
                    }
                    return;
                }
                return;
            }
            if (!(a7Var instanceof a7.f)) {
                if (a7Var instanceof a7.e) {
                    wi wiVarC = ((a7.e) a7Var).c();
                    expressionSubscriber.addSubscription(wiVarC.f92188a.observe(expressionResolver, function1));
                    observeAbsoluteEdgeInsets(expressionSubscriber, wiVarC.f92189b, expressionResolver, function1);
                    return;
                }
                return;
            }
            em emVarC = ((a7.f) a7Var).c();
            ExpressionList expressionList2 = emVarC.f87342d;
            expressionSubscriber.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, function1) : null);
            observeRadialGradientCenter(expressionSubscriber, emVarC.f87339a, expressionResolver, function1);
            observeRadialGradientCenter(expressionSubscriber, emVarC.f87340b, expressionResolver, function1);
            observeRadialGradientRadius(expressionSubscriber, emVarC.f87343e, expressionResolver, function1);
        }
    }

    public static final void observeCircleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable d8 d8Var, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (d8Var == null) {
            return;
        }
        Expression expression = d8Var.f86906a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        observeFixedSize(expressionSubscriber, d8Var.f86907b, expressionResolver, function1);
        observeStroke(expressionSubscriber, d8Var.f86908c, expressionResolver, function1);
    }

    public static final void observeColorPoint(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable fi.a aVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (aVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(aVar.f87520a.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(aVar.f87521b.observe(expressionResolver, function1));
    }

    public static final void observeDrawable(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable cb cbVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (cbVar == null || !(cbVar instanceof cb.c)) {
            return;
        }
        uo uoVarC = ((cb.c) cbVar).c();
        expressionSubscriber.addSubscription(uoVarC.f91703a.observe(expressionResolver, function1));
        observeShape(expressionSubscriber, uoVarC.f91704b, expressionResolver, function1);
        observeStroke(expressionSubscriber, uoVarC.f91705c, expressionResolver, function1);
    }

    public static final void observeEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable hb hbVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (hbVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(hbVar.f88005f.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(hbVar.f88000a.observe(expressionResolver, function1));
        Expression expression = hbVar.f88004e;
        if (expression == null && hbVar.f88001b == null) {
            expressionSubscriber.addSubscription(hbVar.f88002c.observe(expressionResolver, function1));
            expressionSubscriber.addSubscription(hbVar.f88003d.observe(expressionResolver, function1));
        } else {
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
            Expression expression2 = hbVar.f88001b;
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
        }
    }

    public static final void observeFilter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable cc ccVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (ccVar == null || (ccVar instanceof cc.d) || !(ccVar instanceof cc.a)) {
            return;
        }
        expressionSubscriber.addSubscription(((cc.a) ccVar).c().f87989a.observe(expressionResolver, function1));
    }

    public static final void observeFixedSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable xc xcVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (xcVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(xcVar.f92339b.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(xcVar.f92338a.observe(expressionResolver, function1));
    }

    public static final void observePivot(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable ml mlVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (mlVar != null) {
            if (!(mlVar instanceof ml.c)) {
                if (mlVar instanceof ml.d) {
                    expressionSubscriber.addSubscription(((ml.d) mlVar).c().f91404a.observe(expressionResolver, function1));
                }
            } else {
                nl nlVarC = ((ml.c) mlVar).c();
                Expression expression = nlVarC.f90052b;
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
                expressionSubscriber.addSubscription(nlVarC.f90051a.observe(expressionResolver, function1));
            }
        }
    }

    public static final void observeRadialGradientCenter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable fm fmVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (fmVar != null) {
            if (fmVar instanceof fm.c) {
                fm.c cVar = (fm.c) fmVar;
                expressionSubscriber.addSubscription(cVar.c().f89022a.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(cVar.c().f89023b.observe(expressionResolver, function1));
            } else if (fmVar instanceof fm.d) {
                expressionSubscriber.addSubscription(((fm.d) fmVar).c().f92408a.observe(expressionResolver, function1));
            }
        }
    }

    public static final void observeRadialGradientRadius(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable sm smVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (smVar != null) {
            if (smVar instanceof sm.c) {
                sm.c cVar = (sm.c) smVar;
                expressionSubscriber.addSubscription(cVar.c().f92338a.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(cVar.c().f92339b.observe(expressionResolver, function1));
            } else if (smVar instanceof sm.d) {
                expressionSubscriber.addSubscription(((sm.d) smVar).c().f86759a.observe(expressionResolver, function1));
            }
        }
    }

    public static final void observeRoundedRectangleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable gn gnVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (gnVar == null) {
            return;
        }
        Expression expression = gnVar.f87840a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        observeFixedSize(expressionSubscriber, gnVar.f87841b, expressionResolver, function1);
        observeFixedSize(expressionSubscriber, gnVar.f87843d, expressionResolver, function1);
        observeFixedSize(expressionSubscriber, gnVar.f87842c, expressionResolver, function1);
        observeStroke(expressionSubscriber, gnVar.f87844e, expressionResolver, function1);
    }

    public static final void observeShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable to toVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (toVar != null) {
            if (toVar instanceof to.d) {
                observeRoundedRectangleShape(expressionSubscriber, ((to.d) toVar).c(), expressionResolver, function1);
            } else if (toVar instanceof to.a) {
                observeCircleShape(expressionSubscriber, ((to.a) toVar).c(), expressionResolver, function1);
            }
        }
    }

    public static final void observeSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable ep epVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        if (epVar != null) {
            if (epVar instanceof ep.c) {
                xc xcVarC = ((ep.c) epVar).c();
                expressionSubscriber.addSubscription(xcVarC.f92339b.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(xcVarC.f92338a.observe(expressionResolver, function1));
                return;
            }
            Disposable disposableObserve = null;
            if (epVar instanceof ep.d) {
                ni niVarC = ((ep.d) epVar).c();
                Expression expression9 = niVarC.f90044c;
                expressionSubscriber.addSubscription(expression9 != null ? expression9.observe(expressionResolver, function1) : null);
                kp kpVar = niVarC.f90043b;
                expressionSubscriber.addSubscription((kpVar == null || (expression8 = kpVar.f88677b) == null) ? null : expression8.observe(expressionResolver, function1));
                kp kpVar2 = niVarC.f90043b;
                expressionSubscriber.addSubscription((kpVar2 == null || (expression7 = kpVar2.f88676a) == null) ? null : expression7.observe(expressionResolver, function1));
                kp kpVar3 = niVarC.f90042a;
                expressionSubscriber.addSubscription((kpVar3 == null || (expression6 = kpVar3.f88677b) == null) ? null : expression6.observe(expressionResolver, function1));
                kp kpVar4 = niVarC.f90042a;
                if (kpVar4 != null && (expression5 = kpVar4.f88676a) != null) {
                    disposableObserve = expression5.observe(expressionResolver, function1);
                }
                expressionSubscriber.addSubscription(disposableObserve);
                return;
            }
            if (epVar instanceof ep.e) {
                nx nxVarC = ((ep.e) epVar).c();
                Expression expression10 = nxVarC.f90108a;
                expressionSubscriber.addSubscription(expression10 != null ? expression10.observe(expressionResolver, function1) : null);
                kp kpVar5 = nxVarC.f90110c;
                expressionSubscriber.addSubscription((kpVar5 == null || (expression4 = kpVar5.f88677b) == null) ? null : expression4.observe(expressionResolver, function1));
                kp kpVar6 = nxVarC.f90110c;
                expressionSubscriber.addSubscription((kpVar6 == null || (expression3 = kpVar6.f88676a) == null) ? null : expression3.observe(expressionResolver, function1));
                kp kpVar7 = nxVarC.f90109b;
                expressionSubscriber.addSubscription((kpVar7 == null || (expression2 = kpVar7.f88677b) == null) ? null : expression2.observe(expressionResolver, function1));
                kp kpVar8 = nxVarC.f90109b;
                if (kpVar8 != null && (expression = kpVar8.f88676a) != null) {
                    disposableObserve = expression.observe(expressionResolver, function1);
                }
                expressionSubscriber.addSubscription(disposableObserve);
            }
        }
    }

    public static final void observeStroke(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable ar arVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (arVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(arVar.f86313a.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(arVar.f86316d.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(arVar.f86315c.observe(expressionResolver, function1));
    }

    public static final void observeTransform(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable wv wvVar, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        if (wvVar == null) {
            return;
        }
        Expression expression = wvVar.f92249c;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        observePivot(expressionSubscriber, wvVar.f92247a, expressionResolver, function1);
        observePivot(expressionSubscriber, wvVar.f92248b, expressionResolver, function1);
    }
}
