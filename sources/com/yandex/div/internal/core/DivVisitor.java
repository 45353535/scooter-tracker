package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import k8.y0;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u0012J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u0014J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u0016J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u0018J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u001aJ\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u001cJ\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u001eJ\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010 J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\"J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010$J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010&J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010(J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010*J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010,J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010.¨\u0006/"}, d2 = {"Lcom/yandex/div/internal/core/DivVisitor;", "T", "", "<init>", "()V", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "visit", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "data", "defaultVisit", "Lk8/y0$r;", "(Lk8/y0$r;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$h;", "(Lk8/y0$h;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$f;", "(Lk8/y0$f;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$m;", "(Lk8/y0$m;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$c;", "(Lk8/y0$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$g;", "(Lk8/y0$g;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$e;", "(Lk8/y0$e;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$k;", "(Lk8/y0$k;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$q;", "(Lk8/y0$q;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$o;", "(Lk8/y0$o;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$d;", "(Lk8/y0$d;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$i;", "(Lk8/y0$i;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$n;", "(Lk8/y0$n;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$j;", "(Lk8/y0$j;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$l;", "(Lk8/y0$l;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$s;", "(Lk8/y0$s;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "Lk8/y0$p;", "(Lk8/y0$p;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivVisitor<T> {
    protected abstract T defaultVisit(@NotNull y0 data, @NotNull ExpressionResolver resolver);

    protected final T visit(@NotNull y0 div, @NotNull ExpressionResolver resolver) {
        if (div instanceof y0.r) {
            return visit((y0.r) div, resolver);
        }
        if (div instanceof y0.h) {
            return visit((y0.h) div, resolver);
        }
        if (div instanceof y0.f) {
            return visit((y0.f) div, resolver);
        }
        if (div instanceof y0.m) {
            return visit((y0.m) div, resolver);
        }
        if (div instanceof y0.c) {
            return visit((y0.c) div, resolver);
        }
        if (div instanceof y0.g) {
            return visit((y0.g) div, resolver);
        }
        if (div instanceof y0.e) {
            return visit((y0.e) div, resolver);
        }
        if (div instanceof y0.k) {
            return visit((y0.k) div, resolver);
        }
        if (div instanceof y0.q) {
            return visit((y0.q) div, resolver);
        }
        if (div instanceof y0.o) {
            return visit((y0.o) div, resolver);
        }
        if (div instanceof y0.d) {
            return visit((y0.d) div, resolver);
        }
        if (div instanceof y0.i) {
            return visit((y0.i) div, resolver);
        }
        if (div instanceof y0.n) {
            return visit((y0.n) div, resolver);
        }
        if (div instanceof y0.j) {
            return visit((y0.j) div, resolver);
        }
        if (div instanceof y0.l) {
            return visit((y0.l) div, resolver);
        }
        if (div instanceof y0.s) {
            return visit((y0.s) div, resolver);
        }
        if (div instanceof y0.p) {
            return visit((y0.p) div, resolver);
        }
        throw new m();
    }

    protected T visit(@NotNull y0.r data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.h data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.f data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.m data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.c data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.g data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.e data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.k data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.q data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.o data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.d data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.i data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.n data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.j data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.l data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.s data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull y0.p data, @NotNull ExpressionResolver resolver) {
        return defaultVisit(data, resolver);
    }
}
