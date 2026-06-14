package com.ironsource;

import android.content.Context;
import com.ironsource.C4539se;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4539se implements Ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4539se f45413a = new C4539se();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C4590ve f45414b = new C4590ve();

    /* JADX INFO: renamed from: com.ironsource.se$a */
    public static final class a implements InterfaceC4385je {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4385je f45415a;

        a(InterfaceC4385je interfaceC4385je) {
            this.f45415a = interfaceC4385je;
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull final C4284de sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C4590ve c4590ve = C4539se.f45414b;
            final InterfaceC4385je interfaceC4385je = this.f45415a;
            c4590ve.a(new Runnable() { // from class: com.ironsource.mm
                @Override // java.lang.Runnable
                public final void run() {
                    C4539se.a.a(sdkConfig, interfaceC4385je);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4284de sdkConfig, InterfaceC4385je listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            C4539se.f45413a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull final C4318fe error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4590ve c4590ve = C4539se.f45414b;
            final InterfaceC4385je interfaceC4385je = this.f45415a;
            c4590ve.d(new Runnable() { // from class: com.ironsource.nm
                @Override // java.lang.Runnable
                public final void run() {
                    C4539se.a.a(interfaceC4385je, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC4385je listener, C4318fe error) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error);
        }
    }

    private C4539se() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C4419le initRequest, InterfaceC4385je listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new U9().a(EnumC4402ke.LEVEL_PLAY_INIT);
        f45413a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C4419le initRequest, InterfaceC4385je listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = initRequest.d();
        IronSource.a[] aVarArr = (IronSource.a[]) initRequest.e().toArray(new IronSource.a[0]);
        List<IronSource.a> validAdUnitsList = rVarM.a(context, strD, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new U9().a(EnumC4402ke.EXTERNAL_MEDIATION_INIT);
        f45413a.a(context, initRequest, listener, true);
    }

    public final void c(@NotNull final Context context, @NotNull final C4419le initRequest, @NotNull final InterfaceC4385je listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f45414b.c(new Runnable() { // from class: com.ironsource.im
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C4539se.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.Ac
    public void onInitFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        f45414b.a(new Runnable() { // from class: com.ironsource.fm
            @Override // java.lang.Runnable
            public final void run() {
                C4539se.a(error);
            }
        });
    }

    public final void a(@NotNull final Context context, @NotNull final C4419le initRequest, @NotNull final InterfaceC4385je listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f45414b.c(new Runnable() { // from class: com.ironsource.lm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C4539se.b(context, initRequest, listener);
            }
        });
    }

    private final void a(Context context, C4419le c4419le, final InterfaceC4385je interfaceC4385je, boolean z10) throws Throwable {
        String strF = c4419le.f();
        if (strF != null && strF.length() > 0) {
            com.ironsource.mediationsdk.r.m().o(c4419le.f());
        } else {
            c4419le = new C4419le(c4419le.d(), com.ironsource.mediationsdk.r.m().o(), CollectionsKt.toMutableList((Collection) c4419le.e()));
        }
        com.ironsource.mediationsdk.r rVarM = com.ironsource.mediationsdk.r.m();
        String strD = c4419le.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4419le.e().toArray(new IronSource.a[0]);
        final IronSourceError ironSourceErrorA = rVarM.a(context, strD, z10, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (ironSourceErrorA != null && ironSourceErrorA.getErrorCode() != 2020) {
            if (ironSourceErrorA.getErrorCode() == 2040) {
                Ee eeH = com.ironsource.mediationsdk.r.m().h();
                if (eeH != null) {
                    a(new C4284de(new C4436me(eeH)), interfaceC4385je);
                    return;
                }
            } else if (ironSourceErrorA.getErrorCode() == 2030) {
                C4522re.f44830a.e();
                return;
            }
            f45414b.d(new Runnable() { // from class: com.ironsource.hm
                @Override // java.lang.Runnable
                public final void run() {
                    C4539se.a(interfaceC4385je, ironSourceErrorA);
                }
            });
            return;
        }
        C4522re.f44830a.a(context, c4419le, new a(interfaceC4385je));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ee serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        C4522re.f44830a.a(new C4436me(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4385je listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        listener.a(new C4318fe(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C4284de c4284de, final InterfaceC4385je interfaceC4385je) {
        if (!com.ironsource.mediationsdk.r.m().a(false, c4284de.d())) {
            f45414b.d(new Runnable() { // from class: com.ironsource.jm
                @Override // java.lang.Runnable
                public final void run() {
                    C4539se.a(interfaceC4385je);
                }
            });
        } else {
            f45414b.d(new Runnable() { // from class: com.ironsource.km
                @Override // java.lang.Runnable
                public final void run() {
                    C4539se.a(interfaceC4385je, c4284de);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4385je listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.a(new C4318fe(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4385je listener, C4284de sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.Ac
    public void a(@NotNull final Ee serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        f45414b.a(new Runnable() { // from class: com.ironsource.gm
            @Override // java.lang.Runnable
            public final void run() {
                C4539se.b(serverResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        C4522re.f44830a.b(new C4318fe(error));
    }
}
