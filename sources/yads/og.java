package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class og extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pg f114308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(pg pgVar) {
        super(0);
        this.f114308b = pgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f114308b.c();
        this.f114308b.f114664d.getClass();
        kg.a("Connection timeout");
        this.f114308b.a();
        return Unit.f93236a;
    }
}
