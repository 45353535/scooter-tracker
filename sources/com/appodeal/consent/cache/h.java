package com.appodeal.consent.cache;

import android.content.SharedPreferences;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f15389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f15390u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, String str2, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f15388s = str;
        this.f15389t = str2;
        this.f15390u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f15388s, this.f15389t, this.f15390u, continuation);
        hVar.f15387r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objPutString;
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.consent.logger.a.b("[PrivacyPreferences] - setConsent: " + this.f15388s + " = " + this.f15389t, null);
        SharedPreferences sharedPreferences = this.f15390u.f15391a;
        SharedPreferences sharedPreferences2 = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cmpPreferences");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putString(this.f15388s, this.f15389t).apply();
        SharedPreferences sharedPreferences3 = this.f15390u.f15392b;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iabPreferences");
        } else {
            sharedPreferences2 = sharedPreferences3;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
        JSONObject jSONObject = new JSONObject(this.f15389t);
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Result.Companion companion = Result.f93230c;
                Object obj2 = jSONObject.get(next);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                com.appodeal.consent.logger.a.b("[PrivacyPreferences] - setIABConsent: " + next + " = " + obj2, null);
                if (obj2 instanceof Boolean) {
                    objPutString = editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                } else if (obj2 instanceof BigDecimal) {
                    objPutString = editorEdit.putFloat(next, ((BigDecimal) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    objPutString = editorEdit.putInt(next, ((Number) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    objPutString = editorEdit.putLong(next, ((Number) obj2).longValue());
                } else if (obj2 instanceof String) {
                    objPutString = editorEdit.putString(next, (String) obj2);
                } else {
                    com.appodeal.consent.logger.a.b("[PrivacyPreferences] - setIABConsent: " + next + " unknown type " + obj2 + ": " + obj2.getClass(), null);
                    objPutString = Unit.f93236a;
                }
                objB = Result.b(objPutString);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                com.appodeal.consent.logger.a.b("[PrivacyPreferences] - setIABConsent: error " + thG, null);
            }
        }
        editorEdit.apply();
        return Unit.f93236a;
    }
}
