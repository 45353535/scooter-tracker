package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5264m5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f77736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77737b;

    public C5264m5(@NotNull IExecutionPolicy... iExecutionPolicyArr) {
        this.f77736a = iExecutionPolicyArr;
        this.f77737b = "Composite of {" + ArraysKt.joinToString$default(iExecutionPolicyArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C5239l5.f77643a, 30, (Object) null) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f77736a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i10];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i10++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f77737b;
    }
}
