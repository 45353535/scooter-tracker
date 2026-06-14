package com.appodeal.consent.cache;

import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f15379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f15380t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f15379s = pVar;
        this.f15380t = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f15379s, this.f15380t, continuation);
        dVar.f15378r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Object objB;
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.consent.logger.a.b("[PrivacyPreferences] - getCmpConsent: " + this.f15379s.a(), null);
        if (Intrinsics.areEqual(this.f15379s, j.f15394c)) {
            SharedPreferences sharedPreferences = this.f15380t.f15391a;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmpPreferences");
                sharedPreferences = null;
            }
            String string2 = sharedPreferences.getString("stack_consent_data", null);
            if (string2 != null) {
                Charset charset = Charsets.UTF_8;
                byte[] bytes = string2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                byte[] bArrDecode = Base64.decode(bytes, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                string = new String(bArrDecode, charset);
            } else {
                string = null;
            }
        } else {
            SharedPreferences sharedPreferences2 = this.f15380t.f15391a;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cmpPreferences");
                sharedPreferences2 = null;
            }
            string = sharedPreferences2.getString(this.f15379s.a(), null);
        }
        if (string == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new JSONObject(string));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (JSONObject) (Result.i(objB) ? null : objB);
    }
}
