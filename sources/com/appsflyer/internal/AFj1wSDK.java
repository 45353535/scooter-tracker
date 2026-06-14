package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.internal.AFj1tSDK;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFj1wSDK extends AFi1aSDK {

    @NotNull
    private final AFj1xSDK component2;

    @NotNull
    private final Runnable component3;

    @NotNull
    private final AFc1pSDK getMediationNetwork;

    @NotNull
    private final ExecutorService getRevenue;

    @Nullable
    private String toString;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1xSDK.values().length];
            try {
                iArr[AFj1xSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1xSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1xSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1wSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull ExecutorService executorService, @NotNull AFj1xSDK aFj1xSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1xSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i10 = AFj1tSDK.AFa1zSDK.AFAdRevenueData[aFj1xSDK.ordinal()];
        if (i10 == 1) {
            str = "facebook";
        } else if (i10 == 2) {
            str = "instagram";
        } else {
            if (i10 != 3) {
                throw new lf.m();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getMediationNetwork = aFc1pSDK;
        this.getRevenue = executorService;
        this.component2 = aFj1xSDK;
        this.component3 = runnable2;
    }

    private final boolean AFAdRevenueData(Context context) {
        int i10 = AFa1vSDK.getRevenue[this.component2.ordinal()];
        if (i10 == 1) {
            return getRevenue(context);
        }
        if (i10 == 2) {
            return getMediationNetwork(context);
        }
        if (i10 == 3) {
            return component2(context);
        }
        throw new lf.m();
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[PHI: r0
  0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getMonetizationNetwork(android.content.Context r12) {
        /*
            r11 = this;
            boolean r0 = r11.getMediationNetwork()
            r1 = 0
            if (r0 != 0) goto L14
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r3 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by counter."
            r5 = 0
            com.appsflyer.internal.AFh1ySDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        L14:
            com.appsflyer.internal.AFc1pSDK r0 = r11.getMediationNetwork
            java.lang.String r2 = "com.facebook.sdk.ApplicationId"
            java.lang.String r0 = r0.getMonetizationNetwork(r2)
            java.lang.String r2 = "fb"
            r3 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = kotlin.text.StringsKt.P0(r0, r2)
            goto L27
        L26:
            r0 = r3
        L27:
            if (r0 == 0) goto L2f
            int r4 = r0.length()
            if (r4 != 0) goto L3c
        L2f:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id Manifest metadata is not found."
            r8 = 0
            com.appsflyer.internal.AFh1ySDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L3c:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFc1pSDK r0 = r11.getMediationNetwork
            java.lang.String r4 = "facebook_application_id"
            java.lang.String r0 = r0.getMediationNetwork(r4)
            if (r0 == 0) goto L4d
            java.lang.String r0 = kotlin.text.StringsKt.P0(r0, r2)
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L56
            int r4 = r0.length()
            if (r4 != 0) goto L63
        L56:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id string resource is not found."
            r8 = 0
            com.appsflyer.internal.AFh1ySDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L63:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFc1pSDK r0 = r11.getMediationNetwork
            java.lang.String r4 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r0 = r0.getMonetizationNetwork(r4)
            if (r0 == 0) goto L74
            java.lang.String r0 = kotlin.text.StringsKt.P0(r0, r2)
            goto L75
        L74:
            r0 = r3
        L75:
            if (r0 == 0) goto L7d
            int r2 = r0.length()
            if (r2 != 0) goto L8a
        L7d:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r5 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "AF Facebook app id Manifest metadata is not found."
            r7 = 0
            com.appsflyer.internal.AFh1ySDK.d$default(r4, r5, r6, r7, r8, r9)
            r0 = r3
        L8a:
            if (r0 != 0) goto L8d
            goto L8e
        L8d:
            r3 = r0
        L8e:
            r11.toString = r3
            if (r3 != 0) goto L9f
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r5 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "Referrer collection disallowed by missing Facebook app id."
            r7 = 0
            com.appsflyer.internal.AFh1ySDK.d$default(r4, r5, r6, r7, r8, r9)
            return r1
        L9f:
            boolean r12 = r11.AFAdRevenueData(r12)
            if (r12 != 0) goto Lb2
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r3 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by missing content providers."
            r5 = 0
            com.appsflyer.internal.AFh1ySDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        Lb2:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1wSDK.getMonetizationNetwork(android.content.Context):boolean");
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    @SuppressLint({"NewApi"})
    public final void getCurrencyIso4217Code(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMonetizationNetwork(context)) {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.k0
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AFj1wSDK.getCurrencyIso4217Code(this.f15646b, context);
                }
            });
        } else {
            this.component3.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:3:0x002c, B:7:0x003e, B:9:0x0044, B:27:0x0104, B:13:0x0072, B:15:0x0084, B:16:0x0089, B:17:0x008a, B:19:0x0090, B:20:0x00b5, B:21:0x00c5, B:23:0x00cb, B:24:0x00f0), top: B:110:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0238 A[PHI: r21
  0x0238: PHI (r21v4 android.content.ContentProviderClient) = 
  (r21v2 android.content.ContentProviderClient)
  (r21v5 android.content.ContentProviderClient)
  (r21v5 android.content.ContentProviderClient)
 binds: [B:90:0x0294, B:71:0x0236, B:80:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023e A[PHI: r21
  0x023e: PHI (r21v3 android.content.ContentProviderClient) = 
  (r21v2 android.content.ContentProviderClient)
  (r21v5 android.content.ContentProviderClient)
  (r21v5 android.content.ContentProviderClient)
 binds: [B:92:0x0297, B:73:0x023c, B:82:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void getCurrencyIso4217Code(com.appsflyer.internal.AFj1wSDK r27, android.content.Context r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1wSDK.getCurrencyIso4217Code(com.appsflyer.internal.AFj1wSDK, android.content.Context):void");
    }
}
