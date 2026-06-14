package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import com.moloco.sdk.internal.services.a;
import com.moloco.sdk.internal.services.f;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.o;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f55552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.b f55553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f55554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f55555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.e f55556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f55557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.proto.a f55558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f55559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f55560i;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.services.events.a$a, reason: collision with other inner class name */
    public static final class C0682a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55561r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55562s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55563t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55564u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f55565v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f55566w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f55567x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f55569z;

        public C0682a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55567x = obj;
            this.f55569z |= Integer.MIN_VALUE;
            return a.this.g(0L, null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55570r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55571s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f55573u;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55571s = obj;
            this.f55573u |= Integer.MIN_VALUE;
            return a.this.a(0L, null, null, this);
        }
    }

    public a(v appInfoService, com.moloco.sdk.internal.services.b networkInfoService, i0 deviceInfoService, f screenInfoService, com.moloco.sdk.internal.services.usertracker.e userIdentifierService, o adDataService, com.moloco.sdk.internal.services.proto.a encoderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b userEventConfigService, String sdkVersion) {
        Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        Intrinsics.checkNotNullParameter(userIdentifierService, "userIdentifierService");
        Intrinsics.checkNotNullParameter(adDataService, "adDataService");
        Intrinsics.checkNotNullParameter(encoderService, "encoderService");
        Intrinsics.checkNotNullParameter(userEventConfigService, "userEventConfigService");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.f55552a = appInfoService;
        this.f55553b = networkInfoService;
        this.f55554c = deviceInfoService;
        this.f55555d = screenInfoService;
        this.f55556e = userIdentifierService;
        this.f55557f = adDataService;
        this.f55558g = encoderService;
        this.f55559h = userEventConfigService;
        this.f55560i = sdkVersion;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(long r11, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0780a r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.services.events.a.b
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.services.events.a$b r0 = (com.moloco.sdk.internal.services.events.a.b) r0
            int r1 = r0.f55573u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55573u = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.events.a$b r0 = new com.moloco.sdk.internal.services.events.a$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f55571s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f55573u
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.f55570r
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            kotlin.d.b(r15)
            goto L59
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.d.b(r15)
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b r15 = r10.f55559h
            boolean r15 = r15.c()
            if (r15 != 0) goto L4e
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r8 = 4
            r9 = 0
            java.lang.String r5 = "CustomUserEventBuilderServiceImpl"
            java.lang.String r6 = "Event reporting config disabled, UserAdInteractionExt not reporting"
            r7 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r4, r5, r6, r7, r8, r9)
            return r14
        L4e:
            r0.f55570r = r14
            r0.f55573u = r3
            java.lang.Object r15 = r10.g(r11, r13, r0)
            if (r15 != r1) goto L59
            return r1
        L59:
            java.lang.String r15 = (java.lang.String) r15
            android.net.Uri r11 = android.net.Uri.parse(r14)
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r12 = "user_ad_interaction_ext"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r12, r15)
            android.net.Uri r11 = r11.build()
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.a.a(long, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UserIntent$UserAdInteractionExt.a b(UserIntent$UserAdInteractionExt.a aVar) {
        UserIntent$UserAdInteractionExt.MolocoSDK.a aVarNewBuilder = UserIntent$UserAdInteractionExt.MolocoSDK.newBuilder();
        aVarNewBuilder.a(this.f55560i);
        aVar.k((UserIntent$UserAdInteractionExt.MolocoSDK) aVarNewBuilder.build());
        return aVar;
    }

    public final UserIntent$UserAdInteractionExt.a c(UserIntent$UserAdInteractionExt.a aVar, com.moloco.sdk.internal.services.a aVar2) {
        UserIntent$UserAdInteractionExt.Network.a aVarNewBuilder = UserIntent$UserAdInteractionExt.Network.newBuilder();
        if (aVar2 instanceof a.C0679a) {
            aVarNewBuilder.b(UserIntent$UserAdInteractionExt.Network.b.CELLULAR);
            aVarNewBuilder.a(((a.C0679a) aVar2).a());
        } else if (Intrinsics.areEqual(aVar2, a.b.f55273a)) {
            aVarNewBuilder.b(UserIntent$UserAdInteractionExt.Network.b.UNKNOWN);
        } else {
            if (!Intrinsics.areEqual(aVar2, a.c.f55274a)) {
                throw new m();
            }
            aVarNewBuilder.b(UserIntent$UserAdInteractionExt.Network.b.WIFI);
        }
        aVar.j((UserIntent$UserAdInteractionExt.Network) aVarNewBuilder.build());
        return aVar;
    }

    public final UserIntent$UserAdInteractionExt.a d(UserIntent$UserAdInteractionExt.a aVar, u uVar) {
        UserIntent$UserAdInteractionExt.App.a aVarNewBuilder = UserIntent$UserAdInteractionExt.App.newBuilder();
        aVarNewBuilder.a(uVar.a());
        aVarNewBuilder.b(uVar.b());
        aVar.b((UserIntent$UserAdInteractionExt.App) aVarNewBuilder.build());
        return aVar;
    }

    public final UserIntent$UserAdInteractionExt.a e(UserIntent$UserAdInteractionExt.a aVar, h0 h0Var) {
        UserIntent$UserAdInteractionExt.Device.a aVarNewBuilder = UserIntent$UserAdInteractionExt.Device.newBuilder();
        aVarNewBuilder.c(h0Var.j());
        aVarNewBuilder.a(h0Var.h());
        aVarNewBuilder.b(UserIntent$UserAdInteractionExt.Device.b.ANDROID);
        aVarNewBuilder.d(h0Var.k());
        aVar.g((UserIntent$UserAdInteractionExt.Device) aVarNewBuilder.build());
        return aVar;
    }

    public final UserIntent$UserAdInteractionExt.a f(UserIntent$UserAdInteractionExt.a aVar, a.AbstractC0780a abstractC0780a, com.moloco.sdk.internal.services.e eVar) {
        if (abstractC0780a instanceof a.AbstractC0780a.e) {
            aVar.h((UserIntent$UserAdInteractionExt.ImpressionInteraction) UserIntent$UserAdInteractionExt.ImpressionInteraction.newBuilder().build());
            return aVar;
        }
        if (!(abstractC0780a instanceof a.AbstractC0780a.d)) {
            if (abstractC0780a instanceof a.AbstractC0780a.b) {
                UserIntent$UserAdInteractionExt.AppForegroundingInteraction.a aVarNewBuilder = UserIntent$UserAdInteractionExt.AppForegroundingInteraction.newBuilder();
                aVarNewBuilder.b(((a.AbstractC0780a.b) abstractC0780a).a());
                aVar.d((UserIntent$UserAdInteractionExt.AppForegroundingInteraction) aVarNewBuilder.build());
                return aVar;
            }
            if (!(abstractC0780a instanceof a.AbstractC0780a.C0781a)) {
                throw new m();
            }
            aVar.c((UserIntent$UserAdInteractionExt.AppBackgroundingInteraction) UserIntent$UserAdInteractionExt.AppBackgroundingInteraction.newBuilder().build());
            return aVar;
        }
        UserIntent$UserAdInteractionExt.ClickInteraction.a aVarNewBuilder2 = UserIntent$UserAdInteractionExt.ClickInteraction.newBuilder();
        a.AbstractC0780a.d dVar = (a.AbstractC0780a.d) abstractC0780a;
        aVarNewBuilder2.b(com.moloco.sdk.internal.services.events.b.b(dVar.b()));
        aVarNewBuilder2.c(com.moloco.sdk.internal.services.events.b.c(eVar));
        a.AbstractC0780a.g gVarD = dVar.d();
        if (gVarD != null) {
            aVarNewBuilder2.e(com.moloco.sdk.internal.services.events.b.d(gVarD));
        }
        a.AbstractC0780a.f fVarC = dVar.c();
        if (fVarC != null) {
            aVarNewBuilder2.d(com.moloco.sdk.internal.services.events.b.b(fVarC));
        }
        List<a.AbstractC0780a.c> listA = dVar.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        for (a.AbstractC0780a.c cVar : listA) {
            UserIntent$UserAdInteractionExt.Button.a aVarNewBuilder3 = UserIntent$UserAdInteractionExt.Button.newBuilder();
            aVarNewBuilder3.c(com.moloco.sdk.internal.services.events.b.a(cVar.c()));
            aVarNewBuilder3.a(com.moloco.sdk.internal.services.events.b.b(cVar.d()));
            aVarNewBuilder3.b(com.moloco.sdk.internal.services.events.b.d(cVar.e()));
            arrayList.add((UserIntent$UserAdInteractionExt.Button) aVarNewBuilder3.build());
        }
        aVarNewBuilder2.a(arrayList);
        aVar.e((UserIntent$UserAdInteractionExt.ClickInteraction) aVarNewBuilder2.build());
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r8, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0780a r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.a.g(long, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
