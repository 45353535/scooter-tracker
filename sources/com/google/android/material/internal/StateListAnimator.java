package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StateListAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f26838a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Tuple f26839b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ValueAnimator f26840c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f26841d = new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.StateListAnimator.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f26840c == animator) {
                stateListAnimator.f26840c = null;
            }
        }
    };

    static class Tuple {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f26843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ValueAnimator f26844b;

        Tuple(int[] iArr, ValueAnimator valueAnimator) {
            this.f26843a = iArr;
            this.f26844b = valueAnimator;
        }
    }

    private void a() {
        ValueAnimator valueAnimator = this.f26840c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f26840c = null;
        }
    }

    private void b(Tuple tuple) {
        ValueAnimator valueAnimator = tuple.f26844b;
        this.f26840c = valueAnimator;
        valueAnimator.start();
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        Tuple tuple = new Tuple(iArr, valueAnimator);
        valueAnimator.addListener(this.f26841d);
        this.f26838a.add(tuple);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.f26840c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f26840c = null;
        }
    }

    public void setState(int[] iArr) {
        Tuple tuple;
        int size = this.f26838a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                tuple = null;
                break;
            }
            tuple = (Tuple) this.f26838a.get(i10);
            if (StateSet.stateSetMatches(tuple.f26843a, iArr)) {
                break;
            } else {
                i10++;
            }
        }
        Tuple tuple2 = this.f26839b;
        if (tuple == tuple2) {
            return;
        }
        if (tuple2 != null) {
            a();
        }
        this.f26839b = tuple;
        if (tuple != null) {
            b(tuple);
        }
    }
}
