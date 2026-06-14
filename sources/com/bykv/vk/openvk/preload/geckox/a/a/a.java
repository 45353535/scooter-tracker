package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f15725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f15726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f15727c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0198a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f15729b = b.f15731a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f15730c;

        public final C0198a a() {
            this.f15728a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0198a a(b bVar) {
            if (bVar == null) {
                bVar = b.f15731a;
            }
            this.f15729b = bVar;
            return this;
        }
    }

    /* synthetic */ a(C0198a c0198a, byte b10) {
        this(c0198a);
    }

    public final b a() {
        return this.f15727c;
    }

    private a(C0198a c0198a) {
        this.f15725a = c0198a.f15728a;
        this.f15727c = c0198a.f15729b;
        this.f15726b = c0198a.f15730c;
    }
}
