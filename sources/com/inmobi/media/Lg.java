package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Lg;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Lg extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37295a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lg(Context context, Continuation continuation) {
        super(2, continuation);
        this.f37295a = context;
    }

    public static final boolean a(String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.a0(str, "auto_", false, 2, null);
    }

    public static final boolean b(String str) {
        return Intrinsics.areEqual(str, "a_i_dep");
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Lg(this.f37295a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Lg(this.f37295a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            Og og2 = Og.f37496a;
            Context context = this.f37295a;
            og2.getClass();
            if (Og.f37499d == null) {
                Og.f37499d = new C4209zg(context, "pub_signals_store");
            }
            C4209zg c4209zg = null;
            try {
                C4209zg c4209zg2 = Og.f37499d;
                if (c4209zg2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    c4209zg2 = null;
                }
                String strA = c4209zg2.a("saved_signals");
                if (strA != null) {
                    JSONObject jSONObject = new JSONObject(strA);
                    Iterator<String> itKeys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                    Iterator it = kotlin.sequences.k.c0(kotlin.sequences.k.F(kotlin.sequences.k.h(itKeys), new Function1() { // from class: w3.a3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.a((String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    C4209zg c4209zg3 = Og.f37499d;
                    if (c4209zg3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        c4209zg3 = null;
                    }
                    String value = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    c4209zg3.getClass();
                    Intrinsics.checkNotNullParameter("saved_signals", C4240b4.i.W);
                    Intrinsics.checkNotNullParameter(value, "value");
                    c4209zg3.f40054a.a("saved_signals", value, true);
                }
            } catch (Exception e10) {
                C4209zg c4209zg4 = Og.f37499d;
                if (c4209zg4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    c4209zg4 = null;
                }
                c4209zg4.getClass();
                Intrinsics.checkNotNullParameter("saved_signals", C4240b4.i.W);
                c4209zg4.f40054a.a("saved_signals");
                Og.f37496a.getClass();
                Og.f37500e.a();
                Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                Lazy lazy = P9.f37527a;
                P9.a(new L2(e10));
            }
            try {
                C4209zg c4209zg5 = Og.f37499d;
                if (c4209zg5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    c4209zg5 = null;
                }
                String strA2 = c4209zg5.a(Reporting.Key.IMP_DEPTH);
                if (strA2 != null) {
                    JSONObject jSONObject2 = new JSONObject(strA2);
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys2, "keys(...)");
                    Iterator it2 = kotlin.sequences.k.c0(kotlin.sequences.k.F(kotlin.sequences.k.h(itKeys2), new Function1() { // from class: w3.b3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.b((String) obj2));
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        jSONObject2.remove((String) it2.next());
                    }
                    C4209zg c4209zg6 = Og.f37499d;
                    if (c4209zg6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        c4209zg6 = null;
                    }
                    String value2 = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
                    c4209zg6.getClass();
                    Intrinsics.checkNotNullParameter(Reporting.Key.IMP_DEPTH, C4240b4.i.W);
                    Intrinsics.checkNotNullParameter(value2, "value");
                    Ea ea2 = c4209zg6.f40054a;
                    ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                    ea2.a(Reporting.Key.IMP_DEPTH, value2, false);
                }
            } catch (Exception unused) {
                C4209zg c4209zg7 = Og.f37499d;
                if (c4209zg7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                } else {
                    c4209zg = c4209zg7;
                }
                c4209zg.getClass();
                Intrinsics.checkNotNullParameter(Reporting.Key.IMP_DEPTH, C4240b4.i.W);
                c4209zg.f40054a.a(Reporting.Key.IMP_DEPTH);
            }
            Og.f37496a.getClass();
            I1 i12 = Og.f37500e;
            i12.f37042c = i12.f37040a.invoke();
            I1 i13 = Og.f37501f;
            i13.f37042c = i13.f37040a.invoke();
        } catch (Exception e11) {
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            Lazy lazy2 = P9.f37527a;
            AbstractC3779i9.a(e11);
        }
        Og.f37496a.getClass();
        I1 i14 = Og.f37500e;
        i14.f37042c = i14.f37040a.invoke();
        I1 i15 = Og.f37501f;
        i15.f37042c = i15.f37040a.invoke();
        return Unit.f93236a;
    }
}
