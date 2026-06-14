package com.inmobi.media;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class C7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f36658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7(N7 n72, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f36658b = n72;
        this.f36659c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C7(this.f36658b, this.f36659c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C7(this.f36658b, this.f36659c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C7 c72;
        Object objG = pf.b.g();
        int i10 = this.f36657a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            N7 n72 = this.f36658b;
            if (!n72.f37407f.get()) {
                n72.f37407f.set(true);
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    n72.f37417p.addListener(n72.B);
                } else {
                    eg.i.d(n72.f37404c, null, null, new C4025s7(null, n72), 3, null);
                }
            }
            this.f36658b.f37422u = System.currentTimeMillis();
            N7 n73 = this.f36658b;
            ExoPlayer exoPlayer = n73.f37417p;
            ArrayList arrayList = this.f36659c;
            InterfaceC3878m9 interfaceC3878m9 = n73.f37403b;
            K2 k22 = n73.f37424w;
            boolean isCache = n73.f37402a.getIsCache();
            this.f36657a = 1;
            c72 = this;
            obj = Mm.a(exoPlayer, arrayList, interfaceC3878m9, k22, isCache, c72);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            c72 = this;
        }
        c72.f36658b.a((AbstractC3676e8) obj);
        return Unit.f93236a;
    }
}
