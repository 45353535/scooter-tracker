package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cn {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private a f1396;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ds f1397;

    static abstract class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f1398;

        a(Class cls) {
            this.f1398 = cls;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final Class m5904() {
            return this.f1398;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        abstract boolean mo5905(hv hvVar);
    }

    static class b extends a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        final boolean mo5905(hv hvVar) {
            return m5904().isInstance(hvVar.mo6642());
        }
    }

    static class c extends a {
        c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo5905(hv hvVar) {
            return m5904().equals(hvVar.mo6641().getType());
        }
    }

    static class d extends a {
        d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn.a
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo5905(hv hvVar) {
            return m5904().isAssignableFrom(hvVar.mo6641().getType());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private cn f1399 = new cn();

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m5906(Class cls) {
            this.f1399.f1396 = new d(cls);
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final e m5907(Class cls) {
            this.f1399.f1396 = new c(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final cn m5908() {
            return this.f1399;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m5910(Class cls) {
            this.f1399.f1396 = new b(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m5909(ds dsVar) {
            this.f1399.f1397 = dsVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m5903(hv hvVar, du duVar, cq cqVar, List<Object> list) {
        a aVar = this.f1396;
        if (aVar != null && !aVar.mo5905(hvVar)) {
            return false;
        }
        if (this.f1397 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, hvVar);
        return this.f1397.m6385(duVar, cqVar, arrayList).m6379();
    }
}
