package com.yandex.div.core.view2.logging.bind;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.logging.EventMessageBuilder;
import com.yandex.div.core.view2.reuse.RebindTask;
import k8.ea;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;
import m7.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0010J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0010J\u001b\u0010&\u001a\u00020\f2\n\u0010\u001b\u001a\u00060$j\u0002`%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010\u0010J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u0010J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.¨\u00060"}, d2 = {"Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterImpl;", "Lcom/yandex/div/core/view2/logging/EventMessageBuilder;", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter;", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lk8/ea;", "oldData", "newData", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Lk8/ea;Lk8/ea;)V", "", "result", "", "sendLog", "(Ljava/lang/String;)V", "onComparisonNoOldData", "()V", "onComparisonNoState", "onComparisonDifferentClasses", "onComparisonDifferentIdsWithTransition", "onComparisonDifferentCustomTypes", "onComparisonDifferentOverlap", "onComparisonDifferentWrap", "onComparisonDifferentChildCount", "onComplexRebindSuccess", "onComplexRebindNothingToBind", "Lcom/yandex/div/core/view2/reuse/RebindTask$UnsupportedElementException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "onComplexRebindUnsupportedElementException", "(Lcom/yandex/div/core/view2/reuse/RebindTask$UnsupportedElementException;)V", "onComplexRebindFatalNoState", "onComplexRebindNoDivInState", "onComplexRebindNoExistingParent", "onSimpleRebindSuccess", "onSimpleRebindNoChild", "onSimpleRebindFatalNoState", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSimpleRebindException", "(Ljava/lang/Exception;)V", "onForceRebindSuccess", "onForceRebindFatalNoState", "onFirstBindingCompleted", "onBindingFatalNoData", "onBindingFatalSameData", "Lcom/yandex/div/core/view2/Div2View;", "Lk8/ea;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BindingEventReporterImpl extends EventMessageBuilder implements BindingEventReporter {

    @NotNull
    private final Div2View div2View;

    @Nullable
    private final ea newData;

    @Nullable
    private final ea oldData;

    public BindingEventReporterImpl(@NotNull Div2View div2View, @Nullable ea eaVar, @Nullable ea eaVar2) {
        this.div2View = div2View;
        this.oldData = eaVar;
        this.newData = eaVar2;
    }

    private final void sendLog(String result) {
        this.div2View.getDiv2Component().getDiv2Logger().logBindingResult(this.div2View, this.oldData, this.newData, result, buildEventsLogMessage());
    }

    @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
    public void onBindingFatalNoData() {
        sendLog("Binding failed. New DivData not provided");
    }

    @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
    public void onBindingFatalSameData() {
        sendLog("No actions performed. Old and new DivData are the same");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentChildCount() {
        appendEventMessage("Div comparison failed", "Some element changed its child count");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentClasses() {
        appendEventMessage("Div comparison failed", "For some element its old and new java classes are not equal");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentCustomTypes() {
        appendEventMessage("Div comparison failed", "Some `DivCustom` element has different `customType`");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentIdsWithTransition() {
        appendEventMessage("Div comparison failed", "Some element has changed its `id` while has transitions");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentOverlap() {
        appendEventMessage("Div comparison failed", "Some element has changed its `orientation` from/to 'overlap'");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonDifferentWrap() {
        appendEventMessage("Div comparison failed", "Some element has changed its `layoutMode` from/to 'wrap'");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonNoOldData() {
        appendEventMessage("Div comparison failed", "No old `DivData` to compare with");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public void onComparisonNoState() {
        appendEventMessage("Div comparison failed", "Cannot find required state of `DivData`");
    }

    @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
    public /* synthetic */ void onComparisonSuccess() {
        a.i(this);
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindFatalNoState() {
        sendLog("Div has no state to bind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindNoDivInState() {
        appendEventMessage("Complex rebind failed", "Cannot find div inside state to bind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindNoExistingParent() {
        appendEventMessage("Complex rebind failed", "Cannot find any existing view to start binding");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindNothingToBind() {
        appendEventMessage("Complex rebind failed", "Cannot find any difference to bind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindSuccess() {
        sendLog("Performed complex rebind");
    }

    @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
    public void onComplexRebindUnsupportedElementException(@NotNull RebindTask.UnsupportedElementException e10) {
        appendEventMessage("Complex rebind failed with exception", v0.b(e10.getClass()) + " (" + e10.getMessage() + ')');
    }

    @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
    public void onFirstBindingCompleted() {
        sendLog("DivData bound for the first time");
    }

    @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
    public void onForceRebindFatalNoState() {
        sendLog("Div has no state to bind");
    }

    @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
    public void onForceRebindSuccess() {
        sendLog("Performed unoptimized rebind. Old data was cleaned up");
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindException(@NotNull Exception e10) {
        appendEventMessage("Simple rebind failed with exception", v0.b(e10.getClass()) + " (" + e10.getMessage() + ')');
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindFatalNoState() {
        sendLog("Div has no state to bind");
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindNoChild() {
        appendEventMessage("Simple rebind failed", "Div2View has no child to rebind");
    }

    @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
    public void onSimpleRebindSuccess() {
        sendLog("Performed simple rebind");
    }
}
