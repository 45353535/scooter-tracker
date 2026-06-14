package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class FinalizableWeakReference<T> extends WeakReference<T> implements FinalizableReference {
}
