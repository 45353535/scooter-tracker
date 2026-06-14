package com.yandex.div.core.view2.logging.bind;

import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.animations.DivComparatorReporter;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.RebindTask;
import kotlin.Metadata;
import m7.a;
import org.jetbrains.annotations.NotNull;
import r7.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u0000 \t2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tJ\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter;", "Lcom/yandex/div/core/view2/animations/DivComparatorReporter;", "Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;", "Lcom/yandex/div/core/view2/logging/bind/SimpleRebindReporter;", "Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;", "", "onBindingFatalNoData", "()V", "onBindingFatalSameData", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BindingEventReporter extends DivComparatorReporter, ComplexRebindReporter, SimpleRebindReporter, ForceRebindReporter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter;", "getSTUB", "()Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final BindingEventReporter STUB = new BindingEventReporter() { // from class: com.yandex.div.core.view2.logging.bind.BindingEventReporter$Companion$STUB$1
            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onBindingFatalNoData() {
            }

            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onBindingFatalSameData() {
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentChildCount() {
                a.a(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentClasses() {
                a.b(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentCustomTypes() {
                a.c(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentIdsWithTransition() {
                a.d(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentOverlap() {
                a.e(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentWrap() {
                a.f(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonNoOldData() {
                a.g(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonNoState() {
                a.h(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonSuccess() {
                a.i(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindFatalNoState() {
                s7.a.a(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindNoDivInState() {
                s7.a.b(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindNoExistingParent() {
                s7.a.c(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindNothingToBind() {
                s7.a.d(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindSuccess() {
                s7.a.e(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindUnsupportedElementException(RebindTask.UnsupportedElementException unsupportedElementException) {
                s7.a.f(this, unsupportedElementException);
            }

            @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
            public /* synthetic */ void onFirstBindingCompleted() {
                r7.a.a(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
            public /* synthetic */ void onForceRebindFatalNoState() {
                r7.a.b(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
            public /* synthetic */ void onForceRebindSuccess() {
                r7.a.c(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindException(Exception exc) {
                b.a(this, exc);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindFatalNoState() {
                b.b(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindNoChild() {
                b.c(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindSuccess() {
                b.d(this);
            }
        };

        private Companion() {
        }

        @NotNull
        public final BindingEventReporter getSTUB() {
            return STUB;
        }
    }

    void onBindingFatalNoData();

    void onBindingFatalSameData();
}
