package com.moloco.sdk.internal.bidtoken;

import android.util.Base64;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.q;
import eg.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54133r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f54134s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f54134s = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f54134s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54133r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            try {
                byte[] bArrDecode = Base64.decode((String) StringsKt.split$default((String) StringsKt.X0(this.f54134s, new char[]{':'}, false, 0, 6, null).get(1), new String[]{"."}, false, 0, 6, null).get(1), 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                return new h0.b(new com.moloco.sdk.internal.bidtoken.a(new JSONObject(StringsKt.F(bArrDecode)).getLong("exp")));
            } catch (Exception e10) {
                return new h0.a(new q(e10.toString(), -1));
            }
        }
    }

    @Override // com.moloco.sdk.internal.bidtoken.b
    public Object a(String str, Continuation continuation) {
        return g.g(d.f54135a, new a(str, null), continuation);
    }
}
