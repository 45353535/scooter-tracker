package org.bidon.sdk.databinders.user;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.DataBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lorg/bidon/sdk/databinders/user/UserBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "dataSource", "Lorg/bidon/sdk/databinders/user/UserDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/user/UserDataSource;)V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUser", "Lorg/bidon/sdk/config/models/User;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserBinder implements DataBinder<JSONObject> {

    @NotNull
    private final UserDataSource dataSource;

    @NotNull
    private final String fieldName;

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.user.UserBinder$createUser$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.user.UserBinder", f = "UserBinder.kt", l = {23, 24}, m = "createUser")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserBinder.this.createUser(this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.user.UserBinder$getJsonObject$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.user.UserBinder", f = "UserBinder.kt", l = {16}, m = "getJsonObject")
    static final class C58211 extends d {
        int label;
        /* synthetic */ Object result;

        C58211(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserBinder.this.getJsonObject(this);
        }
    }

    public UserBinder(@NotNull UserDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.fieldName = "user";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createUser(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof org.bidon.sdk.databinders.user.UserBinder.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            org.bidon.sdk.databinders.user.UserBinder$createUser$1 r0 = (org.bidon.sdk.databinders.user.UserBinder.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.databinders.user.UserBinder$createUser$1 r0 = new org.bidon.sdk.databinders.user.UserBinder$createUser$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5e
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r1 = r0.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.d.b(r8)
            r4 = r3
            r3 = r2
            r2 = r4
            r4 = r1
            r1 = r0
            goto La6
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L4a:
            java.lang.Object r2 = r0.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$0
            org.bidon.sdk.databinders.user.UserBinder r6 = (org.bidon.sdk.databinders.user.UserBinder) r6
            kotlin.d.b(r8)
            goto L8c
        L5e:
            kotlin.d.b(r8)
            org.bidon.sdk.databinders.user.UserDataSource r8 = r7.dataSource
            java.lang.String r8 = r8.getAdvertisingId()
            org.bidon.sdk.databinders.user.UserDataSource r2 = r7.dataSource
            java.lang.String r2 = r2.getTrackingAuthorizationStatus()
            org.bidon.sdk.databinders.user.UserDataSource r5 = r7.dataSource
            java.lang.String r5 = r5.getApplicationId()
            org.bidon.sdk.databinders.user.UserDataSource r6 = r7.dataSource
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r2
            r0.L$3 = r5
            r0.label = r4
            java.lang.Object r4 = r6.getAppSetId(r0)
            if (r4 != r1) goto L86
            goto La0
        L86:
            r6 = r5
            r5 = r8
            r8 = r4
            r4 = r2
            r2 = r6
            r6 = r7
        L8c:
            java.lang.String r8 = (java.lang.String) r8
            org.bidon.sdk.databinders.user.UserDataSource r6 = r6.dataSource
            r0.L$0 = r5
            r0.L$1 = r4
            r0.L$2 = r2
            r0.L$3 = r8
            r0.label = r3
            java.lang.Object r0 = r6.getAppSetIdScope(r0)
            if (r0 != r1) goto La1
        La0:
            return r1
        La1:
            r3 = r2
            r2 = r4
            r1 = r5
            r4 = r8
            r8 = r0
        La6:
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            org.bidon.sdk.config.models.User r0 = new org.bidon.sdk.config.models.User
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.databinders.user.UserBinder.createUser(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // org.bidon.sdk.databinders.DataBinder
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getJsonObject(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof org.bidon.sdk.databinders.user.UserBinder.C58211
            if (r0 == 0) goto L13
            r0 = r5
            org.bidon.sdk.databinders.user.UserBinder$getJsonObject$1 r0 = (org.bidon.sdk.databinders.user.UserBinder.C58211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.databinders.user.UserBinder$getJsonObject$1 r0 = new org.bidon.sdk.databinders.user.UserBinder$getJsonObject$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.createUser(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            org.bidon.sdk.utils.serializer.Serializable r5 = (org.bidon.sdk.utils.serializer.Serializable) r5
            org.json.JSONObject r5 = org.bidon.sdk.utils.serializer.SerializerKt.serialize(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.databinders.user.UserBinder.getJsonObject(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
