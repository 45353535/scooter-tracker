package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.MultimapBuilder;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
final class CollectCollectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collector f29331a = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.i
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.l
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.Builder) obj).add(obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.n
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableList.Builder) obj).e((ImmutableList.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.o
        @Override // java.util.function.Function
        /* JADX INFO: renamed from: andThen */
        public /* synthetic */ Function mo7820andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.Builder) obj).build();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Collector f29332b = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.p
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.q
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.Builder) obj).add(obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.r
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.Builder) obj).e((ImmutableSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.s
        @Override // java.util.function.Function
        /* JADX INFO: renamed from: andThen */
        public /* synthetic */ Function mo7820andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.Builder) obj).build();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collector f29333c = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.t
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableRangeSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.u
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableRangeSet.Builder) obj).add((Range) obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.j
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableRangeSet.Builder) obj).a((ImmutableRangeSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.k
        @Override // java.util.function.Function
        /* JADX INFO: renamed from: andThen */
        public /* synthetic */ Function mo7820andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableRangeSet.Builder) obj).build();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: Access modifiers changed from: private */
    @IgnoreJRERequirement
    static class EnumMapAccumulator<K extends Enum<K>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BinaryOperator f29334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EnumMap f29335b = null;

        EnumMapAccumulator(BinaryOperator binaryOperator) {
            this.f29334a = binaryOperator;
        }

        EnumMapAccumulator a(EnumMapAccumulator enumMapAccumulator) {
            if (this.f29335b == null) {
                return enumMapAccumulator;
            }
            EnumMap enumMap = enumMapAccumulator.f29335b;
            if (enumMap == null) {
                return this;
            }
            Map.EL.forEach(enumMap, new BiConsumer() { // from class: com.google.common.collect.y1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f30485a.b((Enum) obj, obj2);
                }

                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(Enum r32, Object obj) {
            EnumMap enumMap = this.f29335b;
            if (enumMap == null) {
                this.f29335b = new EnumMap(Collections.singletonMap(r32, obj));
            } else {
                Map.EL.merge(enumMap, r32, obj, this.f29334a);
            }
        }

        ImmutableMap c() {
            EnumMap enumMap = this.f29335b;
            return enumMap == null ? ImmutableMap.of() : ImmutableEnumMap.n(enumMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @IgnoreJRERequirement
    static final class EnumSetAccumulator<E extends Enum<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Collector f29336b = CollectCollectors.K();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private EnumSet f29337a;

        private EnumSetAccumulator() {
        }

        void a(Enum r22) {
            EnumSet enumSet = this.f29337a;
            if (enumSet == null) {
                this.f29337a = EnumSet.of(r22);
            } else {
                enumSet.add(r22);
            }
        }

        EnumSetAccumulator b(EnumSetAccumulator enumSetAccumulator) {
            EnumSet enumSet = this.f29337a;
            if (enumSet == null) {
                return enumSetAccumulator;
            }
            EnumSet enumSet2 = enumSetAccumulator.f29337a;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        ImmutableSet c() {
            EnumSet enumSet = this.f29337a;
            if (enumSet == null) {
                return ImmutableSet.of();
            }
            ImmutableSet immutableSetS = ImmutableEnumSet.s(enumSet);
            this.f29337a = null;
            return immutableSetS;
        }
    }

    public static /* synthetic */ EnumMapAccumulator A(BinaryOperator binaryOperator) {
        return new EnumMapAccumulator(binaryOperator);
    }

    public static /* synthetic */ Multimap B(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    static Collector D(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.y
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Preconditions.checkNotNull(function.apply(obj));
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.z
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new t1());
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        };
        final MultimapBuilder.ListMultimapBuilder<Object, Object> listMultimapBuilderArrayListValues = MultimapBuilder.linkedHashKeys().arrayListValues();
        Objects.requireNonNull(listMultimapBuilderArrayListValues);
        return Collectors.collectingAndThen(F(function3, function4, new Supplier() { // from class: com.google.common.collect.a0
            @Override // java.util.function.Supplier
            public final Object get() {
                return listMultimapBuilderArrayListValues.build();
            }
        }), new Function() { // from class: com.google.common.collect.b0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((Multimap) obj);
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        });
    }

    static Collector E(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.g0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Preconditions.checkNotNull(function.apply(obj));
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.h0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new t1());
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        };
        final MultimapBuilder.SetMultimapBuilder<Object, Object> setMultimapBuilderLinkedHashSetValues = MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        Objects.requireNonNull(setMultimapBuilderLinkedHashSetValues);
        return Collectors.collectingAndThen(F(function3, function4, new Supplier() { // from class: com.google.common.collect.j0
            @Override // java.util.function.Supplier
            public final Object get() {
                return setMultimapBuilderLinkedHashSetValues.build();
            }
        }), new Function() { // from class: com.google.common.collect.k0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((Multimap) obj);
            }

            public /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        });
    }

    static Collector F(final Function function, final Function function2, Supplier supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.v
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.t(function, function2, (Multimap) obj, obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.w
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.B((Multimap) obj, (Multimap) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector G(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.w1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableBiMap.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.x1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableBiMap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.c
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableBiMap.Builder) obj).b((ImmutableBiMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.d
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableBiMap.Builder) obj).buildOrThrow();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector H(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.n0
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.d();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.o0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((CollectCollectors.EnumMapAccumulator) obj).b((Enum) Preconditions.checkNotNull((Enum) function.apply(obj2), "Null key for input %s", obj2), Preconditions.checkNotNull(function2.apply(obj2), "Null value for input %s", obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new p0(), new q0(), Collector.Characteristics.UNORDERED);
    }

    static Collector I(final Function function, final Function function2, final BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.n1
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.A(binaryOperator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.o1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((CollectCollectors.EnumMapAccumulator) obj).b((Enum) Preconditions.checkNotNull((Enum) function.apply(obj2), "Null key for input %s", obj2), Preconditions.checkNotNull(function2.apply(obj2), "Null value for input %s", obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new p0(), new q0(), new Collector.Characteristics[0]);
    }

    static Collector J() {
        return EnumSetAccumulator.f29336b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collector K() {
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.e
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.q();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((CollectCollectors.EnumSetAccumulator) obj).a((Enum) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.g
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((CollectCollectors.EnumSetAccumulator) obj).b((CollectCollectors.EnumSetAccumulator) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.h
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CollectCollectors.EnumSetAccumulator) obj).c();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Collector.Characteristics.UNORDERED);
    }

    static Collector L() {
        return f29331a;
    }

    static Collector M(final Function function, final Function function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.a1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.b1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableListMultimap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.c1
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableListMultimap.Builder) obj).e((ImmutableListMultimap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.d1
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector N(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.r0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.s0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableMap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.u0
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.Builder) obj).b((ImmutableMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.v0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.Builder) obj).buildOrThrow();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector O(Function function, Function function2, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.j1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: com.google.common.collect.k1
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((java.util.Map) obj);
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }

    static Collector P(final Function function, final ToIntFunction toIntFunction) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.c0
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.d0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multiset) obj).add(Preconditions.checkNotNull(function.apply(obj2)), toIntFunction.applyAsInt(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.e0
            public /* synthetic */ BiFunction andThen(Function function2) {
                return BiFunction$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.m((Multiset) obj, (Multiset) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.f0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.m(((Multiset) obj).entrySet());
            }

            public /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector Q(final Function function, final Function function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.b
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableRangeMap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.m
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableRangeMap.Builder) obj).put((Range) function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.x
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableRangeMap.Builder) obj).a((ImmutableRangeMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.i0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableRangeMap.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector R() {
        return f29333c;
    }

    static Collector S() {
        return f29332b;
    }

    static Collector T(final Function function, final Function function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.f1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.g1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSetMultimap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.h1
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSetMultimap.Builder) obj).e((ImmutableSetMultimap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.i1
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector U(final Comparator comparator, final Function function, final Function function2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.t0
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.b(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.e1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedMap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.p1
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.Builder) obj).f((ImmutableSortedMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.v1
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.Builder) obj).buildOrThrow();
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, Collector.Characteristics.UNORDERED);
    }

    static Collector V(final Comparator comparator, Function function, Function function2, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.l0
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.p(comparator);
            }
        }), new Function() { // from class: com.google.common.collect.m0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }

            public /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }

    static Collector W(final Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.w0
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.g(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.x0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.Builder) obj).add(obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.y0
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.Builder) obj).e((ImmutableSortedSet.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.z0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector X(final Function function, final Function function2, Supplier supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.q1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multimap) obj).put(function.apply(obj2), function2.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.r1
            public /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.h((Multimap) obj, (Multimap) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector Y(final Function function, final ToIntFunction toIntFunction, Supplier supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        Preconditions.checkNotNull(supplier);
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.l1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multiset) obj).add(function.apply(obj2), toIntFunction.applyAsInt(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.m1
            public /* synthetic */ BiFunction andThen(Function function2) {
                return BiFunction$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.o((Multiset) obj, (Multiset) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ ImmutableSortedMap.Builder b(Comparator comparator) {
        return new ImmutableSortedMap.Builder(comparator);
    }

    public static /* synthetic */ EnumMapAccumulator d() {
        return new EnumMapAccumulator(new BinaryOperator() { // from class: com.google.common.collect.s1
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.y(obj, obj2);
            }
        });
    }

    public static /* synthetic */ ImmutableSortedSet.Builder g(Comparator comparator) {
        return new ImmutableSortedSet.Builder(comparator);
    }

    public static /* synthetic */ Multimap h(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    public static /* synthetic */ Multiset m(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    public static /* synthetic */ Multiset o(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    public static /* synthetic */ TreeMap p(Comparator comparator) {
        return new TreeMap(comparator);
    }

    public static /* synthetic */ EnumSetAccumulator q() {
        return new EnumSetAccumulator();
    }

    public static /* synthetic */ void t(Function function, Function function2, Multimap multimap, Object obj) {
        final Collection collection = multimap.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collection);
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.u1
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj2) {
                collection.add(obj2);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public static /* synthetic */ Object y(Object obj, Object obj2) {
        throw new IllegalArgumentException("Multiple values for key: " + obj + ", " + obj2);
    }
}
