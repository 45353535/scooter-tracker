package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4375j4 {

    /* JADX INFO: renamed from: com.ironsource.j4$a */
    public static final class a implements InterfaceC4375j4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f43404a;

        public a(boolean z10) {
            this.f43404a = z10;
        }

        @Override // com.ironsource.InterfaceC4375j4
        public void a() {
            C4618x8.a(Xd.f42090x, new C4533s8().a(D5.f40578y, Boolean.valueOf(this.f43404a)).a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$b */
    public static final class b implements InterfaceC4375j4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f43405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f43406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC4496q4 f43407c;

        public b(boolean z10, long j10, @NotNull InterfaceC4496q4 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.f43405a = z10;
            this.f43406b = j10;
            this.f43407c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC4375j4
        public void a() {
            C4533s8 c4533s8A = new C4533s8().a(D5.f40578y, Boolean.valueOf(this.f43405a));
            if (this.f43406b > 0) {
                c4533s8A.a(D5.B, Long.valueOf(this.f43407c.a() - this.f43406b));
            }
            C4618x8.a(Xd.f42089w, c4533s8A.a());
        }

        @NotNull
        public final InterfaceC4496q4 b() {
            return this.f43407c;
        }
    }

    void a();
}
