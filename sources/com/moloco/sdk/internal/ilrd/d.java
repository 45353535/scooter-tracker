package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.IlrdRequest$MaxImpression;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public interface d {

    public interface a {

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.d$a$a, reason: collision with other inner class name */
        public static final class C0666a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IlrdRequest$MaxImpression f54385a;

            public C0666a(IlrdRequest$MaxImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                this.f54385a = impression;
            }

            public final IlrdRequest$MaxImpression a() {
                return this.f54385a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0666a) && Intrinsics.areEqual(this.f54385a, ((C0666a) obj).f54385a);
            }

            public int hashCode() {
                return this.f54385a.hashCode();
            }

            public String toString() {
                return "Max(impression=" + this.f54385a + ')';
            }
        }
    }

    com.moloco.sdk.internal.ilrd.model.a a();

    Object b();

    SharedFlow c();

    StateFlow getState();
}
