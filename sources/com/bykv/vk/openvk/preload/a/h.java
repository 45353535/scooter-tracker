package com.bykv.vk.openvk.preload.a;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class<? extends d> f15685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f15686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f15687c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f15688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f15689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f15690c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f15688a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f15689b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f15690c = objArr;
            return this;
        }
    }

    /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f15686b;
    }

    final Object[] b() {
        return this.f15687c;
    }

    private h(a aVar) {
        this.f15685a = aVar.f15688a;
        this.f15686b = aVar.f15689b;
        this.f15687c = aVar.f15690c;
        if (this.f15685a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
