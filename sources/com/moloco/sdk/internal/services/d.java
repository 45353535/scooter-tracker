package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f55517a;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55518r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f55520t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f55520t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new a(this.f55520t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55518r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (!d.this.f55517a.contains(this.f55520t)) {
                return null;
            }
            try {
                return d.this.f55517a.getString(this.f55520t, "");
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.f55520t, null, false, 12, null);
                return null;
            }
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55521r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f55523t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.f55523t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new b(this.f55523t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55521r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            d.this.f55517a.edit().remove(this.f55523t).apply();
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55524r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f55525s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f55526t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f55527u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, d dVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f55525s = obj;
            this.f55526t = dVar;
            this.f55527u = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f55525s, this.f55526t, this.f55527u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55524r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            Object obj2 = this.f55525s;
            if (obj2 instanceof Integer) {
                this.f55526t.f55517a.edit().putInt(this.f55527u, ((Number) this.f55525s).intValue()).apply();
            } else if (obj2 instanceof String) {
                this.f55526t.f55517a.edit().putString(this.f55527u, (String) this.f55525s).apply();
            } else if (obj2 instanceof Float) {
                this.f55526t.f55517a.edit().putFloat(this.f55527u, ((Number) this.f55525s).floatValue()).apply();
            } else if (obj2 instanceof Boolean) {
                this.f55526t.f55517a.edit().putBoolean(this.f55527u, ((Boolean) this.f55525s).booleanValue()).apply();
            } else if (obj2 instanceof Double) {
                this.f55526t.f55517a.edit().putString(this.f55527u, String.valueOf(((Number) this.f55525s).doubleValue())).apply();
            } else if (obj2 instanceof Long) {
                this.f55526t.f55517a.edit().putString(this.f55527u, String.valueOf(((Number) this.f55525s).longValue())).apply();
            } else {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type: " + this.f55525s + " for key: " + this.f55527u, null, false, 12, null);
            }
            return Unit.f93236a;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f55517a = sharedPreferences;
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object a(String str, Continuation continuation) {
        Object objG = eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new b(str, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object b(String str, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.g0
    public Object c(String str, Object obj, Continuation continuation) {
        Object objG = eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new c(obj, this, str, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
