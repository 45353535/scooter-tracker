package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.ortb.model.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements com.moloco.sdk.internal.ortb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.json.b f54459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.scheduling.a f54460b;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54461r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f54463t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f54463t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.f54463t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54461r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            try {
                kotlinx.serialization.json.b bVar = b.this.f54459a;
                String str = this.f54463t;
                bVar.a();
                return new h0.b(e.a((g) bVar.c(g.INSTANCE.serializer(), str)));
            } catch (Exception e10) {
                return new h0.a(e10);
            }
        }
    }

    public b(kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f54459a = json;
        this.f54460b = com.moloco.sdk.internal.scheduling.c.a();
    }

    @Override // com.moloco.sdk.internal.ortb.a
    public Object a(String str, Continuation continuation) {
        return eg.g.g(this.f54460b.getIo(), new a(str, null), continuation);
    }
}
