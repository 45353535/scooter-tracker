package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.Hb;
import com.ironsource.InterfaceC4463o5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface o extends InterfaceC4463o5<String> {

    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43989a;

        public a(@NotNull String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.f43989a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC4463o5
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f43989a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(@NotNull Hb<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.f43989a);
        }
    }

    <T> T a(@NotNull Hb<String, T> hb2);
}
