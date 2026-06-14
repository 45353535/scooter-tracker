package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4256c3 implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Ab f42793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final AdSize f42794b;

    /* JADX INFO: renamed from: com.ironsource.c3$a */
    static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42795a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.a("Load task config is null");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.c3$b */
    static final class b extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42796a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.l();
        }
    }

    public C4256c3(@Nullable Ab ab2, @Nullable AdSize adSize) {
        this.f42793a = ab2;
        this.f42794b = adSize;
    }

    @Override // com.ironsource.bg
    public /* synthetic */ void a(boolean z10, Function0 function0) {
        lk.a(this, z10, function0);
    }

    @Override // com.ironsource.bg
    public void a() {
        a(this.f42793a != null, a.f42795a);
        a(this.f42794b != null, b.f42796a);
    }
}
