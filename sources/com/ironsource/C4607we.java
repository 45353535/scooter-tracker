package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4496q4;
import com.ironsource.J8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4607we implements J8, J8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4624xe f45788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4472oe f45789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f45790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f45792e;

    /* JADX INFO: renamed from: com.ironsource.we$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f45793a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f45794b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f45795c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f45796d = -1;

        private a() {
        }
    }

    public C4607we(@NotNull InterfaceC4624xe storage, @NotNull InterfaceC4472oe initResponseStorage, @NotNull InterfaceC4496q4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f45788a = storage;
        this.f45789b = initResponseStorage;
        this.f45790c = currentTimeProvider;
        this.f45791d = -1;
        this.f45792e = -1L;
    }

    private final int b(Context context, InterfaceC4624xe interfaceC4624xe) {
        int iB = interfaceC4624xe.b(context, 0) + 1;
        interfaceC4624xe.a(context, iB);
        return iB;
    }

    @Override // com.ironsource.J8.a
    public void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45791d = b(context, this.f45788a);
        this.f45792e = a(context, this.f45788a);
    }

    @Override // com.ironsource.J8
    public int c() {
        return this.f45791d;
    }

    private final long a(Context context, InterfaceC4624xe interfaceC4624xe) {
        long jA = interfaceC4624xe.a(context, -1L);
        if (this.f45789b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.f45790c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        interfaceC4624xe.b(context, jA2);
        return jA2;
    }

    @Override // com.ironsource.J8
    @NotNull
    public String b() {
        String strD = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getSessionId()");
        return strD;
    }

    public /* synthetic */ C4607we(InterfaceC4624xe interfaceC4624xe, InterfaceC4472oe interfaceC4472oe, InterfaceC4496q4 interfaceC4496q4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4624xe, (i10 & 2) != 0 ? new C4489pe() : interfaceC4472oe, (i10 & 4) != 0 ? new InterfaceC4496q4.a() : interfaceC4496q4);
    }

    @Override // com.ironsource.J8
    public long a() {
        return this.f45792e;
    }
}
