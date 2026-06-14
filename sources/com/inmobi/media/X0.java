package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class X0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f37980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f37981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FriendlyObstructionPurpose f37982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Ae ae2, View view, FriendlyObstructionPurpose friendlyObstructionPurpose, Continuation continuation) {
        super(2, continuation);
        this.f37980a = ae2;
        this.f37981b = view;
        this.f37982c = friendlyObstructionPurpose;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new X0(this.f37980a, this.f37981b, this.f37982c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((X0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            AdSession adSession = this.f37980a.f38485c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.f37981b, this.f37982c, null);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3878m9 interfaceC3878m9 = this.f37980a.f38484b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a(AbstractC3669e1.f38482f, "Failed to addObstruction. Reason: " + Log.getStackTraceString(e10));
            }
        }
        return Unit.f93236a;
    }
}
