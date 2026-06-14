package org.bidon.sdk.utils.networking.requests;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.DataProvider;
import org.bidon.sdk.utils.json.JsonObjectBuilder;
import org.bidon.sdk.utils.serializer.Serializable;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\\\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u0001H\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012H\u0096B¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCaseImpl;", "Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;", "dataProvider", "Lorg/bidon/sdk/databinders/DataProvider;", "<init>", "(Lorg/bidon/sdk/databinders/DataProvider;)V", "invoke", "Lorg/json/JSONObject;", "T", "Lorg/bidon/sdk/utils/serializer/Serializable;", "binders", "", "Lorg/bidon/sdk/databinders/DataBinderType;", "dataKeyName", "", "data", "list", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "(Ljava/util/List;Ljava/lang/String;Lorg/bidon/sdk/utils/serializer/Serializable;Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateRequestBodyUseCaseImpl implements CreateRequestBodyUseCase {

    @NotNull
    private final DataProvider dataProvider;

    /* JADX INFO: renamed from: org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl", f = "CreateRequestBodyUseCaseImpl.kt", l = {26}, m = "invoke")
    static final class AnonymousClass1<T extends Serializable> extends d {
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
            return CreateRequestBodyUseCaseImpl.this.invoke(null, null, null, null, null, this);
        }
    }

    public CreateRequestBodyUseCaseImpl(@NotNull DataProvider dataProvider) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        this.dataProvider = dataProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(Map map, Map map2, String str, Serializable serializable, List list, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jsonObject.hasValue((String) entry.getKey(), entry.getValue());
            }
        }
        if (!map2.isEmpty()) {
            jsonObject.hasValue("ext", new JSONObject(map2).toString());
        }
        if (str != null) {
            if (serializable != null) {
                jsonObject.hasValue(str, SerializerKt.serialize(serializable));
            } else if (!list.isEmpty()) {
                jsonObject.hasValue(str, SerializerKt.serialize((List<? extends Serializable>) list));
            }
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends org.bidon.sdk.utils.serializer.Serializable> java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.util.List<? extends org.bidon.sdk.databinders.DataBinderType> r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable T r12, @org.jetbrains.annotations.NotNull java.util.List<? extends T> r13, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r15
            org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl$invoke$1 r0 = (org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl$invoke$1 r0 = new org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl$invoke$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r10 = r0.L$3
            r14 = r10
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r10 = r0.L$2
            r13 = r10
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r10 = r0.L$1
            r12 = r10
            org.bidon.sdk.utils.serializer.Serializable r12 = (org.bidon.sdk.utils.serializer.Serializable) r12
            java.lang.Object r10 = r0.L$0
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            kotlin.d.b(r15)
            goto L6a
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L45:
            kotlin.d.b(r15)
            r15 = r10
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            r2 = 0
            if (r15 != 0) goto L54
            r15 = r10
            goto L55
        L54:
            r15 = r2
        L55:
            if (r15 == 0) goto L6d
            org.bidon.sdk.databinders.DataProvider r15 = r9.dataProvider
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.L$3 = r14
            r0.label = r3
            java.lang.Object r15 = r15.provide(r10, r0)
            if (r15 != r1) goto L6a
            return r1
        L6a:
            r2 = r15
            java.util.Map r2 = (java.util.Map) r2
        L6d:
            r6 = r11
            r7 = r12
            r8 = r13
            r5 = r14
            r4 = r2
            org.bidon.sdk.utils.networking.requests.a r3 = new org.bidon.sdk.utils.networking.requests.a
            r3.<init>()
            org.json.JSONObject r10 = org.bidon.sdk.utils.json.JsonObjectBuilderKt.jsonObject(r3)
            java.lang.String r11 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "CreateRequestBodyUseCase"
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCaseImpl.invoke(java.util.List, java.lang.String, org.bidon.sdk.utils.serializer.Serializable, java.util.List, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
