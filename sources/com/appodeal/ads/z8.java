package com.appodeal.ads;

import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc f15308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f15309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public te f15310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uc f15311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xe f15312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f15313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.appodeal.ads.segments.o f15314g;

    public z8(hc provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f15308a = provider;
        this.f15309b = lf.i.a(new Function0() { // from class: com.appodeal.ads.x8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z8.d();
            }
        });
    }

    public static final Unit b(JsonObjectBuilder jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        return Unit.f93236a;
    }

    public static final JSONObject d() {
        return JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.y8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z8.b((JsonObjectBuilder) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:26:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.appodeal.ads.networking.binders.s[] r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.appodeal.ads.s8
            if (r0 == 0) goto L14
            r0 = r15
            com.appodeal.ads.s8 r0 = (com.appodeal.ads.s8) r0
            int r1 = r0.f14466y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14466y = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            com.appodeal.ads.s8 r0 = new com.appodeal.ads.s8
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.f14464w
            java.lang.Object r1 = pf.b.g()
            int r2 = r15.f14466y
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r14 = r15.f14463v
            int r2 = r15.f14462u
            com.appodeal.ads.networking.binders.s r4 = r15.f14461t
            com.appodeal.ads.networking.binders.s[] r5 = r15.f14460s
            com.appodeal.ads.z8 r6 = r15.f14459r
            kotlin.d.b(r0)     // Catch: java.lang.Exception -> L35
            goto L6f
        L35:
            r0 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            kotlin.d.b(r0)
            int r0 = r14.length
            r2 = 0
            r12 = r13
            r11 = r15
            r15 = r14
            r14 = r0
        L48:
            if (r2 >= r14) goto La1
            r5 = r15[r2]
            com.appodeal.ads.hc r4 = r12.f15308a     // Catch: java.lang.Exception -> L75
            com.appodeal.ads.uc r6 = r12.f15311d     // Catch: java.lang.Exception -> L75
            com.appodeal.ads.te r7 = r12.f15310c     // Catch: java.lang.Exception -> L75
            com.appodeal.ads.xe r8 = r12.f15312e     // Catch: java.lang.Exception -> L75
            com.appodeal.ads.l0 r9 = r12.f15313f     // Catch: java.lang.Exception -> L75
            com.appodeal.ads.segments.o r10 = r12.f15314g     // Catch: java.lang.Exception -> L75
            r11.f14459r = r12     // Catch: java.lang.Exception -> L75
            r11.f14460s = r15     // Catch: java.lang.Exception -> L75
            r11.f14461t = r5     // Catch: java.lang.Exception -> L75
            r11.f14462u = r2     // Catch: java.lang.Exception -> L75
            r11.f14463v = r14     // Catch: java.lang.Exception -> L75
            r11.f14466y = r3     // Catch: java.lang.Exception -> L75
            java.lang.Object r0 = r4.c(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L75
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r4 = r5
            r6 = r12
            r5 = r15
            r15 = r11
        L6f:
            com.appodeal.ads.networking.binders.q r0 = (com.appodeal.ads.networking.binders.q) r0     // Catch: java.lang.Exception -> L35
        L71:
            r11 = r15
            r15 = r5
            r12 = r6
            goto L92
        L75:
            r0 = move-exception
            r4 = r5
            r6 = r12
            r5 = r15
            r15 = r11
        L7a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Error while binding data for "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.String r7 = "RequestBodyBuilder"
            com.appodeal.ads.ext.LogExtKt.logInternal(r7, r4, r0)
            r0 = 0
            goto L71
        L92:
            if (r0 == 0) goto L9f
            kotlin.Lazy r4 = r12.f15309b
            java.lang.Object r4 = r4.getValue()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            com.appodeal.ads.ia.g(r4, r0)
        L9f:
            int r2 = r2 + r3
            goto L48
        La1:
            kotlin.Lazy r14 = r12.f15309b
            java.lang.Object r14 = r14.getValue()
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            com.appodeal.ads.v4.g(r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.z8.a(com.appodeal.ads.networking.binders.s[], kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final byte[] c() {
        String string;
        if (((JSONObject) this.f15309b.getValue()).length() != 0 && (string = ((JSONObject) this.f15309b.getValue()).toString()) != null) {
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes != null) {
                return bytes;
            }
        }
        return new byte[0];
    }

    public z8() {
        this((hc) sc.f14469a.getValue());
    }
}
