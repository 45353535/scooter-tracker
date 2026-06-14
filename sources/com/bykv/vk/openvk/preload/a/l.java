package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, a> f15697d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<h> f15698a = new ArrayList();

        public final a a(h hVar) {
            this.f15698a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f15698a.addAll(list);
            return this;
        }
    }

    l() {
    }

    final Map<String, a> a() {
        return this.f15697d;
    }

    static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f15685a == f.class;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, a> f15699a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f15700b;

        public final a a(String str) {
            if (this.f15699a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f15699a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f15699a).a(this.f15700b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f15697d = (Map) obj;
                return;
            } catch (ClassCastException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        throw new IllegalStateException("args error");
    }
}
