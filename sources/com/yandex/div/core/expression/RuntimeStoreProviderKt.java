package com.yandex.div.core.expression;

import k8.kw;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk8/kw;", "", "getName", "(Lk8/kw;)Ljava/lang/String;", "name", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class RuntimeStoreProviderKt {
    @NotNull
    public static final String getName(@NotNull kw kwVar) {
        if (kwVar instanceof kw.b) {
            return ((kw.b) kwVar).c().f90288a;
        }
        if (kwVar instanceof kw.g) {
            return ((kw.g) kwVar).c().f88158a;
        }
        if (kwVar instanceof kw.h) {
            return ((kw.h) kwVar).c().f91208a;
        }
        if (kwVar instanceof kw.j) {
            return ((kw.j) kwVar).c().f90499a;
        }
        if (kwVar instanceof kw.c) {
            return ((kw.c) kwVar).c().f92834a;
        }
        if (kwVar instanceof kw.k) {
            return ((kw.k) kwVar).c().f93034a;
        }
        if (kwVar instanceof kw.f) {
            return ((kw.f) kwVar).c().f91220a;
        }
        if (kwVar instanceof kw.a) {
            return ((kw.a) kwVar).c().f87404a;
        }
        if (kwVar instanceof kw.i) {
            return ((kw.i) kwVar).c().f86865b;
        }
        throw new m();
    }
}
