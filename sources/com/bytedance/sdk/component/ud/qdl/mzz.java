package com.bytedance.sdk.component.ud.qdl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mzz extends exu {
    List<String> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    List<String> f16693ud;

    mzz(List<String> list, List<String> list2) {
        this.qdl = list;
        this.f16693ud = list2;
    }

    public static final class qdl {
        private final List<String> qdl = new ArrayList();

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final List<String> f16694ud = new ArrayList();

        public qdl qdl(String str, String str2) {
            this.qdl.add(str);
            this.f16694ud.add(str2);
            return this;
        }

        public mzz qdl() {
            return new mzz(this.qdl, this.f16694ud);
        }
    }
}
