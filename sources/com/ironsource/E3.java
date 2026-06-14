package com.ironsource;

import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class E3 implements InterfaceC4465o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f40667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f40668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final M3 f40669c;

    public E3(@Nullable Boolean bool, @Nullable Integer num, @Nullable M3 m32) {
        this.f40667a = bool;
        this.f40668b = num;
        this.f40669c = m32;
    }

    private final Object a(M3 m32) {
        return new F3(this.f40667a, this.f40668b, m32).a();
    }

    @Override // com.ironsource.InterfaceC4465o7
    @NotNull
    public Object b() {
        Integer num;
        M3 m32 = M3.Second;
        Throwable thG = Result.g(a(m32));
        if (thG != null) {
            return Result.b(kotlin.d.a(thG));
        }
        return Result.b((!Intrinsics.areEqual(this.f40667a, Boolean.TRUE) || (num = this.f40668b) == null) ? null : new Tc(m32.a(num), null, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.ironsource.InterfaceC4465o7
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c() {
        /*
            r3 = this;
            com.ironsource.M3 r0 = r3.f40669c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Throwable r0 = kotlin.Result.g(r0)
            if (r0 == 0) goto L15
            java.lang.Object r0 = kotlin.d.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            return r0
        L15:
            java.lang.Boolean r0 = r3.f40667a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L31
            java.lang.Integer r0 = r3.f40668b
            if (r0 == 0) goto L31
            int r0 = r0.intValue()
            com.ironsource.M3 r1 = r3.f40669c
            if (r1 == 0) goto L31
            com.ironsource.cf r2 = new com.ironsource.cf
            r2.<init>(r0, r1)
            goto L32
        L31:
            r2 = 0
        L32:
            java.lang.Object r0 = kotlin.Result.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.E3.c():java.lang.Object");
    }

    @Nullable
    public final Boolean d() {
        return this.f40667a;
    }

    @Nullable
    public final Integer e() {
        return this.f40668b;
    }

    @Nullable
    public final M3 f() {
        return this.f40669c;
    }

    @Override // com.ironsource.InterfaceC4465o7
    @NotNull
    public Object a() {
        Throwable thG = Result.g(new N4(this.f40667a).a());
        if (thG != null) {
            return Result.b(kotlin.d.a(thG));
        }
        Boolean bool = this.f40667a;
        return Result.b(bool != null ? new M4(bool.booleanValue()) : null);
    }

    public /* synthetic */ E3(Boolean bool, Integer num, M3 m32, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : m32);
    }
}
