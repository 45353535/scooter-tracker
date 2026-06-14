package f1;

import f1.bf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6 f71011a;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c1.a f71012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d1.a f71013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f71014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e1.a f71015i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ s1 f71016j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c1.a aVar, d1.a aVar2, String str, e1.a aVar3, s1 s1Var) {
            super(0);
            this.f71012f = aVar;
            this.f71013g = aVar2;
            this.f71014h = str;
            this.f71015i = aVar3;
            this.f71016j = s1Var;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            c1.a aVar = this.f71012f;
            if (aVar != null) {
                d1.a aVar2 = this.f71013g;
                String str = this.f71014h;
                e1.a aVar3 = this.f71015i;
                s1 s1Var = this.f71016j;
                if (aVar2 != null) {
                    aVar2.g(new e1.b(str, aVar), aVar3);
                    unit2 = Unit.f93236a;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    eg.m("Callback missing for " + s1Var.a(aVar) + " on onAdLoaded", null, 2, null);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Ad is missing on onAdLoaded", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c1.a f71017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d1.a f71018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f71019h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e1.d f71020i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ s1 f71021j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c1.a aVar, d1.a aVar2, String str, e1.d dVar, s1 s1Var) {
            super(0);
            this.f71017f = aVar;
            this.f71018g = aVar2;
            this.f71019h = str;
            this.f71020i = dVar;
            this.f71021j = s1Var;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            c1.a aVar = this.f71017f;
            if (aVar != null) {
                d1.a aVar2 = this.f71018g;
                String str = this.f71019h;
                e1.d dVar = this.f71020i;
                s1 s1Var = this.f71021j;
                if (aVar2 != null) {
                    aVar2.a(new e1.e(str, aVar), dVar);
                    unit2 = Unit.f93236a;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    eg.m("Callback missing for " + s1Var.a(aVar) + " on onAdClicked", null, 2, null);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Ad is missing on onAdClicked", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.a f71022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.a f71023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f71024h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d1.a aVar, c1.a aVar2, String str) {
            super(0);
            this.f71022f = aVar;
            this.f71023g = aVar2;
            this.f71024h = str;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            d1.a aVar = this.f71022f;
            if (aVar != null) {
                c1.a aVar2 = this.f71023g;
                String str = this.f71024h;
                if (aVar instanceof d1.c) {
                    if (aVar2 != null) {
                        ((d1.c) aVar).f(new e1.f(str, aVar2));
                        unit2 = Unit.f93236a;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        eg.j("Ad is missing on onAdDismiss", null, 2, null);
                    }
                } else {
                    eg.j("Invalid ad type to send onAdDismiss", null, 2, null);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Missing callback on sendDismissCallbackOnMainThread", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c1.a f71025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d1.a f71026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f71027h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s1 f71028i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c1.a aVar, d1.a aVar2, String str, s1 s1Var) {
            super(0);
            this.f71025f = aVar;
            this.f71026g = aVar2;
            this.f71027h = str;
            this.f71028i = s1Var;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            c1.a aVar = this.f71025f;
            if (aVar != null) {
                d1.a aVar2 = this.f71026g;
                String str = this.f71027h;
                s1 s1Var = this.f71028i;
                if (aVar2 != null) {
                    aVar2.c(new e1.g(str, aVar));
                    unit2 = Unit.f93236a;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    eg.m("Callback missing for " + s1Var.a(aVar) + " on onImpressionRecorded", null, 2, null);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Ad is missing on onImpressionRecorded", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c1.a f71029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d1.a f71030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f71031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s1 f71032i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c1.a aVar, d1.a aVar2, String str, s1 s1Var) {
            super(0);
            this.f71029f = aVar;
            this.f71030g = aVar2;
            this.f71031h = str;
            this.f71032i = s1Var;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            c1.a aVar = this.f71029f;
            if (aVar != null) {
                d1.a aVar2 = this.f71030g;
                String str = this.f71031h;
                s1 s1Var = this.f71032i;
                if (aVar2 != null) {
                    aVar2.d(new e1.j(str, aVar));
                    unit2 = Unit.f93236a;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    eg.m("Callback missing for " + s1Var.a(aVar) + " on onAdRequestedToShow", null, 2, null);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Ad is missing on onAdRequestedToShow", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.a f71033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.a f71034g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f71035h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f71036i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d1.a aVar, c1.a aVar2, String str, int i10) {
            super(0);
            this.f71033f = aVar;
            this.f71034g = aVar2;
            this.f71035h = str;
            this.f71036i = i10;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            d1.a aVar = this.f71033f;
            if (aVar != null) {
                c1.a aVar2 = this.f71034g;
                String str = this.f71035h;
                int i10 = this.f71036i;
                if (aVar instanceof d1.e) {
                    if (aVar2 != null) {
                        ((d1.e) aVar).b(new e1.h(str, aVar2, i10));
                        unit2 = Unit.f93236a;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        eg.j("Ad is missing on didEarnReward", null, 2, null);
                    }
                } else {
                    eg.j("Invalid ad type to send a reward", null, 2, null);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Missing callback on sendRewardCallbackOnMainThread", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c1.a f71037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d1.a f71038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f71039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e1.i f71040i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ s1 f71041j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c1.a aVar, d1.a aVar2, String str, e1.i iVar, s1 s1Var) {
            super(0);
            this.f71037f = aVar;
            this.f71038g = aVar2;
            this.f71039h = str;
            this.f71040i = iVar;
            this.f71041j = s1Var;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            c1.a aVar = this.f71037f;
            if (aVar != null) {
                d1.a aVar2 = this.f71038g;
                String str = this.f71039h;
                e1.i iVar = this.f71040i;
                s1 s1Var = this.f71041j;
                if (aVar2 != null) {
                    aVar2.e(new e1.j(str, aVar), iVar);
                    unit2 = Unit.f93236a;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    eg.m("Callback missing for " + s1Var.a(aVar) + " on onAdShown", null, 2, null);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Ad is missing on onAdShown", null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public s1(t6 uiPoster) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.f71011a = uiPoster;
    }

    public final String a(c1.a aVar) {
        if (aVar instanceof c1.c) {
            return bf.b.f69484g.b();
        }
        if (aVar instanceof c1.d) {
            return bf.c.f69485g.b();
        }
        if (aVar instanceof c1.b) {
            return bf.a.f69483g.b();
        }
        throw new lf.m();
    }

    public final void c(String str, c1.a aVar, d1.a aVar2) {
        this.f71011a.b(new c(aVar2, aVar, str));
    }

    public final void d(String str, c1.a aVar, d1.a aVar2, int i10) {
        this.f71011a.b(new f(aVar2, aVar, str, i10));
    }

    public final void e(String str, e1.a aVar, c1.a aVar2, d1.a aVar3) {
        this.f71011a.b(new a(aVar2, aVar3, str, aVar, this));
    }

    public final void f(String str, e1.d dVar, c1.a aVar, d1.a aVar2) {
        this.f71011a.b(new b(aVar, aVar2, str, dVar, this));
    }

    public final void g(String str, e1.i iVar, c1.a aVar, d1.a aVar2) {
        this.f71011a.b(new g(aVar, aVar2, str, iVar, this));
    }

    public final void h(String str, c1.a aVar, d1.a aVar2) {
        this.f71011a.b(new d(aVar, aVar2, str, this));
    }

    public final void i(String str, c1.a aVar, d1.a aVar2) {
        this.f71011a.b(new e(aVar, aVar2, str, this));
    }
}
