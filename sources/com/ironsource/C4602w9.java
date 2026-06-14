package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4602w9 implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Ab f45721a;

    /* JADX INFO: renamed from: com.ironsource.w9$a */
    static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45722a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.b("Load task config is null");
        }
    }

    public C4602w9(@Nullable Ab ab2) {
        this.f45721a = ab2;
    }

    @Override // com.ironsource.bg
    public /* synthetic */ void a(boolean z10, Function0 function0) {
        lk.a(this, z10, function0);
    }

    @Override // com.ironsource.bg
    public void a() {
        a(this.f45721a != null, a.f45722a);
    }
}
