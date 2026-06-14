package p;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import hg.i;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import z.j;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j, LayoutModifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MutableStateFlow f97987b = l0.a(Constraints.m3907boximpl(g.c()));

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Placeable f97988f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Placeable placeable) {
            super(1);
            this.f97988f = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return Unit.f93236a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.f97988f, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class b implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f97989b;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector f97990b;

            /* JADX INFO: renamed from: p.c$b$a$a, reason: collision with other inner class name */
            public static final class C1159a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f97991r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f97992s;

                public C1159a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f97991r = obj;
                    this.f97992s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f97990b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p.c.b.a.C1159a
                    if (r0 == 0) goto L13
                    r0 = r8
                    p.c$b$a$a r0 = (p.c.b.a.C1159a) r0
                    int r1 = r0.f97992s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f97992s = r1
                    goto L18
                L13:
                    p.c$b$a$a r0 = new p.c$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f97991r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f97992s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r8)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.d.b(r8)
                    kotlinx.coroutines.flow.FlowCollector r8 = r6.f97990b
                    androidx.compose.ui.unit.Constraints r7 = (androidx.compose.ui.unit.Constraints) r7
                    long r4 = r7.getValue()
                    z.i r7 = p.a.c(r4)
                    if (r7 == 0) goto L4b
                    r0.f97992s = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r7 = kotlin.Unit.f93236a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f97989b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f97989b.collect(new a(flowCollector), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // z.j
    public Object b(Continuation continuation) {
        return i.x(new b(this.f97987b), continuation);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        this.f97987b.setValue(Constraints.m3907boximpl(j10));
        Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
        return MeasureScope.CC.p(measureScope, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new a(placeableMo3011measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.layout.c.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
