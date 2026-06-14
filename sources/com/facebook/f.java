package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.z;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f19786f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static f f19787g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalBroadcastManager f19788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.a f19789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccessToken f19790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f19791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f19792e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest c(AccessToken accessToken, GraphRequest.b bVar) {
            e eVarF = f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarF.a());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestX = GraphRequest.f19547n.x(accessToken, eVarF.b(), bVar);
            graphRequestX.G(bundle);
            graphRequestX.F(b0.GET);
            return graphRequestX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest d(AccessToken accessToken, GraphRequest.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest graphRequestX = GraphRequest.f19547n.x(accessToken, "me/permissions", bVar);
            graphRequestX.G(bundle);
            graphRequestX.F(b0.GET);
            return graphRequestX;
        }

        private final e f(AccessToken accessToken) {
            String strH = accessToken.getGraphDomain();
            if (strH == null) {
                strH = "facebook";
            }
            return Intrinsics.areEqual(strH, "instagram") ? new c() : new b();
        }

        public final f e() {
            f fVar;
            f fVar2 = f.f19787g;
            if (fVar2 != null) {
                return fVar2;
            }
            synchronized (this) {
                fVar = f.f19787g;
                if (fVar == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(s.m());
                    Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    f fVar3 = new f(localBroadcastManager, new com.facebook.a());
                    f.f19787g = fVar3;
                    fVar = fVar3;
                }
            }
            return fVar;
        }

        private a() {
        }
    }

    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19793a = "oauth/access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f19794b = "fb_extend_sso_token";

        @Override // com.facebook.f.e
        public String a() {
            return this.f19794b;
        }

        @Override // com.facebook.f.e
        public String b() {
            return this.f19793a;
        }
    }

    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19795a = "refresh_access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f19796b = "ig_refresh_token";

        @Override // com.facebook.f.e
        public String a() {
            return this.f19796b;
        }

        @Override // com.facebook.f.e
        public String b() {
            return this.f19795a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f19800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f19801e;

        public final String a() {
            return this.f19797a;
        }

        public final Long b() {
            return this.f19800d;
        }

        public final int c() {
            return this.f19798b;
        }

        public final int d() {
            return this.f19799c;
        }

        public final String e() {
            return this.f19801e;
        }

        public final void f(String str) {
            this.f19797a = str;
        }

        public final void g(Long l10) {
            this.f19800d = l10;
        }

        public final void h(int i10) {
            this.f19798b = i10;
        }

        public final void i(int i10) {
            this.f19799c = i10;
        }

        public final void j(String str) {
            this.f19801e = str;
        }
    }

    public interface e {
        String a();

        String b();
    }

    public f(LocalBroadcastManager localBroadcastManager, com.facebook.a accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f19788a = localBroadcastManager;
        this.f19789b = accessTokenCache;
        this.f19791d = new AtomicBoolean(false);
        this.f19792e = new Date(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(f this$0, AccessToken.a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m(aVar);
    }

    private final void m(final AccessToken.a aVar) {
        final AccessToken accessTokenI = i();
        if (accessTokenI == null) {
            if (aVar != null) {
                aVar.a(new i("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.f19791d.compareAndSet(false, true)) {
            if (aVar != null) {
                aVar.a(new i("Refresh already in progress"));
                return;
            }
            return;
        }
        this.f19792e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar2 = f19786f;
        z zVar = new z(aVar2.d(accessTokenI, new GraphRequest.b() { // from class: com.facebook.c
            @Override // com.facebook.GraphRequest.b
            public final void a(a0 a0Var) {
                f.n(atomicBoolean, hashSet, hashSet2, hashSet3, a0Var);
            }
        }), aVar2.c(accessTokenI, new GraphRequest.b() { // from class: com.facebook.d
            @Override // com.facebook.GraphRequest.b
            public final void a(a0 a0Var) {
                f.o(dVar, a0Var);
            }
        }));
        zVar.e(new z.a(accessTokenI, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: com.facebook.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessToken f19778b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f19779c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Set f19780d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Set f19781e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Set f19782f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ f f19783g;

            {
                this.f19779c = atomicBoolean;
                this.f19780d = hashSet;
                this.f19781e = hashSet2;
                this.f19782f = hashSet3;
                this.f19783g = this;
            }

            @Override // com.facebook.z.a
            public final void a(z zVar2) throws Throwable {
                f.p(this.f19777a, this.f19778b, null, this.f19779c, this.f19780d, this.f19781e, this.f19782f, this.f19783g, zVar2);
            }
        });
        zVar.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(java.util.concurrent.atomic.AtomicBoolean r6, java.util.Set r7, java.util.Set r8, java.util.Set r9, com.facebook.a0 r10) {
        /*
            java.lang.String r0 = "$permissionsCallSucceeded"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "$permissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "$declinedPermissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "$expiredPermissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            org.json.JSONObject r10 = r10.d()
            if (r10 != 0) goto L21
            goto Lbf
        L21:
            java.lang.String r0 = "data"
            org.json.JSONArray r10 = r10.optJSONArray(r0)
            if (r10 != 0) goto L2b
            goto Lbf
        L2b:
            r0 = 1
            r6.set(r0)
            int r6 = r10.length()
            r0 = 0
        L34:
            if (r0 >= r6) goto Lbf
            org.json.JSONObject r1 = r10.optJSONObject(r0)
            if (r1 != 0) goto L3e
            goto Lbb
        L3e:
            java.lang.String r2 = "permission"
            java.lang.String r2 = r1.optString(r2)
            java.lang.String r3 = "status"
            java.lang.String r1 = r1.optString(r3)
            boolean r4 = com.facebook.internal.z.W(r2)
            if (r4 != 0) goto Lbb
            boolean r4 = com.facebook.internal.z.W(r1)
            if (r4 != 0) goto Lbb
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.String r4 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            int r3 = r1.hashCode()
            r4 = -1309235419(0xffffffffb1f6a725, float:-7.1785444E-9)
            if (r3 == r4) goto L99
            r4 = 280295099(0x10b4f6bb, float:7.137763E-29)
            if (r3 == r4) goto L8d
            r4 = 568196142(0x21ddfc2e, float:1.5042294E-18)
            if (r3 == r4) goto L80
            goto La1
        L80:
            java.lang.String r3 = "declined"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L89
            goto La1
        L89:
            r8.add(r2)
            goto Lbb
        L8d:
            java.lang.String r3 = "granted"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto La1
            r7.add(r2)
            goto Lbb
        L99:
            java.lang.String r3 = "expired"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lb8
        La1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected status: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "AccessTokenManager"
            android.util.Log.w(r2, r1)
            goto Lbb
        Lb8:
            r9.add(r2)
        Lbb:
            int r0 = r0 + 1
            goto L34
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.f.n(java.util.concurrent.atomic.AtomicBoolean, java.util.Set, java.util.Set, java.util.Set, com.facebook.a0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(d refreshResult, a0 response) {
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectD = response.d();
        if (jSONObjectD == null) {
            return;
        }
        refreshResult.f(jSONObjectD.optString("access_token"));
        refreshResult.h(jSONObjectD.optInt("expires_at"));
        refreshResult.i(jSONObjectD.optInt("expires_in"));
        refreshResult.g(Long.valueOf(jSONObjectD.optLong("data_access_expiration_time")));
        refreshResult.j(jSONObjectD.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0044, B:5:0x0050, B:7:0x005a, B:11:0x0064, B:14:0x006c, B:19:0x0078, B:22:0x0088, B:24:0x0094, B:29:0x00c9, B:31:0x00cd, B:32:0x00d1, B:36:0x00e7, B:40:0x00f7, B:44:0x0107, B:46:0x0116, B:50:0x012a, B:51:0x012e, B:48:0x0123, B:43:0x0102, B:39:0x00f3, B:35:0x00e3, B:26:0x00a5, B:28:0x00ad, B:61:0x014b), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(com.facebook.f.d r29, com.facebook.AccessToken r30, com.facebook.AccessToken.a r31, java.util.concurrent.atomic.AtomicBoolean r32, java.util.Set r33, java.util.Set r34, java.util.Set r35, com.facebook.f r36, com.facebook.z r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.f.p(com.facebook.f$d, com.facebook.AccessToken, com.facebook.AccessToken$a, java.util.concurrent.atomic.AtomicBoolean, java.util.Set, java.util.Set, java.util.Set, com.facebook.f, com.facebook.z):void");
    }

    private final void q(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(s.m(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f19788a.sendBroadcast(intent);
    }

    private final void s(AccessToken accessToken, boolean z10) {
        AccessToken accessToken2 = this.f19790c;
        this.f19790c = accessToken;
        this.f19791d.set(false);
        this.f19792e = new Date(0L);
        if (z10) {
            if (accessToken != null) {
                this.f19789b.g(accessToken);
            } else {
                this.f19789b.a();
                com.facebook.internal.z.h(s.m());
            }
        }
        if (com.facebook.internal.z.e(accessToken2, accessToken)) {
            return;
        }
        q(accessToken2, accessToken);
        t();
    }

    private final void t() {
        Context contextM = s.m();
        AccessToken.Companion cVar = AccessToken.INSTANCE;
        AccessToken accessTokenE = cVar.e();
        AlarmManager alarmManager = (AlarmManager) contextM.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (cVar.g()) {
            if ((accessTokenE != null ? accessTokenE.getExpires() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextM, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessTokenE.getExpires().getTime(), PendingIntent.getBroadcast(contextM, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean u() {
        AccessToken accessTokenI = i();
        if (accessTokenI == null) {
            return false;
        }
        long time = new Date().getTime();
        return accessTokenI.getSource().g() && time - this.f19792e.getTime() > 3600000 && time - accessTokenI.getLastRefresh().getTime() > SignalManager.TWENTY_FOUR_HOURS_MILLIS;
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k(null);
        }
    }

    public final AccessToken i() {
        return this.f19790c;
    }

    public final boolean j() {
        AccessToken accessTokenF = this.f19789b.f();
        if (accessTokenF == null) {
            return false;
        }
        s(accessTokenF, false);
        return true;
    }

    public final void k(final AccessToken.a aVar) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(aVar) { // from class: com.facebook.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.l(this.f19744b, null);
                }
            });
        }
    }

    public final void r(AccessToken accessToken) {
        s(accessToken, true);
    }
}
