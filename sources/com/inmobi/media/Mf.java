package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Mf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f37369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f37370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f37373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mf(Context context, Continuation continuation) {
        super(2, continuation);
        this.f37373e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Mf mf2 = new Mf(this.f37373e, continuation);
        mf2.f37372d = obj;
        return mf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Mf mf2 = new Mf(this.f37373e, (Continuation) obj2);
        mf2.f37372d = (CoroutineScope) obj;
        return mf2.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Context context;
        WeakReference weakReference;
        Object objG = pf.b.g();
        int i10 = this.f37371c;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f37372d;
            mutex = Qf.f37594b;
            Context context2 = this.f37373e;
            this.f37372d = coroutineScope;
            this.f37369a = mutex;
            this.f37370b = context2;
            this.f37371c = 1;
            if (mutex.lock(null, this) == objG) {
                return objG;
            }
            context = context2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.f37370b;
            mutex = this.f37369a;
            kotlin.d.b(obj);
        }
        try {
            int size = Qf.f37595c.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = Qf.f37595c;
                if (Intrinsics.areEqual((Context) ((WeakReference) arrayList.get(i11)).get(), context)) {
                    weakReference = (WeakReference) arrayList.get(i11);
                    break;
                }
                i11++;
            }
            if (weakReference == null) {
                Qf.f37595c.add(new WeakReference(context));
            }
            Picasso picassoA = Qf.f37593a;
            if (picassoA == null) {
                Ji.a(context, Qf.f37596d);
                picassoA = Qf.a(context);
                Qf.f37593a = picassoA;
            }
            mutex.unlock(null);
            return picassoA;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }
}
