package com.mobilefuse.sdk.state;

import java.lang.Enum;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001f\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000¢\u0006\u0002\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000@DX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/sdk/state/Stateful;", "T", "", "", "initialState", "(Ljava/lang/Enum;)V", "onStateChanged", "Lkotlin/Function0;", "", "getOnStateChanged", "()Lkotlin/jvm/functions/Function0;", "setOnStateChanged", "(Lkotlin/jvm/functions/Function0;)V", "value", "state", "getState", "()Ljava/lang/Enum;", "setState", "Ljava/lang/Enum;", "followState", "other", "stateIsNot", "", "validStates", "", "([Ljava/lang/Enum;)Z", "stateIsOneOf", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public abstract class Stateful<T extends Enum<T>> {

    @NotNull
    private Function0<Unit> onStateChanged;

    @NotNull
    private T state;

    public Stateful(@NotNull T initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.state = initialState;
        this.onStateChanged = new Function0<Unit>() { // from class: com.mobilefuse.sdk.state.Stateful$onStateChanged$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }
        };
    }

    public final void followState(@NotNull final Stateful<T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.onStateChanged = new Function0<Unit>() { // from class: com.mobilefuse.sdk.state.Stateful.followState.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Stateful.this.setState(other.getState());
            }
        };
    }

    @NotNull
    public final Function0<Unit> getOnStateChanged() {
        return this.onStateChanged;
    }

    @NotNull
    public final T getState() {
        return this.state;
    }

    public final void setOnStateChanged(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onStateChanged = function0;
    }

    protected final void setState(@NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.state, value)) {
            return;
        }
        this.state = value;
        this.onStateChanged.invoke();
    }

    public final boolean stateIsNot(@NotNull T... validStates) {
        Intrinsics.checkNotNullParameter(validStates, "validStates");
        for (T t10 : validStates) {
            if (Intrinsics.areEqual(this.state, t10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean stateIsOneOf(@NotNull T... validStates) {
        Intrinsics.checkNotNullParameter(validStates, "validStates");
        for (T t10 : validStates) {
            if (Intrinsics.areEqual(this.state, t10)) {
                return true;
            }
        }
        return false;
    }
}
