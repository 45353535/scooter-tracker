package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class LongAddables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Supplier f30776a;

    private static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        @Override // com.google.common.hash.LongAddable
        public void add(long j10) {
            getAndAdd(j10);
        }

        @Override // com.google.common.hash.LongAddable
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.LongAddable
        public long sum() {
            return get();
        }
    }

    static {
        Supplier<LongAddable> supplier;
        try {
            new LongAdder();
            supplier = new Supplier<LongAddable>() { // from class: com.google.common.hash.LongAddables.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.common.base.Supplier
                public LongAddable get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() { // from class: com.google.common.hash.LongAddables.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.common.base.Supplier
                public LongAddable get() {
                    return new PureJavaLongAddable();
                }
            };
        }
        f30776a = supplier;
    }

    public static LongAddable create() {
        return (LongAddable) f30776a.get();
    }
}
