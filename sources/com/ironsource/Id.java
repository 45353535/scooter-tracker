package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Id implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Ab f41127a;

    static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41128a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.d("Load task config is null");
        }
    }

    public Id(@Nullable Ab ab2) {
        this.f41127a = ab2;
    }

    @Override // com.ironsource.bg
    public /* synthetic */ void a(boolean z10, Function0 function0) {
        lk.a(this, z10, function0);
    }

    @Override // com.ironsource.bg
    public void a() {
        a(this.f41127a != null, a.f41128a);
    }
}
