package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3566a1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f38140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f38141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3566a1(Ae ae2, View view, Continuation continuation) {
        super(2, continuation);
        this.f38140a = ae2;
        this.f38141b = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3566a1(this.f38140a, this.f38141b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3566a1(this.f38140a, this.f38141b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            AdSession adSession = this.f38140a.f38485c;
            if (adSession != null) {
                adSession.removeFriendlyObstruction(this.f38141b);
            }
        } catch (IllegalArgumentException e10) {
            String str = AbstractC3669e1.f38482f;
            Log.getStackTraceString(e10);
        }
        return Unit.f93236a;
    }
}
