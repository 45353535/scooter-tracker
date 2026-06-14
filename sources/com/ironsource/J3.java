package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4496q4;
import com.ironsource.InterfaceC4499q7;
import com.ironsource.environment.ContextProvider;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class J3 implements InterfaceC4499q7, InterfaceC4499q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uc f41161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4319ff f41162b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41163a;

        static {
            int[] iArr = new int[N3.values().length];
            try {
                iArr[N3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41163a = iArr;
        }
    }

    public J3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC4499q7
    @NotNull
    public synchronized L3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        L3 l3A = this.f41161a.a(identifier);
        if (l3A.d()) {
            return l3A;
        }
        return this.f41162b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC4499q7.a
    public synchronized void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f41161a.b(identifier);
        this.f41162b.b(identifier);
    }

    public J3(@NotNull InterfaceC4496q4 currentTimeProvider, @NotNull J7 pacingDataRepository, @NotNull Q8 showCountDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.f41161a = new Uc(currentTimeProvider, pacingDataRepository);
        this.f41162b = new C4319ff(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC4499q7.a
    @NotNull
    public synchronized Object a(@NotNull String identifier, @NotNull N3 cappingType, @NotNull InterfaceC4465o7 cappingConfig) {
        Object objA;
        try {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(cappingType, "cappingType");
            Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
            int i10 = a.f41163a[cappingType.ordinal()];
            if (i10 == 1) {
                objA = this.f41161a.a(identifier, cappingType, cappingConfig);
            } else if (i10 == 2) {
                objA = this.f41162b.a(identifier, cappingType, cappingConfig);
            } else {
                if (i10 != 3) {
                    throw new lf.m();
                }
                Result.Companion companion = Result.f93230c;
                objA = Result.b(Unit.f93236a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objA;
    }

    public /* synthetic */ J3(InterfaceC4496q4 interfaceC4496q4, J7 j72, Q8 q82, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC4496q4 = (i10 & 1) != 0 ? new InterfaceC4496q4.a() : interfaceC4496q4;
        if ((i10 & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            j72 = new Vc(new C4233af(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i10 & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            q82 = new C4285df(new C4233af(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC4496q4, j72, q82);
    }
}
