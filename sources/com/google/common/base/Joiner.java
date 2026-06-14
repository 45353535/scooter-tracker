package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class Joiner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28897a;

    public static final class MapJoiner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Joiner f28904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28905b;

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a10, Map<?, ?> map) throws IOException {
            return (A) appendTo(a10, map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.f28904a.useForNull(str), this.f28905b);
        }

        private MapJoiner(Joiner joiner, String str) {
            this.f28904a = joiner;
            this.f28905b = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Map<?, ?> map) {
            return appendTo(sb2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a10, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo(a10, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a10, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.checkNotNull(a10);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a10.append(this.f28904a.c(next.getKey()));
                a10.append(this.f28905b);
                a10.append(this.f28904a.c(next.getValue()));
                while (it.hasNext()) {
                    a10.append(this.f28904a.f28897a);
                    Map.Entry<?, ?> next2 = it.next();
                    a10.append(this.f28904a.c(next2.getKey()));
                    a10.append(this.f28905b);
                    a10.append(this.f28904a.c(next2.getValue()));
                }
            }
            return a10;
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb2, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo(sb2, it);
                return sb2;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    private static Iterable b(final Object obj, final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i10) {
                return i10 != 0 ? i10 != 1 ? objArr[i10 - 2] : obj2 : obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        };
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a10, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo(a10, iterable.iterator());
    }

    CharSequence c(Object obj) {
        j$.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a10, Iterator<? extends Object> it) throws IOException {
                Preconditions.checkNotNull(a10, "appendable");
                Preconditions.checkNotNull(it, "parts");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next != null) {
                        a10.append(Joiner.this.c(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a10.append(Joiner.this.f28897a);
                        a10.append(Joiner.this.c(next2));
                    }
                }
                return a10;
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this, this) { // from class: com.google.common.base.Joiner.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Joiner f28899c;

            {
                this.f28899c = this;
            }

            @Override // com.google.common.base.Joiner
            CharSequence c(Object obj) {
                return obj == null ? str : this.f28899c.c(obj);
            }

            @Override // com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(char c10) {
        return withKeyValueSeparator(String.valueOf(c10));
    }

    private Joiner(String str) {
        this.f28897a = (String) Preconditions.checkNotNull(str);
    }

    public static Joiner on(char c10) {
        return new Joiner(String.valueOf(c10));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a10, Iterator<? extends Object> it) throws IOException {
        Preconditions.checkNotNull(a10);
        if (it.hasNext()) {
            a10.append(c(it.next()));
            while (it.hasNext()) {
                a10.append(this.f28897a);
                a10.append(c(it.next()));
            }
        }
        return a10;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    private Joiner(Joiner joiner) {
        this.f28897a = joiner.f28897a;
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a10, Object[] objArr) throws IOException {
        return (A) appendTo(a10, Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a10, Object obj, Object obj2, Object... objArr) throws IOException {
        return (A) appendTo(a10, b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return appendTo(sb2, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            appendTo(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Object[] objArr) {
        return appendTo(sb2, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb2, b(obj, obj2, objArr));
    }
}
