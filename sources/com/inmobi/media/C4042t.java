package com.inmobi.media;

import com.squareup.picasso.Picasso;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4042t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4117w f39564a;

    public C4042t(C4117w c4117w) {
        this.f39564a = c4117w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3903n9 c3903n9 = this.f39564a.f39810d;
        if (c3903n9 != null) {
            c3903n9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C4117w c4117w = this.f39564a;
        C3903n9 c3903n92 = c4117w.f39810d;
        if (c3903n92 != null) {
            c3903n92.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = Qf.f37593a;
        Qf.b(c4117w.f39807a).cancelTag(c4117w.f39811e);
        return Unit.f93236a;
    }
}
