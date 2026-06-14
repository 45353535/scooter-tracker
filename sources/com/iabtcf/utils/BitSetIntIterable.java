package com.iabtcf.utils;

import j$.lang.Iterable$EL;
import j$.util.PrimitiveIterator;
import j$.util.function.Consumer$CC;
import java.util.BitSet;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes9.dex */
public class BitSetIntIterable extends IntIterable {
    public static final BitSetIntIterable EMPTY = new BitSetIntIterable(new BitSet());
    private final BitSet bs;

    public static class Builder {
        private final BitSet bs;

        public Builder add(int i10) {
            this.bs.set(i10);
            return this;
        }

        public BitSetIntIterable build() {
            return new BitSetIntIterable((BitSet) this.bs.clone());
        }

        public Builder clear() {
            this.bs.clear();
            return this;
        }

        public int max() {
            if (this.bs.isEmpty()) {
                return 0;
            }
            return this.bs.length() - 1;
        }

        public Builder add(BitSetIntIterable bitSetIntIterable) {
            this.bs.or(bitSetIntIterable.bs);
            return this;
        }

        private Builder() {
            this(new BitSet());
        }

        public Builder add(IntIterable intIterable) {
            IntIterator intIterator = intIterable.intIterator();
            while (intIterator.hasNext()) {
                this.bs.set(intIterator.nextInt());
            }
            return this;
        }

        private Builder(BitSet bitSet) {
            this.bs = bitSet;
        }

        public Builder add(Builder builder) {
            this.bs.or(builder.bs);
            return this;
        }

        private Builder(BitSetIntIterable bitSetIntIterable) {
            this(bitSetIntIterable.m4528clone().bs);
        }
    }

    public static BitSetIntIterable from(BitSet bitSet) {
        return new BitSetIntIterable((BitSet) bitSet.clone());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.iabtcf.utils.IntIterable
    public boolean contains(int i10) {
        if (i10 < 0) {
            return false;
        }
        return this.bs.get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BitSetIntIterable bitSetIntIterable = (BitSetIntIterable) obj;
        BitSet bitSet = this.bs;
        return bitSet == null ? bitSetIntIterable.bs == null : bitSet.equals(bitSetIntIterable.bs);
    }

    public int hashCode() {
        BitSet bitSet = this.bs;
        return 31 + (bitSet == null ? 0 : bitSet.hashCode());
    }

    @Override // com.iabtcf.utils.IntIterable
    public IntIterator intIterator() {
        return new IntIterator() { // from class: com.iabtcf.utils.BitSetIntIterable.1
            int currentIndex = start();

            @Override // j$.util.PrimitiveIterator
            public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
                forEachRemaining((IntConsumer) intConsumer);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex != -1;
            }

            @Override // j$.util.PrimitiveIterator.OfInt
            public int nextInt() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.currentIndex;
                this.currentIndex = BitSetIntIterable.this.bs.nextSetBit(this.currentIndex + 1);
                return i10;
            }

            public int start() {
                if (BitSetIntIterable.this.bs.isEmpty()) {
                    return -1;
                }
                return BitSetIntIterable.this.bs.nextSetBit(0);
            }

            @Override // java.util.Iterator, j$.util.PrimitiveIterator.OfInt
            public /* synthetic */ void forEachRemaining(Consumer<? super Integer> consumer) {
                PrimitiveIterator.OfInt.CC.$default$forEachRemaining((PrimitiveIterator.OfInt) this, (Consumer) consumer);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Integer next() {
                return Integer.valueOf(nextInt());
            }

            @Override // j$.util.PrimitiveIterator.OfInt
            /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
            public /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
                PrimitiveIterator.OfInt.CC.$default$forEachRemaining((PrimitiveIterator.OfInt) this, intConsumer);
            }
        };
    }

    public BitSet toBitSet() {
        return (BitSet) this.bs.clone();
    }

    public String toString() {
        return this.bs.toString();
    }

    private BitSetIntIterable(BitSet bitSet) {
        this.bs = bitSet;
    }

    public static BitSetIntIterable from(IntIterable intIterable) {
        if (intIterable instanceof BitSetIntIterable) {
            return ((BitSetIntIterable) intIterable).m4528clone();
        }
        BitSet bitSet = new BitSet();
        IntIterator intIterator = intIterable.intIterator();
        while (intIterator.hasNext()) {
            bitSet.set(intIterator.nextInt());
        }
        return new BitSetIntIterable(bitSet);
    }

    public static Builder newBuilder(BitSetIntIterable bitSetIntIterable) {
        return new Builder();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitSetIntIterable m4528clone() {
        return new BitSetIntIterable((BitSet) this.bs.clone());
    }

    public static Builder newBuilder(BitSet bitSet) {
        return new Builder();
    }

    public static Builder newBuilder(IntIterable intIterable) {
        return new Builder();
    }

    public static BitSetIntIterable from(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i10 : iArr) {
            bitSet.set(i10);
        }
        return new BitSetIntIterable(bitSet);
    }

    public static BitSetIntIterable from(Collection<Integer> collection) {
        final BitSet bitSet = new BitSet();
        Iterable$EL.forEach(collection, new Consumer() { // from class: com.iabtcf.utils.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bitSet.set(((Integer) obj).intValue());
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return new BitSetIntIterable(bitSet);
    }
}
