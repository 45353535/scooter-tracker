package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements Function<A, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Converter f28856c;

    private static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Converter f28861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Converter f28862e;

        ConverterComposition(Converter converter, Converter converter2) {
            this.f28861d = converter;
            this.f28862e = converter2;
        }

        @Override // com.google.common.base.Converter
        Object a(Object obj) {
            return this.f28861d.a(this.f28862e.a(obj));
        }

        @Override // com.google.common.base.Converter
        Object b(Object obj) {
            return this.f28862e.b(this.f28861d.b(obj));
        }

        @Override // com.google.common.base.Converter
        protected Object d(Object obj) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ConverterComposition) {
                ConverterComposition converterComposition = (ConverterComposition) obj;
                if (this.f28861d.equals(converterComposition.f28861d) && this.f28862e.equals(converterComposition.f28862e)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Converter
        protected Object g(Object obj) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.f28861d.hashCode() * 31) + this.f28862e.hashCode();
        }

        public String toString() {
            return this.f28861d + ".andThen(" + this.f28862e + ")";
        }
    }

    private static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Function f28863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Function f28864e;

        @Override // com.google.common.base.Converter
        protected Object d(Object obj) {
            return this.f28864e.apply(obj);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
                if (this.f28863d.equals(functionBasedConverter.f28863d) && this.f28864e.equals(functionBasedConverter.f28864e)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Converter
        protected Object g(Object obj) {
            return this.f28863d.apply(obj);
        }

        public int hashCode() {
            return (this.f28863d.hashCode() * 31) + this.f28864e.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f28863d + ", " + this.f28864e + ")";
        }

        private FunctionBasedConverter(Function function, Function function2) {
            this.f28863d = (Function) Preconditions.checkNotNull(function);
            this.f28864e = (Function) Preconditions.checkNotNull(function2);
        }
    }

    private static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final Converter f28865d = new IdentityConverter();

        private IdentityConverter() {
        }

        private Object readResolve() {
            return f28865d;
        }

        @Override // com.google.common.base.Converter
        Converter c(Converter converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.google.common.base.Converter
        protected Object d(Object obj) {
            return obj;
        }

        @Override // com.google.common.base.Converter
        protected Object g(Object obj) {
            return obj;
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Converter f28866d;

        ReverseConverter(Converter converter) {
            this.f28866d = converter;
        }

        @Override // com.google.common.base.Converter
        Object a(Object obj) {
            return this.f28866d.b(obj);
        }

        @Override // com.google.common.base.Converter
        Object b(Object obj) {
            return this.f28866d.a(obj);
        }

        @Override // com.google.common.base.Converter
        protected Object d(Object obj) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.f28866d.equals(((ReverseConverter) obj).f28866d);
            }
            return false;
        }

        @Override // com.google.common.base.Converter
        protected Object g(Object obj) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.f28866d.hashCode();
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.f28866d;
        }

        public String toString() {
            return this.f28866d + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new FunctionBasedConverter(function, function2);
    }

    private Object h(Object obj) {
        return d(NullnessCasts.a(obj));
    }

    private Object i(Object obj) {
        return g(NullnessCasts.a(obj));
    }

    public static <T> Converter<T, T> identity() {
        return (IdentityConverter) IdentityConverter.f28865d;
    }

    Object a(Object obj) {
        if (!this.f28855b) {
            return h(obj);
        }
        if (obj == null) {
            return null;
        }
        return Preconditions.checkNotNull(d(obj));
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return c(converter);
    }

    @Override // com.google.common.base.Function
    @InlineMe(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a10) {
        return convert(a10);
    }

    Object b(Object obj) {
        if (!this.f28855b) {
            return i(obj);
        }
        if (obj == null) {
            return null;
        }
        return Preconditions.checkNotNull(g(obj));
    }

    Converter c(Converter converter) {
        return new ConverterComposition(this, (Converter) Preconditions.checkNotNull(converter));
    }

    public final B convert(A a10) {
        return (B) b(a10);
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>(this) { // from class: com.google.common.base.Converter.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Converter f28858c;

            {
                this.f28858c = this;
            }

            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.google.common.base.Converter.1.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final Iterator f28859b;

                    {
                        this.f28859b = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.f28859b.hasNext();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Iterator
                    public B next() {
                        return (B) AnonymousClass1.this.f28858c.convert(this.f28859b.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.f28859b.remove();
                    }
                };
            }
        };
    }

    protected abstract Object d(Object obj);

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    protected abstract Object g(Object obj);

    @CheckReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.f28856c;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.f28856c = reverseConverter;
        return reverseConverter;
    }

    Converter(boolean z10) {
        this.f28855b = z10;
    }
}
