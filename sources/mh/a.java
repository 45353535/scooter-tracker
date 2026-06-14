package mh;

import hh.b0;
import hh.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f94918a = new a();

    private a() {
    }

    @Override // hh.v
    public b0 intercept(v.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        nh.g gVar = (nh.g) chain;
        return nh.g.c(gVar, 0, gVar.d().u(gVar), null, 0, 0, 0, 61, null).a(gVar.h());
    }
}
