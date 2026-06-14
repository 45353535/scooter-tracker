package com.inmobi.media;

import com.inmobi.media.C3998r5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3998r5 implements InterfaceC3636cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fc f39439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC4019s1 f39440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4126w8 f39441c;

    public C3998r5(InterfaceC4126w8 interfaceC4126w8) {
        this.f39439a = null;
        this.f39440b = null;
        this.f39441c = interfaceC4126w8;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        CoroutineScope coroutineScopeA;
        Job jobD;
        InterfaceC3878m9 interfaceC3878m9C;
        InterfaceC4126w8 interfaceC4126w8 = this.f39441c;
        if (interfaceC4126w8 != null && (interfaceC3878m9C = interfaceC4126w8.c()) != null) {
            ((C3903n9) interfaceC3878m9C).a("AUM-DestroyedState", "Initialize Called");
        }
        InterfaceC4126w8 interfaceC4126w82 = this.f39441c;
        if (interfaceC4126w82 == null || (coroutineScopeA = interfaceC4126w82.a()) == null || (jobD = eg.i.d(coroutineScopeA, null, null, new C3974q5(this, null), 3, null)) == null) {
            return;
        }
        jobD.q(new Function1() { // from class: w3.na
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3998r5.a(this.f107208b, (Throwable) obj);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    public static final Unit a(C3998r5 c3998r5, Throwable th2) {
        InterfaceC3878m9 interfaceC3878m9C;
        InterfaceC4126w8 interfaceC4126w8 = c3998r5.f39441c;
        if (interfaceC4126w8 != null && (interfaceC3878m9C = interfaceC4126w8.c()) != null) {
            ((C3903n9) interfaceC3878m9C).a();
        }
        InterfaceC4126w8 interfaceC4126w82 = c3998r5.f39441c;
        F3.a(interfaceC4126w82 != null ? interfaceC4126w82.a() : null);
        c3998r5.f39440b = null;
        c3998r5.f39441c = null;
        c3998r5.f39439a = null;
        return Unit.f93236a;
    }

    public C3998r5(Fc fc2, AbstractC4019s1 abstractC4019s1, InterfaceC4126w8 interfaceC4126w8) {
        this.f39439a = fc2;
        this.f39440b = abstractC4019s1;
        this.f39441c = interfaceC4126w8;
    }
}
